package Test;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;

public class loginTest extends BaseClass{

	@Test
	public void Test_Login()
	{	
		LoginPage lp = new LoginPage(driver);
		
		lp.enterusername().enterpassword().clickLogin();
		
		
		
	}
	
}
