import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsElementPresent {
	public static  WebDriver driver;
	public static boolean isElementPresent(String locator){
		
		/*try{
		driver.findElement(By.id(locator));
		
		return true;
		}catch (Throwable t){
			return false;
		}*/
		int lst = driver.findElements(By.xpath(locator)).size();
		 if(lst > 0){
			 return true;
		 }else return false;
		
		
		
	}

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//WebElement uid = driver.findElement(By.id("identifierId11"));
		//uid.sendKeys("Priyanka");
		System.out.println(isElementPresent("identifierId"));
		
		
		

	}

}
