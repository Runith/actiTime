package com.actiTIME.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTIME.generics.BaseClass;
import com.actiTIME.pom.TasksListPage;
import com.actiTIME.pom.TimetrackPage;

@Listeners(com.actiTIME.generics.ListenerImplementation.class)
public class CreateTask extends BaseClass{
@Test
public void testCreateTask() throws EncryptedDocumentException, IOException, InterruptedException {
	String CustomerName = f.getExceldata("CreateTask", 1, 0);
	String ProjectName = f.getExceldata("CreateTask", 1, 1);
	String TaskName = f.getExceldata("CreateTask", 1, 2);
	TimetrackPage t = new TimetrackPage(driver);
	t.getTasksTab().click();
	TasksListPage tt = new TasksListPage(driver);
	tt.getAddnewBtn().click();
	tt.getNewTasksBtn().click();
	Thread.sleep(1000);
	tt.getSelectCustomeropt().click();
	Thread.sleep(500);
	tt.getNewCustomerBtn2().click();
	tt.getCustomerNametbx2().sendKeys(CustomerName);
	tt.getProjectNametbx().sendKeys(ProjectName);
	tt.getTaskNameTbx().sendKeys(TaskName);
	tt.getCreateTasksBtn().click();
	
	

}
	

}
