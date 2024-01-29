package utilityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTestClass {

	public static void main(String[] args) {

		BrowserUtil bul = new BrowserUtil();

		WebDriver driver = bul.launchBrowser("chrome");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String title = driver.getTitle();
		System.out.println("The title of the page is : " + title);

		By eid = By.id("input-email");
		By pwd = By.id("input-password");
		
		By loginBtn= By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

		ElementUtil el = new ElementUtil(driver);
		el.doSendKeys(eid, "nishant@gmail.com");

		el.doSendKeys(pwd, "nishant123");
		el.doClick(loginBtn);

		bul.quitBrowser();
	}

}
