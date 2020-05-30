package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage {
	
	public WebDriver driver;
	By signin =By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']");// creating an object of webelement
    By featureText = By.xpath("//div[@class='text-center']");
	By navigation = By.cssSelector(".nav");
    
    public mainPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	//Create a method to sign
	public WebElement getsignIn() {
	
		return driver.findElement(signin);
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