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
import pageObject.LoginPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC020 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC020_App_Store_Links(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC020 App Store Links");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 

		//Validate Apple & Google app store links should be display on login page footer
		if(!DoThis.isObjectDisplayed(LoginPage.hrfGooglePlay, "Google Play link", "Y"))  {assertTrue(false);}
		if(!DoThis.isObjectDisplayed(LoginPage.hrfAppStore, "App Store link", "Y"))  {assertTrue(false);}
		
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
