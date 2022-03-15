package actionModule;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.MapPage;
import pageObject.SettingsPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

public class ManageUsers{	
	
	public static void SearchUser(String browser, String subuser) throws IOException, Exception{
		
		//Navigate to Settings - Manage Users Page
		DoThis.WaitForElementToLoad(SettingsPage.drpdwnbtnProfile);
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.nvBarManageUsers, "Y");
				
		//Enter Subuser in Search field
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxSearch, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxSearch, subuser.toString(), "Y");
		
		//Wait for Subuser data to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.btnCogWheels);
		
		WebElement SearchResultEditButton = Constant.driver.findElement(By.xpath("//*[text()='"+subuser.toString()+"']/ancestor::div[contains(@class,'rt-tr -odd')]/descendant::button[@type='button']"));
		Reporter.ReportEventNoImage("Subuser "+subuser+" is found");
		
		//Edit Subuser
		DoThis.click(SearchResultEditButton, "Y");
		
	}
	public static void RemoveAllVehicles() throws IOException, Exception{
		
		//Wait for Data Access to displayed
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelDataAccess);
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelDataAccess, "Collapsed Panel Data Access", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelDataAccess, "Y");
		}
		
		//Click Name header once then check sorted order 
		DoThis.click(SettingsPage.ManageUsersTab.objNamecolumnheader, "N");
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objNamecolumnheadersorteddesc, "Name column header currently in descending order", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.objNamecolumnheadersorteddesc, "Y");
			Reporter.ReportEventNoImage("Name column header is now sorted to ascending order");
		}else {
			Reporter.ReportEventNoImage("Name column header is now sorted to ascending order");
		}
	
		DoThis.selectByValue(SettingsPage.ManageUsersTab.objPageSize, "100", "Y");
		
		//Wait for Vehicles to displayed
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.chckbxEachVehicles.get(0));
		
		DoThis.click(SettingsPage.ManageUsersTab.chckbxAllVehicles, "Y");
		
		DoThis.WaitForToasterMessageToLoad(SettingsPage.ManageUsersTab.objToaster);
		Reporter.ReportEventNoImage("Update Vehicle Assignment Status succeeded toaster message is displayed");
		
		if(SettingsPage.ManageUsersTab.chckbxEachVehicles.size() == SettingsPage.ManageUsersTab.chckbxSelectVehicles.size()) {
			DoThis.click(SettingsPage.ManageUsersTab.chckbxAllVehicles, "Y");
		}else {
			Reporter.ReportEventNoImage("No Vehicles is currently selected");
		}
	
		//Click Groups Tab
		DoThis.click(SettingsPage.ManageUsersTab.objTabGroups, "Y");
		
		//Wait for Groups to displayed
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.chckbxEachGroups.get(0));
		
		DoThis.click(SettingsPage.ManageUsersTab.chckbxAllVehicles, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Update Vehicle Assignment Status succeeded toaster message is displayed");
		}
		
		if(SettingsPage.ManageUsersTab.chckbxEachGroups.size() == SettingsPage.ManageUsersTab.chckbxSelectGroups.size()) {
			DoThis.click(SettingsPage.ManageUsersTab.chckbxAllVehicles, "Y");
		}else {
			Reporter.ReportEventNoImage("No Group Vehicles is currently selected");
		}
		
		//Click Vehicle Tab
		DoThis.click(SettingsPage.ManageUsersTab.objTabVehicles, "Y");
		
	}
	public static void AssignedVehicles(int vehiclesassignedcount, String activesite) throws IOException, Exception{
				
		//Click Name header once then check sorted order 
		DoThis.click(SettingsPage.ManageUsersTab.objNamecolumnheader, "N");
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objNamecolumnheadersorteddesc, "Name column header currently in descending order", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.objNamecolumnheadersorteddesc, "Y");
			Reporter.ReportEventNoImage("Name column header is now sorted to ascending order");
		}else {
			Reporter.ReportEventNoImage("Name column header is now sorted to ascending order");
		}
	
		//Select page size 100 if vehicles to assigned is more than 25
		if(vehiclesassignedcount > 25) {
			DoThis.selectByValue(SettingsPage.ManageUsersTab.objPageSize, "100", "Y");
			
		}
	
		switch (activesite) {
		
		case "US":
			vehiclesassignedcount = vehiclesassignedcount+1;
			for(int i = 1; i < vehiclesassignedcount; i++) {
				Thread.sleep(1000);
				DoThis.click(SettingsPage.ManageUsersTab.chckbxEachVehicles.get(i), "Y");
				int vehiclecount = i+1;
				if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster Message", "NA")) {
					Reporter.ReportEventNoImage("Vehicle "+vehiclecount+" is assigned");
				}
				
			}
			
		break;
		
		case "ME":
		case "HK":
			vehiclesassignedcount = vehiclesassignedcount+2;
			for(int i = 2; i < vehiclesassignedcount; i++) {
				Thread.sleep(1000);
				DoThis.click(SettingsPage.ManageUsersTab.chckbxEachVehicles.get(i), "Y");
				int vehiclecount = i+1;
				if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster Message", "NA")) {
					Reporter.ReportEventNoImage("Vehicle "+vehiclecount+" is assigned");
				}
				
			}
			
		break;

		default:
			for(int i = 0; i < vehiclesassignedcount; i++) {
				Thread.sleep(1000);
				DoThis.click(SettingsPage.ManageUsersTab.chckbxEachVehicles.get(i), "Y");
				int vehiclecount = i+1;
				if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster Message", "NA")) {
					Reporter.ReportEventNoImage("Vehicle "+vehiclecount+" is assigned");
				}
				
			}
		break;
		}

		
		
	}
	
	public static ArrayList<String> GetAssignedVehiclesNames(List<WebElement> webElements) throws InterruptedException {
		
		//Click Name header once then check sorted order 
		DoThis.click(SettingsPage.ManageUsersTab.objNamecolumnheader, "N");
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objNamecolumnheadersorteddesc, "Name column header currently in descending order", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.objNamecolumnheadersorteddesc, "Y");
			Reporter.ReportEventNoImage("Name column header is now sorted to ascending order");
		}else {
			Reporter.ReportEventNoImage("Name column header is now sorted to ascending order");
		}
		
		ArrayList<String> obtainedList = new ArrayList<>(); 
		for(WebElement we:webElements){
		   obtainedList.add(we.getText());
		}
		return obtainedList;
	}
	
	public static void SetPermissionDriverAddDriver(String browser, String subuser) throws IOException, Exception {
		ManageUsers.SearchUser(browser, subuser);
		
		//Check Drivers - Add Driver Permission
		//Add Poll wait for Permission to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelPermission);
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelPermission, "Collapsed Panel Permission", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelPermission, "Y");
		}
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelList, "Y");
		
	
		//Check List Toggle button status if OFF, if not turn ON
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.tglbtnList);
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnList).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnList, "Y");
		}else {
			Reporter.ReportEventNoImage("List Toggle button is already ON");
		}
		
		//Check Drivers toggle button status if OFF turn ON
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnDrivers).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnDrivers, "Y");
		}else {
			Reporter.ReportEventNoImage("Drivers Toggle button is already ON");
		}
		
		//Check Drivers section if expand, if not expand
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objchevrondownDrivers, "Drivers chevron down is visible", "NA")) {
			DoThis.click(SettingsPage.ManageUsersTab.objchevronDrivers, "Y");
		}else {
			Reporter.ReportEventNoImage("Drivers section is already expanded");
		}
		
		//Check Add driver toggle button status if OFF turn ON
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnDriversAdddriver).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnDriversAdddriver, "Y");
		}else {
			Reporter.ReportEventNoImage("Add driver Toggle button is already ON");
		}
		
		//Bug FABF-4439 is open that causing Save button not to enable despite permission is already turn ON
		//As temporary fix adding Edit Vehicle toggle button to turn ON for the save button to enabled
		//Will remove below line of codes once FABF-4439 is fixed
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnDriversEditdriver).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnDriversEditdriver, "Y");
		}else {
			Reporter.ReportEventNoImage("Edit driver Toggle button is already ON");
		}
		
		
	}
	
	public static void SetPermissionVehiclesAddGroup(String browser, String subuser) throws IOException, Exception {
		ManageUsers.SearchUser(browser, subuser);
		
		//Check Vehicles - Add Group Permission
		//Add Poll wait
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelPermission);
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelPermission, "Collapsed Panel Permission", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelPermission, "Y");
		}
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelList, "Y");
		
		//Check List Toggle button status if OFF, if not turn ON
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.tglbtnList);
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnList).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnList, "Y");
		}else {
			Reporter.ReportEventNoImage("List Toggle button is already ON");
		}
		
		//Check Vehicles - Add Group toggle button status if OFF turn ON
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnVehicles).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnVehicles, "Y");
		}else {
			Reporter.ReportEventNoImage("Vehicles Toggle button is already ON");
		}
		
		//Check Vehicles section if expand, if not expand
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objchevrondownVehicles, "Vehicles chevron down is visible", "NA")) {
			DoThis.click(SettingsPage.ManageUsersTab.objchevronVehicles, "Y");
		}else {
			Reporter.ReportEventNoImage("Vehicles section is already expanded");
		}
		
		//Check Add group toggle button status if OFF turn ON
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnVehiclesAddgroup).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnVehiclesAddgroup, "Y");
		}else {
			Reporter.ReportEventNoImage("Add group Toggle button is already ON");
		}
		
	}
	public static void SetPermissionDriverAddGroup(String browser, String subuser) throws IOException, Exception {
		ManageUsers.SearchUser(browser, subuser);
		
		//Check Drivers - Add Driver Permission
		//Add Poll wait for Permission to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelPermission);
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelPermission, "Collapsed Panel Permission", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelPermission, "Y");
		}
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelList, "Y");
		
		//Check List Toggle button status if OFF, if not turn ON
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.tglbtnList);
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnList).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnList, "Y");
		}else {
			Reporter.ReportEventNoImage("List Toggle button is already ON");
		}
		
		//Check Drivers toggle button status if OFF turn ON
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnDrivers).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnDrivers, "Y");
		}else {
			Reporter.ReportEventNoImage("Drivers Toggle button is already ON");
		}
		
		//Check Drivers section if expand, if not expand
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objchevrondownDrivers, "Drivers chevron down is visible", "NA")) {
			DoThis.click(SettingsPage.ManageUsersTab.objchevronDrivers, "Y");
		}else {
			Reporter.ReportEventNoImage("Drivers section is already expanded");
		}
		
		//Check Add group toggle button status if OFF turn ON
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnDriversAddgroup).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnDriversAddgroup, "Y");
		}else {
			Reporter.ReportEventNoImage("Add group Toggle button is already ON");
		}
		
	}
	public static void EditUser(String browser, String subuser, @SuppressWarnings("rawtypes") Dictionary UserDetails, String activesite) throws IOException, Exception{
		
		ManageUsers.SearchUser(browser, subuser);
		
		//Click Edit button
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.btnEdit);
		DoThis.click(SettingsPage.ManageUsersTab.btnEdit, "Y");
		
		//Get Current values of Profile fields
		String currentName = null;
		String currentLanguage = null;
		//Add Countries that does not have Name and Language field
		switch(activesite) {
		case("ZA"): 
		case("US"): 
		case("NZ"):
		case("AU"):
		case("ES"): 
		case("RW"):  
		case("FR"): 
		case("SZ"): 
		case("NG"):
		break;
		default:
			currentName = DoThis.getAttribute(SettingsPage.ManageUsersTab.txtbxName, "value");
			currentLanguage = DoThis.getAttribute(SettingsPage.ManageUsersTab.drpdwnLanguage, "value");
		break;
		}
		String currentEmail = DoThis.getAttribute(SettingsPage.ManageUsersTab.txtbxEmail, "value");

		//Update Profile fields to new values
		switch(activesite) {
		case("ZA"):
		case("US"): 
		case("NZ"):
		case("AU"):
		case("ES"): 
		case("RW"): 
		case("FR"): 
		case("SZ"): 
		case("NG"):  
		break;
		default:
			//Name
			DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxName, "N");
			DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxName, UserDetails.get("name").toString(), "Y");
			
			//Select the first option except for the None value for Hierarchy User
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnHierarchyUser, "Y");
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnHierarchyUserFirstOption, "Y");
			
			//Language
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnLanguage, "Y");
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnLanguageFirstOption, "Y");
		break;
		}
		
		//Email
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxEmail, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxEmail, UserDetails.get("email").toString(), "Y");
		
		//Get Current Edited values of Profile fields
		String newName = null;
		String newHierarchyUser = null;
		String newLanguage = null;
		switch(activesite) {
		case("ZA"):
		case("US"): 
		case("NZ"): 
		case("AU"):
		case("ES"): 
		case("RW"):
		case("FR"): 
		case("SZ"): 
		case("NG"): 
		break;
		default:
			newName = DoThis.getAttribute(SettingsPage.ManageUsersTab.txtbxName, "value");
			newHierarchyUser = DoThis.getAttribute(SettingsPage.ManageUsersTab.drpdwnHierarchyUser, "value");
			newLanguage = DoThis.getAttribute(SettingsPage.ManageUsersTab.drpdwnLanguage, "value");
		break;
		}
		String newEmail = DoThis.getAttribute(SettingsPage.ManageUsersTab.txtbxEmail, "value");
		
		//Adding this line of code to handle the new field named "MiFleet User Role"
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRole, "Not Populated MiFleet User Role field", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRole, "Y");
			
			switch (activesite) {
			case "ME":
				DoThis.click(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRoleFirstOption, "Y");
			break;
			
			default:
				if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRoleOptionAdministrators, "MiFleet Administrator User Role", "N")) {
					DoThis.click(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRoleOptionAdministrators, "Y");
				}else {
					DoThis.click(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRoleOptionAdministradores, "Y");
				}
			break;
			}
					
		}
	
		//Click Save button
		DoThis.click(SettingsPage.ManageUsersTab.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("User updated! toaster message is displayed");
		}
		
		//Validate following reflected the same as per created
		//Click Edit button
		DoThis.click(SettingsPage.ManageUsersTab.btnEdit, "Y");
		switch(activesite) {
		case("ZA"):
		case("US"): 
		case("NZ"): 
		case("AU"):
		case("ES"): 
		case("RW"):
		case("FR"): 
		case("SZ"): 
		case("NG"): 
		break;
		default:
			if(!DoThis.isContainingValue(SettingsPage.ManageUsersTab.txtbxName, newName, "Name validation", "Y")) {assertTrue(false);}
			if(!DoThis.isContainingValue(SettingsPage.ManageUsersTab.drpdwnHierarchyUser, newHierarchyUser, "Hierarchy User validation", "Y")) {assertTrue(false);}
			if(!DoThis.isContainingValue(SettingsPage.ManageUsersTab.drpdwnLanguage, newLanguage.toString(), "Language validation", "Y")) {assertTrue(false);}
		break;
		}
		
		if(!DoThis.isContainingValue(SettingsPage.ManageUsersTab.txtbxEmail, newEmail, "Email validation", "Y")) {assertTrue(false);}
	
		switch(activesite) {
		case("ZA"): 
		case("US"): 	
		case("NZ"): 
		case("AU"):
		case("ES"): 
		case("RW"): 
		case("FR"): 
		case("SZ"): 
		case("NG"): 
			Reporter.ReportEventNoImage("No Name field available in "+activesite);
		break;
		default:
		//Name
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxName, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxName, currentName.toString(), "Y");
		
		//Language
		DoThis.click(SettingsPage.ManageUsersTab.drpdwnLanguage, "Y");
		WebElement currentlanguage = Constant.driver.findElement(By.xpath("//div[contains(@id,'item')][text()='"+currentLanguage.toString()+"']"));
		DoThis.click(currentlanguage, "Y");
		
		//Select the first option except for the None value for Hierarchy User
		DoThis.click(SettingsPage.ManageUsersTab.drpdwnHierarchyUser, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.drpdwnHierarchyUserFirstOption, "Y");
		break;
		}
	
		//Email
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxEmail, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxEmail, currentEmail.toString(), "Y");
		
		//Click Save button
		DoThis.click(SettingsPage.ManageUsersTab.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("User updated! toaster message is displayed");
		}
		
	}
	public static void SetPermissionPOISharing(String browser, String subuser, @SuppressWarnings("rawtypes") Dictionary UserDetails) throws IOException, Exception {
		ManageUsers.SearchUser(browser, subuser);

		//Add Poll wait for Permission to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelPermission);
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelPermission, "Collapsed Panel Permission", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelPermission, "Y");
		}
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelList, "Y");
		
		//Check List Toggle button status if OFF, if not turn ON
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.tglbtnList);
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnList).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnList, "Y");
		}else {
			Reporter.ReportEventNoImage("List Toggle button is already ON");
		}
		
		//Check POI toggle button status if OFF, if not turn ON
		if(!DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.tglbtnPOI, "POI Toggle button", "NA")) {
			if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnLandmark).contains("true")) {
				DoThis.click(SettingsPage.ManageUsersTab.tglbtnLandmark, "Y");
			}else {
				Reporter.ReportEventNoImage("Landmark Toggle button is already ON");
			}
			
			//Check POI section if expand, if not expand
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objchevrondownPOI, "POI chevron down is visible", "NA")) {
				DoThis.click(SettingsPage.ManageUsersTab.objchevronPOI, "Y");
			}else {
				Reporter.ReportEventNoImage("POI section is already expanded");
			}
			
			if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnLandmark).contains("true")) {
				DoThis.click(SettingsPage.ManageUsersTab.tglbtnLandmark, "Y");
			}else {
				Reporter.ReportEventNoImage("Landmark Toggle button is already ON");
			}
			
			//Check POI section if expand, if not expand
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objchevrondownLandmark, "Landmark chevron down is visible", "NA")) {
				DoThis.click(SettingsPage.ManageUsersTab.objchevronLandmark, "Y");
			}else {
				Reporter.ReportEventNoImage("Landmark section is already expanded");
			}
			
			//Navigate to Data Access >> Landmarks
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelDataAccess, "Collapsed Panel Data Access", "N")) {
				DoThis.click(SettingsPage.ManageUsersTab.sdPanelDataAccess, "Y");
			}

			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdPanelLandmarks, "Panel Landmarks", "N")) {
				DoThis.click(SettingsPage.ManageUsersTab.sdPanelLandmarks, "Y");
			}
			
			//Set user Landmark Sharing Permission
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnLandmarksUserPermission, "Y");
			
		}else {
			if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnPOI).contains("true")) {
				DoThis.click(SettingsPage.ManageUsersTab.tglbtnPOI, "Y");
			}else {
				Reporter.ReportEventNoImage("POI Toggle button is already ON");
			}
			
			//Check POI section if expand, if not expand
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objchevrondownPOI, "POI chevron down is visible", "NA")) {
				DoThis.click(SettingsPage.ManageUsersTab.objchevronPOI, "Y");
			}else {
				Reporter.ReportEventNoImage("POI section is already expanded");
			}
			
			if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnPOI).contains("true")) {
				DoThis.click(SettingsPage.ManageUsersTab.tglbtnPOI, "Y");
			}else {
				Reporter.ReportEventNoImage("POI Toggle button is already ON");
			}
			
			//Check POI section if expand, if not expand
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objchevrondownPOI, "POI chevron down is visible", "NA")) {
				DoThis.click(SettingsPage.ManageUsersTab.objchevronPOI, "Y");
			}else {
				Reporter.ReportEventNoImage("POI section is already expanded");
			}
			
			
			//Navigate to Data Access >> Point of Interest
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelDataAccess, "Collapsed Panel Data Access", "N")) {
				DoThis.click(SettingsPage.ManageUsersTab.sdPanelDataAccess, "Y");
			}
			
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdPanelPointsofInterest, "Panel Points of Interest", "N")) {
				DoThis.click(SettingsPage.ManageUsersTab.sdPanelPointsofInterest, "Y");
			}
	
			//Set user POI Sharing Permission
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnPOIUserPermission, "Y");
				
		}
		
		switch (UserDetails.get("POI_Sharing_Permission").toString()) {
			
		case "Cannot View":
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnPOIUserPermissionCannotView, "Y");
			break;
		
		case "Can View":
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnPOIUserPermissionCanView, "Y");
			break;
		
		case "Can View/Edit":
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnPOIUserPermissionCanViewEdit, "Y");
			break;
		
		}
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Update successful! toaster message is displayed");
		}
	}
	public static void SetPermissionGeofencesSharing(String browser, String subuser, @SuppressWarnings("rawtypes") Dictionary UserDetails) throws IOException, Exception {
		ManageUsers.SearchUser(browser, subuser);
		
		//Add Poll wait for Permission to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelPermission);
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelPermission, "Collapsed Panel Permission", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelPermission, "Y");
		}
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelList, "Y");
		
		//Check List Toggle button status if OFF, if not turn ON
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.tglbtnList);
		if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnList).contains("true")) {
			DoThis.click(SettingsPage.ManageUsersTab.tglbtnList, "Y");
		}else {
			Reporter.ReportEventNoImage("List Toggle button is already ON");
		}
		
		//Check Geofences toggle button status if OFF, if not turn ON
		if(!DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.tglbtnGeofences, "Geofences toggle button", "NA")) {
			if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnGeofence).contains("true")) {
				DoThis.click(SettingsPage.ManageUsersTab.tglbtnGeofence, "Y");
			}else {
				Reporter.ReportEventNoImage("Geofence Toggle button is already ON");
			}
		}else {
			if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnGeofences).contains("true")) {
				DoThis.click(SettingsPage.ManageUsersTab.tglbtnGeofences, "Y");
			}else {
				Reporter.ReportEventNoImage("Geofences Toggle button is already ON");
			}
		}
		
		
		//Check Geofences section if expand, if not expand
		if(!DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objchevrondownGeofences, "Geofences section", "NA")) {
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objchevrondownGeofence, "Geofences chevron down is visible", "NA")) {
				DoThis.click(SettingsPage.ManageUsersTab.objchevronGeofence, "Y");
			}else {
				Reporter.ReportEventNoImage("Geofence section is already expanded");
			}
		}else {
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objchevrondownGeofences, "Geofences chevron down is visible", "NA")) {
				DoThis.click(SettingsPage.ManageUsersTab.objchevronGeofences, "Y");
			}else {
				Reporter.ReportEventNoImage("Geofences section is already expanded");
			}
		}
		
		//Navigate to Data Access >> Geofences
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelDataAccess, "Collapsed Panel Data Access", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelDataAccess, "Y");
		}
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdPanelGeofences, "Panel Geofences", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelGeofences, "Y");
		}
		
		//Set user Geofences Sharing Permission
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.drpdwnGeofencesUserPermission);
		DoThis.click(SettingsPage.ManageUsersTab.drpdwnGeofencesUserPermission, "Y");
		
		switch (UserDetails.get("Geofences_Sharing_Permission").toString()) {
			
		case "Cannot View":
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnGeofencesUserPermissionCannotView, "Y");
			break;
		
		case "Can View":
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnGeofencesUserPermissionCanView, "Y");
			break;
		
		case "Can View/Edit":
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnGeofencesUserPermissionCanViewEdit, "Y");
			break;
		
		}
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Update successful! toaster message is displayed");
		}
	}
	
	public static void ImpersonateSubUser(String browser, String subuser) throws IOException, Exception {
		
		ManageUsers.SearchUser(browser, subuser);
		
		//Navigate to Impersonate Sub User section 
		//Add Poll wait for ImpersonateSubuser to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser);
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser, "Y");
		
		//Click Impersonate Sub User button
		DoThis.click(SettingsPage.ManageUsersTab.btnImpersonateSubUser, "Y");
		
		//Wait for Vehicle List to displayed
		//Wait for Setting button to displayed
		DoThis.WaitForElementToLoad(MapPage.Fleettab.btnSettings);
				
		//Validate Profile contain the Sub User username
		if(!DoThis.isContainingText(SettingsPage.ManageUsersTab.objProfileDropdown, subuser, "Profile Name validation", "Y")) {assertTrue(false);}
		
	}
	
	public static void VerifyAddUserPage() throws IOException, Exception {
		
		//Navigate to Settings - Manage Users Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.nvBarManageUsers, "Y");
		
		//Click Add User button
		DoThis.click(SettingsPage.ManageUsersTab.btnAddUser, "Y");
	
		
	}
	
	public static void AddUser(String browser, @SuppressWarnings("rawtypes") Dictionary UserDetails, String activesite) throws IOException, Exception {
		
		//Navigate to Settings - Manage Users Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.nvBarManageUsers, "Y");
		
		//Click Add User button
		DoThis.click(SettingsPage.ManageUsersTab.btnAddUser, "Y");
		
		//Fill up New User Profile fields
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.txtbxUserName);
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.txtbxName, "Name text box", "N")) {
			//Name
			DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxName, "N");
			DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxName, UserDetails.get("name").toString(), "Y");
		}
		
		//Username
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxUserName, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxUserName, UserDetails.get("username").toString(), "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.drpdwnHierarchyUser, "Hierarchy User dropdown", "N")) {
			//Hierarchy User, select first option always
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnHierarchyUser, "Y");
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnHierarchyUserFirstOption, "Y");
		}

		//Get CellPhone number
		String SMS = DoThis.getSMS(activesite);
		
		//CellPhone
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxCellPhone, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxCellPhone, SMS.toString(), "Y");

		//Email
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxEmail, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxEmail, UserDetails.get("email").toString(), "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.drpdwnLanguage, "Language dropdown", "N")) {
			//Language, select first option always
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnLanguage, "Y");
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnLanguageFirstOption, "Y");
		}
		
		//Adding this line of code to handle the new field named "MiFleet User Role"
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRole, "Not Populated MiFleet User Role field", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRole, "Y");
			
			switch (activesite) {
			case "ME":
				DoThis.click(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRoleFirstOption, "Y");
			break;
			
			default:
				if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRoleOptionAdministrators, "MiFleet Administrator User Role", "N")) {
					DoThis.click(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRoleOptionAdministrators, "Y");
				}else {
					DoThis.click(SettingsPage.ManageUsersTab.drpdwnMiFleetUserRoleOptionAdministradores, "Y");
				}
			break;
			}
					
		}
		
		//Click Save button
		DoThis.click(SettingsPage.ManageUsersTab.btnSave, "Y");
		
		//Validate Toaster message
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "N")){
			Reporter.ReportEventNoImage("User created! toaster message is displayed");
		}
		
	}
	
	public static void SearchActiveUser(String browser, String subuser) throws IOException, Exception{
		
		//Navigate to Settings - Manage Users Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.nvBarManageUsers, "Y");
		
		//Set Status filter to Active Users
		DoThis.click(SettingsPage.ManageUsersTab.drpdwnStatus, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.drpdwnStatusOptionActiveUsers, "Y");
				
		//Enter Subuser in Search field
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxSearch, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxSearch, subuser.toString(), "Y");
		
		//Wait for Subuser data to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.btnCogWheels);
		
		WebElement SearchResultEditButton = Constant.driver.findElement(By.xpath("//*[text()='"+subuser.toString()+"']/ancestor::div[contains(@class,'rt-tr -odd')]/descendant::button[@type='button']"));
		Reporter.ReportEventNoImage("Activate Subuser "+subuser+" is found");
		
		//Edit Subuser
		DoThis.click(SearchResultEditButton, "Y");
		
	}
	
	public static void DeactivateUser() throws IOException, Exception{
		
		//Wait for Deactive User button to displayed
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.btnDeactivateUser);
		
		//Click Deactivate User button
		DoThis.click(SettingsPage.ManageUsersTab.btnDeactivateUser, "Y");
		
		//Click Yes, Deactivate button
		DoThis.click(SettingsPage.ManageUsersTab.btnYesDeactivate, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Successfully deactivated this user toaster message is displayed");
		}
		
	}
	
	public static void SearchDeactivatedUser(String browser, String subuser) throws IOException, Exception{
		
		//Navigate to Settings - Manage Users Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.nvBarManageUsers, "Y");
		
		//Set Status filter to Deactivated Users
		DoThis.click(SettingsPage.ManageUsersTab.drpdwnStatus, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.drpdwnStatusOptionDeactivatedUsers, "Y");
				
		//Enter Subuser in Search field
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxSearch, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxSearch, subuser.toString(), "Y");
		
		//Wait for Subuser data to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.btnCogWheels);
		
		WebElement SearchResultEditButton = Constant.driver.findElement(By.xpath("//*[text()='"+subuser.toString()+"']/ancestor::div[contains(@class,'rt-tr -odd')]/descendant::button[@type='button']"));
		Reporter.ReportEventNoImage("Deactivated Subuser "+subuser+" is found");
		
		//Edit Subuser
		DoThis.click(SearchResultEditButton, "Y");
		
	}
	
	public static void ImpersonateDeactivatedSubUser() throws IOException, Exception {
			
		//Navigate to Impersonate Sub User section 
		//Add Poll wait for ImpersonateSubuser to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser);
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser, "Y");
		
		//Click Impersonate Sub User button
		DoThis.click(SettingsPage.ManageUsersTab.btnImpersonateSubUser, "Y");
		
	}
	
	public static void LockUser() throws IOException, Exception {
		
		//Wait for Element to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.tgglbtnLock);
		
		//Click Lock User if User not yet Locked
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.tgglbtnLockUser, "Lock Toggle button", "NA")) {
			DoThis.click(SettingsPage.ManageUsersTab.tgglbtnLockUser, "Y");
			
			//Wait for toaster to load
			DoThis.WaitForToasterMessageToLoad(SettingsPage.ManageUsersTab.objToaster);
			
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "N")) {
				Reporter.ReportEventNoImage("Update successful! toaster message is displayed");
			}
		}else {
			Reporter.ReportEventNoImage("User is already locked!");
		}
		
	}
	
	public static void SearchLockedUser(String browser, String subuser) throws IOException, Exception{
		
		//Navigate to Settings - Manage Users Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.nvBarManageUsers, "Y");
				
		//Enter Subuser in Search field
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxSearch, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxSearch, subuser.toString(), "Y");
		
		//Wait for Subuser data to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.btnCogWheels);
		
	}
	
	public static void ImpersonateLockedSubUser(String browser, String subuser) throws IOException, Exception {
		
		ManageUsers.SearchUser(browser, subuser);
		
		//Check if the Chat bot is displayed
				if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objFleetChatbot, "Fleet Chat Bot", "N")) {
					DoThis.click(SettingsPage.ManageUsersTab.objFleetChatbot, "Y");
				}
		
		//Navigate to Impersonate Sub User section 
		//Add Poll wait for ImpersonateSubuser to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser);
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser, "Y");
		
		//Click Impersonate Sub User button
		DoThis.click(SettingsPage.ManageUsersTab.btnImpersonateSubUser, "Y");
		
	}
	
	public static void UnLockUser() throws IOException, Exception {
		
		//Click UnLock Status ON, if user not yet unlocked
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.tgglbtnLockStatusON, "Lock ON Status", "NA")) {
			DoThis.click(SettingsPage.ManageUsersTab.tgglbtnLockStatusON, "Y");
			
			//Wait for Confirm to displayed
			DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.btnConfirm);
			
			//Click Confirm button
			DoThis.click(SettingsPage.ManageUsersTab.btnConfirm, "Y");
			
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "NA")) {
				Reporter.ReportEventNoImage("Update successful! toaster message is displayed");
			}
		}else {
			Reporter.ReportEventNoImage("User is already unlocked!");
		}
		
	}
	
	public static void SearchAssignVehicleGroup(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesGroupDetails) throws IOException, Exception {
		
		switch (VehiclesGroupDetails.get("search_filter").toString()) {
		
		case "Vehicles":
			if(!DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.txtbxVehiclesSearch, "Vehicles Search text field", "NA")) {
				DoThis.click(SettingsPage.ManageUsersTab.tbVehicles, "Y");
			}
			//Wait for Search field to load
			DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.txtbxVehiclesSearch);
			
			DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxVehiclesSearch, "N");
			DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxVehiclesSearch, VehiclesGroupDetails.get("search_keyword").toString(), "Y");
			break;
			
		case "Groups":
			if(!DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.txtbxGroupsSearch, "Groups Search text field", "NA")) {
				DoThis.click(SettingsPage.ManageUsersTab.tbGroups, "Y");
			}
			
			//Wait for Search field to load
			DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.txtbxGroupsSearch);
			
			DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxGroupsSearch, "N");
			DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxGroupsSearch, VehiclesGroupDetails.get("search_keyword").toString(), "Y");
			break;
		}
		
	}
	
	public static void VerifyVehiclesAndGroupsTab(@SuppressWarnings("rawtypes") Dictionary VehiclesGroupDetails) throws IOException, Exception {
		
		switch (VehiclesGroupDetails.get("search_filter").toString()) {
		
		case "Vehicles":
			if(!DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.txtbxVehiclesSearch, "Vehicles Search text field", "NA")) {
				DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.tbVehicles);
				DoThis.click(SettingsPage.ManageUsersTab.tbVehicles, "Y");
			}
			//Wait for Search field to load
			DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.txtbxVehiclesSearch);
			break;
			
		case "Groups":
			if(!DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.txtbxGroupsSearch, "Groups Search text field", "NA")) {
				DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.tbGroups);
				DoThis.click(SettingsPage.ManageUsersTab.tbGroups, "Y");
			}
			
			//Wait for Search field to load
			DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.txtbxGroupsSearch);
			break;
		}
		
	}
	
	public static void SearchAndAssignVehicleGroups(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesGroupDetails) throws IOException, Exception {
		
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxVehicleGroupsSearch, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxVehicleGroupsSearch, VehiclesGroupDetails.get("vehicles_group_name").toString(), "Y");
		
		WebElement ViewCheckboxLocator = Constant.driver.findElement(By.xpath("//div[text()='"+VehiclesGroupDetails.get("vehicles_group_name").toString()+"']//following::div[3]/descendant::label[@for='checkbox']"));
		WebElement EditCheckboxLocator = Constant.driver.findElement(By.xpath("//div[text()='"+VehiclesGroupDetails.get("vehicles_group_name").toString()+"']//following::div[4]/descendant::label[@for='checkbox']"));
		WebElement RemoveCheckboxLocator = Constant.driver.findElement(By.xpath("//div[text()='"+VehiclesGroupDetails.get("vehicles_group_name").toString()+"']//following::div[6]/descendant::label[@for='checkbox']"));
		
		switch (VehiclesGroupDetails.get("assign_level").toString()) {
		
		case "View":
			
			DoThis.click(ViewCheckboxLocator, "Y");
			
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "N")) {
				Reporter.ReportEventNoImage("Update Vehicle Group Permissions Status succeeded toaster message is displayed");
			}
			
			break;
			
		case "View & Edit":
			
			DoThis.click(ViewCheckboxLocator, "Y");
			
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "NA")) {
				Reporter.ReportEventNoImage("Update Vehicle Group Permissions Status succeeded toaster message is displayed");
			}
			
			DoThis.click(EditCheckboxLocator, "Y");
			
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "NA")) {
				Reporter.ReportEventNoImage("Update Vehicle Group Permissions Status succeeded toaster message is displayed");
			}
			
			break;
			
		case "View, Edit & Remove":
			
			DoThis.click(ViewCheckboxLocator, "Y");
			
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "NA")) {
				Reporter.ReportEventNoImage("Update Vehicle Group Permissions Status succeeded toaster message is displayed");
			}
			
			DoThis.click(EditCheckboxLocator, "Y");
			
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "NA")) {
				Reporter.ReportEventNoImage("Update Vehicle Group Permissions Status succeeded toaster message is displayed");
			}
			
			DoThis.click(RemoveCheckboxLocator, "Y");

			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster message", "NA")) {
				Reporter.ReportEventNoImage("Update Vehicle Group Permissions Status succeeded toaster message is displayed");
			}
			break;
			
		}
	}
	
	public static void SetAllAvailablePermissions(String browser, @SuppressWarnings("rawtypes") Dictionary UserDetails) throws IOException, Exception {
		
		//Search User
		ManageUsers.SearchUser(browser, UserDetails.get("username").toString());
		
		//Wait for Element to Load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelPermission);
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelPermission, "Collapsed Panel Permission", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelPermission, "Y");
		}
		
		//Wait for Element to Load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.tglbtnAllAvailablePermission);
		switch (UserDetails.get("all_available_permissions").toString()) {
		
		case "true":
			//Check All Available Permission Toggle button status if OFF, if not turn ON
			if(!DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnAllAvailablePermission).contains("true")) {
				DoThis.click(SettingsPage.ManageUsersTab.tglbtnAllAvailablePermission, "Y");
			}else {
				Reporter.ReportEventNoImage("All Available Permission Toggle button is already ON");
			}
			break;
			
		case "false":
			
			if(DoThis.getCheckedStatus(SettingsPage.ManageUsersTab.tglbtnAllAvailablePermission).contains("true")) {
				DoThis.click(SettingsPage.ManageUsersTab.tglbtnAllAvailablePermission, "Y");
			}else {
				Reporter.ReportEventNoImage("All Available Permission Toggle button is already OFF");
			}
			break;
		}

	}
	
	public static void ResetPassword(String browser, @SuppressWarnings("rawtypes") Dictionary UserDetails) throws IOException, Exception {
		
		//Search User
		ManageUsers.SearchUser(browser, UserDetails.get("username").toString());
		
		//Wait for Element to load
		DoThis.WaitForElementToLoad(SettingsPage.ProfileSettingsTab.btnResetPassword);
		
		//Click Reset Password
		DoThis.click(SettingsPage.ProfileSettingsTab.btnResetPassword, "Y");
		
		if(DoThis.isObjectAvailable(SettingsPage.ProfileSettingsTab.objToaster, "Toaster message", "NA")) {
			Reporter.ReportEventNoImage("An email to reset password was sent to the user toaster message is displayed");
		}
	}
	
	public static void EditUserPhoneNumber(String browser) throws IOException, Exception{
		
		//Navigate to Settings - Manage Users Page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.nvBarManageUsers, "Y");
		
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxSearch, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxSearch, "86793", "Y");
		
		//Get Total Users Count
		String TotalUser = DoThis.getText(SettingsPage.ManageUsersTab.objTotalUsers);
		int IntTotalUser = Integer.parseInt(TotalUser);
		
		//Enter Subuser in Search field
		for(int i= 0; i < IntTotalUser; i++){
			DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxSearch, "N");
			DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxSearch, "86793", "Y");
			
			DoThis.click(SettingsPage.ManageUsersTab.btnEditList.get(0), "Y");
			
			
			if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.btnActivateUser, "Activate User button", "NA")){
				
				//Click Activate User button
				DoThis.click(SettingsPage.ManageUsersTab.btnActivateUser, "Y");
				
				//Click Yes, Activate button
				DoThis.click(SettingsPage.ManageUsersTab.btnYesActivate, "Y");
				
			}else {
				DoThis.click(SettingsPage.ManageUsersTab.btnEdit, "Y");
				
				//CellPhone
				DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxCellPhone, "N");
				DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxCellPhone, "84681234", "Y");
				
				//Click Save button
				DoThis.click(SettingsPage.ManageUsersTab.btnSave, "Y");
				
				//Click Back to users
				DoThis.click(SettingsPage.ManageUsersTab.btnBacktoUsers, "N");
			}
			
					
		}
		
	}
	
	public static void SearchAndInactiveAllUserCreatedByAutomation(String browser, String searchkeyword) throws IOException, Exception{
		
		//Navigate to Settings - Manage Users PageString browser, 
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.nvBarManageUsers, "Y");
		
		//Set Status filter to Active Users
		DoThis.click(SettingsPage.ManageUsersTab.drpdwnStatus, "Y");
		DoThis.click(SettingsPage.ManageUsersTab.drpdwnStatusOptionActiveUsers, "Y");
				
		//Enter Subuser in Search field
		DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxSearch, "N");
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxSearch, searchkeyword.toString(), "Y");

		//Get Total Users
		String strTotalUsers = DoThis.getText(SettingsPage.ManageUsersTab.objTotalUsersValue);
		int intTotalUsers=Integer.parseInt(strTotalUsers);  
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objNoDataAvailable, "No data available", "NA")) {
			Reporter.ReportEventNoImage("No Active Users is created by Automation");
		}else {
			//Set to Inactive All Users created by Automation
			for(int i=0; i<intTotalUsers; i++) {
				
				//Set Status filter to Active Users
				DoThis.click(SettingsPage.ManageUsersTab.drpdwnStatus, "Y");
				DoThis.click(SettingsPage.ManageUsersTab.drpdwnStatusOptionActiveUsers, "Y");
						
				//Enter Subuser in Search field
				DoThis.clear(browser, SettingsPage.ManageUsersTab.txtbxSearch, "N");
				DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxSearch, searchkeyword.toString(), "Y");
				
				//Wait for Subuser data to load
				DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.btnCogWheels);
				
				DoThis.click(SettingsPage.ManageUsersTab.icnPencilIcon, "Y");
				DoThis.click(SettingsPage.ManageUsersTab.btnDeactivateUser, "Y");
				DoThis.click(SettingsPage.ManageUsersTab.btnYesDeactivate, "Y");
			
			}
		}
		
	}
	
	public static void SetVehicleGroupPermissionAndImpersonate(String browser, @SuppressWarnings("rawtypes") Dictionary UserDetails) throws IOException, Exception {
		
		//Search User
		ManageUsers.SearchUser(browser, UserDetails.get("username").toString());
		
		//Navigate to Data Access >> Vehicle Groups
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelDataAccess);
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelDataAccess, "Collapsed Panel Data Access", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelDataAccess, "Y");
		}
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdPanelVehicleGroups, "Panel Vehicle Groups", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelVehicleGroups, "Y");
		}
	
		//Search Vehicle Group
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxVehicleGroupsSearch, UserDetails.get("vehicles_group_name").toString(), "Y");
		
		WebElement ViewCheckboxLocator = Constant.driver.findElement(By.xpath("//div[text()='"+UserDetails.get("vehicles_group_name").toString()+"']/parent::div[1]/descendant::label[1]"));
		WebElement EditCheckboxLocator = Constant.driver.findElement(By.xpath("//div[text()='"+UserDetails.get("vehicles_group_name").toString()+"']/parent::div[1]/descendant::label[2]"));
		WebElement DeleteCheckboxLocator = Constant.driver.findElement(By.xpath("//div[text()='"+UserDetails.get("vehicles_group_name").toString()+"']/parent::div[1]/descendant::label[3]"));
		WebElement ViewAllVehiclesCheckboxLocator = Constant.driver.findElement(By.xpath("//div[text()='"+UserDetails.get("vehicles_group_name").toString()+"']/parent::div[1]/descendant::label[4]"));
		
		switch (UserDetails.get("group_vehicle_permission").toString()) {
		
		case "View":
			DoThis.click(ViewCheckboxLocator, "Y");
		break;
		
		case "Edit":
			DoThis.click(EditCheckboxLocator, "Y");
		break;
		
		case  "Remove":
			DoThis.click(DeleteCheckboxLocator, "Y");
		break;
		
		case  "View All Vehicles":
			DoThis.click(ViewAllVehiclesCheckboxLocator, "Y");
		break;
		
		}
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage("Update Vehicle Group Permissions Status succeeded toaster message is displayed");
		}
		
		//Navigate to Impersonate Sub User section 
		//Add Poll wait for ImpersonateSubuser to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser);
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser, "Y");
		
		//Click Impersonate Sub User button
		DoThis.click(SettingsPage.ManageUsersTab.btnImpersonateSubUser, "Y");
	
	}
	
	public static void SetDriverPermissionAndImpersonate(String browser, @SuppressWarnings("rawtypes") Dictionary UserDetails) throws IOException, Exception {
		
		//Search User
		ManageUsers.SearchUser(browser, UserDetails.get("username").toString());
		
		//Navigate to Data Access >> Drivers
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelDataAccess);
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelDataAccess, "Collapsed Panel Data Access", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelDataAccess, "Y");
		}
		
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdPanelDrivers, "Side Panel Drivers", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelDrivers, "Y");
		}
		
		//Check if the Chat bot is displayed
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objFleetChatbot, "Fleet Chat Bot", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.objFleetChatbot, "Y");
		}

		//Search Driver
		DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxDriversSearch, UserDetails.get("driver_first_name").toString(), "Y");
		
		WebElement ViewCheckboxLocator = Constant.driver.findElement(By.xpath("//div[text()='"+UserDetails.get("driver_first_name").toString()+"']/parent::div[1]/descendant::label[1]"));
		WebElement EditCheckboxLocator = Constant.driver.findElement(By.xpath("//div[text()='"+UserDetails.get("driver_first_name").toString()+"']/parent::div[1]/descendant::label[2]"));
		WebElement DeleteCheckboxLocator = Constant.driver.findElement(By.xpath("//div[text()='"+UserDetails.get("driver_first_name").toString()+"']/parent::div[1]/descendant::label[3]"));
		
		switch (UserDetails.get("driver_permission").toString()) {
		
		case "View":
			DoThis.click(ViewCheckboxLocator, "Y");
		break;
		
		case "Edit":
			DoThis.click(EditCheckboxLocator, "Y");
		break;
		
		case  "Remove":
			DoThis.click(DeleteCheckboxLocator, "Y");
		break;
		
		}
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage("Update Driver Permissions Status succeeded toaster message is displayed");
		}
		
		//Navigate to Impersonate Sub User section 
		//Add Poll wait for ImpersonateSubuser to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser);
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser, "Y");
		
		//Click Impersonate Sub User button
		DoThis.click(SettingsPage.ManageUsersTab.btnImpersonateSubUser, "Y");
	
	}
	
	public static void SetReportPermissionAndImpersonate(String browser, @SuppressWarnings("rawtypes") Dictionary UserDetails) throws IOException, Exception {
		
		//Search User
		ManageUsers.SearchUser(browser, UserDetails.get("username").toString());
		
		//Navigate to Data Access >> Reports
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelDataAccess);
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdCollapsedPanelDataAccess, "Collapsed Panel Data Access", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelDataAccess, "Y");
		}
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.sdPanelReports, "Panel Reports", "N")) {
			DoThis.click(SettingsPage.ManageUsersTab.sdPanelReports, "Y");
		}
		
		//Wait for Element to Load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.btnSelectAllReport);
	
		//Search Reports
		switch (UserDetails.get("report_permission").toString()) {
		
		case "Unassign":
			//Unassigned All Reports
			DoThis.click(SettingsPage.ManageUsersTab.btnSelectAllReport, "Y");
		break;
		
		case "Assign":
			DoThis.sendkeys(SettingsPage.ManageUsersTab.txtbxReportsSearch, UserDetails.get("report").toString(), "Y");
			WebElement ReportLocator = Constant.driver.findElement(By.xpath("//div[contains(text(),'"+UserDetails.get("report").toString()+"')]/preceding::label[1]"));
			DoThis.click(ReportLocator, "Y");
			
		break;
		
		}
		if(DoThis.isObjectAvailable(SettingsPage.ManageUsersTab.objToaster, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage("Update successful! toaster message is displayed");
		}
		
		//Navigate to Impersonate Sub User section 
		//Add Poll wait for ImpersonateSubuser to load
		DoThis.WaitForElementToLoad(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser);
		DoThis.click(SettingsPage.ManageUsersTab.sdPanelImpersonateSubUser, "Y");
		
		//Click Impersonate Sub User button
		DoThis.click(SettingsPage.ManageUsersTab.btnImpersonateSubUser, "Y");
	
	}
}
