package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {

	/**
	 * This class will tell the various use cases for WebTable Pagination Handling
	 * 
	 * @param args
	 */

	static WebDriver driver;
	static int counter = 0;

	public static void main(String[] args) throws InterruptedException {

		// singleSelectionCountry();
		// singleCountrySelectionPaginationConcept("Denmark");

		// wrongCountryNameClick("Name");
		multipleCountrySelectionUseCase("India");

	}

	public static void singleSelectionCountry() throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(3000);

//Use Case 1: When we have the single element to click on the first page of the Table
		List<WebElement> countryList = driver.findElements(By.xpath("//td[text()='Denmark']"));

		if (countryList.size() > 0) {
			elementClickByCountry("Denmark");
		}
	}

	public static void elementClickByCountry(String country) {

		driver.findElement(By.xpath("//td[text()='" + country + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}

	public static void multipleCountriesClick(String country) throws InterruptedException {
		List<WebElement> totalElements = driver
				.findElements(By.xpath("//td[text()='" + country + "']/preceding-sibling::td/input[@type='checkbox']"));

		for (WebElement el : totalElements) {
			el.click();
			Thread.sleep(500);

		}

	}

//Use Case 2: When we have the single element to click but not on the first page of the Table

	public static void singleCountrySelectionPaginationConcept(String country) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(3000);

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='" + country + "']")).size() > 0) {
				System.out.println("The element is on the " + (counter + 1) + " Page");
				elementClickByCountry(country);
				break;

			} else {
				++counter;
				System.out.println("The element is not on the " + counter + " Page");
				WebElement next = driver.findElement(By.linkText("Next"));

				next.click();
				Thread.sleep(2000);

			}

		}

	}

//Use Case 3: When we don't have any country supplied with correct name and its not present in the entire WebTable
	public static void wrongCountryNameClick(String country) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(3000);

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='" + country + "']")).size() > 0) {
				System.out.println("The element is on the " + (counter + 1) + " Page");
				elementClickByCountry(country);
				break;

			} else {
				++counter;
				System.out.println("The element is not on the " + counter + " Page");
				WebElement next = driver.findElement(By.linkText("Next"));

				if (next.getAttribute("class").contains("disabled")) {

					System.out.println("The WebTable search is completed...No Correct Country Found");
					break;
				}

				next.click();
				Thread.sleep(2000);

			}

		}

	}

//Use Case 4: When we multiple countries of same name to be selected on every Page of WebTable
	public static void multipleCountrySelectionUseCase(String country) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(3000);

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='" + country + "']")).size() > 0) {

				System.out.println("The element is on the " + (counter + 1) + " Page");
				multipleCountriesClick(country);

				WebElement next = driver.findElement(By.linkText("Next"));

				if (next.getAttribute("class").contains("disabled")) {

					System.out
							.println("The WebTable search is completed...Page" + (counter + 1) + " was the last Page");
					break;
				}

				next.click();
				Thread.sleep(2000);

			}
			counter++;

		}

	}

}
