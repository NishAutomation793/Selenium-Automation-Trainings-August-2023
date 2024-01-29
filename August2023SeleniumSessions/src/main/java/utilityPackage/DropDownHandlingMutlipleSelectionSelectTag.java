package utilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingMutlipleSelectionSelectTag {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://html.com/attributes/select-multiple/");

		driver.manage().window().maximize();

		WebElement multipleSelect = driver.findElement(By.xpath("//select"));

		Select select = new Select(multipleSelect);
		List<WebElement> options = select.getOptions();

		for (WebElement e : options) {
			String text = e.getText();

			select.selectByVisibleText(text);

		}

	}

}
