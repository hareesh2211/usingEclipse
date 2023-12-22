package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonWindowHandle  {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
 
    @Test
    public void test() throws InterruptedException
    {
    driver.get("https://www.amazon.in/");	
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones");
    driver.findElement(By.id("nav-search-submit-button")).click();
    String AmazonmobileTitle=driver.getTitle();
    String Mobilesearch=driver.getWindowHandle();
    System.out.println("Current title="+AmazonmobileTitle);
    	 
    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
    	
    	Set<String> allWindowHandles=driver.getWindowHandles();
    	
    	for(String handle : allWindowHandles)
    	{
    		if(!handle.equalsIgnoreCase(Mobilesearch))
    		{
    			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    			driver.switchTo().window(handle);
    			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[35]/div[1]/span/span/span/input")));
    			JavascriptExecutor jse = (JavascriptExecutor)driver;
    			jse.executeScript("scroll(0, 350);");
    			//WebElement addtocart=driver.findElement(By.xpath(""))
    		    
    		    		
    			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
    			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]")));
    			driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
    		}
    	}
     
 }
  
}
