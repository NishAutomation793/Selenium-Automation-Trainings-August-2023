package utilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopupHandling {

	public static void main(String[] args) {

//This class will show how we can handle the basic auth popup by passing the username nad password within url itself

		String username = "admin";
		String password = "admin";

		WebDriver driver = new ChromeDriver();

		driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");


		
	}

}
