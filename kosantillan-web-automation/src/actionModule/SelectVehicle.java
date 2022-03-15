package actionModule;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.MapPage;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;

public class SelectVehicle{	
	
	public static void Execute(String browser, String activesite) throws IOException, Exception{
		
		DoThis.click(MapPage.Maptab.navMap, "Y");
		DoThis.click(MapPage.Fleettab.navFleet, "Y");

		DoThis.clear(browser, MapPage.Fleettab.txtbxFleetSearch, "N");
		String Vehicle = null;
		WebElement VehicleLocator = null;
		ConfigReader config = new ConfigReader();
		switch(activesite) {
		
		case "SG":
			Vehicle = config.getSGVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "TH":
			Vehicle = config.getTHVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "ZA":
			Vehicle = config.getZAVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			
			break;
			
		case "PT":
			Vehicle = config.getPTVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "ID":
			Vehicle = config.getIDVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "PL":
			Vehicle = config.getPLVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
		
		case "US":
			Vehicle = config.getUSVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "ME":
			Vehicle = config.getMEVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
		
		case "MY":
			Vehicle = config.getMYVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			DoThis.click(VehicleLocator, "Y");
			DoThis.click(VehicleLocator, "N");
			break;	
			
		case "MZ":
			Vehicle = config.getMZVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;	

		case "MW":
			Vehicle = config.getMWVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;				
			
		case "HK":
			Vehicle = config.getHKVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "NZ":
			Vehicle = config.getNZVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "AU":
			Vehicle = config.getAUVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;

		case "SZ":
			Vehicle = config.getSZVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;			
			
		case "ZW":
			Vehicle = config.getZWVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "ES":
			Vehicle = config.getESVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "RW":
			Vehicle = config.getRWVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "TZ":
			Vehicle = config.getTZVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "NA":
			Vehicle = config.getNAVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
			
		case "KE":
			Vehicle = config.getKEVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;
		
		case "BW":
			Vehicle = config.getBWVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')][@class='Vehicle-title']"));
			break;
			
		case "FR":
			Vehicle = config.getFRVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')][@class='Vehicle-title']"));
			break;
			
		case "PH":
			Vehicle = config.getPHVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')][@class='Vehicle-title']"));
			break;
			
		case "NG":
			Vehicle = config.getNGVehicle();
			DoThis.sendkeys(MapPage.Fleettab.txtbxFleetSearch, Vehicle.toString(), "Y");
			VehicleLocator = Constant.driver.findElement(By.xpath("//span[contains(text(),'"+Vehicle+"')]"));
			break;			
		//Need to add additional case options for other countries
		
		}
		
		DoThis.click(VehicleLocator, "Y");
		if(DoThis.isObjectAvailable(VehicleLocator, "Vehicle Name", "N")) {
			DoThis.click(VehicleLocator, "N");
		}
		
	}

}
