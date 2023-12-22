package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadWithEditField {

	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/form/div[2]/div[1]/div/div/input")).sendKeys("C:\\Intel\\Logs\\IntelGFX.txt");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/center/span/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/div[1]/button")).click();
     }
}
