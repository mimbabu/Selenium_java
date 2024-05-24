package Com.hyr.Test;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;





public class Email {

	

	private static final Object ContentSettings = null;

	@Test
	
	public static void main() throws InterruptedException {
		
		seleniumWaits();
		
		
		
		
		
	        
	        WebDriverManager.chromedriver().setup();
	        
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				
				
				
			   driver.get("https://test-web.real-ezy.com/");
			   
			
			   
			   //Alert
			   
//			   
//			   driver.findElement(By.id("alertBox")).click();
//			   Alert simpleAlert = driver.switchTo().alert();
//			   System.out.println(simpleAlert.getText());
//			   Thread.sleep(2000);
//			   
//			   
//			   
//			   
			   Thread.sleep(2000);
	   
			   
			   
			
			   
			   
			   
				// header

				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div/div[3]/div[2]/div[3]/button")).click();

				   Thread.sleep(2000);
				
				//Email
				
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[1]/div/div/div/div/div/button[2]")).click();

				   Thread.sleep(2000);
				
				
		
		
				
			
				
				//Email fields
		     	WebElement element = driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-1\"]/div/div/form/div/div/div/div"));

				element.click();
				Thread.sleep(1000);
				WebElement inputElement = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div/div/div/div/input"));
				if(inputElement.isEnabled()) {
					inputElement.sendKeys("ddlsmtp6@gmail.com");					
				}
				
				
				
				
				
                Thread.sleep(2000);
                
                
      
            
                      
				
				
				
				
				
				
				
				//continue
				
				
				driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-1\"]/div/div/form/div/button")).click();
				
		
			    Thread.sleep(4000);
				   //Password click
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				//250 ms
				   
				   
				   
				
				WebElement ele	= driver.findElement(By.xpath("//input[@id='password']"));
				
				ele.click();
				   
				  ele.sendKeys("123456",Keys.ENTER);
				   
				   
				 Thread.sleep(2000);
				   
				   
				 
				 
				 
				 
				 //Profile hover
				 
				 
				 
			WebElement hover= driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[3]/div[2]/div[6]/div/ul/li/button"));
				 
				 Actions action = new Actions(driver);
				 action.moveToElement(hover).perform();
				
				 
				 
				 
				 Thread.sleep(4000);
				 
				 
				 
				 
		 driver.findElement(By.xpath("//*[@id=\"composition-menu\"]/ul/div/div[1]/div")).click();
				 
		 
		 Thread.sleep(2000);
		 
		 
		 
		 driver.findElement(By.xpath("//html")).click();

				 
				
		 driver.findElement(By.xpath("//*[@id=\"editprofile\"]")).click();
		 
		 
		 Thread.sleep(2000);
		 
		 
		 
		 //Add date of birth click
		 
		 
		 
		 
	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[2]/div[2]/main/div/form/div[2]/div[3]/div/div/div[1]/div/div[3]/div[2]/div")).click();;
		 
	 
	 Thread.sleep(2000); 
	 
	 
	WebElement	date = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/main[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]"));

	 
		date.sendKeys("20 July, 1978",Keys.ENTER);
		 
		 Thread.sleep(2000); 
		 
		 
			date.sendKeys("20 July, 1978");
		 
			Thread.sleep(2000);  
	
			
			WebElement	Age	= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/main[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]"));
		 

			Age.click();
			
			
			Thread.sleep(2000);  
			
			
			 driver.findElement(By.xpath("//*[@id=\"menu-age\"]/div[3]/ul/li[2]")).click();;

			
				Thread.sleep(2000);  
			
				
				
				//Gender
				
				
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-gender\"]")).click();
				
		Thread.sleep(2000);  
		
		
		//Gender Menu
		 
		driver.findElement(By.xpath("//*[@id=\"menu-gender\"]/div[3]/ul/li[2]")).click();
			 
		
		Thread.sleep(2000);  
		
		
	
		
			 //complete Education Level click
				 
			driver.findElement(By.cssSelector("//*[@id=\":r0:-tabpanel-1\"]/main/div/form/div[2]/div[3]/div/div/div[1]/div/div[5]/div[1]/div/div")).click();
				 
				 
				 
				 

				 
				 System.out.println("This is okay");
				 
				 
				 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div")).click();
				 
				 
				 
				 Thread.sleep(2000);
				 
				 
				 
				 
				 //
				 
				 
				 
				 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/")).click();
				 
				 
				 
				 
				 

				System.out.println(driver.getTitle());
				
				driver.quit();
		 }

		

		
		

	

	private static FluentWait<WebDriver> WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void seleniumWaits() {
		// TODO Auto-generated method stub
		
	}

}
