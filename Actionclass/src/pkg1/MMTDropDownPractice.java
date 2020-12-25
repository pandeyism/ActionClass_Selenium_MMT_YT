package pkg1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMTDropDownPractice {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		
		WebElement from=driver.findElementByXPath("//label[@for='fromCity']");
		from.click();
		
		for(int i=1; i<=5; i++)
		{
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		  ac.sendKeys(Keys.TAB).perform();
		  Thread.sleep(2000);
		  
		  WebElement to=driver.findElementByXPath("//label[@for='toCity']");
		 
		  for(int i=1;i<6;i++)
		  {
			  ac.sendKeys(Keys.ARROW_UP).perform();
		  }
		  
		  ac.sendKeys(Keys.ENTER).perform();
	}

}
