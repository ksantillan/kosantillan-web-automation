package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {

		@FindBy(xpath="//div[contains(@class,'ProfileDropdownButton-username')]")
		public static WebElement drpdwnbtnProfile;
		
		@FindBy(xpath="//div[@id='settings']//*")
		public static WebElement drpdwnslctSettings;
		
		@FindBy(xpath="//div[@id='logout']//*")
		public static WebElement drpdwnslctLogout;
		
	public static class ProfileSettingsTab {
		
		@FindBy(xpath="//button[text()='Edit User']")
		public static WebElement btnEditUser;
		
		@FindBy(xpath="//li[@data-target='Profile']")
		public static WebElement tbProfile;
		
		@FindBy(xpath="//div[text()='Company']")
		public static WebElement tbCompany;
		
		@FindBy(xpath="//input[contains(@name,'profile.companyName')]")
		public static WebElement txtbxCompanyName;
		
		@FindBy(xpath="//*[text()='email']/ancestor::div[contains(@class,'TextInput')]/input[contains(@class,'input')]")
		public static WebElement txtbxEmail;
		
		@FindBy(xpath="//*[text()='username']/ancestor::div[contains(@class,'TextInput')]/input[contains(@class,'input')]")
		public static WebElement txtbxUsername;
		
		@FindBy(xpath="//input[contains(@name,'profile.name')]")
		public static WebElement txtbxName;
		
		@FindBy(xpath="//*[text()='Language']/ancestor::div[contains(@class,'TextInput')]/input[contains(@class,'input')]")
		public static WebElement drpdwnLanguage;
		
		@FindBy(xpath="//button[contains(@type,'submit')]")
		public static WebElement btnSave;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
	
		@FindBy(xpath="//li[@id='settings-advanced-tab']")
		public static WebElement btnAdvancedSettings;
		
		@FindBy(xpath="//label[@id='D']//span")
		public static WebElement rdnbtnDecimalDegrees;
		
		@FindBy(xpath="//label[@id='DMS']//span")
		public static WebElement rdnbtnDecimalMinutesSeconds;
		
		@FindBy(xpath="//button[text()='Disable Token']")
		public static WebElement btnDisableToken;
		
		@FindBy(xpath="//button[normalize-space()='Desativar Token']")
		public static WebElement btnDesativarToken;
		
		@FindBy(xpath="//button[text()='Enable Token']")
		public static WebElement btnEnableToken;
		
		@FindBy(xpath="//button[normalize-space()='Ativar Token']")
		public static WebElement btnAtivarToken;
		
		@FindBy(xpath="//button[normalize-space()='Dezaktywuj Token']")
		public static WebElement btnDezaktywujToken;
		
		@FindBy(xpath="//button[contains(normalize-space(),'cz token')]")
		public static WebElement btnwcztoken;
		
		@FindBy(xpath="//button[contains(@class,'advanced-token-copybtn-link')]")
		public static WebElement btnCopyTokenLinkToClipboard;
		
		@FindBy(xpath="//*[text()='TOKEN']/ancestor::div[contains(@class,'TextInput')]/input[contains(@class,'TextInput')]")
		public static WebElement txtbxToken;
		
		@FindBy(xpath="//input[@id='Update Image']")
		public static WebElement txtbxUpdateImage;
		
		@FindBy(xpath="//button[text()='Change Password']")
		public static WebElement btnChangePassword;
		
		@FindBy(xpath="//input[contains(@name,'profile.currentPassword')]")
		public static WebElement txtbxCurrentPassword;
		
		@FindBy(xpath="//input[contains(@name,'profile.newPassword')]")
		public static WebElement txtbxNewPassword;
		
		@FindBy(xpath="//input[contains(@name,'profile.confirmPassword')]")
		public static WebElement txtbxConfirmPassword;
		
		@FindBy(xpath="//button[text()='Reset Password']")
		public static WebElement btnResetPassword;
		
		@FindBy(xpath="//input[contains(@id,'Image')]")
		public static WebElement txtbxUploadImage;
		
		@FindBy(xpath="//div[@id='chat-button-fa']/ancestor::div[contains(@class,'sc-')]/div[contains(@class,'sc-')]")
		public static WebElement objFleetChatbot;
	
	}
	
	public static class ManageUsersTab {
		
		@FindBy(xpath="//*[contains(@class,'manage-users')]")
		public static WebElement nvBarManageUsers;
		
		@FindBy(xpath="//div[text()='Status']/parent::div[contains(@class,'Dropdown')]")
		public static WebElement drpdwnStatus;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='All Users']")
		public static WebElement drpdwnStatusOptionAllUsers;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Active Users']")
		public static WebElement drpdwnStatusOptionActiveUsers;
		
		@FindBy(xpath="//div[contains(@class,'option')][text()='Deactivated Users']")
		public static WebElement drpdwnStatusOptionDeactivatedUsers;
		
		@FindBy(xpath="//*[text()='Search']/ancestor::div[contains(@class,'SearchBar')]/input[1]")
		public static WebElement txtbxSearch;
		
		@FindBy(xpath="//div[contains(@class,'rt-tr -odd')]/descendant::button[@type='button']")
		public static List<WebElement> lstUsersEditbutton;
		
		@FindBy(xpath="//li[contains(@data-target,'Vehicles')]")
		public static WebElement SdPanelVehicles;
		
		@FindBy(xpath="//*[text()='Status Filter']/following::span[contains(@class,'Dropdown-activeOption')]")
		public static WebElement drpdwnslctStatusFilter;
		
		@FindBy(xpath="//div[@id='VEHICLE']")
		public static WebElement drpdwnslctStatusFilterVehiclesOption;
		
		@FindBy(xpath="//*[text()='Selected Vehicles']/following-sibling::div[contains(@class,'Stats-value')]")
		public static WebElement objSelectedVehiclesCount;

		@FindBy(xpath="//*[text()='Total Vehicles']/following-sibling::div[contains(@class,'Stats-value')]")
		public static WebElement objTotalVehiclesCount;	
		
		@FindBy(xpath="//label[contains(@for,'master')]")
		public static WebElement chckbxAllVehicles;
		
		@FindBy(xpath="//label[contains(@for,'master')]")
		public static WebElement chckbxAllGroups;
		
		@FindBy(xpath="//p[text()='In this table you will give the sub-user the ability to see vehicles. You can select one by one or all that are included in a group. When the group is updated, so will be the sub-user permissions.']/ancestor::div[@class='EditUserVehicleTable']/descendant::label[contains(@for,'checkbox')]")
		public static List<WebElement> chckbxEachVehicles;
		
		@FindBy(xpath="//p[text()='In this table you will give the sub-user the ability to see vehicles. You can select one by one or all that are included in a group. When the group is updated, so will be the sub-user permissions.']/ancestor::div[@class='EditUserVehicleTable']/descendant::label[contains(@for,'checkbox')]")
		public static List<WebElement> chckbxEachGroups;
		
		@FindBy(xpath="//p[text()='In this table you will give the sub-user the ability to see vehicles. You can select one by one or all that are included in a group. When the group is updated, so will be the sub-user permissions.']/ancestor::div[@class='EditUserVehicleTable']/descendant::label[contains(@for,'checkbox')]/parent::div[1]/input[1][@value='true']")
		public static List<WebElement> chckbxSelectVehicles;
		
		@FindBy(xpath="//p[text()='In this table you will give the sub-user the ability to see vehicles. You can select one by one or all that are included in a group. When the group is updated, so will be the sub-user permissions.']/ancestor::div[@class='EditUserVehicleTable']/descendant::label[contains(@for,'checkbox')]/parent::div[1]/input[1][@value='true']")
		public static WebElement chckbxSelectVehicle;
		
		@FindBy(xpath="//p[text()='In this table you will give the sub-user the ability to see vehicles. You can select one by one or all that are included in a group. When the group is updated, so will be the sub-user permissions.']/ancestor::div[@class='EditUserVehicleTable']/descendant::label[contains(@for,'checkbox')]/parent::div[1]/input[1][@value='true']")
		public static List<WebElement> chckbxSelectGroups;
		
		@FindBy(xpath="//label[contains(@for,'checkbox')]/ancestor::div[contains(@class,'table-select')]/following::div[1]")
		public static List<WebElement> lstVehiclesNames;
		
		@FindBy(xpath="//p[text()='In this table you will give the sub-user the ability to see vehicles. You can select one by one or all that are included in a group. When the group is updated, so will be the sub-user permissions.']/ancestor::div[@class='EditUserVehicleTable']/descendant::label[contains(@for,'checkbox')]/parent::div[1]/input[1][@value='true']/ancestor::div[contains(@class,'table-select')]/following::div[1]")
		public static List<WebElement> lstAssignedVehiclesNames;
		
		@FindBy(xpath="//span[text()='Vehicles']/parent::div[contains(@class,'SectionHeader')]/following-sibling::div[1]/descendant::*[text()='Name']/ancestor::*[contains(@class,'sort-desc')]")
		public static WebElement objNamecolumnheadersorteddesc;
		
		@FindBy(xpath="//span[text()='Vehicles']/parent::div[contains(@class,'SectionHeader')]/following-sibling::div[1]/descendant::*[text()='Name']/ancestor::*[contains(@class,'sort-asc')]")
		public static WebElement objNamecolumnheadersortedasc;
		
		@FindBy(xpath="//span[text()='Vehicles']/parent::div[contains(@class,'SectionHeader')]/following-sibling::div[1]/descendant::*[text()='Name']/ancestor::*[contains(@role,'columnheader')]")
		public static WebElement objNamecolumnheader;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToaster;
		
		@FindBy(xpath="//*[contains(@class,'SectionHeader')]/following-sibling::div[1]/descendant::*[contains(@class,'select-wrap -pageSizeOptions')]/select[1]")
		public static WebElement objPageSize;
		
		@FindBy(xpath="//a[text()='Add User']")
		public static WebElement btnAddUser;
		
		@FindBy(xpath="//div[@class='PersonInfo-name'][text()='New User']")
		public static WebElement objNewUser;
		
		@FindBy(xpath="//button[text()='Deactivate User']")
		public static WebElement btnDeactivateUser;
		
		@FindBy(xpath="//button[text()='Yes, Deactivate']")
		public static WebElement btnYesDeactivate;
		
		@FindBy(xpath="//div[text()='Please click the button if you wish to lock the user']/parent::div[contains(@class,'sc')]/descendant::div[@label='[object Object]']")
		public static WebElement tgglbtnLock;
		
		@FindBy(xpath="//div[text()='Please click the button if you wish to lock the user']/parent::div[contains(@class,'sc')]/descendant::div[@label='[object Object]'][@value='false']")
		public static WebElement tgglbtnLockUser;
		
		@FindBy(xpath="//div[text()='Please click the button if you wish to lock the user']/parent::div[contains(@class,'sc')]/descendant::div[@label='[object Object]'][@value='false']")
		public static WebElement tgglbtnUnLockUser;
		
		@FindBy(xpath="//div[@label='[object Object]'][@value='true']")
		public static WebElement tgglbtnLockStatusON;
		
		@FindBy(xpath="//div[contains(@class,'ModalAnimated-body')]/descendant::span[2]")
		public static WebElement objModalDecisionConfirmationDescription;
		
		@FindBy(xpath="//button[text()='Confirm']")
		public static WebElement btnConfirm;
		
		@FindBy(xpath="//button[text()='Activate User']")
		public static WebElement btnActivateUser;
		
		@FindBy(xpath="//button[text()='Yes, Activate']")
		public static WebElement btnYesActivate;
		
		@FindBy(xpath="//div[contains(@class,'Stats-value')]")
		public static WebElement objTotalUsers;
		
		@FindBy(xpath="//div[text()='Groups'][contains(@class,'sc')]")
		public static WebElement objTabGroups;
	
		@FindBy(xpath="//div[text()='Groups'][contains(@class,'sc')]/preceding::div[1]")
		public static WebElement objTabVehicles;
		
		//<--- Permission List
		
		@FindBy(xpath="//li[contains(@data-target,'Permissions')]")
		public static WebElement sdPanelPermission;
		
		@FindBy(xpath="//li[@id='features-tab']//*[name()='svg'][@data-icon='angle-right']")
		public static WebElement sdCollapsedPanelPermission;
		
		@FindBy(xpath="//li[contains(@data-target,'Data Access')]")
		public static WebElement sdPanelDataAccess;
		
		@FindBy(xpath="//li[@id='data-access-tab']//*[name()='svg'][@data-icon='angle-right']")
		public static WebElement sdCollapsedPanelDataAccess;
		
		@FindBy(xpath="//li[@data-target='Points of Interest']")
		public static WebElement sdPanelPointsofInterest;
		
		@FindBy(xpath="//li[@data-target='Landmarks']")
		public static WebElement sdPanelLandmarks;
		
		@FindBy(xpath="//li[contains(@data-target,'Geofence')]")
		public static WebElement sdPanelGeofences;
		
		@FindBy(xpath="//li[@data-target='List']")
		public static WebElement sdPanelList;
		
		@FindBy(xpath="//*[text()='Drivers']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]")
		public static WebElement tglbtnDrivers;
		
		@FindBy(xpath="//*[text()='Drivers']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-down']")
		public static WebElement objchevrondownDrivers;
		
		@FindBy(xpath="//*[text()='Drivers']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-up']")
		public static WebElement objchevronupDrivers;
		
		@FindBy(xpath="//*[text()='Drivers']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]")
		public static WebElement objchevronDrivers;
		
		@FindBy(xpath="//*[text()='Add driver']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]")
		public static WebElement tglbtnDriversAdddriver;

		@FindBy(xpath="//span[text()='Drivers']/parent::div[1]/following::div[1]/descendant::span[text()='Add group']/following::div[1]")
		public static WebElement tglbtnDriversAddgroup;
		
		@FindBy(xpath="//*[text()='Edit driver']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]")
		public static WebElement tglbtnDriversEditdriver;
		
		@FindBy(xpath="//*[text()='Vehicles']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]")
		public static WebElement tglbtnVehicles;
		
		@FindBy(xpath="//*[text()='Vehicles']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-down']")
		public static WebElement objchevrondownVehicles;
		
		@FindBy(xpath="//*[text()='Vehicles']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-up']")
		public static WebElement objchevronupVehicles;
		
		@FindBy(xpath="//*[text()='Vehicles']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]")
		public static WebElement objchevronVehicles;
		
		@FindBy(xpath="//span[text()='Vehicles']/parent::div[1]/following::div[1]/descendant::span[text()='Add group']/following::div[1]")
		public static WebElement tglbtnVehiclesAddgroup;
		
		@FindBy(xpath="//*[text()='POI']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]")
		public static WebElement tglbtnPOI;
		
		@FindBy(xpath="//*[text()='Landmark']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]")
		public static WebElement tglbtnLandmark;
		
		@FindBy(xpath="//*[text()='POI']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-down']")
		public static WebElement objchevrondownPOI;
		
		@FindBy(xpath="//*[text()='Landmark']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-down']")
		public static WebElement objchevrondownLandmark;
		
		@FindBy(xpath="//*[text()='POI']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-up']")
		public static WebElement objchevronupPOI;
		
		@FindBy(xpath="//*[text()='Landmark']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-up']")
		public static WebElement objchevronupLandmark;
		
		@FindBy(xpath="//*[text()='POI']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]")
		public static WebElement objchevronPOI;
		
		@FindBy(xpath="//*[text()='Landmark']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]")
		public static WebElement objchevronLandmark;
		
		@FindBy(xpath="//div[@id='dataAccess-poi']/following::div[1]/descendant::button[1]")
		public static WebElement drpdwnPOIUserPermission;
		
		@FindBy(xpath="//div[@id='dataAccess-poi']/following::div[1]/descendant::button[2]")
		public static WebElement drpdwnPOIAdminPermission;
		
		@FindBy(xpath="//div[@id='dataAccess-poi']/following::div[1]/descendant::button[1]")
		public static WebElement drpdwnLandmarksUserPermission;
		
		@FindBy(xpath="//div[@id='dataAccess-poi']/following::div[1]/descendant::button[2]")
		public static WebElement drpdwnLandmarksAdminPermission;
		
		@FindBy(xpath="//*[text()='Landmark']/ancestor::div[contains(@class,'list__ListContainer')]/descendant::*[text()='User']/ancestor::button[contains(@class,'withValue')]")
		public static WebElement drpdwnLandmarkUserPermission;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Can View/Edit']")
		public static WebElement drpdwnPOIUserPermissionCanViewEdit;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Can View']")
		public static WebElement drpdwnPOIUserPermissionCanView;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Cannot View']")
		public static WebElement drpdwnPOIUserPermissionCannotView;
		
		@FindBy(xpath="//*[text()='List']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]")
		public static WebElement tglbtnList;
		
		@FindBy(xpath="//*[text()='Geofences']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]")
		public static WebElement tglbtnGeofences;
		
		@FindBy(xpath="//*[text()='Geofence']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]")
		public static WebElement tglbtnGeofence;
		
		@FindBy(xpath="//*[text()='Geofences']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-down']")
		public static WebElement objchevrondownGeofences;
		
		@FindBy(xpath="//*[text()='Geofence']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-down']")
		public static WebElement objchevrondownGeofence;
		
		@FindBy(xpath="//*[text()='Geofences']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]//*[local-name()='svg'][@data-icon='chevron-up']")
		public static WebElement objchevronupGeofences;
		
		@FindBy(xpath="//*[text()='Geofences']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]")
		public static WebElement objchevronGeofences;
		
		@FindBy(xpath="//*[text()='Geofence']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]/following-sibling::div[contains(@class,'IconButton')]")
		public static WebElement objchevronGeofence;
		
		@FindBy(xpath="//div[@id='dataAccess-geofences']/following::div[1]/descendant::button[1]")
		public static WebElement drpdwnGeofencesUserPermission;
		
		@FindBy(xpath="//div[@id='dataAccess-geofences']/following::div[1]/descendant::button[2]")
		public static WebElement drpdwnGeofencesAdminPermission;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Can View/Edit']")
		public static WebElement drpdwnGeofencesUserPermissionCanViewEdit;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Can View']")
		public static WebElement drpdwnGeofencesUserPermissionCanView;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Cannot View']")
		public static WebElement drpdwnGeofencesUserPermissionCannotView;
		
		@FindBy(xpath="//button/*[local-name()='svg'][@data-icon='cogs']/parent::button[@type='button']")
		public static WebElement btnCogWheels;
		
		@FindBy(xpath="//div[contains(@title,'Total Groups')]/preceding::input[1]")
		public static WebElement txtbxGroupsSearch;
		
		@FindBy(xpath="//div[contains(@title,'Total Vehicles')]/preceding::input[1]")
		public static WebElement txtbxVehiclesSearch;
		
		@FindBy(xpath="//div[contains(@title,'Total Vehicle Groups')]/preceding::input[1]")
		public static WebElement txtbxVehicleGroupsSearch;
		
		@FindBy(xpath="//div[text()='Vehicles']")
		public static WebElement tbVehicles;
		
		@FindBy(xpath="//div[text()='Groups']")
		public static WebElement tbGroups;
		
		@FindBy(xpath="//div[contains(@class,'EditUserVehicleTable')]/descendant::div[text()='No data available']")
		public static WebElement objVehicleTableNodataavailable;
		
		@FindBy(xpath="//*[text()='Total Groups']/following-sibling::div[contains(@class,'Stats-value')]")
		public static WebElement objTotalGroupsCount;	
		
		@FindBy(xpath="//*[text()='All Available Permissions']/parent::*[contains(@class,'sc')]/descendant::*[contains(@label,'[object Object]')]")
		public static WebElement tglbtnAllAvailablePermission;
		
		@FindBy(xpath="//div[contains(@class,'Stats-value')]")
		public static WebElement objTotalUsersValue;
		
		@FindBy(xpath="//div[text()='No data available']")
		public static WebElement objNoDataAvailable;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='pencil-alt']/parent::button[1]")
		public static WebElement icnPencilIcon;
		
		@FindBy(xpath="//li[@data-target='Vehicle Groups']")
		public static WebElement sdPanelVehicleGroups;
		
		@FindBy(xpath="//li[@data-target='Drivers']")
		public static WebElement sdPanelDrivers;
		
		@FindBy(xpath="//div[contains(@title,'Total Drivers')]/preceding::input[1]")
		public static WebElement txtbxDriversSearch;
		
		@FindBy(xpath="//li[@data-target='Reports']")
		public static WebElement sdPanelReports;
		
		@FindBy(xpath="//div[contains(@title,'Reports')]/preceding::input[1]")
		public static WebElement txtbxReportsSearch;
		
		@FindBy(xpath="//div[@id='dataAccess-reports']/following::div[1]/descendant::label[@for='master']/preceding::input[1][@value='true']")
		public static WebElement objReportAllSelected;
		
		@FindBy(xpath="//div[@id='dataAccess-reports']/following::div[1]/descendant::label[@for='master']")
		public static WebElement btnSelectAllReport;
		
		//Permission List --->
		
		
		//<--- Profile
		
		@FindBy(xpath="//button[contains(.,'Edit')]")
		public static WebElement btnEdit;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='pencil-alt']/parent::button[1]")
		public static List<WebElement> btnEditList;
		
		@FindBy(xpath="//div[contains(@class,' sc')]/input[@name='name']")
		public static WebElement txtbxName;
		
		@FindBy(xpath="//input[contains(@name,'username')]")
		public static WebElement txtbxUserName;
		
		@FindBy(xpath="//*[text()='Hierarchy User']/ancestor::div[contains(@class,'TextInput')]/input[contains(@class,'TextInput')]")
		public static WebElement drpdwnHierarchyUser;
		
		@FindBy(xpath="//input[@name='cellPhone']")
		public static WebElement txtbxCellPhone;
		
		@FindBy(xpath="//div[contains(@class,'sc')]//input[contains(@name,'email')]")
		public static WebElement txtbxEmail;
		
		@FindBy(xpath="//*[text()='Language']/ancestor::div[contains(@class,'TextInput')]/input[contains(@class,'TextInput')]")
		public static WebElement drpdwnLanguage;
		
		@FindBy(xpath="//button[text()='Save']")
		public static WebElement btnSave;
		
		@FindBy(xpath="//div[contains(@id,'item-1')]")
		public static WebElement drpdwnHierarchyUserFirstOption;
		
		@FindBy(xpath="//div[contains(@id,'item-1')]")
		public static WebElement drpdwnLanguageFirstOption;
		
		@FindBy(xpath="//a[contains(@href,'/manage-users')]//button[contains(@type,'button')]")
		public static WebElement btnBacktoUsers;
		
		@FindBy(xpath="//div[text()='MiFleet User Role']/parent::div[1]")
		public static WebElement drpdwnMiFleetUserRole;
		
		@FindBy(xpath="//div[contains(@id,'select')][text()='Administrators']")
		public static WebElement drpdwnMiFleetUserRoleOptionAdministrators;
		
		@FindBy(xpath="//div[contains(@id,'select')][text()='Administradores']")
		public static WebElement drpdwnMiFleetUserRoleOptionAdministradores;
		
		@FindBy(xpath="//div[contains(@id,'select')][contains(@id,'option-0')]")
		public static WebElement drpdwnMiFleetUserRoleFirstOption;
		
		@FindBy(xpath="//div[contains(@id,'select')][text()='Readers']")
		public static WebElement drpdwnMiFleetUserRoleOptionReaders;
		
		//---> Profile
		
		//<--- Impersonate Sub User
		
		@FindBy(xpath="//li[@data-target='Impersonate Sub User']")
		public static WebElement sdPanelImpersonateSubUser;
		
		@FindBy(xpath="//button[text()='Impersonate Sub User']")
		public static WebElement btnImpersonateSubUser;
		
		@FindBy(xpath="//div[@class='ProfileDropdownButton-username']")
		public static WebElement objProfileDropdown;
		
		@FindBy(xpath="//div[contains(@class,'Modal-body expanded-body')]/descendant::p[2]")
		public static WebElement objModalSubTitle;
		
		@FindBy(xpath="//button[text()='Try Again']")
		public static WebElement btnTryAgain;
		
		@FindBy(xpath="//div[@id='chat-button-fa']/ancestor::div[contains(@class,'sc-')]/div[contains(@class,'sc-')]")
		public static WebElement objFleetChatbot;
		
		
		//Impersonate Sub User --->			
		
	}
	public static class ImportsDataTab {
		
		@FindBy(xpath="//a[@class='Navbar-innerNav-tab Wt-import']")
		public static WebElement nvBarImportData;
		
		@FindBy(xpath="//div[text()='Category']/parent::button[1]")
		public static WebElement drpdwnCategory;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Actions/Merge']")
		public static WebElement drpdwnCategoryOptionActionsMerge;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Importers']")
		public static WebElement drpdwnCategoryOptionImporters;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='MiFleet']")
		public static WebElement drpdwnCategoryOptionMiFleet;
		
		@FindBy(xpath="//div[text()='Import Type']/parent::button[1]")
		public static WebElement drpdwnImportType;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Import Driver']")
		public static WebElement drpdwnImportTypeOptionImportDriver;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Import Geofences']")
		public static WebElement drpdwnImportTypeOptionImportGeofences;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Import Geofences (With Group)']")
		public static WebElement drpdwnImportTypeOptionImportGeofencesWithGroup;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Import Geofences Polygon']")
		public static WebElement drpdwnImportTypeOptionImportGeofencesPolygon;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Import POI']")
		public static WebElement drpdwnImportTypeOptionImportPOI;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Import Landmark']")
		public static WebElement drpdwnImportTypeOptionImportLandmark;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Import Vehicles to Groups']")
		public static WebElement drpdwnImportTypeOptionImportVehiclestoGroups;
		
		@FindBy(xpath="//input[@id='Upload File']")
		public static WebElement btnUploadFile;
		
		@FindBy(xpath="//a[text()='Download Template']")
		public static WebElement btnDownloadTemplate;
		
		@FindBy(xpath="//button[text()='Next']")
		public static WebElement btnNext;
		
		@FindBy(xpath="//div[@class='rt-tbody']/descendant::div[contains(@class,'sc')]")
		public static List<WebElement> objResultView;
		
		@FindBy(xpath="//*[local-name()='svg'][@data-icon='cogs']/parent::button[1]")
		public static WebElement btnCogs;
		
		
		
		
	}
	
	
}
