package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookloginusingXML {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void newdriver()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlfetch()
	{
		driver.get("http://www.facebook.com");
	}
	
	@Parameters({"username","password"})
	@Test
	public void login(String x,String y)
	{
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys(x);
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys(y);
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	}
	

}
