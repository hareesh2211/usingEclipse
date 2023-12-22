package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertpgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://google.com");
	}
 
    @Test
    public void test()
    {
    	
    	String Expectedtitle="googl";
    	String Actualtitle=driver.getTitle();
    	System.out.println("title="+Actualtitle);
    	Assert.assertEquals(Actualtitle, Expectedtitle);
    	System.out.println("title");
    }
    
    //soft assert method
    @Test
    public void test2()
    {
    	String Expectedtitle="googl";
    	String Actualtitle=driver.getTitle();
    	System.out.println("title="+Actualtitle);
    	if(Expectedtitle.equalsIgnoreCase(Actualtitle))
    	{
    		System.out.println("title ok");
    	}
    	else
    	{
    		System.out.println("wrong title");
    	}
    	System.out.println("title verified");
    }
}
