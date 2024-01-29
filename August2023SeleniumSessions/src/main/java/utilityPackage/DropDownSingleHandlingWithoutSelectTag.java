package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class contains use cases of selection of single dropdown element which
 * doesn't have any select tag present
 */
public class DropDownSingleHandlingWithoutSelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectmenu/");

		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Thread.sleep(2000);

// 1. Get all the Speed value and select a specific value from that.

		// Need to click the element first to get all the dropdown list
		driver.findElement(By.id("speed-button")).click();

		List<WebElement> speedEle = driver.findElements(By.xpath("//ul[@id='speed-menu']/li"));

		System.out.println("Speed Of all Elements are:");

		for (WebElement ele : speedEle) {
			String text = ele.getText();
			System.out.println(text);

			if (text.equalsIgnoreCase("Faster"))

			{

				ele.click();
			}
		}

// 2. Get all the file value and select a specific value from that.

		Thread.sleep(2000);

		driver.findElement(By.id("files-button")).click();

		List<WebElement> fileEle = driver.findElements(By.xpath("//ul[@id='files-menu']/li"));

		System.out.println("*******************************");

		System.out.println("Name Of all files are:");

		for (WebElement ele : fileEle) {
			String text = ele.getText();
			System.out.println(text);

			if (text.equalsIgnoreCase("Some other file with a very long option text"))

			{

				ele.click();
			}
		}

// 3. Get all the title value and select a specific value from that.

		Thread.sleep(2000);

		driver.findElement(By.id("salutation-button")).click();

		List<WebElement> titleEle = driver.findElements(By.xpath("//ul[@id='salutation-menu']/li/div"));

		System.out.println("*******************************");

		System.out.println("Name Of all title are:");

		for (WebElement ele : titleEle) {
			String text = ele.getText();
			System.out.println(text);

			if (text.equalsIgnoreCase("other"))

			{

				ele.click();
			}
		}

// 4. Get all the number value and select a specific value from that.

		Thread.sleep(2000);

		driver.findElement(By.id("number-button")).click();

		List<WebElement> numberEle = driver.findElements(By.cssSelector("ul#number-menu>li>div"));

		System.out.println("*******************************");

		System.out.println("Name Of all numbers are:");

		for (WebElement ele : numberEle) {
			String text = ele.getText();
			System.out.println(text);

			if (text.equalsIgnoreCase("19"))

			{

				ele.click();
				break;
			}
		}

	}

}
