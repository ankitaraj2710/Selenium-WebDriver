package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver;//Make WebDriver global
	//Initialize driver
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		//chrome
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Testing\\e2e\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

			 driver = new ChromeDriver();
			
			
		}
		else if(browserName.equals("firefox"))//whenever we extract value from properties file we can use ==
		{		//firefox
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\geckodriver.exe");

	    driver = new FirefoxDriver();
		
		//internet-Explorer
	}
		else if(browserName.equals("IE")) {
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Desktop\\IEDriverServer.exe");

			 driver = new InternetExplorerDriver();
			
		
		}
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			return driver;
		}

}
