package utilityPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandlesPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
		String parentWindowId = driver.getWindowHandle();

		System.out.println("Parent window url is " + driver.getCurrentUrl());

		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

		Thread.sleep(2000);

		Set<String> allWindows1 = driver.getWindowHandles();

		Iterator<String> it1 = allWindows1.iterator();

		it1.next();
		String childWIndowHandle1 = it1.next();

		driver.switchTo().window(childWIndowHandle1);

		System.out.println("Child window1 url is " + driver.getCurrentUrl());

		driver.close();
		Thread.sleep(1000);

		driver.switchTo().window(parentWindowId);

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

		Set<String> allWindows2 = driver.getWindowHandles();

		Iterator<String> it2 = allWindows2.iterator();

		it2.next();
		String childWIndowHandle2 = it2.next();

		driver.switchTo().window(childWIndowHandle2);

		System.out.println("Child window2 url is " + driver.getCurrentUrl());
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(parentWindowId);

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

		Set<String> allWindows3 = driver.getWindowHandles();

		Iterator<String> it3 = allWindows3.iterator();

		it3.next();

		String childWIndowHandle3 = it3.next();

		driver.switchTo().window(childWIndowHandle3);

		System.out.println("Child window3 url is " + driver.getCurrentUrl());

		driver.close();
		Thread.sleep(1000);

		driver.switchTo().window(parentWindowId);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();

		Set<String> allWindows4 = driver.getWindowHandles();

		Iterator<String> it4 = allWindows4.iterator();

		it4.next();

		String childWIndowHandle4 = it4.next();

		driver.switchTo().window(childWIndowHandle4);

		System.out.println("Child window4 url is " + driver.getCurrentUrl());

		driver.close();

		driver.switchTo().window(parentWindowId);

		Thread.sleep(2000);

	}

}
