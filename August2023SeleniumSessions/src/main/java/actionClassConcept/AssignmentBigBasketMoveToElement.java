package actionClassConcept;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentBigBasketMoveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		

		List<WebElement> firstMenuItems = driver.findElements(By.xpath(
				"//div[@id='headlessui-menu-items-:R9bab6:']//ul[@class='jsx-1259984711 w-56 px-2.5 bg-darkOnyx-800 text-silverSurfer-100 rounded-l-xs']//a"));

		System.out.println("Size of main list is " + firstMenuItems.size());
		Actions act = new Actions(driver);

		// System.out.println("List of First Menu Item is :");

		for (WebElement el : firstMenuItems) {
			String text = el.getText();

			System.out.println("Main Menu item is :" + text);

			act.moveToElement(el).build().perform();

			List<WebElement> secondMenuItems = driver.findElements(By.xpath(
					"//div[@id='headlessui-menu-items-:R9bab6:']//ul[@class='jsx-1259984711 w-56 px-2.5 bg-silverSurfer-200 text-darkOnyx-800']//a"));

			System.out.println("Size of submenu is " + secondMenuItems.size());

			System.out.println("Sub Menu item List is :");

			for (WebElement el2 : secondMenuItems) {

				String text2 = el2.getText();

				System.out.println(text2);
				act.moveToElement(el2).build().perform();

				List<WebElement> thirdMenuItems = driver.findElements(By.xpath(
						"//div[@id='headlessui-menu-items-:R9bab6:']//ul[@class='jsx-1259984711 w-56 px-2.5 bg-white text-darkOnyx-800 rounded-r-xs']//a"));

				System.out.println("Size of Third Menu is " + thirdMenuItems.size());

				System.out.println("Third Menu item List is :");

				for (WebElement el3 : thirdMenuItems) {

					String text3 = el3.getText();

					System.out.println(text3);
				}
				Thread.sleep(2000);

			}

			Thread.sleep(2000);

		}

	}

}
