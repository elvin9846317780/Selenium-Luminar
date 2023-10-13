package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload_Robot_Class {
	ChromeDriver driver;

	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
	}

	//when text field is not available to upload a file,instead upload file button is present . In such cases we use Robot class
	//selenium cann't handle system windows,so for that Robot class is defined in the java.AWT package
	
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		fileUpload("D:\\Elvin - Documents\\juliya reference jincy.docx"); //fileUpload method call
	}

	private void fileUpload(String p) throws AWTException  //fileUpload method
	{
		StringSelection strSelection =new StringSelection(p); // selecting(ctrl+a) the filepath which is now in string p
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null); //storing the selected p in clipboard
		
		Robot robot = new Robot(); //object creation of robot class
		
		robot.delay(3000); // sometimes need to wait to upload file
		
		robot.keyPress(KeyEvent.VK_CONTROL);  // ctrl+V press
		robot.keyPress(KeyEvent.VK_V);     // ctrl+V press
		
		robot.keyRelease(KeyEvent.VK_V);    // ctrl+V release
		robot.keyRelease(KeyEvent.VK_CONTROL);   // ctrl+V release
		
		robot.keyPress(KeyEvent.VK_ENTER); //enter press
		robot.keyRelease(KeyEvent.VK_ENTER); //enter release
		
	    robot.delay(2000);	
	}
}
