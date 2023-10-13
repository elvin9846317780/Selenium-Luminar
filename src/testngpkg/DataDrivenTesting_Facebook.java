package testngpkg;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTesting_Facebook {
	WebDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception
	{
		FileInputStream f = new FileInputStream("C:\\Users\\elvin\\OneDrive\\Desktop\\Excel workbook\\FbTestCredentials.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f);  //----workbook
		XSSFSheet sh= wb.getSheet("Sheet1");   //-- locating the sheet in the workbook
		
		int rowcount = sh.getLastRowNum(); //to get row count
		
		for(int i=1;i<=rowcount;i++) //---since 1st row and column is headings we don't have to fetch that details, so begin with i=1 not i=0
		{
			String loginEmail = sh.getRow(i).getCell(0).getStringCellValue();// accessing values in row1 & column0 and saving it to loginEmail 
					System.out.println("Email :"+loginEmail);
			
			String loginPswd = sh.getRow(i).getCell(1).getStringCellValue();// accessing values in row1 & column1 and saving it to loginPswd
					System.out.println("Password :"+loginPswd);
					
			driver.findElement(By.name("email")).sendKeys(loginEmail);
			driver.findElement(By.name("pass")).sendKeys(loginPswd);
			driver.findElement(By.xpath("//button[@name='login']")).click();
			driver.navigate().refresh();
		}
	}

}
