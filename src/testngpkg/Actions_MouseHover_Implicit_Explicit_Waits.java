package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_MouseHover_Implicit_Explicit_Waits {
ChromeDriver driver;


	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
	}
	
	@Test
	public void test()
	{
		
		
		Actions act=new Actions(driver);
		WebElement Electronics = driver.findElement(By.xpath("//li[@data-currenttabindex=\"0\"]"));
		act.moveToElement(Electronics).perform();  //moveToElement() method is for mouse hover action 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //--IMPLICIT WAIT
		
										//OR
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30)); //--EXPLICIT WAIT
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div/ul/li[3]/div[2]/div/nav/ul/li/a"))); //EXPLICIT WAITS

		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/ul/li[3]/div[2]/div/nav/ul/li/a")).click(); //--smartphone link
		
		
		
	}

}
