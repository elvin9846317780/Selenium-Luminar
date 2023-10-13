package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PQ_Rediff_RadioButton_ButtonEnabledornot {

ChromeDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test(priority = 1)
	public void genderRadiobutton()
	{
		WebElement GenderRadBut= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		
		if(GenderRadBut.isSelected())
		{
			System.out.println("Gender Male is selected by default");
		}
		else
		{
			System.out.println("Gender Male is not selected by default");
		}
	}
	
	@Test(priority = 2)
	public void createmyaccountButton()
	{
		WebElement createbutton = driver.findElement(By.xpath("//input[@id=\"Register\"]"));
		if(createbutton.isEnabled())
		{
			System.out.println("Create Account button is enabled");
		}
		else
		{
			System.out.println("Create Account button is disabled");
		}
	}
}
