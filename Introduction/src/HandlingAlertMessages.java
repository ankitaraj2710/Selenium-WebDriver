import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertMessages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// How to handle alert messages with selenium webdriver
		/*
		 * switchTo()method converts java to selenium driver alert(),accept(),dismiss()
		 * are different methods used withswitchTo accpet() is for positive approach in
		 * alert message dismiss() is for negative
		 */
		driver.findElement(By.id("name")).sendKeys("Ankita Josan");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000L);
		driver.switchTo().alert().accept();
		Thread.sleep(2000L);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000L);
		driver.switchTo().alert().dismiss();

	}

}
