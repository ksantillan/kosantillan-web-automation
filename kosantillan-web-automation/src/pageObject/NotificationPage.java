package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationPage {

		@FindBy(xpath="//*[local-name()='svg'][contains(@data-icon,'bell')]/parent::span[1]")
		public static WebElement btnNotification;	
		
		@FindBy(xpath="//span[contains(@class,'HoverPanel')][contains(@class,'HeaderMessage')]")
		public static WebElement objHoverPanelNotification;
		
		@FindBy(xpath="//*[local-name()='svg'][contains(@data-icon,'ellipsis-v')]")
		public static WebElement btnEllipsisV;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')][text()='Cost alerts']")
		public static WebElement chckbxLabelCostAlerts;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')][text()='Fleet alerts']")
		public static WebElement chckbxLabelFleetAlerts;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')][text()='Driver ID']")
		public static WebElement chckbxLabelDriverID;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')][text()='Events']")
		public static WebElement chckbxLabelEvents;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')][contains(text(),'Geofence')]")
		public static WebElement chckbxLabelGeofences;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')][text()='System zones']")
		public static WebElement chckbxLabelSystemzones;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')][text()='Reminders']")
		public static WebElement chckbxLabelReminders;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')][text()='Vehicles']")
		public static WebElement chckbxLabelVehicles;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')][text()='Drivers']")
		public static WebElement chckbxLabelDrivers;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')][text()='Tasks']")
		public static WebElement chckbxLabelTasks;
	
	public static class FeedTab {
		
		@FindBy(xpath="//*[text()='Feed']")
		public static WebElement tbFeed;	
		
		@FindBy(xpath="//div[contains(@class,'ToggleDropdown-inner')]")
		public static WebElement btnTableOptions;
		
		@FindBy(xpath="//span[text()='Fleet alerts']/parent::div[contains(@class,'FleetPanel')]")
		public static WebElement pnlFleetAlerts;
		
		@FindBy(xpath="//*[text()='Search']/ancestor::div[contains(@class,'SearchBar')]/input[@type='text']")
		public static WebElement txtbxSearch;
		
		@FindBy(xpath="//*[text()='Start Date']/preceding::input[1]")
		public static WebElement dtpckrStartDate;
		
		@FindBy(xpath="//*[text()='End Date']/preceding::input[1]")
		public static WebElement dtpckrEndDate;
		
		@FindBy(xpath="//button[text()='More Filters']")
		public static WebElement btnMoreFilters;
		
		@FindBy(xpath="//div[text()='Vehicle']/following::div[1]")
		public static WebElement txtbxVehicle;
		
		@FindBy(xpath="//div[text()='Contact Type']/following::span[contains(@class,'Dropdown-active')]")
		public static WebElement drpdwnContactType;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='All']")
		public static WebElement drpdwnContactTypeOptionAll;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Email']")
		public static WebElement drpdwnContactTypeOptionEmail;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='SMS']")
		public static WebElement drpdwnContactTypeOptionSMS;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='RSS']")
		public static WebElement drpdwnContactTypeOptionRSS;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Alerts']")
		public static WebElement drpdwnContactTypeOptionAlerts;
		
		@FindBy(xpath="//div[text()='Alert Type']/parent::div[1]")
		public static WebElement drpdwnAlertType;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Driver ID']")
		public static WebElement drpdwnAlertTypeDriverIDOption;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Ignition On/Off']")
		public static WebElement drpdwnAlertTypeIgnitionOnOffOption;
		
		@FindBy(xpath="//div[text()='No data available']")
		public static WebElement objNoDataAvailable;
		
		@FindBy(xpath="//div[contains(@class,'rt-tbody')]//div[1]//div[1]//div[3]//span[text()='Reminders']")
		public static WebElement objFirstReminders;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Entering/Leaving Geofence']")
		public static WebElement drpdwnAlertTypeEnteringLeavingGeofenceOption;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[4]/span[text()='Reminders']")
		public static List<WebElement> objTypeReminders;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[2]//span[contains(text(),'/')]")
		public static List<WebElement> objDateTime;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[5]")
		public static List<WebElement> objVehicle;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[6]")
		public static List<WebElement> objMessage;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[8]")
		public static List<WebElement> objStatus;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[8][contains(.,'SMS')]")
		public static List<WebElement> objStatusSMS;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[8][contains(.,'Email')]")
		public static List<WebElement> objStatusEmails;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[8][contains(.,'Email')]")
		public static WebElement objStatusEmail;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[7]")
		public static List<WebElement> objContactType;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[7]/span[text()='SMS']")
		public static List<WebElement> objContactTypeSMS;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[7]/span[text()='RSS']")
		public static List<WebElement> objContactTypeRSSs;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[7]/span[text()='RSS']")
		public static WebElement objContactTypeRSS;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[7]/span[text()='Email']")
		public static WebElement objContactTypeEmail;
		
		@FindBy(xpath="//div[@role='rowgroup']/descendant::div[7]/span[text()='Email']")
		public static List<WebElement> objContactTypeEmails;
		
		@FindBy(xpath="//*[contains(@data-icon,'download')]/parent::button[@type='button']")
		public static WebElement btnDownload;
		
		@FindBy(xpath="//div[text()='Vehicle']/parent::div[1]/following::div[1]")
		public static WebElement objVehicles;
		
		@FindBy(xpath="//*[local-name()='svg'][contains(@class,'redo')]/parent::button[@type='button']")
		public static WebElement btnRefresh;
		
		@FindBy(xpath="//div[contains(@class,'ReactTable')]")
		public static WebElement objFleetAlertTable;
		
		@FindBy(xpath="//a[text()='Add Alert']")
		public static WebElement btnAddAlert;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='cogs']/parent::button[1]")
		public static WebElement btnCogWheel;
		
		@FindBy(xpath="//span[contains(@class,'Checkbox-label')]")
		public static List<WebElement> lstColumnHeader;
		
		@FindBy(xpath="//span[text()='Select Columns']")
		public static WebElement objSelectColumns;
		
		@FindBy(xpath="//div[contains(@class,'resizable-header')]/span[text()='Date/Time']")
		public static WebElement objcolumnDateTime;
		
		@FindBy(xpath="//div[contains(@class,'resizable-header')]/span[text()='Group']")
		public static WebElement objcolumnGroup;
		
		@FindBy(xpath="//div[contains(@class,'resizable-header')]/span[text()='Type']")
		public static WebElement objcolumnType;
		
		@FindBy(xpath="//div[contains(@class,'resizable-header')]/span[text()='Vehicle']")
		public static WebElement objcolumnVehicle;
		
		@FindBy(xpath="//div[contains(@class,'resizable-header')]/span[text()='Message']")
		public static WebElement objcolumnMessage;
		
		@FindBy(xpath="//div[contains(@class,'resizable-header')]/span[text()='Contact Type']")
		public static WebElement objcolumnContactType;
		
		@FindBy(xpath="//div[contains(@class,'resizable-header')]/span[text()='Status']")
		public static WebElement objcolumnStatus;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Reminders']")
		public static WebElement drpdwnAlertTypeRemindersOption;
		
	}
	
	public static class ActiveTab {
		
		@FindBy(xpath="//*[text()='Active']")
		public static WebElement tbActive;
		
		@FindBy(xpath="//*[text()='Fleet alerts']")
		public static WebElement pnlFleetAlerts;
		
		@FindBy(xpath="//*[text()='Search']/ancestor::div[contains(@class,'SearchBar')]/input[@type='text']")
		public static WebElement txtbxSearch;
		
		@FindBy(xpath="//a[@type='button']")
		public static List<WebElement> lstbtnPencilIcon;
		
		@FindBy(xpath="//button[text()='Delete']")
		public static WebElement btnDelete;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
		
		@FindBy(xpath="//div[@role='gridcell']//a[@type='button']")
		public static WebElement btnEdit;
		
		@FindBy(xpath="//button[text()='Save']")
		public static WebElement btnSave;
		
		@FindBy(xpath="//strong[text()='Insert Email']/preceding::div[1]/following::div[1]/descendant::*[local-name()='svg']")
		public static List<WebElement> objContactXIcon;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='cogs']/parent::button[1]")
		public static WebElement btnCogWheel;
		
		@FindBy(xpath="//span[text()='Geofence']/parent::div[contains(@class,'Input')]/descendant::div[@class=' css-1wy0on6']//div[1]//*[local-name()='svg']")
		public static WebElement objGeofenceXIcon;
		
		@FindBy(xpath="//span[@class='select-wrap -pageSizeOptions']//select")
		public static WebElement objPageSize;
		
		@FindBy(xpath="//*[local-name()='svg'][contains(@class,'trash-alt')]/parent::button[1]")
		public static WebElement btnIconTrash;
		
		@FindBy(xpath="//*[local-name()='svg'][contains(@class,'trash-alt')]/parent::button[1]")
		public static List<WebElement> btnListIconTrash;
		
		@FindBy(xpath="//div[text()='No data available']")
		public static WebElement objNoDataAvailable;
		

	}
	
	public static class AddAlertTab {
		
		@FindBy(xpath="//*[text()='Add Alert'][contains(@class,'alertssetup')]")
		public static WebElement tbAddAlert;
		
		@FindBy(xpath="//span[text()='Driver ID']/parent::div[contains(@class,'FleetPanel')]")
		public static WebElement pnlDriverID;
		
		@FindBy(xpath="//*[text()='Alert Description']/ancestor::div[contains(@class,'TextInput')]/input[@name='name']")
		public static WebElement txtbxAlertName;
		
		@FindBy(xpath="//label[contains(@for,'idDetected')]")
		public static WebElement chkbxIDDetected;
		
		@FindBy(xpath="//label[contains(@for,'idNotDetected')]")
		public static WebElement chkbxIDNotDetected;
		
		@FindBy(xpath="//label[contains(@for,'idInvalid')]")
		public static WebElement chkbxInvalidID;
		
		@FindBy(xpath="//label[contains(@for,'allVehicles')]")
		public static WebElement chkbxAllVehicles;
		
		@FindBy(xpath="//input[@name='allVehicles']")
		public static WebElement objAllVehicles;
						
		@FindBy(xpath="//div[text()='Select Vehicles']/parent::div[1]/following::div[1]")
		public static WebElement objSelectVehicles;
		
		@FindBy(xpath="//div[text()='Select Vehicles']/parent::div[1]/descendant::input[1]")
		public static WebElement txtbxSelectVehicles;
		
		@FindBy(xpath="//div[@class='Checkbox']")
		public static WebElement objSelectVehiclesFirstOption;
		
		@FindBy(xpath="//button[text()='Email']")
		public static WebElement btnEmail;
		
		@FindBy(xpath="//div[text()='Emails']/parent::div[1]/descendant::input[1]")
		public static WebElement txtbxEmail;
		
		@FindBy(xpath="//div[contains(@id,'option-2')]")
		public static WebElement objAddEmailOption;
		
		@FindBy(xpath="//div[contains(@id,'react-select')][contains(@id,'option')]")
		public static List<WebElement> objSelectSMSOption;
		
		@FindBy(xpath="//button[text()='SMS']")
		public static WebElement btnSMS;
		
		@FindBy(xpath="//div[text()='SMS']/parent::div[1]/descendant::input[1]")
		public static WebElement txtbxSMS;
		
		@FindBy(xpath="//button[text()='RSS']")
		public static WebElement btnRSS;
		
		@FindBy(xpath="//a[text()='Go to RSS feed']")
		public static WebElement btnGoToRSSFeed;
		
		@FindBy(xpath="//label[contains(@for,'schedule.sendAnytime')]")
		public static WebElement chkbxSendAnytime;
		
		@FindBy(xpath="//button[text()='Create']")
		public static WebElement btnCreate;
	
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
		
		@FindBy(xpath="//span[text()='Events']")
		public static WebElement pnlEvents;
		
		@FindBy(xpath="//div[text()='Category']/parent::div[contains(@class,'Dropdown')]")
		public static WebElement drpdwnCategory;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Trigger Events']")
		public static WebElement drpdwnCategoryTriggerEvents;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Threshold Events']")
		public static WebElement drpdwnCategoryThresholdEvents;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Static Bit Events']")
		public static WebElement drpdwnCategoryStaticBitEvents;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Sensor Events']")
		public static WebElement drpdwnCategorySensorEvents;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Fuel Events']")
		public static WebElement drpdwnCategoryFuelEvents;
		
		@FindBy(xpath="//div[text()='Event']/parent::div[contains(@class,'Dropdown')]")
		public static WebElement drpdwnEvent;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Ignition']")
		public static WebElement drpdwnEventIgnition;
		
		@FindBy(xpath="//label[contains(@for,'notificationTypes.ignitionOn')]")
		public static WebElement chkbxIgnitionOn;
		
		@FindBy(xpath="//label[contains(@for,'notificationTypes.ignitionOff')]")
		public static WebElement chkbxIgnitionOff;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Power']")
		public static WebElement drpdwnEventPower;
		
		@FindBy(xpath="//label[contains(@for,'notificationTypes.powerOn')]")
		public static WebElement chkbxPowerOn;
		
		@FindBy(xpath="//label[contains(@for,'notificationTypes.powerOff')]")
		public static WebElement chkbxPowerOff;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Max Speed Exceeded']")
		public static WebElement drpdwnEventMaxSpeedExceeded;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Unscheduled Usage']")
		public static WebElement drpdwnEventUnscheduledUsage;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Harsh Acceleration']")
		public static WebElement drpdwnEventHarshAcceleration;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Harsh Braking']")
		public static WebElement drpdwnEventHarshBraking;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Harsh Cornering/Turning']")
		public static WebElement drpdwnEventHarshCorneringTurning;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Trip Summary']")
		public static WebElement drpdwnEventTripSummary;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Toll Gate']")
		public static WebElement drpdwnEventTollGate;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Excessive Idling']")
		public static WebElement drpdwnEventExcessiveIdling;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Motion Detected']")
		public static WebElement drpdwnEventMotionDetected;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Failure to Arrive On Time']")
		public static WebElement drpdwnEventFailureToArriveOnTime;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Over Rev']")
		public static WebElement drpdwnEventOverRev;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Engine Diagnostics']")
		public static WebElement drpdwnEventEngineDiagnostics;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Temperature Diagnostics']")
		public static WebElement drpdwnEventTemperatureDiagnostics;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Excessive Drive Time']")
		public static WebElement drpdwnEventExcessiveDriveTime;
		
		@FindBy(xpath="//input[contains(@name,'excessiveDriveTime')]")
		public static WebElement txtbxExcessiveDriveTime;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Stationary Vehicle']")
		public static WebElement drpdwnEventStationaryVehicle;
		
		@FindBy(xpath="//input[contains(@name,'stationaryDuration')]")
		public static WebElement txtbxStationaryDuration;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Speeding']")
		public static WebElement drpdwnEventSpeeding;
		
		@FindBy(xpath="//input[contains(@name,'speedOver')]")
		public static WebElement txtbxSpeedOver;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Over the Road Speed']")
		public static WebElement drpdwnEventOvertheRoadSpeed;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Over RPM']")
		public static WebElement drpdwnEventOverRPM;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Brake']")
		public static WebElement drpdwnEventBrake;
		
		@FindBy(xpath="//div[text()='Status']/parent::div[contains(@class,'Dropdown')]")
		public static WebElement drpdwnStatus;
		
		@FindBy(xpath="//div[@id='ON']")
		public static WebElement drpdwnStatusOptionOn;
		
		@FindBy(xpath="//div[@id='OFF']")
		public static WebElement drpdwnStatusOptionOff;
		
		@FindBy(xpath="//div[@id='ON,OFF']")
		public static WebElement drpdwnStatusOptionONAndOff;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Door 3']")
		public static WebElement drpdwnEventDoor3;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Door 4']")
		public static WebElement drpdwnEventDoor4;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Engine']")
		public static WebElement drpdwnEventEngine;
		
		@FindBy(xpath="//input[contains(@name,'hysteresis')]")
		public static WebElement txtbxNotificationDelay;
		
		@FindBy(xpath="//input[contains(@name,'low_temp')]")
		public static WebElement txtbxLowTemp;
		
		@FindBy(xpath="//input[contains(@name,'high_temp')]")
		public static WebElement txtbxHighTemp;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Coolant']")
		public static WebElement drpdwnEventCoolant;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Temp 1']")
		public static WebElement drpdwnEventTemp1;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Fuel Loss']")
		public static WebElement drpdwnEventFuelLoss;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Fuel Gain']")
		public static WebElement drpdwnEventFuelGain;
		
		@FindBy(xpath="//button[text()='Add Type']")
		public static WebElement btnAddType;
		
		@FindBy(xpath="//span[text()='Geofence']")
		public static WebElement pnlGeofence;
		
		@FindBy(xpath="//label[contains(@for,'enterGeofence')]")
		public static WebElement chkbxEnterGeofence;
		
		@FindBy(xpath="//label[contains(@for,'leaveGeofence')]")
		public static WebElement chkbxLeaveGeofence;
		
		@FindBy(xpath="//div[text()='Geofence']/ancestor::div[contains(@class,'Input')]/descendant::div[contains(@class,'indicatorContainer')]")
		public static WebElement drpdwnGeofence;
		
		@FindBy(xpath="//div[contains(@id,'option-1')]")
		public static WebElement drpdwnGeofenceFirstOption;
		
		@FindBy(xpath="//span[text()='System zones']")
		public static WebElement pnlSystemzones;
		
		@FindBy(xpath="//label[@for='enterSystemZone']")
		public static WebElement chkbxEnterSystemZone;
		
		@FindBy(xpath="//label[@for='leaveSystemZone']")
		public static WebElement chkbxLeaveSystemZone;
		
		@FindBy(xpath="//*[text()='Zone Type']/ancestor::div[contains(@class,'Input')]/descendant::div[contains(@class,'InputDropdown-container')]")
		public static WebElement drpdwnZoneType;
			
		@FindBy(xpath="//div[contains(@id,'item')][contains(text(),'Country border')]")
		public static WebElement drpdwnZoneTypeOptionCountryborders;
		
		@FindBy(xpath="//div[contains(@id,'item')][contains(text(),'Toll Gates')]")
		public static WebElement drpdwnZoneTypeOptionTollGates;
		
		@FindBy(xpath="//div[contains(@id,'item')][contains(text(),'10km from')]")
		public static WebElement drpdwnZoneTypeOption10kmFromCountryborder;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Province borders']")
		public static WebElement drpdwnZoneTypeOptionProvinceborders;
		
		@FindBy(xpath="//div[text()='System zones']/ancestor::div[contains(@class,'Input')]/descendant::div[contains(@class,'indicatorContainer')]")
		public static WebElement drpdwnSystemzones;
		
		@FindBy(xpath="//div[contains(@id,'option')][text()='All']")
		public static WebElement drpdwnSystemzonesOptionsAll;

	}
	
	public static class RemindersTab {
		
		@FindBy(xpath="//*[text()='Reminders'][contains(@class,'alertsreminders')]")
		public static WebElement tbReminders;
		
		@FindBy(xpath="//a[text()='Add Reminders']")
		public static WebElement btnAddReminders;
		
		@FindBy(xpath="//span[text()='Vehicle']/preceding::input[1]")
		public static WebElement rdnbtnVehicle;
		
		@FindBy(xpath="//span[text()='Driver']/preceding::input[1]")
		public static WebElement rdnbtnDriver;
		
		@FindBy(xpath="//*[text()='Reminder type']/ancestor::button[contains(@class,'Dropdown')]")
		public static WebElement drpdwnReminderType;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Time']")
		public static WebElement drpdwnReminderTypeOptionTime;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Distance']")
		public static WebElement drpdwnReminderTypeOptionDistance;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Worktime']")
		public static WebElement drpdwnReminderTypeOptionWorktime;
		
		@FindBy(xpath="//div[contains(@id,'item')][contains(text(),'Czas')]")
		public static WebElement drpdwnReminderTypeOptionCzas;
		
		@FindBy(xpath="//div[contains(@id,'item')][contains(text(),'Dystans')]")
		public static WebElement drpdwnReminderTypeOptionDystans;
		
		@FindBy(xpath="//div[contains(@id,'item')][contains(text(),'Zegar')]")
		public static WebElement drpdwnReminderTypeOptionZegar;
		
		@FindBy(xpath="//div[contains(@id,'item')][contains(text(),'Tempo')]")
		public static WebElement drpdwnReminderTypeOptionTempo;
		
		@FindBy(xpath="//div[contains(@id,'item')][contains(text(),'Distância')]")
		public static WebElement drpdwnReminderTypeOptionDistância;
		
		@FindBy(xpath="//div[contains(@id,'item')][contains(text(),'Horas')]")
		public static WebElement drpdwnReminderTypeOptionHoras;
		
		@FindBy(xpath="//input[contains(@name,'rmName')]")
		public static WebElement txtbxReminderName;
		
		@FindBy(xpath="//*[text()='Vehicle']/ancestor::div[@class='InputDropdown-container']")
		public static WebElement drpdwnVehicle;
		
		@FindBy(xpath="//*[text()='Driver']/ancestor::div[@class='InputDropdown-container']")
		public static WebElement drpdwnDriver;
		
		@FindBy(xpath="//div[contains(@id,'option-0')]")
		public static WebElement drpdwnVehicleFirstOption;
		
		@FindBy(xpath="//div[contains(@id,'option')]")
		public static List<WebElement> drpdwnVehicleOptions;
		
		@FindBy(xpath="//div[contains(@id,'option-0')]")
		public static WebElement drpdwnDriverFirstOption;
		
		@FindBy(xpath="//div[contains(@id,'option')]")
		public static List<WebElement> drpdwnDriverOptions;
		
		@FindBy(xpath="//input[contains(@name,'rmSettingAfter.value')]")
		public static WebElement txtbxTriggerAfter;
		
		@FindBy(xpath="//input[contains(@name,'rmSettingAfter.type')]")
		public static WebElement txtbxTriggerAfterType;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Days']")
		public static WebElement txtbxTriggerAfterTypeDays;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Months']")
		public static WebElement txtbxTriggerAfterTypeMonths;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Weeks']")
		public static WebElement txtbxTriggerAfterTypeWeeks;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Years']")
		public static WebElement txtbxTriggerAfterTypeYears;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Dias']")
		public static WebElement txtbxTriggerAfterTypeDias;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Meses']")
		public static WebElement txtbxTriggerAfterTypeMeses;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Semanas']")
		public static WebElement txtbxTriggerAfterTypeSemanas;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Anos']")
		public static WebElement txtbxTriggerAfterTypeAnos;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Days of operation']")
		public static WebElement txtbxTriggerAfterTypeDaysofoperation;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Months of operation']")
		public static WebElement txtbxTriggerAfterTypeMonthsofoperation;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Horas de Trabalho']")
		public static WebElement txtbxTriggerAfterTypeHorasdeTrabalho;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Anos de Trabalho']")
		public static WebElement txtbxTriggerAfterTypeAnosdeTrabalho;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Dias de Trabalho']")
		public static WebElement txtbxTriggerAfterTypeDiasdeTrabalho;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Meses de Trabalho']")
		public static WebElement txtbxTriggerAfterTypeMesesdeTrabalho;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Hours of operation']")
		public static WebElement txtbxTriggerAfterTypeHoursofoperation;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Years of operation']")
		public static WebElement txtbxTriggerAfterTypeYearsofoperation;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Kilometers']")
		public static WebElement txtbxTriggerAfterTypeKilometers;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Thousand kms']")
		public static WebElement txtbxTriggerAfterTypeThousandkms;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Kms']")
		public static WebElement txtbxTriggerAfterTypeKms;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Miles']")
		public static WebElement txtbxTriggerAfterTypeMiles;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Mil Kms']")
		public static WebElement txtbxTriggerAfterTypeMilKms;

		@FindBy(xpath="//div[contains(@id,'item')][text()='Thousand miles']")
		public static WebElement txtbxTriggerAfterTypeThousandmiles;
		
		@FindBy(xpath="//input[@name='rmSettingNotify.value']")
		public static WebElement txtbxNotifyInAdvance;
		
		@FindBy(xpath="//input[@name='rmSettingNotify.type']")
		public static WebElement txtbxNotifyInAdvanceType;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Days']")
		public static WebElement txtbxNotifyInAdvanceTypeDays;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Months']")
		public static WebElement txtbxNotifyInAdvanceTypeMonths;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Weeks']")
		public static WebElement txtbxNotifyInAdvanceTypeWeeks;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Years']")
		public static WebElement txtbxNotifyInAdvanceTypeYears;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Dias']")
		public static WebElement txtbxNotifyInAdvanceTypeDias;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Meses']")
		public static WebElement txtbxNotifyInAdvanceTypeMeses;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Semanas']")
		public static WebElement txtbxNotifyInAdvanceTypeSemanas;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Anos']")
		public static WebElement txtbxNotifyInAdvanceTypeAnos;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Days of operation']")
		public static WebElement txtbxNotifyInAdvanceTypeDaysofoperation;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Months of operation']")
		public static WebElement txtbxNotifyInAdvanceTypeMonthsofoperation;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Hours of operation']")
		public static WebElement txtbxNotifyInAdvanceTypeHoursofoperation;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Years of operation']")
		public static WebElement txtbxNotifyInAdvanceTypeYearsofoperation;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Horas de Trabalho']")
		public static WebElement txtbxNotifyInAdvanceTypeHorasdeTrabalho;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Anos de Trabalho']")
		public static WebElement txtbxNotifyInAdvanceTypeAnosdeTrabalho;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Dias de Trabalho']")
		public static WebElement txtbxNotifyInAdvanceTypeDiasdeTrabalho;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Meses de Trabalho']")
		public static WebElement txtbxNotifyInAdvanceTypeMesesdeTrabalho;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Kilometers']")
		public static WebElement txtbxNotifyInAdvanceTypeKilometers;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Thousand kms']")
		public static WebElement txtbxNotifyInAdvanceTypeThousandkms;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Kms']")
		public static WebElement txtbxNotifyInAdvanceTypeKms;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Miles']")
		public static WebElement txtbxNotifyInAdvanceTypeMiles;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Mil Kms']")
		public static WebElement txtbxNotifyInAdvanceTypeMilKms;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Thousand miles']")
		public static WebElement txtbxNotifyInAdvanceTypeThousandmiles;
		
		@FindBy(xpath="//span[text()='Always']/preceding::input[1]")
		public static WebElement rdnbtnAlways;
		
		@FindBy(xpath="//span[text()='Once']/preceding::input[1]")
		public static WebElement rdnbtnOnce;
		
		@FindBy(xpath="//span[text()='Expiration date']/preceding::input[1]")
		public static WebElement rdnbtnExpirationDate;
		
		@FindBy(xpath="//input[contains(@value,'email')]")
		public static WebElement rdnbtnEmail;
		
		@FindBy(xpath="//div[text()='Emails']/parent::div[1]/descendant::input[1]")
		public static WebElement txtbxEmail;
		
		@FindBy(xpath="//div[contains(@id,'option-2')]")
		public static WebElement objAddOption;
		
		@FindBy(xpath="//input[contains(@value,'sms')]")
		public static WebElement rdnbtnSMS;
		
		@FindBy(xpath="//div[text()='SMS']/parent::div[1]/descendant::input[1]")
		public static WebElement txtbxSMS;
		
		@FindBy(xpath="//button[@type='submit']")
		public static WebElement btnSave;
		
		@FindBy(xpath="//button[@type='submit']")
		public static WebElement btnUpdate;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
		
		@FindBy(xpath="//button[@type='button']//*[local-name()='svg'][contains(@class,'trash')]")
		public static WebElement btnDelete;
		
		@FindBy(xpath="//*[text()='Search']/ancestor::div[contains(@class,'SearchBar')]/input[@type='text']")
		public static WebElement txtbxSearch;

		@FindBy(xpath="//strong[text()='Insert Email']/ancestor::div[contains(@class,'Alert-reminderSettings')]/descendant::div[@class=' css-1wy0on6']//div[1]//*[local-name()='svg']")
		public static WebElement objEmailNotificationXIcon;
		
		@FindBy(xpath="//strong[text()='Insert SMS Alert']/ancestor::div[contains(@class,'Alert-reminderSettings')]/descendant::div[@class=' css-1wy0on6']//div[1]//*[local-name()='svg']")
		public static WebElement objSMSNotificationXIcon;
		
		@FindBy(xpath="//button[text()='Add Reminder Templates']")
		public static WebElement btnAddReminderTemplates;
		
		@FindBy(xpath="//input[contains(@name,'ctTemplateName')]")
		public static WebElement txtbxTemplateName;
		
		@FindBy(xpath="//label[@id='0']//input[contains(@name,'ctType')]")
		public static WebElement rdbtnVehicle;
		
		@FindBy(xpath="//label[@id='1']//input[@name='ctType']")
		public static WebElement rdbtnDriver;
		
		@FindBy(xpath="//input[contains(@name,'ctSetting.value')]")
		public static WebElement txtbxTemplateDefaultValidPeriodValue;
		
		@FindBy(xpath="//label[text()='Default valid period:']/parent::div[1]/descendant::*[text()='Type']/ancestor::div[contains(@class,'TextInput')]/input[1]")
		public static WebElement drpdwnTemplateDefaultValidPeriodType;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Days']")
		public static WebElement drpdwnTemplateDefaultValidPeriodTypeOptionDays;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Months']")
		public static WebElement drpdwnTemplateDefaultValidPeriodTypeOptionMonths;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Weeks']")
		public static WebElement drpdwnTemplateDefaultValidPeriodTypeOptionWeeks;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Years']")
		public static WebElement drpdwnTemplateDefaultValidPeriodTypeOptionYears;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Dias']")
		public static WebElement drpdwnTemplateDefaultValidPeriodTypeOptionDias;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Meses']")
		public static WebElement drpdwnTemplateDefaultValidPeriodTypeOptionMeses;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Semanas']")
		public static WebElement drpdwnTemplateDefaultValidPeriodTypeOptionSemanas;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Anos']")
		public static WebElement drpdwnTemplateDefaultValidPeriodTypeOptionAnos;
		
		@FindBy(xpath="//div[contains(@class,'CreateTemplateModal-content-form-button')]//button[contains(@type,'submit')]")
		public static WebElement btnCreateRemindersTemplateSave;
		
		@FindBy(xpath="//*[text()='Search']/ancestor::div[contains(@class,'SearchBar')]/input[@type='text']")
		public static WebElement txtbxRemindersTemplateSearch;
		
		@FindBy(xpath="//div[contains(@id,'react-select')][contains(@id,'option')]")
		public static List<WebElement> objSelectSMSOption;
		
		@FindBy(xpath="//div[text()='Template Name']/preceding::input[1]")
		public static WebElement drpdwnTemplateName;
		
		@FindBy(xpath="//button[text()='Yes, Confirm']")
		public static WebElement btnYesConfirm;
		
		@FindBy(xpath="//div[text()='No data available']")
		public static WebElement objNodataavailable;
		
		@FindBy(xpath="//div[@class='rt-tr -odd']/div[@class='rt-td']/div[contains(@class,'TextInput')]/input[contains(@class,'TextInput')]")
		public static WebElement txtbxReminderTemplateName;
		
		@FindBy(xpath="//div[@class='rt-tr -odd']/div[2]//div[contains(@class,'TextInput')]/input[contains(@class,'TextInput')]")
		public static WebElement drpdwnReminderTemplateType;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Vehicle']")
		public static WebElement drpdwnReminderTemplateTypeOptionVehicle;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Driver']")
		public static WebElement drpdwnReminderTemplateTypeOptionDriver;
		
		@FindBy(xpath="//div[@class='rt-tr -odd']/div[3]/div[1]/div[1]/div[contains(@class,'TextInput')]/input[1]")
		public static WebElement txtbxReminderTemplatePeriodValue;
		
		@FindBy(xpath="//div[@class='rt-tr -odd']/div[3]/div[1]/div[2]/div[contains(@class,'InputDropdown')]/div[1]/div[contains(@class,'TextInput')]/input[contains(@class,'TextInput')]")
		public static WebElement drpdwnReminderTemplatePeriod;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Days']")
		public static WebElement drpdwnReminderTemplatePeriodOptionDays;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Months']")
		public static WebElement drpdwnReminderTemplatePeriodOptionMonths;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Weeks']")
		public static WebElement drpdwnReminderTemplatePeriodOptionWeeks;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Years']")
		public static WebElement drpdwnReminderTemplatePeriodOptionYears;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Dias']")
		public static WebElement drpdwnReminderTemplatePeriodOptionDias;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Meses']")
		public static WebElement drpdwnReminderTemplatePeriodOptionMeses;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Semanas']")
		public static WebElement drpdwnReminderTemplatePeriodOptionSemanas;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Anos']")
		public static WebElement drpdwnReminderTemplatePeriodOptionAnos;
		
		@FindBy(xpath="//div[@class='rt-tr -odd']/descendant::*[local-name()='svg'][contains(@data-icon,'check')]")
		public static WebElement btnCheck;
		
		@FindBy(xpath="//div[@class='rt-tr -odd']/descendant::*[local-name()='svg'][contains(@data-icon,'trash')]/parent::button[1]")
		public static WebElement btnReminderTemplateDelete;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='cogs']/parent::button[1]")
		public static WebElement btnCogWheel;
		
		@FindBy(xpath="//div[text()='No data available']")
		public static WebElement objNoDataAvailable;
		
		@FindBy(xpath="//div[contains(@class,'Stats-value')]")
		public static WebElement objTotalRemindersValue;
		
		@FindBy(xpath="//*[local-name()='svg'][contains(@class,'trash-alt')]/parent::button[1]")
		public static WebElement btnIconTrash;
		
		@FindBy(xpath="//div[contains(@class,'Stats-value')]")
		public static WebElement objTotalRemindersTemplateValue;
		
		@FindBy(xpath="//div[@id='chat-button-fa']/ancestor::div[contains(@class,'sc-')]/div[contains(@class,'sc-')]")
		public static WebElement objFleetChatbot;
		
		
	}
	
	public static class SMSTab {
		
		@FindBy(xpath="//a[normalize-space()='Message Credits']")
		public static WebElement tbMessageCredits;
		
		@FindBy(xpath="//span[text()='Sent This Month']/preceding::div[1]")
		public static WebElement objSentThisMonth;
		
		@FindBy(xpath="//span[text()='Monthly Limit']/preceding::div[1]")
		public static WebElement objMonthlyLimit;
		
		@FindBy(xpath="//span[text()='Remaining']/preceding::div[1]")
		public static WebElement objRemaining;
		
		@FindBy(xpath="//button[text()='Edit Limits']")
		public static WebElement btnEditLimits;
		
		@FindBy(xpath="//span[text()='SMS Bundle Purchase History']/parent::div[contains(@class,'SectionHeader')]")
		public static WebElement objHeaderSMSBundlePurchaseHistory;
		
		@FindBy(xpath="//div[@class='rt-resizable-header-content']/span[text()='Date/Time']")
		public static WebElement objcolumheaderDateTime;
		
		@FindBy(xpath="//div[@class='rt-resizable-header-content']/span[text()='Type']")
		public static WebElement objcolumheaderType;
		
		@FindBy(xpath="//div[@class='rt-resizable-header-content']/span[text()='Count']")
		public static WebElement objcolumheaderCount;
		
		@FindBy(xpath="//label[contains(@for,'setIndividually')]")
		public static WebElement chkbxSetIndividually;
		
		@FindBy(xpath="//label[contains(@for,'setIndividually')]/preceding::input[@id='setIndividually']")
		public static WebElement objSetIndividually;
		
		@FindBy(xpath="//div[contains(@class,'EditSMSLimits-input')]/input[contains(@class,'input')]")
		public static WebElement txtbxTotalLimit;
		
		@FindBy(xpath="//div[contains(@class,'EditSMSLimits')]/button[text()='Submit']")
		public static WebElement btnSubmit;
		
		@FindBy(xpath="//input[@id='0-row']")
		public static WebElement txtbxLimitFirstVehicle;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
		
		@FindBy(xpath="//button[text()='Buy More']")
		public static WebElement btnBuyMore;
		
		@FindBy(xpath="//div[text()='300'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect300SMS;
		
		@FindBy(xpath="//div[text()='3000'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect3000SMS;
		
		@FindBy(xpath="//div[text()='2000'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect2000SMS;
		
		@FindBy(xpath="//div[text()='100'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect100SMS;
		
		@FindBy(xpath="//div[text()='50'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect50SMS;
		
		@FindBy(xpath="//div[text()='600'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect600SMS;
		
		@FindBy(xpath="//div[text()='1500'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect1500SMS;
		
		@FindBy(xpath="//div[text()='1000'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect1000SMS;
		
		@FindBy(xpath="//div[text()='10'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect10SMS;
		
		@FindBy(xpath="//div[text()='5'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect5SMS;
		
		@FindBy(xpath="//div[text()='20'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect20SMS;
		
		@FindBy(xpath="//div[text()='200'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect200SMS;
		
		@FindBy(xpath="//div[text()='500'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect500SMS;
		
		@FindBy(xpath="//div[text()='250'][text()='SMS']/following::button[1]")
		public static WebElement btnSelect250SMS;
		
		@FindBy(xpath="//div[@class='BuyMoreSMS-buttons']/button[text()='Submit']")
		public static WebElement btnBuyMoreSMSSubmit;
		
		@FindBy(xpath="//div[@class='rt-tr-group']/div[contains(@class,'rt-tr')]/div[2]")
		public static List<WebElement> tblSMSTableTypeRow;
		
		@FindBy(xpath="//div[@class='rt-tr-group']/div[contains(@class,'rt-tr')]/div[3]")
		public static List<WebElement> tblSMSTableCountRow;
		
		@FindBy(xpath="//div[contains(@class,'col-xs-6 util-textRight')]//strong")
		public static WebElement objPriceMo;
		
		@FindBy(xpath="//button[contains(@aria-label,'open menu')]")
		public static WebElement drpdwnSMSCount;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='300']")
		public static WebElement drpdwnSMSCountOption300;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='250']")
		public static WebElement drpdwnSMSCountOption250;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='10']")
		public static WebElement drpdwnSMSCountOption10;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='100']")
		public static WebElement drpdwnSMSCountOption100;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='50']")
		public static WebElement drpdwnSMSCountOption50;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='3000']")
		public static WebElement drpdwnSMSCountOption3000;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='2000']")
		public static WebElement drpdwnSMSCountOption2000;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='600']")
		public static WebElement drpdwnSMSCountOption600;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='500']")
		public static WebElement drpdwnSMSCountOption500;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='1500']")
		public static WebElement drpdwnSMSCountOption1500;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='1000']")
		public static WebElement drpdwnSMSCountOption1000;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='5']")
		public static WebElement drpdwnSMSCountOption5;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='20']")
		public static WebElement drpdwnSMSCountOption20;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='200']")
		public static WebElement drpdwnSMSCountOption200;
	
	}
		
		
	
	
}
