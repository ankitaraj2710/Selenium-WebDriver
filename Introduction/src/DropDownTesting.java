import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownTesting {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/**
		 * Here we are handling check boxes Regular expression is used for cssLocator
		 * isSelected method will check the check box is selected or not size()method
		 * will give the size of checkBoxes for particular page Test with assertion also
		 * done in this exercise to check test pass or fail without using console prints
		 */

		driver.findElement(By.xpath("//*[text()='Round Trip']")).click();
		/*
		 * Here getAttribute is used to get the attribute which later can use for
		 * validation Contains method check if the attribute contains provided text or
		 * number
		 */

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Date is enabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("Date is not Enabled");
			Assert.assertTrue(false);
		}

		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		// driver.findElement(By.className(".ui-state-default.ui-state-active")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		// System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue((driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()));
		System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for (int i = 1; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		/*
		 * Here we can also use while loop int i = 1; while(i<5) {
		 * driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */
		driver.findElement(By.id("btnclosepaxoption")).click();
		// In this Example we have study how to handle static drop down menu
		// Here we have made an object for select class and pass an argument
		// Argument is the location of the web element
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		// Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText(),
		// "INR");
		s.selectByVisibleText("USD");
		s.selectByIndex(1);
		s.selectByValue("AED");
		//driver.close();
	}
}
