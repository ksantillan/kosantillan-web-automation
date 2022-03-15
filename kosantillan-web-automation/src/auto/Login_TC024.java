package auto;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import actionModule.ForgotPassword;
import actionModule.LaunchBrowser;
import pageObject.ForgotPasswordPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC024 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC024_Forgot_Password_Subuser_by_SMS_direct_to_contact_admin__page(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC024 Forgot Password (Subuser) by SMS (direct to contact admin a page)");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		
		//Get SubUser SMS based on activesite
		String SubUserSMS = DoThis.getSubUserSMS(activesite);
		
		//Forgot Password via SubUser SMS
		ForgotPassword.GetbySMS(browser, SubUserSMS, activesite);
		
		//Validate toasted for details do not match error message is displayed
		if(!DoThis.isObjectDisplayed(ForgotPasswordPage.mdlDetailsdonotmatch, "Details do not Match Toaster Error", "Y"))  {assertTrue(false);}
		
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
