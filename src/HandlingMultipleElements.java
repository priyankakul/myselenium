import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
	public static WebDriver driver;
	
	public static boolean isElementPesent(String locator){
		
		int size = driver.findElements(By.xpath(locator)).size();
		
		if(size>0){
			return true;
		
		}else return false;
	}

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://odyniec.net/articles/multiple-select-fields/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		/*for(int i =1; i<=4; i++){
			
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/input["+i+"]")).click();
		
		}*/
		int i=1 ;
		int count=0;
		
		//while(IsElementPresent.isElementPresent("/html[1]/body[1]/div[1]/div[2]/div[1]/input["+i+"]")){
			while(isElementPesent("/html[1]/body[1]/div[1]/div[2]/div[1]/input["+i+"]")){
			
			System.out.println("hi");
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/input["+i+"]")).click();
			i++;
			count++;
			
		}
		System.out.println("Total no. of checkboxes are:"+count);
		
	}




}
