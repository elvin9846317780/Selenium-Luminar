package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//Q) open ebay , search mobiles, click cart, click star shopping,click fashion

public class ebay_xpath {
	
	ChromeDriver driver;
	
	@Before
	public void openEbay()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
	}
	
	@Test
	public void test()
	{
		//search mobile
		driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("Mobiles",Keys.ENTER);
		
		//click cart
		driver.findElement(By.xpath("//li[@id=\"gh-minicart-hover\"]")).click();
		
		//click start shopping
		driver.findElement(By.xpath("//a[@data-test-id=\"start-shopping\"]")).click();
		
		//click fashion
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/ul/li[5]")).click();
	}

}
