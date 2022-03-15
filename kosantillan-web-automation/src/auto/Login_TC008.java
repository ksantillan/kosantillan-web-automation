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

import actionModule.ForgotPassword;
import actionModule.LaunchBrowser;
import pageObject.VerifyCodePage;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC008 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC008_Forgot_Password(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC008 Forgot Password");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		
		//Get Email Add based on activesite
		String EmailAdd = DoThis.getEmailAdd(activesite);
		
		//Forgot Password via Email Address
		ForgotPassword.GetbyEmail(browser, EmailAdd, activesite);
			
		//Validate Verify Code page
		if(!DoThis.isObjectDisplayed(VerifyCodePage.hdrCheckYourEmail, "Check your Email header", "Y"))  {assertTrue(false);}
		String EmailAddsubstring = EmailAdd.substring(EmailAdd.length() - 16);

		WebElement instrctnCheckYourEmail = Constant.driver.findElement(By.xpath("//p[contains(text(),'"+EmailAddsubstring+"')]"));
		if(!DoThis.isObjectDisplayed(instrctnCheckYourEmail, "Check Your Email Instructions", "Y"))  {assertTrue(false);}
		
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
