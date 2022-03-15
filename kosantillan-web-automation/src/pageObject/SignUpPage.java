package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

	
	@FindBy(xpath="//*[contains(@class,'Header')][contains(@class,'details')]")
	public static WebElement hdrDetails;	
	
	@FindBy(xpath="//span[contains(.,'Back')]")
	public static WebElement lnkBack;
	
	@FindBy(xpath="//label[contains(.,'Personal')]")
	public static WebElement rdbtnPersonal;
	
	@FindBy(xpath="//label[contains(.,'Business')]")
	public static WebElement rdbtnBusiness;
	
	@FindBy(xpath="//input[@name='name']")
	public static WebElement txtbxName;
	
	@FindBy(xpath="//input[@name='companyName']")
	public static WebElement txtbxCompanyName;
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement txtbxEmail;
	
	@FindBy(xpath="//span[contains(text(),'Country')]/ancestor::*[@class='InputDropdown-container']/descendant::input[1]")
	public static WebElement cmbbxCountry;
	
	@FindBy(xpath="//input[@name='phone']")
	public static WebElement txtbxPhone;
	
	@FindBy(xpath="//input[contains(@name,'numberVehicles')]")
	public static WebElement txtbxNumberVehicles;
	
	@FindBy(xpath="//input[@name='ownCar']")
	public static WebElement objOwnCar;
	
	@FindBy(xpath="//label[@for='ownCar']")
	public static WebElement chkbxOwnCar;
	
	@FindBy(xpath="//span[contains(text(),'How did you hear about us?')]/ancestor::*[@class='InputDropdown-container']/descendant::*[@id='downshift-1-input']")
	public static WebElement cmbbxAboutUs;
	
	@FindBy(xpath="//div[@id='downshift-1-item-1']")
	public static WebElement drpdwnFacebook;
	
	@FindBy(xpath="//div[@id='downshift-1-item-2']")
	public static WebElement drpdwnFamilyFriend;
	
	@FindBy(xpath="//div[@id='downshift-1-item-3']")
	public static WebElement drpdwnGoogle;
	
	@FindBy(xpath="//button[contains(.,'Sign Up')]")
	public static WebElement btnSignUp;
	
	@FindBy(xpath="//p[contains(@class,'ModalTitle')]")
	public static WebElement mdlTitle;
	
	@FindBy(xpath="//p[contains(@class,'ModalSubtitle')]")
	public static WebElement mdlSubTitle;
	
	@FindBy(xpath="//button[contains(.,'OK')]")
	public static WebElement btnOK;
	
	@FindBy(xpath="//div[@id='downshift-2-item-1']")
	public static WebElement slcFirstCountry;
	
}
