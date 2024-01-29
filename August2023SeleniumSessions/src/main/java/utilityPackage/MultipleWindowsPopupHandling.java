package utilityPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsPopupHandling {

	/**
	 * This will state the example how to handle multiple windows with loop
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();

		String parentWindowId = driver.getWindowHandle();

		System.out.println("Parent window url is " + driver.getCurrentUrl());

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Size of total tabs are " + windowHandles.size());

		Iterator<String> it = windowHandles.iterator();

		while (it.hasNext()) {

			String childWindowId = it.next();

			if (!childWindowId.equals(parentWindowId)) {
				driver.switchTo().window(childWindowId);

				System.out.println("Child window id and url is " + childWindowId + "-->" + driver.getCurrentUrl());
				Thread.sleep(2000);

				driver.close();

			}
		}

	}

}
