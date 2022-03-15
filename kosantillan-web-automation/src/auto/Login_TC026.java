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
import actionModule.ResetPassword;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC026 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC026_Reset_Subuser_password_through_admin_account(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC026 Reset Subuser password through admin account");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true);  
		ConfigReader config = new ConfigReader();
		String Language = config.getLanguage();
		
		//Get SubUser based on activesite
		String Subuser = DoThis.getSubuser(activesite);
		
		Login.Admin(browser, Language, false, activesite);
		
		//Reset Password
		ResetPassword.ViaAdmin(browser, Subuser);
		
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
