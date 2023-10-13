package firstpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleVerification()
	{
		String actualTitle=driver.getTitle();
		String expected="Google";
		
		if(actualTitle.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void pageSourcepgm()
	{
		String src=driver.getPageSource();
		
		if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}	
	}
	
	
	@After
	public void  tearDown()
	{
		//
		driver.close();
	}

}
