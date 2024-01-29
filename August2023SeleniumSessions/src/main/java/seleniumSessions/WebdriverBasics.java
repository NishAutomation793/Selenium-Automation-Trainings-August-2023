package seleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser) {
		case "chrome":

			driver = new ChromeDriver();
			break;
		case "firefox":

			driver = new FirefoxDriver();

		case "edge":
			driver = new EdgeDriver();

		default:

			System.out.println("Please pass the right browser......");
			break;
		}

		driver.get("https://www.google.com");
		String title = driver.getTitle();

		System.out.println("Title is : "+title);
		
		if (title.equals("Google")) {

			System.out.println("Test Case is passed");
		} else {
			System.out.println("Test Case Failed");
		}

		driver.quit();
	}

}
