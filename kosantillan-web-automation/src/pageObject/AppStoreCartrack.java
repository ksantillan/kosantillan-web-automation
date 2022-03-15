package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppStoreCartrack {

	
	@FindBy(xpath="//h1[contains(.,'Cartrack GPS, Vehicle & Fleet')]")
	public static WebElement hdrCartrackApp;	
	
}
