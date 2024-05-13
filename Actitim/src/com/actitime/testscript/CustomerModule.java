package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaksListPage;
@Listeners(com.actitime.generic.ListnerImplementation.class)
public class CustomerModule extends BaseClass  {
	
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("Create Customer",true);
		HomePage h=new HomePage(driver);
		Thread.sleep(2000);
		//Click on Task List major tab
		h.getTaskBtn().click();
		TaksListPage t=new TaksListPage(driver);
		//Click on add new button
		t.getAddNewBtn().click();
		Thread.sleep(2000);
		//Click on new customer option 
		t.getNewCustBtn().click();
		//Enter HDFC_001 in customer name text field
		FileLib f=new FileLib();
		String expectedCustName = f.getExcelData("CreateCustomer", 1, 2);
		String custDesc = f.getExcelData("CreateCustomer", 1, 3);
		t.getCustNameTbx().sendKeys(expectedCustName);
		//Enter Banking Customer inside the customer description test area
		t.getCustDescTextArea().sendKeys(custDesc);
		//Click on Customer drop down
		t.getCustomerDD().click();
		Thread.sleep(2000);
		//Click on our company option from drop down
		t.getOurCompanyOption().click();
		Thread.sleep(2000);
		//Click on create customer button 
		t.getCretCustBtn().click();Thread.sleep(2000);
		String actualCustName = t.getActualCustomerCreated().getText();
		Assert.assertEquals(actualCustName, expectedCustName);
	
	}

}
