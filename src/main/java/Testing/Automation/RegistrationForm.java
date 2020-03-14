package Testing.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/seemachowdhury/Desktop/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//closing the frame
		
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
		
		//First name = absolute xpath
		
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		String sfirstName = "Jishan";
		firstName.sendKeys(sfirstName);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Last name = relative xpath
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		String slastName = "Biswas";
		lastName.sendKeys(slastName);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Phone = name
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("1234123412");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		//Email = ID
		
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("abc@yahoo.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
		//Address = contains with xpath
		
		WebElement address = driver.findElement(By.xpath("//input[contains(@name,'address1')]"));
		address.sendKeys("9010 214th street");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//City = name
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Queens Village");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//State
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("NY");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Zip Code
		
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("11428");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//country
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select countryName = new Select(country);
		countryName.selectByVisibleText("UNITED STATES");
		
		
		//user name, password, confirm password
		
		WebElement userName = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
		String suserName = "JB";
		userName.sendKeys(suserName);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		password.sendKeys("JB1234");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		WebElement confirmPassword = driver.findElement(By.xpath("//input[contains(@name,'confirmPassword')]"));
		confirmPassword.sendKeys("JB1234");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
		
		//submit button
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//check whether the message is displayed
		
		WebElement message = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td"));
		Boolean messageDisplayed = message.isDisplayed();
		System.out.println(messageDisplayed);
		String actualMessage = message.getText().trim().replaceAll("\\n+","");
		System.out.println(actualMessage);
		
		String expectedMessage = "Dear " +sfirstName+ " "+ slastName+",Thank you for registering. You may now sign-in using the user name and password you've just entered."
				+ "Note: Your user name is " + suserName + ".";
		
		System.out.println("     ");
		System.out.println(expectedMessage);
		
		if (actualMessage.contains(expectedMessage)){
			System.out.println("Message is displayed correctly.");
		}
		else{
			System.out.println("it's doesnt contain the expected message.");
		}
		
		driver.quit();
	}

}
