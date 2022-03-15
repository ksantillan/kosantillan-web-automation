package actionModule;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Dictionary;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.ReportsPage;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class Reports{	
	
	public static void SelectFirstFavoriteReport() throws IOException, Exception{

	
			DoThis.WaitForElementToLoad(ReportsPage.FavoritesTab.btnCogWheels);
			DoThis.click(ReportsPage.FavoritesTab.objFavoriteReports.get(0), "Y");

	}
	
	public static void SelectFavoriteReportWithDetails(@SuppressWarnings("rawtypes") Dictionary ReportDetails) throws IOException, Exception{

		WebElement ReportName = Constant.driver.findElement(By.xpath("//*[contains(@class,'rt-tr-group')]/descendant::*[contains(text(),'"+ReportDetails.get("report_name").toString()+"')]"));
		DoThis.click(ReportName, "Y");

	}
	
	public static String GetReportName() throws IOException, Exception{

		String ReportName = DoThis.getText(ReportsPage.SetupTab.objReportName);
		return ReportName;

	}
	
	public static void WithDetails(String browser, @SuppressWarnings("rawtypes") Dictionary ReportDetails, String activesite) throws IOException, Exception{

		//Set Quick Select
		DoThis.click(ReportsPage.SetupTab.drpdwnQuickSelect, "Y");
		switch (ReportDetails.get("quick_select").toString()) {
		
		case "Custom":
			DoThis.click(ReportsPage.SetupTab.drpdwnQuickSelectOptionCustom, "Y");
			break;
			
		case "Yesterday":
			DoThis.click(ReportsPage.SetupTab.drpdwnQuickSelectOptionYesterday, "Y");
			break;
			
		case "Last 7":
			DoThis.click(ReportsPage.SetupTab.drpdwnQuickSelectOptionLast7, "Y");
			break;
			
		case "Last 30":
			DoThis.click(ReportsPage.SetupTab.drpdwnQuickSelectOptionLast30, "Y");
			break;
			
		case "Last 90":
			DoThis.click(ReportsPage.SetupTab.drpdwnQuickSelectOptionLast90, "Y");
			break;
			
		}

		WebElement StartOfWokHours = null;
		List<WebElement> EndOfWokHours = null;
		//For countries that does not English Name locator, add here
		switch(activesite) {
		case("PL"): 
		//Set Start and End Of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxGodzinarozpo, "Y");
		StartOfWokHours = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-hours-"+ReportDetails.get("start_of_work_hours").toString()+"')]"));
		DoThis.click(StartOfWokHours, "Y");
	
		//Set Start of Work Minutes
		WebElement StartOfWokMinutes = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("start_of_work_minutes").toString()+"')]"));
		DoThis.click(StartOfWokMinutes, "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxGodzinarozpo, "Y");
		
		//Set End of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxGodzinazako, "Y");
		EndOfWokHours = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-hours-"+ReportDetails.get("end_of_work_hours").toString()+"')]"));
		DoThis.click(EndOfWokHours.get(1), "Y");
	
		//Set End of Work Minutes
		List<WebElement> EndOfWokMinutes = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("end_of_work_minutes").toString()+"')]"));
		DoThis.click(EndOfWokMinutes.get(1), "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxGodzinazako, "Y");
		break;

		case("PT"):  
		//Set Start and End Of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxComeceaTrabalharHoras, "Y");
		StartOfWokHours = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-hours-01')]"));
		DoThis.click(StartOfWokHours, "Y");
	
		//Set Start of Work Minutes
		StartOfWokMinutes = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("start_of_work_minutes").toString()+"')]"));
		DoThis.click(StartOfWokMinutes, "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxComeceaTrabalharHoras, "Y");
		
		//Set End of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxFimHorasdeTrabalho, "Y");
		EndOfWokHours = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-hours-12')]"));
		DoThis.click(EndOfWokHours.get(1), "Y");
	
		//Set End of Work Minutes
		EndOfWokMinutes = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("end_of_work_minutes").toString()+"')]"));
		DoThis.click(EndOfWokMinutes.get(1), "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxFimHorasdeTrabalho, "Y");
		break;
		
		case("ES"):	
		//Set Start and End Of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxIniciodehorasdetrabajo, "Y");
		StartOfWokHours = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-hours-"+ReportDetails.get("start_of_work_hours").toString()+"')]"));
		DoThis.click(StartOfWokHours, "Y");
	
		//Set Start of Work Minutes
		StartOfWokMinutes = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("start_of_work_minutes").toString()+"')]"));
		DoThis.click(StartOfWokMinutes, "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxIniciodehorasdetrabajo, "Y");
		
		//Set End of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxFindehorasdetrabajo, "Y");
		EndOfWokHours = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-hours-"+ReportDetails.get("end_of_work_hours").toString()+"')]"));
		DoThis.click(EndOfWokHours.get(1), "Y");
	
		//Set End of Work Minutes
		EndOfWokMinutes = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("end_of_work_minutes").toString()+"')]"));
		DoThis.click(EndOfWokMinutes.get(1), "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxFindehorasdetrabajo, "Y");
		break;
		
		case("FR"):	
		//Set Start and End Of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxHeurededébutduravail, "Y");
		StartOfWokHours = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-hours-"+ReportDetails.get("start_of_work_hours").toString()+"')]"));
		DoThis.click(StartOfWokHours, "Y");
	
		//Set Start of Work Minutes
		StartOfWokMinutes = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("start_of_work_minutes").toString()+"')]"));
		DoThis.click(StartOfWokMinutes, "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxHeurededébutduravail, "Y");
		
		//Set End of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxHeuredefindetravail, "Y");
		EndOfWokHours = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-hours-"+ReportDetails.get("end_of_work_hours").toString()+"')]"));
		DoThis.click(EndOfWokHours.get(1), "Y");
	
		//Set End of Work Minutes
		EndOfWokMinutes = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("end_of_work_minutes").toString()+"')]"));
		DoThis.click(EndOfWokMinutes.get(1), "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxHeuredefindetravail, "Y");
		break;
		
		case("MZ"):	
		//Set Start and End Of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxHorasdetrabalhoIn, "Y");
		StartOfWokHours = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-hours-"+ReportDetails.get("start_of_work_hours").toString()+"')]"));
		DoThis.click(StartOfWokHours, "Y");
	
		//Set Start of Work Minutes
		StartOfWokMinutes = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("start_of_work_minutes").toString()+"')]"));
		DoThis.click(StartOfWokMinutes, "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxHorasdetrabalhoIn, "Y");
		
		//Set End of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxHorasdetrabalhoFim, "Y");
		EndOfWokHours = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-hours-"+ReportDetails.get("end_of_work_hours").toString()+"')]"));
		DoThis.click(EndOfWokHours.get(1), "Y");
	
		//Set End of Work Minutes
		EndOfWokMinutes = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("end_of_work_minutes").toString()+"')]"));
		DoThis.click(EndOfWokMinutes.get(1), "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxHorasdetrabalhoFim, "Y");
		break;
		
		//Temporary fix for FTW-857. Will remove once fixed
		case "US":
			
		//Set Start and End Of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxStartofWorkHours, "Y");
		StartOfWokHours = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-hours-01')]"));
		DoThis.click(StartOfWokHours, "Y");
	
		//Set Start of Work Minutes
		StartOfWokMinutes = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-minutes-01')]"));
		DoThis.click(StartOfWokMinutes, "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxStartofWorkHours, "Y");
		
		//Set End of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxEndofWorkHours, "Y");
		EndOfWokHours = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-hours-12')]"));
		DoThis.click(EndOfWokHours.get(1), "Y");
	
		//Set End of Work Minutes
		EndOfWokMinutes = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-minutes-59')]"));
		DoThis.click(EndOfWokMinutes.get(1), "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxEndofWorkHours, "Y");
		break;
		
		default:
		//Set Start and End Of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxStartofWorkHours, "Y");
		StartOfWokHours = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-hours-"+ReportDetails.get("start_of_work_hours").toString()+"')]"));
		DoThis.click(StartOfWokHours, "Y");
	
		//Set Start of Work Minutes
		StartOfWokMinutes = Constant.driver.findElement(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("start_of_work_minutes").toString()+"')]"));
		DoThis.click(StartOfWokMinutes, "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxStartofWorkHours, "Y");
		
		//Set End of Work Hours
		DoThis.click(ReportsPage.SetupTab.txtbxEndofWorkHours, "Y");
		EndOfWokHours = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-hours-"+ReportDetails.get("end_of_work_hours").toString()+"')]"));
		DoThis.click(EndOfWokHours.get(1), "Y");
	
		//Set End of Work Minutes
		EndOfWokMinutes = Constant.driver.findElements(By.xpath("//div[contains(@id,'scrollable-minutes-"+ReportDetails.get("end_of_work_minutes").toString()+"')]"));
		DoThis.click(EndOfWokMinutes.get(1), "Y");
		
		DoThis.click(ReportsPage.SetupTab.txtbxEndofWorkHours, "Y");
		break;
		}
		
		//Set Email Address
		DoThis.clear(browser, ReportsPage.SetupTab.txtbxEmailAddress, "N");
		DoThis.sendkeys(ReportsPage.SetupTab.txtbxEmailAddress, ReportDetails.get("email_address").toString(), "Y");
		
		//Set Document Format
		DoThis.click(ReportsPage.SetupTab.drpdwnDocumentFormat, "Y");
		switch(ReportDetails.get("report_document_format").toString()) {
		
		case "pdf":
			DoThis.click(ReportsPage.SetupTab.drpdwnDocumentFormatOptionPDF, "Y");
			break;
			
		case "xls":
			if(!DoThis.isObjectAvailable(ReportsPage.SetupTab.drpdwnDocumentFormatOptionExcelXLS, "Microsoft Excel XLS", "NA")) {
				DoThis.click(ReportsPage.SetupTab.drpdwnDocumentFormatOptionExcel, "Y");
			}else {
				DoThis.click(ReportsPage.SetupTab.drpdwnDocumentFormatOptionExcelXLS, "Y");
			}
			break;
		
		case "csv":
			DoThis.click(ReportsPage.SetupTab.drpdwnDocumentFormatOptionExcelCSV, "Y");
			break;
			
		}
		
		if(ReportDetails.get("password_protected").toString()=="true") {
			DoThis.click(ReportsPage.SetupTab.chckbxPasswordProtected, "Y");
			
			DoThis.WaitForElementToLoad(ReportsPage.SetupTab.txtbxPassword);
			
			//Input Password
			DoThis.clear(browser, ReportsPage.SetupTab.txtbxPassword, "N");
			DoThis.sendkeys(ReportsPage.SetupTab.txtbxPassword, ReportDetails.get("password").toString(), "Y");
		}
		
		switch(ReportDetails.get("report_type").toString()) {
			
		case "download":
			
			if(!DoThis.isObjectAvailable(ReportsPage.SetupTab.btnDownloadReport, "Download button", "NA")) {
				Reporter.ReportEventNoImage("Download Report functions for "+activesite+" is not available");
			}else {
				//Download Report
				ConfigReader config = new ConfigReader();
				if(config.getPlatform().equals("linux")) {
		      		// Just validate Download button is displayed as there is an known issue in download when run in TeamCity
					DoThis.isObjectDisplayed(ReportsPage.SetupTab.btnDownloadReport, "Download button validation", "Y");
		      	  }else{
		      		DoThis.click(ReportsPage.SetupTab.btnDownloadReport, "Y");
					
					//Wait for the Download to be completed, indication Download is completed
					DoThis.WaitForDataToLoad(ReportsPage.SetupTab.btnDownloadReport);
		      	  }
			}
			
			break;
			
		case "email":
			
			//Click Submit button to email
			//Add Poll wait
			DoThis.WaitForElementToLoad(ReportsPage.SetupTab.btnSubmit);
			DoThis.click(ReportsPage.SetupTab.btnSubmit, "Y");
			break;
			
		case "schedule":
			
			//Check Schedule checkbox
			DoThis.click(ReportsPage.SetupTab.chkbxSchedule, "Y");
			
			//Set Schedule Every text field
			DoThis.WaitForElementToLoad(ReportsPage.SetupTab.txtbxEvery);
			DoThis.cleardropdownfield(ReportsPage.SetupTab.txtbxEvery, "N" );
			DoThis.sendkeys(ReportsPage.SetupTab.txtbxEvery, ReportDetails.get("schedule_every").toString(), "Y");
			
			//Set Repeat Interval Schedule
			switch(ReportDetails.get("schedule_repeat_interval").toString()) {
				
			case "Day(s)":
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatIntervalOptionDays, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "Y");
				break;
				
			case "Month(s)":
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatIntervalOptionMonths, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "Y");
				break;
				
			case "Week Day":
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatIntervalOptionWeekDay, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "Y");
				break;
				
			case "Week(s)":
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatIntervalOptionWeeks, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "Y");
				break;
				
			case "Weekend (Only Sunday)":
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatIntervalOptionWeekendOnlySunday, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "Y");
				break;
				
			case "Weekend(s)":
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatIntervalOptionWeekends, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "Y");
				break;
				
			default: //if not selected it will select the first option
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatIntervalOptionDays, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnRepeatInterval, "Y");
					
			
			}
			//Set Report Duration Schedule
			switch(ReportDetails.get("schedule_report_duration").toString()) {
				
			case "To Date":
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDuration, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDurationOptionToDate, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDuration, "Y");
				break;
				
			case "1 Month":
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDuration, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDurationOption1Month, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDuration, "Y");
				break;
				
			case "1 Week":
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDuration, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDurationOption1Week, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDuration, "Y");
				break;
				
			case "Selected":
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDuration, "N");
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDurationOptionSelected, "Y");
				DoThis.click(ReportsPage.SetupTab.drpdwnReportDuration, "Y");
				break;
			
			}
			//Click Submit button to email
			//Add Poll wait
			DoThis.WaitForElementToLoad(ReportsPage.SetupTab.btnSubmit);
			DoThis.click(ReportsPage.SetupTab.btnSubmit, "Y");
			break;
		
		}
		
		
		
	}
	
	public static void CustomizeReport(String browser, @SuppressWarnings("rawtypes") Dictionary ReportDetails, String activesite) throws IOException, Exception {
		
		//Click Report
		DoThis.click(ReportsPage.tbReport, "Y");
		
		switch (activesite) {
		
		//Add Countries that does not have Customize Report function
		case "MY":
			Reporter.ReportEventNoImage("Customize Report function not available for "+activesite);
		break;
		
		default:
			if(!DoThis.isObjectAvailable(ReportsPage.CutomiseTab.tbCustomise, "Customise Tab", "NA")) {
				DoThis.click(ReportsPage.CutomiseTab.tbCustomize, "Y");
			}else {
				DoThis.click(ReportsPage.CutomiseTab.tbCustomise, "Y");
			}
			DoThis.WaitForElementToLoad(ReportsPage.CutomiseTab.drpdwnFilterByCategory);
			DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategory, "Y");
			
			switch (ReportDetails.get("customise_filter_category").toString()) {
				
			case "Positions":
				//Select Positions in Filter by Category
				switch(activesite) {
				case "US":
					DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionCustom, "Y");
				break;
				
				case "ZW":
					DoThis.sendkeys(ReportsPage.CutomiseTab.txtbxFilterByCategory, ReportDetails.get("customise_filter_category").toString(), "Y");
					
					//Wait for data to load
					DoThis.WaitForDataToLoad(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionTrips);
					
					DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionPositions, "Y");
				break;
				
				default:
				DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionPositions, "Y");
				break;
				}
				
				//Click Next Button
				DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
				
				//Click and drag 3 Available fields 
				DoThis.DragAndDrop();
				
				//Click Next Button in Step 2: Set up Columns
				DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
				
				//Click Next Button in Step 3: Set up Filters
				DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
				
				//Set Email address and click Submit button
				DoThis.clear(browser, ReportsPage.CutomiseTab.txtbxEmailAddress, "N");
				DoThis.sendkeys(ReportsPage.CutomiseTab.txtbxEmailAddress, ReportDetails.get("email_address").toString(), "Y");
				
				DoThis.click(ReportsPage.CutomiseTab.btnSubmit, "Y");
			break;
			
			case "Trips":
				//Select Trips in Filter by Category
				switch(activesite) {
				case "US":
					DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionCustom, "Y");
				break;
				
				case "ZW":
					DoThis.sendkeys(ReportsPage.CutomiseTab.txtbxFilterByCategory, ReportDetails.get("customise_filter_category").toString(), "Y");
					
					//Wait for data to load
					DoThis.WaitForDataToLoad(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionTrips);
					
					DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionTrips, "Y");
				break;
				
				default:
					DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionTrips, "Y");
				break;
				}
				
				//Click Next Button in Step 1 Create Report
				DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
				
				//Click and drag 3 Available fields 
				DoThis.DragAndDrop();
				
				//Click Next Button in Step 2: Set up Columns
				DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
				
				//Click Next Button in Step 3: Set up Filters
				DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
				
				//Set Email address and click Submit button
				DoThis.clear(browser, ReportsPage.CutomiseTab.txtbxEmailAddress, "N");
				DoThis.sendkeys(ReportsPage.CutomiseTab.txtbxEmailAddress, ReportDetails.get("email_address").toString(), "Y");
				
				DoThis.click(ReportsPage.CutomiseTab.btnSubmit, "Y");
				
			break;
			
			default: //if no selected Filter By Category Option Positions will be selected
				
				//Select Positions in Filter by Category
				DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionPositions, "Y");
				
				//Click Next Button
				DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
				
				//Click and drag 3 Available fields 
				DoThis.DragAndDrop();
				
				//Click Next Button in Step 2: Set up Columns
				DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
				
				//Click Next Button in Step 3: Set up Filters
				DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
				
				//Set Email address and click Submit button
				DoThis.clear(browser, ReportsPage.CutomiseTab.txtbxEmailAddress, "N");
				DoThis.sendkeys(ReportsPage.CutomiseTab.txtbxEmailAddress, ReportDetails.get("email_address").toString(), "Y");
				
				DoThis.click(ReportsPage.CutomiseTab.btnSubmit, "Y");

			}
		break;
		}
		
	
	}
	
	public static void FavoriteReport(String browser, @SuppressWarnings("rawtypes") Dictionary ReportDetails, String activesite) throws IOException, Exception  {
		
		//Click Report
		DoThis.click(ReportsPage.tbReport, "Y");
				
		DoThis.click(ReportsPage.SetupTab.tbSetUp, "Y");
		
		//Search for Report in Setup
		DoThis.clear(browser, ReportsPage.SetupTab.txtbxSearch, "N");
		DoThis.sendkeys(ReportsPage.SetupTab.txtbxSearch, ReportDetails.get("search_report").toString(), "Y");
		
		WebElement SearchReportlocator = null;
		
		switch (activesite) {
		case "TZ":
		case "SG":
			SearchReportlocator = Constant.driver.findElement(By.xpath("//div[text()='"+ReportDetails.get("search_report").toString()+"']"));
		break;
		
		default:
			SearchReportlocator = Constant.driver.findElement(By.xpath("//div[contains(text(),'"+ReportDetails.get("search_report").toString()+"')]"));
		break;
		}
		DoThis.click(SearchReportlocator, "Y");
		
		if(ReportDetails.get("favorite_report").equals(true)) {
			
			if(DoThis.isObjectAvailable(ReportsPage.SetupTab.btnSelectedFavorites, "Favorite Report validation", "NA")) {
				Reporter.ReportEventNoImage("Reports is already selected as Favorite");	
			}else {
				DoThis.click(ReportsPage.SetupTab.btnFavorites, "Y");
			}
			
		}else {
			if(DoThis.isObjectAvailable(ReportsPage.SetupTab.btnSelectedFavorites, "Favorite Report validation", "NA")) {
				Reporter.ReportEventNoImage("Reports is already selected as Favorite");	
			}else {
				DoThis.click(ReportsPage.SetupTab.btnFavorites, "Y");
			}
			
			DoThis.click(ReportsPage.FavoritesTab.tbFavorites, "Y");
			
			WebElement FavoritesReportDeleteButton = null;
			//Click Delete icon button
			switch (activesite) {
			
			case "TZ":
			case "SG":
				FavoritesReportDeleteButton = Constant.driver.findElement(By.xpath("//div[text()='"+ReportDetails.get("search_report").toString()+"']/parent::div[1]/descendant::button[1]"));
				break;
				
			default:
				FavoritesReportDeleteButton = Constant.driver.findElement(By.xpath("//div[contains(text(),'"+ReportDetails.get("search_report").toString()+"')]/parent::div[1]/descendant::button[1]"));
			break;
			}
			
			DoThis.click(FavoritesReportDeleteButton, "Y");
			
			//Click Yes Button
			DoThis.click(ReportsPage.FavoritesTab.btnYes, "Y");
			
		
		}
		
		
	}
	
	public static void SearchFavorite(@SuppressWarnings("rawtypes") Dictionary ReportDetails) throws IOException, Exception  {
		
		DoThis.click(ReportsPage.FavoritesTab.tbFavorites, "Y");
		
		if(ReportDetails.get("favorite_report").equals(true)) {
				
			if(!DoThis.isObjectDisplayed(ReportsPage.FavoritesTab.objSummaryTripReportFavorite, "Reports in Favorites validation", "Y")) {assertTrue(false);}
		}else {
			if(!DoThis.isObjectNotDisplayed(ReportsPage.FavoritesTab.objSummaryTripReportFavorite, "Reports NOT in Favorites validation", "Y")) {assertTrue(false);}
		}
	}
	
	public static void ValidateFavoriteReport(String browser, @SuppressWarnings("rawtypes") Dictionary ReportDetails, String activesite) throws IOException, Exception  {
		
		//Navigate to Reports >> Setup Tab
		DoThis.click(ReportsPage.tbReport, "Y");
		DoThis.click(ReportsPage.SetupTab.tbSetUp, "Y");
		
		//Search for Report in Setup
		DoThis.clear(browser, ReportsPage.SetupTab.txtbxSearch, "N");
		DoThis.sendkeys(ReportsPage.SetupTab.txtbxSearch, ReportDetails.get("search_report").toString(), "Y");
		
		WebElement SearchReportlocator = null;
		switch (activesite) {
		case "TZ":
		case "SG":
			SearchReportlocator = Constant.driver.findElement(By.xpath("//div[text()='"+ReportDetails.get("search_report").toString()+"']"));
		break;
			
		default:
			SearchReportlocator = Constant.driver.findElement(By.xpath("//div[contains(text(),'"+ReportDetails.get("search_report").toString()+"')]"));
		break;
		}
		
		DoThis.click(SearchReportlocator, "Y");
		
		if(ReportDetails.get("favorite_report").equals(true)) {
			if(!DoThis.isObjectDisplayed(ReportsPage.SetupTab.btnSelectedFavorites, "Report is Favorite validation", "Y")) {assertTrue(false);}
		}else {
			if(!DoThis.isObjectNotDisplayed(ReportsPage.SetupTab.btnSelectedFavorites, "Report is Favorite validation", "Y")) {assertTrue(false);}
		}
		
	}
	
	public static void SelectReport(String browser, String activesite) throws IOException, Exception  {
		
		ConfigReader config = new ConfigReader();
		
		String ReportName = null;
		switch(activesite) {
		
		case "SG":
			ReportName = config.getSGReportName();
			break;
			
		case "TH":
			ReportName = config.getTHReportName();
			break;
			
		case "ZA":
			ReportName = config.getZAReportName();
			break;
			
		case "PT":
			ReportName = config.getPTReportName();
			break;
			
		case "ID":
			ReportName = config.getIDReportName();
			break;
			
		case "PL":
			ReportName = config.getPLReportName();
			break;
			
		case "US":
			ReportName = config.getUSReportName();
			break;
			
		case "ME":
			ReportName = config.getMEReportName();
			break;
		
		case "MY":
			ReportName = config.getMYReportName();
			break;	

		case "MW":
			ReportName = config.getMWReportName();
			break;	
			
		case "MZ":
			ReportName = config.getMZReportName();
			break;	
			
		case "HK":
			ReportName = config.getHKReportName();
			break;
			
		case "NZ":
			ReportName = config.getNZReportName();
			break;
			
		case "AU":
			ReportName = config.getAUReportName();
			break;
			
		case "SZ":
			ReportName = config.getSZReportName();
			break;	
			
		case "ZW":
			ReportName = config.getZWReportName();
			break;
			
		case "ES":
			ReportName = config.getESReportName();
			break;
			
		case "RW":
			ReportName = config.getRWReportName();
			break;
			
		case "TZ":
			ReportName = config.getTZReportName();
			break;
			
		case "NA":
			ReportName = config.getNAReportName();
			break;
			
		case "KE":
			ReportName = config.getKEReportName();
			break;
			
		case "BW":
			ReportName = config.getBWReportName();
			break;
			
		case "FR":
			ReportName = config.getFRReportName();
			break;
			
		case "PH":
			ReportName = config.getPHReportName();
			break;
			
		case "NG":
			ReportName = config.getNGReportName();
			break;
			
			
		//Need to add additional case options for other countries
		
		}
			
		//Navigate to Reports >> Setup Tab
		DoThis.click(ReportsPage.tbReport, "Y");
		DoThis.click(ReportsPage.SetupTab.tbSetUp, "Y");
		
		//Search for Report in Setup
		DoThis.clear(browser, ReportsPage.SetupTab.txtbxSearch, "N");
		DoThis.sendkeys(ReportsPage.SetupTab.txtbxSearch, ReportName, "Y");
		
		DoThis.WaitForElementToLoad(ReportsPage.SetupTab.objReportLeftPanel);
		
		WebElement SearchReportlocator = null;
		switch (activesite) {
		case "TZ":
		case "SG":
			SearchReportlocator = Constant.driver.findElement(By.xpath("//div[text()='"+ReportName+"']"));
		break;
			
		default:
			SearchReportlocator = Constant.driver.findElement(By.xpath("//div[contains(text(),'"+ReportName+"')]"));
		break;
		}
		 
		DoThis.click(SearchReportlocator, "Y");
		
	}
	
	public static void CreateReportTab(@SuppressWarnings("rawtypes") Dictionary ReportDetails) throws IOException, Exception {
		
		DoThis.click(ReportsPage.CutomiseTab.tbCustomise, "Y");
		
		DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategory, "Y");
		
		switch (ReportDetails.get("customise_filter_category").toString()) {
			
		case "Positions":
			//Select Positions in Filter by Category
			DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionPositions, "Y");
			
		break;
		
		case "Trips":
			//Select Trips in Filter by Category
			DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionTrips, "Y");
			
			
		break;
		
		default: //if no selected Filter By Category Option Positions will be selected
			
			//Select Positions in Filter by Category
			DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionPositions, "Y");
		
		}
		
		switch (ReportDetails.get("suppress").toString()) {
		
		case "Suppress Header":
			DoThis.click(ReportsPage.CutomiseTab.chckbxSuppressHeader, "Y");
			break;
			
		case "Suppress Footer":
			DoThis.click(ReportsPage.CutomiseTab.chckbxSuppressFooter, "Y");
			break;
		}
	
	}

	public static void SetupColumnTab(@SuppressWarnings("rawtypes") Dictionary ReportDetails) throws IOException, Exception {
		
		DoThis.click(ReportsPage.CutomiseTab.tbCustomise, "Y");
		
		DoThis.WaitForElementToLoad(ReportsPage.CutomiseTab.drpdwnFilterByCategory);
		DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategory, "Y");
		
		switch (ReportDetails.get("customise_filter_category").toString()) {
			
		case "Positions":
			//Select Positions in Filter by Category
			DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionPositions, "Y");
			
		break;
		
		case "Trips":
			//Select Trips in Filter by Category
			DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionTrips, "Y");
			
			
		break;
		
		default: //if no selected Filter By Category Option Positions will be selected
			
			//Select Positions in Filter by Category
			DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionPositions, "Y");
		
		}
		
		switch (ReportDetails.get("suppress").toString()) {
		
		case "Suppress Header":
			DoThis.click(ReportsPage.CutomiseTab.chckbxSuppressHeader, "Y");
			break;
			
		case "Suppress Footer":
			DoThis.click(ReportsPage.CutomiseTab.chckbxSuppressFooter, "Y");
			break;
		}
		
		//Click Next Button in Step 1 Create Report
		DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
		
		//Click and drag 3 Available fields 
		DoThis.DragAndDrop();
	
	}
	
	public static void SetupFilterTab(@SuppressWarnings("rawtypes") Dictionary ReportDetails) throws IOException, Exception {
		
		DoThis.click(ReportsPage.CutomiseTab.tbCustomise, "Y");
		
		DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategory, "Y");
		
		switch (ReportDetails.get("customise_filter_category").toString()) {
			
		case "Positions":
			//Select Positions in Filter by Category
			DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionPositions, "Y");
			
		break;
		
		case "Trips":
			//Select Trips in Filter by Category
			DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionTrips, "Y");
			
			
		break;
		
		default: //if no selected Filter By Category Option Positions will be selected
			
			//Select Positions in Filter by Category
			DoThis.click(ReportsPage.CutomiseTab.drpdwnFilterByCategoryOptionPositions, "Y");
		
		}
		
		switch (ReportDetails.get("suppress").toString()) {
		
		case "Suppress Header":
			DoThis.click(ReportsPage.CutomiseTab.chckbxSuppressHeader, "Y");
			break;
			
		case "Suppress Footer":
			DoThis.click(ReportsPage.CutomiseTab.chckbxSuppressFooter, "Y");
			break;
		}
		
		//Click Next Button in Step 1 Create Report
		DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
		
		//Click and drag 3 Available fields 
		DoThis.DragAndDrop();
		
		//Click Next Button in Step 2: Set up Columns
		DoThis.click(ReportsPage.CutomiseTab.btnNext, "Y");
	
	}
	
	public static void ValidateReport(String browser, String activesite) throws IOException, Exception  {
		
		ConfigReader config = new ConfigReader();
		
		String ReportName = null;
		switch(activesite) {
		
		case "SG":
			ReportName = config.getSGReportName();
			break;
			
		case "TH":
			ReportName = config.getTHReportName();
			break;
			
		case "ZA":
			ReportName = config.getZAReportName();
			break;
			
		case "PT":
			ReportName = config.getPTReportName();
			break;
			
		case "ID":
			ReportName = config.getIDReportName();
			break;
			
		case "PL":
			ReportName = config.getPLReportName();
			break;
			
		case "US":
			ReportName = config.getUSReportName();
			break;
			
		case "ME":
			ReportName = config.getMEReportName();
			break;
		
		case "MY":
			ReportName = config.getMYReportName();
			break;	

		case "MW":
			ReportName = config.getMWReportName();
			break;	
			
		case "MZ":
			ReportName = config.getMZReportName();
			break;	
			
		case "HK":
			ReportName = config.getHKReportName();
			break;
			
		case "NZ":
			ReportName = config.getNZReportName();
			break;
			
		case "AU":
			ReportName = config.getAUReportName();
			break;
			
		case "SZ":
			ReportName = config.getSZReportName();
			break;	
			
		case "ZW":
			ReportName = config.getZWReportName();
			break;
			
		case "ES":
			ReportName = config.getESReportName();
			break;
			
		case "RW":
			ReportName = config.getRWReportName();
			break;
			
		case "TZ":
			ReportName = config.getTZReportName();
			break;
			
		case "NA":
			ReportName = config.getNAReportName();
			break;
			
		case "KE":
			ReportName = config.getKEReportName();
			break;
			
		case "BW":
			ReportName = config.getBWReportName();
			break;
			
		case "FR":
			ReportName = config.getFRReportName();
			break;
			
		case "PH":
			ReportName = config.getPHReportName();
			break;
			
		case "NG":
			ReportName = config.getNGReportName();
			break;
			
			
		//Need to add additional case options for other countries
		
		}
			
		//Wait for element to load
		DoThis.WaitForElementToLoad(ReportsPage.tbReport);
		
		//Navigate to Reports >> Setup Tab
		DoThis.click(ReportsPage.tbReport, "Y");
		DoThis.click(ReportsPage.SetupTab.tbSetUp, "Y");
		
		//Search for Report in Setup
		DoThis.clear(browser, ReportsPage.SetupTab.txtbxSearch, "N");
		DoThis.sendkeys(ReportsPage.SetupTab.txtbxSearch, ReportName, "Y");
			
		}
		
	
}
