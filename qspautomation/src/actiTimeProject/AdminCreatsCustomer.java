package actiTimeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminCreatsCustomer {
	
	
	public void adminCreatCustomer() throws InterruptedException

	{
		
	
	driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[9]/a/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"container\"]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"container\"]/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[1]/td[3]/input")).sendKeys("Abhijeet");
	driver.findElement(By.xpath(" //*[@id=\"container\"]/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[1]/td[3]/input")).sendKeys("abhi@123");
	driver.findElement(By.xpath(" //*[@id=\"container\"]/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[2]/td[3]/input")).sendKeys("abhi@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/form/table/tbody/tr[4]/td/input[2]")).click();
	}
	
	

}
