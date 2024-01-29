package pseudoSVGShadowDomElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameInsideShadowDOMUseCase2 {

	/**
	 * This is the use case where we have iFrame inside the shadow DOM
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

//This is the use case where we have iFrame inside the shadow DOM
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(2000);

		String text = "return document.querySelector(\"#userName\").shadowRoot.querySelector('#pact1')";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement frameElement = (WebElement) js.executeScript(text);

		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		driver.findElement(By.id("glaf")).sendKeys("Destiny");

	}

}
