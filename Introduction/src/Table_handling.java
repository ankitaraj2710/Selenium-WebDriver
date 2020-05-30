import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_handling {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19832/scorecard/1222067/australia-vs-india-1st-qf-icc-knockout-at-nairobi-retrolive-2019-20");
        //get the full batsman table and make an driver object
		WebElement batsman = driver.findElement(By.xpath("//table[@class='table batsman']"));
	     System.out.println(batsman.findElements(By.xpath("//table[@class='table batsman']/tbody/tr")).size());
	     System.out.println(batsman.findElement(By.xpath("//table[@class='table batsman']/tbody/tr/td[3]")).getText());
	    int count = batsman.findElements(By.xpath("//table[@class='table batsman']/tbody/tr/td[3]")).size();
	 int sum = 0;
	
	 for(int i=0;i<count-12;i++) {
		 String value = batsman.findElements(By.xpath("//table[@class='table batsman']/tbody/tr/td[3]")).get(i).getText();
		 int actualValue=Integer.parseInt(value);
	      sum=sum+actualValue;
		 System.out.println(sum);
		  
	 }
	
	    
	}

}
