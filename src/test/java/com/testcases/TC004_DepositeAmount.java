package com.testcases;


import org.testng.annotations.Test;

import com.Basetest.BaseClass;
import com.PageObjects.AccountPage;
import com.PageObjects.CustomerLoginPage;
import com.PageObjects.HomePage;

import utilities.AmountDepositExelReader;

public class TC004_DepositeAmount extends BaseClass {
	@Test(dataProvider = "exceladata",dataProviderClass = 
			AmountDepositExelReader.class)
	
	public void depositeAmount(String amount) throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.customerLogin();
		CustomerLoginPage cl=new CustomerLoginPage(driver);
		Thread.sleep(5000);
		cl.selectname();
		cl.clickLogin();
		
		AccountPage ap=new AccountPage(driver);
		Thread.sleep(5000);
		ap.deposits();
		ap.enterAmount(amount);
		ap.enterSubmit();
		ap.amountDeposited();
	}
	

}
