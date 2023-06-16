package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Main {

	public static WebDriver driver;

	@BeforeClass
	public static void main() {
	     System.out.println("hello");
	
     	System.setProperty("webdriver.chrome.driver", "E:\\114chromedriverwin32\\chromedriver.exe");
        	        
        ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("--incognito");

		 driver = new ChromeDriver(options);

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();


		
//	driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	
//	driver.quit();

	}


	
//	@AfterSuite
//	public void quit() {
//		//driver.close();
//		driver.quit();
//	}
	
}
