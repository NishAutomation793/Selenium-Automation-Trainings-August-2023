package utilityPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopupHandling {

	public static void main(String[] args) throws InterruptedException {

//This class will show examples to handle multiple type alerts on screen

//1. Simple Alert

		WebDriver driver = new ChromeDriver();

		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

		driver.findElement(By.id("alertexamples")).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		System.out.println("Text of the simple alert is:" + alert.getText());

		alert.accept();

		Thread.sleep(2000);

// Confirmation Alert

		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(2000);

		Alert alert1 = driver.switchTo().alert();

		System.out.println("Text of the confirmation alert is:" + alert1.getText());

		alert.accept();
		Thread.sleep(2000);

//Prompt Alert where user is prompted to enter some text.

		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(2000);

		Alert alert2 = driver.switchTo().alert();

		alert2.sendKeys("Nishant");
		Thread.sleep(2000);

		System.out.println("Text of the prompt alert is:" + alert2.getText());

		alert.accept();
		Thread.sleep(2000);

	}

}
