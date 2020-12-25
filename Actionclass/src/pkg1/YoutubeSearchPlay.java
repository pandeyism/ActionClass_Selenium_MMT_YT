package pkg1;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YoutubeSearchPlay {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		
		WebElement search=driver.findElementByXPath("//input[@id='search' and @name='search_query']");
		search.click();
		search.sendKeys("Covid 19");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(10000);
		
		WebElement video=driver.findElementByXPath("//yt-formatted-string[text()='Coronavirus Live Map and realtime counter - Latest worldwide COVID-19 stats and figures. by NAV MED VIDEOS 1 month ago 10,777,786 views']");
	    
		ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		String current_window=driver.getWindowHandle();
		Set<String> all_windows=driver.getWindowHandles();
		 
		for(String s:all_windows)
		{
			driver.switchTo().window(s);
		}
	
	
	}
}
