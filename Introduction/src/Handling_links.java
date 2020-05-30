import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		WebElement column1Links = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column1Links.findElements(By.tagName("a")).size());

		for (int i = 1; i < column1Links.findElements(By.tagName("a")).size(); i++) {

			// Here we are passing keys control automation to enter on links using
			// keys.chord
			String enterLinks = Keys.chord(Keys.CONTROL, Keys.ENTER); // to enter on links
			column1Links.findElements(By.tagName("a")).get(i).sendKeys(enterLinks);

		}
		// After clicking on links, to print title name we can use windows handling
		// concept
		// by using Set class and Iterator method

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		while (it.hasNext()) {

			System.out.println(driver.switchTo().window(it.next()).getTitle());// to print name of each links

		}

	}

}
