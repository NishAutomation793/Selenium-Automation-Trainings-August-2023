package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSendKeysWithPause {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement ele = driver.findElement(By.id("input-email"));
		String s = "nishant@123";
		char ch[] = s.toCharArray();
		Actions act = new Actions(driver);
		
		for( char c:ch)
		{
		act.sendKeys(ele, String.valueOf(c)).pause(2000).build().perform();
		}
	}

}
