package firstpkg;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinkandTextDisplay {

ChromeDriver driver;
	
	@Before
	public void openApp()
	{
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	}
	
	@Test
	public void test()
	{
		List<WebElement> links=driver.findElements(By.tagName("a")); //to select all links
		System.out.println("Total No of links : "+links.size());
		
		for(WebElement ele: links)
		{
			String linkdetails=ele.getAttribute("href");  //to display all links
			String linktext=ele.getText();				// to display text of all elements
			System.out.println(linkdetails+"-----"+linktext);
		}
	}
}
