import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			//ChromeDriver driver = new ChromeDriver();
		    //driver.navigate().to("http://mail.aol.com");
			
		    
		    driver.get("http://wikipedia.com");
		    /* Select select = new Select(driver.findElement(By.xpath("//select[@id='searchLanguage']")));
		    //select.selectByVisibleText("Dansk");
		    select.selectByValue("hy");
		    //driver.findElement(By.xpath("//select[@id='searchLanguage']")).sendKeys("Dansk");
			List<WebElement>  vlist = select.getOptions();
			
			for(WebElement var:vlist){
				System.out.println(var.getText());
			}
		    
		    List<WebElement>  vlist = driver.findElements(By.tagName("option"));  
		    
		    System.out.println(vlist.size());
		    
		    
			
			for (int i=0; i<= vlist.size();i++){
				
				  System.out.println(vlist.get(i).getAttribute("lang"));	
			}
		    
		    System.out.println(vlist.size());
			//driver.close();*/
		    
		    
		    //===========================================================
		    
		    WebDriverWait wait = new WebDriverWait(driver,2);
		    WebElement block = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html//div[@class='other-projects']"))); //driver.findElement(By.xpath("//div[@class='central-featured']"));
		  		    
		   // WebElement block = driver.findElement(By.xpath("//div[@class='central-featured']"));
		    
		    List<WebElement>  lnklist = block.findElements(By.tagName("a"));  
		    
		    System.out.println(lnklist.size());
		   		    
		    for(WebElement we:lnklist){
		    	System.out.println(we.getText());
		    	
		    	System.out.println();
		    }
		    
		    
		    
		    
		    
		    
	}

}
