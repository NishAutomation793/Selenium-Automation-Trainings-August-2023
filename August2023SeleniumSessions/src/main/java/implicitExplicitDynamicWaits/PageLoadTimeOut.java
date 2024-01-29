package implicitExplicitDynamicWaits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	/**
	 * This is the method which is used to wait for the page to load for sometime
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//Duration d=driver.manage().timeouts().getPageLoadTimeout();
//System.out.println(d.getSeconds());

	
	}

}
