package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.BaseClass;

public class HomePage extends BaseClass {
	

	public HomePage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public MyHomePage clickOnCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
}
