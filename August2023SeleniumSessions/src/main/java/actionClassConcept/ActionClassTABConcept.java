package actionClassConcept;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Question1 : Use only one webelement and and fill the entire registration form
 * Question 2: Perform search on amazon app without using any webelement via TAB
 */
public class ActionClassTABConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement ele = driver.findElement(By.id("input-firstname"));
		Actions act =new Actions(driver);
		act.sendKeys(ele, "Nishant")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("Goel")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("nishant@gmail.com")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("9876545677")
		.build().perform();
		
		
//Question 2 : Answer
		
		driver.get("https://www.amazon.in/");
		act.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("Apple Watch")
		.sendKeys(Keys.ENTER)
		.build().perform();
		
		
		

		
	}

}
