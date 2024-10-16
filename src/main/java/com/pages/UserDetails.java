package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class UserDetails extends TestBase {

	
	@FindBy(id="password")
	WebElement userNamepassword;
	
	@FindBy(id="first_name")
	WebElement userfirstname;
	
	@FindBy(id="last_name")
	WebElement userlastname;
	
	@FindBy(id="address1")
	WebElement useraddrress;
	
	
	@FindBy(id="state")
	WebElement userstate;
	
	@FindBy(id="city")
	WebElement usercity;
	
	@FindBy(id="zipcode")
	WebElement userzipcode;
	
	@FindBy(id="mobile_number")
	WebElement usermobile_number;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement userSubmit;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement usercontinue;
	
	//a[text()='Continue']
	
	public UserDetails() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void userpassword(String userpassword) {
		userNamepassword.sendKeys(userpassword);
	}
	
	public void userfirst_name(String userfirst_name) {
		userfirstname.sendKeys(userfirst_name);
	}
	
	public void userAddress(String useraddress) {
		useraddrress.sendKeys(useraddress);
	}
	
	public void userlast_name(String userlast_name) {
		userlastname.sendKeys(userlast_name);
	}
	
	public void userstate(String userstates) {
		userstate.sendKeys(userstates);
	}
	
	public void usercitys(String userCitys) {
		usercity.sendKeys(userCitys);
	}
	
	public void userZipCode(String usercode) {
		userzipcode.sendKeys(usercode);
	}
	
	public void userMobile(String usermobile) {
		usermobile_number.sendKeys(usermobile);
	}
	
	public void userCreate() {
		userSubmit.click();
	}
	
	public void userContinue() {
		usercontinue.click();
	}
	
}
