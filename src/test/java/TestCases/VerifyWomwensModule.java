package TestCases;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomClasses.CartPage;
import PomClasses.HomePageAfterLogin;
import PomClasses.Womens;
import Utilities.BaseClass;


@Listeners(Utilities.ListnersImplementation.class)
public class VerifyWomwensModule extends BaseClass{

	@Test//(groups= {"regrationTestcase"})
	public void Tc_Women_003() throws Throwable {
		Thread.sleep(3000);
		HomePageAfterLogin HPAL = new HomePageAfterLogin(driver);
		HPAL.getWomenMenuLink().click();
		
		
		Womens womensPom = new Womens(driver);
		womensPom.getwomenkurthiAddToCartButton().click();
		
		HPAL.getMainCartIcon().click();
		
		CartPage CartPom = new CartPage(driver);
		String actualResult=CartPom.getRayYonSleeveLength().getText();
		System.out.println();
		
		
	}
	
	@Test
	public void Tc_Women_004() throws Throwable {
		HomePageAfterLogin HPAL = new HomePageAfterLogin(driver);
		HPAL.getWomenMenuLink().click();
		
		Thread.sleep(2000);
		Womens womensPom = new Womens(driver);
		womensPom.getwomenkurthiAddToCartButton().click();
	}
	
}
