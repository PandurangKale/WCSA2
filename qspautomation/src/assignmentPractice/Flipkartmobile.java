package assignmentPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartmobile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipKart.com");
		
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement SearchBox=driver.findElement(By.xpath("//input [@class='_3704LK']"));
		SearchBox.sendKeys("laptop",Keys.ENTER);
		 driver.findElement(By.xpath("(//div[@class=\"_24_Dny\"])[1]")).click();
		 Thread.sleep(9000);
		 driver.findElement(By.xpath("(//div[@class=\"_2gmUFU _3V8rao\"])[2]")).click();
		driver.findElement(By.xpath("(//div[@class=\"_24_Dny\"])[7]")).click();


}
}          
