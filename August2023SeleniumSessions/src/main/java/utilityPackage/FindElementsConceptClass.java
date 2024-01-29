package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConceptClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		// Fetching count of total text field on a particular page
//
//		List<WebElement> list = driver.findElements(By.className("form-control"));
//
//		System.out.println(list.size());
//		
//		//For finding total number of links available on Page along with the text
//		//but ignore the blank text links	
//		
//		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
//		
//		System.out.println(totalLinks.size());
//		
//		for( int i=0; i<totalLinks.size(); i++)
//		{
//			String linkText=totalLinks.get(i).getText();
//			
//			if(linkText.length()!=0)
//			{
//			System.out.println(linkText);
//		}
//		}
//		
//		//For finding total number of images available on Page along with the attribute values
//	

		driver.get("https://www.amazon.in/");

		List<WebElement> totalImages = driver.findElements(By.tagName("img"));

		System.out.println("Total Images on Amazon Site is " + totalImages.size());

		for (int i = 0; i < totalImages.size(); i++) 
		
		{
			System.out.println("ALT value is " + totalImages.get(i).getAttribute("alt"));
			System.out.println("SRC value is " + totalImages.get(i).getAttribute("src"));

		}

	}
}
