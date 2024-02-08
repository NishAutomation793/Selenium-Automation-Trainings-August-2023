package calendarHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * For calendar Handling we need to look into three things 1. The day/date that
 * we have to select as to how we can locate it 2. We have to locate the next
 * and previous buttons to navigate for months and year 3. while condition till
 * our expected month year is achieved 4. Part of optimization : Need to handle
 * multiple negative scenarios
 */

public class UseCase1MukeshOtwaniCalendar {

	static WebDriver driver;
	static List<String> st = new ArrayList<String>(Arrays.asList("April", "June", "September", "November"));

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		selectCalendarFutureDate("February 2024",0);

	}

	public static void selectCalendarFutureDate(String monthYear, int day) {

		driver.findElement(By.id("datepicker")).click();

		String currentMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		String month = monthYear.split(" ")[0];
		int year = Integer.parseInt(monthYear.split(" ")[1]);

		System.out.println("Year is:" + year);
		System.out.println("Month is:" + month);

		while (!currentMonthYear.equalsIgnoreCase(monthYear)) {
			driver.findElement(By.linkText("Next")).click();
			currentMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			if (monthYear.contains("April") || monthYear.contains("June") || monthYear.contains("September")
					|| monthYear.contains("November") && day > 30) 
			{
				System.out.println("Kindly Enter Correct Day for Respective Months:" + monthYear);
			}
			
			if (!((monthYear.contains("April") || monthYear.contains("June")
					|| monthYear.contains("September") || monthYear.contains("November")))) {
				
				if(day > 31 || day <= 0)
				{
				
				System.out.println("Days Can't be Greater than 31 or Less/Equal then zero");
				break;
			}
			}

			if (year % 4 != 0 && monthYear.contains("February") && day>28) {
				
					System.out.println("Check Year is Not leap..Please enter day less or equal to 28");
					break;
			
			}

			if (year % 4 == 0 && monthYear.contains("February") && day>29) 
			{

				System.out.println("Kindly check the values for leap year");
				break;

			}

		}

		// driver.findElement(By.xpath("//a[text()='"+day+"']")).click();

	}
	
	public static void selectCalendarPreviousDate(String monthYear, int day) {

		driver.findElement(By.id("datepicker")).click();

		String currentMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		String month = monthYear.split(" ")[0];
		int year = Integer.parseInt(monthYear.split(" ")[1]);

		System.out.println("Year is:" + year);
		System.out.println("Month is:" + month);

		while (!currentMonthYear.equalsIgnoreCase(monthYear)) {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			currentMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			if (monthYear.contains("April") || monthYear.contains("June") || monthYear.contains("September")
					|| monthYear.contains("November") && day > 30) 
			{
				System.out.println("Kindly Enter Correct Day for Respective Months:" + monthYear);
			}
			
			if (!((monthYear.contains("April") || monthYear.contains("June")
					|| monthYear.contains("September") || monthYear.contains("November")))) {
				
				if(day > 31 || day <= 0)
				{
				
				System.out.println("Days Can't be Greater than 31 or Less/Equal then zero");
				break;
			}
			}

			if (year % 4 != 0 && monthYear.contains("February") && day>28) {
				
					System.out.println("Check Year is Not leap..Please enter day less or equal to 28");
					break;
			
			}

			if (year % 4 == 0 && monthYear.contains("February") && day>29) 
			{

				System.out.println("Kindly check the values for leap year");
				break;

			}

		}

		// driver.findElement(By.xpath("//a[text()='"+day+"']")).click();

	}
	}
