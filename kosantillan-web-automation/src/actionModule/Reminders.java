package actionModule;

import static org.testng.Assert.assertTrue;
import java.util.Dictionary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.NotificationPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

public class Reminders{	
	
	
	public static void CreateReminders(String browser, @SuppressWarnings("rawtypes") Dictionary RemindersDetails, String activesite) throws InterruptedException {
		
		//Navigate to Notification >> Reminders
		DoThis.click(NotificationPage.btnNotification, "Y");
		DoThis.click(NotificationPage.RemindersTab.tbReminders, "Y");
		
		//Click Add Reminders
		DoThis.click(NotificationPage.RemindersTab.btnAddReminders, "Y");
		
		//Wait for Element to load
		while(!DoThis.isObjectAvailable(NotificationPage.RemindersTab.drpdwnVehicle, "Reminder Vehicle dropdown", "N")) {
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.drpdwnVehicle);
		}
			
		//Select between Vehicle or Driver
		switch(RemindersDetails.get("reminder").toString()) {
		
		case "Vehicle":
		case "Multiple Vehicles":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnVehicle, "Y");
			break;
		
		case "Driver":
		case "Multiple Drivers":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnDriver, "Y");
			break;
		}
		
		//Select Reminder Type
		switch(RemindersDetails.get("reminder_type").toString()) {
		
		case "Time":
			DoThis.click(NotificationPage.RemindersTab.drpdwnReminderType, "Y");
			//For countries that does not English Name locator, add here
			switch(activesite) {
			case("PL"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionCzas);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionCzas, "Y");
				break;
			case("PT"): 
			case("FR"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionTempo);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionTempo, "Y");
				break;
			default:
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionTime);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionTime, "Y");
				break;
			}
			break;
			
		case "Distance":
			DoThis.click(NotificationPage.RemindersTab.drpdwnReminderType, "Y");
			//For countries that does not English Name locator, add here
			switch(activesite) {
			case("PL"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDystans);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDystans, "Y");
				break;
			case("PT"): 
			case("FR"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDistância);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDistância, "Y");
				break;
			default:
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDistance);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDistance, "Y");
			break;
			}
			break;
			
		case "Clock":
			DoThis.click(NotificationPage.RemindersTab.drpdwnReminderType, "Y");
			//For countries that does not English Name locator, add here
			switch(activesite) {
			case("PL"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionZegar);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionZegar, "Y");
				break;
			case("PT"):
			case("FR"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionHoras);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionHoras, "Y");
				break;
			default:
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionWorktime);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionWorktime, "Y");
			break;
			}
			break;
		}
		
		//Set Reminder Name
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxReminderName, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxReminderName, RemindersDetails.get("reminder_name").toString(), "Y");
		
		//Set Schedule Settings
		switch(RemindersDetails.get("reminder_type").toString()) {
		
		case "Time":
			
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxTriggerAfter, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxTriggerAfter, RemindersDetails.get("trigger_after").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterType, "Y");
			switch(RemindersDetails.get("trigger_after_type").toString()) {
			
			case "Days":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeDias, "Y");
					break;
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeDays, "Y");
						break;
				}
				break;
				
			case "Months":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMeses, "Y");
					break;
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMonths, "Y");
					break;
				}
				break;
				
			case "Weeks":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeSemanas, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeWeeks, "Y");
					break;
				}
				break;
				
			case "Years":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeAnos, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeYears, "Y");
					break;
				}
				break;
			}
				
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxNotifyInAdvance, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxNotifyInAdvance, RemindersDetails.get("notify_in_advance").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceType, "Y");
			switch(RemindersDetails.get("notify_in_advance_type").toString()) {
			
			case "Days":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDias, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDays, "Y");
					break;
				}
				break;
				
			case "Months":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMeses, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMonths, "Y");
					break;
				}
				break;
				
			case "Weeks":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeSemanas, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeWeeks, "Y");
					break;
				}
				break;
				
			case "Years":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case ("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeAnos, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeYears, "Y");
					break;
				}
				break;
			}		
			break;
			
		case "Distance":
			
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxTriggerAfter, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxTriggerAfter, RemindersDetails.get("trigger_after").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterType, "Y");
			switch(RemindersDetails.get("trigger_after_type").toString()) {
			
			case "Kilometers":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case ("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeKms, "Y");
				break;
				
				case("US"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMiles, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeKilometers, "Y");
				break;
				}
				break;
				
			case "Thousand kms":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case ("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMilKms, "Y");
				break;
				
				case("US"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeThousandmiles, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeThousandkms, "Y");
				break;
				}
				break;
			}
				
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxNotifyInAdvance, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxNotifyInAdvance, RemindersDetails.get("notify_in_advance").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceType, "Y");
			switch(RemindersDetails.get("notify_in_advance_type").toString()) {
			
			case "Kilometers":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeKms, "Y");
				break;
				
				case("US"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMiles, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeKilometers, "Y");
				break;
				}
				break;
				
			case "Thousand kms":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMilKms, "Y");
				break;
				
				case("US"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeThousandmiles, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeThousandkms, "Y");
				break;
				}
				break;
			}
			
			break;
			
		case "Clock":
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxTriggerAfter, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxTriggerAfter, RemindersDetails.get("trigger_after").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterType, "Y");
			switch(RemindersDetails.get("trigger_after_type").toString()) {
			
			case "Days of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeDiasdeTrabalho, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeDaysofoperation, "Y");
				break;
				}
				break;
				
			case "Months of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMesesdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMonthsofoperation, "Y");
				break;
				}
				break;
				
			case "Hours of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeHorasdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeHoursofoperation, "Y");
				break;
				}
				break;
				
			case "Years of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeAnosdeTrabalho, "Y");
				break;
					
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeYearsofoperation, "Y");
				break;
				}
				break;
			}
				
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxNotifyInAdvance, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxNotifyInAdvance, RemindersDetails.get("notify_in_advance").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceType, "Y");
			switch(RemindersDetails.get("notify_in_advance_type").toString()) {
			
			case "Days of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDiasdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDaysofoperation, "Y");
				break;
				}
				break;
				
			case "Months of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMesesdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMonthsofoperation, "Y");
				break;
				}
				break;
				
			case "Hours of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeHorasdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeHoursofoperation, "Y");
				break;
				}
				break;
				
			case "Years of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeAnosdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeYearsofoperation, "Y");
				break;
				}
				break;
			}
			break;
		}
		
		switch(RemindersDetails.get("remiders_repeat").toString()) {
		
		case "Always":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnAlways, "Y");
			break;
			
		case "Once":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnOnce, "Y");
			break;
			
		case "Expiration date":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnExpirationDate, "Y");
			break;
		
		}
		
		switch(RemindersDetails.get("reminders_notification").toString()) {
		
		case "Email":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnEmail, "Y");
			
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.txtbxEmail);
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxEmail, RemindersDetails.get("email").toString(), "Y");
			
			//Click Add Option
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.objAddOption);
			DoThis.click(NotificationPage.RemindersTab.objAddOption, "Y");
			break;
			
		case "SMS":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnSMS, "Y");
			
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.txtbxSMS);
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxSMS, RemindersDetails.get("sms").toString(), "Y");
			
			//Select SMS First Option
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.objSelectSMSOption.get(0));
			DoThis.click(NotificationPage.RemindersTab.objSelectSMSOption.get(0), "Y");
			break;
		}
		
		//Select First Driver or Vehicle from the list
		switch(RemindersDetails.get("reminder").toString()) {
		
		case "Vehicle":
			//Select first Vehicle
			DoThis.click(NotificationPage.RemindersTab.drpdwnVehicle, "Y");
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.drpdwnVehicleFirstOption);
			DoThis.click(NotificationPage.RemindersTab.drpdwnVehicleFirstOption, "Y");
			break;
		
		case "Driver":
			//Select first Driver
			DoThis.click(NotificationPage.RemindersTab.drpdwnDriver, "Y");
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.drpdwnDriverFirstOption);
			DoThis.click(NotificationPage.RemindersTab.drpdwnDriverFirstOption, "Y");
			break;
			
		case "Multiple Vehicles":
			//Select first 3 Vehicles
			switch (activesite) {
			case "PL":
			case "NZ":	
			case "AU":	
			case "FR":	
			case "NG":
				DoThis.click(NotificationPage.RemindersTab.drpdwnVehicle, "Y");
				DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.drpdwnVehicleFirstOption);
				DoThis.click(NotificationPage.RemindersTab.drpdwnVehicleFirstOption, "Y");
			break;
			default:
				for(int i=0; i<3; i++) {
					DoThis.click(NotificationPage.RemindersTab.drpdwnVehicle, "Y");
					DoThis.click(NotificationPage.RemindersTab.drpdwnVehicleOptions.get(i), "Y");
				}
			break;
			}
			
			break;
		
		case "Multiple Drivers":
			//Select first 3 Drivers
			for(int i=0; i<3; i++) {
				DoThis.click(NotificationPage.RemindersTab.drpdwnDriver, "Y");
				DoThis.click(NotificationPage.RemindersTab.drpdwnDriverOptions.get(0), "Y");
			}
			break;
		
		}
		
		//Click Save button
		DoThis.click(NotificationPage.RemindersTab.btnSave, "Y");
		
		//Wait for toaster to load
		DoThis.WaitForToasterMessageToLoad(NotificationPage.RemindersTab.objToaster);
		
		if(DoThis.isObjectAvailable(NotificationPage.RemindersTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Reminder has been successfully created toaster message is displayed");
		}
		
	}
	
	public static void SearchReminders(String browser, @SuppressWarnings("rawtypes") Dictionary RemindersDetails) throws InterruptedException {
		
		//Check if the Chat bot is displayed
		if(DoThis.isObjectAvailable(NotificationPage.RemindersTab.objFleetChatbot, "Fleet Chat Bot", "N")) {
			DoThis.click(NotificationPage.RemindersTab.objFleetChatbot, "Y");
		}
		
		//Wait for Reminders to load in Reminders Tab
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnDelete);
		
		//Search for Reminders
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxSearch, RemindersDetails.get("reminder_name").toString(), "Y");
		
		WebElement Reminders = Constant.driver.findElement(By.xpath("//div[text()='"+RemindersDetails.get("reminder_name").toString()+"']/following::div[text()='"+RemindersDetails.get("reminder_type").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(Reminders, ""+RemindersDetails.get("reminder_type").toString()+" Reminders in Reminders tab validation", "Y")) {assertTrue(false);}
		
	}
	
	public static void EditReminders(String browser, @SuppressWarnings("rawtypes") Dictionary RemindersDetails, String activesite) throws InterruptedException {
		
		//Wait for Reminders to load in Reminders Tab
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnDelete);
		
		//Search for Reminders
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxSearch, RemindersDetails.get("reminder_name").toString(), "Y");
		
		WebElement Reminders = Constant.driver.findElement(By.xpath("//div[text()='"+RemindersDetails.get("reminder_name").toString()+"']/following::div[text()='"+RemindersDetails.get("reminder_type").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(Reminders, ""+RemindersDetails.get("reminder_type").toString()+" Reminders in Reminders tab validation", "Y")) {assertTrue(false);}
		
		//Select and Edit Reminders
		DoThis.click(Reminders, "Y");
		
		//Select between Vehicle or Driver
		switch(RemindersDetails.get("reminder").toString()) {
		
		case "Vehicle":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnVehicle, "Y");
			break;
		
		case "Driver":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnDriver, "Y");
			break;
		}
		
		//Set Reminder Name
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxReminderName, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxReminderName, RemindersDetails.get("updated_reminder_name").toString(), "Y");
		
		//Select First Driver or Vehicle from the list
		switch(RemindersDetails.get("reminder").toString()) {
		
		case "Vehicle":
			DoThis.click(NotificationPage.RemindersTab.drpdwnVehicle, "Y");
			DoThis.click(NotificationPage.RemindersTab.drpdwnVehicleFirstOption, "Y");
			break;
		
		case "Driver":
			DoThis.click(NotificationPage.RemindersTab.drpdwnDriver, "Y");
			DoThis.click(NotificationPage.RemindersTab.drpdwnDriverFirstOption, "Y");
			break;
		
		}
		
		//Set Schedule Settings
		switch(RemindersDetails.get("reminder_type").toString()) {
		
		case "Time":
			
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxTriggerAfter, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxTriggerAfter, RemindersDetails.get("trigger_after").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterType, "Y");
			switch(RemindersDetails.get("trigger_after_type").toString()) {
			
			case "Days":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeDias, "Y");
					break;
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeDays, "Y");
						break;
				}
				break;
				
			case "Months":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMeses, "Y");
					break;
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMonths, "Y");
					break;
				}
				break;
				
			case "Weeks":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeSemanas, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeWeeks, "Y");
					break;
				}
				break;
				
			case "Years":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeAnos, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeYears, "Y");
					break;
				}
				break;
			}
				
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxNotifyInAdvance, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxNotifyInAdvance, RemindersDetails.get("notify_in_advance").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceType, "Y");
			switch(RemindersDetails.get("notify_in_advance_type").toString()) {
			
			case "Days":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDias, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDays, "Y");
					break;
				}
				break;
				
			case "Months":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMeses, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMonths, "Y");
					break;
				}
				break;
				
			case "Weeks":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeSemanas, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeWeeks, "Y");
					break;
				}
				break;
				
			case "Years":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeAnos, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeYears, "Y");
					break;
				}
				break;
			}		
			break;
			
		case "Distance":
			
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxTriggerAfter, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxTriggerAfter, RemindersDetails.get("trigger_after").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterType, "Y");
			switch(RemindersDetails.get("trigger_after_type").toString()) {
			
			case "Kilometers":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeKms, "Y");
				break;
				
				case("US"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMiles, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeKilometers, "Y");
				break;
				}
				break;
				
			case "Thousand kms":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMilKms, "Y");
				break;
				
				case("US"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeThousandmiles, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeThousandkms, "Y");
				break;
				}
				break;
			}
				
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxNotifyInAdvance, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxNotifyInAdvance, RemindersDetails.get("notify_in_advance").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceType, "Y");
			switch(RemindersDetails.get("notify_in_advance_type").toString()) {
			
			case "Kilometers":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeKms, "Y");
				break;
				
				case("US"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMiles, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeKilometers, "Y");
				break;
				}
				break;
				
			case "Thousand kms":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMilKms, "Y");
				break;
				
				case("US"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeThousandmiles, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeThousandkms, "Y");
				break;
				}
				break;
			}
			
			break;
			
		case "Clock":
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxTriggerAfter, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxTriggerAfter, RemindersDetails.get("trigger_after").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterType, "Y");
			switch(RemindersDetails.get("trigger_after_type").toString()) {
			
			case "Days of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeDiasdeTrabalho, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeDaysofoperation, "Y");
				break;
				}
				break;
				
			case "Months of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMesesdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeMonthsofoperation, "Y");
				break;
				}
				break;
				
			case "Hours of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeHorasdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeHoursofoperation, "Y");
				break;
				}
				break;
				
			case "Years of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeAnosdeTrabalho, "Y");
				break;
					
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxTriggerAfterTypeYearsofoperation, "Y");
				break;
				}
				break;
			}
				
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxNotifyInAdvance, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxNotifyInAdvance, RemindersDetails.get("notify_in_advance").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceType, "Y");
			switch(RemindersDetails.get("notify_in_advance_type").toString()) {
			
			case "Days of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDiasdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDaysofoperation, "Y");
				break;
				}
				break;
				
			case "Months of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMesesdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMonthsofoperation, "Y");
				break;
				}
				break;
				
			case "Hours of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeHorasdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeHoursofoperation, "Y");
				break;
				}
				break;
				
			case "Years of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeAnosdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeYearsofoperation, "Y");
				break;
				}
				break;
			}
			break;
		}
		
		switch(RemindersDetails.get("remiders_repeat").toString()) {
		
		case "Always":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnAlways, "Y");
			break;
			
		case "Once":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnOnce, "Y");
			break;
			
		case "Expiration date":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnExpirationDate, "Y");
			break;
		
		}
	
		switch(RemindersDetails.get("reminders_notification").toString()) {
		
		case "Email":
			
			//Remove existing Email
			DoThis.click(NotificationPage.RemindersTab.objEmailNotificationXIcon, "Y");
			
			DoThis.click(NotificationPage.RemindersTab.rdnbtnEmail, "Y");
			
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.txtbxEmail);
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxEmail, RemindersDetails.get("updated_email").toString(), "Y");
			
			//Click Add Option
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.objAddOption);
			DoThis.click(NotificationPage.RemindersTab.objAddOption, "Y");
			break;
			
		case "SMS":
			
			//Remove existing SMS
			DoThis.click(NotificationPage.RemindersTab.objSMSNotificationXIcon, "Y");
			
			DoThis.click(NotificationPage.RemindersTab.rdnbtnSMS, "Y");
			
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.txtbxSMS);
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxSMS, RemindersDetails.get("updated_SMS").toString(), "Y");
			
			//Click Add Option
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.objAddOption);
			DoThis.click(NotificationPage.RemindersTab.objAddOption, "Y");
			break;
		}
		
		//Click Update button
		DoThis.click(NotificationPage.RemindersTab.btnUpdate, "Y");
		
		if(DoThis.isObjectAvailable(NotificationPage.RemindersTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Reminder item has been successfully updated toaster message is displayed");
			
		}
		
		
	}
	
	public static void SearchUpdatedReminders(String browser, @SuppressWarnings("rawtypes") Dictionary RemindersDetails) throws InterruptedException {
		
		//Navigate to Reminders tab
		DoThis.click(NotificationPage.RemindersTab.tbReminders, "Y");
		
		//Wait for Reminders to load in Reminders Tab
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnDelete);
		
		//Search for Reminders
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxSearch, RemindersDetails.get("updated_reminder_name").toString(), "Y");
		
		WebElement Reminders = Constant.driver.findElement(By.xpath("//div[text()='"+RemindersDetails.get("updated_reminder_name").toString()+"']/following::div[text()='"+RemindersDetails.get("reminder_type").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(Reminders, ""+RemindersDetails.get("reminder_type").toString()+" Updated Reminders in Reminders tab validation", "Y")) {assertTrue(false);}
		
	}
	public static void SearchRemindersinFeed(@SuppressWarnings("rawtypes") Dictionary RemindersDetails) throws InterruptedException {
		
		DoThis.click(NotificationPage.FeedTab.tbFeed, "Y");
		if(DoThis.isObjectAvailable(NotificationPage.FeedTab.pnlFleetAlerts, "Fleet Alerts Panel", "N")) {
			DoThis.click(NotificationPage.FeedTab.pnlFleetAlerts, "Y");
		}
		
		if(DoThis.isObjectAvailable(NotificationPage.FeedTab.objNoDataAvailable, "No data available", "N")){
			Reporter.ReportEventNoImage("No data is available!!");
		}else {
			//Wait for Alerts to load in Feed Tab
			DoThis.WaitForElementToLoad(NotificationPage.FeedTab.btnTableOptions);
			
			//Click More Filters
			DoThis.click(NotificationPage.FeedTab.btnMoreFilters, "Y");
			
			//Set Contact Type 
			DoThis.click(NotificationPage.FeedTab.drpdwnContactType, "Y");
			switch (RemindersDetails.get("reminders_notification").toString()) {
			
			case "Alerts":		
				DoThis.click(NotificationPage.FeedTab.drpdwnContactTypeOptionAlerts, "Y");
				break;
			
			case "Email":
				DoThis.click(NotificationPage.FeedTab.drpdwnContactTypeOptionEmail, "Y");
				break;
					
			case "SMS":
				DoThis.click(NotificationPage.FeedTab.drpdwnContactTypeOptionSMS, "Y");
				break;
				
			}
			
			//Set Alert Type to Reminders
			DoThis.click(NotificationPage.FeedTab.drpdwnAlertType, "Y");
			if(DoThis.isObjectAvailable(NotificationPage.FeedTab.drpdwnAlertTypeRemindersOption, RemindersDetails.get("reminder_type").toString(), "NA") ) {
				DoThis.click(NotificationPage.FeedTab.drpdwnAlertTypeRemindersOption, "Y");
				
				if(DoThis.isObjectAvailable(NotificationPage.FeedTab.objNoDataAvailable, "No Data Available validation", "NA")) {
					Reporter.ReportEventNoImage(RemindersDetails.get("reminder_type").toString()+" Reminder Type  is not yet triggered");
				}else {
					Reporter.ReportEventNoImage(RemindersDetails.get("reminder_type").toString()+" Reminder Type data is found in Feed tab");
				}
				
			}else {
				Reporter.ReportEventNoImage(RemindersDetails.get("reminder_type").toString()+" Reminder Type  is not yet triggered");
			}
		}	
	}
	
	public static void AddReminderTemplates(String browser, @SuppressWarnings("rawtypes") Dictionary TemplateRemindersDetails, String activesite) throws InterruptedException {
		
		//Navigate to Notification >> Reminders
		DoThis.click(NotificationPage.btnNotification, "Y");
		DoThis.click(NotificationPage.RemindersTab.tbReminders, "Y");
		
		//Click Add Reminders
		DoThis.click(NotificationPage.RemindersTab.btnAddReminders, "Y");
		
		//Click Add Reminder Templates
		DoThis.click(NotificationPage.RemindersTab.btnAddReminderTemplates, "Y");
		
		//Fill up all field in Reminder Templates
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxTemplateName, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxTemplateName, TemplateRemindersDetails.get("reminders_template_name").toString(), "Y");
		
		switch (TemplateRemindersDetails.get("reminders_template_type").toString()) {
		
		case "vehicle":
			DoThis.click(NotificationPage.RemindersTab.rdbtnVehicle, "Y");
			break;
			
		case "Driver":
			DoThis.click(NotificationPage.RemindersTab.rdbtnDriver, "Y");
			break;
		}
		
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxTemplateDefaultValidPeriodValue, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxTemplateDefaultValidPeriodValue, TemplateRemindersDetails.get("reminders_template_period_value").toString(), "Y");
		
		DoThis.click(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodType, "Y");
		
		switch (TemplateRemindersDetails.get("reminders_template_period_type").toString()) {
		
		case "Days":
			//For countries that does not English Name locator, add here
			switch(activesite) {
			case("PT"): 
			case("FR"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionDias);
				DoThis.click(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionDias, "Y");
				break;
			default:
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionDays);
				DoThis.click(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionDays, "Y");
				break;
			}
			break;
			
			
		case "Weeks":
			//For countries that does not English Name locator, add here
			switch(activesite) {
			case("PT"): 
			case("FR"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionSemanas);
				DoThis.click(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionSemanas, "Y");
				break;
			default:
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionWeeks);
				DoThis.click(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionWeeks, "Y");
				break;
			}
			break;
			
		case "Months":
			//For countries that does not English Name locator, add here
			switch(activesite) {
			case("PT"): 
			case("FR"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionMeses);
				DoThis.click(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionMeses, "Y");
				break;
			default:
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionMonths);
				DoThis.click(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionMonths, "Y");
				break;
			}
			break;
			
		case "Years":
			//For countries that does not English Name locator, add here
			switch(activesite) {
			case("PT"): 
			case("FR"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionAnos);
				DoThis.click(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionAnos, "Y");
				break;
			default:
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionYears);
				DoThis.click(NotificationPage.RemindersTab.drpdwnTemplateDefaultValidPeriodTypeOptionYears, "Y");
				break;
			}
			break;
			
		}
		
		//Click Save button
		DoThis.click(NotificationPage.RemindersTab.btnCreateRemindersTemplateSave, "Y");
		
		if(DoThis.isObjectAvailable(NotificationPage.RemindersTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Reminder template for item has been successfully added toaster message is displayed");
		}
		
	}
	
	public static void SearchRemindersTemplate(String browser, @SuppressWarnings("rawtypes") Dictionary TemplateRemindersDetails) throws InterruptedException {
		
		//Wait for Reminders Templates to load
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnDelete);
		
		//Search for Reminders Template
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxRemindersTemplateSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxRemindersTemplateSearch, TemplateRemindersDetails.get("reminders_template_name").toString(), "Y");
		
		WebElement RemindersTemplate = Constant.driver.findElement(By.xpath("//div[text()='"+TemplateRemindersDetails.get("reminders_template_name").toString()+"']/following::div[text()='"+TemplateRemindersDetails.get("reminders_template_type").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(RemindersTemplate, ""+TemplateRemindersDetails.get("reminders_template_type").toString()+" Reminders Template validation", "Y")) {assertTrue(false);}
		
	}
	
	public static void CreateRemindersUsingTemplate(String browser, @SuppressWarnings("rawtypes") Dictionary TemplateRemindersDetails, String activesite) throws InterruptedException {
		
		//Navigate to Notification >> Reminders
		DoThis.click(NotificationPage.btnNotification, "Y");
		DoThis.click(NotificationPage.RemindersTab.tbReminders, "Y");
		
		//Click Add Reminders
		DoThis.click(NotificationPage.RemindersTab.btnAddReminders, "Y");
		
		//Select Reminder Template
		DoThis.click(NotificationPage.RemindersTab.drpdwnTemplateName, "Y");
		DoThis.sendkeys(NotificationPage.RemindersTab.drpdwnTemplateName, TemplateRemindersDetails.get("reminders_template_name").toString(), "Y");
		
		WebElement ReminderTemplateOption = Constant.driver.findElement(By.xpath("//div[contains(@id,'item')][text()='"+TemplateRemindersDetails.get("reminders_template_name").toString()+"']"));
		DoThis.click(ReminderTemplateOption, "Y");
		
		//Wait for Element to load
		while(!DoThis.isObjectAvailable(NotificationPage.RemindersTab.drpdwnReminderType, "Reminder Type dropdown", "NA")) {
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.drpdwnReminderType);
		}
		
		//Select Reminder Type
		switch(TemplateRemindersDetails.get("reminder_type").toString()) {
		
		case "Time":
			DoThis.click(NotificationPage.RemindersTab.drpdwnReminderType, "Y");
			//For countries that does not English Name locator, add here
			switch(activesite) {
			case("PL"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionCzas);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionCzas, "Y");
				break;
			case("PT"): 
			case("FR"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionTempo);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionTempo, "Y");
				break;
			default:
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionTime);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionTime, "Y");
				break;
			}
			break;
			
		case "Distance":
			DoThis.click(NotificationPage.RemindersTab.drpdwnReminderType, "Y");
			//For countries that does not English Name locator, add here
			switch(activesite) {
			case("PL"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDystans);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDystans, "Y");
				break;
			case("PT"): 
			case("FR"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDistância);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDistância, "Y");
				break;
			default:
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDistance);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionDistance, "Y");
			break;
			}
			break;
			
		case "Clock":
			DoThis.click(NotificationPage.RemindersTab.drpdwnReminderType, "Y");
			//For countries that does not English Name locator, add here
			switch(activesite) {
			case("PL"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionZegar);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionZegar, "Y");
				break;
			case("PT"):
			case("FR"): 
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionHoras);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionHoras, "Y");
				break;
			default:
				DoThis.WaitForDataToLoad(NotificationPage.RemindersTab.drpdwnReminderTypeOptionWorktime);
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTypeOptionWorktime, "Y");
			break;
			}
			break;
		}
	
		//Select First Driver or Vehicle from the list
		switch(TemplateRemindersDetails.get("reminders_template_type").toString()) {
		
		case "vehicle":
			//Select first Vehicle
			DoThis.click(NotificationPage.RemindersTab.drpdwnVehicle, "Y");
			DoThis.click(NotificationPage.RemindersTab.drpdwnVehicleFirstOption, "Y");
			break;
		
		case "Driver":
			//Select first Driver
			DoThis.click(NotificationPage.RemindersTab.drpdwnDriver, "Y");
			DoThis.click(NotificationPage.RemindersTab.drpdwnDriverFirstOption, "Y");
			break;
			
		case "Multiple vehicles":
			//Select first 3 Vehicles
			for(int i=0; i<3; i++) {
				DoThis.click(NotificationPage.RemindersTab.drpdwnVehicle, "Y");
				DoThis.click(NotificationPage.RemindersTab.drpdwnVehicleOptions.get(i), "Y");
			}
			break;
		
		case "Multiple Drivers":
			//Select first 3 Drivers
			for(int i=0; i<3; i++) {
				DoThis.click(NotificationPage.RemindersTab.drpdwnDriver, "Y");
				DoThis.click(NotificationPage.RemindersTab.drpdwnDriverOptions.get(i), "Y");
			}
			break;
		
		}
		
		//Set Schedule Settings
		switch(TemplateRemindersDetails.get("reminder_type").toString()) {
		
		case "Time":				
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxNotifyInAdvance, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxNotifyInAdvance, TemplateRemindersDetails.get("notify_in_advance").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceType, "Y");
			switch(TemplateRemindersDetails.get("notify_in_advance_type").toString()) {
			
			case "Days":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDias, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDays, "Y");
					break;
				}
				break;
				
			case "Months":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMeses, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMonths, "Y");
					break;
				}
				break;
				
			case "Weeks":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"): 
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeSemanas, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeWeeks, "Y");
					break;
				}
				break;
				
			case "Years":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeAnos, "Y");
					break;
				default:
				DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeYears, "Y");
					break;
				}
				break;
			}		
			break;
			
		case "Distance":
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxNotifyInAdvance, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxNotifyInAdvance, TemplateRemindersDetails.get("notify_in_advance").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceType, "Y");
			switch(TemplateRemindersDetails.get("notify_in_advance_type").toString()) {
			
			case "Kilometers":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeKms, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeKilometers, "Y");
				break;
				}
				break;
				
			case "Thousand kms":
				//For countries that does not English Name locator, add here
				switch(activesite) {
				case("PT"): 
				case("FR"):
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMilKms, "Y");
				break;
				
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeThousandkms, "Y");
				break;
				}
				
			}
			
			break;
			
		case "Clock":
			DoThis.clear(browser, NotificationPage.RemindersTab.txtbxNotifyInAdvance, "N");
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxNotifyInAdvance, TemplateRemindersDetails.get("notify_in_advance").toString(), "Y");
			
			DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceType, "Y");
			switch(TemplateRemindersDetails.get("notify_in_advance_type").toString()) {
			
			case "Days of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDiasdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeDaysofoperation, "Y");
				break;
				}
				break;
				
			case "Months of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMesesdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeMonthsofoperation, "Y");
				break;
				}
				break;
				
			case "Hours of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeHorasdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeHoursofoperation, "Y");
				break;
				}
				break;
				
			case "Years of operation":
				//For countries that does not English Name locator, add here
				switch (activesite) {
				case "PT":
				case "FR":
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeAnosdeTrabalho, "Y");
				break;
					
				default:
					DoThis.click(NotificationPage.RemindersTab.txtbxNotifyInAdvanceTypeYearsofoperation, "Y");
				break;
				}
				break;
			}
			break;
		}
		
		switch(TemplateRemindersDetails.get("remiders_repeat").toString()) {
		
		case "Always":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnAlways, "Y");
			break;
			
		case "Once":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnOnce, "Y");
			break;
			
		case "Expiration date":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnExpirationDate, "Y");
			break;
		
		}
		
		switch(TemplateRemindersDetails.get("reminders_notification").toString()) {
		
		case "Email":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnEmail, "Y");
			
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.txtbxEmail);
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxEmail, TemplateRemindersDetails.get("email").toString(), "Y");
			
			//Click Add Option
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.objAddOption);
			DoThis.click(NotificationPage.RemindersTab.objAddOption, "Y");
			break;
			
		case "SMS":
			DoThis.click(NotificationPage.RemindersTab.rdnbtnSMS, "Y");
			
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.txtbxSMS);
			DoThis.sendkeys(NotificationPage.RemindersTab.txtbxSMS, TemplateRemindersDetails.get("sms").toString(), "Y");
			
			//Select SMS First Option
			DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.objSelectSMSOption.get(0));
			DoThis.click(NotificationPage.RemindersTab.objSelectSMSOption.get(0), "Y");
			break;
		}
		
		//Click Save button
		DoThis.click(NotificationPage.RemindersTab.btnSave, "Y");
		
		if(DoThis.isObjectAvailable(NotificationPage.RemindersTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Reminder has been successfully created toaster messsage is displayed");
		}
		
	}
	
	public static void SearchCreatedRemindersUsingTemplate(String browser, @SuppressWarnings("rawtypes") Dictionary TemplateRemindersDetails) throws InterruptedException {
		
		//Wait for Reminders to load in Reminders Tab
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnDelete);
		
		//Search for Reminders
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxSearch, TemplateRemindersDetails.get("reminders_template_name").toString(), "Y");
		
		WebElement Reminders = Constant.driver.findElement(By.xpath("//div[text()='"+TemplateRemindersDetails.get("reminders_template_name").toString()+"']/following::div[text()='"+TemplateRemindersDetails.get("reminder_type").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(Reminders, ""+TemplateRemindersDetails.get("reminder_type").toString()+" Reminders in Reminders tab validation", "Y")) {assertTrue(false);}
		
	}
	
	public static void DeleteReminders(String browser, @SuppressWarnings("rawtypes") Dictionary RemindersDetails) throws InterruptedException {
		
		//Wait for Reminders to load in Reminders Tab
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnDelete);
		
		//Search for Reminders
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxSearch, RemindersDetails.get("reminder_name").toString(), "Y");
		
		WebElement Reminders = Constant.driver.findElement(By.xpath("//div[text()='"+RemindersDetails.get("reminder_name").toString()+"']/following::div[text()='"+RemindersDetails.get("reminder_type").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(Reminders, ""+RemindersDetails.get("reminder_type").toString()+" Reminders in Reminders tab validation", "Y")) {assertTrue(false);}
		
		WebElement btnDeleteReminders = Constant.driver.findElement(By.xpath("//div[text()='"+RemindersDetails.get("reminder_name").toString()+"']/parent::div[@class='rt-tr -odd']/descendant::*[local-name()='svg'][contains(@class,'trash')]/parent::button[1]"));
		//Click Delete button
		DoThis.click(btnDeleteReminders, "Y");
		
		
		//Select and Edit Reminders
		DoThis.click(Reminders, "Y");
		
		//Click Yes, Confirm button
		DoThis.click(NotificationPage.RemindersTab.btnYesConfirm, "Y");
		
		if(DoThis.isObjectAvailable(NotificationPage.RemindersTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Reminder item has been successfully removed toaster message is displayed");
		}
		
	}
	
	public static void SearchDeletedReminders(String browser, @SuppressWarnings("rawtypes") Dictionary RemindersDetails) throws InterruptedException {
		
		//Navigate to Reminders tab
		DoThis.click(NotificationPage.RemindersTab.tbReminders, "Y");
		
		//Wait for Reminders to load in Reminders Tab
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnDelete);
		
		//Search for Reminders
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxSearch, RemindersDetails.get("updated_reminder_name").toString(), "Y");
		
		//Validate No data available is displayed, indicating Reminders was successfully deleted
		if(!DoThis.isObjectDisplayed(NotificationPage.RemindersTab.objNodataavailable, "No data available validation", "Y")) {assertTrue(false);}
	
	}
	
	public static void EditRemindersTemplate(String browser, @SuppressWarnings("rawtypes") Dictionary TemplateRemindersDetails, String activesite) throws InterruptedException {
		
		//Search Reminders Template
		Reminders.SearchRemindersTemplate(browser, TemplateRemindersDetails);
		
		//Click Edit button
		WebElement EditRemindersTemplate = Constant.driver.findElement(By.xpath("//div[text()='"+TemplateRemindersDetails.get("reminders_template_name").toString()+"']/parent::div[@class='rt-tr -odd']/descendant::*[local-name()='svg'][contains(@class,'pencil')]/parent::button[1]"));
		DoThis.click(EditRemindersTemplate, "Y");
		
		//Wait for the Reminder Template fields to displayed
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnCheck);
		
		//Reminder Template Name
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxReminderTemplateName, "Y");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxReminderTemplateName, TemplateRemindersDetails.get("reminders_template_name_updated").toString(), "Y");
		
		//Remainder Template Type
		DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplateType, "Y");
		switch(TemplateRemindersDetails.get("reminders_template_type_updated").toString()) {
		
		case "vehicle":
			DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplateTypeOptionVehicle, "Y");
			break;
			
		case "Driver":
			DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplateTypeOptionDriver, "Y");
			break;
		}
		
		//Reminder Template Period value
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxReminderTemplatePeriodValue, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxReminderTemplatePeriodValue, TemplateRemindersDetails.get("reminders_template_period_value_updated").toString(), "Y");
		
		//Reminder Template Period
		DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplatePeriod, "Y");
		switch(TemplateRemindersDetails.get("reminders_template_period_type_updated").toString()) {
		
		case "Days":
			//For countries that does not English Name locator, add here
			switch (activesite) {
			case "PT":
			case "FR":
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplatePeriodOptionDias, "Y");
			break;
				
			default:
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplatePeriodOptionDays, "Y");
			break;
			}
			break;
			
		case "Weeks":
			//For countries that does not English Name locator, add here
			switch (activesite) {
			case "PT":
			case "FR":
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplatePeriodOptionSemanas, "Y");
			break;
				
			default:
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplatePeriodOptionWeeks, "Y");
			break;
			}
			break;
			
		case "Months":
			//For countries that does not English Name locator, add here
			switch (activesite) {
			case "PT":
			case "FR":
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplatePeriodOptionMeses, "Y");
			break;
				
			default:
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplatePeriodOptionMonths, "Y");
			break;
			}
			break;
			
		case "Years":
			//For countries that does not English Name locator, add here
			switch (activesite) {
			case "PT":
			case "FR":
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplatePeriodOptionAnos, "Y");
			break;
				
			default:
				DoThis.click(NotificationPage.RemindersTab.drpdwnReminderTemplatePeriodOptionYears, "Y");
			break;
			}
			break;
		}
		
		//Click Check button
		DoThis.click(NotificationPage.RemindersTab.btnCheck, "Y");
		
		if(DoThis.isObjectAvailable(NotificationPage.RemindersTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Reminder template for item has been successfully updated toaster message is displayed");
		}
	}
	
	public static void SearchUpdatedRemindersTemplate(String browser, @SuppressWarnings("rawtypes") Dictionary TemplateRemindersDetails) throws InterruptedException {
		
		//Wait for Reminders Templates to load
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnDelete);
		
		//Search for Reminders Template
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxRemindersTemplateSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxRemindersTemplateSearch, TemplateRemindersDetails.get("reminders_template_name_updated").toString(), "Y");
		
		WebElement RemindersTemplate = Constant.driver.findElement(By.xpath("//div[text()='"+TemplateRemindersDetails.get("reminders_template_name_updated").toString()+"']/following::div[text()='"+TemplateRemindersDetails.get("reminders_template_type_updated").toString()+"']"));
		
		if(!DoThis.isObjectDisplayed(RemindersTemplate, ""+TemplateRemindersDetails.get("reminders_template_type_updated").toString()+" Updated Reminders Template validation", "Y")) {assertTrue(false);}
		
	}
	
	public static void DeleteRemindersTemplate(String browser, @SuppressWarnings("rawtypes") Dictionary TemplateRemindersDetails) throws InterruptedException {
		
		//Search Reminders Template
		Reminders.SearchRemindersTemplate(browser, TemplateRemindersDetails);
		
		//Click Delete button
		WebElement btnDeleteRemindersTemplate = Constant.driver.findElement(By.xpath("//div[text()='"+TemplateRemindersDetails.get("reminders_template_name").toString()+"']/parent::div[@class='rt-tr -odd']/descendant::*[local-name()='svg'][contains(@class,'trash')]/parent::button[1]"));
		DoThis.click(btnDeleteRemindersTemplate, "Y");
		
		//Click Yes, Confirm button
		DoThis.click(NotificationPage.RemindersTab.btnYesConfirm, "Y");
	
		if(DoThis.isObjectAvailable(NotificationPage.RemindersTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Reminder template for item has been successfully removed toaster message is displayed");
		}
	}
	
	public static void SearchDeletedRemindersTemplate(String browser, @SuppressWarnings("rawtypes") Dictionary TemplateRemindersDetails) throws InterruptedException {
		
		//Search for Reminders Template
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxRemindersTemplateSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxRemindersTemplateSearch, TemplateRemindersDetails.get("reminders_template_name").toString(), "Y");
		
		//Validate No data available is displayed, indicating Reminders Template was successfully deleted
		if(!DoThis.isObjectDisplayed(NotificationPage.RemindersTab.objNodataavailable, "No data available validation", "Y")) {assertTrue(false);}
	}
	
	public static void SearchAndDeleteReminderCreatedByAutomation(String browser, @SuppressWarnings("rawtypes") Dictionary RemindersDetails) throws InterruptedException {
		
		//Navigate to Notification >> Reminders Tab
		DoThis.click(NotificationPage.btnNotification, "Y");
		DoThis.click(NotificationPage.RemindersTab.tbReminders, "Y");
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.txtbxSearch);
		
		//Search for Reminders created by Automation
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxSearch, RemindersDetails.get("search_keyword").toString(), "Y");
		
		//Get Total Reminders
		String strTotalReminders = DoThis.getText(NotificationPage.RemindersTab.objTotalRemindersValue);
		int intTotalReminders=Integer.parseInt(strTotalReminders);  
		
		if(DoThis.isObjectAvailable(NotificationPage.RemindersTab.objNoDataAvailable, "No data available", "NA")) {
			Reporter.ReportEventNoImage("No Reminders is created by Automation");
		}else {
			//Delete All Reminders
			for(int i=0; i<intTotalReminders; i++) {
				DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnIconTrash);
				DoThis.click(NotificationPage.RemindersTab.btnIconTrash, "Y");
				DoThis.click(NotificationPage.RemindersTab.btnYesConfirm, "Y");
			
			}
		}
		
	}
	
	public static void SearchAndDeleteReminderTemplateCreatedByAutomation(String browser, @SuppressWarnings("rawtypes") Dictionary TemplateRemindersDetails) throws InterruptedException {
		
		//Navigate to Notification >> Reminders Tab
		DoThis.click(NotificationPage.btnNotification, "Y");
		DoThis.click(NotificationPage.RemindersTab.tbReminders, "Y");
		
		//Wait for element to load
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnAddReminders);
		
		//Click Add Reminders
		DoThis.click(NotificationPage.RemindersTab.btnAddReminders, "Y");
		
		//Wait for Reminders Templates to load
		DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnDelete);
		
		//Search for Reminders Template created by Automation
		DoThis.clear(browser, NotificationPage.RemindersTab.txtbxRemindersTemplateSearch, "N");
		DoThis.sendkeys(NotificationPage.RemindersTab.txtbxRemindersTemplateSearch, TemplateRemindersDetails.get("reminders_template_search_keyword").toString(), "Y");

		//Get Total Reminders Template
		String strTotalRemindersTemplate = DoThis.getText(NotificationPage.RemindersTab.objTotalRemindersTemplateValue);
		int intTotalRemindersTemplate=Integer.parseInt(strTotalRemindersTemplate);  
		
		if(DoThis.isObjectAvailable(NotificationPage.RemindersTab.objNoDataAvailable, "No data available", "NA")) {
			Reporter.ReportEventNoImage("No Reminders Template is created by Automation");
		}else {
			//Delete All Reminders
			for(int i=0; i<intTotalRemindersTemplate; i++) {
				DoThis.WaitForElementToLoad(NotificationPage.RemindersTab.btnIconTrash);
				DoThis.click(NotificationPage.RemindersTab.btnIconTrash, "Y");
				DoThis.click(NotificationPage.RemindersTab.btnYesConfirm, "Y");
			
			}
		}
		
	}
}
