package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtributeMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		String attributeValue = searchBox.getAttribute("title");
		System.out.println(attributeValue);
		Thread.sleep(5000);
	
	}

}
