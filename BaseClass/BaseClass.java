package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import BaseClass.ReadExcel;

public class BaseClass {
	public RemoteWebDriver driver;
	public String FileName;
	public static String DeleteleadID;
	@BeforeMethod
	public void preconditions()
	{
		 	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		  
			System.out.println(driver);
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public void postconditions()
	{
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException
	{
	  return ReadExcel.readExcel(FileName);
		
	}

}
