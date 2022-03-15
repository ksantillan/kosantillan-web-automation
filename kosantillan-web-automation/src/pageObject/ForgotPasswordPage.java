package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage {

	@FindBy(xpath="//div[contains(.,'Forgot my password')][contains(@class,'Header')]")
	public static WebElement hdrForgotmyPassword;
	
	@FindBy(xpath="//label[contains(.,'Get by Email')]")
	public static WebElement rdbtnGetbyEmail;	
	
	@FindBy(xpath="//label[contains(.,'Get by SMS')]")
	public static WebElement rdbtnGetbySMS;	
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement txtbxEmail;	
	
	@FindBy(xpath="//button[contains(.,'Next')]")
	public static WebElement btnNext;
	
	@FindBy(xpath="//input[@name='phone']")
	public static WebElement txtbxPhone;	
	
	@FindBy(xpath="//div[@class='Toast Toast--error']")
	public static WebElement toasterErrorAssociated;	
	
	@FindBy(xpath="//p[contains(.,'Details do not match.')]")
	public static WebElement mdlDetailsdonotmatch;	
	
	@FindBy(xpath="//button[contains(.,\"I'm a sub-user\")]")
	public static WebElement btnImASubUser;
	
	@FindBy(xpath="//span[contains(.,'Sign Up Today!')]")
	public static WebElement lnkSignUp;
	
	@FindBy(xpath="//span[text()='Back']/parent::div[1]")
	public static WebElement btnBack;
	
	@FindBy(xpath="//*[text()='Select your account to reset your password']")
	public static WebElement mdlSelectYourAccountToResetYourPassword;
	
	@FindBy(xpath="//div[text()='Select your account']/preceding::input[1]")
	public static WebElement txtbxSelectYourAccount;
	
	@FindBy(xpath="//button[normalize-space()='OK']")
	public static WebElement btnOK;
	
	@FindBy(xpath="//div[contains(@id,'item')]")
	public static List<WebElement> objSelectYourAccountOptions;
		
}
