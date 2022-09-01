package pageObjectModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SettingsActiTime extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		
		lp.validLoginActiTime(flib.readPropertFile(PROP_PATH, "username"), flib.readPropertFile(PROP_PATH, "password"));
		driver.findElement(By.xpath("//div[text()='Settings'] /ancestor :: td[@class='navItem relative']")).click();
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[13]/div/div/table/tbody/tr/td[6]/nobr/a")).click();
		WebElement ops = driver.findElement(By.name("colorScheme"));
		Select sel = new Select(ops);
		sel.selectByValue("red");
		driver.findElement(By.id("FormModifiedDivButton")).click(); 
		
		
		
		
	}

}
