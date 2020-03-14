package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.EmiratesBookingPage;
import Page.EmiratesReservationPage;

public class EmiratesTest {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.emirates.com/us/english/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void verifyBooking () throws InterruptedException {
		
		EmiratesBookingPage book = new EmiratesBookingPage(driver);
		
		book.clickOnSearchFlightTab();
		Thread.sleep(1000);
		
		book.departureAirport("New York");
		Thread.sleep(1000);
		
		try{
		book.clickOnContinue();
		Thread.sleep(1000);
		}
		
		catch (Exception e){
			System.out.println(e);
		}
		
		book.arrivalAirport("Dubai");
		Thread.sleep(1000);
		
		book.departingDate();
		Thread.sleep(1000);
		
		book.returningDate();
		Thread.sleep(1000);
		
		book.clickSearch();
		Thread.sleep(60000);
		
		book.viewSummary();
		//Assert.assertEquals(book.expected, book.actual);
	}
	
	/*@Test
	public void reservationTest() {
		
		EmiratesReservationPage reserve = new EmiratesReservationPage(driver);
		
		reserve.viewSummary();
		Assert.assertEquals(reserve.expected, reserve.actual);
		
		
	}
	*/
	@AfterTest
	public void closingBrowser () {
		driver.quit();
	}

}


/*
 * echo "# Automation" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/jishan007/Automation.git
git push -u origin master*/
