package page.tests;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import page.objects.*;
import utility.Constant;
import utility.ExcelUtils;

public class PostTest {
	

	public static void ManualMethod(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// Make a post
		PostObjects.clickMakePost(driver);
		
		// Click Name, Input name
		PostObjects.clickName(driver);
		System.out.println("Input Name: ");
		String name = sc.next();
		PostObjects.sendKeysName(driver, name);
		
		// Click Location,Input location
		PostObjects.clickLocation(driver);
		System.out.println("Enter Location: ");
		String location = sc.next();
		PostObjects.sendKeysLocation(driver, location);
		
		// Browse
		PostObjects.sendKeysBrowseButton(driver);
		
		// Click and select in Drop down menu
		PostObjects.clickDropDown(driver);
		System.out.println("Choose Walk, Car, Motorbike, Bus or Bicycle: ");
		String dropDown = sc.next();
		PostObjects.selectDropDown(driver, dropDown);
		
		// Click and Input Description
		
		PostObjects.clickDescription(driver);
		System.out.println("Enter description: ");
		String description = sc.next();
		PostObjects.sendDescription(driver, description);
		
		// Click Post
		
		PostObjects.clickPost(driver);

	}

	public static void AutomaticMethod(WebDriver driver, int r) throws Exception {
		
		// Make a  New Post
		PostObjects.clickMakePost(driver);
		
		// Pull Excel data
		String excell;
		ExcelUtils.setExcelFile(Constant.PATH + Constant.FILE_NAME, Constant.SHEET_NAME_2);
		
		//Click Name,fill with excel data
		PostObjects.clickName(driver);
		excell = ExcelUtils.getCellData(r, 1);
		PostObjects.sendKeysName(driver, excell);
		
		// Click Location, fill with excel data
		PostObjects.clickLocation(driver);
		excell = ExcelUtils.getCellData(r, 2);
		PostObjects.sendKeysLocation(driver, excell);
		
		// Click Description,fill with excel data
		PostObjects.clickDescription(driver);
		excell = ExcelUtils.getCellData(r, 2);
		PostObjects.sendDescription(driver, excell);
		
		// Click Post Button
		PostObjects.clickPost(driver);
	}

	public static void AutomaticPost(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.PATH + Constant.FILE_NAME, Constant.SHEET_NAME_2);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			AutomaticMethod(driver, i);

		}
	}
}
