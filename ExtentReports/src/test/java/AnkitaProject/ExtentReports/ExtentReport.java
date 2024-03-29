package AnkitaProject.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	
	
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
			reporter.config().setReportName("WebAutomationSelenium");
			reporter.config().setDocumentTitle("Test Details");
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Ankita Josan");
		
	}
	@Test
	public void inintialDemo() {
		
		ExtentTest test = extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    System.out.println(driver.getTitle());
	    driver.close();
	    extent.flush();
	    
	}

}
