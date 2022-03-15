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
import pageObject.ForgotPasswordSubUserPage;
import pageObject.WelcomePage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC012 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC012_Forgot_Password(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC012 Forgot Password");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		ForgotPassword.SubUser();
		
		//Validate user is landed on You are a Sub-user page , with a reminder message to sub-user to contact their Admin to reset password
		if(!DoThis.isContainingText(ForgotPasswordSubUserPage.hdrDetails, "You are a Sub-user", "Sub-user forgot password header details", "Y"))  {assertTrue(false);}
		if(!DoThis.isContainingText(ForgotPasswordSubUserPage.hdrInstruction, "Please contact your admin to change your password.", "Sub-user forgot password instruction details", "Y"))  {assertTrue(false);}
		
		ForgotPassword.ReturnHome();
		
		//Validate user return to Welcome page
		if(!DoThis.isObjectDisplayed(WelcomePage.hdrWelcometoCartrack, "Welcome to Cartrack header", "Y"))  {assertTrue(false);}
		
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
