package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {

	
	@FindBy(xpath="//*[contains(text(),'Welcome to Cartrack')]")
	public static WebElement hdrWelcometoCartrack;	
	
	@FindBy(xpath="//a[contains(@href,'/login')]//button[contains(@type,'button')]")
	public static WebElement btnLogIn;
	
	@FindBy(xpath="//a[@href='/signup']//button[@type='button']")
	public static WebElement btnSignUp;
	
	@FindBy(xpath="//div[@class='InputDropdown-button-placeholder is-withValue']")
	public static WebElement drpdwnlstLanguage;
	
	@FindBy(xpath="//button[contains(.,'Get my Login Details')]")
	public static WebElement btnGetmyLoginDetails;
	
}
