package com.facebook.test;

import java.io.IOException;

import org.testng.annotations.Test;
import com.facebook.framework.framework;
import com.facebook.utility.excelFile;
import com.facebook.utility.propertiesFile;

public class regression {

	@Test
	private void TC_001() throws IOException {
		framework.openBrowser("Chrome");
		framework.maximixe();
		framework.launchURL("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		excelFile exeF= new excelFile("F:\\studyMaterial\\com.facebookEXE.xlsx", "Sheet1");
		framework.input("name", propertiesFile.properties("fname"), exeF.getCellData(1, 0));
		framework.input("name", propertiesFile.properties("lname"), exeF.getCellData(1, 1));
		framework.input("xpath", propertiesFile.properties("path"), exeF.getCellData(1, 2));
		framework.input("xpath", propertiesFile.properties("path1"), exeF.getCellData(1, 3));
		
		framework.dropDownByValue("2", propertiesFile.properties("select1"));
		framework.dropDownByIndex("Sep", propertiesFile.properties("select2"));
		framework.dropDownByVisibleText("2001", propertiesFile.properties("select3"));
		
		framework.click("xpath", propertiesFile.properties("path2"));
		framework.click("xpath", propertiesFile.properties("signup"));
		
		framework.closeAllBrowser();
		
		
	}
}
