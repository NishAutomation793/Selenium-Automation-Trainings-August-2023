package pseudoSVGShadowDomElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentSVGElementHandle {

	static Actions act;

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		Robot robot = new Robot();

		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		String xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";

		List<WebElement> totalStates = driver.findElements(By.xpath(xpath));

		System.out.println("Total states in the map is : " + totalStates.size());

		for (WebElement el : totalStates) {

			act = new Actions(driver);

			act.moveToElement(el).build().perform();

			Thread.sleep(5000);
			act.click(el).build().perform();

			Thread.sleep(3000);
						
			System.out.println("Title of the page is :" + driver.getTitle());
			String subRegionScript = "//*[name()='g' and @class='subregion']//*[name()='path']";

			List<WebElement> subRegions = driver.findElements(By.xpath(subRegionScript));

			System.out.println("SubRegions size is " + subRegions.size());
			for (WebElement el2 : subRegions) {
				act.moveToElement(el2).build().perform();
			   // Thread.sleep(1000);
			    
			    String subRegionText=el2.getAttribute("name");
			    System.out.println(subRegionText);
			    
			}	
			
		}
	}
}