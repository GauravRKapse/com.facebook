package com.facebook.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.facebook.constants.constants;
import com.google.common.base.CaseFormat;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framework {
	
	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			constants.driver= new ChromeDriver();
			break;

		default:
			break;
		}
	}
	public static void maximixe() {
		constants.driver.manage().window().maximize();
	}
	public static void launchURL(String url) {
		constants.driver.get(url);
	}
	public static WebElement getWebElement(String locator, String locatorValue) {
		WebElement element= null;
		switch (locator) {
		case "name":
			element= constants.driver.findElement(By.name(locatorValue));
			break;
		case "id":
			element= constants.driver.findElement(By.id(locatorValue));
			break;
		case "xpath":
			element=constants.driver.findElement(By.xpath(locatorValue));
			break;
		default:
			break;
		}
		return element;
	}
	public static void input(String locator, String locatorValue, String enterText) {
		getWebElement(locator, locatorValue).sendKeys(enterText);
	}
	public static void click(String locator, String locatorValue) {
		getWebElement(locator, locatorValue).click();;
	}
	
	public static String getDropDown(String locator) {
		String getDropDown= null;
		constants.select= new Select(constants.driver.findElement(By.xpath(locator)));
		return getDropDown;
	}
	
	public static void dropDownByVisibleText(String text, String locator) {
		getDropDown(locator);
		constants.select.selectByVisibleText(text);
	}
	public static void dropDownByValue(String value, String locator) {
		getDropDown(locator);
		constants.select.selectByVisibleText(value);
	}
	public static void dropDownByIndex(String index, String locator) {
		getDropDown(locator);
		constants.select.selectByVisibleText(index);
	}
	public static void closeAllBrowser() {
		constants.driver.quit();
	}
}






