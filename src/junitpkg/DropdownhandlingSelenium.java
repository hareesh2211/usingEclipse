package junitpkg;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class DropdownhandlingSelenium {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public  void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void  Alerttest()
	{
		Select monthdrp=new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]")));
        monthdrp.selectByValue("03");
        List<WebElement> monthdrpall=driver.findElements(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]/option"));
        System.out.println("count of Month dropdown options="+monthdrpall.size());
        
        Select daydrp=new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]")));
        daydrp.selectByValue("02");
        List<WebElement> dayall=driver.findElements(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]/option"));
        System.out.println("count of Day dropdown options="+dayall.size());		
        
        //WebElement yearelement=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]"));
        Select yeardrp=new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]")));
        yeardrp.selectByValue("2014");
        List<WebElement> yeardetails=driver.findElements(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]/option"));
        System.out.println("count of year dropdown options="+yeardetails.size());
     }
	@After
	public void browserClose()
	{
		driver.quit();
	}
}