package firstpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCode_N_Connection_Of_Onelink  {

ChromeDriver driver;
String baseUrl="https://www.google.com";  //link is stored
//String baseUrl="http://letterlandschool.com/";

	@Before
	public void openApp()
	{
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	}

	@Test
	public void test() throws Exception   //if link is broken exception occurs so to avoid that --throws
	{
		//below 3 lines are used for enabling url connection through java
		URL u =new URL(baseUrl); //constructor
		HttpURLConnection con =(HttpURLConnection)u.openConnection();  //casting
		con.connect();
		
		//Response code should be 200 -- success
		System.out.println("Response code : "+con.getResponseCode());
		
		if(con.getResponseCode()==200)
		{
			System.out.println("Successfull---"+baseUrl);
		}
		else
		{
			System.out.println("Response code is not 200");
		}
		
	}
}
