package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerpgm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.com/");
	}
	@Test
	public void datepickertest()
	{
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/section/div[2]/div[4]/div/div[1]/fieldset/button[1]/span/span[2]/span[2]")).click();	
	datepickermethod("March 2024","30");
	}
	public void datepickermethod(String Expmonth,String Expdate)
	{
		
		  while(true)
		  {
			 WebElement  month=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
				String monthtext=month.getText();
				if(monthtext.equals(Expmonth))
				{
					  break;
				}
				else 
				{
					driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
                }
		  }
		List<WebElement> alldate=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
	for(WebElement datelement:alldate)
	{
		String currentdate=datelement.getText();
		if(currentdate.equals(Expdate))
		{
		datelement.click();
		break;
		}
     }
	}
}