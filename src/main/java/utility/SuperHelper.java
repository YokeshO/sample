package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperHelper {

	public WebDriver driver;
	public Properties prop;
public WebDriver intializeDriver() throws IOException
{
	 prop=new Properties();
	FileInputStream filename=new FileInputStream("C:\\Users\\YokeshO\\Documents\\Lloyds Testing Framework\\tcs\\src\\main\\java\\config\\config.properties");
	prop.load(filename);
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		
	}
	else if(browserName.equals("IE"))
	{
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}
public String getScreenshots(String TestcaseName, WebDriver driver) throws IOException
{
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	File source =screenshot.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"\\reports\\ScreenCaptures\\"+TestcaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;
}
	
}
