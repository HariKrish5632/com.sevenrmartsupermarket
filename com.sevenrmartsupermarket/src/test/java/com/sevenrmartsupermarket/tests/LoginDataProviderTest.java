package com.sevenrmartsupermarket.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.dataprovider.DataProviders;
import com.sevenrmartsupermarket.pages.LoginPage;

public class LoginDataProviderTest extends Base {

	WebDriver driver;
	LoginPage loginpage;

	@Test(dataProvider = "multiLogin", dataProviderClass = DataProviders.class)

	public void verifyLoginWithDifferntAdminUsers(String userName, String Password) {
		loginpage = new LoginPage(driver);

		loginpage.login(userName, Password);

	}

}