import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting_arraylist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("table[id='sortableTable'] tr th:nth-child(2)")).click();
		List<WebElement> colmnList = driver
				.findElements(By.cssSelector("table[id='sortableTable'] tr td:nth-child(2)"));

		System.out.println(colmnList.size());
		ArrayList<String> actualList = new ArrayList<String>();
		for (int i = 0; i < colmnList.size(); i++) {

			actualList.add(colmnList.get(i).getText());

		}
		System.out.println(actualList);

		for (String s1 : actualList) {
			System.out.println(s1);

		}
		ArrayList<String> copyList = new ArrayList<String>();
		for (int i = 0; i < colmnList.size(); i++) {
			copyList.add(actualList.get(i));
			// the test case will fail because the actual list in not sorted and the copied
			// list is sorted
			Collections.sort(copyList);// to sort the list
			// If we again sort the list in descending order the test will pass now the
			// actual & copied will be same
			// Collections.reverse(copyList);//to reverse the list or to do it in descending
			// order

		}
		System.out.println("*******************************");
		for (String s2 : copyList) {
			System.out.println(s2);
		}
		Assert.assertEquals(actualList, copyList);
		if (true) {
			System.out.println("Test Passes");
		}

	}
}
