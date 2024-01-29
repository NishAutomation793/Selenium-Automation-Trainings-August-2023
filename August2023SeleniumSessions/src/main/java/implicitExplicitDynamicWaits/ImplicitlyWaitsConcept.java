package implicitExplicitDynamicWaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitsConcept {

	/**
	 * This class will show the syntax and uses of Implicitly waits
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//This was earlier used syntax and its deprecated now
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//Latest used syntax is :
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
