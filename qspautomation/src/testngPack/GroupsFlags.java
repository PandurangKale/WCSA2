package testngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsFlags {
  @Test(groups="FUNCTIONAL")
  public void ft1() 
  {
	  Reporter.log("Functional Testcase 1",true);
  }
  @Test(groups="INTIGRATION")
  public void it1() 
  {
	  Reporter.log("intigration Testcase 1",true);
  }
  @Test(groups = "SMOKE")
  public void smoke1() 
  {
	  Reporter.log("smoke Testcase 1",true);
  }
  //========================================================
  @Test(groups="FUNCTIONAL")
  public void ft2() 
  {
	  Reporter.log("Functional Testcase 2",true);
  }
  @Test(groups="INTIGRATION")
  public void it2() 
  {
	  Reporter.log("intigration Testcase 2",true);
  }
  @Test(groups="SMOKE")
  public void smoke2() 
  {
	  Reporter.log("smoke Testcase 2",true);
  }
  //========================================================
  @Test(groups="FUNCTIONAL")
  public void ft3() 
  {
	  Reporter.log("Functional Testcase 3",true);
  }
  @Test(groups="INTIGRATION")
  public void it3() 
  {
	  Reporter.log("intigration Testcase 3",true);
  }
  @Test(groups="SMOKE")
  public void smoke3() 
  {
	  Reporter.log("smoke Testcase 3",true);
  }
  //========================================================
  @Test(groups="FUNCTIONAL")
  public void ft4() 
  {
	  Reporter.log("Functional Testcase 4",true);
  }
  @Test(groups="INTIGRATION")
  public void it4() 
  {
	  Reporter.log("intigration Testcase 4",true);
  }
  @Test(groups="SMOKE")
  public void smoke4() 
  {
	  Reporter.log("smoke Testcase 4",true);
  }
  //========================================================
  @Test(groups="FUNCTIONAL")
  public void ft5() 
  {
	  Reporter.log("Functional Testcase 5",true);
  }
  @Test(groups="INTIGRATION")
  public void it5() 
  {
	  Reporter.log("intigration Testcase 5",true);
  }
  @Test(groups="SMOKE")
  public void smoke5() 
  {
	  Reporter.log("smoke Testcase 5",true);
  }
  //========================================================
  @Test(groups="FUNCTIONAL")
  public void ft6() 
  {
	  Reporter.log("Functional Testcase 6",true);
  }
  @Test(groups="INTIGRATION")
  public void it6() 
  {
	  Reporter.log("intigration Testcase 6",true);
  }
  @Test(groups="SMOKE")
  public void smoke6() 
  {
	  Reporter.log("smoke Testcase 6",true);
  }
  //========================================================
  
  
}
