import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Desktop\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://login.SalesForce.com");
		// driver.findElement(By.id("username")).sendKeys("Ankita Josan");
		// driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("HelloBrother");
		// driver.findElement(By.name("pw")).sendKeys("12452");
		// driver.findElement(By.xpath("//*[@id=\'Login\']")).click();//locator using
		// xpath

		// driver.close();
		driver.findElement(By.cssSelector("#username")).sendKeys("Ankita");
		driver.findElement(By.cssSelector("#password")).sendKeys("123353tg");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();

	}

}
