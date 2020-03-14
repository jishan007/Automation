package Testing.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/seemachowdhury/Desktop/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement dropDown = (WebElement) driver.findElement(By.name("country"));
		
		Select country = new Select(dropDown);
		country.selectByIndex(1);
		Thread.sleep(2000);
		System.out.println("1");
		country.deselectByIndex(1);
		System.out.println("2");
		
		country.selectByValue("AUSTRALIA");
		Thread.sleep(2000);
		country.deselectByValue("AUSTRALIA");
		
		country.selectByVisibleText("BANGLADESH");
		Thread.sleep(2000);
		country.deselectByVisibleText("BANGLADESH");
		
		country.selectByIndex(44);
		Thread.sleep(2000);
		country.deselectAll();
		Thread.sleep(2000);
		
		country.selectByVisibleText("United States");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
