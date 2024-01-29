package utilityPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CarouselScrollingHandling {

	/**
	 * This class will demonstrate use case related with product scrolling
	 * horizontally inside e-commerce applications Applications include : Amazon.in,
	 * flipkart, noon.com
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		ElementUtil ut = new ElementUtil(driver);
		driver.get("https://noon.com/uae-en/");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
		By header = By.xpath("//h2[text()='Recommended for you']");

		ut.waitPresenceofElement(header, 5);

		List<WebElement> recommendedList = driver.findElements(By.xpath(
				"//h2[text()='Recommended for you']/ancestor::div[@class='sc-dAlyuH hNlDMy']/following-sibling::div[@class='sc-dJiZtA cLlfhL']//div[contains(@class,'cSMXOH')]/div[@data-qa='product-name']"));
		System.out.println("Total list size is " + recommendedList.size());

		By nextButtonCarousel = By.xpath(
				"//h2[text()='Recommended for you']/ancestor::div[@class='sc-dAlyuH hNlDMy']/following-sibling::div[@class='sc-dJiZtA cLlfhL']/div[contains(@class,'swiper-button-next')]");

		ArrayList<String> totalList = new ArrayList<String>();
		while (!driver.findElement(nextButtonCarousel).getAttribute("class").contains("disabled")) {

// Here everytime carousle is clicked everytime 37 elements will be added to the list since it is adding 37 elements each time due to the xpath we created
			for (WebElement el : recommendedList) {
				String text = el.getAttribute("title");
				if (!totalList.contains(text)) // to add uniques elements
				{
					totalList.add(text);
				}

			}

			driver.findElement(nextButtonCarousel).click(); //Carousel is getting clicked
			Thread.sleep(1000);

		}

		for (String st : totalList) {

			System.out.println("Recommended List Contains: " + st);

		}

	}

}
