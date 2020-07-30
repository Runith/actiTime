package com.actiTIME.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksListPage {
	@FindBy(xpath="(//div[@class='downIcon'])[1]")
	private WebElement AddnewBtn;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement NewCustomerBtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement CustomerNametbx;
	
	@FindBy(xpath="(//textarea[@class='textarea'])[9]")
	private WebElement CustomerDescTbx;
	
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement SelectCustomerDropdown;
	
	@FindBy(xpath="(//div[@class='itemRow cpItemRow '])[2]")
	private WebElement BigBagcompanyopt;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement CreateCutomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement VerifyCustomerName;
	
	@FindBy(id="container_reports")
	private WebElement 	ReportsTab;
	
	@FindBy(id="container_tt")
	private WebElement Timetracktab;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement NewTasksBtn;
	
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
	private WebElement SelectCustomeropt;
	
	@FindBy(xpath="//div[text()='- New Customer -']")
	private WebElement NewCustomerBtn2;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement CustomerNametbx2;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement ProjectNametbx;
	
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder'])[1]")
	private WebElement TaskNameTbx;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement CreateTasksBtn;
	

	
	public TasksListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}



	public WebElement getAddnewBtn() {
		return AddnewBtn;
	}



	public WebElement getNewCustomerBtn() {
		return NewCustomerBtn;
	}



	public WebElement getCustomerNametbx() {
		return CustomerNametbx;
	}



	public WebElement getCustomerDescTbx() {
		return CustomerDescTbx;
	}



	public WebElement getSelectCustomerDropdown() {
		return SelectCustomerDropdown;
	}



	public WebElement getBigBagcompanyopt() {
		return BigBagcompanyopt;
	}



	public WebElement getCreateCutomerBtn() {
		return CreateCutomerBtn;
	}



	public WebElement getVerifyCustomerName() {
		return VerifyCustomerName;
	}



	public WebElement getReportsTab() {
		return ReportsTab;
	}



	public WebElement getTimetracktab() {
		return Timetracktab;
	}
	
	
	public WebElement getNewTasksBtn() {
		return NewTasksBtn;
	}



	public WebElement getSelectCustomeropt() {
		return SelectCustomeropt;
	}



	public WebElement getNewCustomerBtn2() {
		return NewCustomerBtn2;
	}



	public WebElement getCustomerNametbx2() {
		return CustomerNametbx2;
	}



	public WebElement getProjectNametbx() {
		return ProjectNametbx;
	}



	public WebElement getTaskNameTbx() {
		return TaskNameTbx;
	}



	public WebElement getCreateTasksBtn() {
		return CreateTasksBtn;
	}





}
