import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class TestKeyboardf {

	public static void main(String[] args) {
		
		WebDriver driver = DriverFactory.getDriverInstance("Chrome");
		driver.get("http://gmail.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("trainer@way2automation.com");
		
		driver.findElement(By.xpath("//*[@id='initialView']/div[2]")).click();
	/*	driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(Keys.ENTER);
		*/
		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN);
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		driver.findElement(By.xpath("//*[@id='identifierId']")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();

	}

}
