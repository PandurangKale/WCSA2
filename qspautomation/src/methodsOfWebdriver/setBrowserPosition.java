package methodsOfWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setBrowserPosition {
	 
		 public static void main(String[] args) throws InterruptedException {
		 	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 	WebDriver driver=new ChromeDriver();
		 	Dimension targetSize=new Dimension(500, 200);
		 	Point targetPosition=new Point(600, 100);
			driver.manage().window().setPosition(targetPosition);
		 	Thread.sleep(5000);
		 	driver.quit();
		 }
}

