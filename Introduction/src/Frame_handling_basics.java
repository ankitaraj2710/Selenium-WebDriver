import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_handling_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//Switch driver to frame
		 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	
		//Now perform Actions class method 
		Actions a = new Actions(driver);
	    WebElement t = driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement s = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	     a.dragAndDrop(t,s).build().perform();
		 driver.switchTo().defaultContent();
	   
		

	}

}
