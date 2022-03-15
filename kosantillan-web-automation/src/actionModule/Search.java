package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import pageObject.MapPage;
import utility.DoThis;

public class Search{	
	
	public static void WitDetails(String browser, @SuppressWarnings("rawtypes") Dictionary SearchBy) throws IOException, Exception{
		
		DoThis.click(MapPage.Fleettab.btndwncaretSearch, "Y");
		
		switch(SearchBy.get("search_by").toString()){
		
		case "Fleet Search":
			DoThis.WaitForDataToLoad(MapPage.Fleettab.slctrFleetSearch);
			DoThis.click(MapPage.Fleettab.slctrFleetSearch, "Y");
			DoThis.clear(browser, MapPage.Fleettab.txtbxFleetSearch, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, SearchBy.get("search_keyword").toString(), "Y");
			
			break;
			
		case "Places Search":
			DoThis.WaitForDataToLoad(MapPage.Fleettab.slctrPlacesSearch);
			DoThis.click(MapPage.Fleettab.slctrPlacesSearch, "Y");
			DoThis.clear(browser, MapPage.Fleettab.txtbxPlacesSearch, "N");
			DoThis.sendkeys(MapPage.Fleettab.txtbxPlacesSearch, SearchBy.get("search_keyword").toString(), "Y");
			break;
			
		case "Coordinate Search":
			DoThis.WaitForDataToLoad(MapPage.Fleettab.slctrCoordinateSearch);
			DoThis.click(MapPage.Fleettab.slctrCoordinateSearch, "Y");
			DoThis.clear(browser, MapPage.Fleettab.txtbxCoordinateSearch, "N");
			
			//Remove any existing special characters if exist
			String strsearch_keyword = SearchBy.get("search_keyword").toString(); 
			strsearch_keyword = strsearch_keyword.replaceAll("Â", "");  
			DoThis.sendkeys(MapPage.Fleettab.txtbxCoordinateSearch, strsearch_keyword, "Y");
			break;
		}
	
	
	}

}
