package utilityPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupHandle {

	/**
	 * This class will display example how to handle and take care of two windows
	 * popup Here iterator object will be pointing above the top of parent window.
	 * And it.next() will actually point the cursor to the parent window first and
	 * fetch the window id.
	 *
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		Iterator<String> it = windowHandles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);

		System.out.println("Child window URL is " + driver.getCurrentUrl());

		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(parentWindowId);

		System.out.println("Parent window URL is " + driver.getCurrentUrl());

	}

}
