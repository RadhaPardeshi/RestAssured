package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	public WebElement untbx;

	@FindBy(name="pwd")
	public WebElement pwtbx;

	@FindBy(xpath="//div[text()='Login ']")
	public WebElement lgbtn;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setLogin(String un,String pwd)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		lgbtn.click();
	}

}
