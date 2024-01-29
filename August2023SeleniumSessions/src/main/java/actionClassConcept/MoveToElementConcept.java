package actionClassConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

// MOve to Element use case example :

		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		By contentMenu = By.className("menulink");

		WebElement contentEle = driver.findElement(contentMenu);

		act.moveToElement(contentEle).build().perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.linkText("SINGLE VIDEOS"))).build().perform();

	
		
//		List<WebElement> listContent = driver.findElements(By.xpath("//ul[@class='submenu']//a"));
//
//		System.out.println("The content of list is : ");
//
//		for (WebElement el : listContent) {
//
//			String text = el.getText();
//			System.out.println(text);
//
//			if (text.equalsIgnoreCase("single videos")) {
//				el.click();
//
//			}
//
//		}
//
//		System.out.println("Ttitle of the Page is " + driver.getTitle());

	}

}
