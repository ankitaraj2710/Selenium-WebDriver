import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_date_selection_future_past {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.id("travel_date")).click();
		driver.findElement(By.className("next")).click();
		// for month and year selection
		// Concept behind while loop is while continuously run until its conditions get
		// false
		// Here when November 2021 WebElement get found condition becomes false and it
		// comes outside the loop.
		// otherwise it will keep on clicking next button
		while (!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"))
				.getText().contains("November 2021")) {
			driver.findElement(By.className("next")).click();
		}

		// for date selection
		java.util.List<WebElement> date = driver.findElements(By.className("day"));
		System.out.println(date.size());
		// int dateCount= date.size();
		int dateCount = driver.findElements(By.className("day")).size();
		for (int i = 1; i < dateCount; i++) {

			String text = driver.findElements(By.className("day")).get(i).getText();
			// String text =
			// driver.findElements(By.xpath("//div[@class='datepicker-days']/table/tbody/tr"));

			if (text.contains("25")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
				// driver.findElements(By.className("day")).get(i).click();
			}
		}
	}

}
