package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import pageObject.MapPage;
import utility.DoThis;
import utility.Reporter;

public class MapDetails{	
	
	
	public static void WithDetails(@SuppressWarnings("rawtypes") Dictionary downloadDetails, boolean withData, String activesite) throws IOException, Exception{
		
		int i = 0;
		switch(downloadDetails.get("map_details_type").toString()){ 	
		
		case "Timeline":
			DoThis.click(MapPage.Fleettab.btnTimeline, "Y");
			//For countries that does not have Vehicle data, add here
			switch (activesite) {
			case("PL"): 
			case("FR"): 
			Reporter.ReportEventNoImage("No Data is found in "+activesite);
			break;
			
			default:
				while(withData) 
				{
					//Wait for the Play button to fully Load
					DoThis.WaitForElementToLoad(MapPage.Fleettab.btnPlay);
					
					if(DoThis.isEqualText(MapPage.Fleettab.dtBlockStop, "--", "Total Stop Time", "N"))
					{
							//Click Next Details Panel Timeline if current details panel is empty
							i++;
							DoThis.click(MapPage.Fleettab.lstDetailsPanelTimeline.get(i), "Y");
							
						}else {
							break;
						}
				}
			}
			break;
		case "Graph":
			DoThis.click(MapPage.Fleettab.btnGraph, "Y");
			//For countries that does not have Vehicle data, add here
			switch (activesite) {
			case("PL"): 
			case("FR"):
			Reporter.ReportEventNoImage("No Data is found in "+activesite);
			break;
			
			default:
				while(withData) 
				{
					//Wait for the Expand button to fully Load
					DoThis.WaitForElementToLoad(MapPage.Fleettab.btnExpandChart);
					
					if(DoThis.isEqualText(MapPage.Fleettab.dtBlockStop, "--", "Total Stop Time", "N"))
					{
							//Click Next Details Panel Timeline if current details panel is empty
							i++;
							DoThis.click(MapPage.Fleettab.lstDetailsPanelTimeline.get(i), "Y");
						}else {
							break;
						}
				}
			}
			
			break;
		case "Table":
			DoThis.click(MapPage.Fleettab.btnTable, "Y");
			//For countries that does not have Vehicle data, add here
			switch (activesite) {
			case("PL"): 
			case("FR"):
			Reporter.ReportEventNoImage("No Data is found in "+activesite);
			break;
			
			default:
				while(withData) 
				{
					//Wait for the Recent button to fully Load
					DoThis.WaitForElementToLoad(MapPage.Fleettab.btnRecent);
					
					if(DoThis.isEqualText(MapPage.Fleettab.dtBlockStop, "--", "Total Stop Time", "N"))
					{
							//Click Next Details Panel Timeline if current details panel is empty
							i++;
							DoThis.click(MapPage.Fleettab.lstDetailsPanelTimeline.get(i), "Y");
						}else {
							break;
						}
				}
			}
			break;
		}		
		
		}

	public static void ViewAllActivityWithDetails(@SuppressWarnings("rawtypes") Dictionary downloadDetails) throws IOException, Exception{
		
		DoThis.click(MapPage.Fleettab.btnViewAllActivity, "Y");
		
		switch(downloadDetails.get("view_all_activity_details_type").toString()){
		
		case "Timeline":
			DoThis.click(MapPage.Fleettab.btnAllActivityTimeline, "Y");
			break;
			
		case "Chart":
			DoThis.click(MapPage.Fleettab.btnAllActivityChart, "Y");
			break;	
			
		}
			
	}
}
