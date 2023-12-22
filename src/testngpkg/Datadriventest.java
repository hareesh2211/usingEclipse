package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver(); 
		
	}
 
    @Test
    public void test() throws Exception
    {
    	FileInputStream f=new FileInputStream("E:\\Luminar\\DataDrivenTest.xlsx");
    	XSSFWorkbook wb=new XSSFWorkbook(f);
    	XSSFSheet sh=wb.getSheet("sheet1");
    	int count=sh.getLastRowNum();
    	for(int i=1;i<=count;i++)
    	{
    		String username=sh.getRow(i).getCell(0).getStringCellValue();
    		String password=sh.getRow(i).getCell(1).getStringCellValue();
    		driver.get("https://www.facebook.com/");
    		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys(username);
    		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys(password);
    		driver.findElement(By.name("login")).click();
    		Alert a=driver.switchTo().alert();
			a.dismiss();
    		boolean profilepicpresent=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[1]/span/div/div[1]/div/svg/g/image")).isEnabled();
    		WebElement profilepic=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[1]/span/div/div[1]/div/svg/g/image"));		
  		
    		if(profilepicpresent)
    		{
    			profilepic.click();
    			
    			//logout button click 
    			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click();
    		}
    	 
    	}
    }
 
}