package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import pageObject.ListPage;
import pageObject.SettingsPage;
import utility.DoThis;

public class ImportData{	
	
	public static void Execute(String browser, @SuppressWarnings("rawtypes") Dictionary ImportDataDetails, boolean viaList) throws IOException, Exception{
		
		if(viaList==true) {
			
			switch(ImportDataDetails.get("import_type").toString()) {
			case "Import Geofences":
			case "Import Geofences (With Group)":
			case "Import Geofences Polygon":
				DoThis.click(ListPage.nvTabList, "Y");
				if(!DoThis.isObjectAvailable(ListPage.GeofencesPage.nvTabGeofences, "Geofences tab", "NA")) {
					DoThis.click(ListPage.GeofencesPage.nvTabGeofence, "Y");
				}else {
					DoThis.click(ListPage.GeofencesPage.nvTabGeofences, "Y");
				}
				
				//Wait for element to load
				DoThis.WaitForElementToLoad(ListPage.GeofencesPage.btnImportGeofences);
				
				//Click Import Geofences button
				DoThis.click(ListPage.GeofencesPage.btnImportGeofences, "Y");
			break;
			case "Import POI":
				DoThis.click(ListPage.nvTabList, "Y");
				if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
					DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
				}else {
					DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
				}
				
				//Wait for element to load
				DoThis.WaitForElementToLoad(ListPage.POIPage.btnImportsPointsOfInterest);
				
				//Click Import POI button
				DoThis.click(ListPage.POIPage.btnImportsPointsOfInterest, "Y");
			break;
				
			}
			
			
		}else {
			
			//Navigate to Settings >> Import Data page
			DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
			DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
			DoThis.click(SettingsPage.ImportsDataTab.nvBarImportData, "Y");
		}
			
	
		//Set Category
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategory, "Y");
		switch(ImportDataDetails.get("category").toString()) {
		
		case "Action/Merge":
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategoryOptionActionsMerge, "Y");
		break;
		
		case "Importers":
		//Wait for Element to load
		while(!DoThis.isObjectAvailable(SettingsPage.ImportsDataTab.drpdwnCategoryOptionImporters, "Importers Category Options", "N")) {
			DoThis.WaitForElementToLoad(SettingsPage.ImportsDataTab.drpdwnCategoryOptionImporters);
		}
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategoryOptionImporters, "Y");
		break;
		
		case "MiFleet":
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategoryOptionMiFleet, "Y");
		break;
		
		}
		
		//Set Import Type
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportType, "Y");
		
		switch(ImportDataDetails.get("import_type").toString()) {
		
		case "Import Driver":
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportDriver, "Y");
		break;
		
		case "Import Geofences":
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportGeofences, "Y");
		break;
		
		case "Import Geofences (With Group)":
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportGeofencesWithGroup, "Y");
		break;
		
		case "Import Geofences Polygon":
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportGeofencesPolygon, "Y");
		break;
		
		case "Import POI":
		if(!DoThis.isObjectAvailable(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportPOI, "Import POI selection", "NA")) {
			DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportLandmark, "Y");
		}else {
			DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportPOI, "Y");
		}
		break;
		
		case "Import Vehicles to Groups":
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportVehiclestoGroups, "Y");
		break;
	
		}
		
		//Upload File
		DoThis.uploadFile(browser, SettingsPage.ImportsDataTab.btnUploadFile, ImportDataDetails.get("file_name").toString(), "Y");
		
		//Click Next in Upload File page
		DoThis.click(SettingsPage.ImportsDataTab.btnNext, "Y");
		
		//Click Next in Match Found Fields page
		DoThis.click(SettingsPage.ImportsDataTab.btnNext, "Y");
		
		//Click Next in Review page
		DoThis.click(SettingsPage.ImportsDataTab.btnNext, "Y");
		
	}
	
	public static void UpdateDriverImportFileXLS(@SuppressWarnings("rawtypes") Dictionary ImportDataDetails) throws IOException, Exception{
		
		//Update Driver Name in 3 rows
		for (int row = 1; row<4; row++) {
			int col = 0;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("driver_first_name").toString()+row, ImportDataDetails.get("file_name").toString());
		}
		
		//Update Driver Last Name in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 1;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("driver_last_name").toString()+row, ImportDataDetails.get("file_name").toString());
		}
		
		//Update Driver Phone in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 2;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("driver_phone").toString()+DoThis.Random4Digit()+row, ImportDataDetails.get("file_name").toString());
		}
		
		//Update Driver Email Address in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 3;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("driver_email").toString(), ImportDataDetails.get("file_name").toString());
		}
		
		//Update Driver License No in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 6;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("driver_license_no").toString()+row, ImportDataDetails.get("file_name").toString());
		}
		
		//Update Driver License Country in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 7;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("driver_license_country").toString(), ImportDataDetails.get("file_name").toString());
		}
		
		//Update Driver Tag ID in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 13;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("driver_tag_id").toString()+row, ImportDataDetails.get("file_name").toString());
		}
	}

	
	public static void UpdatePOIImportFile(@SuppressWarnings("rawtypes") Dictionary ImportDataDetails) throws IOException, Exception{
		
		//Update POI Name in 3 rows
		for (int row = 1; row<4; row++) {
			int col = 0;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("poi_name").toString()+row, ImportDataDetails.get("file_name").toString());
		}
		
		//Update POI Description in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 1;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("poi_description").toString()+row, ImportDataDetails.get("file_name").toString());
		}
	}
	
	public static void UpdateGeofencesImportFile(@SuppressWarnings("rawtypes") Dictionary ImportDataDetails) throws IOException, Exception{
		
		//Update Geofences Name in 3 rows
		for (int row = 1; row<4; row++) {
			int col = 0;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("geofences_name").toString()+row, ImportDataDetails.get("file_name").toString());
		}
		
		//Update Geofences Description in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 1;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("geofences_description").toString()+row, ImportDataDetails.get("file_name").toString());
		}
	}
		
	public static void UpdateGeofenceImportWithGroupFile(@SuppressWarnings("rawtypes") Dictionary ImportDataDetails) throws IOException, Exception{
		
		//Update Geofences Name in 3 rows
		for (int row = 1; row<4; row++) {
			int col = 0;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("geofences_name").toString()+row, ImportDataDetails.get("file_name").toString());
		}
		
		//Update Geofences Description in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 1;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("geofences_description").toString()+row, ImportDataDetails.get("file_name").toString());
		}
		
		//Update Group Name in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 6;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("group_name").toString(), ImportDataDetails.get("file_name").toString());
		}
		
		//Update Group Description in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 7;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("group_description").toString(), ImportDataDetails.get("file_name").toString());
		}
	}
	
	public static void UpdateGeofencePolygonImportFile(@SuppressWarnings("rawtypes") Dictionary ImportDataDetails) throws IOException, Exception{
		
		//Update Geofences Name in 3 rows
		for (int row = 1; row<4; row++) {
			int col = 0;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("geofences_name").toString()+row, ImportDataDetails.get("file_name").toString());
		}
		
		//Update Geofences Description in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 1;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("geofences_description").toString()+row, ImportDataDetails.get("file_name").toString());
		}
		
		//Update Group Name in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 3;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("group_name").toString(), ImportDataDetails.get("file_name").toString());
		}
		
		//Update Group Description in 3 rows
		for(int row = 1; row<4; row++) {
			int col = 4;
			DoThis.writeXLSFile(row, col, ImportDataDetails.get("group_description").toString(), ImportDataDetails.get("file_name").toString());
		}
	}
	
	public static void UpdateVehiclesToGroupImportFile(@SuppressWarnings("rawtypes") Dictionary ImportDataDetails) throws IOException, Exception{
		
		//Update Registration in 1 row
		DoThis.writeXLSFile(1, 0, ImportDataDetails.get("registration").toString(), ImportDataDetails.get("file_name").toString());
		
		
		//Update Vehicle Group Name in 1 row
		DoThis.writeXLSFile(1, 1, ImportDataDetails.get("vehicle_group_name").toString(), ImportDataDetails.get("file_name").toString());
		
	}
	
}
