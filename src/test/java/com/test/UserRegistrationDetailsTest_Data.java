package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.UserDetails_Data;
import com.utils.ExcelUtility;

public class UserRegistrationDetailsTest_Data {

	@Test(dataProvider = "getUserData")
    public void testUserRegistrationDetailsTest_data(String userpassword,String userfirst_name,String userlast_name,String useraddress,String userstates,String userCitys,String usercode,String usermobile) throws InterruptedException {
	 
	 UserDetails_Data udt =new UserDetails_Data();
	 
	    udt.registerUser_Data(userpassword, userfirst_name, userlast_name, useraddress, userstates, userCitys, usercode, usermobile);
		Thread.sleep(2000);
		udt.userCreate();
		Thread.sleep(2000);
		udt.userContinue();
		Thread.sleep(2000);
		
 }
	
	 @DataProvider
	    public Object[][] getUserData() {
	        Object[][] userData = ExcelUtility.getExcelData("userData");
	        return userData;
	    }
	
}
