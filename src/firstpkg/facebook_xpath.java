package firstpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_xpath {
	
	ChromeDriver driver;
	
	@Before
	public void openApp()
	{
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	}
	
	@Test
	public void xpathlogin()
	{
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("gghj");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@After
	public void  tearDown()
	{
		//
		driver.close();
	}


}
