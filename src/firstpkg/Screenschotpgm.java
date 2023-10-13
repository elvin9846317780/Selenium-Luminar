package firstpkg;

import java.io.File;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenschotpgm {

ChromeDriver driver;
	
	@Before
	public void openApp()
	{
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	}
	
	@Test
	public void test() throws IOException
	{
		File pagesc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Fullpagescreenchot code
		FileHandler.copy(pagesc,new File("D:\\Selenium Screenshot//Googlepagesc.png")); //Storing screenshot in pc drive, applicable for both pagesc and elementsc
		
		
		WebElement searchbutton = driver.findElement(By.name("q"));   //Elementscreenshot code      
		File elementScreenshot =searchbutton.getScreenshotAs(OutputType.FILE); //Elementscreenshot code
		FileHandler.copy(elementScreenshot,new File("./Screenshot/Googlesearchbutton.png"));//Storing screenshot in java package, applicable for both pagesc and elementsc
	}
}
