package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class tells how we can fetch all the footer links or the links for the
 * specific section and not from the entire page.
 */
public class FooterLinksCount {
static WebDriver driver;
	
	public static void main(String[] args) {

		BrowserUtil bl=new BrowserUtil();
		driver=bl.launchBrowser("chrome");
		
	//	driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Capturing all the footer links of the Amazon Page
		
//		By footerLinks=By.xpath("//*[@id=\"navFooter\"]//a");
//		
//		ElementUtil ele=new ElementUtil(driver);
//		int count=ele.getElementsCount(footerLinks);
//		System.out.println("Total count of the Footer Links is ==> "+count);
//		
//		
//		List<String> elementsTextList = ele.getElementsTextList(footerLinks);
//		System.out.println("Name of each footer items is "+elementsTextList);
//	
//	
	
		//Capturing all the header links of the Amazon Page.
		
//		By headerLinks =By.xpath("//*[@id=\"nav-xshop\"]//a");
//		ElementUtil ele=new ElementUtil(driver);
//		
//		int count=ele.getElementsCount(headerLinks);
// 		System.out.println("Total count of the Header Links is ==> "+count);
//		List<String> elementsTextList=ele.getElementsTextList(headerLinks);
//		
//     	System.out.println("Name of each header items is "+elementsTextList);
//	
    
		//Capture Links which are available in Right section of Page in Naveen Automation Lab
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By rightWebElementLinks= By.xpath("//*[@id=\"column-right\"]/div/a");
		
		
		ElementUtil ele=new ElementUtil(driver);
		int count=ele.getElementsCount(rightWebElementLinks);
		System.out.println("Total count of the Right Section Links is ==> "+count);
		
		
		List<String> elementsTextList = ele.getElementsTextList(rightWebElementLinks);
		System.out.println("Name of each right section items is "+elementsTextList);
	
		
		
		
		
	}

}
