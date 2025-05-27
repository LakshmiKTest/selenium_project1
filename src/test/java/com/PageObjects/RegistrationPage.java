package com.PageObjects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {
	//constructor
	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "firstName") WebElement firstname;
	@FindBy(id = "lastName") WebElement lastname;
	@FindBy(id="email") WebElement email;
	@FindBy(id = "password")  WebElement password;
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]") List<WebElement> chkboxes;
	//@FindBy(xpath = "//select[@id=\"gender\"]/option") List<WebElement> dropdownoptions;
	@FindBy(xpath = "//select[@id=\"gender\"]") WebElement dropdownelement;
	Select dropdown=new Select(dropdownelement);
	@FindBy(id = "about") WebElement textarea;
	@FindBy(xpath = "//button[text()=\"Register\"]") WebElement register;
	@FindBy(id = "successMessage") WebElement regsucess;
	
	 
	public void setfirstname() {
		firstname.sendKeys("lakshmiram");
	}
	public void setlastname() {
		lastname.sendKeys("kadari");
	}
	public void setemail() {
		email.sendKeys("lakshmir.k@gmail.com");
	}
	
	public void setpassword() {
		password.sendKeys("kadari1234");
	}
	
	public void clickchkbox() {
		for (WebElement chkbox: chkboxes) {
		String value=	chkbox.getAttribute("value");
		if(value.equalsIgnoreCase("Reading")|| value
				.equalsIgnoreCase("Traveling")) {
			chkbox.click();
		}
		}
	}
	public void selectDropDown() {
		
		dropdown.selectByVisibleText("Female");
	}
	public void enterTextArea() {
		textarea.sendKeys("intrested in exploring things");
	}
	public void clickRegisterBtn() {
		register.click();
	}
	public void regSucessMesg() {
	String mesg=regsucess.getText();
	System.out.println(mesg);
	assertEquals(mesg, "User registered successfully!");
	}
	
}
