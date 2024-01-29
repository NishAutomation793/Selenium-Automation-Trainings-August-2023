package frameConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingOldTagName {

	/**
	 * This calss we will show the example where Old Frame Tag is used
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/");

		driver.switchTo().frame("navbar");

		String text = driver.findElement(By.tagName("h3")).getText();

		System.out.println(text);

	}

}
