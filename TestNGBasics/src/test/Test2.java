package test;

import org.testng.annotations.Test;

public class Test2 {


	@Test//add test library and import testNG
	public void WebLogin() {
		//Selenium
		System.out.println("webloginCar");
	}
	@Test
	public void MobileLogin() {
	//Appium 	
		System.out.println("MobileloginCar");
	}
	@Test
	public void LoginAPI() {
		//Rest API automation
		System.out.println("APIloginCar");
	}


}
