package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	public RediffLoginPage(WebDriver driver) 
	{
	  this.driver = driver;	
	}
	
	By username = By.xpath("//*[@id='login1']");
	By passsword = By.xpath("//*[@id=\'password\']");
	By signIn =By.className("signinbtn");
	
	public WebElement EmailId() {
		
		return driver.findElement(username);
		
	}
	public WebElement Password() {
		return driver.findElement(passsword);
	}
	public WebElement signin() {
		return driver.findElement(signIn);
	}
	
}
