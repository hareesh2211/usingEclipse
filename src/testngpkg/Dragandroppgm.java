package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragandroppgm {
	ChromeDriver driver;
	String url= "https://demo.guru99.com/test/drag_drop.html"; 
			@BeforeTest
			public void urlfetch()
			{
		driver=new ChromeDriver();
				driver.get(url);
	}
			@Test
			public void test()
			{
				Actions act=new Actions(driver);
			 
				WebElement value1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a")); 
				WebElement value2=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a")); 
				WebElement Amount1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
			WebElement Amount2=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/ol/li"));
            WebElement Bank=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
            WebElement Sales=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[6]/a"));
            WebElement DebitAccnt=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li"));
            WebElement CreditAccnt=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/ol/li"));
act.dragAndDrop(value1, Amount1).perform();
act.dragAndDrop(value2, Amount2).perform();
act.dragAndDrop(Bank, DebitAccnt).perform();
act.dragAndDrop(Sales, CreditAccnt).perform();
 boolean perfect=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[5]/a")).isDisplayed();
if(perfect==true)
{
	System.out.println("Perfect shown");
}
else
{
	System.out.println("Perfect not shown");
}
	
 }
}
