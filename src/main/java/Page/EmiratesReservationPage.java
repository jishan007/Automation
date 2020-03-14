package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmiratesReservationPage {
	
	WebDriver driver;
	
	public EmiratesReservationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By viewSummary = By.xpath("//a[@id='ctl00_c_SummaryContainer_aTripSummary']//span[contains(text(),'View summary')]");
	//WebElement e = driver.findElement(By.xpath("//a[@id='ctl00_c_SummaryContainer_aTripSummary']//span[contains(text(),'View summary')]"));
	
	
	WebElement element = driver.findElement(viewSummary);
	public String expected = element.getText().trim();
	//public String expected = "ABCD";
	public String actual = "View summary";
	
	public void viewSummary () {
		Boolean B = element.isDisplayed();
	}
}
