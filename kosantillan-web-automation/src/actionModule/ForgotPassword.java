package actionModule;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.ForgotPasswordPage;
import pageObject.ForgotPasswordSubUserPage;
import pageObject.LoginPage;
import pageObject.WelcomePage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

public class ForgotPassword{	
	
	public static void Execute() throws IOException, Exception{
		
		DoThis.click(WelcomePage.btnLogIn, "Y");
		DoThis.click(LoginPage.lnkForgotPassword, "Y");
	
	}
	
	public static void GetbyEmail(String browser, String Email, String activesite) throws IOException, Exception{
		
		DoThis.click(WelcomePage.btnLogIn, "Y");
		DoThis.click(LoginPage.lnkForgotPassword, "Y");
		if(ForgotPasswordPage.rdbtnGetbyEmail.getAttribute("checked") != null) {
			Reporter.ReportEventNoImage("Get by Email is already selected");
		}else {
			DoThis.click(ForgotPasswordPage.rdbtnGetbyEmail, "Y");
		}
		DoThis.clear(browser, ForgotPasswordPage.txtbxEmail, "N");
		DoThis.sendkeys(ForgotPasswordPage.txtbxEmail, Email, "Y");
		
		DoThis.click(ForgotPasswordPage.btnNext, "Y");
		
		String Username = DoThis.getOwnerName(activesite);
		if(DoThis.isObjectAvailable(ForgotPasswordPage.mdlSelectYourAccountToResetYourPassword, "Select Your Account To Reset Your Password Modal", "N")) {
			//Select Account
			switch (activesite) {
			case "ME":
			case "US":
				//Select First Account Option
				DoThis.click(ForgotPasswordPage.txtbxSelectYourAccount, "Y");
				DoThis.click(ForgotPasswordPage.objSelectYourAccountOptions.get(0), "Y");
			break;
			
			default:
				DoThis.sendkeys(ForgotPasswordPage.txtbxSelectYourAccount, Username.toString(), "Y");
				WebElement UsernameLocation = Constant.driver.findElement(By.xpath("//div[contains(@id,'item')][text()='"+Username.toString()+"']"));
				DoThis.click(UsernameLocation, "Y");
			break;
			}
			
			//Click OK button
			DoThis.click(ForgotPasswordPage.btnOK, "Y");
		}
		
	}
	public static void GetbySMS(String browser, String SMS, String activesite) throws IOException, Exception{
			
		DoThis.click(WelcomePage.btnLogIn, "Y");
		DoThis.click(LoginPage.lnkForgotPassword, "Y");
		if(ForgotPasswordPage.rdbtnGetbySMS.getAttribute("checked") != null) {
			Reporter.ReportEventNoImage("Get by SMS is already selected");
		}else {
			DoThis.click(ForgotPasswordPage.rdbtnGetbySMS, "Y");
		}
		
		DoThis.clear(browser, ForgotPasswordPage.txtbxPhone, "N");
		DoThis.sendkeys(ForgotPasswordPage.txtbxPhone, SMS, "Y");
		
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
			DoThis.click(ForgotPasswordPage.btnNext, "Y");
			
			String Username = DoThis.getOwnerName(activesite);
			if(DoThis.isObjectAvailable(ForgotPasswordPage.mdlSelectYourAccountToResetYourPassword, "Select Your Account To Reset Your Password Modal", "N")) {
				
				//Select Account
				DoThis.sendkeys(ForgotPasswordPage.txtbxSelectYourAccount, Username.toString(), "Y");
				WebElement UsernameLocation = Constant.driver.findElement(By.xpath("//div[contains(@id,'item')][text()='"+Username.toString()+"']"));
				DoThis.click(UsernameLocation, "Y");
				
				//Click OK button
				DoThis.click(ForgotPasswordPage.btnOK, "Y");
			}
		break;
		}
		

	}
	
	public static void GetbySubUserSMS(String browser, String SMS, String activesite) throws IOException, Exception{
		
		DoThis.click(WelcomePage.btnLogIn, "Y");
		DoThis.click(LoginPage.lnkForgotPassword, "Y");
		if(ForgotPasswordPage.rdbtnGetbySMS.getAttribute("checked") != null) {
			Reporter.ReportEventNoImage("Get by SMS is already selected");
		}else {
			DoThis.click(ForgotPasswordPage.rdbtnGetbySMS, "Y");
		}
		
		DoThis.clear(browser, ForgotPasswordPage.txtbxPhone, "N");
		DoThis.sendkeys(ForgotPasswordPage.txtbxPhone, SMS, "Y");
		
		
		DoThis.click(ForgotPasswordPage.btnNext, "Y");
			
		String Username = DoThis.getOwnerName(activesite);
		if(DoThis.isObjectAvailable(ForgotPasswordPage.mdlSelectYourAccountToResetYourPassword, "Select Your Account To Reset Your Password Modal", "N")) {
			
			//Select Account
			DoThis.sendkeys(ForgotPasswordPage.txtbxSelectYourAccount, Username.toString(), "Y");
			WebElement UsernameLocation = Constant.driver.findElement(By.xpath("//div[contains(@id,'item')][text()='"+Username.toString()+"']"));
			DoThis.click(UsernameLocation, "Y");
			
			//Click OK button
			DoThis.click(ForgotPasswordPage.btnOK, "Y");
		}
		
	}
	public static void SubUser() throws IOException, Exception{
		
		DoThis.click(WelcomePage.btnLogIn, "Y");
		DoThis.click(LoginPage.lnkForgotPassword, "Y");
		
		DoThis.click(ForgotPasswordPage.btnImASubUser, "Y");
	
	}
	
	public static void ReturnHome() throws IOException, Exception{
		
		DoThis.click(ForgotPasswordSubUserPage.btnHome, "Y");
	
	}

}
