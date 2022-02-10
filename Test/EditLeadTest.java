package Test;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;

public class EditLeadTest extends BaseClass {

	
	@Test
	public void editLead() throws InterruptedException
	{
	LoginPage dp = new LoginPage(driver);
		
		dp.enterusername().enterpassword().clickLogin()
		.clickOnCRMSFA()
		.clickonLeads()
		.clickOnFindLeadTab()
		.clickonPhoneTab()
		.inputPhoneNumber()
		.ClickOnFindLeads()
		.clickonFirstRecurring()
		.ClickOnEdit()
		.updateCompanyName()
		.clickOnSubmit();
	}
	
}
