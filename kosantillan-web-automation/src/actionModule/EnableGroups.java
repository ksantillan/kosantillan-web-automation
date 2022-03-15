package actionModule;

import pageObject.MapPage;
import utility.DoThis;
import utility.Reporter;

public class EnableGroups{	
	
	
public static void Execute() throws InterruptedException {
	
		//click on Settings
		DoThis.click(MapPage.Fleettab.btnSettings, "Y");
		
		while(!DoThis.isObjectAvailable(MapPage.Fleettab.hdrClose, "Close header", "NA")){
			DoThis.click(MapPage.Fleettab.btnSettings, "Y");
		}
			
		//Wait for Enable Groups to displayed
		DoThis.Wait(MapPage.Fleettab.chckbxOtherEnableGroups);
			
		//Check if Enable Groups checkbox is ticked
		if(!DoThis.getCheckedStatus(MapPage.Fleettab.objOtherEnableGroups).contains("true")) {
			DoThis.click(MapPage.Fleettab.chckbxOtherEnableGroups, "Y");
		}else {
			Reporter.ReportEventNoImage("Enable Groups checkbox is already ticked");
		}    
		
		//Click Close button
		DoThis.click(MapPage.Fleettab.hdrClose, "Y");
	}
		
		
}
