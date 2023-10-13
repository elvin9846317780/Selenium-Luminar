package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_Drag_n_Drop {
	ChromeDriver driver;


	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test()
	{
		Actions act = new Actions(driver);
		
		WebElement first5000=driver.findElement(By.xpath("//li[@id=\"fourth\"]"));
		WebElement DebitAmount = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(first5000, DebitAmount).perform();
		
		WebElement Bank=driver.findElement(By.xpath("//li[@id=\"credit2\"]"));
		WebElement DebitAccount=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		act.dragAndDrop(Bank, DebitAccount).perform();
		
		WebElement second5000=driver.findElement(By.xpath("//*[@id=\"products\"]/div/ul/li[4]"));
		WebElement CreditAmount = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(second5000, CreditAmount).perform();
		
		WebElement Sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]"));
		WebElement CreditAccount=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(Sales, CreditAccount).perform();
		
		String Perfecttext =driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).getText();
		System.out.println(Perfecttext);
		if(Perfecttext.equals("Perfect!"))
		{
			System.out.println("Perfect is printed");
		}
		else
		{
			System.out.println("Perfect is not printed");
		}
	}
	

}
