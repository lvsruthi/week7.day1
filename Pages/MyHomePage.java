package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.BaseClass;

public class MyHomePage extends BaseClass {


	public MyHomePage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public LeadPage clickonLeads()
	{
	driver.findElement(By.linkText("Leads")).click();
	return new LeadPage(driver);
	}
}
