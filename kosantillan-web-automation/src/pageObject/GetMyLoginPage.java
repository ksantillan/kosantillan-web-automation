package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetMyLoginPage {

	@FindBy(xpath="//div[contains(.,'Get my login')][contains(@class,'Header')]")
	public static WebElement hdrGetMyLogin;
	
	@FindBy(xpath="//label[contains(.,'Get by Email')]")
	public static WebElement rdbtnGetbyEmail;	
	
	@FindBy(xpath="//label[contains(.,'Get by SMS')]")
	public static WebElement rdbtnGetbySMS;	
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement txtbxEmail;	
	
	@FindBy(xpath="//input[@name='phone']")
	public static WebElement txtbxPhone;
	
	@FindBy(xpath="//button[contains(.,'Next')]")
	public static WebElement btnNext;
	
	@FindBy(xpath="//span[text()='Back']/parent::div[1]")
	public static WebElement btnBack;
	
	@FindBy(xpath="//*[text()='Select your account to reset your password']")
	public static WebElement mdlSelectYourAccountToResetYourPassword;
	
	@FindBy(xpath="//div[text()='Select your account']/preceding::input[1]")
	public static WebElement txtbxSelectYourAccount;
	
	@FindBy(xpath="//div[contains(@id,'item')]")
	public static List<WebElement> objSelectYourAccountOptions;
	
	@FindBy(xpath="//button[normalize-space()='OK']")
	public static WebElement btnOK;
	
	
}
