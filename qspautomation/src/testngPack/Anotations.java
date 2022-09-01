package testngPack;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotations {
	@Test
	public void test1() 
	{
		Reporter.log("test1 method",true);
	}
	public void test2() 
	{
		Reporter.log("test2 method",true);
	}
	@BeforeSuite()
	public void method1() 
	{
		Reporter.log("method1 beforeSuite",true);
	}
	@BeforeTest
	public void method2() 
	{
		Reporter.log(" method2 BeforeTest",true);
	}
	@BeforeClass()
	public void method3() 
	{
		Reporter.log("method3 BeforeClass",true);
	}
	@BeforeMethod()
	public void method4() 
	{
		Reporter.log("method4 BeforeMethod",true);
	}
	@AfterMethod()
	public void method5() 
	{
		Reporter.log("method5 AfterMethod",true);
	}
	@AfterClass()
	public void method6() 
	{
		Reporter.log(" method6 AfterClass",true);
	}
	@AfterTest()
	public void method7() 
	{
		Reporter.log(" method7 AfterTest",true);
	}
}
