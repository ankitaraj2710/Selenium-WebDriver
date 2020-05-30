import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_executer_concept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		// location for list items
		// div[@class='col-md-6 popular-routes']//div[@class='carousel-caption']/ul/li
		WebElement popularSection = driver.findElement(By.xpath("//div[@class='col-md-6 popular-routes']"));

		List<WebElement> list = popularSection.findElements(
				By.xpath("//div[@class='col-md-6 popular-routes']//div[@class='carousel-caption']/ul/li"));
		int count = list.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String name = popularSection
					.findElements(
							By.xpath("//div[@class='col-md-6 popular-routes']//div[@class='carousel-caption']/ul/li"))
					.get(i).getText();
			
			String action = Keys.chord(Keys.CONTROL,Keys.ENTER);
			//System.out.println(name);

			if (name.equalsIgnoreCase("Bengaluru - Mumbai")) {
				//System.out.println(name);
				popularSection
						.findElements(By
								.xpath("//div[@class='col-md-6 popular-routes']//div[@class='carousel-caption']/ul/li/a"))
						.get(i).sendKeys(action);

				break;
			}

			}
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		}

	}

