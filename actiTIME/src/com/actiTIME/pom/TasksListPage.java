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


}
