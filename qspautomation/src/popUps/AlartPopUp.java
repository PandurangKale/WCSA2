package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartPopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///D:/note%20pad/alertPoppop.html");
	Alert al = driver.switchTo().alert();
       driver.findElement(By.xpath("//button[.='Tryit']")).click();
       al.accept();
       String alarttext = al.getText();
       System.out.println(alarttext);
       
	
}
}
