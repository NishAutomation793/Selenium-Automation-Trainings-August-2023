package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMoveByOffset {

	
/**
 * This class will demonstrate example how to slide the slider left or right	
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/slider/");

		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement slider=driver.findElement(By.cssSelector("div#slider"));

		//Scrolling driver left and right ( Horizontally)
		int widthSlider=slider.getSize().getWidth();
		int heightSlider=slider.getSize().getHeight();
		System.out.println("Width of slider is "+widthSlider);
		System.out.println("Height of slider is "+heightSlider);
		
		Actions act=new Actions(driver);
		act.clickAndHold(slider).moveByOffset(-500,0).build().perform();

		
		//Scrolling driver up and down ( Vertically)
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://jqueryui.com/slider/#slider-vertical");
        
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement sliderVertical=driver.findElement(By.cssSelector("div#slider-vertical"));
		
		int widthSliderVetical=sliderVertical.getSize().getWidth();
		int heightSliderVertical=sliderVertical.getSize().getHeight();
		System.out.println("Width of Vertical slider is "+widthSliderVetical);
		System.out.println("Height of Vertical slider is "+heightSliderVertical);
		
		Actions act2=new Actions(driver);
		act2.clickAndHold(sliderVertical).moveByOffset(heightSliderVertical,0).build().perform();
	}

}
