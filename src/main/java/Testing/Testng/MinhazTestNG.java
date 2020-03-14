package Testing.Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MinhazTestNG {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialSetup(){
		
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void mainTest() throws InterruptedException{
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//check the title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		
		if (actualTitle.equals(expectedTitle)){
			System.out.println("Title matching.");
		}
		
		Assert.assertEquals(actualTitle, expectedTitle);
		//type text in search button
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Selenium.");
		
		Thread.sleep(2000);
		
		
		
		
	}
	
	@AfterTest
	public void quit(){
		driver.quit();
	}
	

}
