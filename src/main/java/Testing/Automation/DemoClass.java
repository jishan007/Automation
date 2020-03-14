package Testing.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass {

	public static void main (String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/seemachowdhury/Desktop/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.amazon.com/");
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//finding element using id
		//clicking on the search button
		
		WebElement e = driver.findElement(By.id("header-desktop-search-button"));
		e.click();
		
		//finding element using name
		//find the searchbox and type USA and click the search button
		
		WebElement e1 = driver.findElement(By.name("p"));
		e1.sendKeys("USA");
		e.click();
		Thread.sleep(4000);
		System.out.println("hi");
		
		WebElement e2 = driver.findElement(By.name("p"));
		e2.clear();
		e2.sendKeys("Bangladesh");
		
		//finding element using className
		
		WebElement e3 = driver.findElement(By.className("sbb"));
		e3.click();
		
		Thread.sleep(4000);
		
		//finding element using linkText
		
		WebElement e4 = driver.findElement(By.linkText("Bangladesh - Wikipedia"));
		e4.click();
		
		Thread.sleep(2000);
		
		
		
		driver.quit();

	}

}
