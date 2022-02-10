package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.BaseClass;

public class EditLeadPage extends BaseClass {
	
	public EditLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}

	public EditLeadPage updateCompanyName()
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}
	public ViewLeadPage clickOnSubmit()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
