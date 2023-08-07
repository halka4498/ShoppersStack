package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageTest {

	public WebDriver driver;
	
	public CartPageTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[text()='indianclothings']")
	private WebElement rayYonSleeveLength;

	public WebElement getRayYonSleeveLength() {
		return rayYonSleeveLength;
	}

	
	
}
