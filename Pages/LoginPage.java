package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseClass {
	
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}

	public LoginPage enterusername()
	{
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
	}
	public LoginPage enterpassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public HomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
	
	
}
