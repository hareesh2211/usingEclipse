package pagepkgPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	 
	@FindBy(id="email")
	WebElement fbusername;
	
	@FindBy(id="pass")
	WebElement fbpassword;
	
	@FindBy(name="login")
	WebElement loginbutton;
	
	
	 /*
	By fbusername=By.id("email");
	By fbpassword=By.id("pass");
	By loginbutton=By.name("login");
	*/
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void setvalues (String email, String password)

	{
     fbusername.sendKeys(email);
     fbpassword.sendKeys(password);
	//driver.findElement (fbusername).sendKeys(email); 
	//driver.findElement(fbpassword).sendKeys (password);
	}
	public void login()

	{
      loginbutton.click();
	//driver.findElement(loginbutton).click();

	}
}
  
