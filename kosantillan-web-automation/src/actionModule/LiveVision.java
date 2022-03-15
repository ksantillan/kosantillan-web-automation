package actionModule;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Dictionary;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageObject.MapPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

public class LiveVision{	
	
	
	public static void ValidateLiveVisionContentViaList(String browser, @SuppressWarnings("rawtypes") Dictionary LiveVisionDetails, String activesite) throws InterruptedException {
		
		if(DoThis.isObjectNotDisplayed(MapPage.Fleettab.sdpnlCameraActivity, "Camera Activity Side Panel", "NA")) {
			Reporter.ReportEventNoImage("Live Vision functions for "+activesite+" is not available");
		}else {
			//Click Camera Activity side panel
			DoThis.click(MapPage.Fleettab.sdpnlCameraActivity, "Y");
			
			//Click Request Footage
			DoThis.click(MapPage.Fleettab.btnRequestFootage, "Y");
			
			//Validate Request Footage form content
			
			//Date Picker
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.dtpckrDatePickerRequestFootage, "Date Picker validation", "Y")) {assertTrue(false);}
			
			DoThis.click(MapPage.Fleettab.dtpckrDatePickerRequestFootage, "Y");
			
			//Get Tomorrow date in Thu Apr 08 2021 format
			WebElement Tomorrowdate = Constant.driver.findElement(By.xpath("//div[@aria-label='"+LiveVisionDetails.get("tomorrowdate").toString()+"']"));

			//Validate Future date is disabled
			if(DoThis.isAttributePresent(Tomorrowdate, "aria-disabled", "NA")) {
				Reporter.ReportEventNoImage("Future date "+Tomorrowdate.getAttribute("aria-label")+" date picker is disabled"); 
			}else {
				Reporter.ReportEventNoImage("Future date "+Tomorrowdate.getAttribute("aria-label")+" date picker is still enabled"); {assertTrue(false);}
			}
			
			//Select Yesterday Date
			DoThis.click(MapPage.Fleettab.dtpckrDatePickerRequestFootage, "Y");
			
			if(DoThis.isObjectAvailable(MapPage.Fleettab.objFirstDayofTheMonth, "First Day of the Month", "N")) {
				
				//Click Previous Month
				DoThis.click(MapPage.Fleettab.objPreviousMonth, "Y");
			}
			
			//Get Yesterday date in Thu Apr 08 2021 format
			WebElement Yesterdaydate = Constant.driver.findElement(By.xpath("//div[@aria-label='"+LiveVisionDetails.get("yesterdaydate").toString()+"']"));
			DoThis.click(Yesterdaydate, "Y");
			
