import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com");
		//click on nested frame 
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		//System.out.println(driver.findElement(By.tagName("frame")).getSize());
		//frameset[@name='frame-middle']
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());
		

	}

}
