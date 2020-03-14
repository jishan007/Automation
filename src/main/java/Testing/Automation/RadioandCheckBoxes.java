package Testing.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class RadioandCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "/Users/seemachowdhury/Desktop/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		
		List <WebElement> list = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (int i=0; i<list.size(); i++){
			String s = "vfb-7-"+(i+1);
			//System.out.println(s);
			Thread.sleep(2000);
			driver.findElement(By.id(s)).click();;
		}
		Thread.sleep(2000);
		
		
		List <WebElement> list2 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int j=0; j<list2.size(); j++){
			String s1= "vfb-6-"+j;
			Thread.sleep(2000);
			driver.findElement(By.id(s1)).click();
		}
		
		WebElement radio1= driver.findElement(By.id("vfb-7-1"));
		WebElement radio2= driver.findElement(By.id("vfb-7-2"));
		WebElement radio3= driver.findElement(By.id("vfb-7-3"));
		
		
		if (radio1.isSelected()){
			System.out.println("Radio button one is selected");
		}
		
		else{
			System.out.println("Radio button one is not selected.");
		}
		
		if (radio2.isSelected()){
			System.out.println("Radio button two is selected");
		}
		
		else{
			System.out.println("Radio button two is not selected.");
		}
		
		if (radio3.isSelected()){
			System.out.println("Radio button three is selected");
		}
		
		else{
			System.out.println("Radio button three is not selected.");
		}
		
		WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));
		
		
		if (checkBox1.isSelected()){
			System.out.println("Check box one is selected");
		}
		
		else{
			System.out.println("Check box one is not selected.");
		}
		
		if (checkBox2.isSelected()){
			System.out.println("Check box two is selected");
		}
		
		else{
			System.out.println("Check box two is not selected.");
		}
		
		if (checkBox3.isSelected()){
			System.out.println("Check box three is selected");
		}
		
		else{
			System.out.println("Check box three is not selected.");
		}
		
		
		Boolean b1 = radio1.isDisplayed();
		Boolean b2 = radio2.isDisplayed();
		Boolean b3 = radio3.isDisplayed();
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		Boolean b4 = checkBox1.isDisplayed();
		Boolean b5 = checkBox2.isDisplayed();
		Boolean b6 = checkBox3.isDisplayed();
		
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		
		
		
		Boolean b_1 = radio1.isEnabled();
		Boolean b_2 = radio2.isEnabled();
		Boolean b_3 = radio3.isEnabled();
		
		System.out.println(b_1);
		System.out.println(b_2);
		System.out.println(b_3);
		
		
		Boolean b_4 = checkBox1.isEnabled();
		Boolean b_5 = checkBox2.isEnabled();
		Boolean b_6 = checkBox3.isEnabled();
		
		System.out.println(b_4);
		System.out.println(b_5);
		System.out.println(b_6);
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
