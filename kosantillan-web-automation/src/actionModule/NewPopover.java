package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.MapPage;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;

public class NewPopover{	
	
	public static void WitDetails(@SuppressWarnings("rawtypes") Dictionary FilterBy, String activesite) throws IOException, Exception{
		
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

		//Filter By
		WebElement Filterby = Constant.driver.findElement(By.xpath("//*[contains(.,'Filter By')]/ancestor::*[contains(@class,'LeftPanelSettings-panel-section')]/following-sibling::div[1]/descendant::label[contains(@class,'Checkbox-box')]/following-sibling::span[contains(.,'"+FilterBy.get("filter_by").toString()+"')]"));
		DoThis.click(Filterby, "Y");
		DoThis.click(MapPage.Fleettab.hdrClose, "Y");
		
		if(MapPage.Fleettab.ListVehicleName.size() > 0) {
			
			//if Vehicle List is more than 3, validate only the first 3
			if(MapPage.Fleettab.ListVehicleName.size() > 4) {
				for (int i = 0; i < 3; i++) {
					//Hover to Vehicle Name
					DoThis.Hover(MapPage.Fleettab.ListVehicleName.get(i));
					int vehiclecount = i+1;
					
					switch (FilterBy.get("newpopover").toString()) {

					case "location":
						//Validate New popover - Vehicle Location is not empty
						if(DoThis.isObjectAvailable(MapPage.Fleettab.objVehiclestreetAddress, "Vehicle Street Address", "N")) {
							DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehiclestreetAddress, "Vehicle "+vehiclecount+" Location", "Y");
						}else {
							DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleStreetAddress, "Vehicle "+vehiclecount+" Location", "Y");
						}
						break;
					
					case "Speed, Road speed and Odometer":
						//Validate New popover - Vehicle Speed, Road speed and Odometer is not empty
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleOdometer, "Vehicle "+vehiclecount+" Odometer", "Y");
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleRoadSpeed, "Vehicle "+vehiclecount+" Road Speed", "Y");
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleSpeed, "Vehicle "+vehiclecount+" Speed", "Y");
						break;
						
