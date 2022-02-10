package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateLeadPage enterCompanyName(String company)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;
	}
	public CreateLeadPage enterFrstName(String frstname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(frstname);
		return this;
	}
	public  CreateLeadPage enterLastName(String lastname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;
	}
	public ViewLeadPage clickOnSubmit()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
		
	}

}
