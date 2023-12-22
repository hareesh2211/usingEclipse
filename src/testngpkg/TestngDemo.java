package testngpkg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestngDemo {
	ChromeDriver driver;
    @BeforeTest
	public void urlload()
	{
    	System.out.println("Test starting");	
	}
	@BeforeMethod 
	public void urlloadng()
	{
		System.out.println("");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");  
	}
    @Test(priority =2,dependsOnMethods = {"test2"})
    public void test1()
    {
    	System.out.println("i will be executed first");
    }
    @Test(priority=1,invocationCount = 2)
    public void test2()
    {
    	System.out.println("haha we will see");
    }
    @Test(priority=1,invocationCount = 2,enabled = false)
    public void test3()
    {
    	System.out.println("haha we will see");
    }
    @AfterMethod
    public void testresult()
    {
    	System.out.println("one test done");
    	driver.quit();
    	
    }
    @AfterTest
    public void browserclose()
    {
    	System.out.println("Testing completed");	
    }
}
