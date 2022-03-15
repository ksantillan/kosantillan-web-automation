package actionModule;

import java.io.IOException;
import java.util.Dictionary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObject.ListPage;
import pageObject.SettingsPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

public class ProfileSettings{	
	
	public static void AdvancedSettings(@SuppressWarnings("rawtypes") Dictionary TokenDetails, String activesite) throws IOException, Exception{
		
		//Navigate to Profile Settings Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		
		//Click Advanced Settings
		DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnAdvancedSettings);
		DoThis.click(SettingsPage.ProfileSettingsTab.btnAdvancedSettings, "Y");
		
		switch (TokenDetails.get("token").toString()) {
		
		case "enable token":
			
			switch (activesite) {
			
			case "PT":
			if(!DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnEnableToken, "Enable Token button", "N")) {
				if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnAtivarToken, "Enable Token button is displayed", "NA")){
					DoThis.click(SettingsPage.ProfileSettingsTab.btnAtivarToken, "Y");
					//Wait for Disabled Button to displayed
					DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnDesativarToken);
					
				}else {
					Reporter.ReportEventNoImage("Token is already Enabled");
					
				}
			}else {
				if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnEnableToken, "Enable Token button is displayed", "NA")){
					DoThis.click(SettingsPage.ProfileSettingsTab.btnEnableToken, "Y");
					//Wait for Disabled Button to displayed
					DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnDisableToken);
					
				}else {
					Reporter.ReportEventNoImage("Token is already Enabled");
					
				}
			}
			break;
			
			case "PL":
			if(!DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnEnableToken, "Enable Token button", "N")) {
				if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnwcztoken, "Enable Token button is displayed", "NA")){
					DoThis.click(SettingsPage.ProfileSettingsTab.btnwcztoken, "Y");
					//Wait for Disabled Button to displayed
					DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnDezaktywujToken);
					
				}else {
					Reporter.ReportEventNoImage("Token is already Enabled");
					
				}
			}else {
				if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnEnableToken, "Enable Token button is displayed", "NA")){
					DoThis.click(SettingsPage.ProfileSettingsTab.btnEnableToken, "Y");
					//Wait for Disabled Button to displayed
					DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnDisableToken);
					
				}else {
					Reporter.ReportEventNoImage("Token is already Enabled");
					
				}
			}
			break;
			
			default:
				if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnEnableToken, "Enable Token button is displayed", "NA")){
					DoThis.click(SettingsPage.ProfileSettingsTab.btnEnableToken, "Y");
					//Wait for Disabled Button to displayed
					DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnDisableToken);
					
				}else {
					Reporter.ReportEventNoImage("Token is already Enabled");
					
				}
			break;
			}
		break;
		
		case "disable token":
			
			switch (activesite) {
			
			case "PT":
				if(!DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnDisableToken, "Disable Token button", "N")) {
					if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnDesativarToken, "Disable Token button is displayed", "NA")){
						DoThis.click(SettingsPage.ProfileSettingsTab.btnDesativarToken, "Y");
						//Wait for Disabled Button to displayed
						DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnAtivarToken);
					}else {
						Reporter.ReportEventNoImage("Token is already Disable");
						
					}
				}else {
					if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnDisableToken, "Disable Token button is displayed", "NA")){
						DoThis.click(SettingsPage.ProfileSettingsTab.btnDisableToken, "Y");
						//Wait for Disabled Button to displayed
						DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnEnableToken);
					}else {
						Reporter.ReportEventNoImage("Token is already Disable");
						
					}
				}
			break;
			
			case "PL":
				if(!DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnDisableToken, "Disable Token button", "N")) {
					if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnDezaktywujToken, "Disable Token button is displayed", "NA")){
						DoThis.click(SettingsPage.ProfileSettingsTab.btnDezaktywujToken, "Y");
						//Wait for Disabled Button to displayed
						DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnwcztoken);
					}else {
						Reporter.ReportEventNoImage("Token is already Disable");
						
					}
				}else {
					if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnDisableToken, "Disable Token button is displayed", "NA")){
						DoThis.click(SettingsPage.ProfileSettingsTab.btnDisableToken, "Y");
						//Wait for Disabled Button to displayed
						DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnEnableToken);
					}else {
						Reporter.ReportEventNoImage("Token is already Disable");
						
					}
				}
			break;
			
			default:
				if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.btnDisableToken, "Disable Token button is displayed", "NA")){
					DoThis.click(SettingsPage.ProfileSettingsTab.btnDisableToken, "Y");
					//Wait for Disabled Button to displayed
					DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnEnableToken);
				}else {
					Reporter.ReportEventNoImage("Token is already Disable");
					
				}
			break;
			}
		break;
		}
		
	}
	
	public static void EditProfile(String browser, @SuppressWarnings("rawtypes") Dictionary ProfileDetails) throws IOException, Exception{
		
		//Navigate to Profile Settings Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		
		//Click Edit Button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnEditUser, "Y");
		
		//Check if the Chat bot is displayed
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objFleetChatbot, "Fleet Chat Bot", "N")) {
			DoThis.click(SettingsPage.ProfileSettingsTab.objFleetChatbot, "Y");
		}
		
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.txtbxName, "Name", "N")) {
			//Get Current values for Name and Language
			String currentName = DoThis.getAttribute(SettingsPage.ProfileSettingsTab.txtbxName, "value");
			String currentLanguage = DoThis.getAttribute(SettingsPage.ProfileSettingsTab.drpdwnLanguage, "value");
			
			//Update Name and Language
			DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxName, "N");
			DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxName, ProfileDetails.get("name").toString(), "Y");
			
			DoThis.click(SettingsPage.ProfileSettingsTab.drpdwnLanguage, "Y");
			WebElement Language = Constant.driver.findElement(By.xpath("//div[contains(@id,'item')][text()='"+ProfileDetails.get("language")+"']"));
			DoThis.click(Language, "Y");
			
			//Click Save button
			DoThis.click(SettingsPage.ProfileSettingsTab.btnSave, "Y");
			
			if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "NA")){
				DoThis.isContainingText(SettingsPage.ProfileSettingsTab.objToaster, "User update successful", "Toaster message", "Y");
				}
			
			//Return back to previous values
			
			//Click Edit Button
			DoThis.click(SettingsPage.ProfileSettingsTab.btnEditUser, "Y");
			
			//Update Name and Language
			DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxName, "N");
			DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxName, currentName, "Y");
			
			DoThis.click(SettingsPage.ProfileSettingsTab.drpdwnLanguage, "Y");
			WebElement PreviousLanguage = Constant.driver.findElement(By.xpath("//div[contains(@id,'item')][text()='"+currentLanguage+"']"));
			DoThis.click(PreviousLanguage, "Y");
			
		}
		
		//Click Save button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "NA")){
			DoThis.isContainingText(SettingsPage.ProfileSettingsTab.objToaster, "User update successful", "Toaster message", "Y");
			}
		
		
	}
	
	public static void UpdateProfileImage(String browser, @SuppressWarnings("rawtypes") Dictionary ProfileDetails) throws IOException, Exception{
		
		//Navigate to Profile Settings Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		
		//Click Edit Button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnEditUser, "Y");
		
		//Upload Image
		DoThis.uploadFile(browser, SettingsPage.ProfileSettingsTab.txtbxUploadImage, ProfileDetails.get("file_path").toString(), "Y");
	
		//Click Save button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "NA")){
			DoThis.isContainingText(SettingsPage.ProfileSettingsTab.objToaster, "User update successful", "Toaster message", "Y");
			}
	}
	
	public static void EditCompany(String browser, @SuppressWarnings("rawtypes") Dictionary ProfileDetails) throws IOException, Exception{
		
		//Navigate to Profile Settings Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		
		//Click Edit Button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnEditUser, "Y");
		
		//Get Current values for Company Name
		String currentCompanyName = DoThis.getAttribute(SettingsPage.ProfileSettingsTab.txtbxCompanyName, "value");
		
		//Update Company Name 
		DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxCompanyName, "N");
		DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxCompanyName, ProfileDetails.get("company_name").toString(), "Y");
		
		//Validate Email is not modifiable
		DoThis.IsObjectDisabled("Email Address field", SettingsPage.ProfileSettingsTab.txtbxEmail, "Y");
		
		//Click Save button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "NA")){
			DoThis.isContainingText(SettingsPage.ProfileSettingsTab.objToaster, "User update successful", "Toaster message", "Y");
			}
		
		//Return back to previous values
		
		//Click Edit Button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnEditUser, "Y");
		
		//Update Company Name
		DoThis.clear(browser, SettingsPage.ProfileSettingsTab.txtbxCompanyName, "N");
		DoThis.sendkeys(SettingsPage.ProfileSettingsTab.txtbxCompanyName, currentCompanyName, "Y");
		
		//Click Save button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "NA")){
			DoThis.isContainingText(SettingsPage.ProfileSettingsTab.objToaster, "User update successful", "Toaster message", "Y");
			}
	}
	
	public static void UpdateGPSFormat(@SuppressWarnings("rawtypes") Dictionary ProfileDetails) throws IOException, Exception{
		
		//Navigate to Profile Settings >> Profile >> Company Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ProfileSettingsTab.btnAdvancedSettings, "Y");
		
		//Click Edit button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnEditUser, "Y");
		
		switch (ProfileDetails.get("gps_format").toString()) {
		
		case "DMS":
			DoThis.click(SettingsPage.ProfileSettingsTab.rdnbtnDecimalMinutesSeconds, "Y");
			break;
			
		case "DD":
			DoThis.click(SettingsPage.ProfileSettingsTab.rdnbtnDecimalDegrees, "Y");
			break;
		}
		//Click Save button
		DoThis.click(SettingsPage.ProfileSettingsTab.btnSave, "Y");
		
		//Wait for toaster to load
		DoThis.WaitForToasterMessageToLoad(SettingsPage.ProfileSettingsTab.objToaster);
	
		//Validate toaster message
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "N")) {
			DoThis.isContainingText(SettingsPage.ProfileSettingsTab.objToaster, "User update successful", "Toaster message", "Y");
		}
		
	}
		
		

}
