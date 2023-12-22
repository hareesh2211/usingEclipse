package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestlogoRediff {
	ChromeDriver driver;
	@BeforeTest
	public void newdriver()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlfetch()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test 
	public void test()
	{
		boolean display=driver.findElement(By.xpath("/html/body/center/form/div/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(display==true)
		{
			System.out.println("Logo present");
		}
		else
		{
		System.out.println("Logo not present");	
		}
	}
     @AfterMethod
     public void browserclose()
     {
    	 driver.quit();
     }
}
