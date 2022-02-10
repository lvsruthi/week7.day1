package Pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import BaseClass.BaseClass;
import Test.EditLeadTest;

public class FindLeadPage extends BaseClass{
	
	
	public FindLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public FindLeadPage clickonPhoneTab()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
			return this;
	}
	public FindLeadPage inputPhoneNumber()
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
			return this;
	}
	public FindLeadPage ClickOnFindLeads()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			return this;
	}
	public ViewLeadPage clickonFirstRecurring() throws InterruptedException
	{
		Thread.sleep(2000);
		DeleteleadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println(DeleteleadID);
		return new ViewLeadPage(driver);
	}
	
	public FindLeadPage enterLeadToDelete()
	{
		System.out.println("in enter block "+ DeleteleadID);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(DeleteleadID);
		return this;
	}
	public FindLeadPage verifyIfLeadDeleted() throws InterruptedException
	{
		Thread.sleep(1000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println("Test is"+ text);
		/*
		 * if (text.equals("No records to display")) {
		 * System.out.println("Text matched"); } else {
		 * System.out.println("Text not matched"); }
		 */
		Assert.assertEquals(text,"No records to display");
		return this;
	}
	
	
	
}
