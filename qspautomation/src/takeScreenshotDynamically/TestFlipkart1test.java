package takeScreenshotDynamically;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFlipkart1test extends BaseTest {
	@BeforeMethod
	public void setUp()
	{
		intialization();
	}
	@Test
	  public void TestFlipkart1() 
	  {
		 Assert.fail(); 
	  }

	  @Test
	  public void TestFlipkart2() 
	  {
		 Assert.fail(); 
	  }


	  @AfterMethod
	  public void tearDown() 
	  {
		  driver.close();
	  }

}
