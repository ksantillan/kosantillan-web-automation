package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MiFleetPage {

		@FindBy(xpath="//a[contains(@class,'MiFleet')]")
		public static WebElement navMiFleet;
		
	public static class FleetStatusTab {
		
		@FindBy(xpath="//div[@id='fleet-status-tab']")
		public static WebElement tbFleetStatus;
		
		@FindBy(xpath="//div[@id='statfilter-fleet-status-dpd']")
		public static WebElement drpdwnStatusFilter;
		
		@FindBy(xpath="//input[@id='search-fleet-status-bar']")
		public static WebElement txtbxSearchFleetStatus;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Vehicle']")
		public static WebElement clmnhdrVehicle;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Driver']")
		public static WebElement clmnhdrDriver;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Insurances']")
		public static WebElement clmnhdrInsurances;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Permits']")
		public static WebElement clmnhdrPermits;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='TAX']")
		public static WebElement clmnhdrTAX;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Service']")
		public static WebElement clmnhdrService;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Fines']")
		public static WebElement clmnhdrFines;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Fuel Card']")
		public static WebElement clmnhdrFuelCard;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='View Details']")
		public static WebElement clmnhdrViewDetails;
		
	}
	
	public static class FuellingTab {
		
		@FindBy(xpath="//div[@id='fuelling-tab']")
		public static WebElement tbFuelling;
		
		@FindBy(xpath="//div[@id='stafilter-fuelling-dpd']")
		public static WebElement drpdwnStatusFilter;
		
		@FindBy(xpath="//input[@id='search-fuelling-bar']")
		public static WebElement txtbxSearchFuelling;
		
		@FindBy(xpath="//input[@id='fuelling-start-date-txi']")
		public static WebElement dtpckrFuellingStartDate;
		
		@FindBy(xpath="//input[@id='fuelling-end-date-txi']")
		public static WebElement dtpckrFuellingEndDate;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Vehicle']")
		public static WebElement clmnhdrVehicle;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Driver']")
		public static WebElement clmnhdrDriver;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Date']")
		public static WebElement clmnhdrDate;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Supplier']")
		public static WebElement clmnhdrSupplier;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Fuelling Station']")
		public static WebElement clmnhdrFuellingStation;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Odometer']")
		public static WebElement clmnhdrOdometer;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Liters']")
		public static WebElement clmnhdrLiters;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='Validation']")
		public static WebElement clmnhdrValidation;
		
		@FindBy(xpath="//div[@role='columnheader']/descendant::span[text()='View Details']")
		public static WebElement clmnhdrViewDetails;
		
	}
	
}
