package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import pageObject.MapPage;
import utility.DoThis;

public class DownloadTripDetails{	
	
	
	public static void WithDetails(@SuppressWarnings("rawtypes") Dictionary downloadDetails) throws IOException, Exception{
		
		DoThis.click(MapPage.Fleettab.btnDownload, "Y");
		DoThis.isObjectDisplayed(MapPage.Fleettab.mdlhdrDownloadTrip, "Download Trip header", "Y");
		
		switch(downloadDetails.get("download_type").toString()){
		
		case "Excel":
		DoThis.click(MapPage.Fleettab.btnExcelFile, "Y");break;
		
		case "KML": 
		DoThis.click(MapPage.Fleettab.btnKMLFile, "Y");break;
		
		case "GPX":
		DoThis.click(MapPage.Fleettab.btnGPXFile, "Y");break;
		
		}
		
		//Click Download Trips button
		DoThis.click(MapPage.Fleettab.btnDownloadTrips, "Y");
			
	}
		
		
		
		
}
