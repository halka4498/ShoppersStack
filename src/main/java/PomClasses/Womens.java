package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womens {

	public WebDriver driver;
	public Womens(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='women kurti']/parent::div/parent::div//button")
	private WebElement womenkurthiAddToCartButton;
	
	public WebElement getwomenkurthiAddToCartButton() {
		return womenkurthiAddToCartButton;
	}
	
}
