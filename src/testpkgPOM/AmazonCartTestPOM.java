package testpkgPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkgPOM.AmazonCartPOM;

public class AmazonCartTestPOM {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.Amazon.in");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		AmazonCartPOM ob=new AmazonCartPOM(driver);
		ob.setvalues("mobile phones");
		ob.searchclick();
		ob.imageclick();
		 
		 ob.scrolldown();
		// ob.waits();
		 Thread.sleep(5000);
         ob.cartclick();
         Thread.sleep(5000); 
         //ob.waits();
		 
		ob.cart();
	}
	
}
