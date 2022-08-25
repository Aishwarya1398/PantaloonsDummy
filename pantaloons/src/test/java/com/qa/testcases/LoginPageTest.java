package com.qa.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.config.FileLib;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utility.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage lPage;
	HomePage homepage;
	//TestUtil testUtil;
	FileLib lib= new FileLib();
	TestUtil u=new TestUtil();
	
	
//	public LoginPageTest() {
//		super();
//	}
//	@BeforeMethod
//	public void setUp() {
	//	loginPage= new LoginPage();
		//System.out.println("Setting up");
		
	//}
	
	@Test
	public void Logintest() throws InterruptedException {
		lPage = PageFactory.initElements(driver, LoginPage.class);
		
		Thread.sleep(6000);
	
			u.acceptAlert(driver);
			
		lPage.getAllowbtn().click();
		//lPage.Login(prop.getProperty("phoneNumb"));
	}
	
	public void Loginlogo() {
		boolean logo= lPage.validateLoginlogo();
		Assert.assertTrue(logo);	
		}
	
	
	
	@AfterMethod
	public void tearDown() {
//		driver.quit();
	}
}
