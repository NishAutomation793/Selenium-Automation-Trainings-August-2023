package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {
	
	/**
	 * Here in this class we are actually getting the attribute value
	 * by locating a particular Web Element. We will also be fetching 
	 * placeholder value of that element if it exists.
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailId=By.id("input-email");
		//For getting the placeholder Value of that element.
		
		WebElement placeholderValue= driver.findElement(emailId);
		String placeValue=placeholderValue.getAttribute("placeholder");
		System.out.println(placeValue);
		
		//For finding any other attribute value of webelement.
		
		String nameAttributeValue=driver.findElement(By.id("input-password")).getAttribute("name");
		System.out.println(nameAttributeValue);
		
		//Fetching and capturing the text which is entered by user in text field.
		
	driver.findElement(By.id("input-email")).sendKeys("nishant@123.gmail.com");
		
	String textName= driver.findElement(By.id("input-email")).getAttribute("value");
	
	System.out.println(textName);
	
	}
}