package firstpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinkCount_tagName {
	
	ChromeDriver driver;
	
	@Before
	public void openApp()
	{
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	}
	
	@Test
	public void testLinkCount()
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total No of links : "+linkdetails.size());
		
	}
	

}
