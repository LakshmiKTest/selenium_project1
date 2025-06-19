package com.PageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[normalize-space()='Transactions']")
	WebElement transaction_btn;
	@FindBy(xpath = "//button[normalize-space()='Deposit']")
	WebElement deposit_button;
	@FindBy(xpath = "//button[normalize-space()='Withdrawl']")
	WebElement withdrawl_btn;
	@FindBy(xpath = "//button[normalize-space()='Logout']")
	WebElement logout_btn;
	@FindBy(xpath = "//input[@placeholder='amount']")
	WebElement amount_textarea;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit_btn;
	@FindBy(xpath = "//span[text()=\"Deposit Successful\"]")
	WebElement success_mesg;

	public void transactions() {
		transaction_btn.click();
	}

	public void deposits() {
		deposit_button.click();
	}

	public void withdrawl() {
		withdrawl_btn.click();
	}

	public void enterAmount(String amount) {
		amount_textarea.sendKeys("amount");

	}

	public void enterSubmit() {
		submit_btn.click();
	}

	public void amountDeposited() {
		String mesg = success_mesg.getText();
		if (mesg.equalsIgnoreCase("Deposit Successful")) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}
}
