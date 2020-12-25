package pkg1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabShiftKeys {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjeev\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB);
		ac.keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("anjeev").build().perform();
		ac.sendKeys(Keys.TAB).perform();
		ac.keyDown(Keys.SHIFT).sendKeys("pandu").keyUp(Keys.SHIFT).sendKeys("pandey").build().perform();
	}

}
