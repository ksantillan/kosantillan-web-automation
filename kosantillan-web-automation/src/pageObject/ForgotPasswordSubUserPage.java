package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordSubUserPage {

	
	@FindBy(xpath="//*[contains(@class,'Header')][contains(@class,'details')]")
	public static WebElement hdrDetails;	
	
	@FindBy(xpath="//*[contains(@class,'Instruction')][contains(@class,'details')]")
	public static WebElement hdrInstruction;
	
	@FindBy(xpath="//button[contains(.,'Home')]")
	public static WebElement btnHome;
	
	
}
