package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	public WebDriver driver;
	By signin =By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']");// creating an object of webelement
    By featureText = By.xpath("//div[@class='text-center']");
	By navigation = By.cssSelector(".nav");
    
    public MainPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	//Create a method to sign
	public LoginPage getsignIn() {

		driver.findElement(signin).click();
		LoginPage lp = new LoginPage(driver);
		//ForgetPassword fp= new ForgetPassword(driver);
		return lp;
	}
	//create a method for Featured text
	public WebElement feature() {
		return driver.findElement(featureText);
	}
	//create method for navigation
	public WebElement getNaviBar() {
		return driver.findElement(navigation);
		
	}

}
