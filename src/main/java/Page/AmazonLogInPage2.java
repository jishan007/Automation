package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLogInPage2 {
	
	WebDriver driver;
	
	By username = By.id("ap_email");
	By password = By.id("ap_password");
	By signIn = By.id("signInSubmit");
	By continueButton = By.id("continue");
	
	public AmazonLogInPage2(WebDriver driver){
		this.driver= driver;
	}
	
	public void sendingUsername (String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void continueButton () {
		driver.findElement(continueButton).click();
	}
	
	public void sendingpassword (String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void signIn () {
		driver.findElement(signIn).click();
	}
	
	
	
}
