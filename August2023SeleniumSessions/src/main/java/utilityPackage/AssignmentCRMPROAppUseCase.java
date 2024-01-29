package utilityPackage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCRMPROAppUseCase {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);

		driver.findElement(By.linkText("CONTACTS")).click();

		WebElement el = driver.findElement(By.linkText("Joe Root"));

		driver.findElement(RelativeLocator.with(By.xpath("//input[@name='contact_id']")).near(el)).click();

		WebElement select = driver.findElement(By.xpath("//select[@name='do_action']"));

		select.click();

		Select set = new Select(select);

		List<WebElement> options = set.getOptions();

		System.out.println("All dorpdown options are :");

		for (WebElement elm : options) {
			String text = elm.getText();

			System.out.println(text);

		}

		set.selectByValue("SUBSCRIBE");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='DO']")).click();

		Alert al = driver.switchTo().alert();
		System.out.println("The text of alert is :" + al.getText());

		al.accept();
		

	}

}
