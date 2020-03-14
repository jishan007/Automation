package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EmiratesBookingPage {

	WebDriver driver;
	
	By searchFlight = By.id("tab0");
	By departure = By.name("Departure Airport");
	By arrival = By.name("Arrival Airport");
	By continueButton = By.xpath("//a[@class='cta cta--large cta--primary js-continue-search-flight search-flight__continue--cta ']//span[contains(text(),'Continue')]");
	By departingDatefield = By.id("search-flight-date-picker--depart");
	By returningDatefield = By.id("search-flight-date-picker--return");
	By departingDate = By.xpath("//eol-calendar[@class='eol-calendar--visible eol-calendar--top']//td[@class='ek-datepicker__day']//a[contains(text(),'20')]");
	By returningDate = By.xpath("//eol-calendar[@class='eol-calendar--visible eol-calendar--top']//td[@class='ek-datepicker__day']//a[contains(text(),'26')]");
	By searchFlightButton = By.xpath("//button[@type='submit']//span[contains(text(),'Search flights')]");


	
	public EmiratesBookingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnSearchFlightTab () {
		driver.findElement(searchFlight).click();
	}
	
	public void departureAirport (String departingAirportName) {
		driver.findElement(departure).clear();
		driver.findElement(departure).sendKeys(departingAirportName);
	}
	
	public void arrivalAirport (String arrivalAirportName) {
		driver.findElement(arrival).clear();
		driver.findElement(arrival).sendKeys(arrivalAirportName);
	}
	
	public void clickOnContinue () {
		driver.findElement(continueButton).click();
	}
	
	public void departingDate () throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(departure).click();
		Thread.sleep(1000);
		driver.findElement(departingDate).click();
	}
	
	public void returningDate () throws InterruptedException {
		driver.findElement(returningDatefield).click();
		Thread.sleep(1000);
		driver.findElement(returningDate).click();
	}
	
	public void clickSearch () {
		driver.findElement(searchFlightButton).click();
	}
	
	By viewSummary = By.xpath("//a[@id='ctl00_c_SummaryContainer_aTripSummary']//span[contains(text(),'View summary')]");
	//WebElement e = driver.findElement(By.xpath("//a[@id='ctl00_c_SummaryContainer_aTripSummary']//span[contains(text(),'View summary')]"));
	
	
	/*WebElement element = driver.findElement(viewSummary);
	
	public String expected = element.getText().trim();
	//public String expected = "ABCD";
	public String actual = "View summary";*/
	
	public void viewSummary () {
		WebElement element = driver.findElement(viewSummary);
		
		String expected = element.getText().trim();
		//public String expected = "ABCD";
		String actual = "View summary";
		
		Boolean B = element.isDisplayed();
		Assert.assertEquals(expected, actual);
	}
	
	
	
	
}
