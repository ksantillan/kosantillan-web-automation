package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.MapPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

public class FilterBy{	
	
	public static void WitDetails(@SuppressWarnings("rawtypes") Dictionary FilterBy) throws IOException, Exception{
		
		//click on Settings
		DoThis.click(MapPage.Fleettab.btnSettings, "Y");
		
		while(!DoThis.isObjectAvailable(MapPage.Fleettab.hdrClose, "Close header", "NA")){
			DoThis.click(MapPage.Fleettab.btnSettings, "Y");
		}
		
		//Checked if there existing checkbox checked, if yes unchecked it.
		if(DoThis.isObjectAvailable(MapPage.Fleettab.objTickedCheckbox, "Checked checkbox", "NA")) {
			for (int i = 0; i < MapPage.Fleettab.objTickedCheckboxs.size(); i++) {
				DoThis.click(MapPage.Fleettab.objTickedCheckboxs.get(i), "Y");
			}
		}else {
			Reporter.ReportEventNoImage("No checkbox is currently ticked");
		}

		//Filter By
		WebElement Filterby = Constant.driver.findElement(By.xpath("//*[contains(.,'Filter By')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::label[contains(@class,'Checkbox-box')]/following-sibling::span[contains(.,'"+FilterBy.get("filter_by").toString()+"')]"));
		DoThis.click(Filterby, "Y");
		DoThis.click(MapPage.Fleettab.hdrClose, "Y");


		if(MapPage.Fleettab.ListVehicleName.size() > 0) {
			
			//if Vehicle List is more than 5, validate only the first 5
			if(MapPage.Fleettab.ListVehicleName.size() > 6) {
				for (int i = 0; i < 5; i++) {
					int vehiclecount = i+1;
					
					switch(FilterBy.get("filter_by").toString()){
						
					case "Driving":
					case "Idling":
					case "Ignition Off":
					case "No Signal":
						DoThis.isContainingText(MapPage.Fleettab.objVehicleStatus, FilterBy.get("filter_by").toString().toUpperCase() , FilterBy.get("filter_by").toString().toUpperCase()+" Status validation for Vehicle "+vehiclecount, "Y");
						break;
						
					case "No GPS":
						DoThis.isContainingText(MapPage.Fleettab.objVehicleStreetAddress, FilterBy.get("filter_by").toString().toUpperCase() , FilterBy.get("filter_by").toString().toUpperCase()+" Status validation for Vehicle "+vehiclecount, "Y");
						break;
					}
				}	
			}else {
				for (int i = 0; i < MapPage.Fleettab.ListVehicleName.size(); i++) {
					int vehiclecount = i+1;
					
					switch(FilterBy.get("filter_by").toString()){
						
					case "Driving":
					case "Idling":
					case "Ignition Off":
					case "No Signal":
						DoThis.isContainingText(MapPage.Fleettab.objVehicleStatus, FilterBy.get("filter_by").toString().toUpperCase() , FilterBy.get("filter_by").toString().toUpperCase()+" Status validation for Vehicle "+vehiclecount, "Y");
						break;
						
					case "No GPS":
						DoThis.isContainingText(MapPage.Fleettab.objVehicleStreetAddress, FilterBy.get("filter_by").toString().toUpperCase() , FilterBy.get("filter_by").toString().toUpperCase()+" Status validation for Vehicle "+vehiclecount, "Y");
						break;
					}
					
				}	
			}
			
		}else {
			Reporter.ReportEventNoImage("No Data available for Vehicle Filter by "+FilterBy.get("filter_by").toString());
		}
		
	}
	
	public static void UntickedFilterBy() throws IOException, Exception{
		
		//click on Settings
		DoThis.click(MapPage.Fleettab.btnSettings, "Y");
		
		//Checked if there existing checkbox checked, if yes unchecked it.
		if(DoThis.isObjectAvailable(MapPage.Fleettab.objTickedCheckbox, "Checked checkbox", "NA")) {
			for (int i = 0; i < MapPage.Fleettab.objTickedCheckboxs.size(); i++) {
				DoThis.click(MapPage.Fleettab.objTickedCheckboxs.get(i), "Y");
			}
		}else {
			Reporter.ReportEventNoImage("No checkbox is currently ticked");
		}

		
		
	}

}
