package com.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CustomerLoginPage extends BasePage {

	public CustomerLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//select[@id='userSelect']") 
	WebElement name_dropdown;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement login_btn;

	public void selectname() {
		waitForElementToBeVisible(name_dropdown);
		Select select = new Select(name_dropdown);
		
		List<WebElement> names = select.getOptions();
		for (WebElement name : names) {
			System.out.println(name.getText());
			if (name.getText().equals("Harry Potter")){
				name.click();
			}
		}

	}
public void clickLogin() {
	login_btn.click();
}
}
