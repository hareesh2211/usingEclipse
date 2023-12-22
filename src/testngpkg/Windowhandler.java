package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
 
    @Test
    public void test()
    {
    driver.get("http://demo.guru99.com/popup.php");	
    String parentwindow=driver.getWindowHandle(); //currentwindow detail
    System.out.println("parent window title="+driver.getTitle());
    driver.findElement(By.xpath("/html/body/p/a")).click();
    
    Set<String> allWindowHandles=driver.getWindowHandles();
    
    for(String handle : allWindowHandles)
    {
    	if(!handle.equalsIgnoreCase(parentwindow))
    	{
    		driver.switchTo().window(handle); 
    	driver.findElement(By.name("emailid")).sendKeys("hareeshpd@gmail.com");
    	driver.close();
    	}
    driver.switchTo().window(parentwindow);
    }
 }
 
}

