package pseudoSVGShadowDomElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMInsideiFrame {

/**
 * It will handle use case of Shadow DOM inside the iFrame	
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(2000);
		
// Use Case 1: Only 1 shadow DOM inside the iFrame
		
		driver.switchTo().frame("pact");
		
		String singleDomElement="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement singleShadowElement=(WebElement) js.executeScript(singleDomElement);
		singleShadowElement.sendKeys("I am inside single Shadow DOM in iFrame");
		
//Use Case2: Multiple shadow DOM inside the iFrame		
		
		String multiDomElement="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		JavascriptExecutor js2=(JavascriptExecutor)driver; //Giving HTML element
		WebElement multiShadowElement=(WebElement) js2.executeScript(multiDomElement);
		multiShadowElement.sendKeys("I am inside multi Shadow DOM in iFrame");
		
		
	}

}
