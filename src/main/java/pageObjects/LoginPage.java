package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

	public WebDriver driver;
	
	 //By fname = By.name("firstname");
	 By pass =By.name("pass");
	 By email = By.name("email");
	 By sub=By.name("login");
	 By title = By.className("_8eso");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getpass()
	{
		return driver.findElement(pass);
	}
	
	public WebElement getemail()
	
	{
		return driver.findElement(email);
	}
	public WebElement sub()
	{
		return driver.findElement(sub);
	}
	public WebElement title()
	{
		return driver.findElement(title);
	}

	/*
	 * private static LoginPage thisIsTestObj;
	 * 
	 * public synchronized static LoginPage get(){ thisIsTestObj =
	 * PageFactory.initElements(getWebDriver(), LoginPage.class); return
	 * thisIsTestObj; }
	 */
	@FindBy(how=How.CLASS_NAME,using="_8eso")
	@CacheLookup
	public WebElement mainScreenTitle;
	
	
	
	
}
