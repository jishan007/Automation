package Testing.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleandRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/seemachowdhury/Desktop/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		
		WebDriver driver  = new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//double click an element
		
		Actions act = new Actions(driver);
		//WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(doubleClick).perform();
		Thread.sleep(4000);
		
		
		Alert al = driver.switchTo().alert();
		al.accept();
		//al.dismiss();
		
		//rightclick an element
		
		Actions act1 = new Actions(driver);
		//WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act1.contextClick(rightClick).perform();;
		Thread.sleep(4000);
		
		
		
		driver.quit();
		
		
		
		
		
		
	}

}
