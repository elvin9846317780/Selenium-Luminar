package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_CopyPaste {
ChromeDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]//tbody//tr[3]//td[3]//input"));
		WebElement rediffmail = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		fullname.sendKeys("Elvin");
		
		Actions act=new Actions(driver);//the actions which is to performed will be done @ driver
		act.keyDown(fullname, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL); //select "ctrl+a", keyDown- to press the key
		act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL); //copy "ctrl+c" , keyUp- to release the pressed key
		act.keyDown(rediffmail, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL); //paste "ctrl+v"
		act.perform(); //perform() method should be called @ the end of actions to complete the execution of actions
	}

}
