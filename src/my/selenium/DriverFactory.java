package my.selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	
	public static WebDriver getDriverInstance(String driverName){
		WebDriver driver = null;
		
		if(driverName=="Chrome"){
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setBinary(new File("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe"));
			driver = new ChromeDriver(chromeOptions);	
		} else if(driverName=="FireFox"){
			driver = new FirefoxDriver();
		}
		
		return driver;
	}
}
