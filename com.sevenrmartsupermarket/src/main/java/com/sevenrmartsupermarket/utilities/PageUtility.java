package com.sevenrmartsupermarket.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	WebDriver driver;

	Select select;
	Actions actions;

	public PageUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void selectIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectVisibleText(WebElement element, String visibletext) {
		select = new Select(element);
		select.selectByVisibleText(visibletext);
	}

	public void moveMouse(WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element).build().perform();

	}

	public void scrolldown(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", element);

		// JavascriptExecutor js= (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,6000)");
		// js.executeScript("arguments[0].click();",element);

	}
}
