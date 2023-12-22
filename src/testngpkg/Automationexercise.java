package testngpkg;

 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexercise {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
				
	}
	@BeforeMethod
	public void testready()
	{
		driver.get("http://www.automationexercise.com/login");
	}
	 @Test(enabled = false)
	public void test()
	{
		//signup
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]")).sendKeys("hareesh");
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("hpdhareesh@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
		
		//
		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[1]/div[1]/label/div/span/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[4]/input")).sendKeys("Haiyo123#");
		Select day =new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select")));
		day.selectByValue("20");
		Select month=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select")));
		month.selectByValue("12");
		Select year=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select")));
		year.selectByValue("1988");
		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[6]/div/span/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[7]/div/span/input")).click();
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[1]/input")).sendKeys("hareesh");
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[2]/input")).sendKeys("pd");
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[3]/input")).sendKeys("ingen");
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[4]/input")).sendKeys("pulikkal ho");
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[5]/input")).sendKeys("koonammoochi po");
	Select country=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[6]/select")));
	country.selectByValue("India");
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[7]/input")).sendKeys("Kerala");
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[8]/input")).sendKeys("Thrissur");
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[9]/input")).sendKeys("680504");
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[10]/input")).sendKeys("9746976428");
	 
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[10]/input"));
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[10]/input"));
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[10]/input"));
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[10]/input"));
	}
	 
	@Test
	public void test2()
	{
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys("hpdhareesh@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys("Haiyo123#");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
         
		 
    /*if(driver.getCurrentUrl().equalsIgnoreCase( "https://www.automationexercise.com/"))
    {
    	System.out.println("login successfull");
    }
    else
    {
    	System.out.println("login unsuccessfull");
    }*/ 
		String url=driver.getCurrentUrl();
     String result=(url.equalsIgnoreCase( "https://www.automationexercise.com/")) ? "login Successfull" : "Login unsuccessfull"; 
	  System.out.println(result);
   /* 
      boolean Logout=driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).isEnabled();
	 
     if(Logout)
	 {
		 System.out.println("Login successfull");
	 }
	 else
	 {
		 System.out.println("Login unsuccessfull");
	 }
	 */
	
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
