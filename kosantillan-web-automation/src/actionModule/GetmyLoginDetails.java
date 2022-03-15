package actionModule;

import java.io.IOException;
import pageObject.GetMyLoginPage;
import pageObject.WelcomePage;
import utility.DoThis;
import utility.Reporter;

public class GetmyLoginDetails{	
	
	public static void Execute() throws IOException, Exception{
		
		DoThis.click(WelcomePage.btnGetmyLoginDetails, "Y");
	
	}
	
	public static void GetbyEmail(String browser, String Email) throws IOException, Exception{
		
		DoThis.click(WelcomePage.btnGetmyLoginDetails, "Y");
		if(GetMyLoginPage.rdbtnGetbyEmail.getAttribute("checked") != null) {
			Reporter.ReportEventNoImage("Get by Email is already selected");
		}else {
			DoThis.click(GetMyLoginPage.rdbtnGetbyEmail, "Y");
		}
		DoThis.clear(browser, GetMyLoginPage.txtbxEmail, "N");
		DoThis.sendkeys(GetMyLoginPage.txtbxEmail, Email, "Y");
		
		DoThis.click(GetMyLoginPage.btnNext, "Y");
		
	}
	public static void GetbySMS(String browser, String SMS) throws IOException, Exception{
			
		DoThis.click(WelcomePage.btnGetmyLoginDetails, "Y");
		if(GetMyLoginPage.rdbtnGetbySMS.getAttribute("checked") != null) {
			Reporter.ReportEventNoImage("Get by SMS is already selected");
		}else {
			DoThis.click(GetMyLoginPage.rdbtnGetbySMS, "Y");
		}
		
		DoThis.clear(browser, GetMyLoginPage.txtbxPhone, "N");
		DoThis.sendkeys(GetMyLoginPage.txtbxPhone, SMS, "Y");
		
		DoThis.click(GetMyLoginPage.btnNext, "Y");
		
	}


}
