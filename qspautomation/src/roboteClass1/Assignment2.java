 package roboteClass1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.co.in/");
		Thread.sleep(4000);
		WebElement target = driver.findElement(By.name("q"));
		Actions act=new Actions(driver);
		act.contextClick(target).perform();
		
		
		 Robot robote = new Robot();
           for (int i = 0; i < 5; i++) {
          
        	   robote.keyPress(KeyEvent.VK_DOWN);
        	   robote.keyRelease(KeyEvent.VK_DOWN);
        	   
		}
}
}
