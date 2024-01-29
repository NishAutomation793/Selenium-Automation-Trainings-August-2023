package frameConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediFramesConcept {

	/**
	 * This class will tell the nested iFrames concept and its working
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.switchTo().frame("pact1");

		WebElement mainFrameImput = driver.findElement(By.id("inp_val"));
		mainFrameImput.click();
		Thread.sleep(2000);
		mainFrameImput.sendKeys("first crush");

		String textFrame1 = driver.findElement(By.tagName("h3")).getText();
		System.out.println("Text of frame 1 is :" + textFrame1);
		Thread.sleep(2000);

		driver.switchTo().frame("pact2");
		WebElement subFrameImput = driver.findElement(By.id("jex"));
		subFrameImput.click();
		Thread.sleep(2000);
		subFrameImput.sendKeys("second cursh");
		String textFrame2 = driver.findElement(By.tagName("h4")).getText();
		System.out.println("Text of Frame 2  is :" + textFrame2);

		driver.switchTo().frame("pact3");
		WebElement gramChildFrameImput = driver.findElement(By.id("glaf"));
		gramChildFrameImput.click();
		Thread.sleep(2000);

		gramChildFrameImput.sendKeys("destiny");

		Thread.sleep(2000);

		driver.switchTo().parentFrame();
		subFrameImput.click();
		subFrameImput.sendKeys(" updated second cursh");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		mainFrameImput.sendKeys(" updated first cursh");

		driver.switchTo().defaultContent();

		String mainBodyHeaderText = driver.findElement(By.tagName("h3")).getText();

		System.out.println(mainBodyHeaderText);

	}

}
