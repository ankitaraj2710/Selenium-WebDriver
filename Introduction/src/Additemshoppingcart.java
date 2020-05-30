import java.awt.List;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Additemshoppingcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// create an array for items needed to add in cart
		String[] Itemsneeded = { "Tomato", "Mushroom", "Banana" };

		// implicit wait
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		addItems(driver, Itemsneeded);
		// click on cart icon
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		// click on proceed to checkout
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		// Explicit wait
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='promoWrapper']/input")));
		// click on promocode
		driver.findElement(By.xpath("//div[@class='promoWrapper']/input")).sendKeys("rahulshettyacademy");
		// Explicit wait
		WebDriverWait w1 = new WebDriverWait(driver, 5);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='promoBtn']")));
		// click on apply
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
	}

	public static void addItems(WebDriver driver, String[] Itemsneeded) {
		// System.out.println(driver.findElement(By.cssSelector("h4.product-name")).getSize());
		// get the number locator for add to cart button
		java.util.List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		// get the number of item with same locator
		int i, j = 0;
		for (i = 0; i < product.size(); i++) {
			// create an array to store all the items and split it in 2 parts before&after-
			String[] name = product.get(i).getText().split("-");
			// get the formatted name and store it in variable
			String formattedName = name[0].trim();
			// After getting formatted name
			// Convert array to arrayList& check if that name exist in list or not

			// List itemsneededlist = (List) Arrays.asList(Itemsneeded);
			java.util.List<String> itemsNeededList = Arrays.asList(Itemsneeded);
			if (itemsNeededList.contains(formattedName)) {
				// click on add to cart
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == Itemsneeded.length) {
					break;
				}

			}

		}
	}
}
