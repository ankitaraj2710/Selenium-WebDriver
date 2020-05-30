package resources;



import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {


	static ExtentReports extent;
	
	public static ExtentReports config()
	
	
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
			reporter.config().setReportName("WebAutomationSelenium");
			reporter.config().setDocumentTitle("Test Details");
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Ankita Josan");
		return extent;
	}
	

}
