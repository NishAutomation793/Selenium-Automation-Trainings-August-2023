package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {


WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
	
		//1. Handling all the header items of the Flipkart app
		
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/a"));
//	
//		System.out.println("Total size of the list is " +elements.size());
//		
//		for ( WebElement el : elements)
//		{
//			
//			System.out.println(el.getText());
//		}
		
		
		//2. Handling all the sub-footer items of the Flipkart app
		
		
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='-qLUdm']//div[@class='_3xGbi-']/a"));
//		
//		System.out.println("Total size of the list is " +elements.size());
//		
//		for ( WebElement el : elements)
//		{
//			
//			System.out.println(el.getText());
//		}
//		
		
//		//3. Handling all the footer items OF any specific header of the Flipkart app
//		
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_3I5N7v' and text()='ABOUT']/following-sibling::a"));
//		
//		System.out.println("Total size of the list is " +elements.size());
//		
//		for ( WebElement el : elements)
//		{
//			
//			System.out.println(el.getText());
//		}
//		
		
//		//4. Handling all the footer items of the Flipkart app except Mail us and Current Office Address
//		
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_1ZMrY_']/div/a"));
//		
//		System.out.println("Total size of the list is " +elements.size());
//		
//		for ( WebElement el : elements)
//		{
//			
//			System.out.println(el.getText());
//		}
//		
		
		//5. Handling all the footer items of the Flipkart app
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_1ZMrY_']/div"));
		
		System.out.println("Total size of the list is " +elements.size());
		
		for ( WebElement el : elements)
		{
			
			System.out.println(el.getText());
		}
		
	
	}

}
