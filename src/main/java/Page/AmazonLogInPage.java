package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLogInPage {
	
	WebDriver driver;
	
	By username = By.id("ap_email");
	By password = By.id("ap_password");
	By signIn = By.id("signInSubmit");
	By continueButton = By.id("continue");
	
	public AmazonLogInPage(WebDriver driver){
		this.driver= driver;
	}
	
	public void sendingUsername () {
		driver.findElement(username).sendKeys("biswasjishan@yahoo.com");
	}
	
	public void continueButton () {
		driver.findElement(continueButton).click();
	}
	
	public void sendingpassword () {
		driver.findElement(password).sendKeys("monermadury");
	}
	
	public void signIn () {
		driver.findElement(signIn).click();
	}
	
	
	
}
