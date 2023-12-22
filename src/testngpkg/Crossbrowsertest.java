package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;import org.testng.xml.LaunchSuite;

public class Crossbrowsertest {
         WebDriver  driver;
         @Parameters("browser")
         @BeforeTest
         public void browsersetup(String brows)
         {
        	 if(brows.equalsIgnoreCase("Chrome") )
        	 {
        		 driver=new ChromeDriver();
        	 }
        	 else if(brows.equalsIgnoreCase("Firefox"))
        	 {
        		 driver=new FirefoxDriver();
        		 
        		 }
        	 else
        	 {
        		 
        		 driver=new EdgeDriver(); 
        	 }
          }
         @Test
         public void test()
         {
        	 driver.get("http://www.google.com");
         }
}
