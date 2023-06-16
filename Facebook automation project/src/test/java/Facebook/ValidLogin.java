package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class ValidLogin extends Main {
	
	
	@Test		
  public void LoginByEmailValidPwValid() throws InterruptedException {
			
			System.out.println("driver="+ driver);
			
			//Validlogin
			driver.findElement(By.name("email")).sendKeys("hebamanso1@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("insta12345678");
			driver.findElement(By.name("login")).click();
		//	driver.findElement(By.name("Welcome to Facebook"));


			Thread.sleep(5000);
			
			
			try {
				driver.findElement(By.xpath("//*[text()='Welcome to Facebook, Heba']")).isSelected();

				System.out.println("found account");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Notfound account");

			}


		}
	
	
	

	
	}

