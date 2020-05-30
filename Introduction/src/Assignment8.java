import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement select = driver.findElement(By.cssSelector("input[id='autocomplete']"));
		select.sendKeys("Can");
		Thread.sleep(2000L);
//		select.sendKeys(Keys.DOWN);
//		System.out.println(select.getText());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i=0 ;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		while(!text.equalsIgnoreCase("Canada")) {
			i++;
			
			select.sendKeys(Keys.DOWN);
			
			text = (String) js.executeScript(script);
			System.out.println(text);
			
			 if(i>10) {
		    	 break;
		     }
		}
		
		     if(i>10) {
		    	 
		    	 System.out.println("Does not Found country name");
		     }
		     else {
		    	 System.out.println(" found Country");
		     }
		    
		
		
		
		
	}

}

