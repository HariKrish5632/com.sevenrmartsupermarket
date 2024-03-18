package com.sevenrmartsupermarket.dataprovider;

import org.testng.annotations.DataProvider;

import com.sevenrmartsupermarket.utilities.Excel;

public class DataProviders {

	Excel excel = new Excel();

	@DataProvider(name = "sevenmartsupermarket")
	public Object[][] login() {
		return new Object[][] { { "admin", "admin" }, { "Lucy2", "Becac@123" }, { "akshaya", "Test" } };
	}

	@DataProvider(name = "multiLogin")
	public Object[][] adminLogin() {
		excel.setExcelFile("loginNew", "Latest");

		return excel.getMultidimentionalData(3, 2);
	}
}
