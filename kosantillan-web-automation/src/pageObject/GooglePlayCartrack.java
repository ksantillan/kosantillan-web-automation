package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePlayCartrack {

	
	@FindBy(xpath="//span[contains(.,'Cartrack GPS, Vehicle & Fleet')]")
	public static WebElement hdrCartrackApp;	
	
}
