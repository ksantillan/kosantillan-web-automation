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
import actionModule.GetmyLoginDetails;
import actionModule.LaunchBrowser;
import pageObject.VerifyCodePage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC018 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC018_Get_my_Login_Details(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC018 Get my Login Details");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		
		//Get SMS based on activesite
		String ValidSMS = DoThis.getValidSMS(activesite);

		//Get Login Details via SMS
		GetmyLoginDetails.GetbySMS(browser, ValidSMS);
		
		//Validate Verify Code page
		if(!DoThis.isObjectDisplayed(VerifyCodePage.hdrCheckYourPhone, "Check your Phone header", "Y"))  {assertTrue(false);}
		String SMSAddsubstring = ValidSMS.substring(5, 8);

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
