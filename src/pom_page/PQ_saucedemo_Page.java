package pom_page;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PQ_saucedemo_Page {

	WebDriver driver;
	
	@FindBy(xpath=("//*[@id=\"user-name\"]"))
	WebElement username;
	
	@FindBy(xpath=("//*[@id=\"password\"]"))
	WebElement password;
	
	@FindBy(xpath=("//input[@type=\"submit\"]"))
	WebElement login;
	
	@FindBy(xpath=("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"))
	WebElement product1_Adcart;
	
	@FindBy(xpath=("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"))
	WebElement product2_Adcart;
	
	@FindBy(xpath=("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"))
	WebElement product3_Adcart;
	
	@FindBy(xpath=("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"))
	WebElement product4_Adcart;
	
	@FindBy(xpath=("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"))
	WebElement product5_Adcart;
	
	@FindBy(xpath=("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"))
	WebElement product6_Adcart;
	
	@FindBy(xpath=("//*[@id=\"shopping_cart_container\"]/a"))
	WebElement cart;
	
	@FindBy(xpath=("//*[@id=\"checkout\"]"))
	WebElement checkout;
	
	@FindBy(xpath=("//*[@id=\"first-name\"]"))
	WebElement firstname;
	
	@FindBy(xpath=("//*[@id=\"last-name\"]"))
	WebElement lastname;
	
	@FindBy(xpath=("//*[@id=\"postal-code\"]"))
	WebElement zipcode;
	
	@FindBy(xpath=("//*[@id=\"continue\"]"))
	WebElement continuebutton;

	@FindBy(xpath=("//*[@id=\"finish\"]"))
	WebElement finish;
	
	@FindBy(xpath=("//*[@id=\"back-to-products\"]"))
	WebElement backHome;
	
	@FindBy(xpath=("//*[@id=\"react-burger-menu-btn\"]"))
	WebElement hamburger;
	
	@FindBy(xpath=("//*[@id=\"logout_sidebar_link\"]"))
	WebElement logout;
	
	//----constructor
	public PQ_saucedemo_Page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginvalidation() throws Exception 
	{
		FileInputStream f = new FileInputStream("C:\\Users\\elvin\\OneDrive\\Desktop\\Excel workbook\\PQsauceworkbook.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		int rowcount= sh.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			String usrnme = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username = "+usrnme);
			String pswd = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password = "+pswd);
			
			username.sendKeys(usrnme);
			Thread.sleep(500);
			
			password.sendKeys(pswd);
			Thread.sleep(500);
			
			login.click();
			Thread.sleep(500);
			
			driver.navigate().refresh();
			Thread.sleep(500);
		}
	}
	public void addAllProductsToCart() throws Exception
	{
		product1_Adcart.click();
		Thread.sleep(700);
		
		product2_Adcart.click();
		Thread.sleep(700);
		
		product3_Adcart.click();
		Thread.sleep(700);
		
		product4_Adcart.click();
		Thread.sleep(700);
		
		product5_Adcart.click();
		Thread.sleep(700);
		
		product6_Adcart.click();
		Thread.sleep(700);
	}
	
	public void clickCartnCheckout() throws Exception
	{
		cart.click();
		Thread.sleep(700);
		
		checkout.click();
		Thread.sleep(700);
	}
	
	public void fillInfoContinueFinish(String frstnme, String lstnme, String zip) throws Exception
	{
		firstname.sendKeys(frstnme);
		Thread.sleep(700);
		
		lastname.sendKeys(lstnme);
		Thread.sleep(700);
		
		zipcode.sendKeys(zip);
		Thread.sleep(700);
		
		continuebutton.click();
		Thread.sleep(1000);
		
		finish.click();
		Thread.sleep(1000);
	}
	
	public void backHomenLogout() throws Exception
	{
		backHome.click();
		Thread.sleep(700);
		
		hamburger.click();
		Thread.sleep(700);
		
		logout.click();
		Thread.sleep(700);
		
	}
}
