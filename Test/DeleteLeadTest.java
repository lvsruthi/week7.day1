package Test;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;

public class DeleteLeadTest extends BaseClass {

	@Test
	public void deleteLead() throws InterruptedException
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
		.clickOnDelete()
		.clickOnFindLeadTab()
		.enterLeadToDelete()
		.ClickOnFindLeads()
		.verifyIfLeadDeleted();
	}
}