			//Time Picker
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.tmpckrTimePickerRequestFootage, "Time Picker validation", "Y")) {assertTrue(false);}
			
			//Select Timing
			DoThis.click(MapPage.Fleettab.tmpckrTimePickerRequestFootage, "Y");
			
			//Hours
			WebElement HoursTiming = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-hours')][text()='"+LiveVisionDetails.get("hours").toString()+"']"));
			DoThis.click(HoursTiming, "Y");
			
			//Minutes
			WebElement MinutesTiming = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-minutes')][text()='"+LiveVisionDetails.get("minutes").toString()+"']"));
			DoThis.click(MinutesTiming, "Y");
			
			//Seconds
			WebElement SecondsTiming = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-seconds')][text()='"+LiveVisionDetails.get("seconds").toString()+"']"));
			DoThis.click(SecondsTiming, "Y");
			
			DoThis.click(MapPage.Fleettab.tmpckrTimePickerRequestFootage, "Y");
			
			//Pre-Recording
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.txtbxPreRecording, "Pre-Recording textbox validation", "Y")) {assertTrue(false);}
			
			//Post-Recording
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.txtbxPostRecording, "Post-Recording textbox validation", "Y")) {assertTrue(false);}
			
			//Enter zero in Pre-Recording field, and Error should not displayed
			DoThis.clear(browser, MapPage.Fleettab.txtbxPreRecording, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxPreRecording, "0", "Y");
			
			//Validate Error Messages are not displayed
			if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageMustbelessthanorequalto300s, "Error Message Must be less than or equal to 300s", "Y")) {assertTrue(false);}
			if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageSumcannotexceed300s, "Error Message Sum cannot exceed 300s", "Y")) {assertTrue(false);}

			//Enter zero in Post-Recording field, and Error should not displayed
			DoThis.clear(browser, MapPage.Fleettab.txtbxPostRecording, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxPostRecording, "0", "Y");
			
			//Validate Error Messages are not displayed
			if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageMustbelessthanorequalto300s, "Error Message Must be less than or equal to 300s", "Y")) {assertTrue(false);}
			if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageSumcannotexceed300s, "Error Message Sum cannot exceed 300s", "Y")) {assertTrue(false);}

			//Enter 300 in Pre-Recording field, and Error should not displayed
			DoThis.clear(browser, MapPage.Fleettab.txtbxPreRecording, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxPreRecording, "300", "Y");
			
			//Validate Error Messages are not displayed
			if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageMustbelessthanorequalto300s, "Error Message Must be less than or equal to 300s", "Y")) {assertTrue(false);}
			if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageSumcannotexceed300s, "Error Message Sum cannot exceed 300s", "Y")) {assertTrue(false);}

			//Enter 300 in Post-Recording field, and Error should not displayed
			DoThis.clear(browser, MapPage.Fleettab.txtbxPreRecording, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxPreRecording, "0", "Y");
			DoThis.clear(browser, MapPage.Fleettab.txtbxPostRecording, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxPostRecording, "300", "Y");
			
			//Validate Error Messages are not displayed
			if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageMustbelessthanorequalto300s, "Error Message Must be less than or equal to 300s", "Y")) {assertTrue(false);}
			if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageSumcannotexceed300s, "Error Message Sum cannot exceed 300s", "Y")) {assertTrue(false);}
			
			//Enter 301 in Post-Recording field, and Error should displayed
			DoThis.clear(browser, MapPage.Fleettab.txtbxPostRecording, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxPostRecording, "301", "Y");
			
			//Validate Error Messages are not displayed
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.objErrorMessageMustbelessthanorequalto300s, "Error Message Must be less than or equal to 300s", "Y")) {assertTrue(false);}
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.objErrorMessageSumcannotexceed300s, "Error Message Sum cannot exceed 300s", "Y")) {assertTrue(false);}
			
			//Enter 301 in Pre-Recording field, and Error should displayed
			DoThis.clear(browser, MapPage.Fleettab.txtbxPostRecording, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxPostRecording, "0", "Y");
			DoThis.clear(browser, MapPage.Fleettab.txtbxPreRecording, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxPreRecording, "301", "Y");
			
			//Validate Error Messages are not displayed
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.objErrorMessageMustbelessthanorequalto300s, "Error Message Must be less than or equal to 300s", "Y")) {assertTrue(false);}
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.objErrorMessageSumcannotexceed300s, "Error Message Sum cannot exceed 300s", "Y")) {assertTrue(false);}
			
			
			//Camera 1 to 4
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.chkbxCamera1, "Camera 1 checkbox validation", "Y")) {assertTrue(false);}
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.chkbxCamera2, "Camera 2 checkbox validation", "Y")) {assertTrue(false);}
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.chkbxCamera3, "Camera 3 checkbox validation", "Y")) {assertTrue(false);}
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.chkbxCamera4, "Camera 4 checkbox validation", "Y")) {assertTrue(false);}
			
			//Select Camera 2-4
			DoThis.click(MapPage.Fleettab.chkbxCamera2, "Y");
			DoThis.click(MapPage.Fleettab.chkbxCamera3, "Y");
			DoThis.click(MapPage.Fleettab.chkbxCamera4, "Y");
			
			//Comment textbox
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.txtbxComment, "Comment textbox validation", "Y")) {assertTrue(false);}
			
			//Validate maximum 100 character is allowed in Comment text box
			String MaxLength = DoThis.getAttribute(MapPage.Fleettab.txtbxComment, "maxlength");
			if(MaxLength.equals("100")) {
				Reporter.ReportEventNoImage("Comment Text box max length is "+MaxLength);
			}else {
				Reporter.ReportEventNoImage("Comment Text box max length is "+MaxLength); {assertTrue(false);}
			}
			//Submit button
			if(!DoThis.isObjectDisplayed(MapPage.Fleettab.btnSubmit, "Submit button validation", "Y")) {assertTrue(false);}
			
		}
		
	}
	public static void ValidateLiveVisionContentViaMap(String browser, @SuppressWarnings("rawtypes") Dictionary LiveVisionDetails, String activesite) throws IOException, Exception {
		
			//Select Vehicle with LiveVision Enabled
			SelectVehicle.Execute(browser, activesite);
		
			//Select vehicle with Live Vision is enabled
			if(DoThis.isObjectNotDisplayed(MapPage.Fleettab.btnLiveVisionEnable, "Live Vision Enable", "NA")) {
				Reporter.ReportEventNoImage("Live Vision functions for "+activesite+" is not available");
			}else{
				//Click Live Vision button
				DoThis.click(MapPage.Fleettab.btnLiveVisionEnable, "Y");
				
				//Click Request Footage
				DoThis.click(MapPage.Fleettab.btnRequestFootage, "Y");
				
				//Validate Request Footage form content
				
				//Date Picker
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.dtpckrDatePickerRequestFootage, "Date Picker validation", "Y")) {assertTrue(false);}
				
				DoThis.click(MapPage.Fleettab.dtpckrDatePickerRequestFootage, "Y");
				
				//Get Tomorrow date in Thu Apr 08 2021 format
				WebElement Tomorrowdate = Constant.driver.findElement(By.xpath("//div[@aria-label='"+LiveVisionDetails.get("tomorrowdate").toString()+"']"));

				//Validate Future date is disabled
				if(DoThis.isAttributePresent(Tomorrowdate, "aria-disabled", "NA")) {
					Reporter.ReportEventNoImage("Future date "+Tomorrowdate.getAttribute("aria-label")+" date picker is disabled"); 
				}else {
					Reporter.ReportEventNoImage("Future date "+Tomorrowdate.getAttribute("aria-label")+" date picker is still enabled"); {assertTrue(false);}
				}
				
				//Select Yesterday Date
				DoThis.click(MapPage.Fleettab.dtpckrDatePickerRequestFootage, "Y");
				
				//Get Yesterday date in Thu Apr 08 2021 format
				WebElement Yesterdaydate = Constant.driver.findElement(By.xpath("//div[@aria-label='"+LiveVisionDetails.get("yesterdaydate").toString()+"']"));
				DoThis.click(Yesterdaydate, "Y");
				
				//Time Picker
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.tmpckrTimePickerRequestFootage, "Time Picker validation", "Y")) {assertTrue(false);}
				
				//Select Timing
				DoThis.click(MapPage.Fleettab.tmpckrTimePickerRequestFootage, "Y");
				
				//Hours
				WebElement HoursTiming = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-hours')][text()='"+LiveVisionDetails.get("hours").toString()+"']"));
				DoThis.click(HoursTiming, "Y");
				
				//Minutes
				WebElement MinutesTiming = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-minutes')][text()='"+LiveVisionDetails.get("minutes").toString()+"']"));
				DoThis.click(MinutesTiming, "Y");
				
				//Seconds
				WebElement SecondsTiming = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-seconds')][text()='"+LiveVisionDetails.get("seconds").toString()+"']"));
				DoThis.click(SecondsTiming, "Y");
				
				DoThis.click(MapPage.Fleettab.tmpckrTimePickerRequestFootage, "Y");
				
				//Pre-Recording
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.txtbxPreRecording, "Pre-Recording textbox validation", "Y")) {assertTrue(false);}
				
				//Validate Post-Recording is disabled
				if(!DoThis.IsObjectDisabled("Post Recording text box", MapPage.Fleettab.txtbxPostRecording, "Y")) {assertTrue(false);}
				
				//Enter zero in Pre-Recording field, and Error should not displayed
				DoThis.clear(browser, MapPage.Fleettab.txtbxPreRecording, "N");
				DoThis.sendkeys(MapPage.Fleettab.txtbxPreRecording, "0", "Y");
				
				//Validate Error Messages are not displayed
				if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageMustbelessthanorequalto300s, "Error Message Must be less than or equal to 300s", "Y")) {assertTrue(false);}
				if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageSumcannotexceed300s, "Error Message Sum cannot exceed 300s", "Y")) {assertTrue(false);}
				
				//Enter 3000 in Pre-Recording field, and Error should not displayed
				DoThis.clear(browser, MapPage.Fleettab.txtbxPreRecording, "N");
				DoThis.sendkeys(MapPage.Fleettab.txtbxPreRecording, "300", "Y");
				
				//Validate Error Messages are not displayed
				if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageMustbelessthanorequalto300s, "Error Message Must be less than or equal to 300s", "Y")) {assertTrue(false);}
				if(!DoThis.isObjectNotDisplayed(MapPage.Fleettab.objErrorMessageSumcannotexceed300s, "Error Message Sum cannot exceed 300s", "Y")) {assertTrue(false);}
				
				//Enter 301 in Pre-Recording field, and Error should displayed
				DoThis.clear(browser, MapPage.Fleettab.txtbxPreRecording, "N");
				DoThis.sendkeys(MapPage.Fleettab.txtbxPreRecording, "301", "Y");
				
				DoThis.keyPress(Keys.ENTER);
				
				//Validate Error Messages are displayed
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.objErrorMessageMustbelessthanorequalto300s, "Error Message Must be less than or equal to 300s", "Y")) {assertTrue(false);}
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.objErrorMessageSumcannotexceed300s, "Error Message Sum cannot exceed 300s", "Y")) {assertTrue(false);}

				//Camera 1 to 4
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.chkbxCamera1, "Camera 1 checkbox validation", "Y")) {assertTrue(false);}
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.chkbxCamera2, "Camera 2 checkbox validation", "Y")) {assertTrue(false);}
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.chkbxCamera3, "Camera 3 checkbox validation", "Y")) {assertTrue(false);}
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.chkbxCamera4, "Camera 4 checkbox validation", "Y")) {assertTrue(false);}
				
				//Select Camera 2-4
				DoThis.click(MapPage.Fleettab.chkbxCamera2, "Y");
				DoThis.click(MapPage.Fleettab.chkbxCamera3, "Y");
				DoThis.click(MapPage.Fleettab.chkbxCamera4, "Y");
				
				//Comment textbox
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.txtbxComment, "Comment textbox validation", "Y")) {assertTrue(false);}
				
				//Validate maximum 100 character is allowed in Comment text box
				String MaxLength = DoThis.getAttribute(MapPage.Fleettab.txtbxComment, "maxlength");
				if(MaxLength.equals("100")) {
					Reporter.ReportEventNoImage("Comment Text box max length is "+MaxLength);
				}else {
					Reporter.ReportEventNoImage("Comment Text box max length is "+MaxLength); {assertTrue(false);}
				}
				//Submit button
				if(!DoThis.isObjectDisplayed(MapPage.Fleettab.btnSubmit, "Submit button validation", "Y")) {assertTrue(false);}
				
			}
		}
	public static void RequestAFootageViaMapAndValidateDownloadStatus(String browser, @SuppressWarnings("rawtypes") Dictionary LiveVisionDetails, String activesite) throws IOException, Exception {
				
		//Select Vehicle with LiveVision Enabled
		SelectVehicle.Execute(browser, activesite);
	
		//Select vehicle with Live Vision is enabled
		if(DoThis.isObjectNotDisplayed(MapPage.Fleettab.btnLiveVisionEnable, "Live Vision Enable", "NA")) {
			Reporter.ReportEventNoImage("Live Vision functions for "+activesite+" is not available");
		}else{
			//Click Live Vision button
			DoThis.click(MapPage.Fleettab.btnLiveVisionEnable, "Y");
			
			//Click Request Footage
			DoThis.click(MapPage.Fleettab.btnRequestFootage, "Y");
			
			//Enter in Pre-Recording field, and Error should not displayed
			DoThis.clear(browser, MapPage.Fleettab.txtbxPreRecording, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxPreRecording, LiveVisionDetails.get("pre-recording").toString(), "Y");
			
			//Comment
			DoThis.clear(browser, MapPage.Fleettab.txtbxComment, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxComment, LiveVisionDetails.get("comment").toString(), "Y");
			
			//Click Submit
			DoThis.click(MapPage.Fleettab.btnSubmit, "Y");
			
			if(DoThis.isObjectAvailable(MapPage.Fleettab.objToaster, "Toaster message", "NA")) {
				DoThis.isContainingText(MapPage.Fleettab.objToaster, "Video requested successfully", "Toaster message", "Y");
				
			//Validate Download Status
			LiveVision.ValidateDownloadStatus(browser, LiveVisionDetails, activesite);
				
			}
			
		}
		
	}
	public static void ValidateDownloadStatus(String browser, @SuppressWarnings("rawtypes") Dictionary LiveVisionDetails, String activesite) throws IOException, Exception {
		
		//Close Right Info Right Panel
		DoThis.click(MapPage.Fleettab.btnCloseInfoRightPanel, "Y");
		
		//Select vehicle
		SelectVehicle.Execute(browser, activesite);
			
		//View Vehicle Details
		Vehicles.ViewVehicleDetails();
		
		DoThis.click(MapPage.Fleettab.sdpnlCameraActivity, "Y");
		
		//Search Downloaded Footage via Comment
		DoThis.clear(browser, MapPage.Fleettab.txtbxCameraActivitySearch, "N");
		DoThis.sendkeys(MapPage.Fleettab.txtbxCameraActivitySearch, LiveVisionDetails.get("comment").toString(), "Y");
		
		//Validate Camera 1 status is In Progress
		WebElement DownloadFootage = Constant.driver.findElement(By.xpath("//div[text()='"+LiveVisionDetails.get("comment").toString()+"']/following::div[1]"));
		DoThis.isContainingText(DownloadFootage, "In progress", "Camera 1 download status", "Y");
		
	}
}
