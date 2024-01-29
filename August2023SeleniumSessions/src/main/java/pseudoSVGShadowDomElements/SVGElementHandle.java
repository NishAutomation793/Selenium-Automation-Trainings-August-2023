package pseudoSVGShadowDomElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementHandle {

	/**
	 * SVG elements are called as Scaler Vector Graphs which represent some sort of
	 * image, logo, searchImage The SVG element can't be handled via CSS selector
	 * These elements can be identified with <svg> tag These elements are handled
	 * via xpath Syntax :- Special Xpaths sytax is used We have to use
	 * local-name()='svg' for identifying the svg element and then it can be used
	 * with other attributes Entire xpath :-> //*[local-name()='svg' and
	 * attrName2='value'] If we have any child tag under svg tag then we have to use
	 * special function as :-> //*[name()='tagName']
	 * 
	 * Entire xpath for parent and child will be as : //*[local-name()='svg' and
	 * attrName2='value']//*[name()='g']
	 * 
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		String xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";

		List<WebElement> totalStates = driver.findElements(By.xpath(xpath));

		System.out.println("Total states in the map is : "+totalStates.size());
		
		System.out.println("All states name in this map are :");
		
		Actions act=new Actions(driver);
	
		
		for (WebElement el : totalStates) {
			
			act.moveToElement(el).build().perform();
			
			Thread.sleep(1000);

			String mapText=el.getAttribute("id");
			
			System.out.println(mapText);
			
			if(mapText.equals("indiana"))
			{
				
				el.click();
				break;
			}
			
		}
	}

}
