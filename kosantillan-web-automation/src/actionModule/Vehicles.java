package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObject.ListPage;
import pageObject.MapPage;
import pageObject.NotificationPage;
import pageObject.SettingsPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

public class Vehicles{	
	
	public static void AddGroup(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesGroupDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Wait for Element to load
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.btnAddGroup);
		
		//Click Add Group
		DoThis.click(ListPage.VehiclesPage.btnAddGroup, "Y");
		
		//Set Group Name
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxName, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxName, VehiclesGroupDetails.get("vehicles_group_name").toString(), "Y");
		
		//Click Next button
		DoThis.click(ListPage.VehiclesPage.btnNext, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(VehiclesGroupDetails.get("vehicles_group_name").toString()+" was successfully created toaster message is displayed");
		}
		
		//Ticked Select All Vehicles
		//Wait for Select All Vehicles checkbox to displayed
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.chkbxSelectAllVehicles);
		DoThis.click(ListPage.VehiclesPage.chkbxSelectAllVehicles, "Y");
		
		//Click Save button
		DoThis.click(ListPage.VehiclesPage.btnSave, "Y");
		
		//Wait for toaster to load
		DoThis.WaitForToasterMessageToLoad(ListPage.VehiclesPage.objToaster);
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(VehiclesGroupDetails.get("vehicles_group_name").toString()+" was successfully updated is displayed");
			}
		
			
	}
	public static void SearchVehiclesGroup(String browser, String VehiclesGroupName) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesGroupName, "Y");
		
		
		
	}
	
	public static void SelectVehiclesGroup(String browser, String VehiclesGroupName) throws InterruptedException {

		//Wait for Element to Load
		DoThis.WaitForElementToLoad(ListPage.nvTabList);
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.txtbxSearch);
		
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesGroupName, "Y");
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesGroupName, "Y");
		
		WebElement GroupNameLocator = Constant.driver.findElement(By.xpath("//*[text()='"+VehiclesGroupName+"']"));
		DoThis.click(GroupNameLocator, "Y");
		
	}
	
	public static void EditVehiclesGroup() throws InterruptedException {

		//Click Edit Group button
		DoThis.click(ListPage.VehiclesPage.btnEditGroup, "Y");
		
	}
	
	public static void SelectAndEditVehiclesGroup(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesGroupDetails) throws InterruptedException {

		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesGroupDetails.get("vehicles_group_name").toString(), "Y");
		
		WebElement GroupNameLocator = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesGroupDetails.get("vehicles_group_name").toString()+"')]"));
		DoThis.click(GroupNameLocator, "Y");
		
		//Click Edit Group button
		DoThis.click(ListPage.VehiclesPage.btnEditGroup, "Y");
		
		//Wait for Group Name field to appeared
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.txtGroupName);
		
		//Update Group Vehicle Name
		DoThis.clear(browser, ListPage.VehiclesPage.txtGroupName, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtGroupName, VehiclesGroupDetails.get("updated_vehicles_group_name").toString(), "Y");
		
		//Wait for Select All Vehicles checkbox to displayed
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.chkbxSelectAllVehicles);
		
		if(DoThis.getCheckedStatus(ListPage.VehiclesPage.objSelectAllVehicles).equals("false")) {
			//Ticked Select All Vehicles
			DoThis.click(ListPage.VehiclesPage.chkbxSelectAllVehicles, "Y");
		}
		
		//Click Save button
		DoThis.click(ListPage.VehiclesPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(VehiclesGroupDetails.get("vehicles_group_name").toString()+" was successfully updated is displayed");
			}
	}
	
	public static void VerifyEditVehiclesGroup(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesGroupDetails) throws InterruptedException {

		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesGroupDetails.get("vehicles_group_name").toString(), "Y");
		
		WebElement GroupNameLocator = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesGroupDetails.get("vehicles_group_name").toString()+"')]"));
		DoThis.click(GroupNameLocator, "Y");
		
		//Click Edit Group button
		DoThis.click(ListPage.VehiclesPage.btnEditGroup, "Y");
		
		
	}
	
	public static void ViewVehicleDetails() throws InterruptedException {

		//Click Vehicle Summary Card details
		DoThis.click(MapPage.Fleettab.objVehicleSummaryCard, "Y");
		
		while(!DoThis.isObjectAvailable(ListPage.VehiclesPage.btnEditVehicle, "Edit Vehicle button", "N")) {
			//Wait for the Vehicle Summary to displayed
			DoThis.WaitForElementToLoad(ListPage.VehiclesPage.btnEditVehicle);
		}
	}	
	
	public static void DeleteVehicleGroupsCreatedByAutomation(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesGroupDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesGroupDetails.get("vehicles_group_name").toString(), "Y");
		
		//Check the Numbers of Total Groups based on entered Vehicle Group Name
		String TotalGroupName = DoThis.getText(ListPage.Vehiclestab.TotalVehicleGroupNumber);
		int intTotalGroupName = Integer.parseInt(TotalGroupName);  

		if(intTotalGroupName == 0) {
			Reporter.ReportEventNoImage("No Vehicles Groups created by Automation is found");
			
		}else {
			Reporter.ReportEventNoImage(intTotalGroupName+" Vehicles Groups created by Automation will be deleted");
			for(int i=0; i<intTotalGroupName; i++ ) {
				DoThis.click(ListPage.nvTabList, "Y");
				DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
				
				DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
				DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesGroupDetails.get("vehicles_group_name").toString(), "Y");
				
				WebElement GroupNameLocator = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesGroupDetails.get("vehicles_group_name").toString()+"')]"));
				DoThis.click(GroupNameLocator, "Y");
				
				//Click Edit Group button
				DoThis.click(ListPage.VehiclesPage.btnEditGroup, "Y");
				
				//Click Delete Group button
				DoThis.click(ListPage.VehiclesPage.btnDeleteGroup, "Y");
				
				//Click Yes, Delete button
				DoThis.click(ListPage.VehiclesPage.btnYesDelete, "Y");
				
				//Wait for toaster to load
				DoThis.WaitForToasterMessageToLoad(ListPage.VehiclesPage.objToaster);
				
				if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster message", "NA")) {
					Reporter.ReportEventNoImage("Automation Group was successfully deleted. toaster is displayed");
				}

			}
		}
	
	}
	
	public static void AddVehicleDescriptions(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Search Vehicles
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesDetails.get("vehicles_name").toString(), "Y");
		
		//Click First Row in Vehicles Table
		DoThis.click(ListPage.VehiclesPage.objVehiclesFirstRow, "Y");
		
		//Wait for Edit Vehicle Button to displayed
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.btnEditVehicle);
		
		//Click Edit Vehicle Button
		DoThis.click(ListPage.VehiclesPage.btnEditVehicle, "Y");
		
		//Check if the Chat bot is displayed
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objFleetChatbot, "Fleet Chat Bot", "NA")) {
			DoThis.click(ListPage.VehiclesPage.objFleetChatbot, "Y");
		}
		//Click Add Description button if still displayed
		int i = 0;
		while(DoThis.isObjectAvailable(ListPage.VehiclesPage.btnAddDescriptionField, "Add Description button", "N")) {
			DoThis.click(ListPage.VehiclesPage.btnAddDescriptionField, "Y");
			i++;
		}
		
		//Add Description in all 3 Description fields
		for(int description=0; description<3; description++) {
			int descriptioncount = description+1;
			DoThis.clear(browser, ListPage.VehiclesPage.txtbxDescriptions.get(description), "N");
			DoThis.sendkeys(ListPage.VehiclesPage.txtbxDescriptions.get(description), VehiclesDetails.get("description").toString()+" "+descriptioncount, "Y");
		}
		
		//Click Save button
		DoThis.click(ListPage.VehiclesPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Vehicle successfully updated toaster is displayed");
			}
	
	}
	
	public static void DeleteVehicleDescriptions(@SuppressWarnings("rawtypes") Dictionary VehiclesDetails) throws IOException, Exception{
				
		//Click Delete Description button if still displayed
		int i = 0;
		while(DoThis.isObjectAvailable(ListPage.VehiclesPage.btnDeleteDescriptionField, "Delete Description button", "N")) {
			DoThis.click(ListPage.VehiclesPage.btnDeleteDescriptionField, "Y");
			i++;
		}
		
		//Click Save button
		DoThis.click(ListPage.VehiclesPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Vehicle successfully updated toaster is displayed");
			}
	
	}

	public static void SearchAndSelectVehicle(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesDetails) throws InterruptedException {

		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Search Vehicles
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesDetails.get("vehicles_name").toString(), "Y");
		
		//Click First Row in Vehicles Table
		DoThis.click(ListPage.VehiclesPage.objVehiclesFirstRow, "Y");
		
	}
	
	public static void ViewVehicleAdvanceSettings(String browser) throws InterruptedException {

		//Get URL
		String url = Constant.driver.getCurrentUrl();
		
		//Append text to URL to access advance settings
		String newurl = url+"?sensors=true";
		Constant.driver.get(newurl);	
		
	}
	
	public static void EditSensorData(String browser) throws InterruptedException {

		//Add Poll Wait
		DoThis.WaitForElementToLoad(ListPage.Vehiclestab.EditVehicleBtn);
		//Edit Vehicle Button
		DoThis.click(ListPage.Vehiclestab.EditVehicleBtn, "N");
		
		//Enter Dynamic Field password
		DoThis.clear(browser, ListPage.Vehiclestab.DynamicFieldpassword, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.DynamicFieldpassword, "polkiu", "Y");
		
		//Click Submit button
		DoThis.click(ListPage.Vehiclestab.DynamicFieldSubmitbtn, "Y");
		
	}	
	
	public static void AddGroupAndCancelAddingVehicle(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesGroupDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Click Add Group
		DoThis.click(ListPage.VehiclesPage.btnAddGroup, "Y");
		
		//Set Group Name
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxName, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxName, VehiclesGroupDetails.get("vehicles_group_name").toString(), "Y");
		
		//Click Next button
		DoThis.click(ListPage.VehiclesPage.btnNext, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(VehiclesGroupDetails.get("vehicles_group_name").toString()+" was successfully created is displayed");
		}
		
		//Click Cancel button
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.btnCancel);
		DoThis.click(ListPage.VehiclesPage.btnCancel, "Y");

	}
	
	public static void AddGroupAndOneVehicle(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesGroupDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Click Add Group
		DoThis.click(ListPage.VehiclesPage.btnAddGroup, "Y");
		
		//Set Group Name
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxName, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxName, VehiclesGroupDetails.get("vehicles_group_name").toString(), "Y");
		
		//Click Next button
		DoThis.click(ListPage.VehiclesPage.btnNext, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(VehiclesGroupDetails.get("vehicles_group_name").toString()+" was successfully created");
		}
		
		//Wait for Element to load
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.txtbxSearch);
		
		//Search for the Vehicle
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesGroupDetails.get("vehicle").toString(), "Y");
		
		//Select the Vehicle
		DoThis.click(ListPage.VehiclesPage.chckbxFirstVehicleOption, "Y");
		
		//Click Save button
		DoThis.click(ListPage.VehiclesPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(VehiclesGroupDetails.get("vehicles_group_name").toString()+" was successfully updated is displayed");
			}
			
	}
	
	public static void SelectVehicleGroupAndVehicle(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesGroupDetails) throws InterruptedException {
		
		Vehicles.SearchVehiclesGroup(browser, VehiclesGroupDetails.get("vehicles_group_name").toString());
						
		//Select Vehicles Group
		WebElement GroupNameLocator = Constant.driver.findElement(By.xpath("//*[text()='"+VehiclesGroupDetails.get("vehicles_group_name").toString()+"']"));
		DoThis.click(GroupNameLocator, "Y");
		
		//Wait for Edit Group button to display
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.btnEditGroup);
		
		//Select Vehicle
		WebElement VehiclesNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+VehiclesGroupDetails.get("vehicle").toString()+"']"));
		DoThis.click(VehiclesNameLocator, "Y");
			
	}
	
	public static void ImportVehicleDownloadTemplate() throws InterruptedException {
		
		//Navigate to Settings >> Import Data page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ImportsDataTab.nvBarImportData, "Y");		
		
		//Category = Importers
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategory, "Y");
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategoryOptionImporters, "Y");
		
		//Import Type = Import POI
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportType, "Y");
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportVehiclestoGroups, "Y");
		
		//Click Download Template
		DoThis.click(SettingsPage.ImportsDataTab.btnDownloadTemplate, "Y");
	
	}
	
	public static void EditDynamicField(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesAdvanceDetails) throws InterruptedException {

		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Search Vehicles
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesAdvanceDetails.get("vehicles_name").toString(), "Y");
		
		//Click First Row in Vehicles Table
		DoThis.click(ListPage.VehiclesPage.objVehiclesFirstRow, "Y");
		
		//Advance Settings
		Vehicles.ViewVehicleAdvanceSettings(browser);
		
		//Edit Sensor Data
		Vehicles.EditSensorData(browser);
			
		//Dynamic Field AuxFuel Capacity
		DoThis.clear(browser, ListPage.Vehiclestab.DynamicFieldAuxFuelCapacity, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.DynamicFieldAuxFuelCapacity, VehiclesAdvanceDetails.get("vehicles_sensor_mintrigger").toString(), "Y");
		
		//Dynamic Field fuel Capacity
		DoThis.clear(browser, ListPage.Vehiclestab.DynamicFieldfuelCapacity, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.DynamicFieldfuelCapacity, VehiclesAdvanceDetails.get("vehicles_sensor_maxtrigger").toString(), "Y");
		
		//Tank Shape
		DoThis.click(ListPage.Vehiclestab.DynamicFieldTankShape, "Y");
		WebElement TankShape = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesAdvanceDetails.get("vehicles_sensor_type").toString()+"')]"));
		DoThis.click(TankShape, "Y");
		
		//Click Save button
		DoThis.click(ListPage.VehiclesPage.btnSave, "Y");
		
		}
	
	public static void AddNewSensor(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesAdvanceDetails, String activesite) throws InterruptedException {

		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Search Vehicles
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesAdvanceDetails.get("vehicles_name").toString(), "Y");
		
		//Click First Row in Vehicles Table
		DoThis.click(ListPage.VehiclesPage.objVehiclesFirstRow, "Y");
		
		//Advance Settings
		Vehicles.ViewVehicleAdvanceSettings(browser);
		
		//Edit Sensor Data
		Vehicles.EditSensorData(browser);
		
		//Click Add New Sensor
		DoThis.click(ListPage.Vehiclestab.AddNewSensorbtn, "N");
		
		//Sensor Number
		DoThis.WaitForElementToLoad(ListPage.Vehiclestab.SensorNumberfld);
		DoThis.clear(browser, ListPage.Vehiclestab.SensorNumberfld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorNumberfld, VehiclesAdvanceDetails.get("vehicles_sensor_number").toString(), "Y");
		
		//Sensor Name
		DoThis.clear(browser, ListPage.Vehiclestab.SensorNamefld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorNamefld, VehiclesAdvanceDetails.get("vehicles_sensor_name").toString(), "Y");
		
		//Sensor Type
		DoThis.click(ListPage.Vehiclestab.SensorTypeDL, "Y");
		WebElement SensorType = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesAdvanceDetails.get("vehicles_sensor_type").toString()+"')]"));
		DoThis.click(SensorType, "Y");
		
		//Sensor Priority
		DoThis.click(ListPage.Vehiclestab.SensorPriorityDL, "Y");
		switch (activesite) {
		
		case "PT":
		case "ES":
		case "FR":
			//Translate options based on PT Language
			String vehicles_sensor_priority = null;
			switch (VehiclesAdvanceDetails.get("vehicles_sensor_priority").toString()) {
			
			case "CRITICAL":
				vehicles_sensor_priority = "Critica";
			break;
			
			case "HIGH":
				vehicles_sensor_priority = "Alta";
			break;
				
			case "LOW":
				vehicles_sensor_priority = "Baixa";
			break;
			}
			
			WebElement SensorPriority = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+vehicles_sensor_priority.toString()+"')]"));
			DoThis.click(SensorPriority, "Y");
		break;
		
		default:
			SensorPriority = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesAdvanceDetails.get("vehicles_sensor_priority").toString()+"')]"));
			DoThis.click(SensorPriority, "Y");
		break;
		}
		
	
		//Sensor Activity Level
		DoThis.click(ListPage.Vehiclestab.SensorActivityLevelDL, "Y");
		WebElement SensorActivityLevel = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesAdvanceDetails.get("vehicles_sensor_activitylevel").toString()+"')]"));
		DoThis.click(SensorActivityLevel, "Y");
		
		//Sensor Min Trigger
		DoThis.clear(browser, ListPage.Vehiclestab.SensorMinTriggerfld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorMinTriggerfld, VehiclesAdvanceDetails.get("vehicles_sensor_mintrigger").toString(), "Y");
		
		//Sensor Max Trigger
		DoThis.clear(browser, ListPage.Vehiclestab.SensorMaxTriggerfld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorMaxTriggerfld, VehiclesAdvanceDetails.get("vehicles_sensor_maxtrigger").toString(), "Y");
		
		//Sensor Multiplier
		DoThis.clear(browser, ListPage.Vehiclestab.SensorMultiplierfld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorMultiplierfld, VehiclesAdvanceDetails.get("vehicles_sensor_mutiplier").toString(), "Y");
		
		//Sensor Analog Offset
		DoThis.clear(browser, ListPage.Vehiclestab.SensorAnalogOffsetfld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorAnalogOffsetfld, VehiclesAdvanceDetails.get("vehicles_sensor_analogoffset").toString(), "Y");
		
		//Click Submit button
		DoThis.click(ListPage.Vehiclestab.SensorSavebtn, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage("Sensor successfully added.");
			}
	}

	public static void EditSensor(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesAdvanceDetails, String activesite) throws InterruptedException {

		//Click existing sensor
		WebElement ExistingSensor = Constant.driver.findElement(By.xpath("//div[contains(@class,'rt-tr')]//div[contains(@role,'gridcell')][normalize-space()='"+VehiclesAdvanceDetails.get("vehicles_sensor_number").toString()+"']"));
		DoThis.click(ExistingSensor, "N");
		
		//Sensor Number
		DoThis.WaitForElementToLoad(ListPage.Vehiclestab.SensorNumberfld);
		DoThis.clear(browser, ListPage.Vehiclestab.SensorNumberfld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorNumberfld, VehiclesAdvanceDetails.get("new_vehicles_sensor_number").toString(), "Y");
		
		//Sensor Name
		DoThis.clear(browser, ListPage.Vehiclestab.SensorNamefld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorNamefld, VehiclesAdvanceDetails.get("new_vehicles_sensor_name").toString(), "Y");
		
		//Sensor Type
		DoThis.click(ListPage.Vehiclestab.SensorTypeDL, "Y");
		WebElement SensorType = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesAdvanceDetails.get("new_vehicles_sensor_type").toString()+"')]"));
		DoThis.click(SensorType, "Y");
		
		//Sensor Priority
		DoThis.click(ListPage.Vehiclestab.SensorPriorityDL, "Y");
		switch (activesite) {
		
		case "PT":
		case "ES":
		case "FR":
			//Translate options based on PT Language
			String vehicles_sensor_priority = null;
			switch (VehiclesAdvanceDetails.get("vehicles_sensor_priority").toString()) {
			
			case "CRITICAL":
				vehicles_sensor_priority = "Critica";
			break;
			
			case "HIGH":
				vehicles_sensor_priority = "Alta";
			break;
				
			case "LOW":
				vehicles_sensor_priority = "Baixa";
			break;
			}
			
			WebElement SensorPriority = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+vehicles_sensor_priority.toString()+"')]"));
			DoThis.click(SensorPriority, "Y");
		break;
		
		default:
			SensorPriority = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesAdvanceDetails.get("vehicles_sensor_priority").toString()+"')]"));
			DoThis.click(SensorPriority, "Y");
		break;
		}
				
		//Sensor Activity Level
		DoThis.click(ListPage.Vehiclestab.SensorActivityLevelDL, "Y");
		WebElement SensorActivityLevel = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesAdvanceDetails.get("new_vehicles_sensor_activitylevel").toString()+"')]"));
		DoThis.click(SensorActivityLevel, "Y");
		
		//Sensor Min Trigger
		DoThis.clear(browser, ListPage.Vehiclestab.SensorMinTriggerfld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorMinTriggerfld, VehiclesAdvanceDetails.get("new_vehicles_sensor_mintrigger").toString(), "Y");
		
		//Sensor Max Trigger
		DoThis.clear(browser, ListPage.Vehiclestab.SensorMaxTriggerfld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorMaxTriggerfld, VehiclesAdvanceDetails.get("new_vehicles_sensor_maxtrigger").toString(), "Y");
		
		//Sensor Multiplier
		DoThis.clear(browser, ListPage.Vehiclestab.SensorMultiplierfld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorMultiplierfld, VehiclesAdvanceDetails.get("new_vehicles_sensor_mutiplier").toString(), "Y");
		
		//Sensor Analog Offset
		DoThis.clear(browser, ListPage.Vehiclestab.SensorAnalogOffsetfld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.SensorAnalogOffsetfld, VehiclesAdvanceDetails.get("new_vehicles_sensor_analogoffset").toString(), "Y");
		
		//Click Save button
		DoThis.click(ListPage.Vehiclestab.SensorSavebtn, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Sensor successfully updated.");
			}
	}
	
	public static void DeleteSensor(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesAdvanceDetails) throws InterruptedException {

		//Click existing sensor
		WebElement ExistingSensor = Constant.driver.findElement(By.xpath("//div[contains(@class,'rt-tr')]//div[contains(@role,'gridcell')][normalize-space()='"+VehiclesAdvanceDetails.get("vehicles_sensor_number").toString()+"']"));
		DoThis.click(ExistingSensor, "N");
		
		//Click Remove button
		DoThis.click(ListPage.Vehiclestab.SensorRemovebtn, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Sensor successfully removed");
			}
	}	
	
	public static void AddDynamicBit(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesAdvanceDetails) throws InterruptedException {

		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Search Vehicles
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesAdvanceDetails.get("vehicles_name").toString(), "Y");
		
		//Click First Row in Vehicles Table
		DoThis.click(ListPage.VehiclesPage.objVehiclesFirstRow, "Y");
		
		//Advance Settings
		Vehicles.ViewVehicleAdvanceSettings(browser);
		
		//Edit Sensor Data
		Vehicles.EditSensorData(browser);
		
		//Wait for Element to load
		DoThis.WaitForElementToLoad(ListPage.Vehiclestab.AddNewDynamicBitbtn);
		
		//Click Add Dynamic Bit
		DoThis.click(ListPage.Vehiclestab.AddNewDynamicBitbtn, "N");
				
		//Dynamic Bit Position
		DoThis.click(ListPage.Vehiclestab.BitPositionDL, "Y");
		WebElement DynamicBitPosition = Constant.driver.findElement(By.xpath("//div[contains(@id,'downshift')]//*[contains(text(),'"+VehiclesAdvanceDetails.get("vehicles_bit_position").toString()+"')]"));
		DoThis.click(DynamicBitPosition, "Y");
		
		//Sensor Type
		DoThis.click(ListPage.Vehiclestab.DynamicSensorTypeDL, "Y");
		WebElement DynamicSensorType = Constant.driver.findElement(By.xpath("//*[contains(@id,'item')][contains(text(),'"+VehiclesAdvanceDetails.get("vehicles_sensor_type").toString()+"')]"));
		DoThis.click(DynamicSensorType, "Y");
		
		//Dynamic Bit Type
		DoThis.click(ListPage.Vehiclestab.DynamicBitTypeDL, "Y");
		WebElement DynamicBitType = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesAdvanceDetails.get("vehicles_bit_type").toString()+"')]"));
		DoThis.click(DynamicBitType, "Y");

		
		//Click Save button
		DoThis.click(ListPage.Vehiclestab.DynamicBitSavebtn, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Dynamic bit successfully added.");
			}
	}
	
	public static void EditDynamicBit(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesAdvanceDetails) throws InterruptedException {

		//Click Existing Dynamic Bit
		WebElement ExistingDynamicBit = Constant.driver.findElement(By.xpath("//div[contains(@class,'rt-tr')]//div[contains(@role,'gridcell')][normalize-space()='"+VehiclesAdvanceDetails.get("vehicles_bit_position").toString()+"']"));
		DoThis.click(ExistingDynamicBit, "N");
		
		//Sensor Type
		DoThis.click(ListPage.Vehiclestab.DynamicSensorTypeDL, "Y");		
		WebElement DynamicSensorType = Constant.driver.findElement(By.xpath("//*[contains(@id,'item')][contains(text(),'"+VehiclesAdvanceDetails.get("new_vehicles_sensor_type").toString()+"')]"));
		DoThis.click(DynamicSensorType, "Y");
		
		//Dynamic Bit Type
		DoThis.click(ListPage.Vehiclestab.DynamicBitTypeDL, "Y");
		WebElement DynamicBitType = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+VehiclesAdvanceDetails.get("new_vehicles_bit_type").toString()+"')]"));
		DoThis.click(DynamicBitType, "Y");

		
		//Click Save button
		DoThis.click(ListPage.Vehiclestab.DynamicBitSavebtn, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Dynamic bit successfully added.");
			}
	}
	
	public static void DeleteDynamicBit(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesAdvanceDetails) throws InterruptedException {

		//Click Existing Dynamic Bit
		WebElement ExistingDynamicBit = Constant.driver.findElement(By.xpath("//div[contains(@class,'rt-tr')]//div[contains(@role,'gridcell')][normalize-space()='"+VehiclesAdvanceDetails.get("vehicles_bit_position").toString()+"']"));
		DoThis.click(ExistingDynamicBit, "N");
		
		//Click Remove button
		DoThis.click(ListPage.Vehiclestab.SensorRemovebtn, "Y");
		
		//Wait for toaster message to displayed
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage("Dynamic Bit was successfully deleted");
			}
	}	
	
	public static void LinkTrailertoVehicle(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Search Vehicles
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesDetails.get("vehicles_name").toString(), "Y");
		
		//Click First Row in Vehicles Table
		DoThis.click(ListPage.VehiclesPage.objVehiclesFirstRow, "Y");
		
		//Wait for Edit Vehicle Button to displayed
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.btnEditVehicle);
		
		//Click Edit Vehicle Button
		DoThis.click(ListPage.VehiclesPage.btnEditVehicle, "Y");
		
		//Search for the Trailer Registration
		DoThis.clear(browser, ListPage.Vehiclestab.TrailerRegSearchFld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.TrailerRegSearchFld, VehiclesDetails.get("trailer_registration").toString(), "Y");
		
		//Search for the Trailer Description
		DoThis.clear(browser, ListPage.Vehiclestab.TrailerDescSearchFld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.TrailerDescSearchFld, VehiclesDetails.get("trailer_description").toString(), "Y");
		
		//Select the Vehicle
		DoThis.click(ListPage.VehiclesPage.chckbxFirstVehicleOption, "Y");
		
		//Click Save button
		DoThis.click(ListPage.VehiclesPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Vehicle successfully updated.");
			}
	}	
	
	public static void UnlinkSelectedTrailer(String browser, @SuppressWarnings("rawtypes") Dictionary VehiclesDetails) throws IOException, Exception{
			
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
			
		//Search Vehicles
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, VehiclesDetails.get("vehicles_name").toString(), "Y");
			
		//Click First Row in Vehicles Table
		DoThis.click(ListPage.VehiclesPage.objVehiclesFirstRow, "Y");
			
		//Wait for Edit Vehicle Button to displayed
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.btnEditVehicle);
			
		//Click Edit Vehicle Button
		DoThis.click(ListPage.VehiclesPage.btnEditVehicle, "Y");
			
		//Search for the Trailer Registration
		DoThis.clear(browser, ListPage.Vehiclestab.TrailerRegSearchFld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.TrailerRegSearchFld, VehiclesDetails.get("trailer_registration").toString(), "Y");
			
		//Search for the Trailer Description
		DoThis.clear(browser, ListPage.Vehiclestab.TrailerDescSearchFld, "N");
		DoThis.sendkeys(ListPage.Vehiclestab.TrailerDescSearchFld, VehiclesDetails.get("trailer_description").toString(), "Y");
			
		//Select the Vehicle
		DoThis.click(ListPage.VehiclesPage.chckbxFirstVehicleOption, "Y");
			
		//Click Save button
		DoThis.click(ListPage.Vehiclestab.UnlinkTrailersBtn, "Y");
			
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Vehicle successfully updated.");
			}	
		
	}
	
	
}
