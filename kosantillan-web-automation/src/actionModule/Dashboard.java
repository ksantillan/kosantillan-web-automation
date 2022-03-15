package actionModule;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Dictionary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.DashboardPage;
import utility.Constant;
import utility.DoThis;

public class Dashboard{	
	
	
	public static void SelectIndustry(@SuppressWarnings("rawtypes") Dictionary DashboardDetails) throws InterruptedException {
	
		switch (DashboardDetails.get("industry").toString()) {
		
		case "Construction":
			DoThis.click(DashboardPage.OverViewTab.btnConstruction, "Y");
		break;
		
		case "Servicing":
			DoThis.click(DashboardPage.OverViewTab.btnServicing, "Y");
		break;
		
		case "Insurance":
			DoThis.click(DashboardPage.OverViewTab.btnInsurance, "Y");
		break;
		
		case "Logistics":
			DoThis.click(DashboardPage.OverViewTab.btnLogistics, "Y");
		break;
		
		case "Manufacturing & Wholesale":
			DoThis.click(DashboardPage.OverViewTab.btnManufacturingAndWholesale, "Y");
		break;
		
		case "Leasing/Rental":
			DoThis.click(DashboardPage.OverViewTab.btnLeasingRental, "Y");
		break;
		
		case "Food & Beverages":
			DoThis.click(DashboardPage.OverViewTab.btnFoodAndBeverages, "Y");
		break;
		
		case "Transportation":
			DoThis.click(DashboardPage.OverViewTab.btnTransportation, "Y");
		break;
		
		case "Other":
			DoThis.click(DashboardPage.OverViewTab.btnOther, "Y");
		break;
		}
		
	}
	
	public static void SelectWidgetsAndCreateDashboard(@SuppressWarnings("rawtypes") Dictionary DashboardDetails) throws InterruptedException {
		
		switch (DashboardDetails.get("widget_1").toString()) {
		
		case "Vehicle Usage":
			DoThis.click(DashboardPage.OverViewTab.btnVehicleUsage, "Y");
		break;
		
		case "Trips":
			DoThis.click(DashboardPage.OverViewTab.btnTrips, "Y");
		break;
		
		case "Fleet Performance":
			DoThis.click(DashboardPage.OverViewTab.btnFleetPerformance, "Y");
		break;
		
		case "Vehicle Idling":
			DoThis.click(DashboardPage.OverViewTab.btnVehicleIdling, "Y");
		break;
		
		case "Driver Behavior & Safety":
			DoThis.click(DashboardPage.OverViewTab.btnDriverBehaviorAndSafety, "Y");
		break;
		
		case "Fleet Running Costs":
			DoThis.click(DashboardPage.OverViewTab.btnFleetRunningCosts, "Y");
		break;
		}
		
		switch (DashboardDetails.get("widget_2").toString()) {
		
		case "Vehicle Usage":
			DoThis.click(DashboardPage.OverViewTab.btnVehicleUsage, "Y");
		break;
		
		case "Trips":
			DoThis.click(DashboardPage.OverViewTab.btnTrips, "Y");
		break;
		
		case "Fleet Performance":
			DoThis.click(DashboardPage.OverViewTab.btnFleetPerformance, "Y");
		break;
		
		case "Vehicle Idling":
			DoThis.click(DashboardPage.OverViewTab.btnVehicleIdling, "Y");
		break;
		
		case "Driver Behavior & Safety":
			DoThis.click(DashboardPage.OverViewTab.btnDriverBehaviorAndSafety, "Y");
		break;
		
		case "Fleet Running Costs":
			DoThis.click(DashboardPage.OverViewTab.btnFleetRunningCosts, "Y");
		break;
		}
		
		switch (DashboardDetails.get("widget_3").toString()) {
		
		case "Vehicle Usage":
			DoThis.click(DashboardPage.OverViewTab.btnVehicleUsage, "Y");
		break;
		
		case "Trips":
			DoThis.click(DashboardPage.OverViewTab.btnTrips, "Y");
		break;
		
		case "Fleet Performance":
			DoThis.click(DashboardPage.OverViewTab.btnFleetPerformance, "Y");
		break;
		
		case "Vehicle Idling":
			DoThis.click(DashboardPage.OverViewTab.btnVehicleIdling, "Y");
		break;
		
		case "Driver Behavior & Safety":
			DoThis.click(DashboardPage.OverViewTab.btnDriverBehaviorAndSafety, "Y");
		break;
		
		case "Fleet Running Costs":
			DoThis.click(DashboardPage.OverViewTab.btnFleetRunningCosts, "Y");
		break;
		}
		DoThis.click(DashboardPage.OverViewTab.btnCreateDashboard, "Y");
		
	}
	public static void SearchAndValidateWidgets(String browser, ArrayList ObtainedWidgetList) throws InterruptedException {
				
		for(int i=0; i<ObtainedWidgetList.size(); i++) {
			DoThis.clear(browser, DashboardPage.OverViewTab.txtbxSearch, "N");
			DoThis.sendkeys(DashboardPage.OverViewTab.txtbxSearch, ObtainedWidgetList.get(i).toString(), "Y");
		
			WebElement WidgetLocatior = Constant.driver.findElement(By.xpath("//span[text()='"+ObtainedWidgetList.get(i).toString()+"']/parent::div[contains(@class,'WidgetTitle')]"));
			DoThis.isObjectDisplayed(WidgetLocatior, "Widget "+ObtainedWidgetList.get(i).toString()+" is displayed", "Y");
		}	
	}
	public static void NavigateDashboard() throws InterruptedException {
		
		//Click Dashboard Tab
		DoThis.click(DashboardPage.nvBrDashboard, "Y");
		
		//if no existing widget, click Skip This Step button to load widget
		if(DoThis.isObjectAvailable(DashboardPage.OverViewTab.btnSkipThisStep, "Skip This Step validation", "NA")) {
			DoThis.click(DashboardPage.OverViewTab.btnSkipThisStep, "Y");
		}
		
		//To handle Scheduled Maintenance modal
		if(DoThis.isObjectAvailable(DashboardPage.OverViewTab.mdlScheduledMaintenance, "Scheduled Maintenance Modal", "NA")) {
			DoThis.click(DashboardPage.OverViewTab.btnGotIt, "Y");
		}
		
		//Wait for Widget to Load
		while(!DoThis.isObjectAvailable(DashboardPage.OverViewTab.objWidgetHeader, "Widget Header", "N")) {
			DoThis.WaitForElementToLoad(DashboardPage.OverViewTab.objWidgetHeader);
		}
		
	}
	
