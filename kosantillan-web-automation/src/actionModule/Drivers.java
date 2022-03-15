package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.ListPage;
import pageObject.SettingsPage;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

public class Drivers{	
	
	public static void AddDriver(String browser, @SuppressWarnings("rawtypes") Dictionary DriverDetails, String activesite) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		//Click Add Driver
		DoThis.WaitForElementToLoad(ListPage.DriversPage.btnAddDriver);
		DoThis.click(ListPage.DriversPage.btnAddDriver, "Y");
		
		//Set First Name
		DoThis.clear(browser, ListPage.DriversPage.txtbxFirstName, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxFirstName, DriverDetails.get("driver_first_name").toString(), "Y");
		
		//Set Last Name
		DoThis.clear(browser, ListPage.DriversPage.txtbxLastName, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxLastName, DriverDetails.get("driver_last_name").toString(), "Y");
		
		//Set Email Address
		DoThis.clear(browser, ListPage.DriversPage.txtbxEmail, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxEmail, DriverDetails.get("driver_email_address").toString(), "Y");
		
		//ID or Passport
		DoThis.clear(browser, ListPage.DriversPage.txtbxIDPassport, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxIDPassport, DriverDetails.get("driver_id_passport").toString(), "Y");
		
		//Select Gender
		switch(DriverDetails.get("driver_gender").toString()) {
		
		case "Male":
			DoThis.click(ListPage.DriversPage.rdnbtnGenderMale, "Y");
		break;
		
		case "Female":
			DoThis.click(ListPage.DriversPage.rdnbtnGenderFemale, "Y");
		break;
		
		}
		
		//License Number
		DoThis.clear(browser, ListPage.DriversPage.txtbxLicenseNumber, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxLicenseNumber, DriverDetails.get("driver_license_no").toString(), "Y");
		
