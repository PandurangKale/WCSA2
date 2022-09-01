package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU3NTM5OTcwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("8766519033");
		driver.findElement(By.id("pass")).sendKeys("p@12345");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}

}
