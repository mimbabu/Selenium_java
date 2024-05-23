package Com.hyr.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



@Test

public class First {

@Test
	public static void main(){
	
//	System.setProperty("webdriver.chrome.driver", "D:\\chrome-win64/chrome.exe");
				
	   WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
		
	   driver.get("https://test-web.real-ezy.com/");
		
		driver.manage().window().maximize();
		
		// header

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div/div[3]/div[2]/div[3]/button")).click();

		
		
		
		
		
		//Phone outlined-basic
		
		driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/form/div/div/div/div/div/div/div/div[1]/div")).click();
		
		
		
		
		//BD  
		
		
		

		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[15]/p[1]")).click();
		
		
		
		
		// Input Number 
		
		WebElement  tx_user_number = driver.findElement(By.name("phoneNumber"));
		
		tx_user_number.sendKeys("1516525831",Keys.ENTER);
		
		
		
		System.out.println("This okay");
		
		
		
		
		
		//Verify  click
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div/form/button")).click();
		
		
		//wait
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		
		

		
		
		
	    
	    // OTP verification
	    
	    
	    
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div/form/button")).click();
	    
	    
	    
		
		// Login

		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[2]/div[1]/div/div/div/div/div/button[2]")).click();

		System.out.println(driver.getTitle());
		
		driver.quit();

		

	}


}
