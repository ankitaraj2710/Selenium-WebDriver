package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPassword {
public WebDriver driver;
	
	
	By email = By.cssSelector("input[id='user_email']");
    By forget = By.linkText("Forgot Password?");
    By sendMesaagae = By.cssSelector("input[name='commit']");
	public ForgetPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
   // create method for email
	public WebElement email() {
		return driver.findElement(email);
	}
	//method to forget pass
	public WebElement  sendInstruction() {
		return driver.findElement(sendMesaagae);
	}
	

}
