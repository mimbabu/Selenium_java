import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;




public class BrowserTest {
	
	WebDriverBrowser driver;

@Test

	public void TestFirst(){
	
	   WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("www.facebook.com");
		
		

		// header

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div/div[3]/div[2]/div[3]/button")).click();

		
		// Login

		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[2]/div[1]/div/div/div/div/div/button[2]")).click();

		System.out.println(driver.getTitle());
		
		driver.quit();

	}

	
	@Test
	
		public void LoginTest(){
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://test-web.real-ezy.com/");
			
			

			// header

			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div/div[3]/div[2]/div[3]/button")).click();

			// Login

			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[2]/div[1]/div/div/div/div/div/button[2]")).click();

			System.out.println(driver.getTitle());
			
			driver.quit();	
	
}
	
}
	
	
	

	