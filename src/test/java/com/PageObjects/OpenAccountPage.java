package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage extends BasePage {

	public OpenAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[normalize-space()='Open Account']")
	WebElement openaccount_btn;
	@FindBy(id = "userSelect")
	WebElement customer_dropdown;

	@FindBy(id = "currency")
	WebElement currency_dropdown;

	@FindBy(xpath = " //button[normalize-space()='Process']")
	WebElement process_btn;

	public void openaccount() {
		openaccount_btn.click();
	}

	public void select_customer() {

		Select select = new Select(customer_dropdown);
		customer_dropdown.click();
		select.selectByVisibleText("Harry Potter");
	}

	public void select_currency() {
		Select currency = new Select(currency_dropdown);
		currency_dropdown.click();
		currency.selectByVisibleText("Rupee");
	}

	public void click_process() {
		process_btn.click();
	}

}
