package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaksListPage 

{
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustBtn;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement custNameTbx;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement custDescTextArea;
	
	@FindBy(xpath="//button[@class='x-btn-text']")
	private WebElement customerDD;
	
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement ourCompanyOption;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement cretCustBtn;
	
	@FindBy(xpath="//div[@class='navigationLinks']/../div[2]")
	private WebElement actualCustomerCreated;
	
	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}

	public TaksListPage(WebDriver driver)
	{PageFactory.initElements(driver, this);}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustBtn() {
		return newCustBtn;
	}

	public WebElement getCustNameTbx() {
		return custNameTbx;
	}

	public WebElement getCustDescTextArea() {
		return custDescTextArea;
	}

	public WebElement getCustomerDD() {
		return customerDD;
	}

	public WebElement getOurCompanyOption() {
		return ourCompanyOption;
	}

	public WebElement getCretCustBtn() {
		return cretCustBtn;
	}
}
