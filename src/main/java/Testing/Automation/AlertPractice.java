package Testing.Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class AlertPractice  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/seemachowdhury/Desktop/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement accept = driver.findElement(By.xpath("//a[@id='cookie_action_close_header']"));
		accept.click();
		Thread.sleep(1000);
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]"));
	
		simpleAlert.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println("1st popup closed.");
		
		
		WebElement confirmPopUp = driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]"));
		confirmPopUp.click();
		
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert1.dismiss();
		
		driver.quit();
		
		
	}

}
