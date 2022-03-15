package pageObject;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListPage {

	@FindBy(xpath="//a[@id='LIST']")
	public static WebElement nvTabList;
	
	@FindBy(xpath="//a[@id='LIST']")
    public static WebElement navList;

    @FindBy(xpath="//button[@aria-label='open menu']")
    public static WebElement btnNxt;
	
	@FindBy(xpath="//span[normalize-space()='Map']")
	public static WebElement navMap;	
	
	@FindBy(xpath="//div[contains(@class,'SearchBar')]//input[contains(@type,'text')]")
	public static WebElement SearchFld;
	
	@FindBy(xpath="//span[normalize-space()='Add Group']")
	public static WebElement btnAddGrp;
	
	@FindBy(xpath="//div[contains(@class, 'Group-name')]/descendant::*[contains(@name,'name')]")
	public static WebElement GroupNameFld;
	
	@FindBy(xpath="//button[normalize-space()='Next']")
	public static WebElement btnAddGrpNext;
	
	@FindBy(xpath="//button[@styleproperties='[object Object]' and @type='button']")
	public static WebElement OptionBtn;	
	
	@FindBy(xpath="//button[normalize-space()='Delete Selected' and @type='button']")
	public static WebElement DeleteSelectedBtn;
	
	@FindBy(xpath="//button[normalize-space()='Cancel' and @type='button']")
	public static WebElement CancelBtn;
	
	@FindBy(xpath="//button[normalize-space()='Confirm' and @type='submit']")
	public static WebElement ConfirmBtn;
	
	@FindBy(xpath="//span[contains(@class,'select-wrap -pageSizeOptions')]//select")
	public static WebElement PageSizeDL;
		
	@FindBy	(xpath="//div[@class='-pageJump']/descendant::*[contains(@type,'number')]")
	public static WebElement PageNumberfld;
	
	@FindBy	(xpath="//span[@class='-totalPages']")
	public static WebElement PageTotaltxt;
	
	@FindBy	(xpath="//div[@class='pagbtn right']/descendant::*[contains(.,'Next')]")
	public static WebElement PageNextbtn;
	
	@FindBy	(xpath="//div[@class='pagbtn left']/descendant::*[contains(.,'Previous')]")
	public static WebElement PagePreviousbtn;
	
	@FindBy	(xpath="//div[@class='styled__Container-lghwWd ercVCB']")
	public static WebElement GroupnameBox;
	
	@FindBy(xpath="//div[contains(@style,'rgba(102, 102, 102, 0.5)') and contains(@style,'rgb(102, 102, 102)')]")
	public static WebElement GrayColorIcon;
	
	@FindBy(xpath="//div[contains(@style,'rgba(206, 82, 57, 0.5)') and contains(@style,'rgb(206, 82, 57)')]")
	public static WebElement RedColorIcon;
	
	@FindBy(xpath="//div[contains(@style,'rgba(244, 119, 53, 0.5)') and contains(@style,'rgb(244, 119, 53)')]")
	public static WebElement OrangeColorIcon;
	
	@FindBy(xpath="//div[contains(@style,'rgba(255, 189, 77, 0.5)') and contains(@style,'rgb(255, 189, 77)')]")
	public static WebElement YellowColorIcon;

	@FindBy(xpath="//div[contains(@style,'rgba(181, 213, 94, 0.5)') and contains(@style,'rgb(181, 213, 94)')]")
	public static WebElement LimeColorIcon;

	@FindBy(xpath="//div[contains(@style,'rgba(92, 174, 96, 0.5)') and contains(@style,'rgb(92, 174, 96)')]")
	public static WebElement GreenColorIcon;

	@FindBy(xpath="//div[contains(@style,'rgba(83, 184, 198, 0.5)') and contains(@style,'rgb(83, 184, 198)')]")
	public static WebElement CyanColorIcon;

	@FindBy(xpath="//div[contains(@style,'rgba(83, 144, 188, 0.5)') and contains(@style,'rgb(83, 144, 188)')]")
	public static WebElement BlueColorIcon;

	@FindBy(xpath="//div[contains(@style,'rgba(168, 112, 189, 0.5)') and contains(@style,'rgb(168, 112, 189)')]")
	public static WebElement PurpleColorIcon;

	@FindBy(xpath="//div[contains(@style,'rgba(214, 96, 135, 0.5)') and contains(@style,'rgb(214, 96, 135)')]")
	public static WebElement PinkColorIcon;
	
	@FindBy(xpath="//button[normalize-space()='New Upload']")
	public static WebElement btnNewUpload;
	
	@FindBy(xpath="//*[contains(@class,'rt-tr -odd')]/div[1]")
	public static List<WebElement> TableColumnItems;
	
	@FindBy(xpath="//*[text()='No data available']")
	public static WebElement NoDatamdl;
	
    @FindBy(xpath="//div[contains(@class,'toast--success')]")
    public static WebElement ToastSuccessMsg;
	
	@FindBy(xpath="//div[normalize-space()='Category']//parent::button[contains(@role, 'button')]")
	public static WebElement ImportCategoryDL;
	
	@FindBy(xpath="//div[normalize-space()='Import Type']//parent::button[contains(@role, 'button')]")
	public static WebElement ImportTypeDL;
    
	@FindBy(xpath="//div[normalize-space()='Importers' and contains(@role, 'option')]")
	public static WebElement Importers;
	
	@FindBy(xpath="//div[normalize-space()='Import Driver' and contains(@role, 'option')]")
	public static WebElement ImportDriver;
	
	@FindBy(xpath="//div[normalize-space()='Import Geofences' and contains(@role, 'option')]")
	public static WebElement ImportGeofences;
	
	@FindBy(xpath="//div[normalize-space()='Import Geofences (With Group)' and contains(@role, 'option')]")
	public static WebElement ImportGeofenceGrp;
	
	@FindBy(xpath="//div[normalize-space()='Import Geofences Polygon' and contains(@role, 'option')]")
	public static WebElement ImportGeofencePoly;
	
	@FindBy(xpath="//div[normalize-space()='Import POI' and contains(@role, 'option')]")
	public static WebElement ImportPOI;
	
	@FindBy(xpath="//div[normalize-space()='Import Vehicles to Groups' and contains(@role, 'option')]")
	public static WebElement ImportVehicleGroup;
	
	@FindBy(xpath="//input[contains(@type,'file') and contains(@name,'Upload File')]")
	public static WebElement UploadFilebtn;
	
	@FindBy(xpath="//a[normalize-space()='Download Template']")
	public static WebElement DownloadTemplatebtn;
	
	@FindBy(xpath="//div[contains(@class,'ProfileDropdownButton') and contains(@class,'container')]")
	public static WebElement ProfileDropdown;

	@FindBy(xpath="//div[@id='settings']//div[contains(@class,'util-fullWidthChild')]")
	public static WebElement SettingsProfileDL;
	
    @FindBy(xpath="//a[contains(@href,'/import')]")
    public static WebElement ImportDatatab;
    
    @FindBy(xpath="//div[@class='PreviewFormat-fields']")
    public static WebElement ImportPreviewFld;
	
	@FindBy(xpath="//button[normalize-space()='Edit Group' and @type='button']")
	public static WebElement EditGrpBtn;	
	
	@FindBy(xpath="//button[normalize-space()='Save' and contains(@class, 'Button--action')]")
	public static WebElement SaveBtn;
    
	public static class Vehiclestab {
		
	    @FindBy(xpath="//a[normalize-space()='Vehicles']")
	    public static WebElement Vehiclestab;
	    
	     @FindBy(xpath="//div[contains(@class,'row')]//input[contains(@type,'text')]")
	     public static WebElement SearchFld;

	     @FindBy(xpath="//button[contains(@class,'styled-action-button__StyledActionButton-fbfPZi fPpfOJ Button--grouped')]")
	     public static WebElement btnAddGrp;

	     @FindBy(xpath="//span[normalize-space()='Vehicle Name']")
	     public static WebElement ClmhdrVehicleName;

	     @FindBy(xpath="//span[normalize-space()='Registration']")
	     public static WebElement ClmhdrRegistration;

	     @FindBy(xpath="//span[normalize-space()='Status']")
	     public static WebElement ClmhdrStatus;

	     @FindBy(xpath="//span[normalize-space()='Score']")
	     public static WebElement ClmhdrScore;

	     @FindBy(xpath="//span[normalize-space()='Speed']")
	     public static WebElement ClmhdrSpeed;

	     @FindBy(xpath="//span[normalize-space()='Home Geofence']")
	     public static WebElement ClmhdrHomeGeofence;

	     @FindBy(xpath="//span[normalize-space()='Current Geofence']")
	     public static WebElement ClmhdrCurrentGeofence;

	     @FindBy(xpath="//span[normalize-space()='Location']")
	     public static WebElement ClmhdrLocation;

	     @FindBy(xpath="//span[normalize-space()='VIN']")
	     public static WebElement ClmhdrVIN;

	     @FindBy(xpath="//span[normalize-space()='Defects']")
	     public static WebElement ClmhdrDefects;		
			     
	     @FindBy(xpath="//span[normalize-space()='Description']")
	     public static WebElement ClmhdrDescription;

	     @FindBy(xpath="//span[normalize-space()='Description 2']")
	     public static WebElement ClmhdrDescription2;

	     @FindBy(xpath="//span[normalize-space()='Description 3']")
	     public static WebElement ClmhdrDescription3;

	     @FindBy(xpath="//span[normalize-space()='Driver']")
	     public static WebElement ClmhdrDriver;

	     @FindBy(xpath="//span[normalize-space()='Odometer']")
	     public static WebElement ClmhdrOdometer;

	     @FindBy(xpath="//span[normalize-space()='Terminal Serial']")
	     public static WebElement ClmhdrTerminalSerial;	
	     
	     @FindBy(xpath="//span[normalize-space()='Date/Time']")
	     public static WebElement ClmhdrDateTime;
	     
	     @FindBy(xpath="//span[normalize-space()='Distance']")
	     public static WebElement ClmhdrDistance;	
	     
	     @FindBy(xpath="//span[normalize-space()='Type']")
	     public static WebElement ClmhdrType;		
	     
	     @FindBy(xpath="//span[normalize-space()='Action']")
	     public static WebElement ClmhdrAction;	
	     
	     @FindBy(xpath="//span[normalize-space()='Trailer Registration']")
	     public static WebElement ClmhdrTrailerRegistration;	
	     
	     @FindBy(xpath="//span[normalize-space()='Trailer Description']")
	     public static WebElement ClmhdrTrailerDescription;	
	     
		@FindBy(xpath="//button[normalize-space()='Back to Vehicles' and @type='button']")
		public static WebElement VehicleGrpBackBtn;	
	    
		@FindBy(xpath="//button[normalize-space()='Edit Group' and @type='button']")
		public static WebElement EditGrpBtn;	
		
		@FindBy(xpath="//button[normalize-space()='Delete Group' and @type='button']")
		public static WebElement DeleteGrpBtn;
		
		@FindBy(xpath="//button[normalize-space()='Yes, Delete' and @type='button']")
		public static WebElement DeleteYesBtn;
		
		@FindBy(xpath="//input[contains(@name,'name') and contains (@type,'text')]")
		public static WebElement EditGrpNameFld;
		
		@FindBy(xpath="//span[contains(@class,'Breadcrumbs-crumbNoLink')]")
		public static WebElement GrpNameBrdCrmb;
		
		@FindBy(xpath="//button[normalize-space()='Edit Vehicle' and @type='button']")
		public static WebElement EditVehicleBtn;
		
		@FindBy(xpath="//button[normalize-space()='Share Location' and @type='button']")
		public static WebElement ShareLocationBtn;	
		
		@FindBy(xpath="//button[normalize-space()='Go Back']")
		public static WebElement GoBackBtn;	
	     
		@FindBy(xpath="//div[@class='rt-tr-group' and @role='rowgroup']")
		public static WebElement VehicleRowGroup;
		
		@FindBy(xpath="//label[contains(@for,'Vehicle Name')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objVehicleName;
		
		@FindBy(xpath="//label[contains(@for,'Vehicle Name')]")
		public static WebElement chckbxVehicleName;
		
		@FindBy(xpath="//label[contains(@for,'Registration')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objRegistration;
		
		@FindBy(xpath="//label[contains(@for,'Registration')]")
		public static WebElement chckbxRegistration;
		
		@FindBy(xpath="//label[contains(@for,'Status')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objStatus;
		
		@FindBy(xpath="//label[contains(@for,'Status')]")
		public static WebElement chckbxStatus;
		
		@FindBy(xpath="//label[contains(@for,'Score')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objScore;
		
		@FindBy(xpath="//label[contains(@for,'Score')]")
		public static WebElement chckbxScore;
		
		@FindBy(xpath="//label[contains(@for,'Speed')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objSpeed;
		
		@FindBy(xpath="//label[contains(@for,'Speed')]")
		public static WebElement chckbxSpeed;
		
		@FindBy(xpath="//label[contains(@for,'Home Geofence')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objHomeGeofence;
		
		@FindBy(xpath="//label[contains(@for,'Home Geofence')]")
		public static WebElement chckbxHomeGeofence;
		
		@FindBy(xpath="//label[contains(@for,'Current Geofence')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objCurrentGeofence;
		
		@FindBy(xpath="//label[contains(@for,'Current Geofence')]")
		public static WebElement chckbxCurrentGeofence;
		
		@FindBy(xpath="//label[contains(@for,'Location')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objLocation;
		
		@FindBy(xpath="//label[contains(@for,'Location')]")
		public static WebElement chckbxLocation;
		
		@FindBy(xpath="//label[contains(@for,'VIN')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objVIN;
		
		@FindBy(xpath="//label[contains(@for,'VIN')]")
		public static WebElement chckbxVIN;
		
		@FindBy(xpath="//label[contains(@for,'Defects')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objDefects;
		
		@FindBy(xpath="//label[contains(@for,'Defects')]")
		public static WebElement chckbxDefects;
		
		@FindBy(xpath="//label[contains(@for,'Description')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objDescription;
		
		@FindBy(xpath="//label[contains(@for,'Description')]")
		public static WebElement chckbxDescription;
		
		@FindBy(xpath="//label[contains(@for,'Description 2')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objDescription2;
		
		@FindBy(xpath="//label[contains(@for,'Description 2')]")
		public static WebElement chckbxDescription2;
		
		@FindBy(xpath="//label[contains(@for,'Description 3')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objDescription3;
		
		@FindBy(xpath="//label[contains(@for,'Description 3')]")
		public static WebElement chckbxDescription3;
		
		@FindBy(xpath="//label[contains(@for,'Driver')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objDriver;
		
		@FindBy(xpath="//label[contains(@for,'Driver')]")
		public static WebElement chckbxDriver;
		
		@FindBy(xpath="//label[contains(@for,'Odometer')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objOdometer;
		
		@FindBy(xpath="//label[contains(@for,'Odometer')]")
		public static WebElement chckbxOdometer;
		
		@FindBy(xpath="//label[contains(@for,'Terminal Serial')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objTerminalSerial;
		
		@FindBy(xpath="//label[contains(@for,'Terminal Serial')]")
		public static WebElement chckbxTerminalSerial;
		
		@FindBy(xpath="//button[contains(@aria-label,'open menu')]")
		public static WebElement VehiclesStatusDL; 
		
		@FindBy(xpath="//div[normalize-space()='Active Vehicles' and contains(@id, 'ListDropdown')]")
		public static WebElement ActiveVehiclesStatus; 
		
		@FindBy(xpath="//div[normalize-space()='All Vehicles' and contains(@id, 'ListDropdown')]")
		public static WebElement AllVehiclesStatus; 
		
		@FindBy(xpath="//div[normalize-space()='Inactive Vehicles' and contains(@id, 'ListDropdown')]")
		public static WebElement InactiveVehiclesStatus;
		
		@FindBy(xpath="//div[(@title='Total Groups')]/following-sibling::div[contains(@class,'Stats-value ')]")
		public static WebElement TotalVehicleGroupNumber;
		
		@FindBy(xpath="//div[(@title='Total Vehicles')]/following-sibling::div[contains(@class,'Stats-value ')]")
		public static WebElement TotalVehiclesNumber;
		
		@FindBy(xpath="//div[contains(@class, 'styled__Container')]")
		public static List<WebElement> VehicleslistGroupItemsNumber;
		
		@FindBy(xpath="//button[normalize-space()='Save' and contains(@class, 'Button--action')]")
		public static WebElement VehicleSaveBtn;
		
		@FindBy(xpath="//input[@name='name' and @type='text']")
		public static WebElement VehicleNameFld;
		
		@FindBy(xpath="//span[normalize-space()='Description']")
		public static WebElement VehicleDescriptionFld;
		
		@FindBy(xpath="//body/div[@id='app']/div[@id='router-root']/div[contains(@class,'DetailContainer')]/div[contains(@class,'row util-noMargin')]/div[contains(@class,'util-textCenter col-xs-9')]/form/fieldset[contains(@class,'Form-fieldset')]/div/div[contains(@class,'row')]/div[5]/div[1]/input[1]")
		public static WebElement VehicleDescription2Fld;
		
		@FindBy(xpath="//body/div[@id='app']/div[@id='router-root']/div[contains(@class,'DetailContainer')]/div[contains(@class,'row util-noMargin')]/div[contains(@class,'util-textCenter col-xs-9')]/form/fieldset[contains(@class,'Form-fieldset')]/div/div[contains(@class,'row')]/div[6]/div[1]/input[1]")
		public static WebElement VehicleDescription3Fld;
		
		@FindBy(xpath="//div[contains(@class,'ExpandableInput-item col-xs-12 col-md-4 FormDetailView-field')]//button[1]")
		public static WebElement AddDescriptionBtn;
				
		@FindBy(xpath="//*[local-name()='svg' and @data-icon='trash-alt']//parent::button[contains(@class, 'Button') and contains(@class, 'ExpandableInput')]")
		public static WebElement DeleteDescriptionBtn;
		
		@FindBy(xpath="//div[normalize-space()='Recent Activity' and contains(@class,'item__ItemTag')]")
		public static WebElement RecentActivitysubtab;
		
		@FindBy(xpath="//div[normalize-space()='Immobilise Vehicle' and contains(@class,'item__ItemTag')]")
		public static WebElement ImmobiliseVehiclesubtab;
		
		@FindBy(xpath="//div[normalize-space()='Details' and contains(@class,'item__ItemTag')]")
		public static WebElement Detailssubtab;
		
		@FindBy(xpath="//div[normalize-space()='Vehicle Settings' and contains(@class,'item__ItemTag')]")
		public static WebElement VehicleSettingssubtab;

		@FindBy(xpath="//div[normalize-space()='Vehicle Specifications' and contains(@class,'item__ItemTag')]")
		public static WebElement VehicleSpecificationssubtab;
		
		@FindBy(xpath="//div[normalize-space()='Vehicle Trailers' and contains(@class,'item__ItemTag')]")
		public static WebElement VehicleTrailerssubtab;
		
		@FindBy(xpath="//div[normalize-space()='Odometer Manager' and contains(@class,'item__ItemTag')]")
		public static WebElement OdometerManagersubtab;
		
		@FindBy(xpath="//div[normalize-space()='Advanced Setup' and contains(@class,'item__ItemTag')]")
		public static WebElement AdvancedSetupsubtab;
		
		@FindBy(xpath="//div[normalize-space()='Dynamic Field' and contains(@class,'item__ItemTag')]")
		public static WebElement DynamicFieldsubtab;
		
		@FindBy(xpath="//div[normalize-space()='Sensors' and contains(@class,'item__ItemTag')]")
		public static WebElement Sensorssubtab;
		
		@FindBy(xpath="//div[normalize-space()='Dynamic Bits' and contains(@class,'item__ItemTag')]")
		public static WebElement DynamicBitssubtab;
		
		@FindBy(xpath="//input[@id='passwordValue']")
		public static WebElement DynamicFieldpassword;
		
		@FindBy(xpath="//div[contains(@class,'util-textCenter row center-xs')]//button[contains(@type,'button')][normalize-space()='Submit']")
		public static WebElement DynamicFieldSubmitbtn;
		
		@FindBy(xpath="//input[contains(@name,'auxFuelCapacity')]")
		public static WebElement DynamicFieldAuxFuelCapacity;
		
		@FindBy(xpath="//input[contains(@name,'fuelCapacity')]")
		public static WebElement DynamicFieldfuelCapacity;
		
		@FindBy(xpath="//div[contains(@class,'dynamic-fields-list__DynamicField-krQhxP fngIxf')]//div[contains(@role,'combobox')]")
		public static WebElement DynamicFieldTankShape;
		
		@FindBy(xpath="//button[@id='newDbit']")
		public static WebElement AddNewDynamicBitbtn;
					
		@FindBy(xpath="//button[@id='newSensor']")
		public static WebElement AddNewSensorbtn;
		
		@FindBy(xpath="//*[text()='Sensor Number']/preceding-sibling::input")
		public static WebElement SensorNumberfld;
		
		@FindBy(xpath="//div[contains(@class,'SensorSetup-box')]//*[text()='Name']/preceding-sibling::input")
		public static WebElement SensorNamefld;
		
		@FindBy(xpath="//*[text()='Max Trigger']/preceding-sibling::input")
		public static WebElement SensorMaxTriggerfld;
		
		@FindBy(xpath="//*[text()='Min Trigger']/preceding-sibling::input")
		public static WebElement SensorMinTriggerfld;
		
		@FindBy(xpath="//*[text()='Multiplier']/preceding-sibling::input")
		public static WebElement SensorMultiplierfld;
		
		@FindBy(xpath="//*[text()='Analog Offset']/preceding-sibling::input")
		public static WebElement SensorAnalogOffsetfld;
		
		@FindBy(xpath="//*[text()='Priority']/parent::button")
		public static WebElement SensorPriorityDL;
		
		@FindBy(xpath="//*[text()='Activity Level']/parent::button")
		public static WebElement SensorActivityLevelDL;
		
		@FindBy(xpath="//*[text()='Sensor Type']/parent::button")
		public static WebElement SensorTypeDL;
		
		@FindBy(xpath="//div[contains(@class,'util-flex util-textRight')]//button[contains(@type,'button')][normalize-space()='Save']")
		public static WebElement SensorSavebtn;
		
		@FindBy(xpath="//div[contains(@class,'SensorSetup-box')]/div[contains(@class,'util-flex')]//child::button[contains(@type,'button')][normalize-space()='Remove']")
		public static WebElement SensorRemovebtn;
		
		@FindBy(xpath="//*[text()='Bit Position']/parent::button")
		public static WebElement BitPositionDL;
		
		@FindBy(xpath="//*[text()='Dynamic Bit Type']/parent::div[contains(@class,'TextInput')]")
		public static WebElement DynamicBitTypeDL;
		
		@FindBy(xpath="//*[text()='Sensor Type']/parent::div[contains(@class,'TextInput')]")
		public static WebElement DynamicSensorTypeDL;
		
		@FindBy(xpath="//div[contains(@class,'util-flex util-textRight')]//button[contains(@type,'button')][normalize-space()='Save']")
		public static WebElement DynamicBitSavebtn;
		
		@FindBy(xpath="//div[contains(@class,'VehicleSummaryCard-details')]")
		public static WebElement VehicleSummaryCardDetails;
		
		@FindBy(xpath="//div[contains(@class,'rt-thead -filters')]//div[2]//input[1]")
		public static WebElement TrailerRegSearchFld;
		
		@FindBy(xpath="//div[contains(@class,'rt-thead -filters')]//div[3]//input[1]")
		public static WebElement TrailerDescSearchFld;
		
		@FindBy(xpath="//button[normalize-space()='Unlink Trailer(s)']")
		public static WebElement UnlinkTrailersBtn;
		
		@FindBy(xpath="//button[normalize-space()='Unlink all trailers']")
		public static WebElement UnlinkAllTrailersBtn;
		
		@FindBy(xpath="//div[contains(@class,'rt-tr -odd')]")
		public static WebElement TrailerRowGroup;
		
		@FindBy(xpath="//button[normalize-space()='Yes' and @type='button']")
		public static WebElement DeleteTrailerYesBtn;	
		
		@FindBy(xpath="(//div[contains(@class,'ReactTable')]//div[@role='rowgroup'])[1]")
		public static WebElement RowgroupFirstItem;	
		
		@FindBy(xpath="(//div[contains(@class,'ReactTable')])[1]")
		public static WebElement RecentActivityTable;	

		
	}

	public static class Driverstab {
		
	    @FindBy(xpath="//a[normalize-space()='Drivers']")
	    public static WebElement Driverstab;
	    
	     @FindBy(xpath="//div[contains(@class,'row')]//input[contains(@type,'text')]")
	     public static WebElement SearchFld;

	     @FindBy(xpath="//button[contains(@class,'Button--grouped')]")
	     public static WebElement btnAddGrp;

	     @FindBy(xpath="//span[normalize-space()='Driver Name']")
	     public static WebElement ClmhdrDriverName;

	     @FindBy(xpath="//span[normalize-space()='Score']")
	     public static WebElement ClmhdrScore;

	     @FindBy(xpath="//span[normalize-space()='Phone']")
	     public static WebElement ClmhdrPhone;

	     @FindBy(xpath="//span[normalize-space()='License']")
	     public static WebElement ClmhdrLicense;

	     @FindBy(xpath="//span[normalize-space()='Gender']")
	     public static WebElement ClmhdrGender;

	     @FindBy(xpath="//span[normalize-space()='Class']")
	     public static WebElement ClmhdrClass;

	     @FindBy(xpath="//span[normalize-space()='Expiration']")
	     public static WebElement ClmhdrExpiration;
			
		 @FindBy(xpath="//a[contains(@href,'/drivers/create')]")
		 public static WebElement AddDriverBtn;
	     	
		 @FindBy(xpath="//a[contains(@href,'/import')]")
		 public static WebElement ImportDriversbtn;
		 
		 @FindBy(xpath="//div[contains(@class, 'groupTilesContainer')]")
		 public static WebElement DriverGroupTiles;
		 
		 @FindBy(xpath="//div[contains(@class, 'styled__Container')]")
		 public static WebElement DriverGroupTilesItem;
		 
		@FindBy(xpath="//button[contains(@aria-label,'open menu')]")
		public static WebElement DriversStatusDL; 
			
		@FindBy(xpath="//div[normalize-space()='Active Drivers' and contains(@id, 'ListDropdown')]")
		public static WebElement ActiveDriversStatus; 
		
		@FindBy(xpath="//div[normalize-space()='All Drivers' and contains(@id, 'ListDropdown')]")
		public static WebElement AllDriversStatus; 
		
		@FindBy(xpath="//div[normalize-space()='Inactive Drivers' and contains(@id, 'ListDropdown')]")
		public static WebElement InactiveDriversStatus;
		
		@FindBy(xpath="//div[normalize-space()='Driver ID Tags' and contains(@id, 'ListDropdown')]")
		public static WebElement DriverIDTagStatus;
		
		@FindBy(xpath="//div[@class='rt-tr-group' and @role='rowgroup']")
		public static WebElement DriverRowGroup;
		
		@FindBy(xpath="//button[normalize-space()='Back to Drivers']")
		public static WebElement BacktoDriversBtn;
		
		@FindBy(xpath="//button[normalize-space()='Edit Driver']")
		public static WebElement EditDriverBtn;
		
		@FindBy(xpath="//button[normalize-space()='Deactivate Driver']")
		public static WebElement DeactivateDriverBtn;
		
		@FindBy(xpath="//button[normalize-space()='Activate Driver']")
		public static WebElement ActivateDriverBtn;
		
		@FindBy(xpath="//label[contains(@for,'Driver Name')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objDriverName;
		
		@FindBy(xpath="//label[contains(@for,'Driver Name')]")
		public static WebElement chckbxDriverName;
		
		@FindBy(xpath="//label[contains(@for,'Score')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objScore;
		
		@FindBy(xpath="//label[contains(@for,'Score')]")
		public static WebElement chckbxScore;
		
		@FindBy(xpath="//label[contains(@for,'Phone')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objPhone;
		
		@FindBy(xpath="//label[contains(@for,'Phone')]")
		public static WebElement chckbxPhone;
		
		@FindBy(xpath="//label[contains(@for,'License')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objLicense;
		
		@FindBy(xpath="//label[contains(@for,'License')]")
		public static WebElement chckbxLicense;
		
		@FindBy(xpath="//label[contains(@for,'Gender')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objGender;
		
		@FindBy(xpath="//label[contains(@for,'Gender')]")
		public static WebElement chckbxGender;
		
		@FindBy(xpath="//label[contains(@for,'Class')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objClass;
		
		@FindBy(xpath="//label[contains(@for,'Class')]")
		public static WebElement chckbxClass;
		
		@FindBy(xpath="//label[contains(@for,'Expiration')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objExpiration;
		
		@FindBy(xpath="//label[contains(@for,'Expiration')]")
		public static WebElement chckbxExpiration;
		
		@FindBy(xpath="//div[contains(@class, 'styled__Container')]")
		public static List<WebElement> DriverlistGroupItemsNumber;
		
		@FindBy(xpath="//div[(@title='Total Groups')]/following-sibling::div[contains(@class,'Stats-value ')]")
		public static WebElement TotalDriverGroupNumber;
			
		@FindBy(xpath="//div[normalize-space()='First name is required']") 
		public static WebElement FirstNameFldErrorTxt;
		
		@FindBy(xpath="//div[normalize-space()='Email is required']") 
		public static WebElement EmailFldErrorTxt;
		
		@FindBy(xpath="//input[@name='eMail']")
		public static WebElement EmailFld;
		
		@FindBy(xpath="//input[@name='driverName']")
		public static WebElement FirstNameFld;
		
		@FindBy(xpath="//input[@name='driverSurname']")
		public static WebElement LastNameFld;
		
		@FindBy(xpath="//input[@name='idNumber']")
		public static WebElement IDPassportFld;
		
		@FindBy(xpath="//input[contains(@value,'1') and contains(@type, 'radio')]")
		public static WebElement MaleRadiobtn;
		
		@FindBy(xpath="//input[contains(@value,'2') and contains(@type, 'radio')]")
		public static WebElement FemaleRadiobtn;
		
		@FindBy(xpath="//button[normalize-space()='Save' and contains(@class, 'Button--action')]")
		public static WebElement DriverSaveBtn;
		
		@FindBy(xpath="//input[contains(@type,'file') and contains(@name,'Upload Image')]")
		public static WebElement UploadImgBtn;
		
		@FindBy(xpath="//button[normalize-space()='Clear image']")
		public static WebElement ClearImgBtn;
		
		@FindBy(xpath="//div[normalize-space()='Details' and contains(@class, 'root-item')]")
		public static WebElement Detailssubtab;
		
		@FindBy(xpath="//div[normalize-space()='General Info' and contains(@class, 'sub-item')]")
		public static WebElement GeneralInfosubtab;
		
		@FindBy(xpath="//div[normalize-space()='License' and contains(@class, 'sub-item')]")
		public static WebElement Licensesubtab;
		
		@FindBy(xpath="//div[normalize-space()='Vehicle Permissions' and contains(@class, 'sub-item')]")
		public static WebElement Permissionssubtab;
		
		@FindBy(xpath="//div[normalize-space()='Driver ID Tags' and contains(@class, 'root-item')]")
		public static WebElement DriverIDsubtab;
		
		@FindBy(xpath="//div[normalize-space()='Notes' and contains(@class, 'root-item')]")
		public static WebElement Notessubtab;
		
		@FindBy(xpath="//div[normalize-space()='Vehicles' and @id='tab-items']")
		public static WebElement VehicleclmhdrPermission;
		
		@FindBy(xpath="//div[normalize-space()='Groups' and @id='tab-groups']")
		public static WebElement GroupsclmhdrPermission;
		
		@FindBy(xpath="//input[contains(@name,'licenseNumber')]")
		public static WebElement LicenseNumberFld;
		
		@FindBy(xpath="//input[contains(@name,'licenseIssuedCountry')]")
		public static WebElement LicenseIssuedCountryFld;
		
		@FindBy(xpath="//input[contains(@name,'licensePoints')]")
		public static WebElement LicensePointsFld;
		
		@FindBy(xpath="//input[contains(@name,'licenseDriverRestrictions')]")
		public static WebElement LicenseDriverRestrictionsFld;
		
		@FindBy(xpath="//span[normalize-space()='Can Drive All Vehicles' and contains(@class,'Checkbox-label')]")
		public static WebElement DriveAllVehicleschkbx;
		
		@FindBy(xpath="//button[normalize-space()='Back to Drivers' and @type='button']")
		public static WebElement DriversBackBtn;
		
		@FindBy(xpath="//button[normalize-space()='Add New']")
		public static WebElement AddNewNoteBtn;
		
		@FindBy(xpath="//input[contains(@name,'note')]")
		public static WebElement DriverNoteFld;
		
		@FindBy(xpath="//div[contains(@class,'rt-tr-group')]//*[local-name()='svg' and contains(@class, 'pencil')]//parent::button[contains(@type,'button')]")
		public static WebElement EditDriverNotebtn;
		
		@FindBy(xpath="//div[contains(@class,'rt-tr-group')]//*[local-name()='svg' and contains(@class, 'trash')]//parent::button[contains(@type,'button')]")
		public static WebElement DeleteDriverNotebtn;
		
		@FindBy(xpath="//div[contains(@class,'rt-tr-group')]//*[local-name()='svg' and contains(@data-icon, 'check')]")
		public static WebElement ConfirmAddDriverNotebtn;
		
		@FindBy(xpath="//div[contains(@class,'rt-tr-group')]//*[local-name()='svg' and contains(@data-icon, 'time')]")
		public static WebElement CancelAddDriverNotebtn;
		
		@FindBy(xpath="//div[contains(@class,'rt-td util-tableCenter')]//*[local-name()='svg' and contains(@data-icon, 'pencil')]")
		public static WebElement EditDriverIDTagbtn;
			
		@FindBy(xpath="//div[contains(@class,'util-flex util-justifySpaceAround')]//*[local-name()='svg' and contains(@data-icon, 'check')]")
		public static WebElement SaveDriverIDTagbtn;
		
		@FindBy(xpath="//div[contains(@class,'util-flex util-justifySpaceAround')]//*[local-name()='svg' and contains(@data-icon, 'times')]")
		public static WebElement CancelDriverIDTagbtn;
		
		@FindBy(xpath="//div[contains(@role,'gridcell')]//div//div[contains(@role,'combobox')]")
	    public static WebElement DriverNameDL;
		
		@FindBy(xpath="//input[contains(@name,'description')]")
	    public static WebElement DIDDescFld;
		
		@FindBy(xpath="//span[text()='Start Date']//ancestor::div[contains(@class,'TextInput')]//*[local-name()='svg' and contains(@class, 'calendar-alt')]")
	    public static WebElement dtpickerDIDStartDateIcon;
		
		@FindBy(xpath="//span[text()='End Date']//ancestor::div[contains(@class,'TextInput')]//*[local-name()='svg' and contains(@class, 'calendar-alt')]")
	    public static WebElement dtpickerDIDEndDateIcon;
		
		@FindBy(xpath="//div[contains(@class,'assign-id-tag__IdTagItem')]")
		public static WebElement DriverIDTagItem;
		
		@FindBy(xpath="//*[local-name()='svg' and contains(@data-icon, 'trash')]")
		public static WebElement DriverIDTagItemDeleteBtn;
		
		@FindBy(xpath="//body/div[@id='app']/div[@id='router-root']/div[@class='DetailContainer ']/div[@class='row util-noMargin']/div[@class='util-textCenter col-xs-9 col-xs']/div[@class='assign-id-tag__IdTagItem-ckuYrS fgbcQX']/div[@class='assign-id-tag__RightSideTagItem-isGlbs gkrgPw']/div[@class='assign-id-tag__GridContainer-feFyf bTISsl']/div[2]//*[local-name()='svg']")
		public static WebElement DriverIDTagItemEditBtn;
		
		@FindBy(xpath="//div[@class='assign-id-tag__AlignRight-jDUtDZ juWFqA']//*[local-name()='svg' and contains(@data-icon, 'question-circle')]")
		public static WebElement DriverIDTagItemLostBtn;
		
		@FindBy(xpath="//button[@type='submit']//*[local-name()='svg' and contains(@data-icon, 'check')]")
		public static WebElement SaveDriverIDTagbtnDriversPage;
		
		@FindBy(xpath="//input[@name='startDate']")
	    public static WebElement dtpickerDIDStartDateIconDriversPage;
	    
		@FindBy(xpath="//input[@name='endDate']")
	    public static WebElement dtpickerDIDEndDateIconDriversPage;
		
		@FindBy(xpath="//span[normalize-space()='Unassign']")
		public static WebElement UnassignToggle;
		
		@FindBy(xpath="//div[normalize-space()='Available' and contains(@class, 'driver-id-tags__TabItem')]")
		public static WebElement AvailableDIDTab;
		
		@FindBy(xpath="//li[@id='driver-id-tags-tab']")
		public static WebElement DriverIDTags;
		
		@FindBy(xpath="//*[text()='Lost']")
		public static WebElement LostTags;
		
		@FindBy(xpath="//span[normalize-space()='Recover']")
		public static WebElement RecoverToggle;
		
		@FindBy(xpath="//span[normalize-space()='Select Tags']")
		public static WebElement SelectTagBtn;
		
		@FindBy(xpath="//div[@role='gridcell']//div[@class='Checkbox table-select']")
		public static WebElement DIDCheckbox;
		
		@FindBy(xpath="//span[normalize-space()='Mark as lost']")
		public static WebElement MarkAsLostBtn;
		
		@FindBy(xpath="//button[normalize-space()='Add New']")
		public static WebElement AddNewBtn;
		
		@FindBy(xpath="//div[normalize-space()='Vehicles' and contains(@class,'item-group-selector')]")
		public static WebElement SelectVehicle;
		
		@FindBy(xpath="//div[normalize-space()='groups' and contains(@class,'item-group-selector')]")
		public static WebElement SelectVehicleGroup;
		
		}
	
	public static class POItab {
		
	    @FindBy(xpath="//a[contains(@href,'/landmarks')]")
	    public static WebElement POItab;
		
		@FindBy(xpath="//button[normalize-space()='Edit Multiple' and @type='button']")
		public static WebElement POIEditMultipleBtn;
		
		@FindBy(xpath="//a[normalize-space()='Add Point of Interest' and @href='/landmarks/create']")
		public static WebElement AddPOIBtn;
		
		@FindBy(xpath="//button[normalize-space()='Edit POI']")
		public static WebElement EditPOIBtn;
		
		@FindBy(xpath="//a[normalize-space()='Import Points of Interest' and @href='/import']")
		public static WebElement ImportPOIBtn;
		
		@FindBy(xpath="//div[@class='  TextInput  ']/descendant::*[contains(@type,'text')]")
		public static WebElement LocationSearchFld;
		
		@FindBy(xpath="//div[@role='listbox']/descendant::*[contains(.,'Merlion Park')]")
		public static WebElement LocationListBoxItem;
		
		@FindBy(xpath="//form[contains(@class,'MapDetailView')]/descendant::*[contains(@name,'name')]")
		public static WebElement POINameFld;
		
		@FindBy(xpath="//textarea[@type='text' and @name='description']")
		public static WebElement POIDescriptionFld;
		
		@FindBy(xpath="//input[@type='text' and @name='radius']")
		public static WebElement POIRadiusFld;
		
		@FindBy(xpath="//button[normalize-space()='Save' and contains(@class, 'Button--action')]")
		public static WebElement POISaveBtn;
		
		@FindBy(xpath="//button[normalize-space()='Cancel' and contains(@class, 'Button--default')]")
		public static WebElement POICancelBtn;
		
		@FindBy(xpath="//button[normalize-space()='Back to Points of Interest']")
		public static WebElement POIBackBtn;
		
	    @FindBy(xpath="//span[normalize-space()='POI Name']")
	    public static WebElement ClmhdrPOIName;
	     
	    @FindBy(xpath="//span[normalize-space()='Owner']")
	    public static WebElement ClmhdrOwner;
	     
	    @FindBy(xpath="//span[normalize-space()='Address']")
	    public static WebElement ClmhdrAddress;
		
	    @FindBy(xpath="//span[normalize-space()='Description']")
	    public static WebElement ClmhdrDescription;
	    
	    @FindBy(xpath="//span[normalize-space()='Colour']")
	    public static WebElement ClmhdrColour;
		
	    @FindBy(xpath="//span[normalize-space()='Radius']")
	    public static WebElement ClmhdrRadius;
	    
	    @FindBy(xpath="//div[contains(@class,'Stats-box')]")
	    public static WebElement TotalPOI;
	        
	    @FindBy(xpath="//div[contains(@class,'toast--success')]")
	    public static WebElement POISuccess;
	    
		@FindBy(xpath="//div[@class='  TextInput  ']/descendant::span[normalize-space()='Colour']")
		public static WebElement ColorDL;
		
		@FindBy(xpath="//div[contains(@class, 'TextInput')]/descendant::span[normalize-space()='Description']")
		public static WebElement EditMultipleDescriptionFld;
		
		@FindBy(xpath="//div[@class='rt-tr-group' and @role='rowgroup']")
		public static WebElement POIRowGroup;
		
		@FindBy(xpath="//label[contains(@for,'Address')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objAddress;
		
		@FindBy(xpath="//label[contains(@for,'Address')]")
		public static WebElement chckbxAddress;
		
		@FindBy(xpath="//label[contains(@for,'Color')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objColour;
		
		@FindBy(xpath="//label[contains(@for,'Color')]")
		public static WebElement chckbxColour;
		
		@FindBy(xpath="//label[contains(@for,'Description')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objDescription;
		
		@FindBy(xpath="//label[contains(@for,'Description')]")
		public static WebElement chckbxDescription;
		
		@FindBy(xpath="//label[contains(@for,'Landmark Name')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objPOIName;
		
		@FindBy(xpath="//label[contains(@for,'Landmark Name')]")
		public static WebElement chckbxPOIName;
		
		@FindBy(xpath="//label[contains(@for,'Owner')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objOwner;
		
		@FindBy(xpath="//label[contains(@for,'Owner')]")
		public static WebElement chckbxOwner;
		
		@FindBy(xpath="//label[contains(@for,'Description')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objRadius;
		
		@FindBy(xpath="//label[contains(@for,'Description')]")
		public static WebElement chckbxRadius;
		
		@FindBy(xpath="//span[@class='MapDetailView-infoContainer-name']")
		public static WebElement EditPOINameTxt;
		
		@FindBy(xpath="//span[@class='MapDetailView-infoContainer-address']")
		public static WebElement EditPOIAddressText;
		
		@FindBy(xpath="//div[contains(@class,'LandmarkMarker')]//*[local-name()='svg']")
		public static WebElement EditPOIMarker;
		
		@FindBy(xpath="//button[normalize-space()='Yes, Delete' and @type='button']")
		public static WebElement DeleteYesBtn;	
		
		@FindBy(xpath="//button[normalize-space()='Delete' and @type='button']")
		public static WebElement DeleteBtn;	
		
		@FindBy(xpath="//div[@class='ImportUploader-overlay']")
		public static WebElement Importoverlay;	
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Result')]")
		public static WebElement ImportResultClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'POI Name')]")
		public static WebElement ImportPOINameClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'POI Description')]")
		public static WebElement ImportPOIDescriptionClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Lat')]")
		public static WebElement ImportLatClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Lon')]")
		public static WebElement ImportLonClmhdr;
		
		@FindBy(xpath="//span[text()='Description']//parent::div[contains(@class, 'TextInput-placeholder')]/preceding-sibling::input[@type='text']")
		public static WebElement POIListDescriptionFld;
		
		@FindBy(xpath="//span[text()='Colour']//parent::div[contains(@class, 'TextInput-placeholder')]/preceding-sibling::input[@type='text']")
		public static WebElement POIListColorDL;
		
	}
	
	public static class Geofencestab {

	    @FindBy(xpath="//a[contains(@href,'/geofences')]")
	    public static WebElement Geofencestab;
		
		@FindBy(xpath="//a[normalize-space()='Add Geofence' and @href='/geofences/create']")
		public static WebElement AddGeofenceBtn;
		
		@FindBy(xpath="//a[normalize-space()='Import Geofences' and @href='/import']")
		public static WebElement btnImportGeofence;
	
	    @FindBy(xpath="//span[normalize-space()='Geofence Name']")
	    public static WebElement ColGeofenceName;
	     
	    @FindBy(xpath="//span[normalize-space()='Owner']")
	    public static WebElement ColOwner;
	     
	    @FindBy(xpath="//span[normalize-space()='Location']")
	    public static WebElement ColLocation;
		
	    @FindBy(xpath="//span[normalize-space()='Description']")
	    public static WebElement ColDescription;
	    
	    @FindBy(xpath="//span[normalize-space()='Last Updated']")
	    public static WebElement ColLastUpdated;
	    
		@FindBy(xpath="//div[@class='  TextInput  ']/descendant::*[contains(@type,'text')]")
		public static WebElement GFLocationSearchFld;
		
		@FindBy(xpath="//form[contains(@class,'MapDetailView')]/descendant::*[contains(@name,'name')]")
		public static WebElement GFNameFld;
		
		@FindBy(xpath="//textarea[@type='text' and @name='description']")
		public static WebElement GFDescriptionFld;
		
		@FindBy(xpath="//div[contains(@class, 'CustomDropdown')]/descendant::input[contains(@placeholder, 'Vehicles to Apply')]")
		public static WebElement VehicleDL;
		
		@FindBy(xpath="//div[contains(@class, 'CustomDropdown')]/descendant::input[contains(@placeholder, 'Geofence Groups')]")
		public static WebElement GeofenceGrpDL;
		
		@FindBy(xpath="//div[contains(@class, 'GeofencesDropdown')]")
		public static WebElement ExistingGeofenceDL;
		
		@FindBy(xpath="//*[name()='polygon' and contains(@class,'Geofence-s')]")
		public static WebElement GeofencePolygon;
		
		@FindBy(xpath="//button[normalize-space()='Edit Geofence']")
		public static WebElement EditGeofenceBtn;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Result')]")
		public static WebElement ImportResultClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Geofence Name')]")
		public static WebElement ImportGeofenceNameClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Geofence Description')]")
		public static WebElement ImportGeofenceDescriptionClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Type(Circle/Square)')]")
		public static WebElement ImportGeofenceTypeClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Lat')]")
		public static WebElement ImportLatClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Lon')]")
		public static WebElement ImportLonClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Size(meters)')]")
		public static WebElement ImportGeofenceSizeClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Points (Lat#Lon#Lat#Lon...)')]")
		public static WebElement ImportPointsClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Group Name')]")
		public static WebElement ImportGroupNameClmhdr;
		
		@FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Group Description')]")
		public static WebElement ImportGroupDescriptionClmhdr;
		
		@FindBy(xpath="//button[normalize-space()='Delete']")
		public static WebElement btnDeleteGeofence;
		
		@FindBy(xpath="//button[normalize-space()='Yes, Delete' and @type='button']")
		public static WebElement DeleteYesBtn;
		
		@FindBy(xpath="//label[@for='master' and 'Checkbox-box']")
		public static WebElement chckbxSelectAllGeofence;
		
		@FindBy(xpath="//button[normalize-space()='Save' and contains(@class, 'Button--action')]")
		public static WebElement GeofenceSaveBtn;
		
		@FindBy(xpath="//button[normalize-space()='Back to Geofences']")
		public static WebElement GeofenceBackBtn;
		
		@FindBy(xpath="//div[@class='rt-tr-group' and @role='rowgroup']")
		public static WebElement GeofenceRowGroup;
		
		 @FindBy(xpath="//div[contains(@class, 'styled__Container')]")
		 public static WebElement GeofenceGroupTilesItem;
	}
	
	public static class Routestab {
		
	    @FindBy(xpath="//a[contains(@href,'/routes')]")
	    public static WebElement Routestab;	
	
	    @FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Name')]")
	    public static WebElement ClmhdrName;	
	    
	    @FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Description')]")
	    public static WebElement ClmhdrDescription;	
	    
	    @FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Border Width')]")
	    public static WebElement ClmhdrBorderWidth;	
	    
	    @FindBy(xpath="//div[contains(@class,'rt-resizable-header-content')]//span[contains(text(),'Last Updated')]")
	    public static WebElement ClmhdrLastUpdated;	
	    
		@FindBy(xpath="//label[contains(@for,'Name')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objName;
		
		@FindBy(xpath="//label[contains(@for,'Name')]")
		public static WebElement chckbxName;
		
		@FindBy(xpath="//label[contains(@for,'Description')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objDescription;
		
		@FindBy(xpath="//label[contains(@for,'Description')]")
		public static WebElement chckbxDescription;
		
		@FindBy(xpath="//label[contains(@for,'Border Width')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objBorderWidth;
		
		@FindBy(xpath="//label[contains(@for,'Border Width')]")
		public static WebElement chckbxBorderWidth;
		
		@FindBy(xpath="//label[contains(@for,'Last Updated')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objLastUpdated;
		
		@FindBy(xpath="//label[contains(@for,'Class')]")
		public static WebElement chckbxLastUpdated;
	    
	    @FindBy(xpath="//div[contains(@class,'rt-tr-group')]//*[local-name()='svg' and contains(@class, 'pencil')]//parent::button[contains(@type,'button')]")
	    public static WebElement EditRouteListItembtn;	
	    
	    @FindBy(xpath="//div[contains(@class,'rt-tr-group')]//*[local-name()='svg' and contains(@class, 'pencil')]//parent::button[contains(@type,'button')]")
	    public static List<WebElement> RouteListCount;	
	    
	    @FindBy(xpath="//div[contains(@class,'rt-tr-group')]//*[local-name()='svg' and contains(@class, 'trash')]//parent::button[contains(@type,'button')]")
	    public static WebElement DeleteRouteListItembtn;	
	    
		@FindBy(xpath="//div[(@title='Total Routes')]/following-sibling::div[contains(@class,'Stats-value ')]")
		public static WebElement TotalRoutesNumber;
	    
		@FindBy(xpath="//div[@class='rt-tr-group' and @role='rowgroup']")
		public static WebElement RoutesListRowGroup;
		
		@FindBy(xpath="//div[@class='rt-tr-group' and @role='rowgroup']")
		public static List<WebElement> RoutesListRowGroupItems;
		
		@FindBy(xpath="//a[@href='/routes/add-route']")
		public static WebElement AddRouteBtn;
		
		@FindBy(xpath="//a[@href='/routes/add-route-plan']")
		public static WebElement AddRoutePlanBtn;
		
		@FindBy(xpath="//input[@name='routeName']")
		public static WebElement RouteNameFld;
		
		@FindBy(xpath="//input[@name='routeDescription']")
		public static WebElement RouteDescriptionFld;
		
		@FindBy(xpath="//input[@name='borderWidth']")
		public static WebElement RouteBorderWidthFld;
		
		@FindBy(xpath="//*[contains(.,'Vehicles')]/ancestor::*[contains(@class,'  TextInput  ')]")
		public static WebElement RouteVehiclesDL;
		
		@FindBy(xpath="//div[normalize-space()='Ah Soon' and contains(@role, 'option')]")
		public static WebElement VehicleChoice;
		
		@FindBy(xpath="//li[@data-target='Trip data']")
		public static WebElement TripDataSubtab;
		
		@FindBy(xpath="//div[contains(@class,'TripPanel') and @role='button']")
		public static WebElement TripPanel;
		
		@FindBy(xpath="//div[contains(@class,'TripPanel') and @role='button']")
		public static List<WebElement> TripPanellist;
		
		@FindBy(xpath="//div[contains(@class,'Routes-content-count')]")
		public static WebElement TripCount;
		
		@FindBy(xpath="//div[contains(@class,'Routes-content-list')]")
		public static WebElement TripCount0;
		
		@FindBy(xpath="//div[normalize-space()='Start Date']//*[local-name()='svg']")
		public static WebElement dtpickerStartDateIcon;
		
		@FindBy(xpath="//div[normalize-space()='End Date']//*[local-name()='svg']")
		public static WebElement dtpickerEndDateIcon;
		
		@FindBy(xpath="//div[contains(@class,'Routes-content-trip-filter')]//button[contains(@type,'button')]")
		public static WebElement TripSearchBtn;
		
		@FindBy(xpath="//button[normalize-space()='Save' and contains(@class, 'Button--action')]")
		public static WebElement SaveBtn;
		
		@FindBy(xpath="//button[normalize-space()='Update' and contains(@class, 'Button--action')]")
		public static WebElement UpdateBtn;
		
		@FindBy(xpath="//input[contains(@name,'rpName')]")
		public static WebElement RPNameFld;
		
		@FindBy(xpath="//input[@name= 'rpRouteType']")
		public static WebElement RPRouteTypeDL;
		
		@FindBy(xpath="//input[@name= 'rpVehicle']")
		public static WebElement RPVehicleDL;
		
		@FindBy(xpath="//input[@name= 'rpRoute']")
		public static WebElement RPRouteDL;
		
		@FindBy(xpath="//*[text()='Driver']//parent::div[contains(@class,'TextInput-placeholder')]/preceding-sibling::input[@type= 'text']")
		public static WebElement RPDriverDL;
		
		@FindBy(xpath="//li[contains(@data-target,'Alerts')]")
		public static WebElement Alertssubtab;
		
		@FindBy(xpath="//input[contains(@value,'rss') and contains(@type, 'radio')]")
		public static WebElement AlertRSSRadiobtn;
		
		@FindBy(xpath="//input[contains(@value,'email') and contains(@type, 'radio')]")
		public static WebElement AlertEmailRadiobtn;
		
		@FindBy(xpath="//input[contains(@value,'sms') and contains(@type, 'radio')]")
		public static WebElement AlertSMSRadiobtn;
		
		@FindBy(xpath="//label[@for='rpAlertMethod.value']//input[@id='rpAlertMethod.value' and @type='text']")
		public static WebElement AlertEmailFld;
		
		@FindBy(xpath="//label[@for='rpAlertMethod.value']//input[@id='rpAlertMethod.value' and @type='number']")
		public static WebElement AlertSMSFld;
		
		@FindBy(xpath="//input[@name='Start of Route']//parent::div[@class='Checkbox']")
		public static WebElement StartofRoutechkbx;
		
		@FindBy(xpath="//input[@name='End of Route']//parent::div[@class='Checkbox']")
		public static WebElement EndofRoutechkbx;
		
		@FindBy(xpath="//input[@name='Route Deviation']//parent::div[@class='Checkbox']")
		public static WebElement RouteDeviationchkbx;
		
		@FindBy(xpath="//input[@name='Route return after deviation']//parent::div[@class='Checkbox']")
		public static WebElement RouteReturnAfterDeviationchkbx;
		
		@FindBy(xpath="//input[@name='Route cancelled by Deviation']//parent::div[@class='Checkbox']")
		public static WebElement RouteCancelledbyDeviationchkbx;
		
		@FindBy(xpath="//input[@name='Route Slow Progress (%)']//parent::div[@class='Checkbox']")
		public static WebElement RouteSlowProgresschkbx;
		
		@FindBy(xpath="//input[@name='Route Slow Progress (%)']//ancestor::div[@class='col-xs-8']/following-sibling::div[@class='col-xs-3']/div[contains(@class, 'InputDropdown')]")
		public static WebElement RouteSlowProgressDL;
		
		@FindBy(xpath="//input[@name='Not Started within Time (mins)']//parent::div[@class='Checkbox']")
		public static WebElement NotStartedwithinTimechkbx;
		
		@FindBy(xpath="//input[@name='Not Started within Time (mins)']//ancestor::div[@class='col-xs-8']/following-sibling::div[@class='col-xs-3']/div[contains(@class, 'InputDropdown')]")
		public static WebElement NotStartedwithinTimeDL;
		
		@FindBy(xpath="//input[@name='Route not ended on time']//parent::div[@class='Checkbox']")
		public static WebElement RouteNotEndedontimechkbx;		
		
		@FindBy(xpath="//div[@class='Routes-content']")
		public static WebElement RouteContents;
		
		@FindBy(xpath="//div[@class='col-xs-4']")
		public static WebElement RoutePlanItems;
		
		@FindBy(xpath="//div[@id='next']")
		public static WebElement RoutePlanItemsNextBtn;
		
		@FindBy(xpath="//button[normalize-space()='Check All']")
		public static WebElement WeeklyCheckAllBtn;

	     @FindBy(xpath="//div[contains(@class,'row')]//input[contains(@type,'text')]")
	     public static WebElement SearchFld;
		
		@FindBy(xpath="//button[normalize-space()='Yes, Confirm' and @type='button']")
		public static WebElement DeleteYesBtn;
		
		@FindBy(xpath="//span[normalize-space()='RoutePlanName']//parent::div[@class='Card-top-name']//ancestor::div[@class='col-xs-4']")
		public static WebElement CreatedRoutePlanCard;
	}
	
	public static class Trailerstab {
		
	    @FindBy(xpath="//a[contains(@href,'/trailers')]")
	    public static WebElement Trailerstab;
		
		@FindBy(xpath="//input[@type='text' and @name='registration']")
		public static WebElement TrailersRegNameFld;
	
		@FindBy(xpath="//input[@type='text' and @name='description']")
		public static WebElement TrailersDescriptionFld;

		@FindBy(xpath="//button[normalize-space()='Back to Trailers' and @type='button']")
		public static WebElement TrailersBackBtn;	
		
		@FindBy(xpath="//a[normalize-space()='Add Trailer' and @href='/trailers/create']")
		public static WebElement AddTrailerBtn;
		
	    @FindBy(xpath="//span[normalize-space()='Registration']")
	    public static WebElement ClmhdrRegistration;
		
	    @FindBy(xpath="//span[normalize-space()='Description']")
	    public static WebElement ClmhdrDescription;
	    
	    @FindBy(xpath="//div[@class='rt-td' and @role='gridcell']")
	    public static WebElement TrailersTableCell;	
	    
		@FindBy(xpath="//button[normalize-space()='Save' and contains(@class, 'Button--action')]")
		public static WebElement TrailersSaveBtn;
	  
		@FindBy(xpath="//div[contains(.,'SampleSearchTrailer')]/ancestor::*[contains(@class,'rt-tr-group')]")
		public static WebElement searchresultReg;
		
		@FindBy(xpath="//div[contains(.,'DescriptionSearch')]/ancestor::*[contains(@class,'rt-tr-group')]")
		public static WebElement searchresultDesc;
		
		@FindBy(xpath="//div[contains(.,'EditRegTrailer')]/ancestor::*[contains(@class,'rt-tr-group')]")
		public static WebElement EditRegBefore;
		
		@FindBy(xpath="//div[contains(.,'EditDescriptionTrailer')]/ancestor::*[contains(@class,'rt-tr-group')]")
		public static WebElement EditDescBefore;
		
		@FindBy(xpath="//div[contains(.,'EditedRegTrailer')]/ancestor::*[contains(@class,'rt-tr-group')]")
		public static WebElement EditRegAfter;
		
		@FindBy(xpath="//div[contains(.,'EditedDescriptionTrailer')]/ancestor::*[contains(@class,'rt-tr-group')]")
		public static WebElement EditDescAfter;
		
		@FindBy(xpath="//textarea[contains(@name,'description')]")
		public static WebElement txtbxDescription;
		
		@FindBy(xpath="//input[contains(@name,'registration')]")
		public static WebElement txtbxReg;
		
		@FindBy(xpath="//button[normalize-space()='Delete Trailer' and @type='button']")
		public static WebElement DeleteTrailerBtn;
		
		@FindBy(xpath="//button[normalize-space()='Yes' and @type='button']")
		public static WebElement DeleteYesBtn;	
		
		@FindBy(xpath="//button[normalize-space()='No' and @type='button']")
		public static WebElement DeleteNoBtn;	
		
	}

	public static class AssetTrackerstab {	

	    @FindBy(xpath="//a[contains(@href,'/asset-trackers')]")
	    public static WebElement AssetTrackerstab;
		
	    @FindBy(xpath="//div[@class='rt-resizable-header-content']//span[contains(text(),'Name')]")
	    public static WebElement ClmhdrName;
		
	    @FindBy(xpath="//span[normalize-space()='Description']")
	    public static WebElement ClmhdrDescription;
	    
	    @FindBy(xpath="//div[@class='rt-resizable-header-content']//span[contains(text(),'Icon')]")
	    public static WebElement ClmhdrIcon;
	    
	    @FindBy(xpath="//span[normalize-space()='Asset Purchase Date']")
	    public static WebElement ClmhdrAssetPurchaseDate;
		
	    @FindBy(xpath="//span[normalize-space()='Date Installed']")
	    public static WebElement ClmhdrDateInstalled;
	    
	    @FindBy(xpath="//span[normalize-space()='Next Service Date']")
	    public static WebElement ClmhdrNextServiceDate;
		
	    @FindBy(xpath="//span[normalize-space()='Asset Reg/Serial Number']")
	    public static WebElement ClmhdrAssetRegSerialNumber;
	    
	    @FindBy(xpath="//span[normalize-space()='Colour']")
	    public static WebElement ClmhdrColour;
		
	    @FindBy(xpath="//span[normalize-space()='Image']")
	    public static WebElement ClmhdrImage;
	    
		@FindBy(xpath="//div[(@title='Total Asset Trackers')]/following-sibling::div[contains(@class,'Stats-value ')]")
		public static WebElement TotalAssetTracker;
		
		@FindBy(xpath="//label[contains(@for,'Name')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objName;
		
		@FindBy(xpath="//label[contains(@for,'Name')]")
		public static WebElement chckbxName;
		
		@FindBy(xpath="//label[contains(@for,'Description')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objDescription;
		
		@FindBy(xpath="//label[contains(@for,'Description')]")
		public static WebElement chckbxDescription;
		
		@FindBy(xpath="//label[contains(@for,'Icon')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objIcon;
		
		@FindBy(xpath="//label[contains(@for,'Icon')]")
		public static WebElement chckbxIcon;
		
		@FindBy(xpath="//label[contains(@for,'Asset Purchase Date')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objAssetPurchaseDate;
		
		@FindBy(xpath="//label[contains(@for,'Asset Purchase Date')]")
		public static WebElement chckbxAssetPurchaseDate;
		
		@FindBy(xpath="//label[contains(@for,'Date Installed')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objDateInstalled;
		
		@FindBy(xpath="//label[contains(@for,'Date Installed')]")
		public static WebElement chckbxDateInstalled;
		
		@FindBy(xpath="//label[contains(@for,'Next Service Date')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objNextServiceDate;
		
		@FindBy(xpath="//label[contains(@for,'Next Service Date')]")
		public static WebElement chckbxNextServiceDate;
		
		@FindBy(xpath="//label[contains(@for,'Asset Reg/Serial Number')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objAssetRegSerialNumber;
		
		@FindBy(xpath="//label[contains(@for,'Asset Reg/Serial Number')]")
		public static WebElement chckbxAssetRegSerialNumber;
		
		@FindBy(xpath="//label[contains(@for,'Color')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objColour;
		
		@FindBy(xpath="//label[contains(@for,'Color')]")
		public static WebElement chckbxColour;
		
		@FindBy(xpath="//label[contains(@for,'Image')]/ancestor::div[contains(@class,'Checkbox')]/input")
		public static WebElement objImage;
		
		@FindBy(xpath="//label[contains(@for,'Image')]")
		public static WebElement chckbxImage;
		
		@FindBy(xpath="//button[normalize-space()='Back to Asset Trackers' and @type='button']")
		public static WebElement AssetTrackerBackBtn;
		
		@FindBy(xpath="//div[(@title='Total Groups')]/following-sibling::div[contains(@class,'Stats-value ')]")
		public static WebElement TotalDriverGroupNumber;
		
		@FindBy(xpath="//input[@class='TextInput-input is-withValue' and @type='text']")
		public static WebElement AssetTrackerName;
		
		@FindBy(xpath="//body/div[@id='app']/div[@id='router-root']/div[contains(@class,'DetailContainer')]/div[contains(@class,'row')]/div[contains(@class,'col-xs')]/div[contains(@class,'row util-noMargin')]/form[contains(@class,'col-xs-12 col-md-8')]/fieldset[contains(@class,'Form-fieldset')]/div[contains(@class,'row')]/div[1]/input[1]")
		public static WebElement AssetTrackerRegSerial;
		
		
		
	}

	public static class DVIRStab {	

	    @FindBy(xpath="//a[contains(@href,'/dvirs')]")
	    public static WebElement DVIRStab;
		
	    @FindBy(xpath="//span[normalize-space()='Name']")
	    public static WebElement ColName;
		
	    @FindBy(xpath="//span[normalize-space()='Description']")
	    public static WebElement ColDescription;
	    
	    @FindBy(xpath="//span[normalize-space()='Icon']")
	    public static WebElement ColIcon;
	    
	    @FindBy(xpath="//span[normalize-space()='Asset Purchase Date']")
	    public static WebElement ColAssetPurchaseDate;
		
	    @FindBy(xpath="//span[normalize-space()='Date Installed']")
	    public static WebElement ColDateInstalled;
	    
	    @FindBy(xpath="//span[normalize-space()='Next Service Date']")
	    public static WebElement ColNextServiceDate;
		
	    @FindBy(xpath="//span[normalize-space()='Asset Reg/Serial Number']")
	    public static WebElement ColAssetRegSerialNumber;
	    
	    @FindBy(xpath="//span[normalize-space()='Colour']")
	    public static WebElement ColColour;
		
	    @FindBy(xpath="//span[normalize-space()='Image']")
	    public static WebElement ColImage;
	    
	    @FindBy(xpath="//span[normalize-space()='Defect State']")
	    public static WebElement DefectStateDL; 
	    
		@FindBy(xpath="//div[normalize-space()='All Defects' and contains(@id, 'ListDropdown')]")
		public static WebElement AllDefects;
		
		@FindBy(xpath="//div[normalize-space()='Inspected Defects' and contains(@id, 'ListDropdown')]")
		public static WebElement InspectedDefects;
		
		@FindBy(xpath="//div[normalize-space()='Repaired Defects' and contains(@id, 'ListDropdown')]")
		public static WebElement RepairedDefects;
		
		@FindBy(xpath="//div[normalize-space()='New Defects' and contains(@id, 'ListDropdown')]")
		public static WebElement NewDefects;
		
		@FindBy(xpath="//div[@class='rt-tr-group' and @role='rowgroup']")
		public static WebElement DVIRSRowGroup;
		
		@FindBy(xpath="//button[contains(@class, 'InputDropdown')]//span[normalize-space()='Vehicles']")
	    public static WebElement VehiclesDL; 
		
		@FindBy(xpath="//button[contains(@class, 'InputDropdown')]//span[normalize-space()='Drivers']")
	    public static WebElement DriversDL;
				
		
	}	

public static class VehiclesPage {
		
		@FindBy(xpath="//*[text()='Vehicles'][contains(@class,'vehicles')]")
		public static WebElement nvTabVehicles;
		
		@FindBy(xpath="//*[text()='Add Group']/ancestor::button[@type='button']")
		public static WebElement btnAddGroup;
		
		@FindBy(xpath="//*[text()='Name']/ancestor::div[contains(@class,'Group-name')]/input[@name='name']")
		public static WebElement txtbxName;
		
		@FindBy(xpath="//button[text()='Next']")
		public static WebElement btnNext;
		
		@FindBy(xpath="//button[text()='Save']")
		public static WebElement btnSave;
		
		@FindBy(xpath="//h1[contains(@class,'col-xs Group-name')]")
		public static WebElement objGroupName;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
		
		@FindBy(xpath="//*[text()='Search']/ancestor::div[contains(@class,'SearchBar')]/input[1]")
		public static WebElement txtbxSearch;
		
		@FindBy(xpath="//*[text()='No data available']")
		public static WebElement objNoDataAvailable;
		
		@FindBy(xpath="//h2[contains(@class,'Name')]")
		public static List<WebElement> objVehiclesGroupName;
		
		@FindBy(xpath="//label[contains(@for,'master')]")
		public static WebElement chkbxSelectAllVehicles;
		
		@FindBy(xpath="//label[contains(@for,'master')]/preceding::input[1]")
		public static WebElement objSelectAllVehicles;
		
		@FindBy(xpath="//button[text()='Edit Group']")
		public static WebElement btnEditGroup;
		
		@FindBy(xpath="//button[text()='Delete Group']")
		public static WebElement btnDeleteGroup;
		
		@FindBy(xpath="//button[text()='Yes, Delete']")
		public static WebElement btnYesDelete;
		
		@FindBy(xpath="//div[@class='rt-tbody']/div[1]")
		public static WebElement objVehiclesFirstRow;
	
		@FindBy(xpath="//button[@id='edit-vehicle-btn']")
		public static WebElement btnEditVehicle;
		
		@FindBy(xpath="//div[contains(@class,'fleet-chat-bot')][contains(@class,'CrossButton')]")
		public static WebElement objFleetChatbot;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='plus']/parent::button[contains(@class,'ExpandableInput')]")
		public static WebElement btnAddDescriptionField;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='trash-alt']/parent::button[contains(@class,'ExpandableInput')]")
		public static WebElement btnDeleteDescriptionField;
		
		@FindBy(xpath="//div[contains(text(),'Description')]/preceding-sibling::input[@type='text']")
		public static List<WebElement> txtbxDescriptions;
		
		@FindBy(xpath="//div[contains(text(),'Description 2')]/preceding-sibling::input[@type='text']")
		public static WebElement txtbxDescriptions2;
		
		@FindBy(xpath="//div[contains(text(),'Description 3')]/preceding-sibling::input[@type='text']")
		public static WebElement txtbxDescriptions3;
		
		@FindBy(xpath="//button[text()='Cancel']")
		public static WebElement btnCancel;
	
		@FindBy(xpath="//label[contains(@for,'checkbox')]")
		public static WebElement chckbxFirstVehicleOption;
		
		@FindBy(xpath="//div[contains(@class,'FormDetail')]/input[@name='name']")
		public static WebElement txtbxVehicleName;
		
		@FindBy(xpath="//button[text()='Back to Vehicles']")
		public static WebElement btnBackToVehicles;
		
		@FindBy(xpath="//div[contains(@class,'Group-nameTextInput')]//input[@name='name']")
		public static WebElement txtGroupName;
		
		@FindBy(xpath="//div[contains(@class,'SearchBar')]/input[contains(@class,'TextInput')]")
		public static WebElement txtSearchBar;
		
		@FindBy(xpath="//div[contains(@class,'rt-table')]")
		public static WebElement tblVehicleListTable;
		
		@FindBy(xpath="//*[name()='svg'][@data-icon='cogs']/parent::button[1]")
		public static WebElement btnOptions;
		
		@FindBy(xpath="//div[contains(@class,'Stats-value')]")
		public static WebElement objVehicleInGroup;
		
		@FindBy(xpath="//h1[contains(@class,'Group-name')]")
		public static WebElement objVehicleGroupName;
		
		@FindBy(xpath="//li[@id='vehicle-trailers-tab']")
		public static WebElement tabVehicleTrailers;
		
		@FindBy(xpath="//div[contains(@class,'filters')]/descendant::input[1]")
		public static WebElement txtbxTrailersRegistrationSearch;
		
		@FindBy(xpath="//button[normalize-space()='Unlink all Trailers']")
		public static WebElement btnUnlinkAllTrailers;
		
		@FindBy(xpath="//button[normalize-space()='Yes']")
		public static WebElement btnYes;
		
		@FindBy(xpath="//div[@id='vehicle-trailers']/following::div[@class='EditUserVehicleTable']/descendant::*[text()='No data available']")
		public static WebElement objVehicleTrailersNoDataAvailable;
		
	}

	public static class DriversPage {
		
		@FindBy(xpath="//*[text()='Drivers'][contains(@class,'drivers')]")
		public static WebElement nvTabDrivers;
		
		@FindBy(xpath="//a[normalize-space()='Add Driver']")
		public static WebElement btnAddDriver;
		
		//<--- New Driver
		
		@FindBy(xpath="//input[contains(@name,'driverName')]")
		public static WebElement txtbxFirstName;
		
		@FindBy(xpath="//input[contains(@name,'driverSurname')]")
		public static WebElement txtbxLastName;
		
		@FindBy(xpath="//input[contains(@name,'eMail')]")
		public static WebElement txtbxEmail;
		
		@FindBy(xpath="//input[@name='idNumber']")
		public static WebElement txtbxIDPassport;
		
		@FindBy(xpath="//*[text()='Male']/preceding-sibling::input[@name='gender']")
		public static WebElement rdnbtnGenderMale;
		
		@FindBy(xpath="//*[text()='Female']/preceding-sibling::input[@name='gender']")
		public static WebElement rdnbtnGenderFemale;
		
		@FindBy(xpath="//button[text()='Save']")
		public static WebElement btnSave;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
		
		@FindBy(xpath="//div[contains(@class,'PersonInfo-name')]")
		public static WebElement objDriverName;
		
		@FindBy(xpath="//*[text()='Search']/ancestor::div[contains(@class,'SearchBar')]/input[1]")
		public static WebElement txtbxSearch;
			
		@FindBy(xpath="//*[text()='No data available']")
		public static WebElement objNoDataAvailable;
		
		@FindBy(xpath="//input[@name='cellNumber']")
		public static WebElement txtbxCellNUmber;
		
		@FindBy(xpath="//input[@name='licenseNumber']")
		public static WebElement txtbxLicenseNumber;
		
		@FindBy(xpath="//*[text()='State']/ancestor::div[contains(@class,'TextInput')]/input[1]")
		public static WebElement drpdwnState;
		
		@FindBy(xpath="//div[contains(@id,'item-1')]")
		public static WebElement drpdwnStateFirstOption;
		
		@FindBy(xpath="//input[@name='licenseIssuedCountry']")
		public static WebElement txtbxLicenseIssuedCountry;
		
		@FindBy(xpath="//input[@name='licensePoints']")
		public static WebElement txtbxLicensePoints;
		
		@FindBy(xpath="//input[@name='licenseDriverRestrictions']")
		public static WebElement txtbxLicenseDriverRestrictions;
	
		@FindBy(xpath="//label[contains(@for,'master')]")
		public static WebElement chkbxSelectAllVehicles;
		
		@FindBy(xpath="//button[text()='Cancel']")
		public static WebElement btnCancel;
		
		@FindBy(xpath="//label[contains(@for,'checkbox')]")
		public static WebElement chckbxFirstDriverOption;
		
		@FindBy(xpath="//button[text()='Active Drivers']/parent::div[1]")
		public static WebElement drpdwnStatusFilter;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Active Drivers']")
		public static WebElement drpdwnStatusFilterOptionActiveDrivers;
		
		
		//New Driver --->
		
		//<--- New Driver Group 
		
		@FindBy(xpath="//*[text()='Add Group']/ancestor::button[contains(@type,'button')]")
		public static WebElement btnAddGroup;
		
		@FindBy(xpath="//div[contains(@class,'Group-name')]/input[@name='name']")
		public static WebElement txtbxGroupName;
		
		@FindBy(xpath="//button[text()='Next']")
		public static WebElement btnNext;
		
		@FindBy(xpath="//h1[contains(@class,'col-xs Group-name')]")
		public static WebElement objGroupName;
		
		@FindBy(xpath="//button[text()='Edit Group']")
		public static WebElement btnEditGroup;
		
		@FindBy(xpath="//button[text()='Delete Group']")
		public static WebElement btnDeleteGroup;
		
		@FindBy(xpath="//button[text()='Yes, Delete']")
		public static WebElement btnYesDelete;
	
		//New Driver Group --->
		
		//<--- Existing Driver
		
		@FindBy(xpath="//button[text()='Edit Driver']")
		public static WebElement btnEditDriver;
		
		@FindBy(xpath="//input[@id='Upload Image']")
		public static WebElement btnUploadImage;
		
		@FindBy(xpath="//button[text()='Clear image']")
		public static WebElement btnClearImage;
		
		@FindBy(xpath="//div[@id='chat-button-fa']/ancestor::div[contains(@class,'sc-')]/div[contains(@class,'sc-')]")
		public static WebElement objFleetChatbot;
		
		@FindBy(xpath="//label[@for='canDriveAllVehicles']")
		public static WebElement chkbxCanDriveAllVehicles;
		
		@FindBy(xpath="//input[@name='canDriveAllVehicles']")
		public static WebElement objchkbxCanDriveAllVehicles;
		
		@FindBy(xpath="//span[text()='Can Drive All Vehicles']")
		public static WebElement objCanDriveAllVehicles;
		
		@FindBy(xpath="//div[text()='Total Vehicles']/preceding::input[1]")
		public static WebElement txtbxSearchVehicles;
		
		@FindBy(xpath="//div[@title='Total Vehicles']/following::div[1]")
		public static WebElement objTotalVehicles;
		
		@FindBy(xpath="//li[@id='details-tab']")
		public static WebElement tbDetails;
		
		@FindBy(xpath="//div[normalize-space()='Vehicle Permissions']")
		public static WebElement tbVehiclePermission;
		
		@FindBy(xpath="//div[text()='Groups']")
		public static WebElement tbVehicleGroupPermission;
		
		@FindBy(xpath="//div[text()='Total Groups']/preceding::input[1]")
		public static WebElement txtbxSearchVehiclesGroup;
		
		@FindBy(xpath="//div[text()='Total Groups']/following::div[1]")
		public static WebElement objTotalGroups;
		
		@FindBy(xpath="//li[@id='driver-id-tags-tab']")
		public static WebElement tbDriverIDTags;
		
		@FindBy(xpath="//span[text()='Unassign']/parent::div[1]")
		public static List<WebElement> btnUnassign;
		
		@FindBy(xpath="//span[text()='Unassign']/parent::div[1]")
		public static WebElement btnUnassigns;
			
		@FindBy(xpath="//input[@name='description']")
		public static WebElement txtbxTagsDescription;
		
		@FindBy(xpath="//input[@name='startDate']")
		public static WebElement txtbxTagsStartDate;
	
		@FindBy(xpath="//input[@name='endDate']")
		public static WebElement txtbxTagsEndDate;
		
		@FindBy(xpath="//input[@name='startDate']/parent::div[1]/descendant::*[name()='svg'][@data-icon='calendar-alt']")
		public static WebElement objStartDateCalendar;
		
		@FindBy(xpath="//input[@name='endDate']/parent::div[1]/descendant::*[name()='svg'][@data-icon='calendar-alt']")
		public static WebElement objEndDateCalendar;
		
		@FindBy(xpath="//button[@type='submit']")
		public static WebElement btnSubmit;
		
		@FindBy(xpath="//div[contains(@class,'sc-')]/*[name()='svg'][@data-icon='pencil-alt']")
		public static WebElement btnEditYourIDTag;
		
		@FindBy(xpath="//div[contains(@class,'sc-')]/*[name()='svg'][@data-icon='trash-alt']")
		public static WebElement btnDeleteYourIDTag;
		
		@FindBy(xpath="//button[normalize-space()='Confirm']")
		public static WebElement btnConfirm;
		
		@FindBy(xpath="//div[text()='Total Drivers']/following::div[1]")
		public static WebElement objTotalDrivers;
		
		@FindBy(xpath="//button/*[local-name()='svg'][@data-icon='cogs']/parent::button[@type='button']")
		public static WebElement btnCogWheels;
		
		@FindBy(xpath="//div[@class='rt-tr-group']")
		public static WebElement objDriver;
				
		
		//Existing Driver --->
		
		@FindBy(xpath="//a[contains(@href,'drivers/groups')]/div[1]")
		public static WebElement objDriversGroupFolder;
		
		@FindBy(xpath="//button[normalize-space()='Deactivate Driver']")
		public static WebElement btnDeactivateDriver;
		
	}
	
	public static class POIPage {
		
		@FindBy(xpath="//*[text()='Points of Interest'][contains(@class,'landmarks')]")
		public static WebElement nvTabPointOfInterest;
		
		@FindBy(xpath="//*[text()='Landmarks'][contains(@class,'landmarks')]")
		public static WebElement nvTabLandmark;
		
		@FindBy(xpath="//*[text()='Search']/ancestor::div[contains(@class,'SearchBar')]/input[1]")
		public static WebElement txtbxSearch;
		
		@FindBy(xpath="//*[text()='No data available']")
		public static WebElement objNoDataAvailable;
		
		@FindBy(xpath="//button[text()='Edit POI']")
		public static WebElement btnEditPOI;
		
		@FindBy(xpath="//button[text()='Edit Landmark']")
		public static WebElement btnEditLandmark;
		
		@FindBy(xpath="//span[contains(@class,'MapDetailView-infoContainer-name')]")
		public static WebElement objPOIName;
		
		@FindBy(xpath="//a[contains(@href,'landmarks/create')]")
		public static WebElement btnAddPointofInterest;
		
		@FindBy(xpath="//div[text()='Location Search']/preceding::input[1]")
		public static WebElement txtbxLocationSearch;
		
		@FindBy(xpath="//form[contains(@class,'MapDetailView-form')]//input[contains(@name,'name')]")
		public static WebElement txtbxName;
		
		@FindBy(xpath="//textarea[contains(@name,'description')]")
		public static WebElement txtbxDescription;
		
		@FindBy(xpath="//div[contains(@class,'CirclePicker')]")
		public static List<WebElement> objCirclePicker;
		
		@FindBy(xpath="//input[contains(@name,'radius')]")
		public static WebElement txtbxRadius;
		
		@FindBy(xpath="//button[text()='Save']")
		public static WebElement btnSave;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToasterMessage;
		
		@FindBy(xpath="//a[contains(@href,'import')]")
		public static WebElement btnImportsPointsOfInterest;
		
		@FindBy(xpath="//button[text()='Edit Multiple']")
		public static WebElement btnEditMultiple;

		@FindBy(xpath="//label[contains(@for,'master')]")
		public static WebElement chkbxAll;
		
		@FindBy(xpath="//div[@title='Total Points of Interest']/following::div[1]")
		public static WebElement objPointsofInterestTotalCount;
		
		@FindBy(xpath="//div[@title='Total Landmarks']/following::div[1]")
		public static WebElement objLandmarksTotalCount;
		
		@FindBy(xpath="//span[@class='select-wrap -pageSizeOptions']//select")
		public static WebElement objPagination;
		
		@FindBy(xpath="//div[text()='Colour']/preceding::input[1]")
		public static WebElement drpdwnColour;
		
		@FindBy(xpath="//div[text()='Color']/preceding::input[1]")
		public static WebElement drpdwnColor;
		
		@FindBy(xpath="//div[contains(@id,'item')]")
		public static List<WebElement> drpdwnColourFirstOption;
		
		@FindBy(xpath="//div[text()='Description']/preceding::input[1]")
		public static WebElement txtbxEditMultipleDescription;
		
		@FindBy(xpath="//label[@for='master']")
		public static WebElement chckbxAll;
		
		@FindBy(xpath="//button[text()='Delete Selected']")
		public static WebElement btnDeleteSelected;
	
		@FindBy(xpath="//button[text()='Yes, Delete']")
		public static WebElement btnYesDelete;
		
		@FindBy(xpath="//div[text()='No data available']")
		public static WebElement objNodataavailable;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='cogs']/parent::button[1]")
		public static WebElement objCogWheels;
		
		@FindBy(xpath="//a[@href='/landmarks']/descendant::button[1]")
		public static WebElement btnBacktoPOI;
		
		@FindBy(xpath="//button[normalize-space()='Delete']")
		public static WebElement btnDelete;
				
	}
	
	public static class GeofencesPage {
		
		@FindBy(xpath="//*[text()='Geofences'][contains(@class,'geofences')]")
		public static WebElement nvTabGeofences;
		
		@FindBy(xpath="//*[text()='Geofence'][contains(@class,'geofences')]")
		public static WebElement nvTabGeofence;
		
		@FindBy(xpath="//*[text()='Search']/ancestor::div[contains(@class,'SearchBar')]/input[1]")
		public static WebElement txtbxSearch;
		
		@FindBy(xpath="//*[text()='No data available']")
		public static WebElement objNoDataAvailable;
		
		@FindBy(xpath="//button[text()='Edit Geofence']")
		public static WebElement btnEditGeofences;
		
		@FindBy(xpath="//a[contains(@href,'import')]")
		public static WebElement btnImportGeofences;
		
		@FindBy(xpath="//div[@title='Total Geofences']/following::div[1]")
		public static WebElement objGeofencesTotalCount;
		
		@FindBy(xpath="//span[@class='select-wrap -pageSizeOptions']//select")
		public static WebElement objPagination;
		
		@FindBy(xpath="//label[@for='master']")
		public static WebElement chckbxAll;
		
		@FindBy(xpath="//button[text()='Delete Selected']")
		public static WebElement btnDeleteSelected;

		@FindBy(xpath="//button[text()='Yes, Delete']")
		public static WebElement btnYesDelete;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToasterMessage;
		
		@FindBy(xpath="//div[contains(@class,'formInput')]/following::input[@name='name']")
		public static WebElement txtbxGeofencesName;
		
		@FindBy(xpath="//textarea[@name='description']")
		public static WebElement txtbxDescription;
		
		@FindBy(xpath="//button[text()='Save']")
		public static WebElement btnSave;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='cogs']/parent::button[1]")
		public static WebElement objCogWheels;
		
		@FindBy(xpath="//span[text()='Add Group']/parent::button[1]")
		public static WebElement btnAddGroup;
		
		@FindBy(xpath="//div[contains(@class,'TextInput')]/following::input[@name='name']")
		public static WebElement txtbxGeofencesGroupName;
		
		@FindBy(xpath="//button[text()='Next']")
		public static WebElement btnNext;
		
		@FindBy(xpath="//button[text()='Cancel']")
		public static WebElement btnCancel;
		
		@FindBy(xpath="//label[contains(@for,'checkbox')]")
		public static WebElement chckbxFirstGeofencesOption;
		
		@FindBy(xpath="//button[text()='Edit Group']")
		public static WebElement btnEditGroup;
		
		@FindBy(xpath="//span[contains(@class,'infoContainer-name')]")
		public static WebElement objGeofencesName;
		
		@FindBy(xpath="//button[text()='Delete']")
		public static WebElement btnDelete;
		
		@FindBy(xpath="//div[text()='Total Groups']/following::div[1]")
		public static WebElement objTotalGroups;
				
		@FindBy(xpath="//button[text()='Delete Group']")
		public static WebElement btnDeleteGroup;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
		
		
	}
	
	public static class RoutesPage {
		
		@FindBy(xpath="//a[contains(@href,'/routes')]")
		public static WebElement nvTabRoutes;
		
		@FindBy(xpath="//a[text()='Add Route']")
		public static WebElement btnAddRoute;
		
		@FindBy(xpath="//input[contains(@name,'routeName')]")
		public static WebElement txtbxRouteName;
		
		@FindBy(xpath="//input[@name='routeDescription']")
		public static WebElement txtbxRouteDescription;
		
		@FindBy(xpath="//input[@name='borderWidth']")
		public static WebElement txtbxBorderWidth;
		
		@FindBy(xpath="//div[text()='Vehicles']/preceding::input[1]")
		public static WebElement drpdwnVehicles;
		
		@FindBy(xpath="//div[text()='Start Date']/preceding::input[1]")
		public static WebElement dtpckrStartDate;
		
		@FindBy(xpath="//button[contains(@class,'search')]")
		public static WebElement btnSearch;
		
		@FindBy(xpath="//div[contains(@class,'TripPanel')][@role='button']")
		public static List<WebElement> objTripPanel;
		
		@FindBy(xpath="//div[@class='TripPanel isSelected']//span[contains(text(),'0.00')]")
		public static WebElement objTripPanelZeroData;
		
		@FindBy(xpath="//div[contains(@class,'Toast--error')]")
		public static WebElement objToasterError;
		
		@FindBy(xpath="//button[text()='Save']")
		public static WebElement btnSave;
		
		@FindBy(xpath="//a[normalize-space()='Cancel']")
		public static WebElement btnCancel;
		
		@FindBy(xpath="//div[text()='Looking for trips...']")
		public static WebElement objLookingfortrips;
		
		@FindBy(xpath="//div[@class='Routes-content-count']")
		public static WebElement objRoutesCount;
	
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToasterMessage;
		
		@FindBy(xpath="//a[text()='Add Route Plan']")
		public static WebElement btnAddRoutePlan;
		
		@FindBy(xpath="//input[contains(@name,'rpName')]")
		public static WebElement txtbxRoutePlanName;
		
		@FindBy(xpath="//input[@name='rpRoute']")
		public static WebElement drpdwnRoute;
		
		@FindBy(xpath="//input[@name='rpRouteType']")
		public static WebElement drpdwnRouteType;
		
		@FindBy(xpath="//input[@name='rpVehicle']")
		public static WebElement drpdwnRoutePlanVehicle;
		
		@FindBy(xpath="//div[text()='Driver']/preceding::input[1]")
		public static WebElement drpdwnRoutePlanDriver;
		
		@FindBy(xpath="//input[@name='rpStartTime']")
		public static WebElement drpdwnRoutePlanStartTime;
		
		@FindBy(xpath="//input[@name='rpEndTime']")
		public static WebElement drpdwnRoutePlanEndTime;
		
		@FindBy(xpath="//input[@value='rss']")
		public static WebElement rdbtnRSS;
		
		@FindBy(xpath="//input[@value='email']")
		public static WebElement rdbtnEmail;
		
		@FindBy(xpath="//input[@value='sms']")
		public static WebElement rdbtnSMS;
	
		@FindBy(xpath="//input[@type='text'][@name='rpAlertMethod.value']")
		public static WebElement txtbxEmail;
		
		@FindBy(xpath="//input[@type='number'][@name='rpAlertMethod.value']")
		public static WebElement txtbxSMS;
		
		@FindBy(xpath="//div[contains(@id,'item')]")
		public static List<WebElement> objOption;
		
		@FindBy(xpath="//span[contains(@aria-label,'Previous Month')]")
		public static WebElement objPreviousMonth;
		
		@FindBy(xpath="//div[contains(@title,'Total Routes')]/preceding::input[1]")
		public static WebElement txtbxSearch;
				
		@FindBy(xpath="//*[name()='svg'][@data-icon='cogs']/parent::button[1]")
		public static WebElement btnOptions;
		
		@FindBy(xpath="//div[contains(@role,'gridcell')]//div//input[contains(@name,'name')]")
		public static WebElement txtbxEditRouteName;
		
		@FindBy(xpath="//div[contains(@role,'gridcell')]//div//input[contains(@name,'description')]")
		public static WebElement txtbxEditRouteDescription;
		
		@FindBy(xpath="//*[name()='svg'][@data-icon='check']")
		public static WebElement btnEditRouteSave;
		
		@FindBy(xpath="//span[contains(text(),'Route Plan Automation')]")
		public static WebElement objRoutePlanAutomation;
		
		@FindBy(xpath="//div[@id='next']")
		public static WebElement objNext;
		
		@FindBy(xpath="//button[normalize-space()='Check All']")
		public static WebElement btnCheckAll;
		
		@FindBy(xpath="//button[normalize-space()='Uncheck']")
		public static WebElement btnUncheck;
		
		@FindBy(xpath="//button[text()='Update']")
		public static WebElement btnUpdate;
		
		@FindBy(xpath="//div[text()='Total Routes']/following::div[1]")
		public static WebElement objTotalRoutes;
		
		@FindBy(xpath="//div[text()='No data available']")
		public static WebElement objNoDataAvailable;
		
		@FindBy(xpath="//*[local-name()='svg'][contains(@class,'trash-alt')]/parent::button[1]")
		public static WebElement btnIconTrash;
		
		@FindBy(xpath="//button[text()='Yes, Confirm']")
		public static WebElement btnYesConfirm;
		
		@FindBy(xpath="//div[@id='chat-button-fa']/ancestor::div[contains(@class,'sc-')]/div[contains(@class,'sc-')]")
		public static WebElement objFleetChatbot;
	}
	
	public static class TrailersPage {
		
		@FindBy(xpath="//a[normalize-space()='Trailers']")
		public static WebElement nvTabTrailers;
		
		@FindBy(xpath="//a[normalize-space()='Add Trailer']")
		public static WebElement btnAddTrailer;
		
		@FindBy(xpath="//*[name()='svg'][@data-icon='cogs']/parent::button[1]")
		public static WebElement btnOptions;
		
		@FindBy(xpath="//input[@name='registration']")
		public static WebElement txtbxRegistration;
		
		@FindBy(xpath="//input[@name='description']")
		public static WebElement txtbxDescription;
		
		@FindBy(xpath="//button[normalize-space()='Save']")
		public static WebElement btnSave;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
		
		@FindBy(xpath="//*[text()='Search']/preceding::input[1]")
		public static WebElement txtbxSearch;
		
		@FindBy(xpath="//*[text()='No data available']")
		public static WebElement objNoDataAvailable;
		
		@FindBy(xpath="//span[@class='select-wrap -pageSizeOptions']//select")
		public static WebElement objPageSize;
		
		@FindBy(xpath="//div[@class='rt-tr-group']")
		public static List<WebElement> objTrailerList;
		
		@FindBy(xpath="//div[@class='rt-tr-group']")
		public static WebElement objTrailer;
		
		@FindBy(xpath="//button[normalize-space()='Delete Trailer']")
		public static WebElement btnDeleteTrailer;
		
		@FindBy(xpath="//button[normalize-space()='Yes']")
		public static WebElement btnYes;
		
	}

}
