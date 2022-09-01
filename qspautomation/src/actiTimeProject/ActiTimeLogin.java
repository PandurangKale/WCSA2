package actiTimeProject;

import java.io.IOException;

public class ActiTimeLogin extends ActTest  {
	public static void main(String[] args) throws IOException, InterruptedException {
		ActTest bt = new ActTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		ActLab lab=new ActLab();
		lp.validLoginActiTime(lab.readPropertFile(PROP_PATH, "username"), lab.readPropertFile(PROP_PATH, "password"));
		AdminCreatsCustomer crt = new AdminCreatsCustomer();
		crt.adminCreatCustomer();
	}
	
	

}
