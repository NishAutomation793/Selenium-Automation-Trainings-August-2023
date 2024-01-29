package testNgConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

	@Test
	public void getCurrentUrlTest() {
		String amazonUrl = driver.getCurrentUrl();
		System.out.println("Current Url of Amazon is:" + amazonUrl);
		Assert.assertTrue(amazonUrl.contains("amazon"));

	}

	@Test
	public void getTitleTest() {

		String pageTitle = driver.getTitle();
		System.out.println("Amazon Page title is: " + pageTitle);
		Assert.assertEquals(pageTitle, "Amazon");

	}
}
