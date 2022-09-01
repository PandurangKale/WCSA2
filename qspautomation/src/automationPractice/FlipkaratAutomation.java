package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkaratAutomation {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	Thread.sleep(3000);
		driver.get("http://www.flipkart.com");
		Thread.sleep(6000);
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 WebElement SearchBox=driver.findElement(By.xpath("//input [@class='_3704LK']"));
			SearchBox.sendKeys("laptop",Keys.ENTER);
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[.='Core i5'])[3]")).click();Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[.='Brand'])[2]")).click();Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[.='HP'])[3]")).click();Thread.sleep(3000);
		 
		
	}

}
