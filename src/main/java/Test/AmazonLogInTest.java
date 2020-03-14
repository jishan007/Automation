package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Page.AmazonLogInPage;
import Page.AmazonLogInPage2;
import Page.AmazonLogInPage3;

public class AmazonLogInTest {
	
	
	
	
	@Test
	public void verifyLogIn() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		AmazonLogInPage log = new AmazonLogInPage(driver);
		
		log.sendingUsername();
		log.continueButton();
		log.sendingpassword();
		log.signIn();
		
		driver.quit();
		
		
		AmazonLogInPage2 log2 = new AmazonLogInPage2(driver);
		
		log2.sendingUsername("biswasjishan@yahoo.com");
		log2.continueButton();
		log2.sendingpassword("monermadury");
		log2.signIn();
		
		
	}
	
	@Test
	public void verifyLogIn2() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		
		AmazonLogInPage2 log2 = new AmazonLogInPage2(driver);
		
		log2.sendingUsername("biswasjishan@yahoo.com");
		log2.continueButton();
		log2.sendingpassword("monermadury");
		log2.signIn();
		
		driver.quit();
		
		
	}
	
	@Test
	public void verifyLogIn3() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		
		AmazonLogInPage3 log3 = new AmazonLogInPage3(driver);
		
		log3.user_pass_login("biswasjishan@yahoo.com", "monermadury");
		
		driver.quit();
		
		
	}

}
