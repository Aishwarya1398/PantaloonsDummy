package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{

	//pageFactory - 
	
	@FindBy(xpath="//button[contains(text(),'Allow')]")
	private WebElement allowbtn;
	
	public WebElement getAllowbtn() {
		return allowbtn;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public void setAllowbtn(WebElement allowbtn) {
		this.allowbtn = allowbtn;
	}

	public void setMyAccount(WebElement myAccount) {
		this.myAccount = myAccount;
	}

	public void setPhone(WebElement phone) {
		this.phone = phone;
	}

	public void setGetOtp(WebElement getOtp) {
		this.getOtp = getOtp;
	}

	public void setStartshopping(WebElement startshopping) {
		this.startshopping = startshopping;
	}

	public void setLoginLogo(WebElement loginLogo) {
		this.loginLogo = loginLogo;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getGetOtp() {
		return getOtp;
	}

	public WebElement getStartshopping() {
		return startshopping;
	}

	public WebElement getLoginLogo() {
		return loginLogo;
	}

	@FindBy(xpath="//a[@title='My Account']")
	private WebElement myAccount;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(xpath="//span[@class='MuiButton-label']")
	private WebElement getOtp;
	
	@FindBy(xpath="//span[contains(text(),'Start Shopping')]")
	private WebElement startshopping;
	
	@FindBy(xpath="//h1[contains(text(),'Login/Register')]")
	private WebElement loginLogo;
	
//	//initialization
//	public LoginPage() {
//		PageFactory.initElements(driver, this);
//	}
	
	//Actions
	public boolean validateLoginlogo() {
		return loginLogo.isDisplayed();
	}
	
	//public String validateLoginTitle() {
		//return driver.getTitle();
	// }
	
	public void Login(String phNo) throws InterruptedException {
//		allowbtn.click();
		myAccount.click();
		Thread.sleep(20000);
		phone.sendKeys(phNo);
		getOtp.click();
		Thread.sleep(80000);		
		startshopping.click();
		Thread.sleep(20000);
	}
}
