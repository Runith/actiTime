package com.actiTIME.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actiTIME.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
	}
	public static WebDriver driver;
	public FileLib f=new FileLib();
	
	@BeforeTest
	public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeBrowser() {
	driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException {
	String url = f.getPropertyData("url");
    String usn = f.getPropertyData("usn");
    String pwd = f.getPropertyData("pwd");
    driver.get(url);
    LoginPage l=new LoginPage(driver);
    l.setlogin(usn, pwd);
	}
    
    @AfterMethod
    public void logout() {
    	
    
	}
	

}
