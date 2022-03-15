package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyCodePage {

	
	@FindBy(xpath="//div[contains(text(),'Check your email!')]")
	public static WebElement hdrCheckYourEmail;	

	@FindBy(xpath="//div[contains(text(),'Check your phone!')]")
	public static WebElement hdrCheckYourPhone;	
	
	@FindBy(xpath="//span[text()='Back']/parent::div[1]")
	public static WebElement btnBack;	
	
	

	
}
