package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Q) open amazon.in- search mobiles- click cart- click new releases- click Amazon renewed

public class Amazon_xpath {
	ChromeDriver driver;
	
	@Before
	public void openAmazon()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");  //open amazon.in
		//Thread.sleep(6000);
	}

	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles");                        //Enter mobiles in the search field
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();                            //search mobiles
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();                                                //open cart
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();                                          //click new releases
		driver.findElement(By.xpath("//*[@data-card-metrics-id=\"p13n-zg-nav-tree-all_zeitgeist-lists_1\"]/div[2]/div[2]/a")).click(); //click Amazon renewed
	}
}
