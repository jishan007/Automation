package Testing.Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Expedia {

	
public WebDriver driver;
	
	@BeforeTest
	public void initialSetup(){
		
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 0)
	public void titleTest() throws InterruptedException{
		
		driver.get("https://www.expedia.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//check the title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations";
		
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		Thread.sleep(2000);
		
		//click on flights
		WebElement flight = driver.findElement(By.id("tab-flight-tab-hp"));
		flight.click();
		
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority = 1)
	public void bookingfirstTest() throws InterruptedException{
		
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//  /*[@id="package-origin-hp-package"]
		//WebElement leavingFrom = driver.findElement(By.xpath("//label[@class='text icon-before autocomplete-arrow']//input[@id='package-origin-hp-package']"));
		
		WebElement leavingFrom = driver.findElement(By.id("flight-origin-hp-flight"));
		leavingFrom.click();
		leavingFrom.clear();
		leavingFrom.sendKeys("New York City");
		
		Thread.sleep(1000);
		
		WebElement goingTo = driver.findElement(By.id("flight-destination-hp-flight"));
		goingTo.click();
		goingTo.clear();
		goingTo.sendKeys("Chittagong");
		
		Thread.sleep(1000);
		
		
		WebElement departingDate = driver.findElement(By.id("flight-departing-hp-flight"));
		departingDate.click();
		departingDate.clear();
		departingDate.sendKeys("04/04/2020");
		
		Thread.sleep(1000);
		
		
		WebElement returningDate = driver.findElement(By.id("flight-returning-hp-flight"));
		returningDate.click();
		returningDate.clear();
		//returningDate.sendKeys("04/24/2020");
		
		Thread.sleep(1000);
		
		//click on search button
		WebElement search = driver.findElement(By.xpath("//section[@class='tab-pane cf gcw-section-flights-tab on']//div[@class='cols-nested ab25184-submit']/label[@class='col search-btn-col']//button[@type='submit' and @class='btn-primary btn-action gcw-submit']"));
		search.click();
		Thread.sleep(2000);
		//verify the text
		
		WebElement actualTextt = driver.findElement(By.xpath("//span[@class='title-city-text']"));
		String actualText = actualTextt.getText();
		String expectedText="Select your departure to Chittagong";
		
		Assert.assertEquals(actualText, expectedText);
		
		/*Thread.sleep(4000);
		driver.switchTo().frame("mm_sync_back_ground");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='IM_overlay_close_container IM_overlay_close_button needsclick']")).click();
		*/
	}
	
	@Test(priority = 2)
	public void bookingSecondTest() throws InterruptedException{
		
		driver.get("https://www.expedia.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//click on expedia
		WebElement expedia = driver.findElement(By.xpath("//a[@href='/']"));
		expedia.click();
				
		Thread.sleep(2000);
		
		//click on flights
		WebElement flight = driver.findElement(By.id("tab-flight-tab-hp"));
		flight.click();
				
		Thread.sleep(2000);
		//  /*[@id="package-origin-hp-package"]
		//WebElement leavingFrom = driver.findElement(By.xpath("//label[@class='text icon-before autocomplete-arrow']//input[@id='package-origin-hp-package']"));
		
		WebElement leavingFrom = driver.findElement(By.id("flight-origin-hp-flight"));
		leavingFrom.click();
		leavingFrom.clear();
		leavingFrom.sendKeys("New York City");
		
		Thread.sleep(1000);
		
		WebElement goingTo = driver.findElement(By.id("flight-destination-hp-flight"));
		goingTo.click();
		goingTo.clear();
		goingTo.sendKeys("Dhaka");
		
		Thread.sleep(1000);
		
		
		WebElement departingDate = driver.findElement(By.id("flight-departing-hp-flight"));
		departingDate.click();
		departingDate.clear();
		departingDate.sendKeys("04/04/2020");
		
		Thread.sleep(1000);
		
		
		WebElement returningDate = driver.findElement(By.id("flight-returning-hp-flight"));
		returningDate.click();
		returningDate.clear();
		//returningDate.sendKeys("04/24/2020");
		
		Thread.sleep(1000);
		
		//click on search button
		WebElement search = driver.findElement(By.xpath("//section[@class='tab-pane cf gcw-section-flights-tab on']//div[@class='cols-nested ab25184-submit']/label[@class='col search-btn-col']//button[@type='submit' and @class='btn-primary btn-action gcw-submit']"));
		search.click();
		Thread.sleep(2000);
		//verify the text
		
		WebElement actualTextt = driver.findElement(By.xpath("//span[@class='title-city-text']"));
		String actualText = actualTextt.getText();
		String expectedText="Select your departure to Dhaka";
		
		Assert.assertEquals(actualText, expectedText);
		
		
		
	}
	
	
	@AfterTest
	public void quit(){
		driver.quit();
	}
}
