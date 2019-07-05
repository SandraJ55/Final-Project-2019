package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.RegistrationObjects;
import utility.*;

public class RegistrationTest {


	public static void ManualMethod(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);

		// Click and Input First Name
		
		RegistrationObjects.clickFirstName(driver);
		System.out.println("Input First Name: ");
		String FirstName = sc.next();
		RegistrationObjects.sendKeysFirstName(driver, FirstName);
		
		// Click and Input LastName
		RegistrationObjects.clickLastName(driver);
		System.out.println("Input Last Name: ");
		String LastName = sc.next();
		RegistrationObjects.sendKeysLastName(driver, LastName);
		
		// Click and Input UserName
		RegistrationObjects.clickUserName(driver);
		System.out.println("Input Username: ");
		String strUserName = sc.next();
		RegistrationObjects.sendKeysUserName(driver, strUserName);
		
		// Click and Input Email
		RegistrationObjects.clickEmail(driver);
		System.out.println("Input Email address: ");
		String Email = sc.next();
		RegistrationObjects.sendKeysEmail(driver, Email);
		
		// Click and Input Password
		RegistrationObjects.clickPassword(driver);
		System.out.println("Input Password: ");
		String Password = sc.next();
		RegistrationObjects.sendKeysPassword(driver, Password);
		
		// Click Register
		RegistrationObjects.clickRegisterButton(driver);

	}

	public static void AutomaticMethod(WebDriver driver, int r) throws Exception {
		String excell;
		ExcelUtils.setExcelFile(Constant.PATH + Constant.FILE_NAME, Constant.SHEET_NAME_1);
		
		// Click, fill with excel data FirstName
		RegistrationObjects.clickFirstName(driver);
		excell = ExcelUtils.getCellData(r, 0);
		RegistrationObjects.sendKeysFirstName(driver, excell);
		
		// Click, fill with excel data Last Name
		RegistrationObjects.clickLastName(driver);
		excell = ExcelUtils.getCellData(r, 1);
		RegistrationObjects.sendKeysLastName(driver, excell);
		
		// Click, fill with excel data UserName
		RegistrationObjects.clickUserName(driver);
		excell = ExcelUtils.getCellData(r, 2);
		RegistrationObjects.sendKeysUserName(driver, excell);
		
		// Click, fill with excel Email
		RegistrationObjects.clickEmail(driver);
		excell = ExcelUtils.getCellData(r, 3);
		RegistrationObjects.sendKeysEmail(driver, excell);
		
		// Click, fill with excel dataPassword
		RegistrationObjects.clickPassword(driver);
		excell = ExcelUtils.getCellData(r, 4);
		RegistrationObjects.sendKeysPassword(driver, excell);
		
		//Click RegisterButton
		RegistrationObjects.clickRegisterButton(driver);
	}

	public static void AutomaticTest(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.PATH + Constant.FILE_NAME, Constant.SHEET_NAME_1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			AutomaticMethod(driver, i);

		}
	}
}