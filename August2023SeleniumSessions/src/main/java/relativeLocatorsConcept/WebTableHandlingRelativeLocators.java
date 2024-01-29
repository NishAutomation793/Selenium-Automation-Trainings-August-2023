package relativeLocatorsConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WebTableHandlingRelativeLocators {

	/**
	 * This class will show how we can handle web tables using relative locator
	 * strategies.
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://classic.freecrm.com/");

		Thread.sleep(2000);

		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		WebElement el = driver.findElement(By.linkText("Josh Buttler"));

		// We need to click the checkbox of Josh Butler via Relatie Locators

		driver.findElement(RelativeLocator.with(By.xpath("//input[@name='contact_id']")).near(el)).click();

		// Get all the names above Josh Butler
		List<WebElement> allAboveNames = driver
				.findElements(RelativeLocator.with(By.xpath("//a[@context='contact']")).above(el));

		System.out.println("List of all above Josh Butler names are: ");

		for (WebElement elm : allAboveNames) {
			String text = elm.getText();

			System.out.println(text);

		}

		Thread.sleep(2000);

		// Get all the names below Josh Butler
		List<WebElement> allBelowNames = driver
				.findElements(RelativeLocator.with(By.xpath("//a[@context='contact']")).below(el));

		System.out.println("List of all below Josh Butler names are: ");

		for (WebElement elm : allBelowNames) {
			String text = elm.getText();

			System.out.println(text);

		}

		
		
		Thread.sleep(2000);
		//Finding company of Josh Butler
		String compName=driver.findElement(RelativeLocator.with(By.xpath("//a[@_name='Emerson Electric']")).toRightOf(el)).getText();

		System.out.println("Company Name of Josh Butler is "+compName);
		
		
	}

}
