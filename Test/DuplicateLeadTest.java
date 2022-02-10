package Test;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;

public class DuplicateLeadTest extends BaseClass {

	@Test
	public void duplicateLead() throws InterruptedException
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
		.clickOnDuplicate()
		.clickonCreateLead_duplicate();
	}
}
