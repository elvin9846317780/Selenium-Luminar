package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonNameVerification {

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
	String buttonname= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");

	if(buttonname.equals("Check acvailability"))
	{
		System.out.println("button name is '"+buttonname+"': CORRECT");
	}
	else
	{
		System.out.println("button name is '"+buttonname+"': INCORRECT");
	}
	}
}
