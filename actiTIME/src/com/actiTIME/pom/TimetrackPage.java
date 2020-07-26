package com.actiTIME.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimetrackPage {
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement TasksTab;
	
	@FindBy(id="container_reports")
	private WebElement 	ReportsTab;
	

	public TimetrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout() {
		logout.click();
	}

	public WebElement getTasksTab() {
		return TasksTab;
	}

	public WebElement getReportsTab() {
		return ReportsTab;
	}


}
