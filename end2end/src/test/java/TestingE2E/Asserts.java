package TestingE2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.mainPage;
import resources.Base;

public class Asserts extends Base{
	public WebDriver driver;
	private static Logger log =LogManager.getLogger(Asserts.class.getName());
	@BeforeTest
	public void initialize() throws IOException {

		driver=initializeDriver();//here initialize method has a return type of driver
		//driver object is global in base class so we can access it in inherited class
		
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void basePageNavigation() throws IOException {
		
		
		mainPage mp = new mainPage(driver);
		//Assertion
		Assert.assertEquals(mp.feature().getText(), "FEATURED COURSES");
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
