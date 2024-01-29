package pseudoSVGShadowDomElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {

	/**
	 * These are the elements which can't be checked via selenium hence we need to
	 * use JavascriptExecutor for it Pseudo Elements are written in pseudo classes
	 * like --> ::before, ::after These elements are used to mark an element as
	 * mandatory like "*" Pseudo Elements have there separate Color, content and
	 * other fields
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-confirm']\"),'::before').getPropertyValue('content');";

		String mainText=js.executeScript(script).toString();
		
		System.out.println("The text of pseudo element is: "+mainText);
		
	}

}
