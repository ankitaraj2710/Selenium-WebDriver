import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Desktop\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		
		//driver.get("https://www.cleartrip.com/");
		// calendar
		driver.findElement(By.id("DepartDate")).click();
		// driver.findElement(By.className(".ui-state-default.ui-state-active")).click();

		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		// adult
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("3");
		Select s2 = new Select(driver.findElement(By.id("Childrens")));
		s2.selectByVisibleText("2");
		// search button
		driver.findElement(By.id("SearchBtn")).click();
	}

}
