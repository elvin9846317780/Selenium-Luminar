package pom_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogin_Page1 {
	
	WebDriver driver;
	
	By fbemail = By.id("email");
	By fbpassword = By.id("pass");
	By fblogin = By.name("login");
	
	public Fblogin_Page1(WebDriver driver)
	{
		this.driver=driver;
	}

	public void setvalues(String email, String password) 
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
	}

	public void login()
	{
		driver.findElement(fblogin).click();
		
	}

}
