package actionModule;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import pageObject.MapPage;
import utility.DoThis;
import utility.Reporter;


public class CompareTrips{	
	
	public static void Upto6Trips() throws IOException, Exception{

		
		for (int i = 0; i < 6; i++) {
			DoThis.click(MapPage.Fleettab.drpdwnAddVehicle, "Y");
			DoThis.click(MapPage.Fleettab.lstAddVehicle.get(i), "Y");
			
		}
			
		

	}
	public static int GetAddVehicleCount(List<WebElement> lstAddVehicle) throws IOException, Exception{
		
		DoThis.click(MapPage.Fleettab.btnCompare, "Y");
		DoThis.click(MapPage.Fleettab.drpdwnAddVehicle, "Y");
		int intVehicleCount = lstAddVehicle.size();
		
		return intVehicleCount;
		
	}
	public static void Upto2Trips(String activesite) throws IOException, Exception{
		
		switch (activesite) {
		case "NZ":
		case "AU":
		case "PL":
		case "FR":
			//Select the only one vehicle from the Add Vehicle dropdown list
			for (int i = 0; i < 2; i++) {
				DoThis.click(MapPage.Fleettab.drpdwnAddVehicle, "Y");
				DoThis.click(MapPage.Fleettab.lstAddVehicle.get(0), "Y");
				
			}
		break;	
		default:
			//Select first 2 from the Add Vehicle dropdown list
			for (int i = 0; i < 2; i++) {
				DoThis.click(MapPage.Fleettab.drpdwnAddVehicle, "Y");
				DoThis.click(MapPage.Fleettab.lstAddVehicle.get(i), "Y");
				
			}
		break;
		}
		
		
		DoThis.click(MapPage.Fleettab.btnApply, "Y");
				
	
	}

	public static void vehicleFinalDestination() throws IOException, Exception{
		
		//Wait for Trips data to load
		DoThis.WaitForElementToLoad(MapPage.Fleettab.objdtBlockDistance);
		
		switch(MapPage.Fleettab.dtBlockZeroDistance.size()){
	
		case 0 :
			for(int i=0; i < 2; i++) {
				//Zoom out map for End Trip flag to be visible
				DoThis.click(MapPage.Fleettab.btnZoomOut, "Y");
			}
			for(int i=0; i < 2; i++) {
				int x = i+1;
				DoThis.isObjectDisplayed(MapPage.Fleettab.objEndTripFlagList.get(i), "End Trip Flag for Vehicles "+x+" is displayed", "Y");
			}	
		break;
		
		case 1 :
			for(int i=0; i < 2; i++) {
				//Zoom out map for End Trip flag to be visible
				DoThis.click(MapPage.Fleettab.btnZoomOut, "Y");
			}
			DoThis.isObjectDisplayed(MapPage.Fleettab.objEndTripFlag, "End Trip Flag for Vehicle 1 is displayed", "Y");
		break;
		
		case 2 :
			Reporter.ReportEventNoImage("No Distance is displayed on all vehicles Compare");
		break;
		
		}
		
	}
}
