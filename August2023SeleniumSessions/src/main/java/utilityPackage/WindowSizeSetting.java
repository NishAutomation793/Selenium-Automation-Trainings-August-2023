package utilityPackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizeSetting {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");

//		Dimension d = new Dimension(400, 400);
//		driver.manage().window().setSize(d);
		
		driver.manage().window().fullscreen();
	}

}
