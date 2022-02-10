package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import BaseClass.BaseClass;

public class ViewLeadPage extends BaseClass{


	public ViewLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public ViewLeadPage verifyCreateLead(String firstname)
	{
		String FrstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(firstname, FrstName);
		return this;
	}
	public EditLeadPage ClickOnEdit()
	{
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	public DuplicateLeadPage clickOnDuplicate()
	{	
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}
	public LeadPage clickOnDelete()
	{	
		driver.findElement(By.linkText("Delete")).click();
		return new LeadPage(driver);
	}
	
	
	
	
}
