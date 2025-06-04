package com.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ManagerPage extends BasePage {

	public ManagerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[@ng-click=\"addCust()\"]")
	WebElement addcustomer_btn;
	@FindBy(xpath = "//button[normalize-space()='Open Account']")
	WebElement openaccount_btn;
	@FindBy(xpath = "//button[normalize-space()='Customers']")
	WebElement customers_btn;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstname_txt;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastname_txt;
	@FindBy(xpath = "//input[@placeholder='Post Code']")
	WebElement postcode_txt;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement addcustomer_submit;
	
	public void addcustomer() {
		addcustomer_btn.click();
		
	}

	public void customers() {
		customers_btn.click();
	}

	public void enter_firstname() {
		firstname_txt.sendKeys("sadhana");
	}

	public void enter_lastname() {
		lastname_txt.sendKeys("kadari");
	}

	public void enter_postcode() {
		postcode_txt.sendKeys("500049");
	}

	public void addcustomer_click() {
		addcustomer_submit.click();
	}

}
