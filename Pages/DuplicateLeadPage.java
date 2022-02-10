package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.BaseClass;

public class DuplicateLeadPage extends BaseClass{

	public DuplicateLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public ViewLeadPage clickonCreateLead_duplicate()
	{
		
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
}
