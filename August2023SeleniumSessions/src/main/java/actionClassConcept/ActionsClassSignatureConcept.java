package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassSignatureConcept {

	
/**
 * This class will show example how to 	
 * @param args
 */
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/");

		driver.manage().window().maximize();
		
		WebElement el=driver.findElement(By.id("signature-pad"));
		
		Actions act =new Actions(driver);
		
		act.clickAndHold(el).moveByOffset(40,20).moveByOffset(40,20).moveByOffset(40,20).moveByOffset(40,20).moveByOffset(-10,-60).moveByOffset(-90,-50).moveByOffset(-60,-40).build().perform();
		
		
	}

}
