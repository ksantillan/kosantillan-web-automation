package actionModule;

import static org.testng.Assert.assertTrue;

import java.util.Dictionary;
import pageObject.NotificationPage;
import utility.DoThis;
import utility.Reporter;

public class SMS{	
	
	
public static void EditLimit(@SuppressWarnings("rawtypes") Dictionary SMSDetails) throws InterruptedException {
		
		//Navigate to Notification >> SMS
		DoThis.click(NotificationPage.btnNotification, "Y");
		DoThis.click(NotificationPage.SMSTab.tbMessageCredits, "Y");
		
		//Click Edit Limits button
		DoThis.click(NotificationPage.SMSTab.btnEditLimits, "Y");
		
		switch(SMSDetails.get("limit_type").toString()) {
		
		case "Total":
		
			if(DoThis.getCheckedStatus(NotificationPage.SMSTab.objSetIndividually).contains("true")){
				DoThis.click(NotificationPage.SMSTab.chkbxSetIndividually, "Y");
			}
			
			DoThis.Wait(NotificationPage.SMSTab.txtbxTotalLimit);
			if(!DoThis.isObjectDisplayed(NotificationPage.SMSTab.txtbxTotalLimit, "Total Limit validation", "Y")) {assertTrue(false);}
			
			break;
			
		case "Individual":
			
			if(!DoThis.getCheckedStatus(NotificationPage.SMSTab.objSetIndividually).contains("true")){
				DoThis.click(NotificationPage.SMSTab.chkbxSetIndividually, "Y");
			}
			
			DoThis.Wait(NotificationPage.SMSTab.txtbxLimitFirstVehicle);
			if(!DoThis.isObjectDisplayed(NotificationPage.SMSTab.txtbxLimitFirstVehicle, "Individual Limit validation", "Y")) {assertTrue(false);}
			
			break;
		}
		
	}

	public static void SetLimit(String browser, @SuppressWarnings("rawtypes") Dictionary SMSDetails) throws InterruptedException {
		
		//Navigate to Notification >> SMS
		DoThis.click(NotificationPage.btnNotification, "Y");
		DoThis.click(NotificationPage.SMSTab.tbMessageCredits, "Y");
		
		//Click Edit Limits button
		DoThis.click(NotificationPage.SMSTab.btnEditLimits, "Y");
		
		switch(SMSDetails.get("limit_type").toString()) {
		
		case "Total":
		
			if(DoThis.getCheckedStatus(NotificationPage.SMSTab.objSetIndividually).contains("true")){
				DoThis.click(NotificationPage.SMSTab.chkbxSetIndividually, "Y");
			}
			DoThis.Wait(NotificationPage.SMSTab.txtbxTotalLimit);
			DoThis.clear(browser, NotificationPage.SMSTab.txtbxTotalLimit, "N");
			DoThis.sendkeys(NotificationPage.SMSTab.txtbxTotalLimit, SMSDetails.get("total_limit").toString(), "Y");
			break;
			
		case "Individual":
			
			if(!DoThis.getCheckedStatus(NotificationPage.SMSTab.objSetIndividually).contains("true")){
				DoThis.click(NotificationPage.SMSTab.chkbxSetIndividually, "Y");
			}
			
			DoThis.Wait(NotificationPage.SMSTab.txtbxLimitFirstVehicle);
			DoThis.clear(browser, NotificationPage.SMSTab.txtbxLimitFirstVehicle, "N");
			DoThis.sendkeys(NotificationPage.SMSTab.txtbxLimitFirstVehicle, SMSDetails.get("individual_limit").toString(), "Y");
			
			break;
		}
		
	}
	public static void SelectSMSBundle(@SuppressWarnings("rawtypes") Dictionary SMSDetails, String activesite) throws InterruptedException {
		
		//Click Buy More button
		DoThis.click(NotificationPage.SMSTab.btnBuyMore, "Y");
		
		//Select a SMS Bundle
		switch (SMSDetails.get("sms_bundle").toString()) {
		
			case "300 SMS":
				switch (activesite) {
				case "ME":
					DoThis.click(NotificationPage.SMSTab.btnSelect3000SMS, "Y");
				break;
				case "KE":
					DoThis.click(NotificationPage.SMSTab.btnSelect2000SMS, "Y");
				break;
				case "MW":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.btnSelect1000SMS, "Y");
				break;
				case "NZ":
				case "AU":
				case "NA":
				case "TZ":
					DoThis.click(NotificationPage.SMSTab.btnSelect100SMS, "Y");
				break;
				case "ES":
					DoThis.click(NotificationPage.SMSTab.btnSelect600SMS, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.btnSelect5SMS, "Y");
				break;
				case "RW":
					DoThis.click(NotificationPage.SMSTab.btnSelect500SMS, "Y");
				break;
				case "ZW":
					DoThis.click(NotificationPage.SMSTab.btnSelect250SMS, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.btnSelect300SMS, "Y");
				break;
				}
				break;
				
			case "100 SMS":
				switch (activesite) {
				case "ME":
					DoThis.click(NotificationPage.SMSTab.btnSelect1500SMS, "Y");
				break;
				case "KE":
				case "MW":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.btnSelect1000SMS, "Y");
				break;
				case "ES":
					DoThis.click(NotificationPage.SMSTab.btnSelect600SMS, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.btnSelect5SMS, "Y");
				break;
				case "RW":
					DoThis.click(NotificationPage.SMSTab.btnSelect200SMS, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.btnSelect100SMS, "Y");
				break;
				}
				break;
				
