package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestRegistration extends Main{

	@Test
	public void Register() throws InterruptedException {
			
			//to open in new tab
	//		//driver.switchTo().newWindow(WindowType.TAB);
			
			//to open in new window
	//		driver.switchTo().newWindow(WindowType.WINDOW);
			
	//		driver.get("https://www.facebook.com/");
	
	        // main();
			
	//		driver.get("https://www.facebook.com/");
	
			driver.findElement(By.xpath("//*[text()='Create new account']")).click();
	//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		Thread.sleep(2000);
			
			driver.findElement(By.name("firstname")).sendKeys("heba");
			driver.findElement(By.name("lastname")).sendKeys("mohamed");
			driver.findElement(By.name("reg_email__")).sendKeys("hebaauto@gmail.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hebaauto@gmail.com");
	
		
			driver.findElement(By.id("password_step_input")).sendKeys("auto12345678");
			
			 //set d t y
			 Select day =new Select(driver.findElement(By.xpath("//select[@title='Day']")));
			 day.selectByVisibleText("15");
			 
			 Select month =new Select(driver.findElement(By.name("birthday_month")));
			 month.selectByVisibleText("Mar");
			 
			 Select year =new Select(driver.findElement(By.name("birthday_year")));
			 year.selectByVisibleText("1991");
			 
			 //select gender
			 driver.findElement(By.xpath("//label[text()= 'Female']")).click();
	
			
			  driver.findElement(By.xpath("//button[text()= 'Sign Up']")).click();
			 
			 
				Thread.sleep(5000);

	
				//navigate to another screen to enter confirmation email 		
				
				try {
					driver.findElement(By.xpath("//*[text()='Add a mobile number or email address']")).isSelected();

					System.out.println("found confirmation regitration");
				}
				catch(NoSuchElementException e)
				{
					System.out.println("Notfound confirmation regitration");

				}
				
}
}