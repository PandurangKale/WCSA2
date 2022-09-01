package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts()
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(5000);
	driver.findElement(By.id("textUsername")).sendKeys("Admin");
	driver.findElement(By.id("textPassword")).sendKeys("admin123");
	Thread.sleep(5000);
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(5000);
	driver.quit();
	
}

}