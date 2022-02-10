package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;

public class CreateLeadTest extends BaseClass{

	@BeforeTest
	public void setup()
	{
		FileName = "Sruthi_excel";
	}

	@Test(dataProvider="sendData")
	public void Test_CreateLead(String company, String fname, String lname)
	{
		LoginPage dp = new LoginPage(driver);
		
		dp.enterusername().enterpassword().clickLogin()
		.clickOnCRMSFA()
		.clickonLeads()
		.clickOnCreateLeadTab()
		.enterCompanyName(company).enterFrstName(fname).enterLastName(lname).clickOnSubmit()
		.verifyCreateLead(fname);
		
		
	}
	
}
