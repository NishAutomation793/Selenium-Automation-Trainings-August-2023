package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandlingMultipleSelectionJqueryHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.manage().window().maximize();

//Multiple Selection w/o using select class		

		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();

		Thread.sleep(2000);

		List<WebElement> listOptions = driver.findElements(
				By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]/ul//span[@class='comboTreeItemTitle']"));

		System.out.println("Size of the element list is " + listOptions.size());

		System.out.println("Name of Multi Selection is :");

		for (WebElement ele : listOptions) {

			String text = ele.getText();
			System.out.println(text);

			ele.click();
		}

		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();

// Multi Selection With Cascade Option Select

		driver.findElement(By.xpath("//input[@id='justAnInputBox1']")).click();

		List<WebElement> multipleList = driver.findElements(
				By.xpath("(//div[@class='comboTreeDropDownContainer'])[2]/ul/li/span[@class='comboTreeItemTitle']"));

		System.out.println("Size of the element list is " + multipleList.size());

		System.out.println("Name of Multi Selection With Cascade Option Select is :");

		for (WebElement ele : multipleList) {

			String text = ele.getText();
			System.out.println(text);

			ele.click();

		}
		driver.findElement(By.xpath("//input[@id='justAnInputBox1']")).click();

// Single Selection :
		driver.findElement(By.xpath("//input[@id='justAnotherInputBox']")).click();

		List<WebElement> singleSelect = driver.findElements(By.xpath("\"(//div[@class='comboTreeDropDownContainer'])[3]/ul//span[@class='comboTreeItemTitle']\""));

		System.out.println("Size of the element list is " + singleSelect.size());

		System.out.println("Name of Single Select are :");

		for (WebElement ele : singleSelect) {

			String text = ele.getText();
			System.out.println(text);

			if (text.equalsIgnoreCase("choice 7"))
				ele.click();

		}

	}

}
