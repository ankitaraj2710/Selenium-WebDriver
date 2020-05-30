package stepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefinition{

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.out.println("User is Login");
        
    }

    @When("^User login into applicaton with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_applicaton_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    	 System.out.println(strArg1);
         System.out.println(strArg2);
    	
     
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home Page is Loaded");
    
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    	throw new PendingException();
    }

}