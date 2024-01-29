package actionClassConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * This Class will show some example of Right click/Context Click via Selenium.
 * 
 * Two ways are there where we can perform Right click: 1. Move to Element -->
 * context Click 2. contextClick(WebElement target)
 */
public class ContextClickConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions act = new Actions(driver);

		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));

		// First way to perform context click is :

		// act.contextClick(ele).build().perform();

		// Second Way to perform right click is :

		act.moveToElement(ele).contextClick().build().perform();

		driver.findElement((By.xpath("//span[text()='Cut']"))).click();
		
//		List<WebElement> contextClickMenu = driver
//				.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
//
//		System.out.println("List of Context click menu is :");
//		
//		for (WebElement el : contextClickMenu) {
//
//			String text = el.getText();
//
//			System.out.println(text);
//
//		}

	}

}
