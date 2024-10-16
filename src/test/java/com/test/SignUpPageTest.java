package com.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class SignUpPageTest {

	@Test
    public void testNewUserRegisterAndLogin() throws InterruptedException {
	 
		LoginPage lp =new LoginPage();
		Thread.sleep(3000);
		lp.fillname("Vikaas xyxyx");
		Thread.sleep(2000);
		lp.fillemail("abcwexyxyxy@gmail.com");
		Thread.sleep(3000);
		lp.clickSignUp();
		//Assert.fail();
		
 }
	
}
