package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipKart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		WebElement SearchBox=driver.findElement(By.xpath("//input [@class='_3704LK']"));
		SearchBox.sendKeys("Mi mobile",Keys.ENTER);
		Thread.sleep(5000);
		
		 driver.switchTo().activeElement().sendKeys("mi mobiles",Keys.ENTER);
		 driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8766519033");
		 
		 driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("R053449");
		 
	
		
		 
		
		
		
	}
}