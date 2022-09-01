package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorNet {
	public static void main(String[] args) throws InterruptedException {
		String actualValue="333";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://calculator.net");
		Thread.sleep(5000);
		WebElement a1 = driver.findElement(By.xpath("//span[.='1']"));
		a1.click();a1.click();a1.click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[.='+']")).click();
		WebElement a2 = driver.findElement(By.xpath("//span[.='2']"));
		a2.click();a2.click();a2.click();
		Thread.sleep(2000);
		 String sum = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println(actualValue.equals(sum));
		
		
		
	}

}
