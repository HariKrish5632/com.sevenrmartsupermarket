package com.sevenrmartsupermarket.tests;

import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.DeliveryBoyPage;
import com.sevenrmartsupermarket.pages.HomePage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.Excel;
import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class DeliveryBoyTest extends Base {

	LoginPage loginpage;
	HomePage homepage;
	DeliveryBoyPage deliveryboypage;
	GeneralUtility generalutility;

	Excel excel = new Excel();

	@Test(groups = "smoke")

	public void verifyByAddingNewDeliveryBoy() {

		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		deliveryboypage = new DeliveryBoyPage(driver);

		loginpage.login("admin", "admin");

		System.out.println(GeneralUtility.getRandomFirstName());

		excel.setExcelFile("DeliveryBoy", "AddDetails");
		deliveryboypage.addNewDeliveryBoy(GeneralUtility.getRandomFirstName(), "harisoumya@example.com", "10023",
				"Hari Kochi", "Hari5632", "Hari5632");

		/*
		 * deliveryboypage.addNewDeliveryBoy("Veena", "veena@example.com", "10023",
		 * "veena Kochi", "Veena5632", "Veena5632");
		 */

		/*
		 * System.out.println(excel.getCellData(1, 0));
		 * System.out.println(excel.getCellData(1, 1));
		 * System.out.println(excel.getCellData(1, 2));
		 * System.out.println(excel.getCellData(1, 3));
		 * System.out.println(excel.getCellData(1, 4));
		 * System.out.println(excel.getCellData(1, 5));
		 * 
		 * deliveryboypage.addNewDeliveryBoy(excel.getCellData(1, 0),
		 * excel.getCellData(1, 1), excel.getCellData(1, 2), excel.getCellData(1, 3),
		 * excel.getCellData(1, 4), excel.getCellData(1, 5));
		 */
	}

}
