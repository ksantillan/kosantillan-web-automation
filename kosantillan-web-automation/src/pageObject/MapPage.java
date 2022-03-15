package pageObject;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapPage {
	
	@FindBy(xpath="//div[@class='Help-appVersion']")
	public static WebElement objAppVersion;	
	
	
	public static class Maptab {
		

		@FindBy(xpath="//a[@id='MAP']")
		public static WebElement navMap;	

	}
		
	public static class Fleettab {
		
		@FindBy(xpath="//a[@id='fleet-tab']")
		public static WebElement navFleet;	
		
		@FindBy(xpath="//div[@id='timeline']")
		public static WebElement btnTimeline;
		
		@FindBy(xpath="//div[@class='TimelineSlider']/parent::div[@class='Timeline-body']")
		public static WebElement objTimelineSliderBody;
		
		@FindBy(xpath="//div[@class='DetailsPanel-timelinesContainer']/div[contains(@class,'DetailsPanel-timeline')]")
		public static List<WebElement> lstDetailsPanelTimeline;
		
		@FindBy(xpath="//*[@data-icon='play-circle']")
		public static WebElement btnPlay;
		
		@FindBy(xpath="//*[@data-icon='pause-circle']")
		public static WebElement btnPause;
		
		@FindBy(xpath="//*[contains(@class,'speedButton')]")
		public static WebElement btnSpeed;
		
		@FindBy(xpath="//*[contains(@class,'download')]/ancestor::div[contains(@class,'IconButton')]")
		public static WebElement btnDownload;
		
		@FindBy(xpath="//div[@class='TimelineSlider-right']//button[@type='button']")
		public static WebElement cntrlbxSpeed;
		
		@FindBy(xpath="//div[contains(@class,'timeline-speed-box')]//button[@type='button']//*[local-name()='svg']")
		public static WebElement cntrlbxSpeedCloseIcon;
			
		@FindBy(xpath="//p[contains(.,'Download Trips')]")
		public static WebElement mdlhdrDownloadTrip;
		
		@FindBy(xpath="//div[text()='Excel File']")
		public static WebElement btnExcelFile;
		
		@FindBy(xpath="//div[text()='KML File']")
		public static WebElement btnKMLFile;
		
		@FindBy(xpath="//div[text()='GPX File']")
		public static WebElement btnGPXFile;
		
		@FindBy(xpath="//button[text()='Download']")
		public static WebElement btnDownloadTrips;
		
		@FindBy(xpath="//span[contains(.,'Stop')]/ancestor::div[contains(@class,'DataBlock')]/descendant::div[contains(@class,'DataBlock-value')]")
		public static WebElement dtBlockStop;
		
		@FindBy(xpath="//span[contains(.,'Kilometers')]/ancestor::div[contains(@class,'DataBlock')]/descendant::div[contains(@class,'DataBlock-value')]")
		public static WebElement dtBlockKilometers;
		
		@FindBy(xpath="//span[contains(.,'Miles')]/ancestor::div[contains(@class,'DataBlock')]/descendant::div[contains(@class,'DataBlock-value')]")
		public static WebElement dtBlockMiles;
		
		@FindBy(xpath="//span[contains(.,'DRIVING')]/ancestor::div[contains(@class,'DataBlock')]/descendant::div[contains(@class,'DataBlock-value')]")
		public static WebElement dtBlockDriving;
		
		@FindBy(xpath="//span[contains(.,'IDLING')]/ancestor::div[contains(@class,'DataBlock')]/descendant::div[contains(@class,'DataBlock-value')]")
		public static WebElement dtBlockIdling;
		
		@FindBy(xpath="//span[contains(.,'Ignition')]/ancestor::div[contains(@class,'DataBlock')]/descendant::div[contains(@class,'DataBlock-value')]")
		public static WebElement dtBlockIgnition;
		
		@FindBy(xpath="//div[@id='graph']")
		public static WebElement btnGraph;
		
		@FindBy(xpath="//div[@class='TimelineChart-dropdown']/descendant::*[@class='with-value']")
		public static WebElement drpdwnAltitude;
		
		@FindBy(xpath="//label[text()='Time']")
		public static WebElement tbTime;
		
		@FindBy(xpath="//label[text()='Distance']")
		public static WebElement tbDistance;
		
		@FindBy(xpath="//span[text()='Altitude']/parent::div[contains(@class,'sc')]")
		public static WebElement objAltitudeDefault;
		
		@FindBy(xpath="//div[contains(@class,'TimelineChart')]/descendant::button[contains(@class,'InputDropdown-button')]")
		public static WebElement drpdwnTime;
		
		@FindBy(xpath="//button[contains(.,'Expand Chart')]")
		public static WebElement btnExpandChart;
		
		@FindBy(xpath="//button[contains(.,'Minimise Chart')]")
		public static WebElement btnMinimiseChart;
		
		@FindBy(xpath="//button[contains(.,'Minimize Chart')]")
		public static WebElement btnMinimizeChart;
		
		@FindBy(xpath="//div[@id='table']")
		public static WebElement btnTable;
		
		@FindBy(xpath="//*[contains(@data-icon,'chevron-circle-right')]")
		public static List<WebElement> lstTripExpander;
		
		@FindBy(xpath="//div[contains(@class,'TimelineTables-trip is-expanded')]")
		public static WebElement objTripisExpanded;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[./text()='Time']")
		public static WebElement clmhdrTime;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[./text()='Status']")
		public static WebElement clmhdrStatus;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[./text()='Events']")
		public static WebElement clmhdrEvents;
		
		//Update to single element once bug - FABF-4209 is fixed. Fixed FABF-4209
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[./text()='Speed']")
		public static WebElement clmhdrSpeed;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[./text()='Road Speed']")
		public static WebElement clmhdrRoadSpeed;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[./text()='RPM']")
		public static WebElement clmhdrRPM;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[./text()='Location']")
		public static WebElement clmhdrLocation;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[./text()='Odometer']")
		public static WebElement clmhdrOdometer;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[./text()='Geofence']")
		public static WebElement clmhdrGeofence;
		
		@FindBy(xpath="//div[@id='recent']")
		public static WebElement btnRecent;
		
		@FindBy(xpath="//div[@id='older']")
		public static WebElement btnOlder;
		
		@FindBy(xpath="//button[normalize-space()='Follow Vehicle']")
		public static WebElement btnFollowVehicle;
		
		@FindBy(xpath="//span[@class='VehicleMarker-icon']//*[local-name()='svg']")
		public static List<WebElement> icnVehicleMarker;
		
		@FindBy(xpath="//div[contains(@class,'OpenLayerVehicleMarker')]")
		public static WebElement icnOpenLayerVehicleMarker;
	
		@FindBy(xpath="//*[contains(@class,'zoomIn')]")
		public static WebElement btnZoomIn;
		
		@FindBy(xpath="//*[contains(@class,'zoomOut')]")
		public static WebElement btnZoomOut;
		
		@FindBy(xpath="//span[normalize-space()='Layers']")
		public static WebElement tgldrpdwnLayers;
		
		@FindBy(xpath="//*[contains(@class,'Vehicle-details ')]")
		public static WebElement lstVehicleList;
		

		@FindBy(xpath="//span[@class='LeftPanel-noResult']")
		public static WebElement objVehicleListNoResult;
		
		@FindBy(xpath="//*[local-name()='svg'][@aria-label='XYChart']")
		public static WebElement objXYChart;
		
		@FindBy(xpath="//div[contains(@class,'TimelineSlider-timeline')]/following::div[text()='Today']")
		public static WebElement objTimelineSliderToday;
				
		@FindBy(xpath="//div[text()='No Events for Current Day']")
		public static WebElement objNoEventsForCurrentDay;
		
		@FindBy(xpath="//span[@class='Block-content-message'][text()='Downloading']")
		public static WebElement objBlockContentMessageDownloading;
				
		@FindBy(xpath="//div[contains(@class,'sc-')]/span[contains(@class,'sc-')]")
		public static List<WebElement> objCorrespondentTrips;
		
		@FindBy(xpath="//div[contains(@class,'sc-')]/span[contains(@class,'sc-')]")
		public static WebElement objCorrespondentTrip;
		
	
		//<---Layers
		
		@FindBy(xpath="//label[contains(@for,'geofences')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objGeofences;
		
		@FindBy(xpath="//label[contains(@for,'geofences')]")
		public static WebElement chckbxGeofences;
		
		@FindBy(xpath="//label[contains(@for,'landmarks')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objPointsofInterest;
		
		@FindBy(xpath="//label[contains(@for,'landmarks')]")
		public static WebElement chckbxPointsofInterest;
		
		@FindBy(xpath="//label[@for='livePositions']/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objLivePositions;
		
		@FindBy(xpath="//label[@for='livePositions']")
		public static WebElement chckbxLivePositions;
		
		@FindBy(xpath="//label[contains(@for,'maps')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objMaps;
		
		@FindBy(xpath="//label[contains(@for,'maps')]")
		public static WebElement chckbxMaps;
		
		@FindBy(xpath="//label[contains(@for,'geofenceLabels')]")
		public static WebElement chckbxGeofenceLabels;
		
		@FindBy(xpath="//label[contains(@for,'systemGeofences')]")
		public static WebElement chckbxSystemGeofences;
		
		@FindBy(xpath="//label[contains(@for,'userGeofences')]")
		public static WebElement chckbxUserGeofences;	
		
		@FindBy(xpath="//label[contains(@for,'pointsOfInterestLabels')]")
		public static WebElement chckbxPointOfInterestLabels;	
		
		@FindBy(xpath="//label[contains(@for,'livePositionLabels')]")
		public static WebElement chckbxLivePositionlabels;	
		
		@FindBy(xpath="//label[contains(@for,'livePositionClusters')]")
		public static WebElement chckbxClusters;	
		
		@FindBy(xpath="//label[contains(@for,'traffic')]")
		public static WebElement chckbxTraffic;	
		
		@FindBy(xpath="//label[contains(@for,'transit')]")
		public static WebElement chckbxTransit;	
		
		@FindBy(xpath="//label[contains(@for,'bicycle')]")
		public static WebElement chckbxBicycle;	
		
		@FindBy(xpath="//label[contains(@for,'alerts')]")
		public static WebElement chckbxAlerts;	
		
		@FindBy(xpath="//label[contains(@for,'sensors')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objSensors;
		
		@FindBy(xpath="//label[contains(@for,'sensors')]")
		public static WebElement chckbxSensors;
		
		@FindBy(xpath="//label[contains(@for,'doorOpen')]")
		public static WebElement chckbxDoorOpen;
		
		@FindBy(xpath="//label[contains(@for,'gearChange')]")
		public static WebElement chckbxGearChange;
		
		@FindBy(xpath="//label[contains(@for,'overRpm')]")
		public static WebElement chckbxOverRPM;
	
		@FindBy(xpath="//label[contains(@for,'seatBelt')]")
		public static WebElement chckbxSeatBelt;
		
		@FindBy(xpath="//label[contains(@for,'indicators')]")
		public static WebElement chckbxIndicators;
		
		@FindBy(xpath="//label[contains(@for,'hazard')]")
		public static WebElement chckbxHazard;
		
		@FindBy(xpath="//label[contains(@for,'handbrake')]")
		public static WebElement chckbxHandbrake;
		
		@FindBy(xpath="//label[contains(@for,'speeding')][@class='Checkbox-box']")
		public static WebElement chckbxSpeeding;
		
		@FindBy(xpath="//label[contains(@for,'reversing')]")
		public static WebElement chckbxReversing;
		
		@FindBy(xpath="//label[contains(@for,'lights')]")
		public static WebElement chckbxLights;
		
		@FindBy(xpath="//label[contains(@for,'power')]")
		public static WebElement chckbxPower;
		
		@FindBy(xpath="//label[contains(@for,'motion')]")
		public static WebElement chckbxMotion;
		
		@FindBy(xpath="//label[contains(@for,'idle')]")
		public static WebElement chckbxIdle;
		
		@FindBy(xpath="//label[contains(@for,'horn')]")
		public static WebElement chckbxHorn;
		
		@FindBy(xpath="//label[contains(@for,'corner')]")
		public static WebElement chckbxCorner;
		
		@FindBy(xpath="//label[contains(@for,'diagnosticError')]")
		public static WebElement chckbxDiagnosticError;
		
		@FindBy(xpath="//label[contains(@for,'driverId')]")
		public static WebElement chckbxDriverID;
		
		@FindBy(xpath="//label[contains(@for,'roaming')]")
		public static WebElement chckbxRoaming;
		
		@FindBy(xpath="//label[contains(@for,'privacy')]")
		public static WebElement chckbxPrivacy;
		
		//Layers --->
		
		//<--- Left Panel search
		
		@FindBy(xpath="//div[contains(@class,'css-tlfecz-indicatorContainer')]")
		public static WebElement btndwncaretSearch;
		
		@FindBy(xpath="//div[contains(@id,'option')][text()='Fleet Search']")
		public static WebElement slctrFleetSearch;

		@FindBy(xpath="//div[contains(@id,'option')][text()='Places Search']")
		public static WebElement slctrPlacesSearch;
		
		@FindBy(xpath="//div[contains(@id,'option')][text()='Coordinate Search']")
		public static WebElement slctrCoordinateSearch;
		
		@FindBy(xpath="//*[contains(.,'Fleet Search')]/ancestor::*[contains(@class,'search-textInput')]/descendant::input[contains(@class,'TextInput')]")
		public static WebElement txtbxFleetSearch;
		
		@FindBy(xpath="//*[contains(.,'Places Search')]/ancestor::*[contains(@class,'search-textInput')]/descendant::input[contains(@class,'TextInput')]")
		public static WebElement txtbxPlacesSearch;
		
		@FindBy(xpath="//*[contains(.,'Coordinate Search')]/ancestor::*[contains(@class,'search-textInput')]/descendant::input[contains(@class,'TextInput')]")
		public static WebElement txtbxCoordinateSearch;
		
		@FindBy(xpath="//div[contains(@class,'PlaceDirectionHeader is-directionFeatures')]")
		public static WebElement hdrPlaceDirection;
		
		@FindBy(xpath="//*[local-name()='svg'][@name='map-marker-alt']")
		public static WebElement mrkDirectionMarker;
		

		@FindBy(css = "div.MapView div.RightPanel.false div.map-events__Container-YEAlH.jGrxOs.Map div.gm-style div.DirectionMarker div.DirectionMarker-destinations svg.DirectionMarker-icon-poi svg:nth-child(1) g:nth-child(2) g:nth-child(1) g:nth-child(1) > circle:nth-child(2)")
		public static WebElement mrkDirectionMarker1;

		@FindBy(xpath="//span[normalize-space()='Directions to here']")
		public static WebElement OptnsDirectionToHere;
		
		@FindBy(xpath="//span[normalize-space()=\"What's Nearby?\"]")
		public static WebElement OptnsWhatNearby;
		
		@FindBy(xpath="//span[normalize-space()='Create a POI']")
		public static WebElement OptnsCreateAPOI;
		
		@FindBy(xpath="//span[normalize-space()='Create a Landmark']")
		public static WebElement OptnsCreateALandmark;
		
		@FindBy(xpath="//span[normalize-space()='Create a Geofence']")
		public static WebElement OptnsCreateAGeofences;
		
		@FindBy(xpath="//div[@class='Place-address']")
		public static WebElement rsltCoordinatePlacesAddress;
		
		@FindBy(xpath="//div[contains(@class,'LandmarkMarkerInfo')]/span[1]")
		public static WebElement objLandmarkMarkerInfo;
		
		@FindBy(xpath="//div[@class='SearchItem-name']")
		public static WebElement objSearchItem;
		
		@FindBy(xpath="//*[contains(@class,'MapDetailView-infoContainer-name')]")
		public static WebElement objSearchItemPOI;
		
		@FindBy(xpath="//div[@class='Place-name']")
		public static WebElement objSearchPlace;	
		
		@FindBy(xpath="//div[contains(@aria-label,'Map')]")
		public static WebElement objLeftPanelMap;	
		
		@FindBy(xpath="//div[@class='OpenLayersMap']")
		public static WebElement objLeftOpenLayersMap;
		
		
		//Left Panel search --->
			
		@FindBy(xpath="//*[contains(@title,'Drag Pegman onto the map to open Street View')]")
		public static WebElement icnStreetView;
		
		//View All Activity --->
		
		
		@FindBy(xpath="//*[contains(.,'Trip Start')]/ancestor::*[contains(@class,'col-xs-6 fromElement   TextInput')]/descendant::*[contains(@data-icon,'calendar-alt')]")
		public static WebElement dtpickerIcon;

		@FindBy(css = "div.gmnoprint.gm-bundled-control:nth-child(1) > div")
		public static WebElement icnStreetView1;
		
		//View All Activity --->
		
		@FindBy(xpath="//label[contains(.,'View All')]")
		public static WebElement btnViewAllActivity;
		
		@FindBy(xpath="//div[@id='timeline']")
		public static WebElement btnAllActivityTimeline;
		
		@FindBy(xpath="//div[@id='graph']")
		public static WebElement btnAllActivityChart;
		
		@FindBy(xpath="//*[contains(.,'Trip Start')]/ancestor::*[contains(@class,'col-xs-6 fromElement   TextInput')]/descendant::*[contains(@data-icon,'calendar-alt')]")
		public static WebElement dtViewDailypickerIcon;
		
		@FindBy(xpath="//*[contains(.,'Start Date')]/ancestor::*[contains(@class,'col-xs-6 fromElement range-from')]/descendant::*[contains(@data-icon,'calendar-alt')]")
		public static WebElement dtViewAllpickerIcon;
		
		@FindBy(xpath="//div[contains(.,'Today')]")
		public static WebElement lblInfoToday;

		@FindBy(xpath="//div[contains(.,'Yesterday')]")
		public static WebElement lblInfoYesterday;
		
		@FindBy(xpath="//*[contains(@class,'back-button')]")
		public static WebElement btnBack;
		
		@FindBy(xpath="//div[@class='TimelineSlider-left']//*[local-name()='svg']")
		public static WebElement objTimelineSlider;
		
		@FindBy(xpath="//div[contains(@class,'today')][contains(@aria-label,'01')]")
		public static WebElement objTodayStartoftheMonth;
		
		@FindBy(xpath="//span[contains(@class,'DayPicker')][contains(@class,'prev')]")
		public static WebElement objPreviousMonthCalendar;
		
		
		
		//<--- View All Activity
		
		// ---> Map - Settings
		
		@FindBy(xpath="//button[normalize-space()='Settings']")
		public static WebElement btnSettings;
		
		
		@FindBy(xpath="//*[contains(.,'Sort By')]/ancestor::*[contains(@class,'Dropdown')]")
		public static WebElement drpdwnSortBy;
		
		@FindBy(xpath="//div[@id='alphabetical']")
		public static WebElement slcSortByAlphabetical;
		
		@FindBy(xpath="//div[@id='status']")
		public static WebElement slcSortByStatus;
		
		@FindBy(xpath="//span[contains(@class,'LeftPanelSettings-panel-header-close')]//span")
		public static WebElement hdrClose;
		
		
		@FindBy(xpath="//*[contains(.,'Filter By')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::*[contains(@class,'Checkbox-box')]")
		public static List<WebElement> chckbxFilterBy;
		
		@FindBy(xpath="//label[contains(@for,'driving')]")
		public static WebElement chckbxFilterByDriving;
		
		@FindBy(xpath="//label[@for='ignition-off']")
		public static WebElement chckbxFilterByIgnitionOff;
		
		@FindBy(xpath="//*[contains(.,'Vehicle Display Name')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::*[contains(@type,'radio')]")
		public static List<WebElement> rdbtnVehicleDisplayName;
		
		@FindBy(xpath="//*[contains(.,'Other')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::*[contains(@class,'Checkbox-box')]")
		public static List<WebElement> chckbxOther;
		
		@FindBy(xpath="//*[contains(@class,'Vehicle-title')]")
		public static List<WebElement> ListVehicleName;
		
		@FindBy(xpath="//div[@data-placement='right-start']/descendant::span[1]")
		public static WebElement objVehicleStatus;
		
		@FindBy(xpath="//div[@data-placement='right-start']/descendant::span[4]")
		public static WebElement objVehicleStreetAddress;
		
		@FindBy(xpath="//div[@data-placement='right-start']/descendant::span[3]")
		public static WebElement objVehiclestreetAddress;
		
		@FindBy(xpath="//span[text()='Odometer']/preceding::span[1]")
		public static WebElement objVehicleOdometer;
		
		@FindBy(xpath="//span[text()='Road Speed']/preceding::span[1]")
		public static WebElement objVehicleRoadSpeed;
		
		@FindBy(xpath="//span[text()='Speed']/preceding::span[1]")
		public static WebElement objVehicleSpeed;
		
		@FindBy(xpath="//span[text()='Unit Clock']/parent::div[1]/descendant::span[2]")
		public static WebElement objVehicleUnitClock;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='ellipsis-v']/parent::button[1]")
		public static WebElement objVehicleSettingsButton;
		
		@FindBy(xpath="//h2[text()='Vehicle Information']")
		public static WebElement objVehiclePopoverSetting;
		
		@FindBy(xpath="//span[contains(text(),'Refrigerator')]")
		public static WebElement objVehicleRefrigerator;
		
		@FindBy(xpath="//span[contains(text(),'Driver ID Tag')]")
		public static WebElement objVehicleDriverIDTag;
		
		@FindBy(xpath="//span[contains(text(),'Telematics Unit Battery')]")
		public static WebElement objVehicleBattery;
		
		@FindBy(xpath="//span[contains(text(),'Actions')]")
		public static WebElement objVehicleActions;
		
		@FindBy(xpath="//*[contains(@value,'true')]/ancestor::div[contains(@class,'Checkbox')]/*[contains(@class,'Checkbox-box')]")
		public static WebElement objTickedCheckbox;
		
		@FindBy(xpath="//*[contains(@value,'true')]/ancestor::div[contains(@class,'Checkbox')]/*[contains(@class,'Checkbox-box')]")
		public static List<WebElement> objTickedCheckboxs;	
		
		@FindBy(xpath="//div[contains(@title,'Vehicle')]/preceding-sibling::*[contains(@class,'Stats-value')]")
		public static WebElement objFleetCount;	
		
		@FindBy(xpath="//*[contains(.,'Vehicle Map Labels')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::span[text()='Vehicle Name']")
		public static WebElement chckbxVehicleMapLabelsVehicleName;	
		
		@FindBy(xpath="//*[contains(.,'Vehicle Map Labels')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::span[text()='Registration']")
		public static WebElement chckbxVehicleMapLabelsRegistration;	
		
		@FindBy(xpath="//*[contains(.,'Vehicle Map Labels')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::span[text()='Plate Number']")
		public static WebElement chckbxVehicleMapLabelsPlateNumber;	
		
		@FindBy(xpath="//*[contains(.,'Vehicle Map Labels')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::span[text()='Description']")
		public static WebElement chckbxVehicleMapLabelsDescription;	
		
		@FindBy(xpath="//*[contains(.,'Vehicle Map Labels')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::span[text()='Description 2']")
		public static WebElement chckbxVehicleMapLabelsDescription2;	
		
		@FindBy(xpath="//*[contains(.,'Vehicle Map Labels')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::span[text()='Description 3']")
		public static WebElement chckbxVehicleMapLabelsDescription3;
		
		@FindBy(xpath="//*[contains(.,'Vehicle Map Labels')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::span[text()='Odometer']")
		public static WebElement chckbxVehicleMapLabelsOdometer;
		
		@FindBy(xpath="//*[contains(.,'Vehicle Map Labels')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::span[text()='Driver']")
		public static WebElement chckbxVehicleMapLabelsDriver;
		
		@FindBy(xpath="//*[contains(.,'Vehicle Map Labels')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::span[text()='Clock (Raw)']")
		public static WebElement chckbxVehicleMapLabelsClockRaw;
		
		@FindBy(xpath="//*[contains(.,'Vehicle Map Labels')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::span[text()='Location']")
		public static WebElement chckbxVehicleMapLabelsLocation;
		
		@FindBy(xpath="//*[contains(.,'Vehicle Display Name')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::*[contains(@type,'radio')][@value='name']")
		public static WebElement rdbtnVehicleDisplayNameVehicleName;
		
		@FindBy(xpath="//*[contains(.,'Vehicle Display Name')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::*[contains(@type,'radio')][@value='registration']")
		public static WebElement rdbtnVehicleDisplayNameRegistration;
		
		@FindBy(xpath="//*[contains(.,'Vehicle Display Name')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::*[contains(@type,'radio')][@value='description']")
		public static WebElement rdbtnVehicleDisplayNameDescription;
		
		@FindBy(xpath="//*[contains(.,'Vehicle Display Name')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::*[contains(@type,'radio')][@value='description1']")
		public static WebElement rdbtnVehicleDisplayNameDescription2;
		
		@FindBy(xpath="//*[contains(.,'Vehicle Display Name')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::*[contains(@type,'radio')][@value='description2']")
		public static WebElement rdbtnVehicleDisplayNameDescription3;
		
		@FindBy(xpath="//label[@for='enableGroups']")
		public static WebElement chckbxOtherEnableGroups;
		
		@FindBy(xpath="//input[@name='enableGroups']")
		public static WebElement objOtherEnableGroups;
		
		@FindBy(xpath="//label[@for='useVehicleIconColor']")
		public static WebElement chckbxOtherUseVehicleIconColour;
		
		@FindBy(xpath="//input[@name='useVehicleIconColor']")
		public static WebElement objOtherUseVehicleIconColour;
		
		@FindBy(xpath="//div[@class='LeftPanelGroup-folder']")
		public static List<WebElement> objGroupFolder;
		
		@FindBy(xpath="//div[@class='LeftPanelGroup-name']")
		public static List<WebElement> objLabelGroupName;
		
		@FindBy(xpath="//span[text()='Contains:']")
		public static List<WebElement> objLabelCountInGroups;
		
		@FindBy(xpath="//div[@class='LeftPanelGroup-circles-circle--driving']")
		public static List<WebElement> objLabelCountGreenIcon;
		
		@FindBy(xpath="//div[@class='LeftPanelGroup-circles-circle--off']")
		public static List<WebElement> objLabelCountGrayIcon;
		
		// Map - Settings --->
		
		// Compare <--- 
		
		@FindBy(xpath="//button[contains(.,'Compare')]")
		public static WebElement btnCompare;
		
		@FindBy(xpath="//*[contains(.,'Add Vehicle')]/ancestor::div[contains(@class,'TextInput')]/input[contains(@class,'TextInput-input')]")
		public static WebElement drpdwnAddVehicle;
		
		@FindBy(xpath="//*[contains(@id,'item')]")
		public static List<WebElement> lstAddVehicle;
		
		@FindBy(xpath="//*[contains(@class,'Apply')]")
		public static WebElement btnApply;
		
		@FindBy(xpath="//img[contains(@class,'sc-')]")
		public static WebElement objEndTripFlag;
		
		@FindBy(xpath="//img[contains(@class,'sc-')]")
		public static List<WebElement> objEndTripFlagList;
		
		@FindBy(xpath="//div[contains(.,'Distance')]/preceding-sibling::div[contains(@class,'DataBlock-value')]")
		public static List<WebElement> dtBlockDistance;
		
		@FindBy(xpath="//div[contains(.,'Distance')]/preceding-sibling::div[contains(@class,'DataBlock-value')]")
		public static WebElement objdtBlockDistance;
			
		@FindBy(xpath="//div[contains(.,'Distance')]/preceding-sibling::div[contains(@class,'DataBlock-value')][contains(.,'0 ')]")
		public static List<WebElement> dtBlockZeroDistance;


		// Compare ---> 
		
		//<-- Landscape View
		
		@FindBy(xpath="//div[@id='toggleTray']")
		public static WebElement btnToggleTray;
		
		@FindBy(xpath="//div[@id='landscape']")
		public static WebElement btnLandscapeView;
		
		@FindBy(xpath="//div[@id='portrait']")
		public static WebElement btnPotraitView;
		
		@FindBy(xpath="//*[text()='Status Filter']/ancestor::div[@class='InputDropdown-container']/button[@role='button']")
		public static WebElement drpdwnStatusFilter;
		
		@FindBy(xpath="//*[text()='Score Filter']/ancestor::div[@class='InputDropdown-container']/button[@role='button']")
		public static WebElement drpdwnScoreFilter;
		
		@FindBy(xpath="//*[contains(@class,'SearchBar')]/input[@type='text']")
		public static WebElement txtbxSearch;
		
		@FindBy(xpath="//*[text()='Total Vehicles']")
		public static WebElement objLabelTotalVehicles;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='sync-alt']/parent::div[contains(@class,'IconButton')]")
		public static WebElement btnRefresh;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='cogs']/parent::div[contains(@class,'IconButton')]")
		public static WebElement btnOptions;
		
		@FindBy(xpath="//div[@class='List ']")
		public static WebElement objVehicleTable;
		
		@FindBy(xpath="//div[@class='VehicleSummaryCard-details']")
		public static WebElement objVehicleSummaryCard;

		@FindBy(xpath="//*[local-name()='svg'][@data-icon='video']/parent::span[1]")
		public static WebElement btnLiveVisionEnable;
		
		@FindBy(xpath="//li[@data-target='Camera Activity']")
		public static WebElement sdpnlCameraActivity;
		
		@FindBy(xpath="//button[text()='Request Footage']")
		public static WebElement btnRequestFootage;
		
		@FindBy(xpath="//div[contains(@class,'CameraButton')]/button[text()='1']")
		public static WebElement btnCamera1;
		
		@FindBy(xpath="//div[contains(@class,'CameraButton')]/button[text()='2']")
		public static WebElement btnCamera2;

		@FindBy(xpath="//div[contains(@class,'CameraButton')]/button[text()='3']")
		public static WebElement btnCamera3;
		
		@FindBy(xpath="//div[contains(@class,'CameraButton')]/button[text()='4']")
		public static WebElement btnCamera4;
		
		@FindBy(xpath="//div[contains(@class,'CameraButton')]/button[text()='5']")
		public static WebElement btnCamera5;
		
		@FindBy(xpath="//div[contains(@class,'CameraButton')]/button[text()='6']")
		public static WebElement btnCamera6;
		
		@FindBy(xpath="//div[contains(@class,'CameraButton')]/button[text()='7']")
		public static WebElement btnCamera7;
		
		@FindBy(xpath="//div[contains(@class,'CameraButton')]/button[text()='8']")
		public static WebElement btnCamera8;
		
		@FindBy(xpath="//video[contains(@class,'video-streamer')]")
		public static List<WebElement> vdVideoStreamer;
		
		@FindBy(xpath="//h1[text()='Request Footage']")
		public static WebElement objModalHeaderRequestFootage;
		
		@FindBy(xpath="//input[@name='date']")
		public static WebElement dtpckrDatePickerRequestFootage;
		
		@FindBy(xpath="//div[text()='Time']/following::div[2]")
		public static WebElement tmpckrTimePickerRequestFootage;
		
		@FindBy(xpath="//div[contains(@class,'real-time-picker')]/div[contains(@class,'TextInput')]/input[1]")
		public static WebElement objTimePickerRequestFootage;
		
		@FindBy(xpath="//input[contains(@name,'preTime')]")
		public static WebElement txtbxPreRecording;
		
		@FindBy(xpath="//input[contains(@name,'postTime')]")
		public static WebElement txtbxPostRecording;
		
		@FindBy(xpath="//label[@for='camera_1']")
		public static WebElement chkbxCamera1;
		
		@FindBy(xpath="//label[@for='camera_2']")
		public static WebElement chkbxCamera2;
		
		@FindBy(xpath="//label[@for='camera_3']")
		public static WebElement chkbxCamera3;
		
		@FindBy(xpath="//label[@for='camera_4']")
		public static WebElement chkbxCamera4;
		
		@FindBy(xpath="//textarea[contains(@name,'comment')]")
		public static WebElement txtbxComment;
		
		@FindBy(xpath="//button[contains(@type,'submit')]")
		public static WebElement btnSubmit;
		
		@FindBy(xpath="//div[contains(@class,'TextInput-error')][text()='Must be less than or equal to 300s.']")
		public static WebElement objErrorMessageMustbelessthanorequalto300s;
		
		@FindBy(xpath="//div[contains(@class,'TextInput-error')][text()='Sum cannot exceed 300s.']")
		public static WebElement objErrorMessageSumcannotexceed300s;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
		
		@FindBy(xpath="//span[text()='Camera Activity']/ancestor::div[contains(@class,'SectionHeader')]/following::div[1]/descendant::span[text()='Search']/ancestor::div[contains(@class,'SearchBar')]/input[1]")
		public static WebElement txtbxCameraActivitySearch;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='times']/parent::div[contains(@class,'InfoRightPanel-close')]")
		public static WebElement btnCloseInfoRightPanel;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='cogs']/parent::button[1]")
		public static WebElement btnCogWheel;
		
		@FindBy(xpath="//p[contains(@class,'camera-activity')]/following::div[1]/descendant::div[@class='rt-resizable-header-content']/span[1]")
		public static List<WebElement> lstColumnHeader;
		
		@FindBy(xpath="//span[normalize-space()='Start Time']")
		public static WebElement objcolumnStartTime;
		
		@FindBy(xpath="//span[text()='End Time']")
		public static WebElement objcolumnEndTime;

		@FindBy(xpath="//span[text()='Comment']")
		public static WebElement objcolumnComment;

		@FindBy(xpath="//span[text()='Cam 1']")
		public static WebElement objcolumnCam1;
		
		@FindBy(xpath="//span[text()='Cam 2']")
		public static WebElement objcolumnCam2;
		
		@FindBy(xpath="//span[text()='Cam 3']")
		public static WebElement objcolumnCam3;
		
		@FindBy(xpath="//span[text()='Cam 4']")
		public static WebElement objcolumnCam4;
		
		@FindBy(xpath="//span[text()='Start Time']/parent::div[1]/parent::div[contains(@class,'sort-asc')]")
		public static WebElement objStartTimeSortAsc;
		
		@FindBy(xpath="//span[text()='Start Time']/parent::div[1]/parent::div[contains(@class,'sort-desc')]")
		public static WebElement objStartTimeSortDesc;
		
		@FindBy(xpath="//span[text()='End Time']/parent::div[1]/parent::div[contains(@class,'sort-asc')]")
		public static WebElement objEndTimeSortAsc;
		
		@FindBy(xpath="//span[text()='End Time']/parent::div[1]/parent::div[contains(@class,'sort-desc')]")
		public static WebElement objEndTimeSortDesc;
		
		@FindBy(xpath="//div[contains(@class,'request')]/descendant::span[contains(@class,'pageSizeOptions')]/select[1]")
		public static WebElement objCameraActivityPageSizeOptions;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='play-circle']/parent::div[1]")
		public static List<WebElement> btnPlayButton;
		
		@FindBy(xpath="//*[normalize-space()='Video Preview']")
		public static WebElement objReplayVideoStreamer;
		
		@FindBy(xpath="//div[contains(@class,'Modal-body')]/div[contains(@class,'IconButton')]")
		public static WebElement btnCloseReplayVideoStreamer;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='download']/parent::div[1]")
		public static List<WebElement> btnDownloadButton;
		
		@FindBy(xpath="//div[contains(@class,'selected')][text()='1']")
		public static WebElement objFirstDayofTheMonth;
		
		@FindBy(xpath="//span[@aria-label='Previous Month']")
		public static WebElement objPreviousMonth;
	
		//  Landscape View -->
		
		@FindBy(xpath="//div[contains(@class,'currentLocation')]")
		public static WebElement btnMyLocationIcon;
		
		@FindBy(xpath="//div[contains(@class,'satellite')]")
		public static WebElement btnSatelliteIcon;
		
		@FindBy(xpath="//div[contains(@class,'hybrid')]")
		public static WebElement btnHybridIcon;
		
		@FindBy(xpath="//div[contains(@class,'roadmap')]")
		public static WebElement btnRoadMapIcon;
		

	}
	
	public static class AssetTrackerTab {
		
		@FindBy(xpath="//a[@id='asset trackers-tab']")
		public static WebElement navAssetTrackers;	
				
		@FindBy(xpath="//div[contains(@title,'Asset Tracker')]/preceding-sibling::*[contains(@class,'Stats-value')]")
		public static WebElement objAssetTrackersCount;	
		
		@FindBy(xpath="//div[text()='Fleet Search']/preceding::input[1]")
		public static WebElement txtbxSearchBar;	
		
		@FindBy(xpath="//button[text()='Settings']")
		public static WebElement btnSettings;
		
		@FindBy(xpath="//button[text()='Compare']")
		public static WebElement btnCompare;
		
		@FindBy(xpath="//div[contains(@class,'MapView-leftPanel-listTransitionItem')]")
		public static List<WebElement> objAssetTrackerslist;
		
	}
	
	public static class SVRUnitsTab {
		
		@FindBy(xpath="//a[@id='svr units-tab']")
		public static WebElement navSVRUnits;	
		
		@FindBy(xpath="//div[contains(@title,'Svr Unit')]/preceding-sibling::*[contains(@class,'Stats-value')]")
		public static WebElement objSVRUnitsCount;	
		
		@FindBy(xpath="//div[text()='Fleet Search']/preceding::input[1]")
		public static WebElement txtbxSearchBar;	
		
		@FindBy(xpath="//button[text()='Settings']")
		public static WebElement btnSettings;
		
		@FindBy(xpath="//div[contains(@class,'MapView-leftPanel-listTransitionItem')]")
		public static WebElement objSVRUnitslist;
		
		@FindBy(xpath="//span[contains(@class,'Vehicle-title')]")
		public static WebElement objVehicleName;
		
		@FindBy(xpath="//div[contains(@class,'VehicleIcon')]")
		public static WebElement objVehicleIcon;
		
		@FindBy(xpath="//span[contains(@class,'Vehicle-rating')]")
		public static WebElement objVehicleStarScore;
		
		@FindBy(xpath="//a[contains(@class,'Vehicle-defects')]")
		public static WebElement objVehicleDefectIcon;
		
		@FindBy(xpath="//div[contains(@class,'AlertsBadge Vehicle-details-right-icon')]")
		public static WebElement objVehicleDefectIconNumberLabel;
			
	}
	
	public static class NavigatorsTab {
		
		@FindBy(xpath="//a[@id='navigators-tab']")
		public static WebElement navNavigators;	
		
		@FindBy(xpath="//div[contains(@title,'Navigators')]/preceding-sibling::*[contains(@class,'Stats-value')]")
		public static WebElement objNavigatorsCount;	
		
		@FindBy(xpath="//div[text()='Fleet Search']/preceding::input[1]")
		public static WebElement txtbxSearchBar;	
		
		@FindBy(xpath="//button[text()='Settings']")
		public static WebElement btnSettings;
		
		@FindBy(xpath="//button[text()='Compare']")
		public static WebElement btnCompare;
		
		
	}
	
	public static class LocatorsOnlyTab {
		
		@FindBy(xpath="//a[@id='location only-tab']")
		public static WebElement navLocationOnly;	
		
		@FindBy(xpath="//div[contains(@title,'Location Only')]/preceding-sibling::*[contains(@class,'Stats-value')]")
		public static WebElement objLocatorsOnlyCount;	
		
		@FindBy(xpath="//div[text()='Fleet Search']/preceding::input[1]")
		public static WebElement txtbxSearchBar;	
		
		@FindBy(xpath="//button[text()='Settings']")
		public static WebElement btnSettings;
		
		@FindBy(xpath="//button[text()='Compare']")
		public static WebElement btnCompare;
		

		
	}

		
	

}
