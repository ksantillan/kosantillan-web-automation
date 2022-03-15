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
import actionModule.Login;
import actionModule.ResetPassword;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC027 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC027_Reset_password_Admin_Password(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC027 Reset password Admin Password");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		
		ConfigReader config = new ConfigReader();
		String Language = config.getLanguage();
		Login.Admin(browser, Language, false, activesite);
		
		//Get Password based activesite
		String Password = DoThis.getPassword(activesite);
			
		Dictionary ChangePasswordDetails = new Hashtable();
		ChangePasswordDetails.put("current_password", Password);
		ChangePasswordDetails.put("new_password", "P@ssw0rd1235");
		ChangePasswordDetails.put("confirm_password", "P@ssw0rd1235");
		
		ResetPassword.Execute(browser, ChangePasswordDetails, activesite);
		
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
