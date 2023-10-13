package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");    //open web application
		
		
		String actualTitle=driver.getTitle();
		String expected="Google";
		
		if(actualTitle.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.close(); //to close tab
		//driver.quit();   to close browser
		
	}

}
