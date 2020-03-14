package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLoginPageFactory {
	
	WebDriver driver;
	
	public AmazonLoginPageFactory(WebDriver driverrr) {
		
		this.driver=driverrr;
	}
	
	
	@FindBy(id="ap_email")
	WebElement userId;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(id="signInSubmit")
	WebElement signIn;
	
	public void loginPage(String user, String pass){
		
		userId.sendKeys(user);
		continueButton.click();
		password.sendKeys(pass);
		signIn.click();
	}
	
}
