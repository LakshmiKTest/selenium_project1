package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[text()=\"Sample Form\"]")
	WebElement sampleform_btn;
	@FindBy(xpath = "//button[text()=\"Bank Manager Login\"]")
	WebElement bankmanagerlogin_btn;

	public void sampleform_click() {
		sampleform_btn.click();

	}
	public void bankmanagerlogin_click() {
		bankmanagerlogin_btn.click();
	}

}
