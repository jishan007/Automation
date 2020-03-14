package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLogInPage3 {
	
	WebDriver driver;
	
	By username = By.id("ap_email");
	By password = By.id("ap_password");
	By signIn = By.id("signInSubmit");
	By continueButton = By.id("continue");
	
	public AmazonLogInPage3(WebDriver driver){
		this.driver= driver;
	}
	
	public void user_pass_login (String user_name, String pass_word) {
		
		driver.findElement(username).sendKeys(user_name);
		driver.findElement(continueButton).click();
		driver.findElement(password).sendKeys(pass_word);
		driver.findElement(signIn).click();
	}	
	
	
}
