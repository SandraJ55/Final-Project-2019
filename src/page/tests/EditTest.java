package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import page.objects.EditObjects;

public class EditTest {

	public static void ManualMethod(WebDriver driver) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		// Clic Extend meny
		EditObjects.clickExtend(driver);
		
		// Click Edit 
		EditObjects.clickEdit(driver);
		
		// Click Name
		EditObjects.clickName(driver);
		System.out.println("Input Name: ");
		String name = sc.next();
		EditObjects.sendKeysName(driver, name);
		
		// Click and edit Location
		EditObjects.clickLocation(driver);
		System.out.println("Input location: ");
		String location = sc.next();
		EditObjects.sendKeysLocation(driver, location);
		
		// Change 
		EditObjects.sendKeysChangeButton(driver);
		
		// Click Drop down menu and choose option
		EditObjects.clickDropDown(driver);
		System.out.println("Choose Walk, Car, Motorbike, Bus or Bicycle: ");
		String dropDown = sc.next();
		EditObjects.selectDropDown(driver, dropDown);
		
		// Click on Description and Input new description
		EditObjects.clickDescription(driver);
		System.out.println("Input new description: ");
		String description = sc.next();
		EditObjects.sendDescription(driver, description);
		
		// Click Post
		EditObjects.clickPost(driver);

	}

}