					case "Unit Clock":
						switch (activesite) {
						case "TH":
						case "NZ":
						case "AU":
						case "FR":
						case "NA":
						case "MZ":
						case "RW":
						case "TZ":
						case "ZW":
							Reporter.ReportEventNoImage("Unit Clock validation is not applicable for "+activesite);
						break;
						default:
						//Validate New popover - Unit Clock
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleUnitClock, "Vehicle "+vehiclecount+" Unit Clock", "Y");
						break;
						}
						break;
						
					case "Settings Button":
						//Validate New popover - Settings Button
						DoThis.isObjectDisplayed(MapPage.Fleettab.objVehicleSettingsButton, "Vehicle "+vehiclecount+" Settings Button", "Y");
						DoThis.click(MapPage.Fleettab.objVehicleSettingsButton, "Y");
						break;
						
					case "Refrigerator":
						switch (activesite) {
						case "PT":
						case "ZA":
						case "TH":
						case "ME":
						case "NZ":
						case "AU":
						case "US":
						case "ES":
						case "FR":
						case "NA":
						case "KE":
						case "MW":
						case "MZ":
						case "NG":
						case "RW":
						case "SZ":
						case "TZ":
						case "ZW":
							Reporter.ReportEventNoImage("Refrigerator validation is not applicable for "+activesite);
						break;
						
						default:
							//Validate New popover - Refrigerator
							DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleRefrigerator, "Vehicle "+vehiclecount+" Refrigerator", "Y");
						break;
						}
						break;
					
					case "Driver ID Tag":
						//Validate New popover - Driver ID Tag
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleDriverIDTag, "Vehicle "+vehiclecount+" Driver ID Tag", "Y");
						break;
						
					case "Battery":
						//Validate New popover - Battery
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleBattery, "Vehicle "+vehiclecount+" Battery", "Y");
						break;
						
					case "Actions":
						//Validate New popover - Actions
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleActions, "Vehicle "+vehiclecount+" Actions", "Y");
						break;
					
					}
					
				}	
			}else {
				for (int i = 0; i < MapPage.Fleettab.ListVehicleName.size(); i++) {
					//Hover to Vehicle Name
					DoThis.Hover(MapPage.Fleettab.ListVehicleName.get(i));
					int vehiclecount = i+1;
					switch (FilterBy.get("newpopover").toString()) {
					
					case "location":
						//Validate New popover - Vehicle Location is not empty
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleStreetAddress, "Vehicle "+vehiclecount+" Location", "Y");
						break;
					
					case "Speed, Road speed and Odometer":
						//Validate New popover - Vehicle Speed, Road speed and Odometer is not empty
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleOdometer, "Vehicle "+vehiclecount+" Odometer", "Y");
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleRoadSpeed, "Vehicle "+vehiclecount+" Road Speed", "Y");
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleSpeed, "Vehicle "+vehiclecount+" Speed", "Y");
						break;
						
					case "Unit Clock":
						//Validate New popover - Unit Clock
						switch (activesite) {
						case "TH":
						case "NZ":
						case "AU":
						case "FR":
						case "NA":
						case "MZ":
						case "RW":
						case "TZ":
						case "ZW":
							Reporter.ReportEventNoImage("Unit Clock validation is not applicable for "+activesite);
						break;
						default:
						//Validate New popover - Unit Clock
						DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleUnitClock, "Vehicle "+vehiclecount+" Unit Clock", "Y");
						break;
						}
						break;
						
					case "Settings Button":
						//Validate New popover - Settings Button
						DoThis.isObjectDisplayed(MapPage.Fleettab.objVehicleSettingsButton, "Vehicle "+vehiclecount+" Settings Button", "Y");
						DoThis.click(MapPage.Fleettab.objVehicleSettingsButton, "Y");
						break;
						
					case "Refrigerator":
						//Validate New popover - Refrigerator
						switch (activesite) {
						case "PL":
						case "ZA":
						case "TH":
						case "ME":
						case "NZ":
						case "AU":
						case "US":
						case "ES":
						case "FR":
						case "NA":
						case "KE":
						case "MW":
						case "MZ":
						case "NG":
						case "RW":
						case "SZ":
						case "TZ":
						case "ZW":
							Reporter.ReportEventNoImage("Refrigerator is not applicable for "+activesite);
						break;
						default:
							DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleRefrigerator, "Vehicle "+vehiclecount+" Refrigerator", "Y");
						break;
						}
						break;
					
					case "Driver ID Tag":
						//Validate New popover - Driver ID Tag
						switch (activesite) {
						case "PL":
							Reporter.ReportEventNoImage("Driver ID Tag is not applicable for "+activesite);
						break;
						default:
							DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleDriverIDTag, "Vehicle "+vehiclecount+" Driver ID Tag", "Y");
						break;
						}
						break;
						
					case "Battery":
						//Validate New popover - Battery
						switch (activesite) {
						case "PL":
							Reporter.ReportEventNoImage("Battery is not applicable for "+activesite);
						break;
						default:
							DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleBattery, "Vehicle "+vehiclecount+" Battery", "Y");
						break;
						}
						break;
						
					case "Actions":
						//Validate New popover - Actions
						switch (activesite) {
						case "PL":
							Reporter.ReportEventNoImage("Actions is not applicable for "+activesite);
						break;
						default:
							DoThis.IsObjectTextNotEmpty(MapPage.Fleettab.objVehicleActions, "Vehicle "+vehiclecount+" Actions", "Y");
						break;
						}
						break;
						
					}
				}	
			}
			
		}else {
			Reporter.ReportEventNoImage("No Data available for Vehicle Filter by "+FilterBy.get("filter_by").toString());
		}
		
	}

}
