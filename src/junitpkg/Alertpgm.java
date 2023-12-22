package junitpkg;
//import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Keys;
 

public class Alertpgm {
	ChromeDriver driver;
	String baseurl="file:///E:/Luminar/alert_example.html";
	
	@Before
	public  void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void  Alerttest()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alertText=a.getText();
		if (alertText.equals("Hello! i am an alert box")) 
				{
			System.out.println("pass"); 
				}
		else {
			System.out.println("fail");
		}
		
		a.accept();
		//a.dismiss(); this can be used if alet have no option and we need No or to cancel
        driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("cde");
}
}
