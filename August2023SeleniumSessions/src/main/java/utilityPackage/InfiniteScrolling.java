package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteScrolling {

	static JavaScriptUtil ju;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.awwwards.com/websites/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		long totalHeight = (long) js.executeScript("return document.body.scrollHeight");
		ju = new JavaScriptUtil(driver);

		while (true) {
			
			List<WebElement> elements = driver.findElements(By.xpath("//img"));
			
			for(WebElement el:elements)
			{
				String text=el.getAttribute("alt");
				
				System.out.println("Alt value is: "+text);
			}
			
			ju.scrollTillLastOfPage();
			Thread.sleep(2000);

			long currentHeight = (long) js.executeScript("return document.body.scrollHeight");

			if (totalHeight == currentHeight) {
				System.out.println("Infinite scrolling is done...");
				break;
			}

			totalHeight = currentHeight;

		}

	}

}
