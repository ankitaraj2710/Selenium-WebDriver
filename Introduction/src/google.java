import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		//Basic's for x-path using parent child method when we cant find any unique attribute 
	    //	sign-in is the example for parent child
	    driver.findElement(By.linkText("Images")).click();//This is to click on images
	    driver.findElement(By.xpath("//div[@class='gb_ug gb_i']/div/a")).click();// This is to click on sign-in
	}

}
