package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alart2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///D:/note%20pad/alertPoppop.html");
	 
       driver.findElement(By.xpath("//button[.='Tryit']")).click();
       Alert al = driver.switchTo().alert();
       String alarttext = al.getText();
       System.out.println(alarttext);
       al.dismiss();
       
	
}
}


