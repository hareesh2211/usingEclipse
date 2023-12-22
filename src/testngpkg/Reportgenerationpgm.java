package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

 

public class Reportgenerationpgm {
	ChromeDriver driver;
	String Baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void setup()
	{
		reporter=new ExtentHtmlReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("FBAutomationreport");
		reporter.config().setReportName("Functionality Test");
		reporter.config().setTheme(Theme.STANDARD);
		extent=new ExtentReports();
		extent.attachReporter(reporter); //attaching generated report file to extent
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "Windows 10");
		extent.setSystemInfo("testername", "HAreesh");
		extent.setSystemInfo("Browser", "Chrome");
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void Stepsbfore()
    {
    	driver.get(Baseurl);
    }
    @Test
    public void test()
    {
    	test=extent.createTest("FBtitleverification");
    	String Exp="facebook";
    	String Actual=driver.getTitle();
        Assert.assertEquals(Exp, Actual);
    }
    @AfterMethod
    public void browserclose(ITestResult result)  
    {
    	if(result.getStatus()==ITestResult.FAILURE)
    	{
    		test.log(Status.FAIL, "test case failed is="+result.getName());
    		test.log(Status.FAIL, "test case failed is="+result.getThrowable());
          }
    	else if(result.getStatus()==ITestResult.SKIP)
    	{
    		test.log(Status.SKIP, "test case skipped is="+result.getName());
    	}
    	else if(result.getStatus()==ITestResult.SUCCESS)
    	{
    		test.log(Status.PASS, "test case Passed is="+result.getName());
    	}
    }
    @AfterTest
    public void atEndTest()
    {
    	extent.flush();
    }
    
    
}

