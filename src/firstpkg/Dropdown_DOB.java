package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_DOB {

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
		/*select class is used for dropdown handling. 
		  Select class consist of 3 method-(ByIndex,ByVisibleText,ByValue)*/
		
		Select Date = new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]")));
		Date.selectByIndex(6);
		
		Select Month = new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]")));
		Month.selectByVisibleText("FEB");
		
		Select Year = new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]")));
		Year.selectByValue("1996");
		
	}
}
