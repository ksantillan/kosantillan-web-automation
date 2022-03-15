package actionModule;

import static org.testng.Assert.assertTrue;
import java.util.Dictionary;
import pageObject.ListPage;
import pageObject.SettingsPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class POI{	
	
	
	public static void SearchPOI(String browser, @SuppressWarnings("rawtypes") Dictionary POIDetails) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.txtbxSearch);
		DoThis.clear(browser, ListPage.POIPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxSearch, POIDetails.get("POI_name").toString(), "Y");
		
	}
	public static void SelectPOI(@SuppressWarnings("rawtypes") Dictionary POIDetails) throws InterruptedException {
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.objCogWheels);
		WebElement POI = Constant.driver.findElement(By.xpath("//div[text()='"+POIDetails.get("POI_name")+"']/ancestor::div[@role='row']"));
		DoThis.click(POI, "Y");
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.objPOIName);
	
	}
	
	public static void CreatePOI(String browser, @SuppressWarnings("rawtypes") Dictionary POIDetails) throws InterruptedException {
		
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		//Click Add POI button
		DoThis.click(ListPage.POIPage.btnAddPointofInterest, "Y");
		
		//Location Search
		DoThis.clear(browser, ListPage.POIPage.txtbxLocationSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxLocationSearch, POIDetails.get("poi_location").toString(), "Y");
		
		//Select Location Search
		WebElement LocationLocator = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+POIDetails.get("poi_location").toString()+"')]/parent::div[contains(@id,'item')]"));
		DoThis.click(LocationLocator, "Y");
		
		//Name
		DoThis.clear(browser, ListPage.POIPage.txtbxName, "Y");
		DoThis.sendkeys(ListPage.POIPage.txtbxName, POIDetails.get("poi_name").toString(), "Y");
				
		//Description
		DoThis.clear(browser, ListPage.POIPage.txtbxDescription, "Y");
		DoThis.sendkeys(ListPage.POIPage.txtbxDescription, POIDetails.get("poi_description").toString(), "Y");
		
		//POI Marker - Select first Circle Picker
		DoThis.click(ListPage.POIPage.objCirclePicker.get(0), "Y");
		
		//Raidus
		DoThis.clear(browser, ListPage.POIPage.txtbxRadius, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxRadius, POIDetails.get("poi_radius").toString(), "Y");
		
		//Click Save button
		DoThis.click(ListPage.POIPage.btnSave, "Y");
		
		//Wait for toaster to load
		DoThis.WaitForToasterMessageToLoad(ListPage.POIPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.POIPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(POIDetails.get("poi_name").toString()+" was successfully created toaster message is displayed");
		}
	
	}
	
	public static void SelectAndEditPOI(String browser, @SuppressWarnings("rawtypes") Dictionary POIDetails) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.txtbxSearch);
		DoThis.clear(browser, ListPage.POIPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxSearch, POIDetails.get("poi_name").toString(), "Y");
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.objCogWheels);
		WebElement POI = Constant.driver.findElement(By.xpath("//div[text()='"+POIDetails.get("poi_name")+"']/ancestor::div[@role='row']"));
		DoThis.click(POI, "Y");
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.objPOIName);
		
		//Click Edit POI
		if(!DoThis.isObjectAvailable(ListPage.POIPage.btnEditPOI, "Edit POI", "NA")) {
			DoThis.click(ListPage.POIPage.btnEditLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.btnEditPOI, "Y");
		}
			
	}
	
	public static void ImportPOIDownloadTemplate() throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		//Click Import Points of Interest
		DoThis.click(ListPage.POIPage.btnImportsPointsOfInterest, "Y");
		
		//Category = Importers
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategory, "Y");
		DoThis.WaitForElementToLoad(SettingsPage.ImportsDataTab.drpdwnCategoryOptionImporters);
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategoryOptionImporters, "Y");
		
		//Import Type = Import POI
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportType, "Y");
		if(!DoThis.isObjectAvailable(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportPOI, "Import POI selection", "NA")) {
			DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportLandmark, "Y");
		}else {
			DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportPOI, "Y");
		}
		
		//Click Download Template
		DoThis.click(SettingsPage.ImportsDataTab.btnDownloadTemplate, "Y");
	
	}
	
	public static void EditMultiplePOI(String browser, @SuppressWarnings("rawtypes") Dictionary POIDetails, String activesite) throws InterruptedException {
		
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		//Search POI
		DoThis.WaitForElementToLoad(ListPage.POIPage.txtbxSearch);
		DoThis.clear(browser, ListPage.POIPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxSearch, POIDetails.get("poi_name").toString(), "Y");
		
		int intPOICount=0;
		if(!DoThis.isObjectAvailable(ListPage.POIPage.objPointsofInterestTotalCount, "Point of Interest Count", "NA")) {
			String POICount = DoThis.getText(ListPage.POIPage.objLandmarksTotalCount);
			intPOICount=Integer.parseInt(POICount);  
		}else {
			String POICount = DoThis.getText(ListPage.POIPage.objPointsofInterestTotalCount);
			intPOICount=Integer.parseInt(POICount);  
		}
		
		//If search results is more than 25 count, page size will be set to 100
		if(intPOICount > 25) {
			DoThis.selectByValue(ListPage.POIPage.objPagination, "100", "Y");
			
		}

		//Click Edit Multiple button
		DoThis.click(ListPage.POIPage.btnEditMultiple, "Y");
		
		//Select First Option in Colour
		if(!DoThis.isObjectAvailable(ListPage.POIPage.drpdwnColour, "Colour dropdown", "NA")) {
			DoThis.click(ListPage.POIPage.drpdwnColor, "Y");
		}else {
			DoThis.click(ListPage.POIPage.drpdwnColour, "Y");
		}
		DoThis.click(ListPage.POIPage.drpdwnColourFirstOption.get(0), "Y");
		
		//Get Colour value selected
		String Colour = null;
		if(!DoThis.isObjectAvailable(ListPage.POIPage.drpdwnColour, "Colour dropdown", "NA")) {
			Colour = DoThis.getAttribute(ListPage.POIPage.drpdwnColor, "value");
		}else {
			Colour = DoThis.getAttribute(ListPage.POIPage.drpdwnColour, "value");
		}
		
		
		//Update POI Description
		DoThis.clear(browser, ListPage.POIPage.txtbxEditMultipleDescription, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxEditMultipleDescription, POIDetails.get("updated_description").toString(), "Y");
		
		//Click All checkbox
		DoThis.click(ListPage.POIPage.chckbxAll, "Y");
		
		//Click Save button
		DoThis.click(ListPage.POIPage.btnSave, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.POIPage.objToasterMessage);
		if(DoThis.isObjectAvailable(ListPage.POIPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage("Edit Successful toaster message is displayed");
		}
		
		//Validate POI's Colour and Description matched
		for (int i = 1; i<intPOICount; i++) {;
			String Username = DoThis.getOwnerName(activesite);
			java.util.List<WebElement> DescriptionLocator = Constant.driver.findElements(By.xpath("//div[contains(@class,'rt-tr')]/following::div[text()='"+Username+"']/following::div[2]"));
			java.util.List<WebElement> ColourLocator = Constant.driver.findElements(By.xpath("//div[contains(@class,'rt-tr')]/following::div[text()='"+Username+"']/following::div[4]/following::span[1]"));
			
			if(!DoThis.isContainingText(DescriptionLocator.get(i), POIDetails.get("updated_description").toString(), "POI's Description validation", "Y")){assertTrue(false);}
			if(!DoThis.isContainingText(ColourLocator.get(i),Colour , "POI's Colour validation", "Y")){assertTrue(false);}
		}
			
	}
	
	public static void DeleteMultiplePOI(String browser, @SuppressWarnings("rawtypes") Dictionary POIDetails) throws InterruptedException {
		
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		//Search POI
		DoThis.WaitForElementToLoad(ListPage.POIPage.txtbxSearch);
		DoThis.clear(browser, ListPage.POIPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxSearch, POIDetails.get("poi_name").toString(), "Y");
		
		int intPOICount=0;
		if(!DoThis.isObjectAvailable(ListPage.POIPage.objPointsofInterestTotalCount, "Point of Interest Count", "NA")) {
			String POICount = DoThis.getText(ListPage.POIPage.objLandmarksTotalCount);
			intPOICount=Integer.parseInt(POICount);  
		}else {
			String POICount = DoThis.getText(ListPage.POIPage.objPointsofInterestTotalCount);
			intPOICount=Integer.parseInt(POICount);  
		}
		
		//If search results is more than 25 count, page size will be set to 100
		if(intPOICount > 25) {
			DoThis.selectByValue(ListPage.POIPage.objPagination, "100", "Y");
			
		}
		
		//Click Edit Multiple button
		DoThis.click(ListPage.POIPage.btnEditMultiple, "Y");
		
		//Click All checkbox
		DoThis.click(ListPage.POIPage.chckbxAll, "Y");
		
		//Click Delete Selected 
		DoThis.click(ListPage.POIPage.btnDeleteSelected, "Y");
		
		//Click Yes Delete 
		DoThis.click(ListPage.POIPage.btnYesDelete, "Y");
		
		//Wait for toaster message to load 
		DoThis.WaitForToasterMessageToLoad(ListPage.POIPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.POIPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage("POI were successfully deleted. toaster message is displayed");
		}
		
		//Validate No data available is displayed after deleting All POI Automation
		
		//Search POI
		DoThis.WaitForElementToLoad(ListPage.POIPage.txtbxSearch);
		DoThis.clear(browser, ListPage.POIPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxSearch, POIDetails.get("poi_name").toString(), "Y");
		
		if(!DoThis.isObjectDisplayed(ListPage.POIPage.objNodataavailable, "No data available validation", "Y")){assertTrue(false);}
	
	}
	
	public static void EditSinglePOI(String browser, @SuppressWarnings("rawtypes") Dictionary POIDetails) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.txtbxSearch);
		DoThis.clear(browser, ListPage.POIPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxSearch, POIDetails.get("poi_name").toString(), "Y");
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.objCogWheels);
		WebElement POI = Constant.driver.findElement(By.xpath("//div[text()='"+POIDetails.get("poi_name")+"']/ancestor::div[@role='row']"));
		DoThis.click(POI, "Y");
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.objPOIName);
		
		//Click Edit POI
		if(!DoThis.isObjectAvailable(ListPage.POIPage.btnEditPOI, "Edit POI", "NA")) {
			DoThis.click(ListPage.POIPage.btnEditLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.btnEditPOI, "Y");
		}
		
		//Update Name
		DoThis.clear(browser, ListPage.POIPage.txtbxName, "Y");
		DoThis.sendkeys(ListPage.POIPage.txtbxName, POIDetails.get("updated_poi_name").toString(), "Y");
				
		//Update Description
		DoThis.clear(browser, ListPage.POIPage.txtbxDescription, "Y");
		DoThis.sendkeys(ListPage.POIPage.txtbxDescription, POIDetails.get("updated_poi_description").toString(), "Y");
		
		//POI Marker - Select second Circle Picker
		DoThis.click(ListPage.POIPage.objCirclePicker.get(1), "Y");
		
		//Raidus
		DoThis.clear(browser, ListPage.POIPage.txtbxRadius, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxRadius, POIDetails.get("updated_poi_radius").toString(), "Y");
		
		//Click Save button
		DoThis.click(ListPage.POIPage.btnSave, "Y");
		
		DoThis.WaitForToasterMessageToLoad(ListPage.POIPage.objToasterMessage);
		if(DoThis.isObjectAvailable(ListPage.POIPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(POIDetails.get("poi_name").toString()+" was successfully updated toaster message is displayed");
		}
		
	}
	
	public static void SearchEditedSinglePOI(String browser, @SuppressWarnings("rawtypes") Dictionary POIDetails) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.txtbxSearch);
		DoThis.clear(browser, ListPage.POIPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxSearch, POIDetails.get("updated_poi_name").toString(), "Y");
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.objCogWheels);
	

	}
	
	public static void DeleteSinglePOI(String browser, @SuppressWarnings("rawtypes") Dictionary POIDetails) throws InterruptedException {
		
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.txtbxSearch);
		DoThis.clear(browser, ListPage.POIPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxSearch, POIDetails.get("updated_poi_name").toString(), "Y");
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.objCogWheels);
		
		WebElement POILocator = Constant.driver.findElement(By.xpath("//div[text()='"+POIDetails.get("updated_poi_name")+"']/ancestor::div[@role='row']"));
		DoThis.click(POILocator, "Y");
		
		//Click Edit POI
		if(!DoThis.isObjectAvailable(ListPage.POIPage.btnEditPOI, "Edit POI", "NA")) {
			DoThis.click(ListPage.POIPage.btnEditLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.btnEditPOI, "Y");
		}
	
		//Wait for element to load
		DoThis.WaitForElementToLoad(ListPage.POIPage.btnDelete);
		
		//Click Delete button
		DoThis.click(ListPage.POIPage.btnDelete, "Y");
		
		//Click Yes Delete button
		DoThis.click(ListPage.POIPage.btnYesDelete, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.POIPage.objToasterMessage);
		
		if(DoThis.isObjectAvailable(ListPage.POIPage.objToasterMessage, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(POIDetails.get("poi_name").toString()+" was successfully deleted toaster message is displayed");
		}
		
	}
	
	public static void SearchDeletedSinglePOI(String browser, @SuppressWarnings("rawtypes") Dictionary POIDetails) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.txtbxSearch);
		DoThis.clear(browser, ListPage.POIPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxSearch, POIDetails.get("updated_poi_name").toString(), "Y");
		
	}
	
}
