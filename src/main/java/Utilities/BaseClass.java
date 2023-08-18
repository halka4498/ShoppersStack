package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PomClasses.HomePageAfterLoginTest;
import PomClasses.HomePageBeforeLoginTest;
import PomClasses.LoginPageTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass() throws Throwable {
		
		DataUtilities dataProperties = new DataUtilities();
		String BROWSER=dataProperties.dataFromPropertiesFile("C:/eclipse-workspace/shoppersstack/src/test/resources/data.properties", "BROWSER");
		
		if(BROWSER.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		String URL=dataProperties.dataFromPropertiesFile("C:/eclipse-workspace/shoppersstack/src/test/resources/data.properties","URL");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() throws Throwable {
		DataUtilities dataProperties = new DataUtilities();
		String Email=dataProperties.dataFromExcel("C:\\eclipse-workspace\\shoppersstack\\DataExcell.xlsx","Sheet1", 1, 1);
		String Pass=dataProperties.dataFromExcel("C:\\eclipse-workspace\\shoppersstack\\DataExcell.xlsx","Sheet1", 1, 2);
		
		driver.navigate().refresh();
		
		HomePageBeforeLoginTest HBL = new HomePageBeforeLoginTest(driver);
	    HBL.getLoginMainButton().click();
	    
	    LoginPageTest Lp = new LoginPageTest(driver);
	    
	    Lp.getEmailTextField().sendKeys(Email);
	    Lp.getPassTextField().sendKeys(Pass);
	    Lp.getLoginButton().click();
		
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() throws Throwable {
	Thread.sleep(3000);
	HomePageAfterLoginTest HomePageEle = new HomePageAfterLoginTest(driver);
	HomePageEle.getAccountSettingIcon().click();
	HomePageEle.getLogoutIcon().click();	
	}
	
	
	
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		driver.quit();
	}
}
