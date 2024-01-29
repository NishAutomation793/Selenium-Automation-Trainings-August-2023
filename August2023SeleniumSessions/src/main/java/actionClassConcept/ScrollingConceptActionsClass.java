package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingConceptActionsClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		Actions act = new Actions(driver);

//Use Case 1: Slight scrolling up and down
//Page Up and Page Down Keys help in slight scrolling	
//Control +PageUp and Control+Page Down does the same job of slightly scrolling the Page		

		act.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(1000);

		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(1000);

		System.out.println("Time for Page Up via COntrol");

		act.sendKeys(Keys.CONTROL).sendKeys(Keys.PAGE_UP).build().perform();

		System.out.println("Time for Page Down via COntrol");

		Thread.sleep(3000);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).build().perform();

		
//Use Case 2: Method 1-->Complete scrolling up and down of the Page
		
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
		Thread.sleep(1000);
		
//Use Case 2: Method 2-->Complete scrolling up and down of the Page via KeyDown and KeyUp Keys
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();

		Thread.sleep(1000);
		
//Use Case 3: Scrolling the Page till the WebElement location
		
		act.scrollToElement(driver.findElement(By.xpath("//div[text()='See personalized recommendations']"))).build().perform();
		
		
	}

}
