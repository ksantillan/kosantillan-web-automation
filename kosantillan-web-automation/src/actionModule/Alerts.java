package actionModule;

import static org.testng.Assert.assertTrue;
import java.util.Dictionary;
import pageObject.NotificationPage;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Alerts{	
	
	
	public static void AddAlert(String browser, @SuppressWarnings("rawtypes") Dictionary AlertDetails, String activesite) throws InterruptedException {
		
		if(!DoThis.isObjectAvailable(NotificationPage.FeedTab.tbFeed, "Feed Tab", "NA")) {
			DoThis.click(NotificationPage.btnNotification, "Y");
		}
		
		//Add Alerts
		DoThis.click(NotificationPage.AddAlertTab.tbAddAlert, "Y");
		
		switch(AlertDetails.get("alert_type").toString()) {
		
		case "Driver ID":
			
			DoThis.WaitForElementToLoad(NotificationPage.AddAlertTab.pnlDriverID);
			DoThis.click(NotificationPage.AddAlertTab.pnlDriverID, "Y");
			
			//Wait for Alert page to load
			DoThis.WaitForElementToLoad(NotificationPage.AddAlertTab.txtbxAlertName);
			
			DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxAlertName, "N");
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxAlertName, AlertDetails.get("alert_name").toString(), "Y");
			
				switch(AlertDetails.get("notification_type").toString()) {
				
				case "ID Detected":
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDDetected, "Y");
					break;
					
				case "ID Not Detected":
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDNotDetected, "Y");
					break;
					
				case "Invalid ID":
					DoThis.click(NotificationPage.AddAlertTab.chkbxInvalidID, "Y");
					break;
					
				case "All":
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDNotDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxInvalidID, "Y");
					break;	
				}
			break;
		
		case "Events":
						
			DoThis.WaitForElementToLoad(NotificationPage.AddAlertTab.pnlEvents);
			DoThis.click(NotificationPage.AddAlertTab.pnlEvents, "Y");
			
			//Wait for Alert page to load
			DoThis.WaitForElementToLoad(NotificationPage.AddAlertTab.txtbxAlertName);
			
			DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxAlertName, "N");
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxAlertName, AlertDetails.get("alert_name").toString(), "Y");
			
			DoThis.click(NotificationPage.AddAlertTab.drpdwnCategory, "Y");
				switch(AlertDetails.get("event_category").toString()) {
				
				case "Trigger Events":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnCategoryTriggerEvents, "Y");
					DoThis.click(NotificationPage.AddAlertTab.drpdwnEvent, "Y");
						switch(AlertDetails.get("trigger_event").toString()) {
						
						case "Ignition":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnEventIgnition, "Y");
							
							switch(AlertDetails.get("ignition_event").toString()) {
							
							case "Ignition ON":
								DoThis.click(NotificationPage.AddAlertTab.chkbxIgnitionOn, "Y");
								break;
								
							case "Ignition OFF":
								DoThis.click(NotificationPage.AddAlertTab.chkbxIgnitionOff, "Y");
								break;
							
							case "All":
								DoThis.click(NotificationPage.AddAlertTab.chkbxIgnitionOn, "Y");
								DoThis.click(NotificationPage.AddAlertTab.chkbxIgnitionOff, "Y");
								break;
							}	
							break;
							
						case "Power":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnEventPower, "Y");
							
							switch(AlertDetails.get("power_event").toString()) {
							
							case "Power ON":
								DoThis.click(NotificationPage.AddAlertTab.chkbxPowerOn, "Y");
								break;
								
							case "Power OFF":
								DoThis.click(NotificationPage.AddAlertTab.chkbxPowerOff, "Y");
								break;
							
							case "All":
								DoThis.click(NotificationPage.AddAlertTab.chkbxPowerOn, "Y");
								DoThis.click(NotificationPage.AddAlertTab.chkbxPowerOff, "Y");
								break;
							}	
							break;
							
						case "Max Speed Exceeded":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnEventMaxSpeedExceeded, "Y");
							break;
						
						}
					break;
					
				case "Threshold Events":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnCategoryThresholdEvents, "Y");
					DoThis.click(NotificationPage.AddAlertTab.drpdwnEvent, "Y");
					switch(AlertDetails.get("threshold_event").toString()) {
					
					case "Excessive Drive Time":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventExcessiveDriveTime, "Y");
						
						DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxExcessiveDriveTime, "N");
						DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxExcessiveDriveTime, AlertDetails.get("excessive_drive_time_duration").toString(), "Y");
						break;
						
					case "Stationary Vehicle":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventStationaryVehicle, "Y");
						
						DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxStationaryDuration, "N");
						DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxStationaryDuration, AlertDetails.get("stationary_duration").toString(), "Y");
						
						//Add line of code to switch between Ignition ON, On or OFF
						
					case "Speeding":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventSpeeding, "Y");
						
						DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxSpeedOver, "N");
						DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxSpeedOver, AlertDetails.get("speed_over").toString(), "Y");
						break;
					
					}
					break;
					
				case "Static Bit Events":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnCategoryStaticBitEvents, "Y");
					DoThis.click(NotificationPage.AddAlertTab.drpdwnEvent, "Y");
					
					switch(AlertDetails.get("static_bit_event").toString()) {
					
					case "Brake":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventBrake, "Y");
						
						DoThis.click(NotificationPage.AddAlertTab.drpdwnStatus, "Y");
						switch (AlertDetails.get("status").toString()) {
						
						case "ON":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOn, "Y");
							break;
						
						case "OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOff, "Y");
							break;
							
						case "ON & OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionONAndOff, "Y");
							break;
						
						}
						break;
						
					case "Door 3":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventDoor3, "Y");
						
						DoThis.click(NotificationPage.AddAlertTab.drpdwnStatus, "Y");
						switch (AlertDetails.get("status").toString()) {
						
						case "ON":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOn, "Y");
							break;
						
						case "OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOff, "Y");
							break;
							
						case "ON & OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionONAndOff, "Y");
							break;
						
						}
						break;
						
					case "Door 4":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventDoor4, "Y");
						
						DoThis.click(NotificationPage.AddAlertTab.drpdwnStatus, "Y");
						switch (AlertDetails.get("status").toString()) {
						
						case "ON":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOn, "Y");
							break;
						
						case "OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOff, "Y");
							break;
							
						case "ON & OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionONAndOff, "Y");
							break;
						
						}
						break;
					
					}
					break;
				
				case "Sensor Events":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnCategorySensorEvents, "Y");
					DoThis.click(NotificationPage.AddAlertTab.drpdwnEvent, "Y");
					
					switch(AlertDetails.get("sensor_event").toString()) {
					
					case "Engine":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventEngine, "Y");
						break;
						
					case "Coolant":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventCoolant, "Y");
						break;
						
					case "Temp 1":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventTemp1, "Y");
						break;
					
					}
					
					DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxNotificationDelay, "N");
					DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxNotificationDelay, AlertDetails.get("notification_delay").toString(), "Y");
					
					DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxLowTemp, "N");
					DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxLowTemp, AlertDetails.get("low_temp").toString(), "Y");
					
					DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxHighTemp, "N");
					DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxHighTemp, AlertDetails.get("high_temp").toString(), "Y");
					
					break;
					
				case "Fuel Events":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnCategoryFuelEvents, "Y");
					DoThis.click(NotificationPage.AddAlertTab.drpdwnEvent, "Y");
					
					switch(AlertDetails.get("fuel_event").toString()) {
					
					case "Fuel Loss":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventFuelLoss, "Y");
						break;
						
					case "Fuel Gain":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventFuelGain, "Y");
						break;
					}
					break;
		
			}
			DoThis.click(NotificationPage.AddAlertTab.btnAddType, "Y");
			break;
		
		case "Geofence":
					
			DoThis.WaitForElementToLoad(NotificationPage.AddAlertTab.pnlGeofence);
			DoThis.click(NotificationPage.AddAlertTab.pnlGeofence, "Y");
			
			//Wait for Alert page to load
			DoThis.WaitForElementToLoad(NotificationPage.AddAlertTab.txtbxAlertName);
			
			DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxAlertName, "N");
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxAlertName, AlertDetails.get("alert_name").toString(), "Y");
			
				switch(AlertDetails.get("notification_type").toString()) {
				
				case "Enter Geofence":
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterGeofence, "Y");
					break;
				
				case "Leave Geofence":
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveGeofence, "Y");
					break;
					
				case "All":
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterGeofence, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveGeofence, "Y");
					break;
				}
			
			//Select First Geofence in the dropdown
			DoThis.click(NotificationPage.AddAlertTab.drpdwnGeofence, "Y");
			DoThis.click(NotificationPage.AddAlertTab.drpdwnGeofenceFirstOption, "Y");
			
			break;
		
		case "System Zones":
			
			DoThis.WaitForElementToLoad(NotificationPage.AddAlertTab.pnlSystemzones);
			DoThis.click(NotificationPage.AddAlertTab.pnlSystemzones, "Y");
			
			//Wait for Alert page to load
			DoThis.WaitForElementToLoad(NotificationPage.AddAlertTab.txtbxAlertName);
			
			DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxAlertName, "N");
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxAlertName, AlertDetails.get("alert_name").toString(), "Y");
			
				switch(AlertDetails.get("notification_type").toString()) {
				
				case "Enter Zone":
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterSystemZone, "Y");
					break;
				
				case "Leave Zone":
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveSystemZone, "Y");
					break;
					
				case "All":
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterSystemZone, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveSystemZone, "Y");
					break;
				}
			
			//Select Zone Type in the dropdown
			DoThis.click(NotificationPage.AddAlertTab.drpdwnZoneType, "Y");
			switch (AlertDetails.get("zone_type").toString()) {
			
			case "Country borders":
				switch (activesite) {
				case "ME":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnZoneTypeOptionTollGates, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.AddAlertTab.drpdwnZoneTypeOptionCountryborders, "Y");
				break;
				}
				break;
				
			case "10km from country border":
				switch (activesite) {
				case "ME":
				case "US":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnZoneTypeOptionProvinceborders, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.AddAlertTab.drpdwnZoneTypeOption10kmFromCountryborder, "Y");
				break;
				}
				break;
			}
			
			//Select All in System zones dropdown
			DoThis.click(NotificationPage.AddAlertTab.drpdwnSystemzones, "Y");
			DoThis.click(NotificationPage.AddAlertTab.drpdwnSystemzonesOptionsAll, "Y");
			
			break;
		
		}
		
		switch (AlertDetails.get("vehicles").toString()) {
		
		case "All Vehicles":
			if(!DoThis.getCheckedStatus(NotificationPage.AddAlertTab.objAllVehicles).contains("true")) {
				DoThis.click(NotificationPage.AddAlertTab.chkbxAllVehicles, "Y");
			}else {
				Reporter.ReportEventNoImage("All Vehicles checkbox already checked");
			}
			break;
			
		case "Select Vehicle":
			if(!DoThis.getCheckedStatus(NotificationPage.AddAlertTab.objAllVehicles).contains("false")) {
				DoThis.click(NotificationPage.AddAlertTab.chkbxAllVehicles, "Y");
			}else {
				Reporter.ReportEventNoImage("All Vehicles checkbox NOT checked");
			}
			
			DoThis.WaitForElementToLoad(NotificationPage.AddAlertTab.objSelectVehicles);
			
			switch (browser) {
			case "firefox":
				DoThis.click(NotificationPage.AddAlertTab.txtbxSelectVehicles, "Y");
				DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxSelectVehicles, AlertDetails.get("vehicle_name").toString(), "Y");
				DoThis.keyPress(Keys.ENTER);
			break;
			
			default:
				
				switch (activesite) {
				case "SG":
					DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxSelectVehicles, AlertDetails.get("vehicle_name").toString(), "Y");
					WebElement chckbxSelectVehicle = Constant.driver.findElement(By.xpath("//span[text()='"+AlertDetails.get("vehicle_name").toString()+"']"));
					DoThis.click(chckbxSelectVehicle, "Y");
				break;
				default:
					DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxSelectVehicles, AlertDetails.get("vehicle_name").toString(), "Y");
					chckbxSelectVehicle = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+AlertDetails.get("vehicle_name").toString()+"')]"));
					DoThis.click(chckbxSelectVehicle, "Y");
				break;
				}
				
			break;
			}
			
			
			
			break;
		}
		
		//Add Country that does not have RSS and SMS Contact Type Option
		switch (activesite) {
		case "US":
			DoThis.Wait(NotificationPage.AddAlertTab.txtbxEmail);
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxEmail, AlertDetails.get("email").toString(), "Y");
			
			//Click Add Email Option
			DoThis.Wait(NotificationPage.AddAlertTab.objAddEmailOption);
			DoThis.click(NotificationPage.AddAlertTab.objAddEmailOption, "Y");
		break;
		default:
		switch (AlertDetails.get("contact_type").toString()) {
		
		case "Email":
			DoThis.click(NotificationPage.AddAlertTab.btnEmail, "Y");
			
			DoThis.Wait(NotificationPage.AddAlertTab.txtbxEmail);
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxEmail, AlertDetails.get("email").toString(), "Y");
			
			//Click Add Email Option
			DoThis.Wait(NotificationPage.AddAlertTab.objAddEmailOption);
			DoThis.click(NotificationPage.AddAlertTab.objAddEmailOption, "Y");
	
			break;
		
		case "SMS":
			DoThis.click(NotificationPage.AddAlertTab.btnSMS, "Y");
			
			DoThis.Wait(NotificationPage.AddAlertTab.txtbxSMS);
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxSMS, AlertDetails.get("sms").toString(), "Y");
			
			//Select SMS First Option
			DoThis.Wait(NotificationPage.AddAlertTab.objSelectSMSOption.get(0));
			DoThis.click(NotificationPage.AddAlertTab.objSelectSMSOption.get(0), "Y");
			
			break;
			
		case "RSS":
			DoThis.click(NotificationPage.AddAlertTab.btnRSS, "Y");
			
			break;
		}
		break;
		}
		
		//Click Create button
		DoThis.click(NotificationPage.AddAlertTab.btnCreate, "Y");
		
		if(DoThis.isObjectAvailable(NotificationPage.AddAlertTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Alert created successfully toaster message is displayed");
		}
		
	}
		
	public static void SearchEmailAlertinActive(String browser, @SuppressWarnings("rawtypes") Dictionary AlertDetails) throws InterruptedException {
		
		//Wait for CogWheel to load in Active Tab, indication Active Alerts are displayed
		DoThis.WaitForElementToLoad(NotificationPage.ActiveTab.btnCogWheel);
		
		//Search for Alert
		DoThis.clear(browser, NotificationPage.ActiveTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.ActiveTab.txtbxSearch, AlertDetails.get("alert_name").toString(), "Y");
		
		WebElement ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name").toString()+"']/following::div"
				+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
				+ "[text()='"+AlertDetails.get("vehicles").toString()+"']/following::div"
				+ "[text()='"+AlertDetails.get("email").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(ActiveAlert, ""+AlertDetails.get("alert_type").toString()+" Alert in Active tab validation", "Y")) {assertTrue(false);}
		
	}
	
	public static void SearchAlertinActive(String browser, @SuppressWarnings("rawtypes") Dictionary AlertDetails, String activesite) throws InterruptedException {
		
		//Wait for CogWheel to load in Active Tab, indication Active Alerts are displayed
		DoThis.WaitForElementToLoad(NotificationPage.ActiveTab.btnCogWheel);
		
		//Search for Alert
		DoThis.clear(browser, NotificationPage.ActiveTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.ActiveTab.txtbxSearch, AlertDetails.get("alert_name").toString(), "Y");
		
		//Wait for CogWheel to load in Active Tab, indication Active Alerts are displayed
		DoThis.WaitForElementToLoad(NotificationPage.ActiveTab.btnCogWheel);
		
		WebElement ActiveAlert = null;
		switch (AlertDetails.get("contact_type").toString()) {
		
		case "Email":
			
			switch (AlertDetails.get("vehicles").toString()) {
			
			case "All Vehicles":
				
				ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name").toString()+"']/following::div"
						+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
						+ "[text()='"+AlertDetails.get("vehicles").toString()+"']/following::div"
						+ "[text()='"+AlertDetails.get("email").toString()+"']"));
				break;
				
			case "Select Vehicle":
				
				ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name").toString()+"']/following::div"
						+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
						+ "[contains(.,'"+AlertDetails.get("vehicle_name").toString()+"')]/following::div"
						+ "[text()='"+AlertDetails.get("email").toString()+"']"));
				break;
			}
			break;
			
		case "SMS":
			
			switch (AlertDetails.get("vehicles").toString()) {
			
			case "All Vehicles":
				switch (activesite) {
				case "US":
					ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name").toString()+"']/following::div"
							+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
							+ "[text()='"+AlertDetails.get("vehicles").toString()+"']/following::div"
							+ "[contains(.,'"+AlertDetails.get("email").toString()+"')]"));
				break;
				default:
					ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name").toString()+"']/following::div"
							+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
							+ "[text()='"+AlertDetails.get("vehicles").toString()+"']/following::div"
							+ "[contains(.,'"+AlertDetails.get("sms").toString()+"')]"));
				break;
				}
				break;
				
			case "Select Vehicle":
				switch (activesite) {
				case "US":
					ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name").toString()+"']/following::div"
							+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
							+ "[contains(.,'"+AlertDetails.get("vehicle_name").toString()+"')]/following::div"
							+ "[text()='"+AlertDetails.get("email").toString()+"']"));
				break;
				default:
					ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name").toString()+"']/following::div"
							+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
							+ "[contains(.,'"+AlertDetails.get("vehicle_name").toString()+"')]/following::div"
							+ "[contains(.,'"+AlertDetails.get("sms").toString()+"')]"));
				break;
				}
				break;
			}	
			break;
			
		case "RSS":
			
			switch (AlertDetails.get("vehicles").toString()) {
			
			case "All Vehicles":
				
				ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name").toString()+"']/following::div"
						+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
						+ "[text()='"+AlertDetails.get("vehicles").toString()+"']"));
				break;
				
			case "Select Vehicle":
				
				ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name").toString()+"']/following::div"
						+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
						+ "[contains(.,'"+AlertDetails.get("vehicle_name").toString()+"')]"));
				break;
			}	
			break;
			
		}
		
		if(!DoThis.isObjectDisplayed(ActiveAlert, ""+AlertDetails.get("alert_type").toString()+" Alert in Active tab validation", "Y")) {assertTrue(false);}
	
		
	}
	
	public static void SearchAlertinFeed(@SuppressWarnings("rawtypes") Dictionary AlertDetails) throws InterruptedException {
		
		//Click Feed Tab >> Fleet Alerts
		DoThis.click(NotificationPage.FeedTab.tbFeed, "Y");
		if(DoThis.isObjectAvailable(NotificationPage.FeedTab.pnlFleetAlerts, "Fleet Alerts Panel", "N")) {
			DoThis.click(NotificationPage.FeedTab.pnlFleetAlerts, "Y");
		}
		
		
		//Wait for Alerts to load in Feed Tab
		if(!DoThis.isObjectAvailable(NotificationPage.FeedTab.objNoDataAvailable, "No data available", "N")) {
			DoThis.WaitForElementToLoad(NotificationPage.FeedTab.btnTableOptions);
		}
		
		//Click More Filters
		DoThis.click(NotificationPage.FeedTab.btnMoreFilters, "Y");
		
		//Select Vehicle if Not All Vehicle is selected during creation
		switch (AlertDetails.get("vehicles").toString()) {
		
		case "All Vehicles":
			Reporter.ReportEventNoImage("All Vehicles is selected in Filters");
			break;
			
		case "Select Vehicle":
			DoThis.click(NotificationPage.FeedTab.objVehicles, "Y");
			
			WebElement optnVehicle = Constant.driver.findElement(By.xpath("//div[contains(@class,'option')][contains(text(),'"+AlertDetails.get("vehicle_name").toString()+"')]"));
			DoThis.click(optnVehicle, "Y");
			break;
		}
		
		//Set Contact Type based on selected option during Alert creation
		DoThis.click(NotificationPage.FeedTab.drpdwnContactType, "Y");
		
		switch (AlertDetails.get("contact_type").toString()) {
			
		case "Email":
			DoThis.click(NotificationPage.FeedTab.drpdwnContactTypeOptionEmail, "Y");
			break;
			
		case "SMS":
			DoThis.click(NotificationPage.FeedTab.drpdwnContactTypeOptionSMS, "Y");
			break;
			
		case "RSS":
			DoThis.click(NotificationPage.FeedTab.drpdwnContactTypeOptionRSS, "Y");
			break;
			
		case "All":
			DoThis.click(NotificationPage.FeedTab.drpdwnContactTypeOptionAll, "Y");
			break;
		}
	
		//Set Alert Type based on selected option during Alert creation
		DoThis.click(NotificationPage.FeedTab.drpdwnAlertType, "Y");
		
		switch (AlertDetails.get("alert_type").toString()) {
		
		case "Driver ID":
		if(DoThis.isObjectAvailable(NotificationPage.FeedTab.drpdwnAlertTypeDriverIDOption, AlertDetails.get("alert_type").toString()+" Alert Option", "NA")) {
			DoThis.click(NotificationPage.FeedTab.drpdwnAlertTypeDriverIDOption, "Y");
			
			if(DoThis.isObjectAvailable(NotificationPage.FeedTab.objNoDataAvailable, "No Data Available validation", "NA")) {
				Reporter.ReportEventNoImage(AlertDetails.get("alert_type").toString()+" Alert Option is not yet triggered");
			}else {
				Reporter.ReportEventNoImage(AlertDetails.get("alert_type").toString()+" Alert Option is found in Feed tab");
			}
			
		}else {
			Reporter.ReportEventNoImage(AlertDetails.get("alert_type").toString()+" Alert Option is not yet triggered");
		}
			break;
		
		case "Events":
			switch(AlertDetails.get("trigger_event").toString()) {
			
			case "Ignition":
				if(DoThis.isObjectAvailable(NotificationPage.FeedTab.drpdwnAlertTypeIgnitionOnOffOption, AlertDetails.get("alert_type").toString()+" Alert Option", "NA")) {
					DoThis.click(NotificationPage.FeedTab.drpdwnAlertTypeIgnitionOnOffOption, "Y");
					
					if(DoThis.isObjectAvailable(NotificationPage.FeedTab.objNoDataAvailable, "No Data Available validation", "NA")) {
						Reporter.ReportEventNoImage(AlertDetails.get("alert_type").toString()+" Alert Option is not yet triggered");
					}else {
						Reporter.ReportEventNoImage(AlertDetails.get("alert_type").toString()+" Alert Option is found in Feed tab");
					}
					
				}else {
					Reporter.ReportEventNoImage(AlertDetails.get("alert_type").toString()+" Alert Option is not yet triggered");
				}
				break;
				
			case "Power":
				//Add code here for future reference
				break;
				
			case "Max Speed Exceeded":
				//Add code here for future reference
				break;
				
			//Add for all Events
			
			}
			break;
		
		case "Geofence":
			
			if(DoThis.isObjectAvailable(NotificationPage.FeedTab.drpdwnAlertTypeEnteringLeavingGeofenceOption, AlertDetails.get("alert_type").toString()+" Alert Option", "NA")) {
				DoThis.click(NotificationPage.FeedTab.drpdwnAlertTypeEnteringLeavingGeofenceOption, "Y");
				
				if(DoThis.isObjectAvailable(NotificationPage.FeedTab.objNoDataAvailable, "No Data Available validation", "NA")) {
					Reporter.ReportEventNoImage(AlertDetails.get("alert_type").toString()+" Alert Option is not yet triggered");
				}else {
					Reporter.ReportEventNoImage(AlertDetails.get("alert_type").toString()+" Alert Option is found in Feed tab");
				}
				
			}else {
				Reporter.ReportEventNoImage(AlertDetails.get("alert_type").toString()+" Alert Option is not yet triggered");
			}
			
			break;
			
		}
	
	}
	
	public static void DeleteAlertinActive(String browser, @SuppressWarnings("rawtypes") Dictionary AlertDetails) throws InterruptedException {
		
		DoThis.click(NotificationPage.ActiveTab.tbActive, "Y");
		
		//Wait for Alerts to load in Active Tab
		DoThis.Wait(NotificationPage.ActiveTab.lstbtnPencilIcon.get(0));
		
		//Search for Alert
		DoThis.clear(browser, NotificationPage.ActiveTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.ActiveTab.txtbxSearch, AlertDetails.get("alert_name").toString(), "Y");
		
		WebElement ActiveAlertDeleteButton = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name")+"']/ancestor::div[contains(@class,'rt-tr -odd')]/descendant::button[@type='button']"));
		DoThis.click(ActiveAlertDeleteButton, "Y");
		
		DoThis.Wait(NotificationPage.ActiveTab.btnDelete);
		DoThis.click(NotificationPage.ActiveTab.btnDelete, "Y");
		
		if(DoThis.isObjectAvailable(NotificationPage.ActiveTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Alert deleted successfully toaster message is displayed");
		}

	}
	public static void DownloadAlert() throws InterruptedException{
		
		if(!DoThis.isObjectAvailable(NotificationPage.FeedTab.tbFeed, "Feed Tab", "NA")) {
			DoThis.click(NotificationPage.btnNotification, "Y");
		}
		
		//Click Feed Tab >> Fleet Alerts
		DoThis.click(NotificationPage.FeedTab.tbFeed, "Y");
		if(DoThis.isObjectAvailable(NotificationPage.FeedTab.pnlFleetAlerts, "Fleet Alerts Panel", "N")) {
			DoThis.click(NotificationPage.FeedTab.pnlFleetAlerts, "Y");
		}

		if(DoThis.isObjectAvailable(NotificationPage.FeedTab.objNoDataAvailable, "No data available", "NA")){
			Reporter.ReportEventNoImage("No data is available!!");
		}else {

			while(!DoThis.isObjectAvailable(NotificationPage.FeedTab.btnTableOptions, "Cogwheels Options", "N")) {
				//Wait for Alerts to load in Feed Tab
				DoThis.WaitForElementToLoad(NotificationPage.FeedTab.btnTableOptions);
			}
			
			//Download Report
			ConfigReader config = new ConfigReader();
			if(config.getPlatform().equals("linux")) {
				// Just validate Download button is displayed as there is an known issue in download when run in TeamCity
				DoThis.isObjectDisplayed(NotificationPage.FeedTab.btnDownload, "Download button validation", "Y");
			}else {
				DoThis.click(NotificationPage.FeedTab.btnDownload, "Y");
			}
		}
		
	}
	
	public static void EditAlertinActive(String browser, @SuppressWarnings("rawtypes") Dictionary AlertDetails, String activesite) throws InterruptedException {
		
		//Wait for Alerts to load in Active Tab
		DoThis.Wait(NotificationPage.ActiveTab.lstbtnPencilIcon.get(0));

		//Search for Alert
		DoThis.clear(browser, NotificationPage.ActiveTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.ActiveTab.txtbxSearch, AlertDetails.get("alert_name").toString(), "Y");
		
		//Wait for Element to load
		DoThis.WaitForElementToLoad(NotificationPage.ActiveTab.btnCogWheel);
		
		WebElement ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("alert_name").toString()+"']/following::div"
				+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
				+ "[text()='"+AlertDetails.get("vehicles").toString()+"']/following::div"
				+ "[text()='"+AlertDetails.get("email").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(ActiveAlert, ""+AlertDetails.get("alert_type").toString()+" Alert in Active tab validation", "Y")) {assertTrue(false);}
		
		//Click Edit button
		DoThis.click(NotificationPage.ActiveTab.btnEdit, "Y");
		
		switch(AlertDetails.get("alert_type").toString()) {
		
		case "Driver ID":
			
			DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxAlertName, "N");
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxAlertName, AlertDetails.get("updated_alert_name").toString(), "Y");
			
				switch(AlertDetails.get("notification_type").toString()) {
				
				case "ID Detected":
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDNotDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxInvalidID, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDDetected, "Y");
					break;
					
				case "ID Not Detected":
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDNotDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxInvalidID, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDNotDetected, "Y");
					break;
					
				case "Invalid ID":
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDNotDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxInvalidID, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxInvalidID, "Y");
					break;
					
				case "All":
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDNotDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxInvalidID, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxIDNotDetected, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxInvalidID, "Y");
					break;	
				}
			break;
		
		case "Events":
				
			DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxAlertName, "N");
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxAlertName, AlertDetails.get("updated_alert_name").toString(), "Y");
			
			DoThis.click(NotificationPage.AddAlertTab.drpdwnCategory, "Y");
				switch(AlertDetails.get("event_category").toString()) {
				
				case "Trigger Events":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnCategoryTriggerEvents, "Y");
					DoThis.click(NotificationPage.AddAlertTab.drpdwnEvent, "Y");
						switch(AlertDetails.get("trigger_event").toString()) {
						
						case "Ignition":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnEventIgnition, "Y");
							
							switch(AlertDetails.get("ignition_event").toString()) {
							
							case "Ignition ON":
								DoThis.click(NotificationPage.AddAlertTab.chkbxIgnitionOn, "Y");
								break;
								
							case "Ignition OFF":
								DoThis.click(NotificationPage.AddAlertTab.chkbxIgnitionOff, "Y");
								break;
							
							case "All":
								DoThis.click(NotificationPage.AddAlertTab.chkbxIgnitionOn, "Y");
								DoThis.click(NotificationPage.AddAlertTab.chkbxIgnitionOff, "Y");
								break;
							}	
							break;
							
						case "Power":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnEventPower, "Y");
							
							switch(AlertDetails.get("power_event").toString()) {
							
							case "Power ON":
								DoThis.click(NotificationPage.AddAlertTab.chkbxPowerOn, "Y");
								break;
								
							case "Power OFF":
								DoThis.click(NotificationPage.AddAlertTab.chkbxPowerOff, "Y");
								break;
							
							case "All":
								DoThis.click(NotificationPage.AddAlertTab.chkbxPowerOn, "Y");
								DoThis.click(NotificationPage.AddAlertTab.chkbxPowerOff, "Y");
								break;
							}	
							break;
							
						case "Max Speed Exceeded":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnEventMaxSpeedExceeded, "Y");
							break;
						
						}
					break;
					
				case "Threshold Events":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnCategoryThresholdEvents, "Y");
					DoThis.click(NotificationPage.AddAlertTab.drpdwnEvent, "Y");
					switch(AlertDetails.get("threshold_event").toString()) {
					
					case "Excessive Drive Time":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventExcessiveDriveTime, "Y");
						
						DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxExcessiveDriveTime, "N");
						DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxExcessiveDriveTime, AlertDetails.get("excessive_drive_time_duration").toString(), "Y");
						break;
						
					case "Stationary Vehicle":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventStationaryVehicle, "Y");
						
						DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxStationaryDuration, "N");
						DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxStationaryDuration, AlertDetails.get("stationary_duration").toString(), "Y");
						
						//Add line of code to switch between Ignition ON, On or OFF
						
					case "Speeding":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventSpeeding, "Y");
						
						DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxSpeedOver, "N");
						DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxSpeedOver, AlertDetails.get("speed_over").toString(), "Y");
						break;
					
					}
					break;
					
				case "Static Bit Events":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnCategoryStaticBitEvents, "Y");
					DoThis.click(NotificationPage.AddAlertTab.drpdwnEvent, "Y");
					
					switch(AlertDetails.get("static_bit_event").toString()) {
					
					case "Brake":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventBrake, "Y");
						
						DoThis.click(NotificationPage.AddAlertTab.drpdwnStatus, "Y");
						switch (AlertDetails.get("status").toString()) {
						
						case "ON":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOn, "Y");
							break;
						
						case "OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOff, "Y");
							break;
							
						case "ON & OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionONAndOff, "Y");
							break;
						
						}
						break;
						
					case "Door 3":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventDoor3, "Y");
						
						DoThis.click(NotificationPage.AddAlertTab.drpdwnStatus, "Y");
						switch (AlertDetails.get("status").toString()) {
						
						case "ON":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOn, "Y");
							break;
						
						case "OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOff, "Y");
							break;
							
						case "ON & OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionONAndOff, "Y");
							break;
						
						}
						break;
						
					case "Door 4":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventDoor4, "Y");
						
						DoThis.click(NotificationPage.AddAlertTab.drpdwnStatus, "Y");
						switch (AlertDetails.get("status").toString()) {
						
						case "ON":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOn, "Y");
							break;
						
						case "OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionOff, "Y");
							break;
							
						case "ON & OFF":
							DoThis.click(NotificationPage.AddAlertTab.drpdwnStatusOptionONAndOff, "Y");
							break;
						
						}
						break;
					
					}
					break;
				
				case "Sensor Events":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnCategorySensorEvents, "Y");
					DoThis.click(NotificationPage.AddAlertTab.drpdwnEvent, "Y");
					
					switch(AlertDetails.get("sensor_event").toString()) {
					
					case "Engine":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventEngine, "Y");
						break;
						
					case "Coolant":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventCoolant, "Y");
						break;
						
					case "Temp 1":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventTemp1, "Y");
						break;
					
					}
					
					DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxNotificationDelay, "N");
					DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxNotificationDelay, AlertDetails.get("notification_delay").toString(), "Y");
					
					DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxLowTemp, "N");
					DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxLowTemp, AlertDetails.get("low_temp").toString(), "Y");
					
					DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxHighTemp, "N");
					DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxHighTemp, AlertDetails.get("high_temp").toString(), "Y");
					
					break;
					
				case "Fuel Events":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnCategoryFuelEvents, "Y");
					DoThis.click(NotificationPage.AddAlertTab.drpdwnEvent, "Y");
					
					switch(AlertDetails.get("fuel_event").toString()) {
					
					case "Fuel Loss":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventFuelLoss, "Y");
						break;
						
					case "Fuel Gain":
						DoThis.click(NotificationPage.AddAlertTab.drpdwnEventFuelGain, "Y");
						break;
					}
					break;
		
			}
			DoThis.click(NotificationPage.AddAlertTab.btnAddType, "Y");
			break;
		
		case "Geofence":
						
			DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxAlertName, "N");
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxAlertName, AlertDetails.get("updated_alert_name").toString(), "Y");
			
				switch(AlertDetails.get("notification_type").toString()) {
				
				case "Enter Geofence":
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterGeofence, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveGeofence, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterGeofence, "Y");
					break;
				
				case "Leave Geofence":
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterGeofence, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveGeofence, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveGeofence, "Y");
					break;
					
				case "All":
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterGeofence, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveGeofence, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterGeofence, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveGeofence, "Y");
					break;
				}
			break;
			
		case "System Zones":
					
			DoThis.clear(browser, NotificationPage.AddAlertTab.txtbxAlertName, "N");
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxAlertName, AlertDetails.get("updated_alert_name").toString(), "Y");
			
				switch(AlertDetails.get("notification_type").toString()) {
				
				case "Enter Zone":
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterSystemZone, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveSystemZone, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterSystemZone, "Y");
					break;
				
				case "Leave Zone":
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterSystemZone, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveSystemZone, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveSystemZone, "Y");
					break;
					
				case "All":
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterSystemZone, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveSystemZone, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxEnterSystemZone, "Y");
					DoThis.click(NotificationPage.AddAlertTab.chkbxLeaveSystemZone, "Y");
					break;
				}
			
			//Select Zone Type in the dropdown
			DoThis.click(NotificationPage.AddAlertTab.drpdwnZoneType, "Y");
			switch (AlertDetails.get("zone_type").toString()) {
			
			case "Country borders":
				switch (activesite) {
				case "ME":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnZoneTypeOptionTollGates, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.AddAlertTab.drpdwnZoneTypeOptionCountryborders, "Y");
				break;
				}
				break;
				
			case "10km from country border":
				switch (activesite) {
				case "ME":
				case "US":
					DoThis.click(NotificationPage.AddAlertTab.drpdwnZoneTypeOptionProvinceborders, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.AddAlertTab.drpdwnZoneTypeOption10kmFromCountryborder, "Y");
				break;
				}
				break;
			
			}
			
			//Select All in System zones dropdown
			DoThis.click(NotificationPage.AddAlertTab.drpdwnSystemzones, "Y");
			DoThis.click(NotificationPage.AddAlertTab.drpdwnSystemzonesOptionsAll, "Y");
			
			break;
		
		}
		
		switch (AlertDetails.get("contact_type").toString()) {
		
		case "Email":
			DoThis.click(NotificationPage.AddAlertTab.btnEmail, "Y");
			
			//Remove existing email
			DoThis.click(NotificationPage.ActiveTab.objContactXIcon.get(0), "Y");
			
			DoThis.Wait(NotificationPage.AddAlertTab.txtbxEmail);
		
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxEmail, AlertDetails.get("updated_email").toString(), "Y");
			
			//Click Add Option
			DoThis.Wait(NotificationPage.AddAlertTab.objAddEmailOption);
			DoThis.click(NotificationPage.AddAlertTab.objAddEmailOption, "Y");
	
			break;
		
		case "SMS":
			DoThis.click(NotificationPage.AddAlertTab.btnSMS, "Y");
			
			//Remove existing SMS
			DoThis.click(NotificationPage.ActiveTab.objContactXIcon.get(0), "Y");
			
			DoThis.Wait(NotificationPage.AddAlertTab.txtbxSMS);
			
			DoThis.sendkeys(NotificationPage.AddAlertTab.txtbxSMS, AlertDetails.get("updated_SMS").toString(), "Y");
			
			//Click Add Option
			DoThis.Wait(NotificationPage.AddAlertTab.objSelectSMSOption.get(0));
			DoThis.click(NotificationPage.AddAlertTab.objSelectSMSOption.get(0), "Y");
			
			break;
			
		case "RSS":
			DoThis.click(NotificationPage.AddAlertTab.btnRSS, "Y");
			
			DoThis.Wait(NotificationPage.AddAlertTab.btnGoToRSSFeed);
			DoThis.click(NotificationPage.AddAlertTab.btnGoToRSSFeed, "Y");
			break;
		}
		
		//Click Save button
		DoThis.click(NotificationPage.ActiveTab.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(NotificationPage.ActiveTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Alert updated successfully toaster message is displayed");
		}
		
		
	}
	
	public static void SearchUpdatedAlertinActive(String browser, @SuppressWarnings("rawtypes") Dictionary AlertDetails) throws InterruptedException {
		
		//Wait for Alerts to load in Active Tab
		DoThis.Wait(NotificationPage.ActiveTab.lstbtnPencilIcon.get(0));
		
		//Search for Alert
		DoThis.clear(browser, NotificationPage.ActiveTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.ActiveTab.txtbxSearch, AlertDetails.get("updated_alert_name").toString(), "Y");
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(NotificationPage.ActiveTab.btnCogWheel);
		
		WebElement ActiveAlert = Constant.driver.findElement(By.xpath("//div[text()='"+AlertDetails.get("updated_alert_name").toString()+"']/following::div"
				+ "[text()='"+AlertDetails.get("alert_type").toString()+"']/following::div"
				+ "[text()='"+AlertDetails.get("vehicles").toString()+"']/following::div"
				+ "[text()='"+AlertDetails.get("updated_email").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(ActiveAlert, ""+AlertDetails.get("alert_type").toString()+" Alert in Active tab validation", "Y")) {assertTrue(false);}
		
	}
	
	public static void SearchForAFeed(String browser, @SuppressWarnings("rawtypes") Dictionary AlertDetails) throws InterruptedException {
		
		//Click Feed Tab >> Fleet Alerts
		DoThis.click(NotificationPage.FeedTab.tbFeed, "Y");
		if(DoThis.isObjectAvailable(NotificationPage.FeedTab.pnlFleetAlerts, "Fleet Alerts Panel", "N")) {
			DoThis.click(NotificationPage.FeedTab.pnlFleetAlerts, "Y");
		}
	
		//Wait for Alerts to load in Feed Tab
		if(!DoThis.isObjectAvailable(NotificationPage.FeedTab.objNoDataAvailable, "No data available", "NA")) {
			DoThis.Wait(NotificationPage.FeedTab.btnTableOptions);
		}
		
		//Search via Vehicle Keyword
		DoThis.clear(browser, NotificationPage.FeedTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.FeedTab.txtbxSearch, AlertDetails.get("vehicle_name").toString(), "Y");
		
	}
	
	public static void SearchAndDeleteAlertinActiveCreatedByAutomation(String browser, @SuppressWarnings("rawtypes") Dictionary AlertDetails) throws InterruptedException {
		
		//Navigate to Notification >> Active Tab
		if(!DoThis.isObjectAvailable(NotificationPage.FeedTab.tbFeed, "Feed Tab", "NA")) {
			DoThis.click(NotificationPage.btnNotification, "Y");
		}
		
		DoThis.click(NotificationPage.ActiveTab.tbActive, "Y");
	
		//Search for Alert created by Automation
		DoThis.clear(browser, NotificationPage.ActiveTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.ActiveTab.txtbxSearch, AlertDetails.get("search_keyword").toString(), "Y");
		
		//Count the Alerts
		
		if(DoThis.isObjectAvailable(NotificationPage.ActiveTab.objNoDataAvailable, "No data available", "NA")) {
			Reporter.ReportEventNoImage("No Alert is created by Automation");
		}else {
			DoThis.WaitForElementToLoad(NotificationPage.ActiveTab.btnCogWheel);
			
			//Set to 100 rows if page size is displayed
			if(DoThis.isObjectAvailable(NotificationPage.ActiveTab.objPageSize, "Page Size object", "NA")) {
				DoThis.selectByValue(NotificationPage.ActiveTab.objPageSize, "100", "Y");
			}
			
			int countsize = NotificationPage.ActiveTab.btnListIconTrash.size();
			//Delete All Alerts
			for(int i=0; i<countsize; i++) {
				
				DoThis.WaitForElementToLoad(NotificationPage.ActiveTab.btnIconTrash);
				DoThis.click(NotificationPage.ActiveTab.btnIconTrash, "Y");
				DoThis.click(NotificationPage.ActiveTab.btnDelete, "Y");
			
			}
		}
		
	}
				
}
