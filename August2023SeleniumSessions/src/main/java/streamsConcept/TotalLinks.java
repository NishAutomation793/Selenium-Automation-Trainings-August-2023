package streamsConcept;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TotalLinks {

		static WebDriver driver;

		public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://www.freshworks.com/");

//			driver.findElements(By.tagName("a"))
//					.stream()
//							.filter(e -> !e.getText().isEmpty())
//								.forEach(e -> System.out.println(e.getText()));
			
			
			List<String> linksList = new ArrayList<String>();//pc=0
			
			
						
						
						List<WebElement> linksAllList= driver.findElements(By.tagName("a"))
												.stream()
														.filter(e -> !e.getText().isEmpty())
																			.collect(Collectors.toList());
						
						linksAllList.forEach(e -> linksList.add(e.getText()));
						System.out.println(linksList);
						
		}

		
	}
	
