package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PQ_ebay {

	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	
	@Test(priority =1)
	public void totalLinkCount()
	{
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links in ebay.com : "+link.size());
	}
	
	@Test(priority =2)
	public void searchButtonVerification()
	{
		WebElement searchButton= driver.findElement(By.xpath("//input[@id=\"gh-btn\"]"));
		if(searchButton.isEnabled())
		{
			System.out.println("Ebay search button is enabled");
		}
		else
		{
			System.out.println("Ebay search button is disabled");
		}
	}
	
	@Test(priority =3)
	public void logo()
	{
		Boolean logo= driver.findElement(By.xpath("//img[@id=\"gh-logo\"]")).isDisplayed();
		if(logo == true)
		{
			System.out.println("Ebay logo is Displayed");
		}
		else
		{
			System.out.println("Ebay logo is not displayed");
		}
	}
	
	@Test(priority =4)
	public void DailyDeals()
	{
	 String src=driver.getPageSource();
	 if(src.contains("Daily Deals"))
	 {
		 System.out.println("Daily Deals text is present");
	 }
	 else
	 {
		 System.out.println("Daily Deals text is not present");
	 }
	}
	
	
}
