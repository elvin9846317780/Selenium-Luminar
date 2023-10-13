package pom_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom_page.PQ_saucedemo_Page;

public class PQ_saucedemo_Test {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception
	{
		PQ_saucedemo_Page ob = new  PQ_saucedemo_Page(driver);
		
		ob.loginvalidation();
		ob.addAllProductsToCart();
		ob.clickCartnCheckout();
		ob.fillInfoContinueFinish("Alex", "Leema", "340954");
		ob.backHomenLogout();	
	}

}
