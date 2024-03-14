package com.sevenrmartsupermarket.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.PageUtility;

public class DeliveryBoyPage {

	WebDriver driver;

	Properties properties = new Properties();

	PageUtility pageUtility = new PageUtility(driver);

	@FindBy(xpath = "//i[@class='nav-icon fas fa-user-plus']")
	WebElement manageDeliveryBoy;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newLink;

	@FindBy(xpath = "//input[@id='name']")
	WebElement nameField;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailField;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement phoneNumberField;

	@FindBy(xpath = "//textarea[@id='address']")
	WebElement addressField;

	@FindBy(xpath = "//input[@id='username']")
	WebElement usernameField;

	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordField;

	@FindBy(xpath = "//button[@name='create']")
	WebElement saveButton;

	/*
	 * @FindBy(xpath = "//a[@type='button']") WebElement cancel;
	 */

	public DeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnManageDeliveryboy() {
		manageDeliveryBoy.click();
	}

	public void clickOnAddNewDeliveryboy() {
		newLink.click();
	}

	public void enterName(String Name) {
		nameField.sendKeys(Name);
	}

	public void enterEmail(String Email) {
		emailField.sendKeys(Email);
	}

	public void enterPhoneNumber(String PhoneNo) {
		phoneNumberField.sendKeys(PhoneNo);
	}

	public void enterAddress(String Address) {
		addressField.sendKeys(Address);
	}

	public void enterUsername(String UserName) {
		usernameField.sendKeys(UserName);
	}

	public void enterPassword(String Password) {
		passwordField.sendKeys(Password);
	}

	public void scrollpage() {
		pageUtility = new PageUtility(driver);
		pageUtility.scrolldown(saveButton);
		System.out.println("Scrolled down");
	}

	public void clickOnSave() {
		pageUtility.moveMouse(saveButton);
		saveButton.click();
	}

	public void addNewDeliveryBoy(String Name, String Email, String PhoneNo, String Address, String UserName,
			String Password) {

		clickOnManageDeliveryboy();
		clickOnAddNewDeliveryboy();

		enterName(Name);
		enterEmail(Email);
		enterPhoneNumber(PhoneNo);
		enterAddress(Address);
		enterUsername(UserName);
		enterPassword(Password);
		scrollpage();

		clickOnSave();
	}

}
