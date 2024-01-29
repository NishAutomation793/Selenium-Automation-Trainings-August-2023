package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSingleHandlingSelectTagClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		driver.manage().window().maximize();

//		// 1. First way to select any dropdown element via select class
//		
//		By countryLocator = By.id("Form_getForm_Country");
//		WebElement ele = driver.findElement(countryLocator);
//
//		Select select = new Select(ele);
//		List<WebElement> options = select.getOptions();
//
//		System.out.println("Total size of the list is : " + options.size());
//
//		for (WebElement e : options) {
//
//			System.out.println(e.getText());
//
//			if (e.getText().equals("India"))
//
//			{
//
//				e.click();
//
//			}
//
//		}
//		
//		
		// 2. Second way to select any dropdown element without using select class

		By countryLocator = By.xpath("//select[@id='Form_getForm_Country']/option");

		List<WebElement> findElements = driver.findElements(countryLocator);

		System.out.println("Total size of the list with second approach is : " + findElements.size());

		for (WebElement e : findElements) {

			System.out.println(e.getText());

			if (e.getText().equals("India"))

			{

				e.click();

			}

		}

	}

}
