package com.actiTIME.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement usntbx;
	
	@FindBy(name="pwd")
	private WebElement pwdtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//a[@id='toPasswordRecoveryPageLink']")
	private WebElement forgotyourpwdlink;
	
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);		
	}
	
	public void setlogin(String usn, String pwd) throws InterruptedException {
		usntbx.sendKeys(usn);
		Thread.sleep(1000);
		pwdtbx.sendKeys(pwd);
		loginbtn.click();
	}

	public WebElement getForgotyourpwdlink() {
		return forgotyourpwdlink;
	}

}
