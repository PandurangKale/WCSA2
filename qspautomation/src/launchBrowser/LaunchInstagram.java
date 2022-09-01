

package launchBrowser;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchInstagram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();//open the browser
	driver.get("http://www.instagram.com");
	Thread.sleep(5000);//dellay of sec
	driver.close();//close browser
}
}
