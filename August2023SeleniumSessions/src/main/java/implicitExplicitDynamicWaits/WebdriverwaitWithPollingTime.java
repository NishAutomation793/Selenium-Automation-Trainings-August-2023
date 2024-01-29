package implicitExplicitDynamicWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverwaitWithPollingTime {

/**
 * This represents use case where we are deliberately given some polling time for the selenium to attempt for checking of the webelement
 * 	
 * @param args
 */
	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		By email = By.id("input-emai2l");

		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		until.sendKeys("Element found");


		
	}

}
