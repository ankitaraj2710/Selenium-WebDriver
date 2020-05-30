import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Select round trip
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
//		//Select Destinations
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		
//		driver.findElement(By.xpath("//a[@value='DED']")).click();
//		Thread.sleep(2000L);
//		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BOM']")).click();
//  
//		//Select or validate Dates
//		driver.findElement(By.className(".ui-datepicker-unselectable.ui-state-disabled.ui-datepicker-today")).click();
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
//		{ 
//			System.out.println("Date is enabled");
//			Assert.assertTrue(true);
//		}
//		else {
//			System.out.println("Date is not Enabled");
//			Assert.assertTrue(true);
//		}
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//Select Passengers
		driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        for(int i = 1;i<4;i++) {
         driver.findElement(By.id("hrefIncAdt")).click();
        }
     	 driver.findElement(By.id("btnclosepaxoption")).click();
     	 //Select Currency
     	Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
  	          s.selectByVisibleText("USD");
  	          s.selectByIndex(1);
  	          s.selectByValue("AED"); 
  	     //Click on Search Button
  	          driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
