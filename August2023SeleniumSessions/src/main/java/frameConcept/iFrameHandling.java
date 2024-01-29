package frameConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandling {

	
/**
 * This class will show use case of frames which uses new tagName as iFrame	
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.formsite.com/templates/education/class-registration-form/");

		driver.findElement(By.cssSelector("#imageTemplateContainer>img")).click();
		
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Nishant Goel");

	}

}
