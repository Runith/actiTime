package com.actiTIME.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
	
	@FindBy(xpath="//a[@id='ext-gen9']")
	private WebElement sortbtn;
	
	@FindBy(xpath="//a[@id='ext-comp-1003']")
	private WebElement Byreportnameopt;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement TasksTab;
	
	@FindBy(id="container_tt")
	private WebElement Timetracktab;
	
	public ReportsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSortbtn() {
		return sortbtn;
	}

	public WebElement getByreportnameopt() {
		return Byreportnameopt;
	}

	public WebElement getTasksTab() {
		return TasksTab;
	}

	public WebElement getTimetracktab() {
		return Timetracktab;
	}

	

}
