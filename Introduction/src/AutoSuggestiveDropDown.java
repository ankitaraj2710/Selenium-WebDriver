import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@class='fsw_inputField font30 lineHeight36 latoBlack']")).click();
		WebElement source = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));

		source.sendKeys("Mumb");
		source.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000L);
		source.sendKeys(Keys.ENTER);
		WebElement source1 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		source1.sendKeys("Beng");
		for (int i = 1; i < 3; i++) {
			source1.sendKeys(Keys.ARROW_DOWN);

		}
		Thread.sleep(2000L);
		source1.sendKeys(Keys.ENTER);

	}
}
