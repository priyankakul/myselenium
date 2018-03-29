import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getLucky {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://http://durga.site/getLucky");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='load_box']")));
		Thread.sleep(1000);
		
		WebElement dt = driver.findElement(By.id("dd"));
		
		dt.sendKeys("02");
		
		WebElement mn = driver.findElement(By.id("mn"));
		mn.sendKeys("02");
		
		WebElement yr = driver.findElement(By.id("yy"));
		yr.sendKeys("2002");
	}

}
