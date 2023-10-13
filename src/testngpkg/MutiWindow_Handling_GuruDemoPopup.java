package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MutiWindow_Handling_GuruDemoPopup {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		String parentWindow	= driver.getWindowHandle();  //----------------Returns details(ID)of the main page
		driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();//-----locating the 'click here' button
		
		Set<String> allWindowsHandle = driver.getWindowHandles();//------Returns details of multi window
		
        for(String handle: allWindowsHandle)  //----for each loop to fetch the details of all windows
        {
        	if(!handle.equalsIgnoreCase(parentWindow))
        	{
        		driver.switchTo().window(handle);
        		
        		driver.findElement(By.xpath("//input[@name=\"emailid\"]")).sendKeys("abc@gmail.com");
        		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
        		driver.close();
        	}
        	
        	driver.switchTo().window(parentWindow);
        }
    }	

}
