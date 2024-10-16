package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class UserDetails_Data extends TestBase {

	
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
	
	public UserDetails_Data() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void registerUser_Data(String userpassword,String userfirst_name,String userlast_name,String useraddress,String userstates,String userCitys,String usercode,String usermobile ) {
		
		userNamepassword.sendKeys(userpassword);
		userfirstname.sendKeys(userfirst_name);
		userlastname.sendKeys(userlast_name);
		useraddrress.sendKeys(useraddress);
		userstate.sendKeys(userstates);
		usercity.sendKeys(userCitys);
		userzipcode.sendKeys(usercode);
		usermobile_number.sendKeys(usermobile);
		
		
	}
	
	
	public void userCreate() {
		userSubmit.click();
	}
	
	public void userContinue() {
		usercontinue.click();
	}


	public void userpassword(String userpassword) {
		// TODO Auto-generated method stub
		
	}
	
}
