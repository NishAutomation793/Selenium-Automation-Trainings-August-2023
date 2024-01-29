package utilityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadHandlingSelenium {

	public static void main(String[] args) {

//This is the use case when we want to upload a file but with selenium only and 
//that too we can do when we have a type of file type only as below

		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		driver.findElement(By.name("upfile")).sendKeys(
				"C:\\Users\\nishant.k.goel\\Downloads\\Ready - Engineering Jira 2023-12-19T00_07_17-0500.csv");

	}

}
