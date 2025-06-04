package com.testcases;

import org.testng.annotations.Test;

import com.Basetest.BaseClass;
import com.PageObjects.HomePage;
import com.PageObjects.RegistrationPage;

public class TC001_ClickSampleform extends BaseClass {
	@Test
	public void clickSampleFormBtn() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.sampleform_click();
		RegistrationPage rp = new RegistrationPage(driver);
		rp.setfirstname();
		rp.setlastname();
		rp.setemail();
		rp.setpassword();
		rp.clickchkbox();

		rp.selectDropDown();

		rp.enterTextArea();
		rp.clickRegisterBtn();

		rp.regSucessMesg();

	}

}
