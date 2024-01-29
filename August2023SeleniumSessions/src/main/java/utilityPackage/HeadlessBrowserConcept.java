package utilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserConcept {

	public static void main(String[] args) {

		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(ch);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("The title of the Page is: "+driver.getTitle());

		
	}

}
