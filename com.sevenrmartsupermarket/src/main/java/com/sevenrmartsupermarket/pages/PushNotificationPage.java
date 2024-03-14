package com.sevenrmartsupermarket.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushNotificationPage {
	WebDriver driver;

	Properties properties = new Properties();

	@FindBy(xpath = "//i[@class='nav-icon fas fa-fas fa-bell']")
	WebElement pushNotification;

	@FindBy(xpath = "//input[@name='titlep']")
	WebElement enterTitleField;

	@FindBy(xpath = "//input[@name='description']")
	WebElement enterDescription;

	@FindBy(xpath = "//button[@name='create']")
	WebElement sendButton;

	@FindBy(xpath = "//a[text()='Reset']")
	WebElement resetButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMessageBox;

	public PushNotificationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickPushNotification() {
		pushNotification.click();
	}

	public void enterTitleMessage(String title) {
		enterTitleField.sendKeys(title);
	}

	public void enterDescriptionMessage(String description) {
		enterDescription.sendKeys(description);
	}

	public void clickSendButton() {
		sendButton.click();
	}

	public void displayAlertMessage() {
		alertMessageBox.isDisplayed();
	}

	public void sendNotifications(String title, String description) {
		clickPushNotification();
		enterTitleMessage(title);
		enterDescriptionMessage(description);
		clickSendButton();
		displayAlertMessage();

	}

}
