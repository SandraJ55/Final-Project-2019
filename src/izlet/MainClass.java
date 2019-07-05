package izlet;



import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.RegistrationObjects;
import page.tests.DeleteTest;
import page.tests.EditTest;
import page.tests.LoginTest;
import page.tests.PostTest;
import page.tests.RegistrationTest;
import utility.Constant;

public class MainClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(Constant.PAGE_URL);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Scanner sc = new Scanner(System.in);
		
		// Automatic registration with excel data
		try {
			RegistrationTest.AutomaticTest(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Manual registration
		try {
			RegistrationTest.ManualMethod(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Automation test is it registration successful, login/logout method 
		try {
			LoginTest.AutomaticTest(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Manual login, manual input
		try {
			LoginTest.ManualMethod(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Automatic post from Excel data
		try {
			PostTest.AutomaticPost(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Manual post
		try {
			PostTest.ManualMethod(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Delete two last posts
		try {
			DeleteTest.AutomaticDelete(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Manual edit post
		try {
			EditTest.ManualMethod(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
