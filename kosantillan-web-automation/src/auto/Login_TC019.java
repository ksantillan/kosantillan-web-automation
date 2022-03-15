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
import actionModule.Login;
import pageObject.LoginPage;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC019 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC019_Invalid_Login(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC019 Invalid Login");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		ConfigReader config = new ConfigReader();
		String Language = config.getLanguage();
		Login.Invalid_Login(browser, Language, false, activesite);
		
		//Validate toasted for details do not match error message is displayed
		if(!DoThis.isObjectDisplayed(LoginPage.mdlDetailsdonotmatch, "Details do not Match Toaster Error", "Y"))  {assertTrue(false);}
				
		//Validate Forgot Details and Try Again button is displayed
		if(!DoThis.isObjectDisplayed(LoginPage.btnForgotDetails, "Forgot Details button", "Y"))  {assertTrue(false);}
		if(!DoThis.isObjectDisplayed(LoginPage.btnTryAgain, "Try Again button", "Y"))  {assertTrue(false);}
		
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
