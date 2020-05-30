package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffCreateAccount;
import objectRepository.RediffLoginPage;
import objectRepository.RediffLoginPage2;

public class LoginApplication {
	@Test 
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    RediffLoginPage2 rd = new RediffLoginPage2(driver);
	    rd.EmailId().sendKeys("ANkita Josan");
	    rd.Password().sendKeys("1223445");
	    rd.signin().click();
	     RediffCreateAccount cr = new RediffCreateAccount(driver);
	     cr.account().click();
	}

}
