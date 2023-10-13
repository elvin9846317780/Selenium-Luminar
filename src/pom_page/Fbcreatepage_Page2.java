package pom_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage_Page2 {
	
	WebDriver driver;
	
	@FindBy(xpath =("//*[@id=\"reg_pages_msg\"]/a"))
	WebElement createpage;
	
	@FindBy(xpath =("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button"))
	WebElement getstarted; 
	
	//By createpage= By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	//By getstarted= By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button");
	
	public Fbcreatepage_Page2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createpageclick()
	{
		createpage.click();
	}
	public void getstartbutton()
	{
		getstarted.click();
	}
	
}
