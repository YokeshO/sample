package lloydsTesting.tcs;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import pageObjects.LoginPage;
import utility.SuperHelper;

public class Seleniumtest extends SuperHelper {
   public WebDriver driver;
	public Logger log= LogManager.getLogger(Seleniumtest.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		/*
		 * driver = intializeDriver(); log.info("Driver is Initialized");
		 */
	}
	
	@BeforeMethod
	public void stat() throws IOException
	{
		driver = intializeDriver();
		log.info("Driver is Initialized");
	}
	@Test(dataProvider="getdata")
	public void webTesting(String email,String pass) throws IOException
	{
		driver.get(prop.getProperty("url"));
		log.info("URL launched");
		LoginPage lp=new LoginPage(driver);
		lp.getemail().sendKeys(email);		
		lp.getpass().sendKeys(pass);
		lp.sub().click();
		//String demo = lp.mainScreenTitle.getText();
		//Assert.assertEquals(lp.title().getText(), "Google");		
		System.out.println("This method to test fail");					
	    Assert.assertTrue(false);
		log.info("login button clicked");
		
	}
	
	@AfterMethod
	
	public void closesBrowser()
	{
		driver.close();	
	}
	@AfterTest	
	public void TestEnd()
	{
		
	}
	
	@DataProvider
	public Object[][] getdata1()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="Asda@gmail.com";
		data[0][1]="M";
		
		
		data[1][0]="partha@gmail.com";
		data[1][1]="M";
		
		
		data[2][0]="Samsun@gmail.com";
		data[2][1]="M";
	
		
		return data;
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[1][2];
		
		data[0][0]="Asda@gmail.com";
		data[0][1]="M";
		
		/*
		 * data[1][0]="partha@gmail.com"; data[1][1]="M";
		 * 
		 * 
		 * data[2][0]="Samsun@gmail.com"; data[2][1]="M";
		 */
	
		
		return data;
	}
	
}
