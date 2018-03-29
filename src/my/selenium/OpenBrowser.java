package my.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {
	

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubchromedriver
	//System.setProperty("webdriver.gecko.driver", "C:/Users/PARIKSHIT B/Downloads/geckodriver-v0.20.0-win64/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARIKSHIT B\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
    //ChromeDriver driver = new ChromeDriver();
    //Capabilities capabilities = new FirefoxOptions();
    //DesiredCapabilities des = new DesiredCapabilities();
    //WebDriver driver = new FirefoxDriver(des);
		
	//WebDriver driver = DriverFactory.getDriverInstance("Chrome");
	WebDriver driver = DriverFactory.getDriverInstance("FireFox");
		
	//WebDriver driver = new ChromeDriver();
	driver.get("http://mail.aol.com");	
    //driver.navigate().to("http://mail.aol.com");
    //driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
    //driver.findElement(By.id("login1"));
    //driver.findElementById("login1");
    //("//*[@id='identifierId']"));
    //String[] emailid = new String[]{"asdaadasdadadadasdasda@asda.vf"};
    
    //driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("asdaadasdadadadasdasda@asda.vf");
    //WebElement email= driver.findElement(By.id("identifierId"));
    WebElement email = driver.findElement(By.xpath("//input[@id='login-username']"));
    System.out.println(email.getText());
    //email.sendKeys(new String[]{"aaa@b.com"});
    email.sendKeys("priyanka_k@aol.com");
    driver.findElement(By.xpath("//input[@id='login-signin']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='pwdId1']")).sendKeys("Wisdom18!");	
    driver.findElement(By.xpath("//input[@id='submitID']")).click();
    Thread.sleep(1000);
    WebElement title= driver.findElement(By.xpath("//div[@class='logoArea']"));
    
    //("//input[@id='submitID']");
    
    System.out.println((title.getLocation()));
    //System.out.println(driver.findElement(By.xpath("xpath=/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/form/div[1]/div/div[2]/div[2]")));
    driver.quit();
    
   
	}

}
