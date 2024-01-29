package utilityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingCSSPropertyOfElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
		
		WebElement el=driver.findElement(By.xpath("//input[@type='submit']"));
		
		System.out.println(el.getCssValue("backgroundColor"));
		
		Rectangle rect = el.getRect();
		
		System.out.println("Height of the element is: "+rect.getHeight());
		System.out.println("Height of the element is: "+rect.getWidth());
	
		System.out.println("X coordinate of the element is: "+rect.getX());
		System.out.println("Y coordinate of the element is: "+rect.getY());

		
		
	}

}
