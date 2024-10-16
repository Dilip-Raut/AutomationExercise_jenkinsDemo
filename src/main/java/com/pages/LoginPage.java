package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {

	
	
	@FindBy(name="name")
	WebElement signUp_name;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	WebElement signUp_email;
	
	@FindBy(xpath = "//button[text()='Signup']")
	WebElement signUp;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
		
	public void fillname(String userName) {
		signUp_name.sendKeys(userName);
	}
	
	public void fillemail(String usermail) {
		signUp_email.sendKeys(usermail);
	}
	
	public void clickSignUp() {
		signUp.click();
	}
	
}
