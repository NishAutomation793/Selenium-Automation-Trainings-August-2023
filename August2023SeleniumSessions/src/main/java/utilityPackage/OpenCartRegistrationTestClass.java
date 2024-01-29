package utilityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartRegistrationTestClass {

	public static void main(String[] args) {

		BrowserUtil bul = new BrowserUtil();

		WebDriver driver = bul.launchBrowser("chrome");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String title = driver.getTitle();
		System.out.println("The title of the page is : " + title);

		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By conPassword = By.id("input-confirm");

		ElementUtil el = new ElementUtil(driver);

		el.doSendKeys(fName, "Nishant");
		el.doSendKeys(lName, "Mheta");
		el.doSendKeys(phone, "9898765673");
		el.doSendKeys(email, "nish@gmail.com");
		el.doSendKeys(password, "Nish@123");
		el.doSendKeys(conPassword, "Nish@123");

		bul.quitBrowser();

	}

}
