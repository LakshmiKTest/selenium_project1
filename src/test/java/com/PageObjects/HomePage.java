package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	
	}
    @FindBy(xpath = "//a[text()=\"Sample Form\"]") WebElement sampleform_btn;
    public void sampleform_click() {
    	sampleform_btn.click();
    }
	

}
