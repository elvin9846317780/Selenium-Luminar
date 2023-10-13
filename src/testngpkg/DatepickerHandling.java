package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatepickerHandling {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//button[@data-testid=\"date-display-field-start\"]")).click();
		
		while(true)
		{
			String monthtext = driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]//div//div//div//div//h3")).getText();
			System.out.println(monthtext);
			
			if(monthtext.equals("November 2023"))
			{
				System.out.println("Month selected");
				break;
			}
			
			else 
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
			}
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
		
		for(WebElement dateElement : allDates)
		{
			String date= dateElement.getText();
			
			if(date.equals("20"))
			{
				dateElement.click();
				break;
			}
		}
	
	}

}