			case "10 SMS":
				switch (activesite) {
				case "MW":
					DoThis.click(NotificationPage.SMSTab.btnSelect1000SMS, "Y");
				break;
				case "ME":
				case "KE":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.btnSelect500SMS, "Y");
				break;
				case "NZ":
				case "AU":
				case "RW":
					DoThis.click(NotificationPage.SMSTab.btnSelect100SMS, "Y");
				break;
				case "NA":
				case "ZW":
					DoThis.click(NotificationPage.SMSTab.btnSelect50SMS, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.btnSelect5SMS, "Y");
				break;
				case "TZ":
					DoThis.click(NotificationPage.SMSTab.btnSelect20SMS, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.btnSelect10SMS, "Y");
				break;
				}
				break;
		}
	}
	public static void SelectSMSCount(@SuppressWarnings("rawtypes") Dictionary SMSDetails, String activesite) throws InterruptedException {
		
		//Select SMS Count
		DoThis.click(NotificationPage.SMSTab.drpdwnSMSCount, "Y");
		switch (SMSDetails.get("sms_count").toString()) {
		
			case "300":
				switch (activesite) {
				case "ME":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption3000, "Y");
				break;
				case "KE":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption2000, "Y");
				break;
				case "MW":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption1000, "Y");
				break;
				case "NZ":
				case "AU":
				case "NA":
				case "TZ":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption100, "Y");
				break;
				case "ES":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption600, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption5, "Y");
				break;
				case "RW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption500, "Y");
				break;
				case "ZW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption250, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption300, "Y");
				break;
				}
				break;
				
			case "100":
				switch (activesite) {
				case "ME":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption1500, "Y");
				break;
				case "KE":
				case "MW":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption1000, "Y");
				break;
				case "ES":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption600, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption5, "Y");
				break;
				case "RW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption200, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption100, "Y");
				break;
				}
				break;
				
			case "10":
				switch (activesite) {
				case "MW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption1000, "Y");
				break;
				case "ME":
				case "KE":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption500, "Y");
				break;
				case "NZ":
				case "AU":
				case "RW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption100, "Y");
				break;
				case "NA":
				case "ZW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption50, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption5, "Y");
				break;
				case "TZ":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption20, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption10, "Y");
				break;
				}
				break;
			}
	}
	
	public static void BuySMSBundle(@SuppressWarnings("rawtypes") Dictionary SMSDetails, String activesite) throws InterruptedException {
		
		//Click Buy More button
		DoThis.click(NotificationPage.SMSTab.btnBuyMore, "Y");
		
		//Select a SMS Bundle
		switch (SMSDetails.get("sms_bundle").toString()) {
			
			case "300 SMS":
				switch (activesite) {
				case "ME":
					DoThis.click(NotificationPage.SMSTab.btnSelect3000SMS, "Y");
				break;
				case "KE":
					DoThis.click(NotificationPage.SMSTab.btnSelect2000SMS, "Y");
				break;
				case "MW":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.btnSelect1000SMS, "Y");
				break;
				case "NZ":
				case "AU":
				case "NA":
				case "TZ":
					DoThis.click(NotificationPage.SMSTab.btnSelect100SMS, "Y");
				break;
				case "ES":
					DoThis.click(NotificationPage.SMSTab.btnSelect600SMS, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.btnSelect5SMS, "Y");
				break;
				case "RW":
					DoThis.click(NotificationPage.SMSTab.btnSelect500SMS, "Y");
				break;
				case "ZW":
					DoThis.click(NotificationPage.SMSTab.btnSelect250SMS, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.btnSelect300SMS, "Y");
				break;
				}
				break;
				
			case "100 SMS":
				switch (activesite) {
				case "ME":
					DoThis.click(NotificationPage.SMSTab.btnSelect1500SMS, "Y");
				break;
				case "KE":
				case "MW":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.btnSelect1000SMS, "Y");
				break;
				case "ES":
					DoThis.click(NotificationPage.SMSTab.btnSelect600SMS, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.btnSelect5SMS, "Y");
				break;
				case "RW":
					DoThis.click(NotificationPage.SMSTab.btnSelect200SMS, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.btnSelect100SMS, "Y");
				break;
				}
				break;
				
			case "10 SMS":
				switch (activesite) {
				case "MW":
					DoThis.click(NotificationPage.SMSTab.btnSelect1000SMS, "Y");
				break;
				case "ME":
				case "KE":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.btnSelect500SMS, "Y");
				break;
				case "NZ":
				case "AU":
				case "RW":
					DoThis.click(NotificationPage.SMSTab.btnSelect100SMS, "Y");
				break;
				case "NA":
				case "ZW":
					DoThis.click(NotificationPage.SMSTab.btnSelect50SMS, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.btnSelect5SMS, "Y");
				break;
				case "TZ":
					DoThis.click(NotificationPage.SMSTab.btnSelect20SMS, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.btnSelect10SMS, "Y");
				break;
				}
				break;
		
			}
		//Select SMS Count
		DoThis.click(NotificationPage.SMSTab.drpdwnSMSCount, "Y");
		switch (SMSDetails.get("sms_count").toString()) {
		
			case "300":
				switch (activesite) {
				case "ME":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption3000, "Y");
				break;
				case "KE":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption2000, "Y");
				break;
				case "MW":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption1000, "Y");
				break;
				case "NZ":
				case "AU":
				case "NA":
				case "TZ":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption100, "Y");
				break;
				case "ES":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption600, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption5, "Y");
				break;
				case "RW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption500, "Y");
				break;
				case "ZW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption250, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption300, "Y");
				break;
				}
				break;
				
			case "100":
				switch (activesite) {
				case "ME":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption1500, "Y");
				break;
				case "KE":
				case "MW":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption1000, "Y");
				break;
				case "ES":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption600, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption5, "Y");
				break;
				case "RW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption200, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption100, "Y");
				break;
				}
				break;
				
			case "10":
				switch (activesite) {
				case "MW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption1000, "Y");
				break;
				case "ME":
				case "KE":
				case "MZ":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption500, "Y");
				break;
				case "NZ":
				case "AU":
				case "RW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption100, "Y");
				break;
				case "NA":
				case "ZW":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption50, "Y");
				break;
				case "NG":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption5, "Y");
				break;
				case "TZ":
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption20, "Y");
				break;
				default:
					DoThis.click(NotificationPage.SMSTab.drpdwnSMSCountOption10, "Y");
				break;
				}
				break;
		
			}
		
		//Click Submit button
		DoThis.click(NotificationPage.SMSTab.btnBuyMoreSMSSubmit, "Y");
		
		//Wait for toaster message to load
		
		if(DoThis.isObjectAvailable(NotificationPage.SMSTab.objToaster, "Toaster message", "N")) {
			Reporter.ReportEventNoImage("Bundle successfully purchased toaster message is displayed");
		}
	}
	
}
