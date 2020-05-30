package FromScratchTesting;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.Login_page;
import pageObjects.mainPage;

public class HomePage extends Base{
//Here Used inheritence concept to use Base class methods
	public static Logger log =LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {

		driver=initializeDriver();//here initialize method has a return type of driver
		//driver object is global in base class so we can access it in inherited class
		
	
	}
	@Test(dataProvider="getData") 
	public void basePageNavigation(String UserName, String passwrd) throws IOException {
		driver.get(prop.getProperty("url"));
		mainPage mp = new mainPage(driver);
		
		mp.getsignIn().click();
		
		//create an object for login class
		Login_page lp = new Login_page(driver);
		lp.email().sendKeys(UserName);//call email method
		lp.password().sendKeys(passwrd);//call password method
		lp.login().click();//call login method
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		//0th Row
		data[0][0] = "nonrestrictuser@qa.com";
		data[0][1] = "123456";
		//data[0][2] = "Restricted User";
		//1st Row
		data[1][0] = "restricteduser@qa.com";
		data[1][1] = "456788";
		//data[1][2] = "Non restricted user";
		return data;
		
		
	}
	
}
