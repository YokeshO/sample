package lloydsTesting.tcs;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.SuperHelper;



public class Appiumtest extends SuperHelper{
	public Logger log= LogManager.getLogger(Appiumtest.class);
	 public WebDriver driver;
	@Test
	public void appiumTesting() throws IOException
	{
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		System.out.println("Appium code");
		log.error("Driver is Initialized");
		log.info("Driver ");
		log.info("Driver is ");
		log.info("Driver is Initialized");
		driver.close();
		
	}
}
