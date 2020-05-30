package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;// Make WebDriver global
	// Initialize driver
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		// chrome
		prop = new Properties();
		// System.getProperty("user.dir")+
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);

		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
			driver= new ChromeDriver();
				//execute in chrome driver
			
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\geckodriver.exe");
			 driver= new FirefoxDriver();
			//firefox code
		}
		else if (browserName.equals("IE"))
		{
//			IE code
			System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Desktop\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;


		}
		// to get browser info from mvn command use system.getproperty, the code will go
		// to maven commands to get the properties from mvn
		// String browserName = System.getProperty("browser");
//		String browserName = prop.getProperty("browser");
//		if(browserName=="chrome"){
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
//
//			 driver = new ChromeDriver();
//		}
//
//		if (browserName.contains("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
//			// if you want to run chrome headless,means you want to run test in chrome but
//			// in background
//			// Use chromeOptions class which will give you methods to give commands to
//			// chrome
//			ChromeOptions options = new ChromeOptions();
//			if (browserName.contains("headless")) {
//				options.addArguments("headless");
//
//			}
//			driver = new ChromeDriver(options);
//			driver.manage().window().maximize();
//		 else if (browserName=="firefox")// whenever we extract value from properties file we can use ==
//		{  
//
//			System.getProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\geckodriver.exe");
//
//			driver = new FirefoxDriver();
//
//			// internet-Explorer
//		} else if (browserName=="IE") {
//
//			System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Desktop\\IEDriverServer.exe");
//
//			driver = new InternetExplorerDriver();
//
//		}
//		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		return driver;
//	}

	// Create method to take screen of failure with method name
	public String getScreenShot(String testCaseName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}

}
