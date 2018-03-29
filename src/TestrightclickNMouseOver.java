import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestrightclickNMouseOver {

	public static void main(String[] args) {
		WebDriver driver = DriverFactory.getDriverInstance("FireFox");
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement img = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		WebElement prod = driver.findElement(By.id("dm2m1i1tdT"));
		Actions action = new Actions(driver);
		action.contextClick(img).perform();
		//action.moveToElement(prod).perform();
		

	}

}
