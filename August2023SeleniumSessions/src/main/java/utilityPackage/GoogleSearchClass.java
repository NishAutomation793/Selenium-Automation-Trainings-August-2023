package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil vl = new BrowserUtil();
		driver = vl.launchBrowser("chrome");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		By searchBox = By.xpath("//*[@id=\"APjFqb\"]");

		By suggestionBox = By.xpath("//*[@id=\"Alh6id\"]//li");
		ElementUtil el = new ElementUtil(driver);

		el.googleSearchSuggestion(searchBox, "Selenium Automation", suggestionBox,
				"selenium automation testing tutorial");

//		googleSearch.sendKeys("Selenium Automation");
//		Thread.sleep(5000);
//
//		List<WebElement> listElements = driver.findElements(By.xpath("//*[@id=\"Alh6id\"]//li"));
//
//		System.out.println("Total count of the list is " + listElements.size());
//		for (WebElement e : listElements) {
//			
//			String text=e.getText();
//			System.out.println("Entire List after Searching is :" + text);
//
//			if(text.equalsIgnoreCase("selenium automation testing tutorial"))
//			
//			{
//				
//				e.click();
//				break;
//			}
//			
//		}
	}

}
