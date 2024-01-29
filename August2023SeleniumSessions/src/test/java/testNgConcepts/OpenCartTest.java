package testNgConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {

	@Test
	public void getCurrentUrlTest() {
		String openCartURL = driver.getCurrentUrl();
		System.out.println("Current Url of OpenCart is:" + openCartURL);
		Assert.assertTrue(openCartURL.contains("naveenautomationlabs"));

	}

	@Test
	public void getTitleTest() {

		String pageTitle = driver.getTitle();
		System.out.println("OpenCart Page title is: " + pageTitle);
		Assert.assertEquals(pageTitle, "Account Login");

	}

}
