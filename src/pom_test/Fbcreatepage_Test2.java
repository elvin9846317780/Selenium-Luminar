package pom_test;

import org.testng.annotations.Test;

import basepkg.Baseclass_fb;
import pom_page.Fbcreatepage_Page2;

public class Fbcreatepage_Test2 extends Baseclass_fb {

	@Test
	public void testlogin()
	{
		Fbcreatepage_Page2 ob = new Fbcreatepage_Page2(driver);
		ob.createpageclick();
		ob.getstartbutton();
	}

}
