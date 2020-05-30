package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
	public WebDriver driver;
	
	
	By email = By.cssSelector("input[id='user_email']");
	By password = By.id("user_password");
	By login = By.xpath("//input[@value='Log In']");
	public Login_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
   // create method for email
	public WebElement email() {
		return driver.findElement(email);
	}
	//create method for password
	
     public WebElement password() {
    	 return driver.findElement(password);
     }
     //create method for login button
     public WebElement login() {
    	return driver.findElement(login);
     }
}
