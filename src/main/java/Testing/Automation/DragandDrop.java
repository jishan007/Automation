package Testing.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/seemachowdhury/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().window().maximize();
		
		WebElement draggable1 = driver.findElement(By.xpath("//div[@id='todrag']//span[contains(text(),'Draggable 1')]"));
		WebElement droppable1 = driver.findElement(By.xpath("//div[@class='w50 moveleft']//div[@id='mydropzone']"));
		
		Actions act = new Actions(driver);
		
		//act.clickAndHold(draggable1).pause(2000).moveToElement(droppable1).release().build().perform();
		
		act.dragAndDrop(draggable1, droppable1).build().perform();

	}

}
