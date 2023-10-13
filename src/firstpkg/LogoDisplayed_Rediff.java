package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoDisplayed_Rediff {


	ChromeDriver driver;
	
	@Before
	public void openApp()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		boolean Display= driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();	
		
		if(Display == true)
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo is not present");
		}
	}
	
}
