package Testing.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/seemachowdhury/Desktop/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//id
		
		WebElement e1 = driver.findElement(By.id("searchDropdownDescription"));
		String value1 = e1.getAttribute("id");
		System.out.println("ID Is: "+ value1);
		
		
		//name
		

		WebElement e2 = driver.findElement(By.name("description"));
		String value2 = e2.getAttribute("name");
		System.out.println("Name Is: "+ value2);
		
		
		//className
		
		WebElement e3 = driver.findElement(By.className("skip-link"));
		String value3 = e3.getAttribute("className");
		System.out.println("className Is: "+ value3);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Xpath
		
		WebElement e4 = driver.findElement(By.xpath("//div[@id='glow-ingress-block']//span[@id='glow-ingress-line2']"));
		String value4 = e4.getText();
		System.out.println("the xpath contains the following text: "+ value4);
		System.out.println("JJJJJJ");
		
		//linktext
		
		WebElement e5 = driver.findElement(By.linkText("Try Prime"));
		String value5 = e5.getText();
		System.out.println("the linkText contains the following text: "+ value5);
		
		
		//partialLinktext
		
		WebElement e6 = driver.findElement(By.partialLinkText("Conditions of"));
		String value6 = e6.getText();
		System.out.println("the partiallinkText contains the following text: "+ value6);
		

		driver.close();
		
		
		
	}

}
