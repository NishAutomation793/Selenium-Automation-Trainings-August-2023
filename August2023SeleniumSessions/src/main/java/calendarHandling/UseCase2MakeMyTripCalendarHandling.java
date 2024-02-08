package calendarHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseCase2MakeMyTripCalendarHandling {
	static WebDriver driver;
	static WebElement nextMonthArrow;

	public static void main(String[] args) throws InterruptedException {

		// In previous Month arrow key we have a class attribute with value contains as
		// disabled

		driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='departure']")).click();

		//selectCalendarDateSimpleApproach("January 2025", 17);
		
		checkandPrintAllActiveMonthsPricewithDates();

	}

	/**
	 * This is method is simply designed to call the method in main method and just
	 * directly put the month year and the day value to be selected
	 * 
	 * @param monthYear
	 * @param day
	 */
	public static void selectCalendarDateSimpleApproach(String monthYear, int day) {
		// WebElement
		// previousMonthArrow=driver.findElement(By.xpath("//span[@aria-label='Next
		// Month']"));
		WebElement leftMonthYearElement = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
		String leftMonth = leftMonthYearElement.getText();
		// WebElement
		// rightMonthYearElement=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]"));

		while (!leftMonth.equalsIgnoreCase(monthYear)) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			leftMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		}

		driver.findElement(By.xpath("(//div[@class=\"DayPicker-Day\"]//p[text()='" + day + "'])[1]")).click();

	}

	public static void checkandPrintAllActiveMonthsPricewithDates()
	{
		WebElement rightMonthArrowElement = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
		String classAttribute=rightMonthArrowElement.getAttribute("class");
		
		while(!classAttribute.contains("interactionDisabled"))
		{
			String MonthYearText=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
			System.out.println(MonthYearText);
			
			List<WebElement> weekDaysEle = driver.findElements(By.xpath("(//div[@class=\"DayPicker-Month\"])[1]//div[@class='DayPicker-Weekday']/abbr"));
			
			for(WebElement el:weekDaysEle)
			{
				System.out.println(el.getAttribute("title"));
				
			}
			List<WebElement> pricewithDate = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Week']//p"));

			for(WebElement el:pricewithDate)
			{
				System.out.println(el.getText());
			}
			
			
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

//Here below line will make sure that every time next classAttribute will be picked for comparision	in while loop		
			classAttribute=driver.findElement(By.xpath("//span[@aria-label='Next Month']")).getAttribute("class");
		}
		
	}
	
}
