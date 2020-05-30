package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//feature
	//stepDefinition

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitions")
public class testRunner {

	

}
