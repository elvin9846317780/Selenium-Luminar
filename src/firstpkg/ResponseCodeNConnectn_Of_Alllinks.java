package firstpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCodeNConnectn_Of_Alllinks {
	
	ChromeDriver driver;
	
	@Before
	public void openApp()
	{
	  driver = new ChromeDriver();
	  //driver.get("https://www.google.com");
	  driver.get("http://letterlandschool.com/");
	}

	@Test
	public void test()
	{
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links = "+link.size());
	
		for(WebElement ele:link)
		{
			String linkdetails=ele.getAttribute("href");
			VerifyNConnection(linkdetails);
			
		}
	}

	private void VerifyNConnection(String linkdetails) {
	
		try 
		{
			URL u= new URL(linkdetails);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			
			if(con.getResponseCode()==200)
			{
				System.out.println("Successfull ----"+linkdetails);
			}
			else
				if(con.getResponseCode()==404)
			{
				System.out.println("Broken link---"+linkdetails);
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
