package com.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Basetest.BaseClass;
import com.PageObjects.HomePage;
import com.PageObjects.ManagerPage;
import com.PageObjects.OpenAccountPage;

import utilities.AddCustomersExcelReader;

public class TC002_ManagerLogin extends BaseClass {

	@BeforeClass
	public void beforeTestCase() {
		HomePage hp = new HomePage(driver);
		hp.bankmanagerlogin_click();

	}

	@Test(dataProvider = "addCustomers", dataProviderClass = AddCustomersExcelReader.class)
	public void addCustomer(String firstname, String lastname, String postcode) throws InterruptedException {

		ManagerPage mp = new ManagerPage(driver);
		mp.addcustomer();
		mp.enter_firstname(firstname);
		mp.enter_lastname(lastname);
		mp.enter_postcode(postcode);
		mp.addcustomer_click();
		String actual_cnf_message = driver.switchTo().alert().getText();
		String expected_cnf_msg = "Customer added successfully with customer id";
		if (actual_cnf_message.contains(expected_cnf_msg)) {
			assertTrue(true);
		}
		driver.switchTo().alert().accept();

	}

	/*
	 * @Test public void openAccount() throws InterruptedException {
	 * 
	 * 
	 * HomePage hp = new HomePage(driver);
	 * 
	 * 
	 * OpenAccountPage op = new OpenAccountPage(driver); op.openaccount();
	 * op.select_customer(); Thread.sleep(5000); op.select_currency();
	 * Thread.sleep(5000); op.click_process(); Thread.sleep(5000); String
	 * alert_mesg= driver.switchTo().alert().getText(); String
	 * mesg="Account created successfully with account Number";
	 * if(alert_mesg.contains(mesg)) { assertTrue(true);
	 * 
	 * } else { assertTrue(false); } driver.switchTo().alert().accept();
	 * hp.homebtn();
	 * 
	 * }
	 */

}
