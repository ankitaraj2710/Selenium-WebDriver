import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement table= driver.findElement(By.id("product"));
		System.out.println("Number of rows "+table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size());
		System.out.println("Number of column "+table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size());
	
		List<WebElement> row3 = table.findElements(By.xpath("//table[@id='product']/tbody/tr[2]/td"));
		System.out.println(row3.get(0).getText());
		System.out.println(row3.get(1).getText());
		System.out.println(row3.get(2).getText());
		int sum=0;
		int count=table.findElements(By.xpath("//table[@id='product']/tbody/tr/td[3]")).size();
		for(int i=0;i<count;i++) {
			String value=table.findElements(By.xpath("//table[@id='product']/tbody/tr/td[3]")).get(i).getText();
			
			int actualValue = Integer.parseInt(value);
			sum=sum+actualValue;
			
		}
		System.out.println("Total is "+sum);
	}

}
