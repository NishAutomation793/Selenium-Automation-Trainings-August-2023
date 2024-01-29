package utilityPackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2WindowsHandlesCRMApp {

	/*
	 * This class will tell example of how to handle multiple windows in CRM
	 * application
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.linkText("New Contact"))).click().build().perform();

		driver.findElement(By.xpath("//input[@name='client_id']/following-sibling::input[@value='Lookup']")).click();

		String parentWindowHandle = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();

		Iterator<String> st = windowHandles.iterator();

		st.next();
		String childWindowHandle = st.next();

		driver.switchTo().window(childWindowHandle);

		driver.findElement(By.id("search")).sendKeys("ABCD");
		act.sendKeys(Keys.ENTER).build().perform();

		driver.findElement(By.xpath("//a[text()='ABCD']")).click();

		// Now here after closing the secind window handle this window automatically
		// closes hence we need to
		// move the driver back to the original window since it is lost now.

		driver.switchTo().window(parentWindowHandle);

		Thread.sleep(2000);

		System.out.println("Title of the page is " + driver.getTitle());

		// Extracting the exact value entered inside the company from lookup

		driver.switchTo().frame("mainpanel");

		System.out.println("Title of the page is " + driver.getTitle());

		WebElement companyValue = driver.findElement(By.xpath("//input[@name='client_lookup']"));

		System.out.println("Company value entered is " + companyValue.getAttribute("value"));

	}

}
