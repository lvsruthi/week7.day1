package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.BaseClass;

public class LeadPage extends BaseClass {
	
	public LeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateLeadPage clickOnCreateLeadTab()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	public FindLeadPage clickOnFindLeadTab()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);
	}
	public MergeLeadPage clickOnMergeLeadTab() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage(driver);
	}
}
