package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	By email = By.cssSelector("input[id='user_email']");
	By password = By.id("user_password");
	By login = By.xpath("//input[@value='Log In']");
	By forget = By.linkText("Forgot Password?");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	// create method for email
	public WebElement email() {
		return driver.findElement(email);
	}
	// create method for password

	public WebElement password() {
		return driver.findElement(password);
	}

	// create method for login button
	public WebElement login() {
		return driver.findElement(login);
	}

	// create method for forget password
	public ForgetPassword forgetpas() {
		 driver.findElement(forget).click();
		 ForgetPassword fp = new ForgetPassword(driver);
		 return fp;
	}
}
