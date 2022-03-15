package actionModule;

import java.io.IOException;
import pageObject.GetMyLoginPage;
import pageObject.LoginPage;
import pageObject.WelcomePage;
import utility.DoThis;
import utility.Reporter;

public class ForgotUsername{	
		
	public static void GetbyEmail(String browser, String Email, String activesite) throws IOException, Exception{
		
		//Click Log In button
		DoThis.click(WelcomePage.btnLogIn, "Y");
		
		//Click Forgot Username
		DoThis.click(LoginPage.lnkForgotUsername, "Y");
		
		if(GetMyLoginPage.rdbtnGetbyEmail.getAttribute("checked") != null) {
			Reporter.ReportEventNoImage("Get by Email is already selected");
		}else {
			DoThis.click(GetMyLoginPage.rdbtnGetbyEmail, "Y");
		}
		DoThis.clear(browser, GetMyLoginPage.txtbxEmail, "N");
		DoThis.sendkeys(GetMyLoginPage.txtbxEmail, Email, "Y");
		
		DoThis.click(GetMyLoginPage.btnNext, "Y");
		
		String Username = DoThis.getOwnerName(activesite);
		if(DoThis.isObjectAvailable(GetMyLoginPage.mdlSelectYourAccountToResetYourPassword, "Select Your Account To Reset Your Password Modal", "NA")) {
			
			//Select First Account Option
			DoThis.click(GetMyLoginPage.txtbxSelectYourAccount, "Y");
			DoThis.click(GetMyLoginPage.objSelectYourAccountOptions.get(0), "Y");
			
			//Click OK button
			DoThis.click(GetMyLoginPage.btnOK, "Y");
		}
	
		
	}
	public static void GetbySMS(String browser, String SMS, String activesite) throws IOException, Exception{
				
		if(GetMyLoginPage.rdbtnGetbySMS.getAttribute("checked") != null) {
			Reporter.ReportEventNoImage("Get by SMS is already selected");
		}else {
			DoThis.click(GetMyLoginPage.rdbtnGetbySMS, "Y");
		}
		
		DoThis.clear(browser, GetMyLoginPage.txtbxPhone, "N");
		DoThis.sendkeys(GetMyLoginPage.txtbxPhone, SMS, "Y");
		
		switch (activesite) {
		//Add here countries that does not have valid SMS associated data
		case "NZ":
		case "US":
		case "AU":
		case "FR":
		case "MW":
		case "MZ":
		case "RW":
		case "SZ":
		case "ZW":
			Reporter.ReportEventNoImage("No valid associated SMS data for "+activesite);
		break;
		
		default:
		DoThis.click(GetMyLoginPage.btnNext, "Y");
		
		if(DoThis.isObjectAvailable(GetMyLoginPage.mdlSelectYourAccountToResetYourPassword, "Select Your Account To Reset Your Password Modal", "NA")) {
			
			//Select First Account Option
			DoThis.click(GetMyLoginPage.txtbxSelectYourAccount, "Y");
			DoThis.click(GetMyLoginPage.objSelectYourAccountOptions.get(0), "Y");
			
			//Click OK button
			DoThis.click(GetMyLoginPage.btnOK, "Y");
			}
		break;
		}
		
	}


}
