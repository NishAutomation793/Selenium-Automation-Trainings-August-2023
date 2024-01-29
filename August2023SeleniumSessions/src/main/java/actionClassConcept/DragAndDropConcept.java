package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement((By.className("demo-frame"))));

		WebElement draggableObj = driver.findElement(By.cssSelector("div#draggable"));

		WebElement droppedObj = driver.findElement(By.cssSelector("div#droppable"));

		Actions act = new Actions(driver);
		// act.clickAndHold(draggableObj).moveToElement(droppedObj).release().build().perform();

		// OR

		act.dragAndDrop(draggableObj, droppedObj).build().perform();

	}

}
