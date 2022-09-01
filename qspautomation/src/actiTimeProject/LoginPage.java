package actiTimeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name ="username") private WebElement usn;
    @FindBy(name ="pwd") private WebElement pass;
    @FindBy(id="loginButton") private WebElement loginButton;
  //initialization
  	public LoginPage(WebDriver driver) 
  	{
  		PageFactory.initElements(driver,this);
  	
  	}
	public WebElement getUsn() {
		return usn;
	}
	public void setUsn(WebElement usn) {
		this.usn = usn;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
    
    
		
	public void validLoginActiTime(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginButton.click();
		
	}	
	}


