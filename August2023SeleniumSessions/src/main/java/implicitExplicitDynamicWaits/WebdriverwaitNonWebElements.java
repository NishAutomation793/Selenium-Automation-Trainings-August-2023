package implicitExplicitDynamicWaits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverwaitNonWebElements {

	public static void main(String[] args) {

//First use case is to check to wait if the title is present on the page

		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//
//		By aboutUs = By.linkText("About Us");
//
//		driver.findElement(aboutUs).click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//		if (wait.until(ExpectedConditions.titleIs("About Us"))) {
//
//			System.out.println(driver.getTitle());
//
//		} else {
//
//			System.out.println("Title is absent");
//		}

//Second Use Case : Checking and waiting driver till alert is present

//		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

//		driver.findElement(By.id("alertexamples")).click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//
//		System.out.println("Alerts text is :" + alert.getText());
//		alert.accept();

//Third Use Case : Waiting for Frames/iFrames to load and then driver should act

//		driver.get("http://www.londonfreelance.org/courses/frames/");
//		
//		By name=By.name("navbar");
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//	//Here this method will wait for the frame and automatically switch to it once found	
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(name));
//		
//		String text = driver.findElement(By.tagName("h3")).getText();
//
//		System.out.println(text);

//Fourth Use Case : Checking that if we have multiple windows available after click

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By youTube = By.xpath("//a[contains(@href,'youtube')]");

		driver.findElement(youTube).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		if (wait.until(ExpectedConditions.numberOfWindowsToBe(2))) {

			System.out.println("You tube is available");

		} else {

			System.out.println("Not Available");
		}

	}

}
