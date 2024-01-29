package utilityPackage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class is about fetching all the Google Language Links present on Google
 * Home Page
 */
public class GoogleLanguageLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
		
		for(WebElement ele:findElements )
			
		{		System.out.println(ele.getText());
		
		if(ele.getText().equals("తెలుగు"))
				{
			ele.click();
			
			System.out.println("Title of the page with తెలుగు language is "+driver.getTitle());
		break;
				}
		}
		
	}

}
