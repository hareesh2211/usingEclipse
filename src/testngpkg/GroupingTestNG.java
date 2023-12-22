package testngpkg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupingTestNG {
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
    @Test(groups={"smoke","sanity"})
    public void test1()
    {
    	System.out.println("test1");
    }
    @Test(groups="sanity")
    public void test2()
    {
    	System.out.println("test2");
    }
    @Test(groups={"sanity","regression"})
    public void test3()
    {
    	System.out.println("test3");
    }
    @Test(groups= "smoke")
    public void test4()
    {
    	System.out.println("test4");
    }
    @Test(groups= "regression")
    public void test5()
    {
    	System.out.println("test5");
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
