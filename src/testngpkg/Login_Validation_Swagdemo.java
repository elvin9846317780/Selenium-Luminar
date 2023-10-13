package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Validation_Swagdemo {
WebDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		String expected_Url= "https://www.saucedemo.com/inventory.html";
		
		WebElement username =  driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		WebElement login = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		String actual_Url= driver.getCurrentUrl();
		Assert.assertEquals(actual_Url,expected_Url);
		//System.out.println("login successfull");
			
	}
}
