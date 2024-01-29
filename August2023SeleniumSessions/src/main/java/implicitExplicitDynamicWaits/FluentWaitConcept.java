package implicitExplicitDynamicWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

/**
 * This class will illustrate example of fluent waits	
 * @param args
 */
	public static void main(String[] args) {
			WebDriver driver =new ChromeDriver();
//			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//					             .withTimeout(Duration.ofSeconds(2))
//					             .pollingEvery(Duration.ofSeconds(1))
//					             .withMessage("Time out is over. No element")
//					             .ignoring(NoSuchElementException.class);
//			
//			By email =By.id("emailId");
//			wait.until(ExpectedConditions.presenceOfElementLocated(email)).click();
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait
	.withTimeout(Duration.ofSeconds(2))
	.pollingEvery(Duration.ofSeconds(1))
	.ignoring(NoSuchElementException.class)
	.withMessage("Element Not found");
		
	}

}
