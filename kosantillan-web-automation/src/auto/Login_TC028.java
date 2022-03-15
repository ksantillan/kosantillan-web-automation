package auto;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import actionModule.ForgotUsername;
import actionModule.LaunchBrowser;
import pageObject.GetMyLoginPage;
import pageObject.VerifyCodePage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC028 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC028_Forgot_Username_Check_login_details_(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC028 Forgot Username (Check login details)");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		
		//Get Email address based on activesite
		String EmailAdd = DoThis.getEmailAdd(activesite);
	
		//Forgot Username via Email Address
		ForgotUsername.GetbyEmail(browser, EmailAdd, activesite);	
		
		//Validate Verify Code page
		if(!DoThis.isObjectDisplayed(VerifyCodePage.hdrCheckYourEmail, "Check your Email header", "Y"))  {assertTrue(false);}
		String EmailAddsubstring = EmailAdd.substring(EmailAdd.length() - 16);

		WebElement instrctnCheckYourEmail = Constant.driver.findElement(By.xpath("//p[contains(text(),'"+EmailAddsubstring+"')]"));
		if(!DoThis.isObjectDisplayed(instrctnCheckYourEmail, "Check Your Email Instructions", "Y"))  {assertTrue(false);}
		
		//Click Back button
		DoThis.click(GetMyLoginPage.btnBack, "Y");
		
		//Get SMS based on activesite
		String ValidSMS = DoThis.getValidSMS(activesite);
		
		//Forgot Username via SMS
		ForgotUsername.GetbySMS(browser, ValidSMS, activesite);
		
		//Validate Verify Code page
		if(!DoThis.isObjectDisplayed(VerifyCodePage.hdrCheckYourPhone, "Check your Phone header", "Y"))  {assertTrue(false);}
		String SMSAddsubstring = ValidSMS.substring(ValidSMS.length() - 3);

		WebElement instrctnCheckYourPhone = Constant.driver.findElement(By.xpath("//p[contains(text(),'"+SMSAddsubstring+"')]"));
		if(!DoThis.isObjectDisplayed(instrctnCheckYourPhone, "Check Your Phone Instructions", "Y"))  {assertTrue(false);}
		
		
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
