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


public class Login_TC011 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC011_Forgot_Password(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC011 Forgot Password");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		
		//Get Email Add Not Associated based on activesite
		String EmailAddNotAssoc = DoThis.getEmailAddNotAssoc(activesite);
		
		//Forgot Password via Email Add
		ForgotPassword.GetbyEmail(browser, EmailAddNotAssoc, activesite);
		
		//Validate toasted for details do not match error message is displayed
		if(!DoThis.isObjectDisplayed(ForgotPasswordPage.mdlDetailsdonotmatch, "Details do not Match Toaster Error", "Y"))  {assertTrue(false);}
		
		Constant.driver.quit();	
		
		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		
		//Get SMS Not Associated based on activesite
		String SMSNotAssoc = DoThis.getSMSNotAssoc(activesite);
		
		//Forgot Password via SMS
		ForgotPassword.GetbySMS(browser, SMSNotAssoc, activesite);		
		
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
