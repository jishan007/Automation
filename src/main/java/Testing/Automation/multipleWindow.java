package Testing.Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String parentWindow = driver.getWindowHandle();
		String title = driver.getCurrentUrl();
		System.out.println(title);
		
		//click on the first link
		
		WebElement link1 = driver.findElement(By.name("link1"));
		link1.click();
		
		Thread.sleep(4000);
		
		
		//switch control back to parent window
		driver.switchTo().window(parentWindow);
		
		WebElement link2 = driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']"));
		link2.click();
		
		Thread.sleep(4000);
		
		//get the urls of all window opened
		
				Set<String> allwindows = driver.getWindowHandles();
				
				for ( String w: allwindows ){
					
					if(!w.equalsIgnoreCase(parentWindow)){
						driver.switchTo().window(w);
						String s1 = driver.getCurrentUrl();
						System.out.println(s1);
					}
					
				}
		
		
		//switch to the new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		//get the title of the new window opened
		System.out.println(driver.getTitle());

		
		driver.quit();
		
		
	}

}
