package pkg1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMTPassenger {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement from=driver.findElementByXPath("//label[@for='fromCity']");
		
		
		Actions ac=new Actions(driver);
		
		
	}

}
