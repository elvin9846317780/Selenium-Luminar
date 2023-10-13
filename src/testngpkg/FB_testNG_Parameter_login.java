package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FB_testNG_Parameter_login {

	ChromeDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void fbUrl()
	{
		driver.get("https://www.facebook.com");
	}
	
	@Parameters({"usrnm","pswd"})
	@Test
	public void credentials(String username,String password)
	{
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
}
