package testngpkg;
 
 import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaymousehover {
	ChromeDriver driver;
	String url= "https://www.ebay.com/"; 
			@BeforeTest
			public void urlfetch()
			{
		driver=new ChromeDriver();
				driver.get(url);
				 
	}
			@Test
			public void test() 
			{
			      
              //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		//implicit wait	use one wait only impplicit or explicit	
				Actions act=new Actions(driver);
				 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30)); //start of explicit 
				WebElement Electronics=driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
				act.moveToElement(Electronics).perform();
                WebElement SmartphonesandAccessories=driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
                 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));  
                wait.until(ExpectedConditions.visibilityOf(SmartphonesandAccessories));   //use one of this or above line...if want to use reference use this or just give xpath in visibility ofelement locatwed  
                SmartphonesandAccessories.click();
			}
			/**/@AfterTest
			public void browserclose()
			{
				driver.quit();
			} 
}
