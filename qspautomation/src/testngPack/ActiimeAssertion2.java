package testngPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ActiimeAssertion2 {
	WebDriver driver;
  @BeforeMethod
  public void setUP() {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://desktop-9i4god1/login.do");
	  
  }
  
  @Test
  public void loginPage() {
	  String titleOfLOginPage = driver.getTitle();
	  SoftAssert softAssert =new SoftAssert();
	 
	  softAssert.assertEquals(titleOfLOginPage, "actiTIME - Login");
	  Reporter.log("Title is verifide ", true);
	  
	String usernameTb = driver.findElement(By.xpath("//*[@id=\"loginBox\"]/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[1]")).getText();
	System.out.println(usernameTb);
	Assert.assertEquals(usernameTb,"Username:");
	 Reporter.log("username textbox is present ", true);
//	
//	  driver.findElement(By.name("username")).sendKeys("admin");
//	  driver.findElement(By.name("pwd")).sendKeys("manager");
//	  driver.findElement(By.id("loginButton")).click();
  }
  @AfterMethod
  public void logout() {
	  driver.quit();
  }
}
