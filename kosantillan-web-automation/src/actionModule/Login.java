package actionModule;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.LoginPage;
import pageObject.MapPage;
import pageObject.WelcomePage;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

public class Login{	
	
	public static void Admin(String browser, String language, boolean stayLoggedIn, String activesite) throws IOException, Exception{
		
		switch(activesite) {
		//Only Add Countries that accessible via SSO Token link
			case "NA":
			case "KE":
			case "PH":
			case "NG":
			case "BW":
			case "FR":
			case "ID":
			case "MY":
			case "NZ":
			case "AU":
			case "ES":
			case "MW":
			case "HINOID":
			case "MANKE":
			case "OWSAUTOME":
			case "NORWOODNZ":
			case "ARVALPL":
			case "PANUSTH":
			case "HINOZA":
			case "MANZA":
			case "TELTRACKZW":
			case "TOYOTAKE":
			case "TOYOTATZ":
			case "TOYOTAMW":
			Reporter.ReportEventNoImage("SSO Token is used to login for "+activesite);
			break;
			default:
			String Username = null;
			String Password = null;
			activesite = activesite.toString();
			ConfigReader config = new ConfigReader();
			switch(activesite) {
				case "SG":
				{
					Username = config.getSGUserName();
					Password = config.getSGPassword(); break;
				}
				case "TH":
				{
					Username = config.getTHUserName();
					Password = config.getTHPassword(); break;
				}
				
				case "ZA":
				{
					Username = config.getZAUserName();
					Password = config.getZAPassword(); break;
				}
				
				case "PT":
				{
					Username = config.getPTUserName();
					Password = config.getPTPassword(); break;
				}
				
				case "ID":
				{
					Username = config.getIDUserName();
					Password = config.getIDPassword(); break;
				}
				
				case "PL":
				{
					Username = config.getPLUserName();
					Password = config.getPLPassword(); break;
				}
				
				case "HK":
				{
					Username = config.getHKUserName();
					Password = config.getHKPassword(); break;
				}
				
				case "US":
				{
					Username = config.getUSUserName();
					Password = config.getUSPassword(); break;
				}
				
				case "ME":
				{
					Username = config.getMEUserName();
					Password = config.getMEPassword(); break;
				}
				
				case "NZ":
				{
					Username = config.getNZUserName();
					Password = config.getNZPassword(); break;
				}
				
				case "AU":
				{
					Username = config.getAUUserName();
					Password = config.getAUPassword(); break;
				}
				
				case "SZ":
				{
					Username = config.getSZUserName();
					Password = config.getSZPassword(); break;
				}
				
				case "MY":
				{
					Username = config.getMYUserName();
					Password = config.getMYPassword(); break;

				}
				
				case "MZ":
				{
					Username = config.getMZUserName();
					Password = config.getMZPassword(); break;
				}
				
				case "ZW":
				{
					Username = config.getZWUserName();
					Password = config.getZWPassword(); break;

				}
				
				case "ES":
				{
					Username = config.getESUserName();
					Password = config.getESPassword(); break;

				}
				
				case "RW":
				{
					Username = config.getRWUserName();
					Password = config.getRWPassword(); break;

				}
				
				case "TZ":
				{
					Username = config.getTZUserName();
					Password = config.getTZPassword(); break;

				}
				
				case "MW":
				{
					Username = config.getMWUserName();
					Password = config.getMWPassword(); break;

				}
				//Add switch case options for other countries
				
			}
			//Wait for Element to load
			while(!DoThis.isObjectAvailable(WelcomePage.btnLogIn, "Login button", "N")) {
				DoThis.WaitForElementToLoad(WelcomePage.btnLogIn);
			}
				
			DoThis.click(WelcomePage.btnLogIn, "Y");
			
			//Wait for element to load
			DoThis.WaitForElementToLoad(LoginPage.rdbtnAdmin);
			
			DoThis.click(LoginPage.rdbtnAdmin, "Y");
			
			DoThis.clear(browser, LoginPage.txtbxUsername, "NA");
			DoThis.sendkeys(LoginPage.txtbxUsername, Username,"Y");
			
			DoThis.clear(browser, LoginPage.txtbxPassword, "NA");
			DoThis.sendkeys(LoginPage.txtbxPassword, Password,"Y");
			
			//Select Language
			DoThis.click(LoginPage.cmbbxLanguage, "Y");
			WebElement LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
			DoThis.click(LanguageElement, "Y");
			
			//Stay Logged In
			if(stayLoggedIn == true) {
				DoThis.click(LoginPage.chkbxStayLoggedIn, "Y");
			}else {
				Reporter.ReportEventNoImage("Stay Logged In is not checked");
			}
			
			DoThis.click(LoginPage.btnLogin,"Y");
			break;
			
		}
		//Wait for Vehicle List to displayed
		DoThis.WaitForElementToLoad(MapPage.Fleettab.lstVehicleList);
		
		//This will handle if there System Notice displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlSystemNotice, "System Notice Modal", "NA")) {
			Reporter.ReportEventNoImage("System Notice Modal is displayed");
			DoThis.click(LoginPage.icnCloseSystemNotice, "Y");
		}else {
			Reporter.ReportEventNoImage("System Notice Modal is NOT displayed");  		
		}
		
