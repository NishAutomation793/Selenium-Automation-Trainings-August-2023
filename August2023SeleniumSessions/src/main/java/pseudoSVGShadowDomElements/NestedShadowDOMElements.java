package pseudoSVGShadowDomElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedShadowDOMElements {

/*
 * This is the use case where we have multiple shadow dom for a single element
 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(2000);
		
//Single shadow root element scenario
		
		String text1 ="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")";
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement singleShadowElement=(WebElement) js.executeScript(text1);
		singleShadowElement.sendKeys("This is my name");
		
		
//Multiple shadow root element scenario	
		
		String text2 ="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		WebElement multipleShadowElement=(WebElement) js.executeScript(text2);
		multipleShadowElement.sendKeys("Magaritta is my pizza");

	}

}
