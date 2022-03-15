package actionModule;

import pageObject.MapPage;
import utility.DoThis;
import utility.Reporter;

public class UseVehicleIconColour{	
	
	
public static void Execute() throws InterruptedException {
	
		//click on Settings
		DoThis.click(MapPage.Fleettab.btnSettings, "Y");
		
		//Wait for Enable Groups to displayed
		DoThis.Wait(MapPage.Fleettab.chckbxOtherEnableGroups);
			
		//Check if Use Vehicle Icon Colour checkbox is ticked
		if(!DoThis.getCheckedStatus(MapPage.Fleettab.objOtherUseVehicleIconColour).contains("true")) {
			DoThis.click(MapPage.Fleettab.chckbxOtherUseVehicleIconColour, "Y");
		}else {
			Reporter.ReportEventNoImage("Use Vehicle Icon Colour checkbox is already ticked");
		}  
		
		//Click Close button
		DoThis.click(MapPage.Fleettab.hdrClose, "Y");
		

	}
		
		
}
