package pagepkgPOM;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonCartPOM {
	
	WebDriver driver;
	By searchbox=By.id("twotabsearchtextbox");
	By searchicon=By.id("nav-search-submit-button");
	By mobileimage=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img");
	By addtocart=By.xpath("//*[@id=\"add-to-cart-button\"]");
	By cart=By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input");
	
	
	public AmazonCartPOM(WebDriver driver)
	{
		this.driver=driver;
	}

	public void setvalues (String search)
    {
		driver.findElement(searchbox).sendKeys(search); 
	//driver.findElement(fbpassword).sendKeys (password);
	}
	
	public void searchclick()
      {
      driver.findElement(searchicon).click();
     }
	
	public void imageclick()
	{
		 
		String AmazonmobileTitle=driver.getTitle();
		System.out.println("Current title="+AmazonmobileTitle);
		String Mobilesearch=driver.getWindowHandle();
		driver.findElement(mobileimage).click();
		Set<String> allWindowHandles=driver.getWindowHandles();
		for(String handle : allWindowHandles)
    	{
    		if(!handle.equalsIgnoreCase(Mobilesearch))
    		{
    			//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    			driver.switchTo().window(handle);
    			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[35]/div[1]/span/span/span/input")));
    			//JavascriptExecutor jse = (JavascriptExecutor)driver;
    			//jse.executeScript("scroll(0, 350);");
    		}
    		}
	}
	  
	public void waits()
	{
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	 
	public void scrolldown()
	{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
    			jse.executeScript("scroll(0, 350);");	
	}
	 
	public void cartclick()
	{
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(addtocart));
		driver.findElement(addtocart).click();
	}
	public void cart()
	{
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(cart));
		driver.findElement(cart).click();
	}

}
