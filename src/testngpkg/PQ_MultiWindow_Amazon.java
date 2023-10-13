package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PQ_MultiWindow_Amazon {
	WebDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() 
	{
		String amazonHome =driver.getWindowHandle();
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles");                        
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();  
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
		//driver.findElement(By.xpath("//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"]")).click();
		
		Set<String> allWindowsHandle = driver.getWindowHandles();
		
		for(String handle: allWindowsHandle)
		{
			if(!handle.equalsIgnoreCase(amazonHome))
			{
				driver.switchTo().window(handle);
				
				driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();	
				//driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
			}
			
		}
	}
}
