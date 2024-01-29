package relativeLocatorsConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsUsage {

	/**
	 * This class will demonstrate how to use various relative locator to identify
	 * the webelement
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/uk/dashboard/canada");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement el = driver.findElement(By.linkText("Saint Raymond, Canada"));

		String belowText = driver.findElement(RelativeLocator.with(By.tagName("a")).below(el)).getText();

		System.out.println("Below element text is :" + belowText);

		String rightText = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(el)).getText();
		System.out.println("AQI-US of right element is :" + rightText);

		String leftText = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(el)).getText();
		System.out.println("Rank of left element is :" + leftText);

		String aboveText = driver.findElement(RelativeLocator.with(By.tagName("a")).above(el)).getText();
		System.out.println("Text of above element is :" + aboveText);

		// Finding list of webelements

		List<WebElement> totalElementsAbove = driver.findElements(RelativeLocator.with(By.cssSelector("div#leastPollutedRank>p")).above(el));

		System.out.println("List of all above Cities are :");

		for (WebElement elm : totalElementsAbove) {
			
			if(!(elm.getText().equals("")))
			{
			String text = elm.getText();

			System.out.println(text);

		}
		}

		Thread.sleep(2000);

		List<WebElement> totalElementsBelow = driver.findElements(RelativeLocator.with(By.cssSelector("div#leastPollutedRank>p")).below(el));

		System.out.println("List of all below Cities are :");

		for (WebElement elm : totalElementsBelow) {
			String text = elm.getText();

			System.out.println(text);

		}

	}

}
