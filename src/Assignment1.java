import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.Way2Automation.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='load_box']")));
		
		WebElement box = driver.findElement(By.xpath("//div[@id='load_box']"));
		
		List<WebElement> reglist = box.findElements(By.tagName("input"));
		///reglist.get().sendKeys("Priyanka");
		
		String[] formElements = new String[]{"Priyanka", "12345", "pri@gm.com","United States", "Fremont", "pri.kul","welcome#1"};
		
		for(int i=0;i<reglist.size();i++){
			WebElement rl = reglist.get(i);
			System.out.println(rl);
			System.out.println(rl.isDisplayed());
			System.out.println(rl.isEnabled());
			if(i<reglist.size()-1 && rl.isDisplayed() && rl.isEnabled() ){
				rl.sendKeys(formElements[i]);
			}else {
				rl.submit();
			}
			
		}
		
		System.out.println("hi");
		
		//box.findElement(By.name("name")).sendKeys("Priyanka");
		
		
		
		
	driver.quit();
	}

}
