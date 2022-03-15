package auto;

import static org.testng.Assert.assertTrue;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
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
import pageObject.GooglePlayCartrack;
import pageObject.LoginPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Login_TC022 {

	static ExtentReports extent;
	static ExtentTest logger;

	public static WebDriver driver;

	@BeforeTest
	public void startTest(final ITestContext testContext) throws Exception {
		Constant.TestCasename = testContext.getName();
	}	

	@Parameters({"browser","activesite","activeenvironment"})
	@Test
	public static void LOGIN_TC022_App_Store_Links(@Optional("chrome") String browser, @Optional("SG") String activesite, @Optional("Test") String activeenvironment) throws Exception {

		Constant.browser = browser;	
		logger = Reporter.PrepareReport(activesite+" LOGIN TC022 App Store Links");

		LaunchBrowser.Execute(browser, activesite, activeenvironment, true, true); 
		
		//New tab
		Set<String> winIds = Constant.driver.getWindowHandles();
		Iterator<String> iterate = winIds.iterator();

		DoThis.click(LoginPage.hrfGooglePlay, "Y");

		winIds = Constant.driver.getWindowHandles();
		iterate = winIds.iterator();
		String OrigWindow = iterate.next();
		String NextWindow = iterate.next();
		Constant.driver.switchTo().window(NextWindow);	
		Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
		Constant.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

		//Validate Apple app store link should open in new tab
		if(!DoThis.isObjectDisplayed(GooglePlayCartrack.hdrCartrackApp, "Google Play Cartrack App", "Y"))  {assertTrue(false);}
		
		if(Constant.error) {assertTrue(false);}

	}

	@AfterTest
	public static void EndOftest()
	{

		Constant.driver.quit();	


	}

}
