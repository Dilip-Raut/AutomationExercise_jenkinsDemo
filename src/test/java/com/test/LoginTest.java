package com.test;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;

public class LoginTest extends TestBase {

	 @Test
	    public void testClickRegisterAndLogin() {
		 
		 HomePage hp =new HomePage();
		 hp.clickLogin();
	 }
}
