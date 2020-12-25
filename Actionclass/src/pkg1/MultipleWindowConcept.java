package pkg1;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowConcept {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjeev\\Desktop\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	WebElement video=driver.findElementByXPath("//yt-formatted-string[@id='video-title']");
	Actions ac=new Actions(driver);
	ac.keyDown(Keys.TAB).click(video).keyUp(Keys.TAB).build().perform();
	
	
	Set<String> all_window=driver.getWindowHandles();//returns the address of all windows
	
	System.out.println("Before switching url is"+ driver.getCurrentUrl());
	int sanjeev=5;
	
	for(String s: all_window)
	{
	   sanjeev=sanjeev+1;
	   if (sanjeev==3)
	{
		driver.switchTo().window(s);
		break;
	}
	}
	
	
		
	}
	

}
