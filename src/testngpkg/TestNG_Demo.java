package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("Browser open");
	}
	
	@BeforeMethod
	public void urlLoading()
	{
		System.out.println("url details");
	}
	
	@Test(priority=2,invocationCount = 3)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority = 1,dependsOnMethods = {"test1"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(enabled = false)
	public void test3()
	{
		System.out.println("test3");
	}
	
	
	
	@AfterMethod
	public void methodclose()
	{
		System.out.println("after method");
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("browser close");
	}
	
}
