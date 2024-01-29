package testNgConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {


	@Test
	public void getCurrentUrlTest() {

		String googleUrl = driver.getCurrentUrl();
		System.out.println("Current Url of Google is:" + googleUrl);
		Assert.assertTrue(googleUrl.contains("google"));

	}

	@Test
	public void getTitleTest() {

		String pageTitle = driver.getTitle();
		System.out.println("Google Page title is: " + pageTitle);
		Assert.assertEquals(pageTitle, "Google");

	}
}
