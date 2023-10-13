package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {
	
	@Parameters({"a","b"})
	@Test
	public void test(String v,String x)
	{
		System.out.println(v);
		System.out.println(x);
	}

}
