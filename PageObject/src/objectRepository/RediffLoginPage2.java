package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage2 {

	WebDriver driver;
	public RediffLoginPage2(WebDriver driver) 
	{
	  this.driver = driver;	
	  PageFactory.initElements(driver, this);
	}
	/*
	By username = By.xpath("//*[@id='login1']");
	By passsword = By.xpath("//*[@id=\'password\']");
	By signIn =By.className("signinbtn");
	*/
	@FindBy(xpath="//*[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\'password\']")
	WebElement password;
	@FindBy(className="signinbtn")
	WebElement signin;
	
	
	
	public WebElement EmailId() {
		
		return username;
		
	}
	public WebElement Password() {
		return password;
	}
	public WebElement signin() {
		return signin;
	}
	
}
