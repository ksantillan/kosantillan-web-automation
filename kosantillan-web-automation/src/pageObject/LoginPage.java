package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	@FindBy(xpath="//input[@name='username']")
	public static WebElement txtbxUsername;	
	
	@FindBy(xpath="//input[@name='subUsername']")
	public static WebElement txtbxSubUsername;	
	
	@FindBy(xpath="//input[@name='password']")
	public static WebElement txtbxPassword;	
	
	@FindBy(xpath="//input[@name='password']")
	public static WebElement txtbxSubPassword;	
		
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement btnLogin;		
	
	@FindBy(xpath="//label[contains(.,'Admin')]")
	public static WebElement rdbtnAdmin;	
	
	@FindBy(xpath="//label[contains(.,'Sub-user')]")
	public static WebElement rdbtnSubUser;
	
	@FindBy(xpath="//button[contains(@aria-label,'open menu')]/parent::div[@class='InputDropdown-container']")
	public static WebElement cmbbxLanguage;
	
	@FindBy(xpath="//div[@role='listbox']/div[contains(.,'English')]")
	public static WebElement lstOptnEnglish;
	
	@FindBy(xpath="//label[@for='stayLoggedIn']")
	public static WebElement chkbxStayLoggedIn;
	
	@FindBy(xpath="//a[@href='/get-login-details']//span[@class='highlighted']")
	public static WebElement lnkForgotUsername;

	@FindBy(xpath="//span[text()='password']")
	public static WebElement lnkForgotPassword;

	@FindBy(xpath="//span[contains(.,'Sign Up Today!')]")
	public static WebElement lnkSignUp;
	
	@FindBy(xpath="//p[contains(.,'Details do not match.')]")
	public static WebElement mdlDetailsdonotmatch;	
	
	@FindBy(xpath="//button[contains(.,'Forgot Details')]")
	public static WebElement btnForgotDetails;	
	
	@FindBy(xpath="//button[contains(.,'Try Again')]")
	public static WebElement btnTryAgain;	
	
	@FindBy(xpath="//*[contains(@href,'https://play.google.com/store/apps/details?id=com.cartrack.fleet')]")
	public static WebElement hrfGooglePlay;	
	
	@FindBy(xpath="//*[contains(@href,'https://apps.apple.com/app/cartrack-fleet')]")
	public static WebElement hrfAppStore;	
	
	@FindBy(xpath="//span[contains(.,'System Notice')]")
	public static WebElement mdlSystemNotice;	
	
	@FindBy(xpath="//span[text()='Important Message']")
	public static WebElement mdlImportantMessage;	
	
	@FindBy(xpath="//*[contains(.,'System Notice')]/ancestor::*[contains(@class,'Modal-header')]/descendant::*[contains(@data-icon,'times')]")
	public static WebElement icnCloseSystemNotice;	
	
	@FindBy(xpath="//span[text()='Important Message']/ancestor::div[contains(@class,'ModalAnimated')]/descendant::*[contains(@data-icon,'times')]")
	public static WebElement icnCloseImportantMessage;	
	
	@FindBy(xpath="//span[normalize-space()='Change your Password?']")
	public static WebElement mdlForceChangePassword;	
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	public static WebElement btnCancel;	
	
	@FindBy(xpath="//div[@class='Toast Toast--error']")
	public static WebElement objtoasterError;	
	
	@FindBy(xpath="//*[local-name()='svg'][@data-icon='question-circle']")
	public static WebElement btnHelp;	
	
	@FindBy(xpath="//p[contains(@class,'sc-cvpDDR')]")
	public static WebElement objApplicationVersion;	
	
	
	
	
}
