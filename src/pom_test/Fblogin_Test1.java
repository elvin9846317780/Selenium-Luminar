package pom_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom_page.Fblogin_Page1;

public class Fblogin_Test1 {
	WebDriver driver;
	
	@BeforeTest
    public void setUp()
    {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
    }
	
	@Test
	public void testlogin()
	{
		Fblogin_Page1 ob = new Fblogin_Page1(driver);
		ob.setvalues("vfj@gmail.com","adacece");
		ob.login();

	}
}
