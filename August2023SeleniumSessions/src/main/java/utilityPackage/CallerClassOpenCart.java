package utilityPackage;

public class CallerClassOpenCart {

	public static void main(String[] args) {

		BrowserUtil bu = new BrowserUtil();
		bu.launchBrowser("chrome");
		bu.getURL("https://naveenautomationlabs.com/opencart/");

		String actualTitle = bu.getPageTitle();

		if (actualTitle.equals("Your Store")) {

			System.out.println("Title is correct - Case Passed");
		} else {
			System.out.println("Title is incorrect :" + "Case Fail");
		}

		String actualUrl=bu.getPageUrl();
		if(actualUrl.contains("opencart"))
		{
			System.out.println("Page url is correct " +"- Case passed");
			
		}
		else
		{
			
			System.out.println("Page title is incorrect : "+ "Case failed");
		}

		bu.quitBrowser();
	}

}
