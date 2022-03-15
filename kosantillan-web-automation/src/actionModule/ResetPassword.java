package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import pageObject.SettingsPage;
import utility.DoThis;
import utility.Reporter;

public class ResetPassword{	
	
	public static void Execute(String browser, @SuppressWarnings("rawtypes") Dictionary ChangePasswordDetails, String activesite) throws IOException, Exception{
		
		//Navigate to Profile Settings Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		
		//Click Edit Button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnEditUser, "Y");
		
		//Click Change Password button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnChangePassword, "Y");
		//Add Countries that use SSO Token
		switch (activesite) {
		case "NZ":
		case "AU":
		case "ES":
		case "FR":
		case "NA":
		case "KE":
		case "PH":
		case "NG":					
		case "BW":
		case "ID":
		case "MY":
		case "MW":
		case "SZ":
			Reporter.ReportEventNoImage("No valid data for password reset for "+activesite+". Currently using SSO Token to login");
		break;
		default:
		
			//Wait for Password fields to appeared
			DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.txtbxCurrentPassword);
			
			//Set Current, New and Confirm Password fields
			DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxCurrentPassword, "N");
			DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxCurrentPassword, ChangePasswordDetails.get("current_password").toString(), "Y");
			
			DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxNewPassword, "N");
			DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxNewPassword, ChangePasswordDetails.get("new_password").toString(), "Y");
			
			DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxConfirmPassword, "N");
			DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxConfirmPassword, ChangePasswordDetails.get("confirm_password").toString(), "Y");
				
			//Click Save button
			DoThis.click(SettingsPage.ProfileSettingsTab.btnSave, "Y");
			
			if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "N")) {
				Reporter.ReportEventNoImage("User update successful toaster message is displayed");
			}
			
			//Return back to original password
			
			//Click Edit Button
			DoThis.click(SettingsPage.ProfileSettingsTab.btnEditUser, "Y");
			
			//Click Change Password button
			DoThis.click(SettingsPage.ProfileSettingsTab.btnChangePassword, "Y");
			
			
			//Wait for Password fields to appeared
			DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.txtbxCurrentPassword);
			
			//Set Current, New and Confirm Password fields
			DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxCurrentPassword, "N");
			DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxCurrentPassword, ChangePasswordDetails.get("new_password").toString(), "Y");
			
			DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxNewPassword, "N");
			DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxNewPassword, ChangePasswordDetails.get("current_password").toString(), "Y");
			
			DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxConfirmPassword, "N");
			DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxConfirmPassword, ChangePasswordDetails.get("current_password").toString(), "Y");
				
			//Click Save button
			DoThis.click(SettingsPage.ProfileSettingsTab.btnSave, "Y");
			
			if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "N")) {
				Reporter.ReportEventNoImage("User update successful toaster message is displayed");
			}
			
		break;
		}
	
	}
	
	public static void ViaAdmin(String browser, String subuser) throws IOException, Exception{
		
		//Search SubUser
		ManageUsers.SearchUser(browser, subuser);
		
		//Click Reset Password button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnResetPassword, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "N")) {
			DoThis.Hover(SettingsPage.ProfileSettingsTab.objToaster);
			DoThis.isContainingText(SettingsPage.ProfileSettingsTab.objToaster, "An email to reset password was sent to the user", "Toaster message", "Y");
		}
	}
	
	public static void SubUser(String browser, @SuppressWarnings("rawtypes") Dictionary ChangePasswordDetails, String activesite) throws IOException, Exception{
		
		//Navigate to Profile Settings Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		
		//Click Edit Button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnEditUser, "Y");
		
		//Click Change Password button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnChangePassword, "Y");
		
		//Wait for Password fields to appeared
		DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.txtbxCurrentPassword);
		
		//Set Current, New and Confirm Password fields
		DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxCurrentPassword, "N");
		DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxCurrentPassword, ChangePasswordDetails.get("current_password").toString(), "Y");
		
		DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxNewPassword, "N");
		DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxNewPassword, ChangePasswordDetails.get("new_password").toString(), "Y");
		
		DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxConfirmPassword, "N");
		DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxConfirmPassword, ChangePasswordDetails.get("confirm_password").toString(), "Y");
			
		//Click Save button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("User update successful toaster message is displayed");
		}
		
		//Return back to original password
		
		//Click Edit Button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnEditUser, "Y");
		
		//Click Change Password button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnChangePassword, "Y");
	
		//Wait for Password fields to appeared
		DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.txtbxCurrentPassword);
		
		//Set Current, New and Confirm Password fields
		DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxCurrentPassword, "N");
		DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxCurrentPassword, ChangePasswordDetails.get("new_password").toString(), "Y");
		
		DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxNewPassword, "N");
		DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxNewPassword, ChangePasswordDetails.get("current_password").toString(), "Y");
		
		DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxConfirmPassword, "N");
		DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxConfirmPassword, ChangePasswordDetails.get("current_password").toString(), "Y");
			
		//Click Save button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("User update successful toaster message is displayed");
		}

	}

}
