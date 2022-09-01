package takeScreenshotDynamically;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseTest {
	WebDriver driver;
	
	public void intialization()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		
	}
	public void failed(String methodName) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\S.shot\\methodName.jpeg");
		
		//	Files.copy(src, dest);
       org.openqa.selenium.io.FileHandler.copy(src, dest);
			
			
		}
	}


