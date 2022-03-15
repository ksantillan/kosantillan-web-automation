package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import java.util.List;

import pageObject.ListPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Trailers{	
	
	
	public static void SearchTrailer(String browser, @SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		if(!DoThis.isObjectAvailable(ListPage.POIPage.nvTabPointOfInterest, "Point of Interest tab", "NA")) {
			DoThis.click(ListPage.POIPage.nvTabLandmark, "Y");
		}else {
			DoThis.click(ListPage.POIPage.nvTabPointOfInterest, "Y");
		}
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.txtbxSearch);
		DoThis.clear(browser, ListPage.POIPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.POIPage.txtbxSearch, TrailerDetails.get("Trailer_name").toString(), "Y");
		
	}
	public static void SelectTrailer(@SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws InterruptedException {
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.objCogWheels);
		WebElement Trailer = Constant.driver.findElement(By.xpath("//div[text()='"+TrailerDetails.get("Trailer_name")+"']/ancestor::div[@role='row']"));
		DoThis.click(Trailer, "Y");
		
		DoThis.WaitForElementToLoad(ListPage.POIPage.objPOIName);
	
	}
	
	public static void AddTrailer(String browser, @SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws InterruptedException {
		
		
		//Click to Navigate to List Page
		DoThis.click(ListPage.navList, "Y");
		
		//Click Point of Interest tab
		DoThis.click(ListPage.Trailerstab.Trailerstab, "Y");
		
		//Click Point of Interest tab
		DoThis.click(ListPage.Trailerstab.AddTrailerBtn, "Y");
				
		//Validate following is display: POI Name, Owner, Address, Description, Colour, and Radius
		DoThis.clear(browser, ListPage.Trailerstab.TrailersRegNameFld, "N");
		DoThis.sendkeys(ListPage.Trailerstab.TrailersRegNameFld, TrailerDetails.get("Trailer_name").toString(), "Y");
		
		DoThis.clear(browser, ListPage.Trailerstab.TrailersDescriptionFld, "N");
		DoThis.sendkeys(ListPage.Trailerstab.TrailersDescriptionFld, TrailerDetails.get("Trailer_description").toString(), "Y");
		DoThis.click(ListPage.Trailerstab.TrailersSaveBtn, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.ToastSuccessMsg, "Toaster Message", "NA")) {
			DoThis.isContainingText(ListPage.ToastSuccessMsg, "Trailer created successfully.", "Toaster message validation for added dynamic bit", "Y");
		}
	
	}
	
	public static void AddTrailers (String browser, @SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws InterruptedException {
		
		//Navigate to List >>> Trailers
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.TrailersPage.nvTabTrailers, "Y");
		
		//Wait for Add Trailer button
		DoThis.WaitForElementToLoad(ListPage.TrailersPage.btnAddTrailer);
		
		//Click Add Trailer
		DoThis.click(ListPage.TrailersPage.btnAddTrailer, "Y");
		
		//Fill up Registration
		DoThis.clear(browser, ListPage.TrailersPage.txtbxRegistration, "N");
		DoThis.sendkeys(ListPage.TrailersPage.txtbxRegistration, TrailerDetails.get("trailer_registration").toString(), "Y");
		
		//Fill up Description
		DoThis.clear(browser, ListPage.TrailersPage.txtbxDescription, "N");
		DoThis.sendkeys(ListPage.TrailersPage.txtbxDescription, TrailerDetails.get("trailer_description").toString(), "Y");
		
		//Save
		DoThis.click(ListPage.TrailersPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.TrailersPage.objToaster, "Toaster message", "NA")) {
			Reporter.ReportEventNoImage("Toaster message Trailer created successfully. is displayed");
		}
		
	}
	
	public static void SearchTrailers (String browser, @SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws InterruptedException {
		
		//Navigate to List >>> Trailers
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.TrailersPage.nvTabTrailers, "Y");
		
		//Wait for Trailers data
		DoThis.WaitForElementToLoad(ListPage.TrailersPage.btnOptions);
		
		//Search Trailer
		DoThis.clear(browser, ListPage.TrailersPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.TrailersPage.txtbxSearch, TrailerDetails.get("trailer_registration").toString(), "Y");
		
		
	}
	
	public static void SearchAndEditTrailers (String browser, @SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws InterruptedException {
		
		//Navigate to List >>> Trailers
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.TrailersPage.nvTabTrailers, "Y");
		
		//Wait for Trailers data
		DoThis.WaitForElementToLoad(ListPage.TrailersPage.btnOptions);
		
		//Search Trailer
		DoThis.clear(browser, ListPage.TrailersPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.TrailersPage.txtbxSearch, TrailerDetails.get("trailer_registration").toString(), "Y");
		
		WebElement TrailerLocator = Constant.driver.findElement(By.xpath("//div[@class='rt-td'][text()='"+TrailerDetails.get("trailer_registration").toString()+"']/following::div[@class='rt-td'][text()='"+TrailerDetails.get("trailer_description").toString()+"']"));
		DoThis.click(TrailerLocator, "Y");
		
		//Update Trailers Registration
		DoThis.clear(browser, ListPage.TrailersPage.txtbxRegistration, "N");
		DoThis.sendkeys(ListPage.TrailersPage.txtbxRegistration, TrailerDetails.get("updated_trailer_registration").toString(), "Y");
		
		//Update Trailers Description
		DoThis.clear(browser, ListPage.TrailersPage.txtbxDescription, "N");
		DoThis.sendkeys(ListPage.TrailersPage.txtbxDescription, TrailerDetails.get("updated_trailer_description").toString(), "Y");
		
		//Save
		DoThis.click(ListPage.TrailersPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.TrailersPage.objToaster, "Toaster message", "NA")) {
			Reporter.ReportEventNoImage("Toaster message Trailer updated successfully is displayed");
		}
		
	}
	
	public static void SearchUpdatedTrailers (String browser, @SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws InterruptedException {
		
		//Navigate to List >>> Trailers
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.TrailersPage.nvTabTrailers, "Y");
		
		//Wait for Trailers data
		DoThis.WaitForElementToLoad(ListPage.TrailersPage.btnOptions);
		
		//Search Trailer
		DoThis.clear(browser, ListPage.TrailersPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.TrailersPage.txtbxSearch, TrailerDetails.get("updated_trailer_registration").toString(), "Y");
		
		
	}
	
	public static void DeleteTrailersCreatedByAutomation (String browser, @SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws InterruptedException {
		
		//Navigate to List >>> Trailers
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.TrailersPage.nvTabTrailers, "Y");
		
		//Wait for Trailers data
		DoThis.WaitForElementToLoad(ListPage.TrailersPage.btnOptions);
		
		//Search Trailer
		DoThis.clear(browser, ListPage.TrailersPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.TrailersPage.txtbxSearch, TrailerDetails.get("search_keyword").toString(), "Y");
		
		//Set to 100 rows if page size is displayed
		if(DoThis.isObjectAvailable(ListPage.TrailersPage.objPageSize, "Page Size object", "NA")) {
			DoThis.selectByValue(ListPage.TrailersPage.objPageSize, "100", "Y");
		}
		
		if(DoThis.isObjectAvailable(ListPage.TrailersPage.objNoDataAvailable, "No data available", "NA")) {
			Reporter.ReportEventNoImage("No Trailers created by Automation");
		}else {
			//Get Trailers Count created by Automation
			List<WebElement> TrailerLocator = Constant.driver.findElements(By.xpath("//div[@class='rt-tr-group']/descendant::div[contains(text(),'"+TrailerDetails.get("search_keyword").toString()+"')]"));
			int TrailerCount = TrailerLocator.size();
			TrailerCount = TrailerCount / 2;
			Reporter.ReportEventNoImage(TrailerCount+" Total counts of Trailers created by Automation will be deleted");
		
			//Delete All Trailers created by Automation
			for (int i = 0; i<TrailerCount; i++ ) {
				//Search Trailer
				DoThis.clear(browser, ListPage.TrailersPage.txtbxSearch, "N");
				DoThis.sendkeys(ListPage.TrailersPage.txtbxSearch, TrailerDetails.get("search_keyword").toString(), "Y");
				
				DoThis.click(ListPage.TrailersPage.objTrailer, "Y");
				
				//Click Delete Trailers
				DoThis.WaitForElementToLoad(ListPage.TrailersPage.btnDeleteTrailer);
				DoThis.click(ListPage.TrailersPage.btnDeleteTrailer, "Y");
				
				//Click Yes
				DoThis.click(ListPage.TrailersPage.btnYes, "Y");
				
				if(DoThis.isObjectAvailable(ListPage.TrailersPage.objToaster, "Toaster message", "NA")) {
					Reporter.ReportEventNoImage("Toaster message Trailer deleted successfully is displayed");
				}
				
			}
		}
		
	}
	
	public static void LinkTrailers(String browser, @SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Search Vehicles
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, TrailerDetails.get("vehicles_name").toString(), "Y");
		
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
		
		//Click Vehicles Trailers Tab
		DoThis.click(ListPage.VehiclesPage.tabVehicleTrailers, "Y");
		
		//Search Trailer
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxTrailersRegistrationSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxTrailersRegistrationSearch, TrailerDetails.get("trailer_registration").toString(), "Y");
		
		//Select Trailer
		WebElement TrailersLocator = Constant.driver.findElement(By.xpath("//div[normalize-space()='"+TrailerDetails.get("trailer_registration").toString()+"']"));
		DoThis.click(TrailersLocator, "Y");
		
		
		//Click Save button
		DoThis.click(ListPage.VehiclesPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Vehicle successfully updated toaster is displayed");
			}
		
	}	
	
	public static void UnlinkTrailers(String browser, @SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Search Vehicles
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, TrailerDetails.get("vehicles_name").toString(), "Y");
		
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
		
		//Click Vehicles Trailers Tab
		DoThis.click(ListPage.VehiclesPage.tabVehicleTrailers, "Y");
		
		//Click Unlink all trailers
		DoThis.click(ListPage.VehiclesPage.btnUnlinkAllTrailers, "Y");
		
		//Click Yes button
		DoThis.click(ListPage.VehiclesPage.btnYes, "Y");
		
		//Click Save button
		DoThis.click(ListPage.VehiclesPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage("Vehicle successfully updated toaster is displayed");
			}
		
	}	
	
	public static void SearchVehicleTrailers(String browser, @SuppressWarnings("rawtypes") Dictionary TrailerDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.VehiclesPage.nvTabVehicles, "Y");
		
		//Search Vehicles
		DoThis.clear(browser, ListPage.VehiclesPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.VehiclesPage.txtbxSearch, TrailerDetails.get("vehicles_name").toString(), "Y");
		
		//Click First Row in Vehicles Table
		DoThis.click(ListPage.VehiclesPage.objVehiclesFirstRow, "Y");
		
		//Wait for Edit Vehicle Button to displayed
		DoThis.WaitForElementToLoad(ListPage.VehiclesPage.btnEditVehicle);
				
		//Check if the Chat bot is displayed
		if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objFleetChatbot, "Fleet Chat Bot", "NA")) {
			DoThis.click(ListPage.VehiclesPage.objFleetChatbot, "Y");
		}
		
		//Click Vehicles Trailers Tab
		DoThis.click(ListPage.VehiclesPage.tabVehicleTrailers, "Y");

	}	
			
}
