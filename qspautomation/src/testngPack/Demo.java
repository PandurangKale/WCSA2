package testngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() {
	  Reporter.log("HI,i am from method 1",true);//cosole o/p=msg------Reports=msg
	  
  }
}
