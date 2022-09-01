package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopInFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'_3879cV')])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[.='Brand'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[.='HP'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[.='Operating System'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[.='Windows 10'])[3]")).click();
		Thread.sleep(2000);
		
		 
	}
}
