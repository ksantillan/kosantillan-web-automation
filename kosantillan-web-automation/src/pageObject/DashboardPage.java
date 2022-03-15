package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
		@FindBy(xpath="//a[@id='DASHBOARD']")
		public static WebElement nvBrDashboard;

	public static class OverViewTab {
		
		@FindBy(xpath="//div[contains(@class,'three-dots__Container')]/ancestor::div[contains(@class,'WidgetHeader')]")
		public static List<WebElement> objWidgetsHeader;
		
		@FindBy(xpath="//*[name()='svg'][@data-icon='ellipsis-v']/parent::button[1]")
		public static List<WebElement> objWidgetHeaders;
		
		@FindBy(xpath="//*[name()='svg'][@data-icon='ellipsis-v']/parent::button[1]")
		public static WebElement objWidgetHeader;
		
		@FindBy(xpath="//button[text()='Skip This Step']")
		public static WebElement btnSkipThisStep;
		
		@FindBy(xpath="//a[text()='Add Widgets']")
		public static WebElement btnAddWidgets;
		
		@FindBy(xpath="//button[text()='Change Industry']")
		public static WebElement btnChangeIndustry;
		
		@FindBy(xpath="//button[text()='No']")
		public static WebElement btnNo;
		
		@FindBy(xpath="//button[text()='Yes']")
		public static WebElement btnYes;
		
		@FindBy(xpath="//p[text()='Construction']/parent::div[1]")
		public static WebElement btnConstruction;
		
		@FindBy(xpath="//p[text()='Servicing']/parent::div[1]")
		public static WebElement btnServicing;
		
		@FindBy(xpath="//p[text()='Insurance']/parent::div[1]")
		public static WebElement btnInsurance;
		
		@FindBy(xpath="//p[text()='Logistics']/parent::div[1]")
		public static WebElement btnLogistics;
		
		@FindBy(xpath="//p[text()='Manufacturing & Wholesale']/parent::div[1]")
		public static WebElement btnManufacturingAndWholesale;
		
		@FindBy(xpath="//p[text()='Leasing/Rental']/parent::div[1]")
		public static WebElement btnLeasingRental;
		
		@FindBy(xpath="//p[text()='Food & Beverages']/parent::div[1]")
		public static WebElement btnFoodAndBeverages;
		
		@FindBy(xpath="//p[text()='Transportation']/parent::div[1]")
		public static WebElement btnTransportation;
		
		@FindBy(xpath="//p[text()='Other']/parent::div[1]")
		public static WebElement btnOther;
		
		@FindBy(xpath="//p[text()='Vehicle Usage']/parent::div[1]")
		public static WebElement btnVehicleUsage;
		
		@FindBy(xpath="//p[text()='Trips']/parent::div[1]")
		public static WebElement btnTrips;
		
		@FindBy(xpath="//p[text()='Fleet Performance']/parent::div[1]")
		public static WebElement btnFleetPerformance;
		
		@FindBy(xpath="//p[text()='Vehicle Idling']/parent::div[1]")
		public static WebElement btnVehicleIdling;
		
		@FindBy(xpath="//p[text()='Driver Behavior & Safety']/parent::div[1]")
		public static WebElement btnDriverBehaviorAndSafety;
		
		@FindBy(xpath="//p[text()='Fleet Running Costs']/parent::div[1]")
		public static WebElement btnFleetRunningCosts;
		
		@FindBy(xpath="//button[text()='Create Dashboard']")
		public static WebElement btnCreateDashboard;
		
		@FindBy(xpath="//div[contains(@class,'SisenseDashboard__ControlBarSubBlock')]/div[contains(@class,'SearchBar')]/input[1]")
		public static WebElement txtbxSearch;
		
		@FindBy(xpath="//input[contains(@class,'vehicle-group')]")
		public static WebElement drpdwnVehicleGroups;
		
		@FindBy(xpath="//div[contains(@id,'item')]")
		public static List<WebElement> drpdwnVehicleGroupsOptions;
		
		@FindBy(xpath="//div[text()='Registration Numbers']/parent::div[1]")
		public static WebElement drpdwnRegistrationNumbers;
		
		@FindBy(xpath="//div[text()='Date Range']/preceding::input[1]")
		public static WebElement drpdwnDateRange;
		
		@FindBy(xpath="//button[text()='More Filters']")
		public static WebElement btnMoreFilters;
		
		@FindBy(xpath="//div[text()='Vehicle Name']/parent::div[1]")
		public static WebElement drpdwnVehicleName;
		
		@FindBy(xpath="//div[text()='Vehicle Type']/parent::div[1]")
		public static WebElement drpdwnVehicleType;
		
		@FindBy(xpath="//div[text()='Vehicle Description']/parent::div[1]")
		public static WebElement drpdwnVehicleDescription;
		
		@FindBy(xpath="//div[text()='Vehicle Description 2']/parent::div[1]")
		public static WebElement drpdwnVehicleDescription2;
		
		@FindBy(xpath="//div[text()='Vehicle Description 3']/parent::div[1]")
		public static WebElement drpdwnVehicleDescription3;
		
		@FindBy(xpath="//*[name()='svg'][@data-icon='question']/parent::div[1]")
		public static WebElement btnHelp;
		
		@FindBy(xpath="//span[text()='Quick Tour']")
		public static WebElement lnkQuickTour;
		
		@FindBy(xpath="//div[text()='Search']/preceding::input[1]")
		public static WebElement txtbxHelpSearch;
		
		@FindBy(xpath="//div[text()='Change date selection']")
		public static WebElement objChangeDateSelection;
		
		@FindBy(xpath="//div[text()='Add widgets']")
		public static WebElement objAddWidgets;
		
		@FindBy(xpath="//div[text()='Delete widgets']")
		public static WebElement objDeleteWidgets;
		
		@FindBy(xpath="//div[text()='Make selection on widgets']")
		public static WebElement objMakeSelectionOnWidgets;
		
		@FindBy(xpath="//button[normalize-space()='Download Widgets']")
		public static WebElement objDownloadWidgets;
		
		@FindBy(xpath="//div[text()='Reorder widgets']")
		public static WebElement objReorderWidgets;
		
		@FindBy(xpath="//h4[normalize-space()='Change date selection']")
		public static WebElement objPopupChangeDateSelection;
		
		@FindBy(xpath="//button[normalize-space()='Next: Add widgets']")
		public static WebElement btnNextAddwidgets;
		
		@FindBy(xpath="//h4[normalize-space()='Add widgets']")
		public static WebElement objPopupAddwidgets;
		
		@FindBy(xpath="//button[normalize-space()='Next: Delete widgets']")
		public static WebElement btnNextDeletewidgets;
		
		@FindBy(xpath="//h4[normalize-space()='Delete widgets']")
		public static WebElement objPopupDeletewidgets;
		
		@FindBy(xpath="//button[normalize-space()='Next: Make selection on widgets']")
		public static WebElement btnNextMakeselectiononwidgets;
		
		@FindBy(xpath="//h4[normalize-space()='Make selection on widgets']")
		public static WebElement objPopupMakeselectiononwidgets;
		
		@FindBy(xpath="//button[normalize-space()='Next: Download widgets']")
		public static WebElement btnNextDownloadwidgets;
		
		@FindBy(xpath="//h4[normalize-space()='Download widgets']")
		public static WebElement objPopupDownloadwidgets;
		
		@FindBy(xpath="//button[normalize-space()='Next: Reorder widgets']")
		public static WebElement btnNextReorderwidgets;
		
		@FindBy(xpath="//h4[normalize-space()='Reorder widgets']")
		public static WebElement objPopupReorderwidgets;
		
		@FindBy(xpath="//h4[normalize-space()='Reorder widgets']/preceding::div[1]")
		public static WebElement btnReorderwidgetsCloseButton;
		
		@FindBy(xpath="//span[text()='Refueling Cost']/parent::div[1]")
		public static WebElement btnRefuelingCost;
		
		@FindBy(xpath="//span[text()='Total Fleet Cost']/parent::div[1]")
		public static WebElement btnTotalFleetCost;	
		
		@FindBy(xpath="//span[text()='Your Daily Operational Cost']/parent::div[1]")
		public static WebElement btnYourDailyOperationalCost;	
		
		@FindBy(xpath="//button[normalize-space()='Add Widget']")
		public static WebElement btnAddWidget;	
		
		@FindBy(xpath="//*[name()='svg'][contains(@class,'sc')]/parent::div[1]")
		public static List<WebElement> objWidgetList;	
		
		@FindBy(xpath="//*[name()='svg'][@data-icon='check']/parent::div[contains(@class,'sc')]/parent::div[contains(@class,'sc')]")
		public static List<WebElement> objSubWidgetList;	
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
	
		@FindBy(xpath="//span[normalize-space()='Delete']/parent::div[1]")
		public static WebElement btnDelete;
			
		@FindBy(xpath="//button[normalize-space()='Image']")
		public static WebElement btnDownloadImage;
		
		@FindBy(xpath="//button[normalize-space()='PDF']")
		public static WebElement btnDownloadPDF;
		
		@FindBy(xpath="//button[normalize-space()='CSV']")
		public static WebElement btnDownloadCSV;
		
		@FindBy(xpath="//button[text()='Download']")
		public static WebElement btnDownload;
		
		@FindBy(xpath="//*[text()='Scheduled Maintenance']")
		public static WebElement mdlScheduledMaintenance;
		
		@FindBy(xpath="//button[normalize-space()='Got it!']")
		public static WebElement btnGotIt;
		
		@FindBy(xpath="//div[@id='chat-button-fa']/ancestor::div[contains(@class,'sc-')]/div[contains(@class,'sc-')]")
		public static WebElement objFleetChatbot;
	
	}
	
	
	
}
