package pkg1;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModifierExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjeev\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement video=driver.findElementByXPath("//yt-formatted-string[@id='video-title']");
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		
		String current_window=driver.getWindowHandle();// returns the address of current window address
		Set<String> all_window=driver.getWindowHandles();//returns the address of all windows
		
		System.out.println("Before switching url is"+ driver.getCurrentUrl());
		for(String s: all_window)
		{
			driver.switchTo().window(s);
		}
		
		System.out.println("After switching url is"+ driver.getCurrentUrl());
		driver.switchTo().window(current_window);
		System.out.println("Finally switching url is"+ driver.getCurrentUrl());
	}

	
}
