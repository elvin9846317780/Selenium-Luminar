package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

ChromeDriver driver;
	
	@Before
	public void openApp()
	{
	  driver = new ChromeDriver();
	  driver.get("file:///C:/Users/elvin/OneDrive/Documents/Software%20testing%20-%20Luminar/Eclipse/Eclipse%20Workspace/Webdriver/alert.html");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//switchimng to alert popup  
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		  a.accept(); //accepting alert
		  
		  //a.dismiss();  //dismissing alert
		  
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("ghdf");
		driver.findElement(By.xpath("/html/body/input[4]")).click();	
	}
}
