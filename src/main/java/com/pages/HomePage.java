package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase  {

	@FindBy(xpath = "//a[contains(text(),'Signup')]")
	WebElement Login;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin() {
		Login.click();
	}
	
	public boolean isHomePageDisplayed() {
        return Login.isDisplayed();
    }
}
