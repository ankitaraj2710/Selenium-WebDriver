import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
	     WebElement test = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	     //To type text with capital letter and select it
	     a.moveToElement(test).click().keyDown(Keys.SHIFT).sendKeys("ankitajosan").doubleClick().build().perform();
	     //To hover on AccountList
	     WebElement hover=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
	     a.moveToElement(hover).build().perform();
        
	}

}
