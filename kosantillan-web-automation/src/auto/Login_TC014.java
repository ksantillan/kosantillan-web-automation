package auto;

import static org.testng.Assert.assertTrue;

import java.util.Dictionary;
import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import actionModule.LaunchBrowser;
import actionModule.SignUp;
import pageObject.SignUpPage;
import pageObject.WelcomePage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC014 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC014_SignUp_Page(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC014 SignUp Page");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		
		Dictionary SignUpDetails = new Hashtable();
		SignUpDetails.put("signup_type", "Personal");
		SignUpDetails.put("signup_personal_name", "Automation Business");
		SignUpDetails.put("signup_email", "edmundo.delacruz@cartrack.com");
		SignUpDetails.put("signup_phone", "88233070");
		SignUpDetails.put("signup_own_car", true);
		SignUpDetails.put("signup_about_us", "Family");	
		SignUp.WithDetails(browser, SignUpDetails);
		
		//Validate Signup success message pop up is displayed
		if(!DoThis.isContainingText(SignUpPage.mdlTitle, "Signup success", "SignUp Success Modal Title", "Y"))  {assertTrue(false);}
		if(!DoThis.isContainingText(SignUpPage.mdlSubTitle, "Your information has been sent, you will be contacted soon.", "SignUp Success Modal Subtitle", "Y"))  {assertTrue(false);}
		
		DoThis.click(SignUpPage.btnOK, "Y");
		
		//Validate user landed on welcome page
		if(!DoThis.isObjectDisplayed(WelcomePage.hdrWelcometoCartrack, "Welcome to Cartrack header", "Y"))  {assertTrue(false);}
		
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
