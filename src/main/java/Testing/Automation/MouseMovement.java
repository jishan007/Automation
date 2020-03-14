package Testing.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/seemachowdhury/Desktop/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/seemachowdhury/Desktop/chromedriver");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		String actualTitle = driver.getCurrentUrl();
		String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Title matches.");
		}
		
		WebElement e1 = driver.findElement(By.xpath("//span[@class='darkGreyText']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(e1).build().perform();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement myBiz = driver.findElement(By.xpath("//div[@class='moreOption font16 latoBold']//a[@href='//mybiz.makemytrip.com/']"));
		WebElement internationalFlights = driver.findElement(By.xpath("//div[@class='moreOption font16 latoBold']//a[@href='https://www.makemytrip.com/international-flights/']"));
		WebElement internationalHotels = driver.findElement(By.xpath("//div[@class='moreOption font16 latoBold']//a[@href='https://www.makemytrip.com/hotels-international/']"));
		WebElement deals = driver.findElement(By.xpath("//div[@class='moreOption font16 latoBold']//a[@href='https://www.makemytrip.com/daily-deals/']"));
		WebElement blogs = driver.findElement(By.xpath("//div[@class='moreOption font16 latoBold']//a[@href='https://www.makemytrip.com/blog/?intid=Blog_HomePage_Tab_Stories']"));
		
		act.moveToElement(myBiz).build().perform();
		act.moveToElement(internationalFlights).build().perform();
		act.moveToElement(internationalHotels).build().perform();
		act.moveToElement(deals).build().perform();
		act.moveToElement(blogs).build().perform();
		
		
		
		myBiz.click();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
