package TestCases;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import PomClasses.CartPageTest;

import PomClasses.HomePageAfterLoginTest;
import PomClasses.Womens;
import Utilities.BaseClass;


@Listeners(Utilities.ListnersImplementation.class)
public class VerifyWomwensModuleTest extends BaseClass{

	@Test
	public void Tc_Women_003Test() throws Throwable {
		Thread.sleep(3000);
		HomePageAfterLoginTest HPAL = new HomePageAfterLoginTest(driver);
		HPAL.getWomenMenuLink().click();
		
		
		Womens womensPom = new Womens(driver);
		womensPom.getwomenkurthiAddToCartButton().click();
		
		HPAL.getMainCartIcon().click();
		
		CartPageTest CartPom = new CartPageTest(driver);
		String actualResult=CartPom.getRayYonSleeveLength().getText();
		System.out.println();
		
		
	}
	
	@Test
	public void Tc_Women_004Test() throws Throwable {
		Thread.sleep(3000);
		HomePageAfterLoginTest HPAL1 = new HomePageAfterLoginTest(driver);
		HPAL1.getWomenMenuLink().click();
		
		
		Womens womensPom = new Womens(driver);
		womensPom.getwomenkurthiAddToCartButton().click();
		System.out.println("done");
	}
	
}