		//Add mobile if US is country
		switch (activesite) {
		case "US":
			ConfigReader config = new ConfigReader();
			
			//Cell Number
			String cellnumber = config.getUSSMS();
			DoThis.clear(browser, ListPage.DriversPage.txtbxCellNUmber, "N");
			DoThis.sendkeys(ListPage.DriversPage.txtbxCellNUmber, cellnumber.substring(0, cellnumber.length() - 4)+DoThis.Random4Digit(), "Y");
			
			//State, Select first Option
			DoThis.click(ListPage.DriversPage.drpdwnState, "N");
			DoThis.click(ListPage.DriversPage.drpdwnStateFirstOption, "Y");
		break;
		default:
		break;
		}
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		//Wait for toaster message to load
		DoThis.WaitForToasterMessageToLoad(ListPage.DriversPage.objToaster);
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage("Driver created successfully. toaster is displayed");
		}
		
			
	}
	public static void SearchDrivers(String browser, String DriverName) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		DoThis.WaitForElementToLoad(ListPage.DriversPage.txtbxSearch);
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriverName, "Y");
		
		
		
	}
	public static void AddDriverGroups(String browser, @SuppressWarnings("rawtypes") Dictionary DriverGroupsDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		//Click Add Group
		DoThis.click(ListPage.DriversPage.btnAddGroup, "Y");
		
		//Set Vehicles Group Name
		DoThis.clear(browser, ListPage.DriversPage.txtbxGroupName, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxGroupName, DriverGroupsDetails.get("drivers_group_name").toString(), "Y");
		
		
		//Click Next button
		DoThis.click(ListPage.DriversPage.btnNext, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(DriverGroupsDetails.get("drivers_group_name").toString()+" was successfully created toaster is displayed");
		}
		
		//Click Save button
		DoThis.WaitForElementToLoad(ListPage.DriversPage.btnSave);
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(DriverGroupsDetails.get("drivers_group_name").toString()+" was successfully updated toaster is displayed");
		}
				
	}
	public static void SearchDriversGroup(String browser, String DriverGroupName) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriverGroupName, "Y");
		
		
		
	}
	
	public static void DeleteDriversGroupsCreatedByAutomation(String browser, @SuppressWarnings("rawtypes") Dictionary DriversGroupDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriversGroupDetails.get("drivers_group_name").toString(), "Y");
		
		//Check the Numbers of Total Groups based on entered Drivers Group Name
		String TotalGroupName = DoThis.getText(ListPage.Driverstab.TotalDriverGroupNumber);
		int intTotalGroupName = Integer.parseInt(TotalGroupName);  

		if(intTotalGroupName == 0) {
			Reporter.ReportEventNoImage("No Drivers Groups created by Automation is found");
			
		}else {
			for(int i=0; i<intTotalGroupName; i++ ) {
				DoThis.click(ListPage.nvTabList, "Y");
				DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
				
				DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
				DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriversGroupDetails.get("drivers_group_name").toString(), "Y");
				
				WebElement GroupNameLocator = Constant.driver.findElement(By.xpath("//*[contains(text(),'"+DriversGroupDetails.get("drivers_group_name").toString()+"')]"));
				DoThis.click(GroupNameLocator, "Y");
				
				//Click Edit Group button
				DoThis.click(ListPage.DriversPage.btnEditGroup, "Y");
				
				//Click Delete Group button
				DoThis.click(ListPage.DriversPage.btnDeleteGroup, "Y");
				
				//Click Yes, Delete button
				DoThis.click(ListPage.DriversPage.btnYesDelete, "Y");
				
				//Wait for toaster message to load
				DoThis.WaitForToasterMessageToLoad(ListPage.VehiclesPage.objToaster);
				
				if(DoThis.isObjectAvailable(ListPage.VehiclesPage.objToaster, "Toaster message", "N")) {
					Reporter.ReportEventNoImage("Automation Group was successfully deleted");
				}

			}
		}
	
	}
	
	public static void AddDriversImage(String browser, String DriverName,@SuppressWarnings("rawtypes") Dictionary DriversDetails) throws InterruptedException {
		
		Drivers.SearchDrivers(browser, DriverName);
		
		//Select Driver Name
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");
		
		//Click Edit button
		DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
		
		//Upload Image
		DoThis.uploadFile(browser, ListPage.DriversPage.btnUploadImage, DriversDetails.get("file_path").toString(), "Y");
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Driver updated successfully toaster is displayed");
			}	
	}
	
	public static void UpdateDriversImage(String browser, String DriverName,@SuppressWarnings("rawtypes") Dictionary DriversDetails) throws InterruptedException {
		
		Drivers.SearchDrivers(browser, DriverName);
		
		//Select Driver Name
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");
		
		//Click Edit button
		DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
		
		//Click Clear image button
		if(DoThis.isObjectAvailable(ListPage.DriversPage.btnClearImage, "Clear Image button", "N")) {
			DoThis.click(ListPage.DriversPage.btnClearImage, "Y");
		}
	
		//Update Image
		DoThis.uploadFile(browser, ListPage.DriversPage.btnUploadImage, DriversDetails.get("file_path").toString(), "Y");
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Driver updated successfully. toaster message is displayed");
			}	
	}
	
	public static void UpdateDriversGeneralInformationDetails(String browser, String DriverName,@SuppressWarnings("rawtypes") Dictionary DriversDetails) throws InterruptedException {
		
		Drivers.SearchDrivers(browser, DriverName);
		
		//Select Driver Name
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");
		
		//Click Edit button
		DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
		
		//Wait for Element to load
		DoThis.WaitForElementToLoad(ListPage.DriversPage.txtbxFirstName);
		
		//Set First Name
		DoThis.clear(browser, ListPage.DriversPage.txtbxFirstName, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxFirstName, DriversDetails.get("updated_driver_first_name").toString(), "Y");
		
		//Set Last Name
		DoThis.clear(browser, ListPage.DriversPage.txtbxLastName, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxLastName, DriversDetails.get("updated_driver_last_name").toString(), "Y");
		
		//Set Email Address
		DoThis.clear(browser, ListPage.DriversPage.txtbxEmail, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxEmail, DriversDetails.get("updated_driver_email_address").toString(), "Y");
		
		//ID or Passport
		DoThis.clear(browser, ListPage.DriversPage.txtbxIDPassport, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxIDPassport, DriversDetails.get("updated_driver_id_passport").toString(), "Y");
		
		//Select Gender
		switch(DriversDetails.get("updated_driver_gender").toString()) {
		
		case "Male":
			DoThis.click(ListPage.DriversPage.rdnbtnGenderMale, "Y");
		break;
		
		case "Female":
			DoThis.click(ListPage.DriversPage.rdnbtnGenderFemale, "Y");
		break;
		
		}
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Driver updated successfully. toaster message is displayed");
			}	
	}
	
	public static void UpdateDriversLicenseDetails(String browser, String DriverName,@SuppressWarnings("rawtypes") Dictionary DriversDetails) throws InterruptedException {
		
		Drivers.SearchDrivers(browser, DriverName);
		
		//Select Driver Name
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");
		
		//Click Edit button
		DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
		
		//Check if the Chat bot is displayed
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objFleetChatbot, "Fleet Chat Bot", "N")) {
			DoThis.click(ListPage.DriversPage.objFleetChatbot, "Y");
		}

		//License Number
		DoThis.clear(browser, ListPage.DriversPage.txtbxLicenseNumber, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxLicenseNumber, DriversDetails.get("updated_driver_license_no").toString(), "Y");
		
		//Issued Country Code
		DoThis.clear(browser, ListPage.DriversPage.txtbxLicenseIssuedCountry, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxLicenseIssuedCountry, DriversDetails.get("updated_driver_license_issued_country").toString(), "Y");
		
		//Current Points
		DoThis.clear(browser, ListPage.DriversPage.txtbxLicensePoints, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxLicensePoints, DriversDetails.get("updated_driver_license_points").toString(), "Y");

		//Driver Restriction
		DoThis.clear(browser, ListPage.DriversPage.txtbxLicenseDriverRestrictions, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxLicenseDriverRestrictions, DriversDetails.get("updated_driver_license_restrictions").toString(), "Y");

		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Driver updated successfully. toaster message is displayed");
		}	
	}
	
	public static void AddDriverGroupsAndAllDrivers(String browser, @SuppressWarnings("rawtypes") Dictionary DriverGroupsDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		//Click Add Group
		DoThis.click(ListPage.DriversPage.btnAddGroup, "Y");
		
		//Set Vehicles Group Name
		DoThis.clear(browser, ListPage.DriversPage.txtbxGroupName, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxGroupName, DriverGroupsDetails.get("drivers_group_name").toString(), "Y");
		
		
		//Click Next button
		DoThis.click(ListPage.DriversPage.btnNext, "Y");
		
		//Wait for toaster message to displayed
		DoThis.WaitForToasterMessageToLoad(ListPage.DriversPage.objToaster);
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster Message", "N")) {
			Reporter.ReportEventNoImage(DriverGroupsDetails.get("drivers_group_name").toString()+" was successfully created toaster is displayed");
		}
		
		
		//Ticked Select All Drivers
		//Wait for Select All Drivers checkbox to displayed
		DoThis.WaitForElementToLoad(ListPage.DriversPage.chkbxSelectAllVehicles);
		DoThis.click(ListPage.DriversPage.chkbxSelectAllVehicles, "Y");
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		//Wait for toaster message to displayed
		DoThis.WaitForToasterMessageToLoad(ListPage.DriversPage.objToaster);
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(DriverGroupsDetails.get("drivers_group_name").toString()+" was successfully updated toaster is displayed");
		}
				
	}
	
	public static void AddDriverGroupsAndCancelAddingDrivers(String browser, @SuppressWarnings("rawtypes") Dictionary DriverGroupsDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		//Click Add Group
		DoThis.click(ListPage.DriversPage.btnAddGroup, "Y");
		
		//Set Vehicles Group Name
		DoThis.clear(browser, ListPage.DriversPage.txtbxGroupName, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxGroupName, DriverGroupsDetails.get("drivers_group_name").toString(), "Y");
		
		
		//Click Next button
		DoThis.click(ListPage.DriversPage.btnNext, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(DriverGroupsDetails.get("drivers_group_name").toString()+" was successfully created toaster is displayed");
		}
	
		//Click Cancel button
		DoThis.click(ListPage.DriversPage.btnCancel, "Y");
			
	}
	
	public static void AddDriverGroupsAndDriver(String browser, @SuppressWarnings("rawtypes") Dictionary DriverGroupsDetails, String DriverName) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		//Click Add Group
		DoThis.click(ListPage.DriversPage.btnAddGroup, "Y");
		
		//Set Vehicles Group Name
		DoThis.clear(browser, ListPage.DriversPage.txtbxGroupName, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxGroupName, DriverGroupsDetails.get("drivers_group_name").toString(), "Y");
		
		
		//Click Next button
		DoThis.click(ListPage.DriversPage.btnNext, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(DriverGroupsDetails.get("drivers_group_name").toString()+" was successfully created toaster is displayed");
		}
		
		//Search for the newly created Driver
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriverName, "Y");
		
		//Select the newly created Driver
		DoThis.click(ListPage.DriversPage.chckbxFirstDriverOption, "Y");
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(DriverGroupsDetails.get("drivers_group_name").toString()+" was successfully updated toaster is displayed");
		}
				
	}
	
	public static void SelectDriversGroupAndDriver(String browser, String DriverGroupName, String DriverName) throws InterruptedException {
		
		Drivers.SearchDriversGroup(browser, DriverGroupName);
		
		//Select Driver Group
		WebElement DriverGroupNameLocator = Constant.driver.findElement(By.xpath("//*[text()='"+DriverGroupName+"']"));
		DoThis.click(DriverGroupNameLocator, "Y");
		
		//Wait for Edit Group button to display
		DoThis.WaitForElementToLoad(ListPage.DriversPage.btnEditGroup);
		
		//Select Driver
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");
		
		
	}
	
	public static void ValidateDeleteDriversGroupsCreatedByAutomationIsRemoved(String browser, @SuppressWarnings("rawtypes") Dictionary DriversGroupDetails) throws IOException, Exception{
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriversGroupDetails.get("drivers_group_name").toString(), "Y");
		
		
	
	}

	public static void AddVehiclePermission(String browser,  String DriverName,@SuppressWarnings("rawtypes") Dictionary DriversDetails) throws InterruptedException {
		
		Drivers.SearchDrivers(browser, DriverName);
		
		//Select Driver Name
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");
		
		//Click Edit button
		DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
		
		//Search vehicle name
		DoThis.click(ListPage.Driverstab.SelectVehicle, "Y");
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriversDetails.get("vehicles_name").toString(), "Y");
		
		//Set Vehicle
		WebElement VehicleNameLocator = Constant.driver.findElement(By.xpath("//div[@class='rt-td'][text()='"+DriversDetails.get("vehicle_name").toString()+"']/preceding::div[@class='rt-td']//input[@type='checkbox']"));
		
		DoThis.click(VehicleNameLocator, "Y");
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Driver updated successfully. toaster message is displayed");
			}	
	}


	public static void AddVehicleGroupPermission(String browser, String DriverName,@SuppressWarnings("rawtypes") Dictionary DriversDetails) throws InterruptedException {
		
		Drivers.SearchDrivers(browser, DriverName);
		
		//Select Driver Name
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");
		
		//Click Edit button
		DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
		
		//Search Vehicle Group name
		DoThis.click(ListPage.Driverstab.SelectVehicleGroup, "Y");
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriversDetails.get("vehicles_group_name").toString(), "Y");
		
		//Set Vehicle Group Name
		WebElement VehicleNameLocator = Constant.driver.findElement(By.xpath("//div[@class='rt-td'][text()='"+DriversDetails.get("vehicle_group_name").toString()+"']/preceding::div[@class='rt-td']//input[@type='checkbox']"));
		DoThis.click(VehicleNameLocator, "Y");
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Driver updated successfully. toaster message is displayed");
			}	
	}

	public static void AddAllVehiclesPermission(String browser, String DriverName) throws InterruptedException {
		
		Drivers.SearchDrivers(browser, DriverName);
		
		//Select Driver Name
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");
		
		//Click Edit button
		DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
		
		//Set All Vehicle
		WebElement VehicleNameLocator = Constant.driver.findElement(By.xpath("//div[text()='Can Drive All Vehicles']"));
		DoThis.click(VehicleNameLocator, "Y");
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Driver updated successfully. toaster message is displayed");
			}	
	}
	
	public static void SearchDriversIDTag(String browser, String DriversIDTag) throws InterruptedException {
			
			DoThis.click(ListPage.nvTabList, "Y");
			DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
			
			DoThis.WaitForElementToLoad(ListPage.DriversPage.txtbxSearch);
			DoThis.WaitForElementToLoad(ListPage.Driverstab.DriversStatusDL);
			DoThis.click(ListPage.Driverstab.DriversStatusDL, "Y");
			
			WebElement DriverIDTagStatus = Constant.driver.findElement(By.xpath("//div[normalize-space()='Driver ID Tags' and contains(@id, 'ListDropdown')]"));
			DoThis.click(DriverIDTagStatus, "Y");
			DoThis.clear(browser, ListPage.SearchFld, "N");
			DoThis.sendkeys(ListPage.SearchFld, DriversIDTag , "Y");
				
				
		}
	
	public static void AddDriverTagNoExpiry(String browser, @SuppressWarnings("rawtypes") Dictionary DriversDetails, String DriversIDTag, String activesite) throws InterruptedException {
	
		Drivers.SearchDriversIDTag(browser, DriversIDTag);
		
		//Edit Driver ID Tag
		DoThis.click(ListPage.Driverstab.EditDriverIDTagbtn, "Y");
		DoThis.click(ListPage.Driverstab.DriverNameDL, "Y");
		WebElement SelectedDriver = Constant.driver.findElement(By.xpath("//div[normalize-space()='"+DriversDetails.get("driver_name").toString()+"' and contains(@role, 'option')]"));
		DoThis.click(SelectedDriver, "Y");
		
		//Add ID Tag Description
		DoThis.click(ListPage.Driverstab.DIDDescFld, "Y");
		DoThis.clear(browser, ListPage.Driverstab.DIDDescFld, "N");
		DoThis.sendkeys(ListPage.Driverstab.DIDDescFld, DriversIDTag , "Y");
		
		//Select Start Date
		DoThis.click(ListPage.Driverstab.dtpickerDIDStartDateIcon, "Y");
		WebElement currentDateCalendar = Constant.driver.findElement(By.xpath("//div[@aria-label='"+DoThis.getCurrentDate(activesite)+"']"));
		DoThis.click(currentDateCalendar, "Y");
		DoThis.click(ListPage.Driverstab.SaveDriverIDTagbtn, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.ToastSuccessMsg, "Toaster Message", "NA")) {
			DoThis.isContainingText(ListPage.ToastSuccessMsg, "Driver ID tags added successfully.", "Toaster message validation", "Y");							
		}
	}	

	public static void AddDriverTagWithExpiry(String browser, @SuppressWarnings("rawtypes") Dictionary DriversDetails, String DriversIDTag, String activesite) throws InterruptedException {
	
		Drivers.SearchDriversIDTag(browser, DriversIDTag);
		
		//Edit Driver ID Tag
		DoThis.click(ListPage.Driverstab.EditDriverIDTagbtn, "Y");
		DoThis.click(ListPage.Driverstab.DriverNameDL, "Y");
		WebElement SelectedDriver = Constant.driver.findElement(By.xpath("//div[normalize-space()='"+DriversDetails.get("driver_name").toString()+"' and contains(@role, 'option')]"));
		DoThis.click(SelectedDriver, "Y");
		
		//Add ID Tag Description
		DoThis.click(ListPage.Driverstab.DIDDescFld, "Y");
		DoThis.clear(browser, ListPage.Driverstab.DIDDescFld, "N");
		DoThis.sendkeys(ListPage.Driverstab.DIDDescFld, DriversIDTag , "Y");
		
		//Select Start Date
		DoThis.click(ListPage.Driverstab.dtpickerDIDStartDateIcon, "Y");
		WebElement currentDateCalendar = Constant.driver.findElement(By.xpath("//div[@aria-label='"+DoThis.getCurrentDate(activesite)+"']"));
		DoThis.click(currentDateCalendar, "Y");
		
		//Select End Date
		DoThis.click(ListPage.Driverstab.dtpickerDIDEndDateIcon, "Y");
		WebElement endDateCalendar = Constant.driver.findElement(By.xpath("//div[@aria-label='"+DoThis.getAWeekAfterDate()+"']"));
		DoThis.click(endDateCalendar, "Y");
		DoThis.click(ListPage.Driverstab.SaveDriverIDTagbtn, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.ToastSuccessMsg, "Toaster Message", "NA")) {
			DoThis.isContainingText(ListPage.ToastSuccessMsg, "Driver ID tags added successfully.", "Toaster message validation", "Y");							
		}		
	}		
	
	public static void EditDriverTag(String browser, @SuppressWarnings("rawtypes") Dictionary DriversDetails, String DriversIDTag) throws InterruptedException {
	
		Drivers.SearchDriversIDTag(browser, DriversIDTag);
		
		//Add ID Tag Description
		DoThis.click(ListPage.Driverstab.EditDriverIDTagbtn, "Y");
		DoThis.click(ListPage.Driverstab.DIDDescFld, "Y");
		DoThis.clear(browser, ListPage.Driverstab.DIDDescFld, "N");
		DoThis.sendkeys(ListPage.Driverstab.DIDDescFld, DriversDetails.get("edited_desc").toString(), "Y");
		
		//Select Start Date
		DoThis.click(ListPage.Driverstab.dtpickerDIDStartDateIcon, "Y");
		WebElement currentDateCalendar = Constant.driver.findElement(By.xpath("//div[@aria-label='"+DriversDetails.get("edited_startdate").toString()+"']"));
		DoThis.click(currentDateCalendar, "Y");
		
		//Select End Date
		DoThis.click(ListPage.Driverstab.dtpickerDIDEndDateIcon, "Y");
		WebElement endDateCalendar = Constant.driver.findElement(By.xpath("//div[@aria-label='"+DriversDetails.get("edited_enddate").toString()+"']"));
		DoThis.click(endDateCalendar, "Y");
		DoThis.click(ListPage.Driverstab.SaveDriverIDTagbtn, "Y");
						
		if(DoThis.isObjectAvailable(ListPage.ToastSuccessMsg, "Toaster Message", "NA")) {
			DoThis.isContainingText(ListPage.ToastSuccessMsg, "Driver ID tags updated successfully.", "Toaster message validation", "Y");							
		}
	}
	
	public static void MarkasLostDriverTag(String browser, @SuppressWarnings("rawtypes") Dictionary DriversDetails, String DriversIDTag) throws InterruptedException {
	
		Drivers.SearchDriversIDTag(browser, DriversIDTag);
		
		//Edit Driver ID Tag in Driver Details Page
		DoThis.click(ListPage.Driverstab.DriverRowGroup, "Y");
		
		//Edit a Driver ID Tag
		DoThis.WaitForElementToLoad(ListPage.Driverstab.DriverIDTags);
		DoThis.click(ListPage.Driverstab.DriverIDTags, "Y");
		WebElement EditDriverIDTagButton = Constant.driver.findElement(By.xpath("//*[contains(., '"+DriversIDTag+"')]/parent::*[contains(@class,'sc')]//*[local-name()='svg' and contains(@data-icon, 'pencil')]"));
		DoThis.WaitForElementToLoad(EditDriverIDTagButton);
		DoThis.click(EditDriverIDTagButton, "Y");
		
		//Mark a Driver ID Tag as Lost
		WebElement MarkasLostDriverIDTagButton = Constant.driver.findElement(By.xpath("//*[contains(., '"+DriversIDTag+"')]/parent::*[contains(@class,'sc')]//*[local-name()='svg' and contains(@data-icon, 'question')]"));
		DoThis.WaitForElementToLoad(MarkasLostDriverIDTagButton);
		DoThis.click(MarkasLostDriverIDTagButton, "Y");
						
		if(DoThis.isObjectAvailable(ListPage.ToastSuccessMsg, "Toaster Message", "NA")) {
			DoThis.isContainingText(ListPage.ToastSuccessMsg, "Driver ID tags updated successfully.", "Toaster message validation", "Y");							
		}
	}
	
	public static void RecoverDriverTag(String browser, @SuppressWarnings("rawtypes") Dictionary DriversDetails, String DriversIDTag) throws InterruptedException {
	
		Drivers.SearchDriversIDTag(browser, DriversIDTag);
		
		//Edit Driver ID Tag
		DoThis.click(ListPage.Driverstab.DriverRowGroup, "Y");
		
		//Go to Lost Driver ID Tag list
		DoThis.WaitForElementToLoad(ListPage.Driverstab.DriverIDTags);
		DoThis.click(ListPage.Driverstab.DriverIDTags, "Y");
		DoThis.click(ListPage.Driverstab.LostTags, "Y");
		
		//Recover a Lost Driver ID tag
	
		WebElement RecoverDriverIDTagButton = Constant.driver.findElement(By.xpath("//*[contains(., '"+DriversIDTag+"')]/parent::*[contains(@class,'sc')]//*[contains(., 'Recover')]/parent::div[contains(@label,'[object Object]')]"));
		DoThis.WaitForElementToLoad(RecoverDriverIDTagButton);
		DoThis.click(RecoverDriverIDTagButton, "Y");
						
		if(DoThis.isObjectAvailable(ListPage.ToastSuccessMsg, "Toaster Message", "NA")) {
			DoThis.isContainingText(ListPage.ToastSuccessMsg, "Driver ID tags updated successfully.", "Toaster message validation", "Y");							
		}
	}
	
	public static void DeleteDriverTag(String browser, @SuppressWarnings("rawtypes") Dictionary DriversDetails, String DriversIDTag) throws InterruptedException {
	
		Drivers.SearchDriversIDTag(browser, DriversIDTag);
		
		//Edit Driver ID Tag
		DoThis.click(ListPage.Driverstab.DriverRowGroup, "Y");
		
		//Delete a Driver ID tag
		DoThis.WaitForElementToLoad(ListPage.Driverstab.DriverIDTags);
		DoThis.click(ListPage.Driverstab.DriverIDTags, "Y");
		WebElement DeleteDriverIDTagButton = Constant.driver.findElement(By.xpath("//*[contains(., '"+DriversIDTag+"')]/parent::*[contains(@class,'sc')]//*[local-name()='svg' and contains(@data-icon, 'trash')]"));
		DoThis.WaitForElementToLoad(DeleteDriverIDTagButton);
		DoThis.click(DeleteDriverIDTagButton, "Y");
		DoThis.click(ListPage.ConfirmBtn, "Y");
						
		if(DoThis.isObjectAvailable(ListPage.ToastSuccessMsg, "Toaster Message", "NA")) {
			DoThis.isContainingText(ListPage.ToastSuccessMsg, "Driver ID tags updated successfully.", "Toaster message validation", "Y");							
		}
	}
	
	public static void ImportDriverDownloadTemplate() throws InterruptedException {
		
		//Navigate to Settings >> Import Data page
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctSettings, "Y");
		DoThis.click(SettingsPage.ImportsDataTab.nvBarImportData, "Y");		
		
		//Category = Importers
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategory, "Y");
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnCategoryOptionImporters, "Y");
		
		//Import Type = Import POI
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportType, "Y");
		DoThis.click(SettingsPage.ImportsDataTab.drpdwnImportTypeOptionImportDriver, "Y");
		
		//Click Download Template
		DoThis.click(SettingsPage.ImportsDataTab.btnDownloadTemplate, "Y");
	
	}
	
	public static void SelectDrivers(String browser, String DriverName) throws InterruptedException {
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(ListPage.nvTabList);
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		DoThis.WaitForElementToLoad(ListPage.DriversPage.txtbxSearch);
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriverName, "Y");
		
		//Wait for data to load
		DoThis.WaitForElementToLoad(ListPage.DriversPage.btnCogWheels);
		
		WebElement DriverLocator = Constant.driver.findElement(By.xpath("//div[contains(@class,'rt-td')][contains(text(),'"+DriverName+"')]"));
		DoThis.click(DriverLocator, "Y");
	
	}
	
	public static void SelectAndEditDrivers(String browser, String DriverName) throws InterruptedException {
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(ListPage.nvTabList);
						
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		DoThis.WaitForElementToLoad(ListPage.DriversPage.txtbxSearch);
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriverName, "Y");
		
		//Wait for data to load
		DoThis.WaitForElementToLoad(ListPage.DriversPage.btnCogWheels);
		
		WebElement DriverLocator = Constant.driver.findElement(By.xpath("//div[contains(@class,'rt-td')][contains(text(),'"+DriverName+"')]"));
		DoThis.click(DriverLocator, "Y");
		
		DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
		
	}
	
	public static void EditDriverGroups(String browser, @SuppressWarnings("rawtypes") Dictionary DriverGroupsDetails) throws IOException, Exception{
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(ListPage.nvTabList);
				
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriverGroupsDetails.get("drivers_group_name").toString(), "Y");
		
		//Wait for element to displayed
		DoThis.WaitForElementToLoad(ListPage.DriversPage.objDriversGroupFolder);
		
		//Select Driver Group
		WebElement DriverGroupNameLocator = Constant.driver.findElement(By.xpath("//*[text()='"+DriverGroupsDetails.get("drivers_group_name").toString()+"']"));
		DoThis.click(DriverGroupNameLocator, "Y");
		
		//Wait for Edit Group button to display
		DoThis.WaitForElementToLoad(ListPage.DriversPage.btnEditGroup);
		
		//Click Edit Group
		DoThis.click(ListPage.DriversPage.btnEditGroup, "Y");
		
		//Update Group Name
		DoThis.clear(browser, ListPage.DriversPage.txtbxGroupName, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxGroupName, DriverGroupsDetails.get("updated_drivers_group_name").toString(), "Y");
		
		//Ticked Select All Drivers
		//Wait for Select All Drivers checkbox to displayed
		DoThis.WaitForElementToLoad(ListPage.DriversPage.chkbxSelectAllVehicles);
		DoThis.click(ListPage.DriversPage.chkbxSelectAllVehicles, "Y");
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster Message", "NA")) {
			Reporter.ReportEventNoImage(DriverGroupsDetails.get("drivers_group_name").toString()+" was successfully updated toaster is displayed");
		}
		
	}
	public static void SearchEditedDriverGroups(String browser, @SuppressWarnings("rawtypes") Dictionary DriverGroupsDetails) throws IOException, Exception{
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(ListPage.nvTabList);
					
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, DriverGroupsDetails.get("updated_drivers_group_name").toString(), "Y");
		
	}
	
	public static void SetVehiclePermission(String browser, String DriverName,@SuppressWarnings("rawtypes") Dictionary DriversDetails) throws InterruptedException {
		
		Drivers.SearchDrivers(browser, DriverName);
		
		//Select Driver Name
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");
		
		//Click Edit button
		DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
		
		//Navigate Details >> Vehicle Permission
		DoThis.click(ListPage.DriversPage.tbDetails, "Y");
		DoThis.click(ListPage.DriversPage.tbVehiclePermission, "Y");
		
		switch (DriversDetails.get("vehicle_permission").toString()) {
		
		case "All Vehicles":
			if(!DoThis.getCheckedStatus(ListPage.DriversPage.objchkbxCanDriveAllVehicles).contains("true")) {
				DoThis.click(ListPage.DriversPage.chkbxCanDriveAllVehicles, "Y");
			}else {
				Reporter.ReportEventNoImage("All Vehicles checkbox already checked");
			}
		break;
			
		case "Select Vehicle":
			
			if(DoThis.getCheckedStatus(ListPage.DriversPage.objchkbxCanDriveAllVehicles).contains("true")) {
				DoThis.click(ListPage.DriversPage.chkbxCanDriveAllVehicles, "Y");
			}else {
				Reporter.ReportEventNoImage("All Vehicles checkbox is NOT checked");
			}
			
			DoThis.clear(browser, ListPage.DriversPage.txtbxSearchVehicles, "Y");
			DoThis.sendkeys(ListPage.DriversPage.txtbxSearchVehicles, DriversDetails.get("vehicle").toString(), "Y");
			
			//Select Vehicle
			WebElement VehicleLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriversDetails.get("vehicle").toString()+"']"));
			DoThis.click(VehicleLocator, "Y");
		break;
		
		}
		
		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Driver updated successfully toaster is displayed");
			}	
		
	}
	
	public static void SetGroupVehiclePermission(String browser, String DriverName,@SuppressWarnings("rawtypes") Dictionary DriversDetails) throws InterruptedException {
		
		Drivers.SearchDrivers(browser, DriverName);
		
		//Select Driver Name
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");
		
		//Click Edit button
		DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
		
		//Navigate Details >> Vehicle Permission >> Groups tab
		DoThis.click(ListPage.DriversPage.tbDetails, "Y");
		DoThis.click(ListPage.DriversPage.tbVehiclePermission, "Y");
		
		//Clear Existing Vehicle Permission from previous validation
		if(DoThis.getCheckedStatus(ListPage.DriversPage.objchkbxCanDriveAllVehicles).contains("true")) {
			DoThis.click(ListPage.DriversPage.chkbxCanDriveAllVehicles, "Y");
		}else {
			Reporter.ReportEventNoImage("All Vehicles checkbox is NOT checked");
		}
		
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearchVehicles, "Y");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearchVehicles, DriversDetails.get("vehicle").toString(), "Y");
		
		//Select Vehicle
		WebElement VehicleLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriversDetails.get("vehicle").toString()+"']"));
		DoThis.click(VehicleLocator, "Y");
		
		DoThis.click(ListPage.DriversPage.tbVehicleGroupPermission, "Y");
		
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearchVehiclesGroup, "Y");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearchVehiclesGroup, DriversDetails.get("vehicle_group").toString(), "Y");
		
		//Select Vehicle
		WebElement VehicleGroupLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriversDetails.get("vehicle_group").toString()+"']"));
		DoThis.click(VehicleGroupLocator, "Y");

		//Click Save button
		DoThis.click(ListPage.DriversPage.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "NA")){
			Reporter.ReportEventNoImage("Driver updated successfully toaster is displayed");
			}	
		
	}
	
	public static void DriverIDTags(String browser, String DriverName,@SuppressWarnings("rawtypes") Dictionary DriversIDTagsDetails, String activesite) throws InterruptedException {
		
		Drivers.SearchDrivers(browser, DriverName);
		
		//Select Driver Name
		WebElement DriverNameLocator = Constant.driver.findElement(By.xpath("//div[text()='"+DriverName+"']"));
		DoThis.click(DriverNameLocator, "Y");

		DoThis.click(ListPage.DriversPage.tbDriverIDTags, "Y");
		
		//Check if the Chat bot is displayed
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objFleetChatbot, "Fleet Chat Bot", "N")) {
			DoThis.click(ListPage.DriversPage.objFleetChatbot, "Y");
		}
		
		switch (DriversIDTagsDetails.get("driver_id_tags").toString()) {
		
		case "Add":
			if(DoThis.isObjectAvailable(ListPage.DriversPage.btnUnassigns, "Unassign button", "N")) {
				//Select First Available Tags
				DoThis.click(ListPage.DriversPage.btnUnassign.get(0), "Y");
				
				//Wait for element to load
				DoThis.WaitForElementToLoad(ListPage.DriversPage.txtbxTagsDescription);
				
				//Start Date
				DoThis.click(ListPage.DriversPage.txtbxTagsStartDate, "Y");
				DoThis.sendkeys(ListPage.DriversPage.txtbxTagsStartDate, DriversIDTagsDetails.get("tags_start_date").toString(), "Y");
		
				//End Date
				DoThis.click(ListPage.DriversPage.txtbxTagsEndDate, "Y");
				DoThis.sendkeys(ListPage.DriversPage.txtbxTagsEndDate, DriversIDTagsDetails.get("tags_end_date").toString(), "Y");
			
				//Description
				DoThis.clear(browser, ListPage.DriversPage.txtbxTagsDescription, "N");
				DoThis.sendkeys(ListPage.DriversPage.txtbxTagsDescription, DriversIDTagsDetails.get("tags_description").toString(), "Y");
				
				//Click Submit
				DoThis.click(ListPage.DriversPage.btnSubmit, "Y");
				
				if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "NA")){
					Reporter.ReportEventNoImage("Driver ID tags added successfully. toaster is displayed");
					}	
			}else {
				Reporter.ReportEventNoImage("ID Tags is not available for "+activesite);
			}
			
		
		break;
		
		case "Edit":
			if(DoThis.isObjectAvailable(ListPage.DriversPage.btnEditYourIDTag, "Edit Your Tag button", "N")) {
				DoThis.WaitForElementToLoad(ListPage.DriversPage.btnEditYourIDTag);
				DoThis.Hover(ListPage.DriversPage.btnEditYourIDTag);
				while(!DoThis.isObjectAvailable(ListPage.DriversPage.txtbxTagsStartDate, "Tags Start Date text box", "NA")){
					DoThis.clickSVGElement(ListPage.DriversPage.btnEditYourIDTag, "Y");

				}
				
				//Update Start Date
				DoThis.click(ListPage.DriversPage.txtbxTagsStartDate, "Y");
				DoThis.clear(browser, ListPage.DriversPage.txtbxTagsStartDate, "N");
				DoThis.sendkeys(ListPage.DriversPage.txtbxTagsStartDate, DriversIDTagsDetails.get("updated_tags_start_date").toString(), "Y");
		
				//Update End Date
				DoThis.click(ListPage.DriversPage.txtbxTagsEndDate, "Y");
				DoThis.clear(browser, ListPage.DriversPage.txtbxTagsEndDate, "N");
				DoThis.sendkeys(ListPage.DriversPage.txtbxTagsEndDate, DriversIDTagsDetails.get("updated_tags_end_date").toString(), "Y");
			
				//Update Description
				DoThis.clear(browser, ListPage.DriversPage.txtbxTagsDescription, "N");
				DoThis.sendkeys(ListPage.DriversPage.txtbxTagsDescription, DriversIDTagsDetails.get("updated_tags_description").toString(), "Y");
				
				//Click Submit
				DoThis.click(ListPage.DriversPage.btnSubmit, "Y");
				
				if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "N")){
					Reporter.ReportEventNoImage("Driver ID tags updated successfully. toaster is displayed");
					}	
			}else {
				Reporter.ReportEventNoImage("ID Tags is not available for "+activesite);
			}
			
			
		break;
		
		case "Delete":
			if(DoThis.isObjectAvailable(ListPage.DriversPage.btnDeleteYourIDTag, "Delete Your ID Tag button", "N")) {
				DoThis.WaitForElementToLoad(ListPage.DriversPage.btnDeleteYourIDTag);
				DoThis.Hover(ListPage.DriversPage.btnDeleteYourIDTag);
				while(!DoThis.isObjectAvailable(ListPage.DriversPage.btnConfirm, "Confirm button", "NA")){
					DoThis.clickSVGElement(ListPage.DriversPage.btnDeleteYourIDTag, "Y");
				}
			
				//Click Confirm
				DoThis.click(ListPage.DriversPage.btnConfirm, "Y");
				
				if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "N")){
					Reporter.ReportEventNoImage("Driver ID tags updated successfully. toaster is displayed");
					}	
			}else {
				Reporter.ReportEventNoImage("ID Tags is not available for "+activesite);
			}
			
		break;
		
		}
		
	}
	
	public static void DeactivatedDriversCreatedByAutomation(String browser, String searchKeyword) throws InterruptedException {
		
		DoThis.click(ListPage.nvTabList, "Y");
		DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
		
		DoThis.WaitForElementToLoad(ListPage.DriversPage.txtbxSearch);
		DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
		DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, searchKeyword, "Y");
		
		//Set Status Filter to Active Drivers
		DoThis.click(ListPage.DriversPage.drpdwnStatusFilter, "Y");
		DoThis.click(ListPage.DriversPage.drpdwnStatusFilterOptionActiveDrivers, "Y");
		
		//Get Total Users
		String strTotalDrivers = DoThis.getText(ListPage.DriversPage.objTotalDrivers);
		int intTotalDrivers=Integer.parseInt(strTotalDrivers);  
		
		if(DoThis.isObjectAvailable(ListPage.DriversPage.objNoDataAvailable, "No data available", "NA")) {
			Reporter.ReportEventNoImage("No Active Drivers is created by Automation");
		}else {
			Reporter.ReportEventNoImage(intTotalDrivers+" Drivers will be deactivated created by Automation");
			//Set to Inactive All Drivers created by Automation
			for(int i=0; i<intTotalDrivers; i++) {
				
				DoThis.click(ListPage.nvTabList, "Y");
				DoThis.click(ListPage.DriversPage.nvTabDrivers, "Y");
				
				DoThis.WaitForElementToLoad(ListPage.DriversPage.txtbxSearch);
				
				//Enter Drivers Name in Search field
				DoThis.clear(browser, ListPage.DriversPage.txtbxSearch, "N");
				DoThis.sendkeys(ListPage.DriversPage.txtbxSearch, searchKeyword.toString(), "Y");
				
				//Set Status Filter to Active Drivers
				DoThis.click(ListPage.DriversPage.drpdwnStatusFilter, "Y");
				DoThis.click(ListPage.DriversPage.drpdwnStatusFilterOptionActiveDrivers, "Y");
				
				//Wait for Drivers data to load
				DoThis.WaitForElementToLoad(ListPage.DriversPage.btnCogWheels);
				
				//Select First Driver from List
				DoThis.click(ListPage.DriversPage.objDriver, "Y");
				
				//Click Edit Driver button
				DoThis.WaitForElementToLoad(ListPage.DriversPage.btnEditDriver);
				DoThis.click(ListPage.DriversPage.btnEditDriver, "Y");
				
				if(!DoThis.isObjectAvailable(ListPage.DriversPage.btnDeactivateDriver, "Deactivate button", "N")) {
					Reporter.ReportEventNoImage("Driver is already Deactivated");
				}else {
					
					//Click Deactivate Driver button
					DoThis.WaitForElementToLoad(ListPage.DriversPage.btnDeactivateDriver);
					DoThis.click(ListPage.DriversPage.btnDeactivateDriver, "Y");
					
					//Click Confirm button
					DoThis.click(ListPage.DriversPage.btnConfirm, "Y");
					
					if(DoThis.isObjectAvailable(ListPage.DriversPage.objToaster, "Toaster message", "N")) {
						Reporter.ReportEventNoImage("Driver deactivated successfully. toaster message is displayed");
					}
					
				}
				
			}
		
		}
	
	}
	
}
