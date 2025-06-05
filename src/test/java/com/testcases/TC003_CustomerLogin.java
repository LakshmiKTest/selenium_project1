package com.testcases;

import org.testng.annotations.Test;

import com.Basetest.BaseClass;
import com.PageObjects.CustomerLoginPage;
import com.PageObjects.HomePage;

public class TC003_CustomerLogin extends BaseClass {
	@Test
	public void customer_login() {
		HomePage hp = new HomePage(driver);
		hp.customerLogin();
		CustomerLoginPage cl = new CustomerLoginPage(driver);

		cl.selectname();
		cl.clickLogin();
	}
}
