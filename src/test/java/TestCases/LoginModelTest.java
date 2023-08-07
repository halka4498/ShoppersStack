package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import PomClasses.HomePageAfterLoginTest;


import Utilities.BaseClass;
import Utilities.DataUtilities;

public class LoginModelTest extends BaseClass {
	
	
	
	@Test(groups= {"smokeTestCase","regrationTestcase"})
    public  void FirstTestCaseTest() throws IOException, Throwable {		
		HomePageAfterLoginTest HmAL = new HomePageAfterLoginTest(driver);
	HmAL.getMenMenuLink().click();
	}
	
	
	// @Test(groups= {"smokeTestCase"})
	// public void Tc_Login_002Test() {
	// 	HomePageAfterLoginTest HmAL = new HomePageAfterLoginTest(driver);
	// 	HmAL.getWomenMenuLink().click();	 
	// }
}


