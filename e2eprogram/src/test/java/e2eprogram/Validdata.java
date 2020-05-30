package e2eprogram;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import e2eprogram.Validdata;
import pageObjects.MainPage;
import resources.base;

public class Validdata extends base{
	public WebDriver  driver;
	private static Logger log =LogManager.getLogger(Validdata.class.getName());
	@BeforeTest
	public void initialize() throws IOException {

		driver=initializeDriver();//here initialize method has a return type of driver
		//driver object is global in base class so we can access it in inherited class
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {
		
		
		MainPage mp = new MainPage(driver);
		//Assertion
		//Assert.assertEquals(mp.feature().getText(), "FEATURED COURSES");
		Assert.assertTrue(mp.getNaviBar().isDisplayed());
	    log.info("Navigation is displayed");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
