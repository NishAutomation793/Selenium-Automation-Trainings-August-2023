package actionClassConcept;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardKeyConceptActionClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/");
		
		Actions act = new Actions(driver);

		// Handling single keyboard key using Action Class
		act.sendKeys(Keys.ENTER).build().perform();

		// Handling multiple keyboard key using Action Class

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		// Handling single keyboard key using sendKeys cord
		
		driver.findElement(By.id("")).sendKeys(Keys.ENTER);
		
		// Handling multiple keyboard key using sendKeys cord
		
		driver.findElement(By.id("")).sendKeys(Keys.chord(Keys.ENTER));
		
		
	}

}
