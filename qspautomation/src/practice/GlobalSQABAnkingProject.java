package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GlobalSQABAnkingProject {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Customer Login']")).click();
		Thread.sleep(2000);
		WebElement drop=driver.findElement(By.xpath("//select[@id='userSelect']"));
		Select s=new Select(drop);
		s.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}

}
