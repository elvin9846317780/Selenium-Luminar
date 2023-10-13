package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick_Doubleclick_GuruDemo {
ChromeDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void test()
	{
		WebElement rightClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement doubleClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		
		Actions act = new Actions(driver);
		act.contextClick(rightClick);
		act.perform();
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")).click();
		
		Alert a=driver.switchTo().alert() ;
		a.accept();
		
		act.doubleClick(doubleClick);
		act.perform();
		String alertText=a.getText();
		System.out.println(alertText);
		a.accept();
		
	}
}
