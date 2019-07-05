package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.LoginObjects;
import utility.Constant;
import utility.ExcelUtils;

public class LoginTest {

	

	public static void ManualMethod(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);

		// Click User Name
		LoginObjects.clickUserName(driver);
		System.out.println("Input Username: ");
		String userName = sc.next();
		LoginObjects.sendKeysUserName(driver, userName);
		
		//Clic Password
		LoginObjects.clickPassword(driver);
		System.out.println("Input Password: ");
		String passw = sc.next();
		LoginObjects.sendKeysPassword(driver, passw);
		
		// ClickLogin
		LoginObjects.clickLogin(driver);

	}

	public static void AutomaticMethod(WebDriver driver, int r) throws Exception {
		String excell;
		ExcelUtils.setExcelFile(Constant.PATH + Constant.FILE_NAME, Constant.SHEET_NAME_1);
		
		// Clic User Name, fill with excell data 
		LoginObjects.clickUserName(driver);
		excell = ExcelUtils.getCellData(r, 2);
		LoginObjects.sendKeysUserName(driver, excell);
		
		// Click Password,fill with excell data
		LoginObjects.clickPassword(driver);
		excell = ExcelUtils.getCellData(r, 4);
		LoginObjects.sendKeysPassword(driver, excell);
		// LoginButton
		LoginObjects.clickLogin(driver);
	}

	public static void AutomaticTest(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.PATH + Constant.FILE_NAME, Constant.SHEET_NAME_1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			AutomaticMethod(driver, i);
			LoginObjects.clickLogout(driver);
		}
	}
}
