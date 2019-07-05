package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditObjects {
	private static final String extend = "fa-ellipsis-v";
	private static final String edit = "fa-edit";
	private static final String name = "//input[@id='title']";
	private static final String location = "//input[@id='location']";
	private static final String change = "//*[@id=\"editImage\"]";
	private static final String dropdown = "//select[@id='transport']";
	private static final String description = "//textarea[@id='description']";
	private static final String postButton = "//div[@class='popupEdit']//input[@name='postSubmit']";

	// Get element and Click Extend
	public static WebElement getExtend(WebDriver driver) {
		WebElement wb = driver.findElement(By.className(extend));
		return wb;
	}

	public static void clickExtend(WebDriver driver) {
		getExtend(driver).click();
	}

	// Get element and Click Edit
	public static WebElement getEdit(WebDriver driver) {
		WebElement wb = driver.findElement(By.className(edit));
		return wb;
	}

	public static void clickEdit(WebDriver driver) {
		getEdit(driver).click();
	}

	// Get element, click and Input Name
	public static WebElement getName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(name));
		return wb;
	}

	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}

	public static void sendKeysName(WebDriver driver, String str) {
		getName(driver).sendKeys(str);
	}

	// Get element, click and Input Location
	public static WebElement getLocation(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(location));
		return wb;
	}

	public static void clickLocation(WebDriver driver) {
		getLocation(driver).click();
	}

	public static void sendKeysLocation(WebDriver driver, String str) {
		getLocation(driver).sendKeys(str);
	}

	// Get element and Input New Picture
	public static WebElement getChange(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(change));
		return wb;
	}

	public static void sendKeysChangeButton(WebDriver driver) {
		WebElement wb = getChange(driver);
		wb.sendKeys("C:\\Users\\Jelena\\Desktop\\Zavrsni Projekat\\Projekat 2019\\images.jpg");
	}

	// Get, click and choose option in Drop Down Menus
	public static WebElement getDropDown(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(dropdown));
		return wb;
	}

	public static void clickDropDown(WebDriver driver) {
		getDropDown(driver).click();
	}

	public static void selectDropDown(WebDriver driver, String str) {
		Select drop = new Select(getDropDown(driver));
		drop.selectByVisibleText(str);
	}

	// Get, click and Input Description
	public static WebElement getDescription(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(description));
		return wb;
	}

	public static void clickDescription(WebDriver driver) {
		getDescription(driver).click();
	}

	public static void sendDescription(WebDriver driver, String str) {
		getDescription(driver).sendKeys(str);
	}

	// Get and click PostButton
	public static WebElement getPost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(postButton));
		return wb;
	}

	public static void clickPost(WebDriver driver) {
		getPost(driver).click();
	}

}
