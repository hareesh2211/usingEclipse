package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadWithRobotclass {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
 
    @Test
    public void fileuploadpgm() throws Exception
    {
    	driver.get("https://www.ilovepdf.com/word_to_pdf");
    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/a/span")).click();
    	fileUpload("E:\\NM.docx");
    }
    
    public void fileUpload(String p) throws AWTException
    {
    	StringSelection strselection=new StringSelection(p);
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
    	
    	Robot robot=new Robot();
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	
    	robot.keyPress(KeyEvent.VK_ENTER);
    	
    	robot.keyRelease(KeyEvent.VK_ENTER);
    }
 }