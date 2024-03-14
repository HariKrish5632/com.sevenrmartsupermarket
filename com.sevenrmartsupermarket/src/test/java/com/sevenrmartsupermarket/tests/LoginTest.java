package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.HomePage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.ScreenShot;

public class LoginTest extends Base {

	LoginPage loginpage;
	HomePage homepage;

	@Test

	public void verifyLogin() {

		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);

		loginpage.login("admin", "admin");
		ScreenShot.takeScreenshot(driver, "Admin");
		String expectedProfileName = "Admin";
		String actualProfileName = homepage.getProfileName();
		Assert.assertEquals(actualProfileName, expectedProfileName);

	}

}
