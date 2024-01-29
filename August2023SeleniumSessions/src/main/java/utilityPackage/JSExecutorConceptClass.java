package utilityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class will demonstrate different use cases via JS Executor
 */
public class JSExecutorConceptClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		JavaScriptUtil js = new JavaScriptUtil(driver);

	//	driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		js.scrollTillLastOfPage();
//		Thread.sleep(2000);
//		js.scrollTillStartOfPage();
//
//		Thread.sleep(2000);
//
//		js.scrollSomeDown(600);
//
//		Thread.sleep(2000);
//		js.scrollSomePageUp(200);
//		
//		js.scrollTillMiddleOfPage();

		Thread.sleep(2000);

	//WebElement el1=	driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
		
//	js.scrollTillElementVisible(el1);
	
//	Thread.sleep(5000);
//	js.zoomInzoomOut(150);
		
		
	
	//js.drawBorderAroundElement(el1);
		
		driver.get("https://naveenautomationlabs.com/opencart/");
	
	WebElement el2=	driver.findElement(By.linkText("Components"));

	js.flash(el2);
	
	js.horizontalScroll();
	
	
	}

}
