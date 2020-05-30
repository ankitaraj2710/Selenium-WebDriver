import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScriptPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		/**
		 * In this we have learn how to use customized x-path using different ways
		 * 1)Using Relative method i.e where no parent child used as in example for
		 * user-email. 2)Using Absolute method i.e parent child node is used as in
		 * example click on login page.
		 */
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//nav[@class='pull-right']/ul/li[4]/a")).click();
		driver.findElement(By.cssSelector("input[id='user_email']")).sendKeys("ankitrajkaur@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("ankita2710");
		driver.findElement(By.xpath("//div[@class='form-group text-center']/input")).click();
		driver.close();
	}

}
