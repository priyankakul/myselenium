import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import my.selenium.DriverFactory;

public class TestPropertes {
	public static WebDriver driver;
	public static Properties or = new Properties();
	public static Properties config = new Properties();
	public static FileInputStream fis;

	public static boolean isElementPesent(String locator) {
		int size = 0;
		if (locator.contains("_ID")) {
			size = driver.findElements(By.id(locator)).size();
		} else if (locator.contains("_XPATH")) {
			 size = driver.findElements(By.xpath(locator)).size();
		} else if (locator.contains("_CSS")) {
			 size = driver.findElements(By.cssSelector(locator)).size();
		}

		if (size > 0) {
			return true;

		} else
			return false;
	}

	public static void type(String locator, String value) {

		driver.findElement(By.id(or.getProperty(locator))).sendKeys(value);

	}

	public static void click(String locator) {

		driver.findElement(By.xpath(or.getProperty(locator))).click();
	}

	public static void main(String[] args) throws Exception {
		// C:\Users\PARIKSHIT B\Selenium\geckodriver-v0.20.0-win64(1)
		// System.setProperty("webdriver.gecko.driver", "//C:\\Users\\PARIKSHIT
		// B\\Selenium\\geckodriver-v0.20.0-win64(1)\\geckodriver.exe");
		// WebDriver driver = DriverFactory.getDriverInstance("FireFox");
		// System.out.println( System.getProperty("user.dir"));

		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\or.properties");
		or.load(fis);
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\config.properties");
		config.load(fis);

		if (config.getProperty("browser").equals("Chrome")) {
			// driver = new ChromeDriver();
			driver = DriverFactory.getDriverInstance("Chrome");
		} else if (config.getProperty("browser").equals("Firefox")) {
			// driver = new FirefoxDriver();
			driver = DriverFactory.getDriverInstance("FireFox");
		}

		// driver.get("http://www.google.com");
		driver.get(config.getProperty("testsiteurl"));

		// driver.findElement(By.id(or.getProperty("username_ID"))).sendKeys("Priyanka");
		// driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("Pri");
		// driver.findElement(By.xpath(or.getProperty("nxtBtn_XPATH"))).click();

		type("username_ID", "Priyanka");
		Thread.sleep(5000);
		click("nxtBtn_XPATH");
		type("password_XPATH", "abcd");
		driver.close();
	}

}
