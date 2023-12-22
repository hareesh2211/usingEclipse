package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Amazon {

	ChromeDriver driver;
	String baseurl="https://www.amazon.in";
	
	@Before
	public void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		Thread.sleep(10000);
	}
    
	@Test
	public void amazontest() 
	{
	 	
    }
    
	@After
	public void browserclose()
	{
		driver.close();
	} 
}
