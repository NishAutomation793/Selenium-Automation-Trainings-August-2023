package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * In this we will be tacking one use of case of static webTable handling from
 * selectors hub page
 */
public class WebTableHandlingPart1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.xpath("//table[@id='resultTable']//tr/td/input[contains(@id,'ohrmList_chkSelectRecord')]"));
		
		for( WebElement ele: elements)
		{
			Thread.sleep(2000);
			ele.click();
			
		}
		
	}

}
