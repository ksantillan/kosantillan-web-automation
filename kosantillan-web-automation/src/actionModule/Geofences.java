package actionModule;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.Dictionary;
import pageObject.ListPage;
import pageObject.SettingsPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Geofences{	
	
	
	public static void SearchGeofences(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesDetails) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofencesDetails.get("geofences_name").toString(), "Y");
		
	}
	public static void SelectGeofences(@SuppressWarnings("rawtypes") Dictionary GeofencesDetails) throws InterruptedException {
		
		WebElement Geofences = Constant.driver.findElement(By.xpath("//div[text()='"+GeofencesDetails.get("geofences_name")+"']/ancestor::div[@role='row']"));
		DoThis.click(Geofences, "Y");
	
	}
	
	public static void DeleteMultipleGeofences(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesDetails) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
	
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofencesDetails.get("geofences_name").toString(), "Y");

		String GeofencesCount = DoThis.getText(ListPage.GeofencesPage.objGeofencesTotalCount);
		int intGeofencesCount=Integer.parseInt(GeofencesCount);  
		
		
		//If search results is more than 25 count, page size will be set to 100
		if(intGeofencesCount > 25) {
			DoThis.selectByValue(ListPage.GeofencesPage.objPagination, "100", "Y");
			
		}
		
		//Click Select All checkbox
		DoThis.click(ListPage.GeofencesPage.chckbxAll, "Y");
		
		//Click Delete Selected
		DoThis.click(ListPage.GeofencesPage.btnDeleteSelected, "Y");
		
		//Click Yes Delete
		DoThis.click(ListPage.GeofencesPage.btnYesDelete, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.GeofencesPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.GeofencesPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage("Geofences were successfully deleted. toaster message is displayed");
		}
		
	}
	
	public static void SearchAndSelectGeofences(String browser, String GeofenceName) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
	
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofenceName, "Y");
		
		WebElement Geofences = Constant.driver.findElement(By.xpath("//div[text()='"+GeofenceName+"']/ancestor::div[@role='row']"));
		DoThis.click(Geofences, "Y");
		
	}
	
	public static void EditGeofences(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesDetails) throws InterruptedException {
		
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.btnEditGeofences);
		DoThis.click(ListPage.GeofencesPage.btnEditGeofences, "Y");
		
		//Update Geofence Name
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxGeofencesName);
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxGeofencesName, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxGeofencesName, GeofencesDetails.get("updated_geofences_name").toString(), "Y");
		
		//Update Geofences Description
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxDescription, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxDescription, GeofencesDetails.get("updated_geofences_description").toString(), "Y");
		
		//Click Save
		DoThis.click(ListPage.GeofencesPage.btnSave, "Y");
		
		//Wait for Toaster message to displayed
		DoThis.WaitForToasterMessageToLoad(ListPage.GeofencesPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.GeofencesPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(GeofencesDetails.get("updated_geofences_name").toString()+" was successfully updated. toaster message is displayed");
		}
	}
	
	public static void SearchUpdatedAndValidateGeofences(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesDetails) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
	
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofencesDetails.get("updated_geofences_name").toString(), "Y");
		
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.objCogWheels);
		
		//Validate Updated Name and Description
		WebElement UpdatedGeofenceNameLocator = Constant.driver.findElement(By.xpath("//div[contains(@class,'rt-td')]/following::div[text()='"+GeofencesDetails.get("updated_geofences_name").toString()+"']"));
		WebElement UpdatedGeofenceDescriptionLocator = Constant.driver.findElement(By.xpath("//div[contains(@class,'rt-td')]/following::div[text()='"+GeofencesDetails.get("updated_geofences_description").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(UpdatedGeofenceNameLocator, "Updated Geofences Name validation", "Y")){assertTrue(false);}
		if(!DoThis.isObjectDisplayed(UpdatedGeofenceDescriptionLocator, "Updated Geofences Description validation", "Y")){assertTrue(false);}
		
	}
	
	public static void AddGeofencesGroupsAndAllGeofences(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesGroupDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
		
		//Click Add Group
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.btnAddGroup);
		DoThis.click(ListPage.GeofencesPage.btnAddGroup, "Y");
		
		//Enter Group Name
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxGeofencesGroupName, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxGeofencesGroupName, GeofencesGroupDetails.get("geofences_group_name").toString(), "Y");
		
		//Click Next button
		DoThis.click(ListPage.GeofencesPage.btnNext, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.GeofencesPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.GeofencesPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(GeofencesGroupDetails.get("geofences_group_name").toString()+" was successfully created. toaster message is displayed");
		}
		
		//Click Select All checkbox
		DoThis.click(ListPage.GeofencesPage.chckbxAll, "Y");
		
		//Click Save button
		DoThis.click(ListPage.GeofencesPage.btnSave, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.GeofencesPage.objToasterMessage);
				
		if(DoThis.isObjectAvailable(ListPage.GeofencesPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(GeofencesGroupDetails.get("geofences_group_name").toString()+" was successfully updated. toaster message is displayed");
		}
			
	}
	
	public static void SearchGeofencesGroup(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesGroupDetails) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofencesGroupDetails.get("geofences_group_name").toString(), "Y");
		
	}
	
	public static void AddGeofencesGroupsAndCancelAddingGeofences(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesGroupDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
		
		//Click Add Group
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.btnAddGroup);
		DoThis.click(ListPage.GeofencesPage.btnAddGroup, "Y");
		
		//Enter Group Name
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxGeofencesGroupName, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxGeofencesGroupName, GeofencesGroupDetails.get("geofences_group_name").toString(), "Y");
		
		//Click Next button
		DoThis.click(ListPage.GeofencesPage.btnNext, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.GeofencesPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.GeofencesPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(GeofencesGroupDetails.get("geofences_group_name").toString()+" was successfully created. toaster message is displayed");
		}
		
		
		//Click Cancel button
		DoThis.click(ListPage.GeofencesPage.btnCancel, "Y");
		
	}
	
	public static void AddGeofenceGroupsAndGeofence(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesGroupDetails, String GeofencesName) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
		
		//Click Add Group
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.btnAddGroup);
		DoThis.click(ListPage.GeofencesPage.btnAddGroup, "Y");
		
		//Enter Group Name
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxGeofencesGroupName, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxGeofencesGroupName, GeofencesGroupDetails.get("geofences_group_name").toString(), "Y");
		
		//Click Next button
		DoThis.click(ListPage.GeofencesPage.btnNext, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.GeofencesPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.GeofencesPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(GeofencesGroupDetails.get("geofences_group_name").toString()+" was successfully created. toaster message is displayed");
		}
				
		//Search for the newly created Driver
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofencesName, "Y");
		
		//Select the newly created Geofences
		DoThis.click(ListPage.GeofencesPage.chckbxFirstGeofencesOption, "Y");
		
		//Click Save button
		DoThis.click(ListPage.GeofencesPage.btnSave, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.GeofencesPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.GeofencesPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(GeofencesGroupDetails.get("geofences_group_name").toString()+" was successfully updated. toaster message is displayed");
		}
				
	}

	public static void SelectGeofencesGroupAndGeofences(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesGroupDetails, String GeofencesName) throws InterruptedException {
		
		Geofences.SearchGeofencesGroup(browser, GeofencesGroupDetails);
		
		//Select Driver Group
		WebElement GeofencesGroupNameLocator = Constant.driver.findElement(By.xpath("//*[text()='"+GeofencesGroupDetails.get("geofences_group_name").toString()+"']"));
		DoThis.click(GeofencesGroupNameLocator, "Y");
		
		//Wait for Edit Group button to display
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.btnEditGroup);
		
		//Select Driver
		WebElement GeofencesNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+GeofencesName+"']"));
		DoThis.click(GeofencesNameLocator, "Y");
		
		
	}
	
	public static void DeleteGeofence(String browser, String GeofenceName) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
	
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofenceName, "Y");
		
		WebElement Geofences = Constant.driver.findElement(By.xpath("//div[text()='"+GeofenceName+"']/ancestor::div[@role='row']"));
		DoThis.click(Geofences, "Y");
		
		//Wait for Edit Geofence button to load
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.btnEditGeofences);
		
		//Click Edit Geofence
		DoThis.click(ListPage.GeofencesPage.btnEditGeofences, "Y");
		
		//Click Delete
		DoThis.click(ListPage.GeofencesPage.btnDelete, "Y");
		
		//Click Yes Delete
		DoThis.click(ListPage.GeofencesPage.btnYesDelete, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.GeofencesPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.GeofencesPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(GeofenceName+" was successfully deleted. toaster message is displayed");
		}
		
	}
	
	public static void SearchDeletedAndValidateGeofences(String browser, String DeletedGeofences) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
	
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, DeletedGeofences, "Y");
				
		//Validate Deleted Geofences
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.objNoDataAvailable, "No data available validation", "Y")) {assertTrue(false);}
	}

	public static void ImportGeofenceDownloadTemplate(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(ListPage.Geofencestab.btnImportGeofence);
		//Click Import Geofences
		DoThis.click(ListPage.Geofencestab.btnImportGeofence, "Y");
		
		//Category = Importers
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategory, "Y");
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategoryOptionImporters, "Y");
		
		//Set Import Type
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportType, "Y");
		
		switch(GeofencesDetails.get("import_type").toString()) {
		case "Import Geofences":
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportGeofences, "Y");
		break;
		
		case "Import Geofences (With Group)":
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportGeofencesWithGroup, "Y");
		break;
		
		case "Import Geofences Polygon":
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportGeofencesPolygon, "Y");
		break;
	
		}
		
		//Click Download Template
		DoThis.click(SettingsPage.ImportsDataTab.btnDownloadTemplate, "Y");
	
	}
	
	public static void SearchAndEditGeofenceGroups(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesGroupDetails, String GeofencesName) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofencesGroupDetails.get("geofences_group_name").toString(), "Y");

		//Click Geofences Group
		WebElement GeofencesGroupLocator = Constant.driver.findElement(By.xpath("//*[text()='"+GeofencesGroupDetails.get("geofences_group_name").toString()+"']"));
		DoThis.click(GeofencesGroupLocator, "Y");
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.btnEditGroup);
		
		//Click Edit Group
		DoThis.click(ListPage.GeofencesPage.btnEditGroup, "Y");
		
		//Update Group Name
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxGeofencesGroupName, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxGeofencesGroupName, GeofencesGroupDetails.get("updated_geofences_group_name").toString(), "Y");
		
		//Click Select All checkbox
		DoThis.click(ListPage.GeofencesPage.chckbxAll, "Y");
		
		//Click Save button
		DoThis.click(ListPage.GeofencesPage.btnSave, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.GeofencesPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.GeofencesPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(GeofencesGroupDetails.get("geofences_group_name").toString()+" was successfully updated. toaster message is displayed");
		}
	}
	
	public static void SearchEditedGeofenceGroups(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesGroupDetails, String GeofencesName) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofencesGroupDetails.get("updated_geofences_group_name").toString(), "Y");
	
	}
	
	public static void DeleteGeofenceGroupsCreatedByAutomation(String browser, @SuppressWarnings("rawtypes") Dictionary GeofencesGroupDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
		}else {
			DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
		DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofencesGroupDetails.get("search_geofences_group_name").toString(), "Y");
		
		//Get Total Number of Group Name
		String strGeofenceGroupCount = DoThis.getText(ListPage.GeofencesPage.objTotalGroups);
		int intGeofenceGroupCount = Integer.parseInt(strGeofenceGroupCount);
		
		if(intGeofenceGroupCount == 0) {
			Reporter.ReportEventNoImage("No Geofences Groups created by Automation is found");
			
		}else {
			Reporter.ReportEventNoImage(intGeofenceGroupCount+" Geofences Groups created by Automation will be deleted");
			for(int i=0; i<intGeofenceGroupCount; i++ ) {
				DoThis.click(ListPage.nvTabList, "Y");
				if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
					DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
				}else {
					DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
				}
				
				DoThis.WaitForElementToLoad(ListPage.GeofencesPage.txtbxSearch);
				DoThis.clear(browser, ListPage.GeofencesPage.txtbxSearch, "N");
				DoThis.sendkeys(ListPage.GeofencesPage.txtbxSearch, GeofencesGroupDetails.get("search_geofences_group_name").toString(), "Y");
				
				WebElement GeofencesGroupNameLocator = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+GeofencesGroupDetails.get("search_geofences_group_name").toString()+"')]"));
				DoThis.click(GeofencesGroupNameLocator, "Y");
				
				//Click Edit Group button
				DoThis.click(ListPage.GeofencesPage.btnEditGroup, "Y");
				
				//Click Delete Group button
				DoThis.click(ListPage.GeofencesPage.btnDeleteGroup, "Y");
				
				//Click Yes, Delete button
				DoThis.click(ListPage.GeofencesPage.btnYesDelete, "Y");
				
				if(DoThis.isObjectAvailable(ListPage.GeofencesPage.objToaster, "Toaster message", "NA")) {
					Reporter.ReportEventNoImage("Automation Geofences Group was successfully deleted");
				}

			}
		}
	}
	
}
	
