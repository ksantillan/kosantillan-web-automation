package actionModule;

import java.util.Dictionary;
import pageObject.ListPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Routes{	
	
	
	public static void AddRoutes(String browser, @SuppressWarnings("rawtypes") Dictionary RouteDetails, String activesite) throws InterruptedException {
		
		
		//Click to Navigate to List >> Routes
		DoThis.click(ListPage.navList, "Y");
		DoThis.click(ListPage.RoutesPage.nvTabRoutes, "Y");
		
		//Wait for Routes Data to displayed
			
		//Click Add Route button
		DoThis.click(ListPage.RoutesPage.btnAddRoute, "Y");
		
		//Name
		DoThis.clear(browser, ListPage.RoutesPage.txtbxRouteName, "N");
		DoThis.sendkeys(ListPage.RoutesPage.txtbxRouteName, RouteDetails.get("route_name").toString(), "Y");
		
		//Description
		DoThis.clear(browser, ListPage.RoutesPage.txtbxRouteDescription, "N");
		DoThis.sendkeys(ListPage.RoutesPage.txtbxRouteDescription, RouteDetails.get("route_description").toString(), "Y");
		
		//Border Width
		DoThis.clear(browser, ListPage.RoutesPage.txtbxBorderWidth, "N");
		DoThis.sendkeys(ListPage.RoutesPage.txtbxBorderWidth, RouteDetails.get("route_border_width").toString(), "Y");
		
		//Vehicles
		DoThis.sendkeys(ListPage.RoutesPage.drpdwnVehicles, RouteDetails.get("route_vehicle").toString(), "Y");
		
		WebElement VehicleLocator = Constant.driver.findElement(By.xpath("//div[text()='"+RouteDetails.get("route_vehicle").toString()+"'][contains(@id,'item')]"));
		DoThis.click(VehicleLocator, "Y");
		
		//Set Start Date and End Date
		DoThis.click(ListPage.RoutesPage.dtpckrStartDate, "Y");
		WebElement currentDateCalendar = Constant.driver.findElement(By.xpath("//div[@aria-label='"+DoThis.getCurrentDate(activesite)+"']"));
		DoThis.click(currentDateCalendar, "Y");
		
		//Click Previous Month
		DoThis.click(ListPage.RoutesPage.objPreviousMonth, "Y");
		
		WebElement TwoWeeksBeforeDateCalendar = Constant.driver.findElement(By.xpath("//div[@aria-label='"+DoThis.get2WeeksBeforeDate()+"']"));
		DoThis.click(TwoWeeksBeforeDateCalendar, "Y");
		
		//Click Search
		DoThis.click(ListPage.RoutesPage.btnSearch, "Y");
		
		switch(activesite) {
		case "PL":
		case "FR":
		case "NZ":	
		case "AU":	
		case "NG":
			Reporter.ReportEventNoImage("No Vehicle Routes available for "+activesite);
		break;
		
		default:
			DoThis.WaitForElementToLoad(ListPage.RoutesPage.objRoutesCount);
			
			int i = 0;
			do{    
			//Select Trip Panel
			DoThis.click(ListPage.RoutesPage.objTripPanel.get(i), "Y");
			
			//Click Save button
			DoThis.WaitForElementToLoad(ListPage.RoutesPage.btnSave);
			DoThis.click(ListPage.RoutesPage.btnSave, "Y");
			
			//Wait for Toaster to load
			DoThis.WaitForToasterMessageToLoad(ListPage.RoutesPage.objToasterMessage);
			
			i++;
			}while(!DoThis.isObjectNotDisplayed(ListPage.RoutesPage.btnCancel, "Cancel button", "N"));
			
			//Wait for Toaster to load
			DoThis.WaitForToasterMessageToLoad(ListPage.RoutesPage.objToasterMessage);

			if(DoThis.isObjectAvailable(ListPage.RoutesPage.objToasterMessage, "Toaster Message", "NA")) {
				Reporter.ReportEventNoImage("New route added successfully. toaster message is displayed");
			}
		break;
		}
		
		
	}
	
	public static void AddRoutePlan(String browser, @SuppressWarnings("rawtypes") Dictionary RoutePlanDetails, String activesite) throws InterruptedException {
		
		//Click to Navigate to List >> Routes
		DoThis.click(ListPage.navList, "Y");
		DoThis.click(ListPage.RoutesPage.nvTabRoutes, "Y");
			
		//Click Add Route Plan button
		DoThis.click(ListPage.RoutesPage.btnAddRoutePlan, "Y");
		
		//Name
		DoThis.clear(browser, ListPage.RoutesPage.txtbxRoutePlanName, "N");
		DoThis.sendkeys(ListPage.RoutesPage.txtbxRoutePlanName, RoutePlanDetails.get("route_plan_name").toString(), "Y");
		
		switch(activesite){
		
		case "PL":
		case "FR":
		case "NZ":	
		case "AU":
		case "NG":
			Reporter.ReportEventNoImage("No Vehicle Routes available for "+activesite);
		break;
		default:
			//Route
			
			DoThis.sendkeys(ListPage.RoutesPage.drpdwnRoute, RoutePlanDetails.get("route_name").toString(), "Y");	
			WebElement RouteLocator = Constant.driver.findElement(By.xpath("//div[text()='"+RoutePlanDetails.get("route_name").toString()+"'][contains(@id,'item')]"));
			DoThis.click(RouteLocator, "Y");
			
			switch (activesite) {
			case "ZW":
				//Route Type
				switch(RoutePlanDetails.get("route_type").toString()) {
				case "time":
					DoThis.sendkeys(ListPage.RoutesPage.drpdwnRouteType, "Activated based on Start and End Times", "Y");
					WebElement RouteTypeLocatorTime = Constant.driver.findElement(By.xpath("//div[text()='Activated based on Start and End Times'][contains(@id,'item')]"));
					DoThis.click(RouteTypeLocatorTime, "Y");
				break;
				
				case "point":
					DoThis.sendkeys(ListPage.RoutesPage.drpdwnRouteType, "Activated based on arriving at Point", "Y");
					WebElement RouteTypeLocatorPoint = Constant.driver.findElement(By.xpath("//div[text()='Activated based on arriving at Point'][contains(@id,'item')]"));
					DoThis.click(RouteTypeLocatorPoint, "Y");
					
				break;
				}
				break;
			
			default:
				//Route Type
				DoThis.click(ListPage.RoutesPage.drpdwnRouteType, "Y");
				
				switch(RoutePlanDetails.get("route_type").toString()) {
				case "time":
					DoThis.click(ListPage.RoutesPage.objOption.get(0), "Y");
				break;
				
				case "point":
					DoThis.click(ListPage.RoutesPage.objOption.get(1), "Y");
				break;
				}
				break;
			}
			
			//Vehicles
			DoThis.sendkeys(ListPage.RoutesPage.drpdwnRoutePlanVehicle, RoutePlanDetails.get("route_plan_vehicles").toString(), "Y");
			WebElement VehicleLocator = Constant.driver.findElement(By.xpath("//div[text()='"+RoutePlanDetails.get("route_plan_vehicles").toString()+"'][contains(@id,'item')]"));
			DoThis.click(VehicleLocator, "Y");
			
			
			//Applicable only if Route Type is Activated based on Start and End Times
			if(RoutePlanDetails.get("route_type").toString().equals("time")) {
				//Start Time
				DoThis.clear(browser, ListPage.RoutesPage.drpdwnRoutePlanStartTime, "N");
				DoThis.sendkeys(ListPage.RoutesPage.drpdwnRoutePlanStartTime, RoutePlanDetails.get("route_plan_start_time").toString(), "Y");
				WebElement StartTimeLocator = Constant.driver.findElement(By.xpath("//div[text()='"+RoutePlanDetails.get("route_plan_start_time").toString()+"'][contains(@id,'item')]"));
				DoThis.click(StartTimeLocator, "Y");
				
				//End Time
				DoThis.clear(browser, ListPage.RoutesPage.drpdwnRoutePlanEndTime, "N");
				DoThis.sendkeys(ListPage.RoutesPage.drpdwnRoutePlanEndTime, RoutePlanDetails.get("route_plan_end_time").toString(), "Y");
				WebElement EndTimeLocator = Constant.driver.findElement(By.xpath("//div[text()='"+RoutePlanDetails.get("route_plan_end_time").toString()+"'][contains(@id,'item')]"));
				DoThis.click(EndTimeLocator, "Y");
			}
			
			
			//Alert Method
			switch(RoutePlanDetails.get("route_plan_alert_method").toString()) {
			
			case "rss":
				DoThis.click(ListPage.RoutesPage.rdbtnRSS, "Y");
			break;
			
			case "email":
				DoThis.click(ListPage.RoutesPage.rdbtnEmail, "Y");
				DoThis.clear(browser, ListPage.RoutesPage.txtbxEmail, "Y");
				DoThis.sendkeys(ListPage.RoutesPage.txtbxEmail, RoutePlanDetails.get("email_address").toString(), "Y");
			break;
			
			case "sms":
				DoThis.click(ListPage.RoutesPage.rdbtnSMS, "Y");
				DoThis.clear(browser, ListPage.RoutesPage.txtbxSMS, "Y");
				DoThis.sendkeys(ListPage.RoutesPage.txtbxSMS, RoutePlanDetails.get("phone_number").toString(), "Y");
			break;
				
			}
			
			//Click Save button
			DoThis.click(ListPage.RoutesPage.btnSave, "Y");
			
			//Wait for Toaster to load
			DoThis.WaitForToasterMessageToLoad(ListPage.RoutesPage.objToasterMessage);
			
			if(DoThis.isObjectAvailable(ListPage.RoutesPage.objToasterMessage, "Toaster Message", "N")) {
				Reporter.ReportEventNoImage(RoutePlanDetails.get("route_plan_name").toString()+" is successfully added. toaster message is displayed");
			}
		break;
		
		}
		
	}
	
	public static void SearchAndEditRoutes(String browser, @SuppressWarnings("rawtypes") Dictionary RouteDetails, String activesite) throws InterruptedException {
		
		
		//Click to Navigate to List >> Routes
		DoThis.click(ListPage.navList, "Y");
		DoThis.click(ListPage.RoutesPage.nvTabRoutes, "Y");
		
		//Wait for Element to load
		DoThis.WaitForElementToLoad(ListPage.RoutesPage.txtbxSearch);
		
		//Check if the Chat bot is displayed
		if(DoThis.isObjectAvailable(ListPage.RoutesPage.objFleetChatbot, "Fleet Chat Bot", "N")) {
			DoThis.click(ListPage.RoutesPage.objFleetChatbot, "Y");
		}
		
		switch(activesite) {
		case "PL":
		case "FR":
		case "NZ":	
		case "AU":	
		case "NG":
			Reporter.ReportEventNoImage("No Vehicle Routes available for "+activesite);
		break;
		
		default:
			//Search Route
			DoThis.clear(browser, ListPage.RoutesPage.txtbxSearch, "N");
			DoThis.sendkeys(ListPage.RoutesPage.txtbxSearch, RouteDetails.get("route_name").toString(), "Y");
				
			//Wait for data to load
			DoThis.WaitForElementToLoad(ListPage.RoutesPage.btnOptions);
			
			//Click Route Edit button
			WebElement RouteEditLocator = Constant.driver.findElement(By.xpath("//div[text()='"+RouteDetails.get("route_name").toString()+"']/parent::div[1]/descendant::button[1]"));
			DoThis.click(RouteEditLocator, "Y");
			
			//Update Name
			DoThis.clear(browser, ListPage.RoutesPage.txtbxEditRouteName, "N");
			DoThis.sendkeys(ListPage.RoutesPage.txtbxEditRouteName, RouteDetails.get("updated_route_name").toString(), "Y");
			
			//Update Description
			DoThis.clear(browser, ListPage.RoutesPage.txtbxEditRouteDescription, "N");
			DoThis.sendkeys(ListPage.RoutesPage.txtbxEditRouteDescription, RouteDetails.get("updated_route_description").toString(), "Y");
			
			//Click check icon button
			DoThis.click(ListPage.RoutesPage.btnEditRouteSave, "Y");
		
			if(DoThis.isObjectAvailable(ListPage.RoutesPage.objToasterMessage, "Toaster Message", "NA")) {
				Reporter.ReportEventNoImage("Route item is successfully updated toaster message is displayed");
			}
		break;
		}
		
	}
	
	public static void SearchUpdatedRoutes(String browser, @SuppressWarnings("rawtypes") Dictionary RouteDetails, String activesite) throws InterruptedException {
		
		
		//Click to Navigate to List >> Routes
		DoThis.click(ListPage.navList, "Y");
		DoThis.click(ListPage.RoutesPage.nvTabRoutes, "Y");
		
		//Wait for Element to load
		DoThis.WaitForElementToLoad(ListPage.RoutesPage.txtbxSearch);
		
		switch(activesite) {
		case "PL":
		case "FR":
		case "NZ":
		case "AU":	
		case "NG":
			Reporter.ReportEventNoImage("No Vehicle Routes available for "+activesite);
		break;
		
		default:
			//Search Route
			DoThis.clear(browser, ListPage.RoutesPage.txtbxSearch, "N");
			DoThis.sendkeys(ListPage.RoutesPage.txtbxSearch, RouteDetails.get("updated_route_name").toString(), "Y");
				
			//Wait for data to load
			DoThis.WaitForElementToLoad(ListPage.RoutesPage.btnOptions);
		break;
		}
		
	}

	public static void SearchAndEditRoutePlan(String browser, @SuppressWarnings("rawtypes") Dictionary RoutePlanDetails, String activesite) throws InterruptedException {
	
		//Click to Navigate to List >> Routes
		DoThis.click(ListPage.navList, "Y");
		DoThis.click(ListPage.RoutesPage.nvTabRoutes, "Y");
					
		switch(activesite){
		
		case "PL":
		case "FR":
		case "NZ":	
		case "AU":	
		case "NG":
			Reporter.ReportEventNoImage("No Vehicle Routes available for "+activesite);
		break;
		default:
			//Wait for element to load
			DoThis.WaitMoreTimeForElementToLoad(ListPage.RoutesPage.btnAddRoutePlan);
			
			//Select any Route Plan created by Automation, else move to next page
			do{    
			//Click Next Page
			DoThis.click(ListPage.RoutesPage.objNext, "Y");
			
			}while(DoThis.isObjectNotDisplayed(ListPage.RoutesPage.objRoutePlanAutomation, "Automation Route Plan", "NA"));
			
			DoThis.click(ListPage.RoutesPage.objRoutePlanAutomation, "Y");
			
			//Update Name
			DoThis.clear(browser, ListPage.RoutesPage.txtbxRoutePlanName, "N");
			DoThis.sendkeys(ListPage.RoutesPage.txtbxRoutePlanName, RoutePlanDetails.get("updated_route_plan_name").toString(), "Y");
			
			//Route Type
			DoThis.click(ListPage.RoutesPage.drpdwnRouteType, "Y");
			
			switch(RoutePlanDetails.get("updated_route_type").toString()) {
			case "time":
				DoThis.click(ListPage.RoutesPage.objOption.get(0), "Y");
			break;
			
			case "point":
				DoThis.click(ListPage.RoutesPage.objOption.get(1), "Y");
			break;
			}
				
			//Applicable only if Route Type is Activated based on Start and End Times
			if(RoutePlanDetails.get("updated_route_type").toString().equals("time")) {
				//Start Time
				DoThis.clear(browser, ListPage.RoutesPage.drpdwnRoutePlanStartTime, "N");
				DoThis.sendkeys(ListPage.RoutesPage.drpdwnRoutePlanStartTime, RoutePlanDetails.get("route_plan_start_time").toString(), "Y");
				WebElement StartTimeLocator = Constant.driver.findElement(By.xpath("//div[text()='"+RoutePlanDetails.get("route_plan_start_time").toString()+"'][contains(@id,'item')]"));
				DoThis.click(StartTimeLocator, "Y");
				
				//End Time
				DoThis.clear(browser, ListPage.RoutesPage.drpdwnRoutePlanEndTime, "N");
				DoThis.sendkeys(ListPage.RoutesPage.drpdwnRoutePlanEndTime, RoutePlanDetails.get("route_plan_end_time").toString(), "Y");
				WebElement EndTimeLocator = Constant.driver.findElement(By.xpath("//div[text()='"+RoutePlanDetails.get("route_plan_end_time").toString()+"'][contains(@id,'item')]"));
				DoThis.click(EndTimeLocator, "Y");
			}
			
			//Weekly Schedule
			if(DoThis.isObjectAvailable(ListPage.RoutesPage.btnCheckAll, "Check All button", "NA")){
				DoThis.click(ListPage.RoutesPage.btnCheckAll, "Y");
			}else {
				DoThis.click(ListPage.RoutesPage.btnUncheck, "Y");
			}
			
			//Alert Method
			switch(RoutePlanDetails.get("updated_route_plan_alert_method").toString()) {
			
			case "rss":
				DoThis.click(ListPage.RoutesPage.rdbtnRSS, "Y");
			break;
			
			case "email":
				DoThis.click(ListPage.RoutesPage.rdbtnEmail, "Y");
				DoThis.clear(browser, ListPage.RoutesPage.txtbxEmail, "Y");
				DoThis.sendkeys(ListPage.RoutesPage.txtbxEmail, RoutePlanDetails.get("email_address").toString(), "Y");
			break;
			
			case "sms":
				DoThis.click(ListPage.RoutesPage.rdbtnSMS, "Y");
				DoThis.clear(browser, ListPage.RoutesPage.txtbxSMS, "Y");
				DoThis.sendkeys(ListPage.RoutesPage.txtbxSMS, RoutePlanDetails.get("phone_number").toString(), "Y");
			break;
				
			}
			
			//Click Update button
			DoThis.click(ListPage.RoutesPage.btnUpdate, "Y");
			
			if(DoThis.isObjectAvailable(ListPage.RoutesPage.objToasterMessage, "Toaster Message", "NA")) {
				Reporter.ReportEventNoImage(RoutePlanDetails.get("updated_route_plan_name").toString()+" is successfully updated. toaster message is displayed");
			}
		break;
		
		}
	
	}
	
	public static void SearchDeleteRoutesCreatedbyAutomation(String browser, @SuppressWarnings("rawtypes") Dictionary RouteDetails, String activesite) throws InterruptedException {
		
		
		//Click to Navigate to List >> Routes
		DoThis.click(ListPage.navList, "Y");
		DoThis.click(ListPage.RoutesPage.nvTabRoutes, "Y");
		
		//Wait for Element to load
		DoThis.WaitForElementToLoad(ListPage.RoutesPage.txtbxSearch);
		
		switch(activesite) {
		case "PL":
		case "FR":
		case "NZ":	
		case "AU":
		case "NG":
			Reporter.ReportEventNoImage("No Vehicle Routes available for "+activesite);
		break;
		
		default:
			//Search Route
			DoThis.clear(browser, ListPage.RoutesPage.txtbxSearch, "N");
			DoThis.sendkeys(ListPage.RoutesPage.txtbxSearch, RouteDetails.get("search_route_name").toString(), "Y");
				
			//Wait for data to load
			DoThis.WaitForElementToLoad(ListPage.RoutesPage.btnOptions);
			
			//Get Total Reminders Template
			String strTotalRoutes = DoThis.getText(ListPage.RoutesPage.objTotalRoutes);
			int intTotalRoutes=Integer.parseInt(strTotalRoutes);  
			Reporter.ReportEventNoImage(intTotalRoutes+ " Routes created by Automation will be deleted");
			
			if(DoThis.isObjectAvailable(ListPage.RoutesPage.objNoDataAvailable, "No data available", "NA")) {
				Reporter.ReportEventNoImage("No Routes is created by Automation");
			}else {
				//Delete All Routes
				for(int i=0; i<intTotalRoutes; i++) {
					DoThis.WaitForElementToLoad(ListPage.RoutesPage.btnIconTrash);
					DoThis.click(ListPage.RoutesPage.btnIconTrash, "Y");
					
					//Wait for element to load
					DoThis.WaitForElementToLoad(ListPage.RoutesPage.btnYesConfirm);
					
					DoThis.click(ListPage.RoutesPage.btnYesConfirm, "Y");
				
				}
			}

		break;
		}
		
	}
				
}
