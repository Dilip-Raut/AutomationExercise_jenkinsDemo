package com.test;

import org.testng.annotations.Test;


import com.pages.UserDetails;

public class UserRegistrationDetailsTest {

	@Test
    public void testUserRegistrationDetailsTest() throws InterruptedException {
	 
	 UserDetails ud =new UserDetails();
	 
	    Thread.sleep(2000);
		ud.userpassword("12345k6");
		Thread.sleep(2000);
		ud.userfirst_name("Ajauyfg");
		Thread.sleep(2000);
		ud.userlast_name("patelsdca");
		Thread.sleep(2000);
		ud.userAddress("ngpss");
		Thread.sleep(2000);
		ud.userstate("MHss");
		Thread.sleep(2000);
		ud.usercitys("NGPss");
		Thread.sleep(2000);
		ud.userZipCode("11223333");
		Thread.sleep(2000);
		ud.userMobile("1245647");
		Thread.sleep(2000);
		ud.userCreate();
		Thread.sleep(2000);
		ud.userContinue();
		Thread.sleep(2000);
		
 }
	
}