		//This will handle if change password popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlForceChangePassword, "Change Password popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Force Change Password popup is displayed");
			DoThis.click(LoginPage.btnCancel, "Y");
		}else {
			Reporter.ReportEventNoImage("Force Change Password popup is NOT displayed");  		
		}
		
		//This will handle if Important message popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlImportantMessage, "Important Message popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Important Message popup is displayed");
			DoThis.click(LoginPage.icnCloseImportantMessage, "Y");
		}else {
			Reporter.ReportEventNoImage("Important Message popup is NOT displayed");  		
		}
		
				
	}	
	public static void SubUser(String browser, String language, boolean stayLoggedIn, String activesite) throws IOException, Exception{
		
		String Username = null;
		String SubUsername = null;
		String SubPassword = null;
		
		activesite = activesite.toString();
		ConfigReader config = new ConfigReader();
		switch(activesite) {
			case "SG":
			{
				Username = config.getSGUserName();
				SubUsername = config.getSGSubUserName();
				SubPassword = config.getSGSubPassword(); break;
			}
			case "TH":
			{
				Username = config.getTHUserName();
				SubUsername = config.getTHSubUserName();
				SubPassword = config.getTHSubPassword(); break;
			}
			
			case "ZA":
			{
				Username = config.getZAUserName();
				SubUsername = config.getZASubUserName();
				SubPassword = config.getZASubPassword(); break;
			}
			
			case "PT":
				
			{
				Username = config.getPTUserName();
				SubUsername = config.getPTSubUserName();
				SubPassword = config.getPTSubPassword(); break;
			}
			
			case "ID":
				
			{
				Username = config.getIDUserName();
				SubUsername = config.getIDSubUserName();
				SubPassword = config.getIDSubPassword(); break;
			}
			
			case "PL":
				
			{
				Username = config.getPLUserName();
				SubUsername = config.getPLSubUserName();
				SubPassword = config.getPLSubPassword(); break;
			}
			
			case "HK":
				
			{
				Username = config.getHKUserName();
				SubUsername = config.getHKSubUserName();
				SubPassword = config.getHKSubPassword(); break;
			}
			
			case "US":
				
			{
				Username = config.getUSUserName();
				SubUsername = config.getUSSubUserName();
				SubPassword = config.getUSSubPassword(); break;
			}
			
			case "ME":
				
			{
				Username = config.getMEUserName();
				SubUsername = config.getMESubUserName();
				SubPassword = config.getMESubPassword(); break;
			}
			
			case "NZ":
				
			{
				Username = config.getNZUserName();
				SubUsername = config.getNZSubUserName();
				SubPassword = config.getNZSubPassword(); break;
			}
			
			case "AU":
				
			{
				Username = config.getAUUserName();
				SubUsername = config.getAUSubUserName();
				SubPassword = config.getAUSubPassword(); break;
			}
			
			case "SZ":
				
			{
				Username = config.getSZUserName();
				SubUsername = config.getSZSubUserName();
				SubPassword = config.getSZSubPassword(); break;
			}
			
			case "MY":
				
			{
				Username = config.getMYUserName();
				SubUsername = config.getMYSubUserName();
				SubPassword = config.getMYSubPassword(); break;

			}
			
			case "MZ":
				
			{
				Username = config.getMZUserName();
				SubUsername = config.getMZSubUserName();
				SubPassword = config.getMZSubPassword(); break;

			}
			
			case "ZW":
				
			{
				Username = config.getZWUserName();
				SubUsername = config.getZWSubUserName();
				SubPassword = config.getZWSubPassword(); break;

			}
			
			case "ES":
				
			{
				Username = config.getESUserName();
				SubUsername = config.getESSubUserName();
				SubPassword = config.getESSubPassword(); break;

			}
			
			case "RW":
				
			{
				Username = config.getRWUserName();
				SubUsername = config.getRWSubUserName();
				SubPassword = config.getRWSubPassword(); break;

			}
			
			case "TZ":
				
			{
				Username = config.getTZUserName();
				SubUsername = config.getTZSubUserName();
				SubPassword = config.getTZSubPassword(); break;

			}
			
			case "NA":
				
			{
				Username = config.getNAUserName();
				SubUsername = config.getNASubUserName();
				SubPassword = config.getNASubPassword(); break;

			}
			
			case "KE":
				
			{
				Username = config.getKEUserName();
				SubUsername = config.getKESubUserName();
				SubPassword = config.getKESubPassword(); break;

			}
			
			case "PH":
				
			{
				Username = config.getPHUserName();
				SubUsername = config.getPHSubUserName();
				SubPassword = config.getPHSubPassword(); break;

			}
			
			case "NG":
				
			{
				Username = config.getNGUserName();
				SubUsername = config.getNGSubUserName();
				SubPassword = config.getNGSubPassword(); break;
			}
			
			case "BW":
				
			{
				Username = config.getBWUserName();
				SubUsername = config.getBWSubUserName();
				SubPassword = config.getBWSubPassword(); break;

			}
			
			case "FR":
				
			{
				Username = config.getFRUserName();
				SubUsername = config.getFRSubUserName();
				SubPassword = config.getFRSubPassword(); break;

			}
			
			case "MW":
				
			{
				Username = config.getMWUserName();
				SubUsername = config.getMWSubUserName();
				SubPassword = config.getMWSubPassword(); break;

			}
			
			//Add switch case options for other countries
			
		}
		//Wait for element to load
		DoThis.WaitForElementToLoad(WelcomePage.btnLogIn);
		
		DoThis.click(WelcomePage.btnLogIn, "Y");
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(LoginPage.rdbtnSubUser);
		
		DoThis.click(LoginPage.rdbtnSubUser, "Y");
		
		DoThis.clear(browser, LoginPage.txtbxUsername, "NA");
		DoThis.sendkeys(LoginPage.txtbxUsername, Username,"Y");
		DoThis.clear(browser, LoginPage.txtbxSubUsername, "NA");
		DoThis.sendkeys(LoginPage.txtbxSubUsername, SubUsername,"Y");
		DoThis.clear(browser, LoginPage.txtbxSubPassword, "NA");
		DoThis.sendkeys(LoginPage.txtbxSubPassword, SubPassword,"Y");
		
		//Select Language
		DoThis.click(LoginPage.cmbbxLanguage, "Y");
		WebElement LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
		DoThis.click(LanguageElement, "Y");
		
		//Stay Logged In
		if(stayLoggedIn == true) {
			DoThis.click(LoginPage.chkbxStayLoggedIn, "Y");
		}else {
			Reporter.ReportEventNoImage("Stay Logged In is not checked");
		}
				
		
		DoThis.click(LoginPage.btnLogin,"Y");
		
		//Wait for Vehicle List to displayed
		//Wait for Setting button to displayed
		DoThis.WaitForElementToLoad(MapPage.Fleettab.btnSettings);
		if(!DoThis.isObjectAvailable(MapPage.Fleettab.objVehicleListNoResult, "No Vehicle List", "NA")) {
			DoThis.WaitForElementToLoad(MapPage.Fleettab.lstVehicleList);
		}
		
		//This will handle if there System Notice displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlSystemNotice, "System Notice Modal", "NA")) {
			Reporter.ReportEventNoImage("System Notice Modal is displayed");
			DoThis.click(LoginPage.icnCloseSystemNotice, "Y");
		}else {
			Reporter.ReportEventNoImage("System Notice Modal is NOT displayed");  		
		}
		
		//This will handle if change password popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlForceChangePassword, "Change Password popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Force Change Password popup is displayed");
			DoThis.click(LoginPage.btnCancel, "Y");
		}else {
			Reporter.ReportEventNoImage("Force Change Password popup is NOT displayed");  		
		}	
		
		//This will handle if Important message popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlImportantMessage, "Important Message popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Important Message popup is displayed");
			DoThis.click(LoginPage.icnCloseImportantMessage, "Y");
		}else {
			Reporter.ReportEventNoImage("Important Message popup is NOT displayed");  		
		}
		
	}	
	public static void Invalid_Login(String browser, String language, boolean stayLoggedIn, String activesite ) throws IOException, Exception{
		
		String Username = null;
		String Password = null;
		
		activesite = activesite.toString();
		ConfigReader config = new ConfigReader();
		switch(activesite) {
			case "SG":
			{
				Username = config.getSGInvalidUserName();
				Password = config.getSGInvalidPassword(); break;
			}
			case "TH":
			{
				Username = config.getTHInvalidUserName();
				Password = config.getTHInvalidPassword(); break;
			}
			
			case "ZA":
			{
				Username = config.getZAInvalidUserName();
				Password = config.getZAInvalidPassword(); break;
			}
			
			case "PT":
			{
				Username = config.getPTInvalidUserName();
				Password = config.getPTInvalidPassword(); break;
			}
			
			case "ID":
			{
				Username = config.getIDInvalidUserName();
				Password = config.getIDInvalidPassword(); break;
			}
			
			case "PL":
			{
				Username = config.getPLInvalidUserName();
				Password = config.getPLInvalidPassword(); break;
			}
			
			case "HK":
			{
				Username = config.getHKInvalidUserName();
				Password = config.getHKInvalidPassword(); break;
			}
			
			case "US":
			{
				Username = config.getUSInvalidUserName();
				Password = config.getUSInvalidPassword(); break;
			}
			
			case "ME":
			{
				Username = config.getMEInvalidUserName();
				Password = config.getMEInvalidPassword(); break;
			}
			
			case "NZ":
			{
				Username = config.getNZInvalidUserName();
				Password = config.getNZInvalidPassword(); break;
			}
			
			case "AU":
			{
				Username = config.getAUInvalidUserName();
				Password = config.getAUInvalidPassword(); break;
			}
			
			case "SZ":
			{
				Username = config.getSZInvalidUserName();
				Password = config.getSZInvalidPassword(); break;
			}
			
			case "MY":
			{
				Username = config.getMYInvalidUserName();
				Password = config.getMYInvalidPassword(); break;

			}
			
			case "MZ":
			{
				Username = config.getMZInvalidUserName();
				Password = config.getMZInvalidPassword(); break;

			}
			
			case "ZW":
			{
				Username = config.getZWInvalidUserName();
				Password = config.getZWInvalidPassword(); break;

			}
			
			case "ES":
			{
				Username = config.getESInvalidUserName();
				Password = config.getESInvalidPassword(); break;

			}
			
			case "RW":
			{
				Username = config.getRWInvalidUserName();
				Password = config.getRWInvalidPassword(); break;

			}
			
			case "TZ":
			{
				Username = config.getTZInvalidUserName();
				Password = config.getTZInvalidPassword(); break;

			}
			
			case "NA":
			{
				Username = config.getNAInvalidUserName();
				Password = config.getNAInvalidPassword(); break;

			}
			
			case "KE":
			{
				Username = config.getKEInvalidUserName();
				Password = config.getKEInvalidPassword(); break;

			}
			
			case "PH":
			{
				Username = config.getPHInvalidUserName();
				Password = config.getPHInvalidPassword(); break;

			}
			
			case "BW":
			{
				Username = config.getBWInvalidUserName();
				Password = config.getBWInvalidPassword(); break;

			}
			
			case "FR":
			{
				Username = config.getFRInvalidUserName();
				Password = config.getFRInvalidPassword(); break;

			}
			
			case "MW":
			{
				Username = config.getMWInvalidUserName();
				Password = config.getMWInvalidPassword(); break;

			}
			
			//Add switch case options for other countries
		}
		DoThis.click(WelcomePage.btnLogIn, "Y");

		//Wait for element to load
		DoThis.WaitForElementToLoad(LoginPage.rdbtnAdmin);
		
		DoThis.click(LoginPage.rdbtnAdmin, "Y");
		
		DoThis.clear(browser, LoginPage.txtbxUsername, "NA");
		DoThis.sendkeys(LoginPage.txtbxUsername, Username,"Y");
		DoThis.clear(browser, LoginPage.txtbxPassword, "NA");
		DoThis.sendkeys(LoginPage.txtbxPassword, Password,"Y");
		
		//Select Language
		DoThis.click(LoginPage.cmbbxLanguage, "Y");
		WebElement LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
		DoThis.click(LanguageElement, "Y");
		
		//Stay Logged In
		if(stayLoggedIn == true) {
			DoThis.click(LoginPage.chkbxStayLoggedIn, "Y");
		}else {
			Reporter.ReportEventNoImage("Stay Logged In is not checked");
		}
		
		DoThis.click(LoginPage.btnLogin,"Y");
		
		//Wait for Vehicle List to displayed
		DoThis.WaitForElementToLoad(MapPage.Fleettab.lstVehicleList);
		
		//This will handle if there System Notice displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlSystemNotice, "System Notice Modal", "NA")) {
			Reporter.ReportEventNoImage("System Notice Modal is displayed");
			DoThis.click(LoginPage.icnCloseSystemNotice, "Y");
		}else {
			Reporter.ReportEventNoImage("System Notice Modal is NOT displayed");  		
		}
		
		//This will handle if change password popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlForceChangePassword, "Change Password popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Force Change Password popup is displayed");
			DoThis.click(LoginPage.btnCancel, "Y");
		}else {
			Reporter.ReportEventNoImage("Force Change Password popup is NOT displayed");  		
		}	
		
		//This will handle if Important message popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlImportantMessage, "Important Message popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Important Message popup is displayed");
			DoThis.click(LoginPage.icnCloseImportantMessage, "Y");
		}else {
			Reporter.ReportEventNoImage("Important Message popup is NOT displayed");  		
		}
		
	}	
	public static void POIUserViewEdit(String browser, String language, boolean stayLoggedIn, String activesite) throws IOException, Exception{
		
		String Username = null;
		String SubUsername = null;
		String SubPassword = null;
		
		
		ConfigReader config = new ConfigReader();
		switch(activesite) {
			case "SG":
			{
				Username = config.getSGUserName();
				SubUsername = config.getSGPOIUserViewEditSubUserName();
				SubPassword = config.getSGPOIUserViewEditSubPassword(); break;
			}
			case "TH":
			{
				Username = config.getTHUserName();
				SubUsername = config.getTHPOIUserViewEditSubUserName();
				SubPassword = config.getTHPOIUserViewEditSubPassword(); break;
			}
			
			case "ZA":
			{
				Username = config.getZAUserName();
				SubUsername = config.getZAPOIUserViewEditSubUserName();
				SubPassword = config.getZAPOIUserViewEditSubPassword(); break;
			}
			
			case "PT":
				
			{
				Username = config.getPTUserName();
				SubUsername = config.getPTPOIUserViewEditSubUserName();
				SubPassword = config.getPTPOIUserViewEditSubPassword(); break;
			}
			
			case "ID":
				
			{
				Username = config.getIDUserName();
				SubUsername = config.getIDPOIUserViewEditSubUserName();
				SubPassword = config.getIDPOIUserViewEditSubPassword(); break;
			}
			
			case "PL":
				
			{
				Username = config.getPLUserName();
				SubUsername = config.getPLPOIUserViewEditSubUserName();
				SubPassword = config.getPLPOIUserViewEditSubPassword(); break;
			}
			
			case "HK":
				
			{
				Username = config.getHKUserName();
				SubUsername = config.getHKPOIUserViewEditSubUserName();
				SubPassword = config.getHKPOIUserViewEditSubPassword(); break;
			}
			
			case "US":
				
			{
				Username = config.getUSUserName();
				SubUsername = config.getUSPOIUserViewEditSubUserName();
				SubPassword = config.getUSPOIUserViewEditSubPassword(); break;
			}
			
			case "ME":
				
			{
				Username = config.getMEUserName();
				SubUsername = config.getMEPOIUserViewEditSubUserName();
				SubPassword = config.getMEPOIUserViewEditSubPassword(); break;
			}
			
			case "NZ":
				
			{
				Username = config.getNZUserName();
				SubUsername = config.getNZPOIUserViewEditSubUserName();
				SubPassword = config.getNZPOIUserViewEditSubPassword(); break;
			}
			
			case "AU":
				
			{
				Username = config.getAUUserName();
				SubUsername = config.getAUPOIUserViewEditSubUserName();
				SubPassword = config.getAUPOIUserViewEditSubPassword(); break;
			}
			
			case "SZ":
				
			{
				Username = config.getSZUserName();
				SubUsername = config.getSZPOIUserViewEditSubUserName();
				SubPassword = config.getSZPOIUserViewEditSubPassword(); break;
			}
			
			case "MY":
				
			{
				Username = config.getMYUserName();
				SubUsername = config.getMYPOIUserViewEditSubUserName();
				SubPassword = config.getMYPOIUserViewEditSubPassword(); break;

			}
			
			case "MZ":
				
			{
				Username = config.getMZUserName();
				SubUsername = config.getMZPOIUserViewEditSubUserName();
				SubPassword = config.getMZPOIUserViewEditSubPassword(); break;

			}
			
			case "ZW":
				
			{
				Username = config.getZWUserName();
				SubUsername = config.getZWPOIUserViewEditSubUserName();
				SubPassword = config.getZWPOIUserViewEditSubPassword(); break;

			}
			
			case "ES":
				
			{
				Username = config.getESUserName();
				SubUsername = config.getESPOIUserViewEditSubUserName();
				SubPassword = config.getESPOIUserViewEditSubPassword(); break;

			}
			
			case "RW":
				
			{
				Username = config.getRWUserName();
				SubUsername = config.getRWPOIUserViewEditSubUserName();
				SubPassword = config.getRWPOIUserViewEditSubPassword(); break;

			}
			
			case "TZ":
				
			{
				Username = config.getTZUserName();
				SubUsername = config.getTZPOIUserViewEditSubUserName();
				SubPassword = config.getTZPOIUserViewEditSubPassword(); break;

			}
			
			case "NA":
				
			{
				Username = config.getNAUserName();
				SubUsername = config.getNAPOIUserViewEditSubUserName();
				SubPassword = config.getNAPOIUserViewEditSubPassword(); break;

			}
			
			case "KE":
				
			{
				Username = config.getKEUserName();
				SubUsername = config.getKEPOIUserViewEditSubUserName();
				SubPassword = config.getKEPOIUserViewEditSubPassword(); break;

			}
			
			case "PH":
				
			{
				Username = config.getPHUserName();
				SubUsername = config.getPHPOIUserViewEditSubUserName();
				SubPassword = config.getPHPOIUserViewEditSubPassword(); break;

			}
			
			case "BW":
				
			{
				Username = config.getBWUserName();
				SubUsername = config.getBWPOIUserViewEditSubUserName();
				SubPassword = config.getBWPOIUserViewEditSubPassword(); break;

			}
			
			case "FR":
				
			{
				Username = config.getFRUserName();
				SubUsername = config.getFRPOIUserViewEditSubUserName();
				SubPassword = config.getFRPOIUserViewEditSubPassword(); break;

			}
			
			case "MW":
				
			{
				Username = config.getMWUserName();
				SubUsername = config.getMWPOIUserViewEditSubUserName();
				SubPassword = config.getMWPOIUserViewEditSubPassword(); break;

			}
			
			
			//Add switch case options for other countries
			
		}
		DoThis.click(WelcomePage.btnLogIn, "Y");
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(LoginPage.rdbtnSubUser);
		
		DoThis.click(LoginPage.rdbtnSubUser, "Y");
		
		DoThis.clear(browser, LoginPage.txtbxUsername, "NA");
		DoThis.sendkeys(LoginPage.txtbxUsername, Username,"Y");
		DoThis.clear(browser, LoginPage.txtbxSubUsername, "NA");
		DoThis.sendkeys(LoginPage.txtbxSubUsername, SubUsername,"Y");
		DoThis.clear(browser, LoginPage.txtbxSubPassword, "NA");
		DoThis.sendkeys(LoginPage.txtbxSubPassword, SubPassword,"Y");
		
		//Select Language
		DoThis.click(LoginPage.cmbbxLanguage, "Y");
		WebElement LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
		DoThis.click(LanguageElement, "Y");
		
		//Stay Logged In
		if(stayLoggedIn == true) {
			DoThis.click(LoginPage.chkbxStayLoggedIn, "Y");
		}else {
			Reporter.ReportEventNoImage("Stay Logged In is not checked");
		}
				
		
		DoThis.click(LoginPage.btnLogin,"Y");
		
		//Wait for Vehicle List to displayed
		if(!DoThis.isObjectAvailable(MapPage.Fleettab.objVehicleListNoResult, "No Vehicle List", "NA")) {
			DoThis.WaitForElementToLoad(MapPage.Fleettab.lstVehicleList);
		}
		
		//This will handle if there System Notice displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlSystemNotice, "System Notice Modal", "NA")) {
			Reporter.ReportEventNoImage("System Notice Modal is displayed");
			DoThis.click(LoginPage.icnCloseSystemNotice, "Y");
		}else {
			Reporter.ReportEventNoImage("System Notice Modal is NOT displayed");  		
		}
		
		//This will handle if change password popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlForceChangePassword, "Change Password popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Force Change Password popup is displayed");
			DoThis.click(LoginPage.btnCancel, "Y");
		}else {
			Reporter.ReportEventNoImage("Force Change Password popup is NOT displayed");  		
		}	
		
		//This will handle if Important message popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlImportantMessage, "Important Message popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Important Message popup is displayed");
			DoThis.click(LoginPage.icnCloseImportantMessage, "Y");
		}else {
			Reporter.ReportEventNoImage("Important Message popup is NOT displayed");  		
		}
		
	}	
	public static void POIUserViewOnly(String browser, String language, boolean stayLoggedIn, String activesite) throws IOException, Exception{
		

		String Username = null;
		String SubUsername = null;
		String SubPassword = null;
		
		activesite = activesite.toString();
		ConfigReader config = new ConfigReader();
		switch(activesite) {
			case "SG":
			{
				Username = config.getSGUserName();
				SubUsername = config.getSGPOIUserViewOnlySubUserName();
				SubPassword = config.getSGPOIUserViewOnlySubPassword(); break;
			}
			case "TH":
			{
				Username = config.getTHUserName();
				SubUsername = config.getTHPOIUserViewOnlySubUserName();
				SubPassword = config.getTHPOIUserViewOnlySubPassword(); break;
			}
			case "ZA":
			{
				Username = config.getZAUserName();
				SubUsername = config.getZAPOIUserViewOnlySubUserName();
				SubPassword = config.getZAPOIUserViewOnlySubPassword(); break;
			}
			
			case "PT":
			
			{
				Username = config.getPTUserName();
				SubUsername = config.getPTPOIUserViewOnlySubUserName();
				SubPassword = config.getPTPOIUserViewOnlySubPassword(); break;
			}
			
			case "ID":
			
			{
				Username = config.getIDUserName();
				SubUsername = config.getIDPOIUserViewOnlySubUserName();
				SubPassword = config.getIDPOIUserViewOnlySubPassword(); break;
			}
			
			case "PL":
			
			{
				Username = config.getPLUserName();
				SubUsername = config.getPLPOIUserViewOnlySubUserName();
				SubPassword = config.getPLPOIUserViewOnlySubPassword(); break;
			}
			
			case "HK":
			
			{
				Username = config.getHKUserName();
				SubUsername = config.getHKPOIUserViewOnlySubUserName();
				SubPassword = config.getHKPOIUserViewOnlySubPassword(); break;
			}
			
			case "US":
			
			{
				Username = config.getUSUserName();
				SubUsername = config.getUSPOIUserViewOnlySubUserName();
				SubPassword = config.getUSPOIUserViewOnlySubPassword(); break;
			}
			
			case "ME":
			
			{
				Username = config.getMEUserName();
				SubUsername = config.getMEPOIUserViewOnlySubUserName();
				SubPassword = config.getMEPOIUserViewOnlySubPassword(); break;
			}
			
			case "NZ":
			
			{
				Username = config.getNZUserName();
				SubUsername = config.getNZPOIUserViewOnlySubUserName();
				SubPassword = config.getNZPOIUserViewOnlySubPassword(); break;
			}
			
			case "AU":
				
			{
				Username = config.getAUUserName();
				SubUsername = config.getAUPOIUserViewOnlySubUserName();
				SubPassword = config.getAUPOIUserViewOnlySubPassword(); break;
			}
			
			case "SZ":
			
			{
				Username = config.getSZUserName();
				SubUsername = config.getSZPOIUserViewOnlySubUserName();
				SubPassword = config.getSZPOIUserViewOnlySubPassword(); break;
			}
			
			case "MY":
			
			{
				Username = config.getMYUserName();
				SubUsername = config.getMYPOIUserViewOnlySubUserName();
				SubPassword = config.getMYPOIUserViewOnlySubPassword(); break;

			}
			
			case "MZ":
			
			{
				Username = config.getMZUserName();
				SubUsername = config.getMZPOIUserViewOnlySubUserName();
				SubPassword = config.getMZPOIUserViewOnlySubPassword(); break;

			}
			
			case "ZW":
			
			{
				Username = config.getZWUserName();
				SubUsername = config.getZWPOIUserViewOnlySubUserName();
				SubPassword = config.getZWPOIUserViewOnlySubPassword(); break;

			}
			
			case "ES":
			
			{
				Username = config.getESUserName();
				SubUsername = config.getESPOIUserViewOnlySubUserName();
				SubPassword = config.getESPOIUserViewOnlySubPassword(); break;

			}
			
			case "RW":
			
			{
				Username = config.getRWUserName();
				SubUsername = config.getRWPOIUserViewOnlySubUserName();
				SubPassword = config.getRWPOIUserViewOnlySubPassword(); break;

			}
			
			case "TZ":
			
			{
				Username = config.getTZUserName();
				SubUsername = config.getTZPOIUserViewOnlySubUserName();
				SubPassword = config.getTZPOIUserViewOnlySubPassword(); break;

			}
			
			case "NA":
			
			{
				Username = config.getNAUserName();
				SubUsername = config.getNAPOIUserViewOnlySubUserName();
				SubPassword = config.getNAPOIUserViewOnlySubPassword(); break;

			}
			
			case "KE":
			
			{
				Username = config.getKEUserName();
				SubUsername = config.getKEPOIUserViewOnlySubUserName();
				SubPassword = config.getKEPOIUserViewOnlySubPassword(); break;

			}
			
			case "PH":
			
			{
				Username = config.getPHUserName();
				SubUsername = config.getPHPOIUserViewOnlySubUserName();
				SubPassword = config.getPHPOIUserViewOnlySubPassword(); break;

			}
			
			case "BW":
			
			{
				Username = config.getBWUserName();
				SubUsername = config.getBWPOIUserViewOnlySubUserName();
				SubPassword = config.getBWPOIUserViewOnlySubPassword(); break;

			}
			
			case "FR":
			
			{
				Username = config.getFRUserName();
				SubUsername = config.getFRPOIUserViewOnlySubUserName();
				SubPassword = config.getFRPOIUserViewOnlySubPassword(); break;

			}
			
			case "MW":
			
			{
				Username = config.getMWUserName();
				SubUsername = config.getMWPOIUserViewOnlySubUserName();
				SubPassword = config.getMWPOIUserViewOnlySubPassword(); break;

			}
			
			//Add switch case options for other countries
			
		}
		DoThis.click(WelcomePage.btnLogIn, "Y");
	
		//Wait for element to load
		DoThis.WaitForElementToLoad(LoginPage.rdbtnSubUser);
		
		DoThis.click(LoginPage.rdbtnSubUser, "Y");
		
		DoThis.clear(browser, LoginPage.txtbxUsername, "NA");
		DoThis.sendkeys(LoginPage.txtbxUsername, Username,"Y");
		DoThis.clear(browser, LoginPage.txtbxSubUsername, "NA");
		DoThis.sendkeys(LoginPage.txtbxSubUsername, SubUsername,"Y");
		DoThis.clear(browser, LoginPage.txtbxSubPassword, "NA");
		DoThis.sendkeys(LoginPage.txtbxSubPassword, SubPassword,"Y");
		
		//Select Language
		DoThis.click(LoginPage.cmbbxLanguage, "Y");
		WebElement LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
		DoThis.click(LanguageElement, "Y");
		
		//Stay Logged In
		if(stayLoggedIn == true) {
			DoThis.click(LoginPage.chkbxStayLoggedIn, "Y");
		}else {
			Reporter.ReportEventNoImage("Stay Logged In is not checked");
		}
				
		
		DoThis.click(LoginPage.btnLogin,"Y");
		
		//Wait for Vehicle List to displayed
		if(!DoThis.isObjectAvailable(MapPage.Fleettab.objVehicleListNoResult, "No Vehicle List", "NA")) {
			DoThis.WaitForElementToLoad(MapPage.Fleettab.lstVehicleList);
		}
		
		//This will handle if there System Notice displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlSystemNotice, "System Notice Modal", "NA")) {
			Reporter.ReportEventNoImage("System Notice Modal is displayed");
			DoThis.click(LoginPage.icnCloseSystemNotice, "Y");
		}else {
			Reporter.ReportEventNoImage("System Notice Modal is NOT displayed");  		
		}
		
		//This will handle if change password popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlForceChangePassword, "Change Password popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Force Change Password popup is displayed");
			DoThis.click(LoginPage.btnCancel, "Y");
		}else {
			Reporter.ReportEventNoImage("Force Change Password popup is NOT displayed");  		
		}	
		
		//This will handle if Important message popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlImportantMessage, "Important Message popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Important Message popup is displayed");
			DoThis.click(LoginPage.icnCloseImportantMessage, "Y");
		}else {
			Reporter.ReportEventNoImage("Important Message popup is NOT displayed");  		
		}
		
	}	
	public static void POIUserCantView(String browser, String language, boolean stayLoggedIn, String activesite) throws IOException, Exception{

		String Username = null;
		String SubUsername = null;
		String SubPassword = null;
		
		activesite = activesite.toString();
		ConfigReader config = new ConfigReader();
		switch(activesite) {
			case "SG":
			{
				Username = config.getSGUserName();
				SubUsername = config.getSGPOIUserCantViewSubUserName();
				SubPassword = config.getSGPOIUserCantViewSubPassword(); break;
			}
			case "TH":
			{
				Username = config.getTHUserName();
				SubUsername = config.getTHPOIUserCantViewSubUserName();
				SubPassword = config.getTHPOIUserCantViewSubPassword(); break;
			}
			
			case "ZA":
			{
				Username = config.getZAUserName();
				SubUsername = config.getZAPOIUserCantViewSubUserName();
				SubPassword = config.getZAPOIUserCantViewSubPassword(); break;
			}
			
			case "PT":
			
			{
				Username = config.getPTUserName();
				SubUsername = config.getPTPOIUserCantViewSubUserName();
				SubPassword = config.getPTPOIUserCantViewSubPassword(); break;
			}
			
			case "ID":
			
			{
				Username = config.getIDUserName();
				SubUsername = config.getIDPOIUserCantViewSubUserName();
				SubPassword = config.getIDPOIUserCantViewSubPassword(); break;
			}
			
			case "PL":
			
			{
				Username = config.getPLUserName();
				SubUsername = config.getPLPOIUserCantViewSubUserName();
				SubPassword = config.getPLPOIUserCantViewSubPassword(); break;
			}
			
			case "HK":
			
			{
				Username = config.getHKUserName();
				SubUsername = config.getHKPOIUserCantViewSubUserName();
				SubPassword = config.getHKPOIUserCantViewSubPassword(); break;
			}
			
			case "US":
			
			{
				Username = config.getUSUserName();
				SubUsername = config.getUSPOIUserCantViewSubUserName();
				SubPassword = config.getUSPOIUserCantViewSubPassword(); break;
			}
			
			case "ME":
			
			{
				Username = config.getMEUserName();
				SubUsername = config.getMEPOIUserCantViewSubUserName();
				SubPassword = config.getMEPOIUserCantViewSubPassword(); break;
			}
			

			case "NZ":
			
			{
				Username = config.getNZUserName();
				SubUsername = config.getNZPOIUserCantViewSubUserName();
				SubPassword = config.getNZPOIUserCantViewSubPassword(); break;
			}
			
			case "AU":
				
			{
				Username = config.getAUUserName();
				SubUsername = config.getAUPOIUserCantViewSubUserName();
				SubPassword = config.getAUPOIUserCantViewSubPassword(); break;
			}
			
			case "SZ":
			
			{
				Username = config.getSZUserName();
				SubUsername = config.getSZPOIUserCantViewSubUserName();
				SubPassword = config.getSZPOIUserCantViewSubPassword(); break;
			}
			
			case "MY":
			
			{
				Username = config.getMYUserName();
				SubUsername = config.getMYPOIUserCantViewSubUserName();
				SubPassword = config.getMYPOIUserCantViewSubPassword(); break;

			}
			
			case "MZ":
			
			{
				Username = config.getMZUserName();
				SubUsername = config.getMZPOIUserCantViewSubUserName();
				SubPassword = config.getMZPOIUserCantViewSubPassword(); break;

			}
			
			case "ZW":
			
			{
				Username = config.getZWUserName();
				SubUsername = config.getZWPOIUserCantViewSubUserName();
				SubPassword = config.getZWPOIUserCantViewSubPassword(); break;

			}
			
			case "ES":
			
			{
				Username = config.getESUserName();
				SubUsername = config.getESPOIUserCantViewSubUserName();
				SubPassword = config.getESPOIUserCantViewSubPassword(); break;

			}
			
			case "RW":
			
			{
				Username = config.getRWUserName();
				SubUsername = config.getRWPOIUserCantViewSubUserName();
				SubPassword = config.getRWPOIUserCantViewSubPassword(); break;

			}
			
			case "TZ":
			
			{
				Username = config.getTZUserName();
				SubUsername = config.getTZPOIUserCantViewSubUserName();
				SubPassword = config.getTZPOIUserCantViewSubPassword(); break;

			}
			
			case "NA":
			
			{
				Username = config.getNAUserName();
				SubUsername = config.getNAPOIUserCantViewSubUserName();
				SubPassword = config.getNAPOIUserCantViewSubPassword(); break;

			}
			
			case "KE":
			
			{
				Username = config.getKEUserName();
				SubUsername = config.getKEPOIUserCantViewSubUserName();
				SubPassword = config.getKEPOIUserCantViewSubPassword(); break;

			}
			
			case "PH":
			
			{
				Username = config.getPHUserName();
				SubUsername = config.getPHPOIUserCantViewSubUserName();
				SubPassword = config.getPHPOIUserCantViewSubPassword(); break;

			}
			
			case "BW":
			
			{
				Username = config.getBWUserName();
				SubUsername = config.getBWPOIUserCantViewSubUserName();
				SubPassword = config.getBWPOIUserCantViewSubPassword(); break;

			}
			
			case "FR":
			
			{
				Username = config.getFRUserName();
				SubUsername = config.getFRPOIUserCantViewSubUserName();
				SubPassword = config.getFRPOIUserCantViewSubPassword(); break;

			}
			
			case "MW":
			
			{
				Username = config.getMWUserName();
				SubUsername = config.getMWPOIUserCantViewSubUserName();
				SubPassword = config.getMWPOIUserCantViewSubPassword(); break;

			}
			
			//Add switch code options for other countries
			
		}
		DoThis.click(WelcomePage.btnLogIn, "Y");
	
		//Wait for element to load
		DoThis.WaitForElementToLoad(LoginPage.rdbtnSubUser);
		
		DoThis.click(LoginPage.rdbtnSubUser, "Y");
		
		DoThis.clear(browser, LoginPage.txtbxUsername, "NA");
		DoThis.sendkeys(LoginPage.txtbxUsername, Username,"Y");
		DoThis.clear(browser, LoginPage.txtbxSubUsername, "NA");
		DoThis.sendkeys(LoginPage.txtbxSubUsername, SubUsername,"Y");
		DoThis.clear(browser, LoginPage.txtbxSubPassword, "NA");
		DoThis.sendkeys(LoginPage.txtbxSubPassword, SubPassword,"Y");
		
		//Select Language
		DoThis.click(LoginPage.cmbbxLanguage, "Y");
		WebElement LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
		DoThis.click(LanguageElement, "Y");
		
		//Stay Logged In
		if(stayLoggedIn == true) {
			DoThis.click(LoginPage.chkbxStayLoggedIn, "Y");
		}else {
			Reporter.ReportEventNoImage("Stay Logged In is not checked");
		}
				
		
		DoThis.click(LoginPage.btnLogin,"Y");
		
		//Wait for Vehicle List to displayed
		DoThis.WaitForElementToLoad(MapPage.Fleettab.btnSettings);
		if(!DoThis.isObjectAvailable(MapPage.Fleettab.objVehicleListNoResult, "No Vehicle List", "NA")) {
			DoThis.WaitForElementToLoad(MapPage.Fleettab.lstVehicleList);
		}
		
		//This will handle if there System Notice displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlSystemNotice, "System Notice Modal", "NA")) {
			Reporter.ReportEventNoImage("System Notice Modal is displayed");
			DoThis.click(LoginPage.icnCloseSystemNotice, "Y");
		}else {
			Reporter.ReportEventNoImage("System Notice Modal is NOT displayed");  		
		}
		
		//This will handle if change password popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlForceChangePassword, "Change Password popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Force Change Password popup is displayed");
			DoThis.click(LoginPage.btnCancel, "Y");
		}else {
			Reporter.ReportEventNoImage("Force Change Password popup is NOT displayed");  		
		}	
		
		//This will handle if Important message popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlImportantMessage, "Important Message popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Important Message popup is displayed");
			DoThis.click(LoginPage.icnCloseImportantMessage, "Y");
		}else {
			Reporter.ReportEventNoImage("Important Message popup is NOT displayed");  		
		}
		
	}		
	
	public static void SmokeTesting(String browser, String language, boolean stayLoggedIn, String activesite) throws IOException, Exception{
		
		switch(activesite) {
		//Only Add Countries that accessible via SSO Token link
			case "NA":
			case "KE":
			case "PH":
			case "NG":
			case "BW":
			case "FR":
			case "ID":
			case "MY":
			case "NZ":
			case "AU":
			case "ES":
			case "MW":
			case "HINOID":
			case "MANKE":
			case "OWSAUTOME":
			case "NORWOODNZ":
			case "ARVALPL":
			case "PANUSTH":
			case "HINOZA":
			case "MANZA":
			case "TELTRACKZW":
			case "TOYOTAKE":
			case "TOYOTATZ":
			case "TOYOTAMW":
			Reporter.ReportEventNoImage("SSO Token is used to login for "+activesite);
			break;
			default:
			String Username = null;
			String Password = null;
			activesite = activesite.toString();
			ConfigReader config = new ConfigReader();
			switch(activesite) {
				case "SG":
				{
					Username = config.getSGUserName();
					Password = config.getSGPassword(); break;
				}
				case "TH":
				{
					Username = config.getTHUserName();
					Password = config.getTHPassword(); break;
				}
				
				case "ZA":
				{
					Username = config.getZAUserName();
					Password = config.getZAPassword(); break;
				}
				
				case "PT":
				{
					Username = config.getPTUserName();
					Password = config.getPTPassword(); break;
				}
				
				case "ID":
				{
					Username = config.getIDUserName();
					Password = config.getIDPassword(); break;
				}
				
				case "PL":
				{
					Username = config.getPLUserName();
					Password = config.getPLPassword(); break;
				}
				
				case "HK":
				{
					Username = config.getHKUserName();
					Password = config.getHKPassword(); break;
				}
				
				case "US":
				{
					Username = config.getUSUserName();
					Password = config.getUSPassword(); break;
				}
				
				case "ME":
				{
					Username = config.getMEUserName();
					Password = config.getMEPassword(); break;
				}
				
				
				case "NZ":
				{
					Username = config.getNZUserName();
					Password = config.getNZPassword(); break;
				}
				
				case "AU":
				{
					Username = config.getAUUserName();
					Password = config.getAUPassword(); break;
				}
				
				case "SZ":
				{
					Username = config.getSZUserName();
					Password = config.getSZPassword(); break;
				}
				
				case "MY":
				{
					Username = config.getMYUserName();
					Password = config.getMYPassword(); break;

				}
				
				case "MZ":
				{
					Username = config.getMZUserName();
					Password = config.getMZPassword(); break;
				}
				
				case "ZW":
				{
					Username = config.getZWUserName();
					Password = config.getZWPassword(); break;

				}
				
				case "ES":
				{
					Username = config.getESUserName();
					Password = config.getESPassword(); break;

				}
				
				case "RW":
				{
					Username = config.getRWUserName();
					Password = config.getRWPassword(); break;

				}
				
				case "TZ":
				{
					Username = config.getTZUserName();
					Password = config.getTZPassword(); break;

				}
				
				case "MW":
				{
					Username = config.getMWUserName();
					Password = config.getMWPassword(); break;

				}
				//Add switch case options for other countries
				
			}
			DoThis.click(WelcomePage.btnLogIn, "Y");
		
			//Wait for element to load
			DoThis.WaitForElementToLoad(LoginPage.rdbtnAdmin);
			
			DoThis.click(LoginPage.rdbtnAdmin, "Y");
			
			DoThis.clear(browser, LoginPage.txtbxUsername, "NA");
			DoThis.sendkeys(LoginPage.txtbxUsername, Username,"Y");
			
			DoThis.clear(browser, LoginPage.txtbxPassword, "NA");
			DoThis.sendkeys(LoginPage.txtbxPassword, Password,"Y");
			
			//Select Language
			DoThis.click(LoginPage.cmbbxLanguage, "Y");
			WebElement LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
			DoThis.click(LanguageElement, "Y");
			
			//Stay Logged In
			if(stayLoggedIn == true) {
				DoThis.click(LoginPage.chkbxStayLoggedIn, "Y");
			}else {
				Reporter.ReportEventNoImage("Stay Logged In is not checked");
			}
			
			DoThis.click(LoginPage.btnLogin,"Y");
			break;
			
		}
		//Wait for Vehicle List to displayed
		DoThis.WaitForElementToLoad(MapPage.Fleettab.lstVehicleList);
		
		//This will handle if there System Notice displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlSystemNotice, "System Notice Modal", "NA")) {
			Reporter.ReportEventNoImage("System Notice Modal is displayed");
			DoThis.click(LoginPage.icnCloseSystemNotice, "Y");
		}else {
			Reporter.ReportEventNoImage("System Notice Modal is NOT displayed");  		
		}
		
		//This will handle if change password popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlForceChangePassword, "Change Password popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Force Change Password popup is displayed");
			DoThis.click(LoginPage.btnCancel, "Y");
		}else {
			Reporter.ReportEventNoImage("Force Change Password popup is NOT displayed");  		
		}
		
		//This will handle if Important message popup displayed during login
		if(DoThis.isObjectAvailable(LoginPage.mdlImportantMessage, "Important Message popup Modal", "NA")) {
			Reporter.ReportEventNoImage("Important Message popup is displayed");
			DoThis.click(LoginPage.icnCloseImportantMessage, "Y");
		}else {
			Reporter.ReportEventNoImage("Important Message popup is NOT displayed");  		
		}
		
				
	}	

	public static void GetAppVersion(String activesite) throws IOException, Exception{
		
		//Click Help Button
		DoThis.click(LoginPage.btnHelp, "Y");
		
		//Get Current Application version
		String AppVersion = DoThis.getHiddenText(MapPage.objAppVersion);
		Reporter.ReportEventNoImage(activesite+" Application version is "+AppVersion);
		
	}
}
