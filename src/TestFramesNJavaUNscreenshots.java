import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestFramesNJavaUNscreenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = DriverFactory.getDriverInstance("Chrome");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@id='mySubmit']")));
		//driver.findElement(By.xpath("html/body/button[10]")).click();
		driver.switchTo().defaultContent();
		
		Date d = new Date();
		System.out.println(d);
		String fileName = d.toString().replaceAll(" ", "_").replaceAll(":", "_")+".jpg";
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String userDir = System.getProperty("user.dir");
		FileUtils.copyFile(screenshot, new File(userDir+"\\src\\screenshots\\"+fileName));
		
			
		Thread.sleep(3000);
		driver.quit();
	}

}