	public static void ValidateSearchFilters(@SuppressWarnings("rawtypes") Dictionary DashboardDetails) throws InterruptedException {
		
		
		//Check if the Chat bot is displayed
		if(DoThis.isObjectAvailable(DashboardPage.OverViewTab.objFleetChatbot, "Fleet Chat Bot", "N")) {
			DoThis.click(DashboardPage.OverViewTab.objFleetChatbot, "Y");
		}
				
		switch (DashboardDetails.get("search_filter").toString()) {
		
		case "Registration Numbers":
			if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.drpdwnRegistrationNumbers, "Registration Numbers dropdown", "Y")){assertTrue(false);}
		break;
			
		case "Date Range":
			if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.drpdwnDateRange, "Date Range dropdown", "Y")){assertTrue(false);}
		break;
		
		case "Vehicle":
			DoThis.click(DashboardPage.OverViewTab.btnMoreFilters, "Y");
			if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.drpdwnVehicleName, "Vehicle Name dropdown", "Y")){assertTrue(false);}
			if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.drpdwnVehicleGroups, "Vehicle Groups dropdown", "Y")){assertTrue(false);}
			if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.drpdwnVehicleType, "Vehicle Type dropdown", "Y")){assertTrue(false);}
			if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.drpdwnVehicleDescription, "Vehicle Description dropdown", "Y")){assertTrue(false);}
			if(DoThis.isObjectAvailable(DashboardPage.OverViewTab.drpdwnVehicleDescription2, "Vehicle Description 2 dropdown", "N")) {
				if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.drpdwnVehicleDescription2, "Vehicle Description 2 dropdown", "Y")){assertTrue(false);}
			}
			if(DoThis.isObjectAvailable(DashboardPage.OverViewTab.drpdwnVehicleDescription3, "Vehicle Description 3 dropdown", "N")) {
				if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.drpdwnVehicleDescription3, "Vehicle Description 3 dropdown", "Y")){assertTrue(false);}
			}
			
		break;
		
		}
		
		
	}
	
	public static void ValidateHelpButtonFunction() throws InterruptedException {
		
		//Click Help button
		DoThis.click(DashboardPage.OverViewTab.btnHelp, "Y");
		
		//Validate Search Help Topic
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.txtbxHelpSearch, "Search Topic text field", "Y")){assertTrue(false);}
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objChangeDateSelection, "Change date selection object", "Y")){assertTrue(false);}
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objAddWidgets, "Add widgets object", "Y")){assertTrue(false);}
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objDeleteWidgets, "Delete widgets object", "Y")){assertTrue(false);}
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objMakeSelectionOnWidgets, "Make selection on widgets object", "Y")){assertTrue(false);}
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objDownloadWidgets, "Download widgets object", "Y")){assertTrue(false);}
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objReorderWidgets, "Reorder widgets object", "Y")){assertTrue(false);}
		
		//Validate Quick Tour
		DoThis.click(DashboardPage.OverViewTab.lnkQuickTour, "Y");
		
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objPopupChangeDateSelection, "Change Date Selection Popup", "Y")){assertTrue(false);}
		DoThis.click(DashboardPage.OverViewTab.btnNextAddwidgets, "Y");
		
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objPopupAddwidgets, "Add widgets Popup", "Y")){assertTrue(false);}
		DoThis.click(DashboardPage.OverViewTab.btnNextDeletewidgets, "Y");
		
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objPopupDeletewidgets, "Delete widgets Popup", "Y")){assertTrue(false);}
		DoThis.click(DashboardPage.OverViewTab.btnNextMakeselectiononwidgets, "Y");
		
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objPopupMakeselectiononwidgets, "Make selection on widgets Popup", "Y")){assertTrue(false);}
		DoThis.click(DashboardPage.OverViewTab.btnNextDownloadwidgets, "Y");
		
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objPopupDownloadwidgets, "Download widgets Popup", "Y")){assertTrue(false);}
		DoThis.click(DashboardPage.OverViewTab.btnNextReorderwidgets, "Y");
		
		if(!DoThis.isObjectDisplayed(DashboardPage.OverViewTab.objPopupReorderwidgets, "Reorder widgets Popup", "Y")){assertTrue(false);}
		DoThis.click(DashboardPage.OverViewTab.btnReorderwidgetsCloseButton, "Y");
	
			
	}
	public static void AddFirstAvailableWidgets() throws InterruptedException {
		
		//Click Add Widget button
		DoThis.click(DashboardPage.OverViewTab.btnAddWidgets, "Y");
		
		//Select First Widget based on the list
		DoThis.click(DashboardPage.OverViewTab.objWidgetList.get(0), "Y");
		DoThis.click(DashboardPage.OverViewTab.objSubWidgetList.get(0), "Y");
		
		//Click Add Widget button
		DoThis.click(DashboardPage.OverViewTab.btnAddWidget, "Y");
		
		if(DoThis.isObjectAvailable(DashboardPage.OverViewTab.objToaster, "Toaster message", "N")) {
			DoThis.isContainingText(DashboardPage.OverViewTab.objToaster, "New widget added successfully.", "Toaster message", "Y");
		}
		
	}
	
	public static void DeleteFirstAvailableWidgets() throws InterruptedException {
		
		//To handle Scheduled Maintenance modal
		if(DoThis.isObjectAvailable(DashboardPage.OverViewTab.mdlScheduledMaintenance, "Scheduled Maintenance Modal", "NA")) {
			DoThis.click(DashboardPage.OverViewTab.btnGotIt, "Y");
		}
		
		//Wait for Widget to Load
		DoThis.WaitForElementToLoad(DashboardPage.OverViewTab.objWidgetHeader);
		
		//Delete First Widget based on the list
		DoThis.click(DashboardPage.OverViewTab.objWidgetHeaders.get(0), "Y");
		DoThis.click(DashboardPage.OverViewTab.btnDelete, "Y");
		DoThis.click(DashboardPage.OverViewTab.btnYes, "Y");
		
		if(DoThis.isObjectAvailable(DashboardPage.OverViewTab.objToaster, "Toaster message", "N")) {
			DoThis.isContainingText(DashboardPage.OverViewTab.objToaster, "Widget deleted successfully.", "Toaster message", "Y");
		}
		
	}
	
	public static void DownloadWidgets(@SuppressWarnings("rawtypes") Dictionary DashboardDetails) throws InterruptedException {
		
		//Click Download Widgets
		DoThis.click(DashboardPage.OverViewTab.objDownloadWidgets, "Y");
		
		switch (DashboardDetails.get("download_type").toString()) {
		
		case "image":
			DoThis.click(DashboardPage.OverViewTab.btnDownloadImage, "Y");
		break;
		
		case "PDF":
			DoThis.click(DashboardPage.OverViewTab.btnDownloadPDF, "Y");
		break;
		
		
		case "CSV":
			DoThis.click(DashboardPage.OverViewTab.btnDownloadCSV, "Y");
		break;
		}
		
		//Click Download button
		DoThis.click(DashboardPage.OverViewTab.btnDownload, "Y");
		
	}
		
	
	
			
}
