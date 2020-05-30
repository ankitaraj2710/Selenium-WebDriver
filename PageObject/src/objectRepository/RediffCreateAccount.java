package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffCreateAccount {

	 WebDriver driver;

	public RediffCreateAccount(WebDriver driver) {
		
	this.driver =driver;
	}
	By createAccount = By.linkText("Forgot Password?");
   public WebElement account() {
	  return driver.findElement(createAccount);
   }
	
}
