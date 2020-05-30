import javax.naming.directory.InvalidSearchControlsException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		// Step1 select option from checkbox labels
		
		WebElement column4 = driver.findElement(By.xpath("//div[@class='block large-row-spacer']/div[4]"));

		System.out.println(column4.findElements(By.tagName("label")).size());
		for (int i = 1; i < (column4.findElements(By.tagName("label")).size()); i++) {

			

			WebElement selected = column4.findElement(By.cssSelector("*[value='option2']"));
			selected.click();
			Thread.sleep(2000L);
			//print Text name & store it in variable
			System.out.println(driver.findElement(By.xpath("//*[text()='Option2']")).getText());
			
			break;
			

		}

		driver.findElement(By.id("dropdown-class-example")).click();
		//store the option value in variable
		WebElement s2 = driver.findElement(By.xpath("//*[text()='Option2']"));
		
		String s1 = s2.getText();
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		// call the variable in select class
		s.selectByVisibleText(s1);
		//send name to edit text through variable
		driver.findElement(By.id("name")).sendKeys(s1);
		//check alert message
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String text = driver.switchTo().alert().getText();
		if(text.contains(s1)) {
			System.out.println("Yes it contains");
		}
		else {
			System.out.println("No it does not contains");
		}
		// driver.switchTo().alert().accept();

		

	}
}
