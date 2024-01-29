package pseudoSVGShadowDomElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElementHandleUseCase1 {

	/*
	 * This class will showcase the normal use case as how to handle the shadow dow
	 * element
	 * This is also an example of nested shadow DOMs
	 */
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("chrome://settings/");

//This complete string is the JS script copied directly from the DOM		
		String searchBar = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";

		JavascriptExecutor js = (JavascriptExecutor) driver;

// This is actually returning the HTML element which jas can understand but not the selenium
//We have to convert the HTML element into the WebElement so that Selenium can understand.
		WebElement el = (WebElement) js.executeScript(searchBar);

		el.sendKeys("notifications");

	}

}
