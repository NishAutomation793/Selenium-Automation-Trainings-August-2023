package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This is another example of handling the static web table and fetching the
 * data
 */
public class WebTableHandlingPart2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> list1 = driver.findElements(By.xpath("//table[@id='customers']//tr/td[1]"));

		System.out.println("Total count of the list1 is " + list1.size());
		System.out.println("*********************");

		for (WebElement el : list1) {

			System.out.println(el.getText());

		}

		List<WebElement> list2 = driver.findElements(By.xpath("//table[@id='customers']//tr/td[2]"));

		System.out.println("Total count of the list2 is " + list2.size());
		System.out.println("*********************");

		for (WebElement el : list2) {

			System.out.println(el.getText());

		}

		List<WebElement> list3 = driver.findElements(By.xpath("//table[@id='customers']//tr/td[3]"));

		System.out.println("Total count of the list3 is " + list3.size());
		System.out.println("*********************");

		for (WebElement el : list3) {

			System.out.println(el.getText());

		}
		
		//To find out the header name of any column value:
	
	String header1Value=	driver.findElement(By.xpath("//table[@id='customers']//tr/td[text()='Alfreds Futterkiste']/parent::tr/preceding-sibling::tr/th[1]")).getText();
		
	System.out.println("Header1 value of the column is : "+header1Value);

	}

}
