package Test;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;

public class MergeLeadTest extends BaseClass {

	
	@Test
	public void MergeLead() throws InterruptedException
	{
	LoginPage dp = new LoginPage(driver);
		
		dp.enterusername().enterpassword().clickLogin()
		.clickOnCRMSFA()
		.clickonLeads()
		.clickOnMergeLeadTab()
		.selectFromLead()
		.selectToLead()
		.clickonMerge();
	}
	
}
