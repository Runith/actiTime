package com.actiTIME.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTIME.generics.BaseClass;
import com.actiTIME.pom.ReportsPage;
import com.actiTIME.pom.TasksListPage;
import com.actiTIME.pom.TimetrackPage;
@Listeners(com.actiTIME.generics.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		String ExpectedcustomerName = f.getExceldata("CreateCustomer", 1, 0);
		String Customerdescription = f.getExceldata("CreateCustomer", 1, 1);
		TimetrackPage tt=new TimetrackPage(driver);
		tt.getReportsTab().click();
		Thread.sleep(4000);
		ReportsPage r=new ReportsPage(driver);
		r.getSortbtn().click();
		Thread.sleep(1000);
		r.getByreportnameopt().click();
		r.getTasksTab().click();
		Thread.sleep(3000);
		TasksListPage t=new TasksListPage(driver);
		t.getAddnewBtn().click();
		t.getNewCustomerBtn().click();
		t.getCustomerNametbx().sendKeys(ExpectedcustomerName);
		t.getCustomerDescTbx().sendKeys(Customerdescription);
		t.getSelectCustomerDropdown().click();
		t.getBigBagcompanyopt().click();
		t.getCreateCutomerBtn().click();
		Thread.sleep(4000);
		String ActualcustomerNameCreated = t.getVerifyCustomerName().getText();
		assertEquals(ActualcustomerNameCreated, ExpectedcustomerName);
				
		
	}
	
}
