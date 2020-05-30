package stepDefintions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import resources.base;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class stepdefinition extends base {

	@Given("^Initialize the brower$")
	public void initialize_the_brower() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver =initializeDriver();
	}

	@Given("^Navigate to website \"([^\"]*)\" url$")
	public void navigate_to_website_url(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(arg1);
	}

	@Given("^click on login button to navigate to login page$")
	public void click_on_login_button_to_navigate_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		MainPage mp = new MainPage(driver);
		
		LoginPage lp=mp.getsignIn();
	}

	@Then("^enter \"([^\"]*)\" and \"([^\"]*)\" to login Successfully$")
	public void enter_and_to_login_Successfully(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage lp = new LoginPage(driver);
		lp.email().sendKeys(arg1);//call email method
		lp.password().sendKeys(arg2);//call password method
		lp.login().click();//call login method
	}



}