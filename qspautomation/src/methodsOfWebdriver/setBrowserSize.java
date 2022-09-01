package methodsOfWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setBrowserSize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Dimension targetSize=new Dimension(500, 200);
	driver.manage().window().setSize(targetSize);
	Thread.sleep(5000);
	driver.quit();
}
}
