package com.sevenrmartsupermarket.tests;

import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.HomePage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.PushNotificationPage;
import com.sevenrmartsupermarket.utilities.Excel;

public class PushNotificationTest extends Base {

	LoginPage loginpage;
	HomePage homepage;
	PushNotificationPage pushNotificationPage;

	Excel excel = new Excel();

	@Test(retryAnalyzer = com.sevenrmartsupermarket.listeners.RetryAnalyzer.class)
	public void verifyEnteredPushNotification() {

		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		pushNotificationPage = new PushNotificationPage(driver);

		loginpage.login("admin", "admin");

		pushNotificationPage.sendNotifications("phone", "All available phones will be displayed");

	}

	@Test(groups = "smoke")

	public void printExcelData() {

		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		pushNotificationPage = new PushNotificationPage(driver);

		loginpage.login("admin", "admin");

		excel.setExcelFile("GroceryFile", "Notification Data");
		System.out.println(excel.getCellData(1, 0));
		System.out.println(excel.getCellData(1, 1));
		System.out.println(excel.getCellData(0, 1));
		System.out.println(excel.getCellData(0, 0));
		pushNotificationPage.sendNotifications(excel.getCellData(1, 0), excel.getCellData(1, 1));
		/*
		 * boolean exp_successmsg = true; boolean act_successmsg =
		 * pushNotificationPage.visibilityOfSuccessMessageBox();
		 * Assert.assertEquals(act_successmsg, exp_successmsg);
		 */

	}

	@Test

	public void printExcelData1() {

		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		pushNotificationPage = new PushNotificationPage(driver);

		loginpage.login("admin", "admin");

		excel.setExcelFile("GroceryFile", "Notification Data");

		pushNotificationPage.sendNotifications(excel.getCellData(1, 0), excel.getCellData(1, 1));
		/*
		 * boolean exp_successmsg = true; boolean act_successmsg =
		 * pushNotificationPage.visibilityOfSuccessMessageBox();
		 * Assert.assertEquals(act_successmsg, exp_successmsg);
		 */

	}

}
