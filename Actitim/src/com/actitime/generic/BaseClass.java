package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	

	@BeforeTest
	public void OpenBrowser()
	{
		Reporter.log("Open Browser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		Reporter.log("Close Browser",true);
		driver.quit();
	}
	@BeforeMethod
	public void Login() throws IOException
	{
		Reporter.log("Login",true);
		FileLib f = new FileLib();
		driver.get(f.getPropertyData("url"));
		LoginPage l=new LoginPage(driver);
		l.setLogin(f.getPropertyData("username"), f.getPropertyData("password"));
	}
	
	@AfterMethod
	public void Logout()
	
	{
		Reporter.log("Logout",true);
		HomePage h=new HomePage(driver);
		h.setLogout();
	}


}
