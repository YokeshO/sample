package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporter {

	 static ExtentReports extent;
	public static ExtentReports getReportObject()
	{
	  String path = System.getProperty("user.dir")+"\\reports\\index.html";
	  ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	  reporter.config().setReportName("Sample Reports");
	  reporter.config().setDocumentTitle("Test Results"); 
	   extent = new ExtentReports(); 
	  extent.attachReporter(reporter);
	  return extent;
	}
}
