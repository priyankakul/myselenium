import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestSlider {
	
	

	public static void main(String[] args) {
		 WebDriver driver = DriverFactory.getDriverInstance("Chrome");
		
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		WebElement bar = driver.findElement(By.xpath("//*[@id='slider']"));
		int width = bar.getSize().width/2;
		System.out.println(width);
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slider, width, 0).perform();
		
		
		//driver.close();
		
		 
		////*[@id="slider"]

	}

}
