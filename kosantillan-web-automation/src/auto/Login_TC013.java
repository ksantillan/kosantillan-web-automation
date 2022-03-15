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
import actionModule.LaunchBrowser;
import actionModule.SignUp;
import pageObject.SignUpPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC013 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC013_SignUp_Page(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC013 SignUp Page");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		SignUp.WelcomePage();
		
		//Validate user landed on Join Cartrack Today page
		if(!DoThis.isContainingText(SignUpPage.hdrDetails, "Join Cartrack Today", "Sign Up Page Header", "Y"))  {assertTrue(false);}

		SignUp.GoBack();
		SignUp.LoginPage();
		
		//Validate user landed on Join Cartrack Today page
		if(!DoThis.isContainingText(SignUpPage.hdrDetails, "Join Cartrack Today", "Sign Up Page Header", "Y"))  {assertTrue(false);}
			
		SignUp.GoBack();
		SignUp.ForgotPassword();
		
		//Validate user landed on Join Cartrack Today page
		if(!DoThis.isContainingText(SignUpPage.hdrDetails, "Join Cartrack Today", "Sign Up Page Header", "Y"))  {assertTrue(false);}
				
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
