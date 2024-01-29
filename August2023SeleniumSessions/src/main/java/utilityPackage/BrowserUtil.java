package utilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class is created to have multiple generic methods to handle the
 * different browser actions.
 */
public class BrowserUtil {

	private WebDriver driver; // Creating a ref_variable at global level of WebDriver class. Making it private
								// so that this ref can't be used anywhere outside this class.

	/**
	 * 
	 * @param browserName
	 * @return : This method is returning the instance of WebDriver
	 */
	public WebDriver launchBrowser(String browserName) {

		System.out.println("Browser Name is " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":

			driver = new FirefoxDriver();
		case "edge":
			driver = new EdgeDriver();

		default:

			System.out.println("Please pass the right browser......");

			throw new UserCustomException("INVALID BROWSER : " + browserName);

		}
		return driver;
	}

	public void getURL(String urlName) {
		if (urlName == null) {

			System.out.println("URL you are trying to reach is NULL");
			throw new UserCustomException("NULL URL");
		}

		else if (urlName.indexOf("http") == 0) {

			System.out.println("URL Is correct launching the same");
			driver.get(urlName);
		}

		else {
			throw new UserCustomException("Incorrect HTTP Protocol");

		}
	}

	public String getPageTitle() {
		String title = driver.getTitle();

		System.out.println("Page Title is " + title);
		return title;

	}

	public String getPageUrl() {

		String pageUrl = driver.getCurrentUrl();
		System.out.println("Current Page URL is " + pageUrl);
		return pageUrl;
	}

	public boolean getPageSource(String value) {

		String pageSource = driver.getPageSource();
		if (pageSource.contains(value)) {

			return true;
		}
		return false;

	}

	public void closeBrowser() {

		driver.close();
		System.out.println("Browser is closed");
	}

	public void quitBrowser() {

		driver.quit();
		System.out.println("Browser is closed");
	}

}
