package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class InvalidLogin extends Main {

	
@Test
	public void Loginwithblank() throws InterruptedException {
		
//	driver.switchTo().newWindow(WindowType.WINDOW);

//	driver.switchTo().newWindow(WindowType.TAB);
//	driver.get("https://www.facebook.com/");
////	driver.manage().deleteAllCookies();

	
	
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("pass")).clear();


		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);

//		//Check that not logged in and open login again with error
		try {
		driver.findElement(By.xpath("//*[text()='Invalid username or password']")).isSelected();

		System.out.println("found invalid");
	}
	catch(NoSuchElementException e)
	{
		System.out.println("Notfound invalid");

	}

	}
	
	
	@Test
	public void LogininvalidEmPW() throws InterruptedException {
		
		driver.findElement(By.name("email")).sendKeys("hebgmail.com");
		driver.findElement(By.name("pass")).sendKeys("auto54");

		driver.findElement(By.name("login")).click();

		Thread.sleep(5000);
		
		
//		//Check that not logged in and open login again with error
		try {
		driver.findElement(By.xpath("//*[text()='Invalid username or password']")).isSelected();

		System.out.println("found invalid");
	}
	catch(NoSuchElementException e)
	{
		System.out.println("Notfound invalid");

	}
		

		
	}
	
	
	@Test
	public void LogininvalidPw() throws InterruptedException {
		
		driver.findElement(By.name("email")).clear();

		driver.findElement(By.name("email")).sendKeys("hebmansour2014@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("auto54");

		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("login")).isEnabled();


		

//		//Check that not logged in and open login again with error
		try {
		driver.findElement(By.xpath("//*[text()='Invalid username or password']")).isSelected();

		System.out.println("found invalid");
	}
	catch(NoSuchElementException e)
	{
		System.out.println("Notfound invalid");

	}
	
		
		
		
		
		
	}

}

