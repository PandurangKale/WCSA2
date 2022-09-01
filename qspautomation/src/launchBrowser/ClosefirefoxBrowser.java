package launchBrowser;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosefirefoxBrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();//open the browser
	Thread.sleep(5000);//dellay of sec
	driver.close();//close browser
}
}
