package pseudoSVGShadowDomElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentShadowDOMHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://books-pwakit.appspot.com/");
		Thread.sleep(2000);
		
		
		String bookText="return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement singleShadowElement=(WebElement) js.executeScript(bookText);
		singleShadowElement.sendKeys("Poor Dad Rich Dad is my book");
		
	}

}
