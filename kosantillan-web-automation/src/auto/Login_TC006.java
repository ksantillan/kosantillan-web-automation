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
import pageObject.MapPage;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC006 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC006_Log_In(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC006 Log In");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, false, true);
		ConfigReader config = new ConfigReader();
		String Language = config.getLanguage();
		Login.SubUser(browser, Language, true, activesite);
		
		
		//Validate user login should be successful and Map page should be display 
		DoThis.WaitForElementToLoad(MapPage.Maptab.navMap);
		if(!DoThis.isObjectDisplayed(MapPage.Maptab.navMap, "Navigation Map", "Y"))  {assertTrue(false);}

		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
