package utility;

import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;				
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;		  
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;										   
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Optional;
import pageObject.AppStoreCartrack;
import pageObject.CommunicatorPage;
import pageObject.DashboardPage;
import pageObject.EngineFaultsPage;
import pageObject.ForgotPasswordPage;
import pageObject.ForgotPasswordSubUserPage;
import pageObject.GetMyLoginPage;
import pageObject.GooglePlayCartrack;
import pageObject.ListPage;
import pageObject.ListPage.TrailersPage;
import pageObject.LoginPage;
import pageObject.MapPage;
import pageObject.MessagingPage;
import pageObject.MiFleetPage;
import pageObject.NewPopoverPage;
import pageObject.NotificationPage;
import pageObject.ReportsPage;
import pageObject.SettingsPage;
import pageObject.SignUpPage;
import pageObject.VerifyCodePage;
import pageObject.WelcomePage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class DoThis {

	public static void InitElements() {
		PageFactory.initElements(Constant.driver, LoginPage.class);
		PageFactory.initElements(Constant.driver, WelcomePage.class);
		PageFactory.initElements(Constant.driver, MapPage.class);
		PageFactory.initElements(Constant.driver, MapPage.Maptab.class);
		PageFactory.initElements(Constant.driver, MapPage.Fleettab.class);
		PageFactory.initElements(Constant.driver, MapPage.SVRUnitsTab.class);
		PageFactory.initElements(Constant.driver, MapPage.NavigatorsTab.class);
		PageFactory.initElements(Constant.driver, MapPage.LocatorsOnlyTab.class);
		PageFactory.initElements(Constant.driver, ForgotPasswordPage.class);	
		PageFactory.initElements(Constant.driver, VerifyCodePage.class);
		PageFactory.initElements(Constant.driver, ForgotPasswordSubUserPage.class);
		PageFactory.initElements(Constant.driver, SignUpPage.class);
		PageFactory.initElements(Constant.driver, GetMyLoginPage.class);
		PageFactory.initElements(Constant.driver, GooglePlayCartrack.class);
		PageFactory.initElements(Constant.driver, AppStoreCartrack.class);
		PageFactory.initElements(Constant.driver, ListPage.class);
		PageFactory.initElements(Constant.driver, ListPage.Vehiclestab.class);
		PageFactory.initElements(Constant.driver, ListPage.Driverstab.class);
		PageFactory.initElements(Constant.driver, ListPage.POItab.class);
		PageFactory.initElements(Constant.driver, ListPage.Geofencestab.class);
		PageFactory.initElements(Constant.driver, ListPage.Routestab.class);
		PageFactory.initElements(Constant.driver, ListPage.Trailerstab.class);
		PageFactory.initElements(Constant.driver, ListPage.AssetTrackerstab.class);
		PageFactory.initElements(Constant.driver, ListPage.DVIRStab.class);
		PageFactory.initElements(Constant.driver, MapPage.AssetTrackerTab.class);
		PageFactory.initElements(Constant.driver, ReportsPage.class);
		PageFactory.initElements(Constant.driver, ReportsPage.FavoritesTab.class);
		PageFactory.initElements(Constant.driver, ReportsPage.InformationTab.class);
		PageFactory.initElements(Constant.driver, ReportsPage.SetupTab.class);
		PageFactory.initElements(Constant.driver, ReportsPage.CutomiseTab.class);
		PageFactory.initElements(Constant.driver, SettingsPage.class);
		PageFactory.initElements(Constant.driver, SettingsPage.ProfileSettingsTab.class);
		PageFactory.initElements(Constant.driver, SettingsPage.ManageUsersTab.class);
		PageFactory.initElements(Constant.driver, SettingsPage.ImportsDataTab.class);
		PageFactory.initElements(Constant.driver, SettingsPage.ImportsDataTab.class);
		PageFactory.initElements(Constant.driver, ListPage.class);
		PageFactory.initElements(Constant.driver, ListPage.DriversPage.class);
		PageFactory.initElements(Constant.driver, ListPage.VehiclesPage.class);
		PageFactory.initElements(Constant.driver, ListPage.POIPage.class);
		PageFactory.initElements(Constant.driver, ListPage.GeofencesPage.class);
		PageFactory.initElements(Constant.driver, ListPage.RoutesPage.class);
		PageFactory.initElements(Constant.driver, NotificationPage.class);
		PageFactory.initElements(Constant.driver, NotificationPage.ActiveTab.class);
		PageFactory.initElements(Constant.driver, NotificationPage.AddAlertTab.class);
		PageFactory.initElements(Constant.driver, NotificationPage.FeedTab.class);
		PageFactory.initElements(Constant.driver, NotificationPage.RemindersTab.class);
		PageFactory.initElements(Constant.driver, NotificationPage.SMSTab.class);
		PageFactory.initElements(Constant.driver, NewPopoverPage.class);
		PageFactory.initElements(Constant.driver, DashboardPage.class);
		PageFactory.initElements(Constant.driver, DashboardPage.OverViewTab.class);
		PageFactory.initElements(Constant.driver, MiFleetPage.class);
		PageFactory.initElements(Constant.driver, MiFleetPage.FleetStatusTab.class);
		PageFactory.initElements(Constant.driver, MiFleetPage.FuellingTab.class);
		PageFactory.initElements(Constant.driver, CommunicatorPage.class);
		PageFactory.initElements(Constant.driver, MessagingPage.class);
		PageFactory.initElements(Constant.driver, EngineFaultsPage.class);
		PageFactory.initElements(Constant.driver, TrailersPage.class);
		
		
	}

	public static void click(WebElement webElement, @Optional("Y") String ScreenCapture) throws InterruptedException {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		String ObjectName = "";
		try {
			WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
			PageUtil.scrolltoElement(webElement);
			ObjectName = webElement.getText();
		} catch (Exception e) {
			Reporter.ReportEventCustomStatus("Unable to perform click to " + webElement.toString(), "warn", "Y");
			
		}

		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("value").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("title").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("innerText").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("aria-label").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("name").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("for").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("text").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("id").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("href").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("data-icon").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		try {
			webElement.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) Constant.driver;
			executor.executeScript("arguments[0].click();", webElement);
		}

		if (ScreenCapture.equalsIgnoreCase("Y")) {
			Reporter.attachedImage("Click the [" + ObjectName + "] button");
		} else if (ScreenCapture.equalsIgnoreCase("N")) {
			Reporter.ReportEventNoImage("Click the [" + ObjectName + "] button");
		}

	}
	
	public static void clickSVGElement(WebElement webElement, @Optional("Y") String ScreenCapture) throws InterruptedException {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		String ObjectName = "";
		try {
			WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
			PageUtil.scrolltoElement(webElement);
			ObjectName = webElement.getText();
		} catch (Exception e) {
			Reporter.ReportEventCustomStatus("Unable to perform click to " + webElement.toString(), "warn", "Y");
			
		}

		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("value").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("title").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("innerText").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("aria-label").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("name").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("for").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("text").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("id").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("href").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("data-icon").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		
		try {
			webElement.click();
		} catch (Exception e) {
			
		}

		if (ScreenCapture.equalsIgnoreCase("Y")) {
			Reporter.attachedImage("Click the [" + ObjectName + "] button");
		} else if (ScreenCapture.equalsIgnoreCase("N")) {
			Reporter.ReportEventNoImage("Click the [" + ObjectName + "] button");
		}

	}

	public static void sendkeys(WebElement webElement, String keys, @Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		PageUtil.scrolltoElement(webElement);

		try {
			webElement.sendKeys(keys);
		}catch (Exception e) {
			
		}
	
		String ObjectName = "null";
		try {
			ObjectName = webElement.getAttribute("placeholder").toString();
		} catch (Exception e) {
			ObjectName = "";
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("text").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("aria-label").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("name").toString();
			} catch (Exception e) {
				ObjectName = "WebElement";
			}
		}
		
		if (ScreenCapture.equalsIgnoreCase("Y")) {
			Reporter.attachedImage("Enter '" + keys + "' to {" + ObjectName + "} field");
		} else if (ScreenCapture.equalsIgnoreCase("N")) {
			Reporter.ReportEventNoImage("Enter '" + keys + "' to {" + ObjectName + "} field");
		}

	}

	public static void select(WebElement webElement, String value, @Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		PageUtil.scrolltoElement(webElement);
		Select select = new Select(webElement);
		select.selectByVisibleText(value);

		String ObjectName = "null";
		try {
			ObjectName = webElement.getAttribute("placeholder").toString();
		} catch (Exception e) {
			ObjectName = "";
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("text").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("aria-label").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("name").toString();
			} catch (Exception e) {
				ObjectName = "WebElement";
			}
		}

		if (ScreenCapture.equalsIgnoreCase("Y")) {
			Reporter.attachedImage("Selected '" + value + "' from {" + ObjectName + "} dropdown");
		} else if (ScreenCapture.equalsIgnoreCase("N")) {
			Reporter.ReportEventNoImage("Selected '" + value + "' from {" + ObjectName + "} dropdown");
		}

	}

	public static void selectByValue(WebElement webElement, String value, @Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		PageUtil.scrolltoElement(webElement);
		Select select = new Select(webElement);
		select.selectByValue(value);

		String ObjectName = "null";
		try {
			ObjectName = webElement.getAttribute("placeholder").toString();
		} catch (Exception e) {
			ObjectName = "";
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("text").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("aria-label").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("name").toString();
			} catch (Exception e) {
				ObjectName = "WebElement";
			}
		}

		if (ScreenCapture.equalsIgnoreCase("Y")) {
			Reporter.attachedImage("Selected '" + value + "' from {" + ObjectName + "} dropdown");
		} else if (ScreenCapture.equalsIgnoreCase("N")) {
			Reporter.ReportEventNoImage("Selected '" + value + "' from {" + ObjectName + "} dropdown");
		}

	}

	public static boolean isObjectDisplayed(WebElement webElement, String ObjectName,
			@Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		PageUtil.scrolltoElement(webElement);
		boolean objectdisplayed;
		if (ScreenCapture.equalsIgnoreCase("NA")) {
			Constant.WaitTime = false;
		}
		if (!Constant.WaitTime) {
			Constant.WaitTime = true;
			Constant.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			try {
				if (webElement.isDisplayed()) {
					objectdisplayed = true;
				} else {
					objectdisplayed = false;
				}
			} catch (Exception e) {
				objectdisplayed = false;
			}
		} else {
			try {
				WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
				wait.until(ExpectedConditions.visibilityOf(webElement));
				if (webElement.isDisplayed()) {
					objectdisplayed = true;
					PageUtil.scrolltoElement(webElement);
				} else {
					objectdisplayed = false;
				}
			} catch (Exception e) {
				objectdisplayed = false;
			}
		}
		if (objectdisplayed) {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImage("The {" + ObjectName + "} is displayed");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("The {" + ObjectName + "} is displayed");
			}

		} else {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImageFailed("The {" + ObjectName + "} is NOT displayed");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("The {" + ObjectName + "} is NOT displayed");
			}
		}

		return objectdisplayed;
	}

	public static boolean isDisplayed(WebElement webElement, String ObjectName) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		boolean objectdisplayed;

		try {
			WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
			wait.until(ExpectedConditions.visibilityOf(webElement));
			if (webElement.isDisplayed()) {
				objectdisplayed = true;
				PageUtil.scrolltoElement(webElement);
			} else {
				objectdisplayed = false;
			}
		} catch (Exception e) {
			objectdisplayed = false;
		}

		return objectdisplayed;
	}

public static void clear(String browser, WebElement webElement, @Optional("Y") String ScreenCapture) {
		
		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		switch(browser) {	
		case "firefox":
			webElement.click();
			webElement.clear();
		break;
		
		case "msedge":
			if(!webElement.getAttribute("value").isEmpty()) {
	            // clear field, if not already empty 
				webElement.sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.BACK_SPACE );
			}
		break;
			
		default:
			webElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			webElement.sendKeys(Keys.chord(Keys.DELETE));
		break;
		}
			
		String ObjectName = "null";
		try {
			ObjectName = webElement.getAttribute("placeholder").toString();
		} catch (Exception e) {
			ObjectName = "";
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("text").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("aria-label").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("name").toString();
			} catch (Exception e) {
				ObjectName = "WebElement";
			}
		}
		
		if (ScreenCapture.equalsIgnoreCase("Y")) {
			Reporter.attachedImage("{" + ObjectName + "} is cleared with value");
		} else if (ScreenCapture.equalsIgnoreCase("N")) {
			Reporter.ReportEventNoImage("{" + ObjectName + "} is cleared with value");
		}
	
	}
	
	public static void cleardropdownfield(WebElement webElement, @Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		webElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));

		String ObjectName = "null";
		try {
			ObjectName = webElement.getAttribute("placeholder").toString();
		} catch (Exception e) {
			ObjectName = "";
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("text").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("aria-label").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("name").toString();
			} catch (Exception e) {
				ObjectName = "WebElement";
			}
		}
		
		if (ScreenCapture.equalsIgnoreCase("Y")) {
			Reporter.attachedImage("{" + ObjectName + "} is cleared with value");
		} else if (ScreenCapture.equalsIgnoreCase("N")) {
			Reporter.ReportEventNoImage("{" + ObjectName + "} is cleared with value");
		}

	}
	
	public static void keyPress(Keys keystroke) throws InterruptedException {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);

		Actions action = new Actions(Constant.driver);
		action.sendKeys(keystroke).build().perform();
		Thread.sleep(1000);
		Reporter.ReportEventNoImage("[" + keystroke.name() + "] key is pressed.");

	}

	public static boolean isContainingText(WebElement webElement, String TextString, String ObjectName,
			@Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		PageUtil.scrolltoElement(webElement);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		boolean containtext = false;
		if (ScreenCapture.equalsIgnoreCase("NA")) {
			Constant.WaitTime = false;
		}
		if (!Constant.WaitTime) {
			Constant.WaitTime = true;
			Constant.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			try {
				System.out.println(webElement.getText() + " -- " + TextString);
				if (webElement.getText().contains((TextString))) {
					containtext = true;
					PageUtil.scrolltoElement(webElement);
				} else {
					containtext = false;
				}
			} catch (Exception e) {
				containtext = false;
			}

		} else {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(webElement));
				containtext = webElement.getText().toLowerCase().contains((TextString.toLowerCase()));
				// System.out.println(webElement.getText().toLowerCase().contains((TextString.toLowerCase())));
				PageUtil.scrolltoElement(webElement);
			} catch (Exception e) {
				containtext = false;
			}
		}
		if (containtext) {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImage("{" + ObjectName + "} string " + webElement.getText() + " contains '"
						+ TextString + "' string");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("{" + ObjectName + "} string " + webElement.getText() + " contains '"
						+ TextString + "' string");
			}
			return true;
		} else {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImageFailed("{" + ObjectName + "} does not contain '" + TextString + "' string");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("{" + ObjectName + "} does not contain '" + TextString + "' string");
			}
			return false;
		}

	}

	public static boolean isContainingValue(WebElement webElement, String Value, String ObjectName,
			@Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		boolean containtext = false;
		if (ScreenCapture.equalsIgnoreCase("NA")) {
			Constant.WaitTime = false;
		}
		if (!Constant.WaitTime) {
			Constant.WaitTime = true;
			Constant.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			try {
				if (webElement.getAttribute("value").contains((Value))) {
					containtext = true;
					PageUtil.scrolltoElement(webElement);
				} else {
					containtext = false;
				}
			} catch (Exception e) {
				containtext = false;
			}
		} else {
			try {
				containtext = webElement.getAttribute("value").toLowerCase().contains((Value.toLowerCase()));
				// System.out.println(webElement.getText().toLowerCase().contains((TextString.toLowerCase())));
				wait.until(ExpectedConditions.elementToBeClickable(webElement));
				PageUtil.scrolltoElement(webElement);
			} catch (Exception e) {
				containtext = false;
			}
		}
		if (containtext) {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImage("{" + ObjectName + "} value " + webElement.getAttribute("value") + " contains '"
						+ Value + "' string");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("{" + ObjectName + "} value " + webElement.getAttribute("value")
						+ " contains '" + Value + "' string");
			}
			return true;
		} else {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImageFailed("{" + ObjectName + "} does not contain '" + Value + "' string");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("{" + ObjectName + "} does not contain '" + Value + "' string");
			}
			return false;
		}

	}

	public static boolean isEqualText(WebElement webElement, String TextString, String ObjectName,
			@Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		String ElementText = "";
		boolean Skip = false;
		try {
			Skip = false;
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
			ElementText = webElement.getText();
			PageUtil.scrolltoElement(webElement);
			if (ElementText == "" || ElementText == " " || ElementText.isEmpty()) {
				ElementText = webElement.getAttribute("value");
				ElementText = ElementText.toString();
				// System.out.println("getText return nothing but got this -- "
				// +ElementText);
			}
		} catch (Exception e) {
			Reporter.ReportEventCustomStatus("The element " + webElement + "is not displayed", "warn", "Y");
			Skip = true;
		}
		if (Skip == false) {
			if (ElementText.equalsIgnoreCase(TextString)) {
				if (ScreenCapture.equalsIgnoreCase("Y")) {
					Reporter.attachedImage("{" + ObjectName + "} text captured  " + ElementText + " is EQUAL to '"
							+ TextString + "' string");
				} else if (ScreenCapture.equalsIgnoreCase("N")) {
					Reporter.ReportEventNoImage("{" + ObjectName + "} text captured " + ElementText + " is EQUAL to '"
							+ TextString + "' string");
				}
				return true;
			} else {
				if (ScreenCapture.equalsIgnoreCase("Y")) {
					Reporter.attachedImageFailed("{" + ObjectName + "} text captured " + ElementText
							+ " is NOT equal to '" + TextString + "' string");
				} else if (ScreenCapture.equalsIgnoreCase("N")) {
					Reporter.ReportEventNoImage("{" + ObjectName + "} text captured " + ElementText
							+ " is NOT equal to '" + TextString + "' string");
				}
				return false;
			}
		} else {
			return false;
		}

	}

	public static boolean isEqualTextSelected(WebElement webElement, String TextString, String ObjectName,
			@Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		String ElementText = "";
		try {
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
			Select select = new Select(webElement);
			WebElement selected = select.getFirstSelectedOption();
			ElementText = selected.getText();

			PageUtil.scrolltoElement(webElement);
			if (ElementText == "" || ElementText == " " || ElementText.isEmpty()) {
				ElementText = webElement.getAttribute("value");
				ElementText = ElementText.toString();
				// System.out.println("getText return nothing but got this -- "
				// +ElementText);
			}
		} catch (Exception e) {
			Reporter.ReportEventCustomStatus("The element " + webElement + "is not displayed", "warn", "Y");
		}

		if (ElementText.equalsIgnoreCase(TextString)) {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImage("{" + ObjectName + "} text captured " + ElementText + " is EQUAL to '"
						+ TextString + "' string");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("{" + ObjectName + "} text captured " + ElementText + " is EQUAL to '"
						+ TextString + "' string");
			}
			return true;
		} else {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImageFailed("{" + ObjectName + "} text captured " + ElementText + " is NOT equal to '"
						+ TextString + "' string");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("{" + ObjectName + "} text captured " + ElementText + " is NOT equal to '"
						+ TextString + "' string");
			}
			return false;
		}

	}

	public static boolean isSelectedContainingText(WebElement webElement, String TextString, String ObjectName,
			@Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		String ElementText = "";
		try {
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
			Select select = new Select(webElement);
			WebElement selected = select.getFirstSelectedOption();
			ElementText = selected.getText();

			PageUtil.scrolltoElement(webElement);
			if (ElementText == "" || ElementText == " " || ElementText.isEmpty()) {
				ElementText = webElement.getAttribute("value");
				ElementText = ElementText.toString();
				// System.out.println("getText return nothing but got this -- "
				// +ElementText);
			}
		} catch (Exception e) {
			Reporter.ReportEventCustomStatus("The element " + webElement + "is not displayed", "warn", "Y");
		}

		if (ElementText.contains(TextString)) {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImage("{" + ObjectName + "} text captured " + ElementText + " is containing '"
						+ TextString + "' string");
			} 
			if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("{" + ObjectName + "} text captured " + ElementText + " is containing '"
						+ TextString + "' string");
			}
			return true;
		} else {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImageFailed("{" + ObjectName + "} text captured " + ElementText + " does NOT contain '"
						+ TextString + "' string");
			} 
			if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("{" + ObjectName + "} text captured " + ElementText + " does NOT contain '"
						+ TextString + "' string");
			}
			return false;
		}

	}

	public static void selectRadio(By by, String selection, @Optional("Y") String ScreenCapture) {

		try {
			List<WebElement> radio = Constant.driver.findElements(by);

			for (int i = 0; i <= radio.size(); i++) {
				// System.out.println(radio.get(i).getText());
				if (radio.get(i).getText().contains(selection)) {
					DoThis.click(radio.get(i), "Y");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("No Radio button with the selection found -- " + selection);
		}

	}

	public static void selectCombo(By by, String selection, @Optional("Y") String ScreenCapture) {

		try {
			List<WebElement> radio = Constant.driver.findElements(by);

			for (int i = 0; i <= radio.size(); i++) {
				// System.out.println(radio.get(i).getText());
				if (radio.get(i).getText().contains(selection)) {
					DoThis.click(radio.get(i), "Y");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("No  selection found -- " + selection);
		}

	}

	public static void customSelectDropdown(WebElement iframe, String selection) throws InterruptedException {

		Constant.driver.switchTo().frame(iframe);
		DoThis.selectCombo(By.xpath("//html/body/div/ul/li"), selection, "Y");
		Constant.driver.switchTo().defaultContent();

	}

	public static String getAttribute(WebElement webElement, String AttributeName) {

		try {
			Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
			wait.until(ExpectedConditions.visibilityOf(webElement));
		} catch (Exception e) {
		}
		PageUtil.scrolltoElement(webElement);
		String AttributeValue = webElement.getAttribute(AttributeName);
//		System.out.println(AttributeValue + "--getattribute");
		return AttributeValue;

	}

	public static String getText(WebElement webElement) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		Constant.driver.manage().timeouts().pageLoadTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		Constant.driver.manage().timeouts().implicitlyWait(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		// PageUtil.scrolltoElement(webElement);

		// System.out.println(AttributeValue);
		return webElement.getText();

	}
	
	public static String getHiddenText(WebElement webElement) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		Constant.driver.manage().timeouts().pageLoadTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		Constant.driver.manage().timeouts().implicitlyWait(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		return webElement.getText();

	}


	public static String getSwitchStatus(WebElement webElement) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		PageUtil.scrolltoElement(webElement);

		if (webElement.getAttribute("checked") != null) {
			// System.out.println(webElement.getAttribute("checked")+" kapag
			// true");
			return webElement.getAttribute("checked");

		} else {
			// System.out.println(webElement.getAttribute("checked")+" kapag
			// false");
			return "false";
		}

	}

	public static void uploadFile(String browser, WebElement InputObject, String FilePath, @Optional("Y") String ScreenCapture)
			throws InterruptedException {

		ConfigReader config = new ConfigReader();
	   	if(config.getPlatform().equals("linux")) {
	   		FilePath = FilePath.replace("\\", "/");
    	}
		if (config.getTestBed().equals("headless")) {
			switch (browser) {
			
			case "firefox":
				InputObject.sendKeys(FilePath);
			break;
			
			default:
				String Xpath = PageUtil.getXpath(InputObject);
				WebElement El = Constant.driver.findElement(By.xpath(Xpath));
				((RemoteWebElement) El).setFileDetector(new LocalFileDetector());
				El.sendKeys(FilePath);
			break;
			}
			
			Reporter.ReportEventCustomStatus("Uploaded the file from -- " + FilePath, "info", "N");
		} else {
			InputObject.sendKeys(FilePath);
			Reporter.ReportEventCustomStatus("Uploaded the file from -- " + FilePath, "info", "N");
		}

		Thread.sleep(2000);

	}

	public static void uploadFilename(String FilenamePath, @Optional("Y") String ScreenCapture)
			throws FindFailed, HeadlessException, AWTException, IOException, InterruptedException {

		// extract the filename
		int startchar = FilenamePath.lastIndexOf("\\");
		String Filename = FilenamePath.substring(startchar + 1, FilenamePath.length() - 4);
		Filename = Filename + ".exe";
		System.out.println("Filename is "+Filename);
		Thread.sleep(4000);
		String FilePath = System.getProperty("user.dir") + "\\resources\\autoit_exe\\";

	  	ConfigReader config = new ConfigReader();
		if(config.getPlatform().equals("linux")) {
			FilePath = FilePath.replace("\\", "/");
		}
		System.out.println("FilePath + Filename is "+FilePath + Filename);
		Runtime.getRuntime().exec(FilePath + Filename);
		
		Thread.sleep(2000);

		/*
		 * //sikuli dependency due to selenium grid run. tc3,4,5,6,14, 54,71
		 * still dependent Screen screen = new Screen();
		 * 
		 * Pattern filename = new Pattern(System.getProperty("user.dir") +
		 * "\\resources\\Filename.jpg"); Pattern open = new
		 * Pattern(System.getProperty("user.dir") + "\\resources\\Open.jpg");
		 * 
		 * screen.wait(filename, 10); screen.type(filename, FilenamePath);
		 * 
		 * if(ScreenCapture.equalsIgnoreCase("Y")) {
		 * Reporter.attachedDesktopImage("Filename from " +FilenamePath+
		 * " is uploaded"); }else if(ScreenCapture.equalsIgnoreCase("N")){
		 * Reporter.ReportEventNoImage("Filename from " +FilenamePath+
		 * " is uploaded"); }
		 * 
		 * screen.click(open); Thread.sleep(2000);
		 */

	}

	public static String getWebTableRowText(String XPathTable, String TableValue, int ColumnOfTableToGetText) {

		List<WebElement> TotalRowCount = Constant.driver.findElements(By.xpath(XPathTable + "/tr"));
		int RowIndex = 1;
		String RowElementText = "";
		for (WebElement rowElement : TotalRowCount) {
			if (rowElement.getText().contains(TableValue)) {
				Constant.currentLocator = By
						.xpath(XPathTable + "/tr[" + RowIndex + "]/td[" + ColumnOfTableToGetText + "]/a");
				RowElementText = rowElement.getText();
				return RowElementText;
			}
			RowIndex = RowIndex + 1;
		}
		System.out.println("getWebTableRowText -- " + "no value");
		return "no value";
	}

	public static WebElement getWebTableRowElement(String XPathTable, String TableValue,
			int ColumnOfTableToGetElement) {

		try {
			Thread.sleep(2000);
			if (Constant.driver.findElement(By.xpath(XPathTable)).isDisplayed()) {
				List<WebElement> Table = Constant.driver.findElements(By.xpath(XPathTable + "/tr"));
				// System.out.println(Table.size());
				WebElement element;
				for (int i = 1; i <= Table.size(); i++) {
					if (ColumnOfTableToGetElement == 0) {
						Constant.currentLocator = By.xpath(XPathTable + "/tr[" + i + "]");
						element = Constant.driver.findElement(Constant.currentLocator);
						if (element.getText().contains(TableValue)) {
							return element;
						}
					}
					Constant.currentLocator = By
							.xpath(XPathTable + "/tr[" + i + "]/td[" + ColumnOfTableToGetElement + "]/descendant::a"); // remove
																														// /a
					element = Constant.driver.findElement(Constant.currentLocator);
					if (element.getText().contains(TableValue)) {
						return element;
					}
				}
			}
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static WebElement getWebTableRowElementFromBottom(String XPathTable, String TableValue,
			int ColumnOfTableToGetElement) {

		try {

			if (Constant.driver.findElement(By.xpath(XPathTable)).isDisplayed()) {
				List<WebElement> Table = Constant.driver.findElements(By.xpath(XPathTable + "/tr"));
				System.out.println(Table.size());
				WebElement element;
				for (int i = Table.size(); i >= 1; i--) {
					if (ColumnOfTableToGetElement == 0) {
						Constant.currentLocator = By.xpath(XPathTable + "/tr[" + i + "]");
						element = Constant.driver.findElement(Constant.currentLocator);
						if (element.getText().contains(TableValue)) {
							return element;
						}
					}
					Constant.currentLocator = By
							.xpath(XPathTable + "/tr[" + i + "]/td[" + ColumnOfTableToGetElement + "]/descendant::a"); // remove
																														// /a
					element = Constant.driver.findElement(Constant.currentLocator);
					if (element.getText().contains(TableValue)) {
						return element;
					}
				}
			}
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static WebElement customGetWebTableRowElement(String XPathTable, String TableValue,
			int ColumnOfTableToGetElement, String AppendingXpathReturn) {

		try {

			if (Constant.driver.findElement(By.xpath(XPathTable)).isDisplayed()) {
				List<WebElement> Table = Constant.driver.findElements(By.xpath(XPathTable + "/tr"));
				// System.out.println(Table.size());
				WebElement element;
				for (int i = 1; i <= Table.size(); i++) {

					if (ColumnOfTableToGetElement == 0) {
						Constant.currentLocator = By.xpath(XPathTable + "/tr[" + i + "]");
						element = Constant.driver.findElement(Constant.currentLocator);
						if (element.getText().contains(TableValue)) {
							return element;
						}
					}
					Constant.currentLocator = By.xpath(XPathTable + "/tr[" + i + "]");/// td["
																						/// +
																						/// ColumnOfTableToGetElement
																						/// +"]");
																						/// //remove
																						/// /a
					element = Constant.driver.findElement(Constant.currentLocator);
					// System.out.println(element.getText());
					if (element.getText().contains(TableValue)) {
						if (AppendingXpathReturn.contains("nochild")) {
							Constant.currentLocator = By
									.xpath(XPathTable + "/tr[" + i + "]/td[" + ColumnOfTableToGetElement + "]");
							element = Constant.driver.findElement(Constant.currentLocator);
							return element;
						} else if (AppendingXpathReturn.contains("span")) {
							Constant.currentLocator = By
									.xpath(XPathTable + "/tr[" + i + "]/td[" + ColumnOfTableToGetElement + "]/span");
							element = Constant.driver.findElement(Constant.currentLocator);
							return element;
						}
						Constant.currentLocator = By.xpath(XPathTable + "/tr[" + i + "]/td[" + ColumnOfTableToGetElement
								+ "]/descendant::" + AppendingXpathReturn); // remove
																			// /a
						element = Constant.driver.findElement(Constant.currentLocator);
						return element;
					}

				}
			}
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void clickAllWebTableRowElement(String XPathTable, String TableValue, int ColumnOfTableToGetElement)
			throws InterruptedException {

		List<WebElement> TotalRowCount = Constant.driver.findElements(By.xpath(XPathTable));
		int RowIndex = 1;
		for (WebElement rowElement : TotalRowCount) {
			if (rowElement.getText().contains(TableValue)) {
				Constant.currentLocator = By
						.xpath(XPathTable + "[" + RowIndex + "]/td[" + ColumnOfTableToGetElement + "]/i");
				DoThis.click(Constant.driver.findElement(Constant.currentLocator), "Y");
			}
			RowIndex = RowIndex + 1;
		}

	}

	public static void checkWebTableContainText(String TableXpath, String TextString) {
		By Locator = By.xpath(TableXpath + "/tr");

		List<WebElement> TableList = Constant.driver.findElements(Locator);
		int RowIndex = 1;
		for (int i = 0; i < TableList.size(); i++) {

			if (!TableList.get(i).getText().isEmpty()) {
				if (!TableList.get(i).getText().contains(TextString)) {
					Constant.currentLocator = By.xpath(TableXpath + "/tr[" + RowIndex + "]");
					Constant.webElement = TableList.get(i);
					try {
						PageUtil.scrolltoElement(Constant.webElement);
					} catch (Exception e) {
					}
					Reporter.attachedImageFailed("Webtable filtering - " + TableList.get(i).getText()
							+ " --does not contain a string-- " + TextString);
					// break;
				} else {
					Constant.currentLocator = By.xpath(TableXpath + "/tr[" + RowIndex + "]");
					Constant.webElement = TableList.get(i);
					try {
						PageUtil.scrolltoElement(Constant.webElement);
					} catch (Exception e) {
					}
					Reporter.attachedImage("Webtable filtering - " + TableList.get(i).getText()
							+ " --contain a string-- " + TextString);
				}
			}

			RowIndex = RowIndex + 1;

		}
	}

	public static void Wait(WebElement elementToWait) {

		WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(elementToWait));
		try {
			PageUtil.scrolltoElement(elementToWait);
		} catch (Exception e) {
		}

	}

	public static void detectSpinners() {

		List<WebElement> spinners = Constant.driver
				.findElements(By.xpath("//section[@id=\"content\"]/descendant::i[@class=\"fa fa-spinner fa-pulse\"]"));
		for (WebElement spinner : spinners) {
			System.out.println(spinner.isDisplayed());
			System.out.println(spinner.getText());
		}

	}

	public static void Hover(WebElement hoverToElement) {
		
		
		Actions action = new Actions(Constant.driver);
		try {
			action.moveToElement(hoverToElement).perform();
			PageUtil.scrolltoElement(hoverToElement);
		} catch (Exception e) {
		}
	}

	public static boolean isItemContainOnList(List<WebElement> List, String objectName) {

		for (WebElement rowElement : List) {
			try {
				WebElement parent = rowElement.findElement(By.xpath(".."));
				PageUtil.scrolltoElement(parent);
				if (rowElement.getText().contains(objectName)) {
					PageUtil.scrolltoElement(rowElement);
					return true;
				}
			} catch (Exception e) {
				return false;
			}
		}

		return false;

	}

	public static boolean isAttributePresent(WebElement webElement, String attribute, @Optional("Y") String ScreenCapture) {
		Boolean result = false;
		String ObjectName = "";
		try {
			String value = webElement.getAttribute(attribute);
			
			if (value != null) {
				result = true;
			}
		} catch (Exception e) {
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("value").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("title").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("innerText").toString();
			} catch (Exception e) {
				ObjectName = "";
			}
		}
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("aria-label").toString();
			} catch (Exception e) {
				ObjectName = "WebElement";
			}
		}
		
		if (ObjectName == "" || ObjectName == "null" || ObjectName.isEmpty()) {
			try {
				ObjectName = webElement.getAttribute("label").toString();
			} catch (Exception e) {
				ObjectName = "WebElement";
			}
		}
		
		if (ScreenCapture.equalsIgnoreCase("Y")) {
			Reporter.attachedImage(ObjectName + " is a " + attribute);
		} else if (ScreenCapture.equalsIgnoreCase("N")) {
			Reporter.ReportEventNoImage(ObjectName + " is a " + attribute);

		}
		return result;

	}

	public static boolean isObjectNotDisplayed(WebElement webElement, String ObjectName,
			@Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		boolean objectnotdisplayed;
		if (ScreenCapture.equalsIgnoreCase("NA")) {
			Constant.WaitTime = false;
		}
		if (!Constant.WaitTime) {
			Constant.WaitTime = true;
			Constant.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			try {
				if (webElement.isDisplayed()) {
					objectnotdisplayed = false;
				} else {
					objectnotdisplayed = true;
				}
			} catch (Exception e) {
				objectnotdisplayed = true;
			}
		} else {
			try {
				WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
				wait.until(ExpectedConditions.visibilityOf(webElement));
				if (webElement.isDisplayed()) {
					objectnotdisplayed = false;
					PageUtil.scrolltoElement(webElement);
				} else {
					objectnotdisplayed = true;
				}
			} catch (Exception e) {
				objectnotdisplayed = true;
			}
		}
		if (objectnotdisplayed) {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImage("The {" + ObjectName + "} is NOT displayed");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("The {" + ObjectName + "} is NOT displayed");
			}

		} else {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImageFailed("The {" + ObjectName + "} is displayed");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("The {" + ObjectName + "} is displayed");
			}
		}

		return objectnotdisplayed;
	}
	
	public static void isElementListSortedAsc(List<WebElement> webElements) {
		
		//Sort first 7 from the Vehicle List
		ArrayList<String> obtainedList = new ArrayList<>();
		for(int i=0; i<7; i++) {
			obtainedList.add(DoThis.getText(webElements.get(i)));
			
		}

		ArrayList<String> sortedList = new ArrayList<>();
		for(String s:obtainedList){
		sortedList.add(s);
		}	

		Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER);	
		Reporter.ReportEventNoImage("sortedList "+sortedList);
		Reporter.ReportEventNoImage("obtainedList "+obtainedList);
		Assert.assertTrue(sortedList.toString().equals(obtainedList.toString()));
		Reporter.ReportEventNoImage("The {" +webElements.get(0).getAttribute("class").toString()+ "} is sorted alphabetically in Ascending Order");
				
	}
	
	public static void isElementListSortedDesc(List<WebElement> webElements) {
		
		ArrayList<String> obtainedList = new ArrayList<>();
		for(WebElement we:webElements){
		   obtainedList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<>();
		for(String s:obtainedList){
		sortedList.add(s);
		}
		Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER.reversed());
		Assert.assertTrue(sortedList.toString().equals(obtainedList.toString()));
		Reporter.ReportEventNoImage("The {" +webElements.get(0).getAttribute("class").toString()+ "} is sorted alphabetically in Descending Order");

		Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER);
		Assert.assertTrue(sortedList.toString().equals(obtainedList.toString()));
		Reporter.ReportEventNoImage("The {" +webElements.get(0).getAttribute("class").toString()+ "} is sorted alphabetically");

	}

	
	
	public static void refreshBrowser() {
		Constant.driver.navigate().refresh();
		Constant.logger.info("Browser was refreshed.");
		Constant.logger.info("Step " + Constant.ReportStepNumber + " - " + "Browser was refreshed.");
		Reporter.ReportEventNoImage("Browser was refreshed.");
	}
	
	public static void refreshBrowserfirefox() {
		Actions action = new Actions(Constant.driver);   
		action.keyDown(Keys.SHIFT)
		  	  .keyDown(Keys.CONTROL)
		      .sendKeys("r")
		      .build()
		      .perform();
		Constant.logger.info("Browser was refreshed.");
		Constant.logger.info("Step " + Constant.ReportStepNumber + " - " + "Firefox Browser was refreshed.");
		Reporter.ReportEventNoImage("Firefox Browser was refreshed.");
	}
	
	public static void appendtoURL() {
		Constant.driver.navigate().refresh();
		Constant.logger.info("Browser was refreshed.");
		Constant.logger.info("Step " + Constant.ReportStepNumber + " - " + "Browser was refreshed.");
		System.out.println("Step " + Constant.ReportStepNumber + " - " + "Browser was refreshed.");
	}
	
    public static int randomDigit(){
    	Random rand = new Random();
    	int n = rand.nextInt(50) + 1;
           System.out.println("Code generated:"  +n);
           return n;
    }
    
    public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) throws IOException{
    	
    	Actions builder = new Actions(Constant.driver);

    	Action dragAndDrop = builder.clickAndHold(sourceElement)
    	   .moveToElement(targetElement)
    	   .release(targetElement)
    	   .build();

    	dragAndDrop.perform();
    	
    }
    
    public static void ComparetwoString (String string1, String string2) {
    	if(string1.equals(string2)) {
     		Reporter.ReportEventNoImage(string1.toString()+" is equal to "+string2.toString());
     	}else {
     		Reporter.ReportEventNoImage(string1.toString()+" is NOT equal to "+string2.toString());
     		assertTrue(false);
     	}
    }
    
  
    public static void ComparetwoInteger (int int1, String ObjectName1, int int2, String ObjectName2) {
    	if(int1 == int2) {
     		Reporter.ReportEventNoImage(ObjectName1+" is equal to "+ObjectName2);
     	}else {
     		Reporter.ReportEventNoImage(ObjectName1+" is NOT equal to "+ObjectName2);
     		assertTrue(false);
     	}
    }
    
    
    public static void WaitForElementToLoad(WebElement webElement)
    {
    	//Check Elements every 1 sec for 120 secs
        WebDriverWait wait = new WebDriverWait(Constant.driver, 120);
        wait.pollingEvery(1, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        
    }
    
    public static void WaitMoreTimeForElementToLoad(WebElement webElement)
    {
    	//Check Elements every 1 sec for 180 secs
        WebDriverWait wait = new WebDriverWait(Constant.driver, 180);
        wait.pollingEvery(1, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        
    }
    
    public static void WaitForElementNotToLoad(WebElement webElement)
    {
    	//Check Elements every 1 sec for 90 secs
        WebDriverWait wait = new WebDriverWait(Constant.driver, 90);
        wait.pollingEvery(1, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        
    }
        
    public static String getCheckedStatus(WebElement webElement) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		PageUtil.scrolltoElement(webElement);

		if (webElement.getAttribute("value") != null) {
			return webElement.getAttribute("value");
		} else {
			return "false";
		}
		
		
	}
    
    public static String getCurrentDate(String activesite) {

    	DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");

        Date date = new Date();
        String todate = null;
        switch (activesite) {
        case "US":
        
        
        	// Use America/Los_Angeles's time zone to format the date in
            dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
            todate = dateFormat.format(date);
        break;
        
        default:
        	//Get System timezone
        	todate = dateFormat.format(date);
        }
  
    	return todate;
    	
    }
    
    public static String getCurrentTime() {
		
    	
    	DateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        Date date = new Date();
        String todate = dateFormat.format(date);

    	return todate;
    	
    }
    
    public static String getAWeekBeforeDate() {
		
    	
    	DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");

        Date date = new Date();
        String todate = dateFormat.format(date);
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        Date todate1 = cal.getTime();    
        String fromdate = dateFormat.format(todate1);
    	
    	return fromdate;
    	
    }
    
    public static String get2WeeksBeforeDate() {
		
    	
    	DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");

        Date date = new Date();
        String todate = dateFormat.format(date);
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -14);
        Date todate1 = cal.getTime();    
        String fromdate = dateFormat.format(todate1);
    	
    	return fromdate;
    	
    }

    public static String get2WeeksAfterDate() {
		
    	
    	DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");

        Date date = new Date();
        String todate = dateFormat.format(date);
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, +14);
        Date todate1 = cal.getTime();    
        String fromdate = dateFormat.format(todate1);
    	
    	return fromdate;
    	
    }
    
    public static String getAWeekAfterDate() {
		
    	
    	DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");

        Date date = new Date();
        String todate = dateFormat.format(date);
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, +7);
        Date todate1 = cal.getTime();    
        String fromdate = dateFormat.format(todate1);
    	
    	return fromdate;
    	
    }

 
    public static String getAMonthBeforeDate() {

		
    	DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");

        Date date = new Date();
        String todate = dateFormat.format(date);
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -30);

        Date todate1 = cal.getTime();    
        String fromdate = dateFormat.format(todate1);
    	
    	return fromdate;
    	
    }
    

    public static String getAMonthAfterDate() {
		
    	
    	DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");

        Date date = new Date();
        String todate = dateFormat.format(date);
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, +30);
        Date todate1 = cal.getTime();    
        String fromdate = dateFormat.format(todate1);
    	
    	return fromdate;
    	
    }
    
    public static String getYesterdayDate(String activesite) {
    	
    	DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");    
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date todate1 = cal.getTime();  
        String fromdate = null;
        switch (activesite) {
        case "US":
        
        
        // Use America/Los_Angeles's time zone to format the date in
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        fromdate = dateFormat.format(todate1);
        break;
        
        default:
        fromdate = dateFormat.format(todate1);
        break;
        	
        }
    		
    	return fromdate;
    	
    }
    
    public static String getTomorrowDate() {
		
    	DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");  
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        Date todate1 = cal.getTime();    
        String fromdate = dateFormat.format(todate1);

    	return fromdate;
    	
    }
    
    
    public static boolean isObjectAvailable(WebElement webElement, String ObjectName,
			@Optional("Y") String ScreenCapture) {

		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		boolean objectdisplayed;
		if (ScreenCapture.equalsIgnoreCase("NA")) {
			Constant.WaitTime = false;
		}
		if (!Constant.WaitTime) {
			Constant.WaitTime = true;
			Constant.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			try {
				if (webElement.isDisplayed()) {
					objectdisplayed = true;
				} else {
					objectdisplayed = false;
				}
			} catch (Exception e) {
				objectdisplayed = false;
			}
		} else {
			try {
				WebDriverWait wait = new WebDriverWait(Constant.driver, Constant.ScriptTimeOut);
				wait.until(ExpectedConditions.visibilityOf(webElement));
				if (webElement.isDisplayed()) {
					objectdisplayed = true;
					PageUtil.scrolltoElement(webElement);
				} else {
					objectdisplayed = false;
				}
			} catch (Exception e) {
				objectdisplayed = false;
			}
		}
		if (objectdisplayed) {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImage("The {" + ObjectName + "} is displayed");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("The {" + ObjectName + "} is displayed");
			}

		} else {
			if (ScreenCapture.equalsIgnoreCase("Y")) {
				Reporter.attachedImageFailed("The {" + ObjectName + "} is NOT displayed");
			} else if (ScreenCapture.equalsIgnoreCase("N")) {
				Reporter.ReportEventNoImage("The {" + ObjectName + "} is NOT displayed");
			}
		}

		return objectdisplayed;
	}
    
    
    public static void isFileDownloaded(String downloadPath, String fileName) throws InterruptedException, IOException  {
   
    	try {
    		ConfigReader config = new ConfigReader();
      	  if(config.getPlatform().equals("linux")) {
      		  downloadPath = downloadPath.replace("\\", "/");
      	  }
      	  File dir = new File(downloadPath);
      	  File[] dirContents = dir.listFiles();

      	  for (int i = 0; i < dirContents.length; i++) {
      	      if (dirContents[i].getName().equals(fileName)) {
      	          Reporter.ReportEventNoImage("File Name "+fileName+" is found in "+downloadPath);
      	          dirContents[i].delete();
      	      }
      	          }
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	  
    	  }
    
    public static void WaitForElementToBeClickable(WebElement webElement)
    {
        WebDriverWait wait = new WebDriverWait(Constant.driver, 120);
        wait.pollingEvery(1, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        
    }
    
    public static void DragAndDrop() throws InterruptedException, IOException{ 
    	try{
    			
			
    	        String basePath = new File("").getAbsolutePath();

		        final String JQUERY_LOAD_SCRIPT = (basePath + "/resources/helper/jquery_load_helper.js");
		        String jQueryLoader = readFile(JQUERY_LOAD_SCRIPT);

		        Constant.driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		        JavascriptExecutor js = (JavascriptExecutor) Constant.driver;
		        js.executeAsyncScript(
		                jQueryLoader);

		        // ready to rock
		        js.executeScript("jQuery(function($) { " + " $('input[name=\"q\"]').val('bada-bing').closest('form').submit(); "
		                + " }); ");
  
		      String filePath = basePath + "/resources/helper/drag_and_drop_helper.js";


		      //JQuery can ONLY work with id and css , xpath does NOT work with it.
		      String source = "div.CustomReports div.CustomReportRightPanel div.CustomReportRightPanel-content div.row.CustomReportRightPanel-dnd:nth-child(2) div.col-xs-6:nth-child(1) div.CustomReportRightPanel-dnd-source > div.CustomReportRightPanel-dnd-card:nth-child(3)";
		      String target =  "div.row.CustomReportRightPanel-dnd:nth-child(2) > div.col-xs-6:nth-child(2) > div"; //#bin";

		      StringBuffer buffer = new StringBuffer();
		      String line;
		      BufferedReader br = new BufferedReader(new FileReader(filePath));
		      while((line = br.readLine())!=null)
		          buffer.append(line);

		      String javaScript = buffer.toString();

		      javaScript = javaScript + "$('" + source + "').simulateDragDrop({ dropTarget: '" + target + "'});";
		      ((JavascriptExecutor)Constant.driver).executeScript(javaScript);


		      Thread.sleep(1000);
		      source = "section#wrapper article ul li:nth-child(2) a";
		      javaScript = javaScript + "$('" + source + "').simulateDragDrop({ dropTarget: '" + target + "'});";
		      ((JavascriptExecutor)Constant.driver).executeScript(javaScript);

		      Thread.sleep(1000);
		      source = "section#wrapper article ul li:nth-child(1) a";
		      javaScript = javaScript + "$('" + source + "').simulateDragDrop({ dropTarget: '" + target + "'});";
		      ((JavascriptExecutor)Constant.driver).executeScript(javaScript);

		      Thread.sleep(1000);
    	}catch(Exception e){
    		e.printStackTrace();
    	}

    }
    private static String readFile(String file) throws IOException {
        Charset cs = Charset.forName("UTF-8");
        FileInputStream stream = new FileInputStream(file);
        try {
            Reader reader = new BufferedReader(new InputStreamReader(stream, cs));
            StringBuilder builder = new StringBuilder();
            char[] buffer = new char[8192];
            int read;
            while ((read = reader.read(buffer, 0, buffer.length)) > 0) {
                builder.append(buffer, 0, read);
            }
            return builder.toString();
        } finally {
            stream.close();
        }
    }
    
    public static void DragAndDropPegman() throws InterruptedException, IOException{ 
    	
	    	try{
				
				
		        String basePath = new File("").getAbsolutePath();
	
		        final String JQUERY_LOAD_SCRIPT = (basePath + "/resources/helper/jquery_load_helper.js");
		        String jQueryLoader = readFile(JQUERY_LOAD_SCRIPT);
	
		        Constant.driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	
		        JavascriptExecutor js = (JavascriptExecutor) Constant.driver;
		        js.executeAsyncScript(
		                jQueryLoader);
	
		        // ready to rock
		        js.executeScript("jQuery(function($) { " + " $('input[name=\"q\"]').val('bada-bing').closest('form').submit(); "
		                + " }); ");
	
		      String filePath = basePath + "/resources/helper/drag_and_drop_helper.js";
	
	
		      //JQuery can ONLY work with id and css , xpath does NOT work with it.
		      String source = "div[class='gmnoprint gm-bundled-control']";
		      String target =  "body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > svg:nth-child(1) > svg:nth-child(1) > g:nth-child(2) > g:nth-child(1) > g:nth-child(1) > circle:nth-child(2)"; //#bin";
	
		      StringBuffer buffer = new StringBuffer();
		      String line;
		      BufferedReader br = new BufferedReader(new FileReader(filePath));
		      while((line = br.readLine())!=null)
		          buffer.append(line);
	
		      String javaScript = buffer.toString();
	
		      javaScript = javaScript + "$('" + source + "').simulateDragDrop({ dropTarget: '" + target + "'});";
		      ((JavascriptExecutor)Constant.driver).executeScript(javaScript);
	
		      Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}

    }
    
    public static String ClickAndPasteContentFromClipboardToString(WebElement webElement, String activesite) throws InterruptedException, IOException, UnsupportedFlavorException{
    	
   
    	String myText = null;
    	ConfigReader config = new ConfigReader();
    	activesite = activesite.toString();
    	
    	switch (config.getTestBed().toString()) {
    	case "local":
    		DoThis.click(webElement, "Y");
    		myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting the text that was copied to the clipboard
    		break;
    		
    	case "headless":
    		String Token = DoThis.getAttribute(SettingsPage.ProfileSettingsTab.txtbxToken, "value");
    		
    		String url = null;
    		switch(config.getEnvironmentToUse()) {
			case "":
				switch(activesite) {
				case("SG"): url = config.getSGDevURL();break;
				case("TH"): url = config.getTHDevURL();break;
				case("ZA"): url = config.getZADevURL();break;
				case("PT"): url = config.getPTDevURL();break;
				case("ID"): url = config.getIDDevURL();break;
				case("PL"): url = config.getPLDevURL();break;
				case("HK"): url = config.getHKDevURL();break;
				case("US"): url = config.getUSDevURL();break;
				case("ME"): url = config.getMEDevURL();break;
				case("MW"): url = config.getMWDevURL();break;
				case("MY"): url = config.getMYDevURL();break;
				case("MZ"): url = config.getMZDevURL();break;
				case("NZ"): url = config.getNZDevURL();break;
				case("AU"): url = config.getAUDevURL();break;
				case("SZ"): url = config.getSZDevURL();break;
				case("ZW"): url = config.getZWDevURL();break;
				case("ES"): url = config.getESDevURL();break;
				case("RW"): url = config.getRWDevURL();break;
				case("TZ"): url = config.getTZDevURL();break;
				case("NA"): url = config.getNADevURL();break;
				case("PH"): url = config.getPHDevURL();break;
				case("NG"): url = config.getNGDevURL();break;
				case("KE"): url = config.getKEDevURL();break;
				case("BW"): url = config.getBWDevURL();break;
				case("FR"): url = config.getFRDevURL();break;
				}
				break;
				
			case "Test":
				switch(activesite) {
				case("SG"): url = config.getSGTestURL();break;
				case("TH"): url = config.getTHTestURL();break;
				case("ZA"): url = config.getZATestURL();break;
				case("PT"): url = config.getPTTestURL();break;
				case("ID"): url = config.getIDTestURL();break;
				case("PL"): url = config.getPLTestURL();break;
				case("HK"): url = config.getHKTestURL();break;
				case("US"): url = config.getUSTestURL();break;
				case("ME"): url = config.getMETestURL();break;
				case("MW"): url = config.getMWTestURL();break;
				case("MY"): url = config.getMYTestURL();break;
				case("MZ"): url = config.getMZTestURL();break;
				case("NZ"): url = config.getNZTestURL();break;
				case("AU"): url = config.getAUTestURL();break;
				case("SZ"): url = config.getSZTestURL();break;
				case("ZW"): url = config.getZWTestURL();break;
				case("ES"): url = config.getESTestURL();break;
				case("RW"): url = config.getRWTestURL();break;
				case("TZ"): url = config.getTZTestURL();break;
				case("NA"): url = config.getNATestURL();break;
				case("PH"): url = config.getPHTestURL();break;
				case("NG"): url = config.getNGTestURL();break;
				case("KE"): url = config.getKETestURL();break;
				case("BW"): url = config.getBWTestURL();break;
				case("FR"): url = config.getFRTestURL();break;					
				}
				break;
			case "Prod":
				switch(activesite) {
				case("SG"): url = config.getSGProdURL();break;
				case("TH"): url = config.getTHProdURL();break;
				case("ZA"): url = config.getZAProdURL();break;
				case("PT"): url = config.getPTProdURL();break;
				case("ID"): url = config.getIDProdURL();break;
				case("PL"): url = config.getPLProdURL();break;
				case("HK"): url = config.getHKProdURL();break;
				case("US"): url = config.getUSProdURL();break;
				case("ME"): url = config.getMEProdURL();break;
				case("MW"): url = config.getMWProdURL();break;
				case("MY"): url = config.getMYProdURL();break;
				case("MZ"): url = config.getMZProdURL();break;
				case("NZ"): url = config.getNZProdURL();break;
				case("AU"): url = config.getAUProdURL();break;
				case("SZ"): url = config.getSZProdURL();break;
				case("ZW"): url = config.getZWProdURL();break;
				case("ES"): url = config.getESProdURL();break;
				case("RW"): url = config.getRWProdURL();break;
				case("TZ"): url = config.getTZProdURL();break;
				case("NA"): url = config.getNAProdURL();break;
				case("PH"): url = config.getPHProdURL();break;
				case("NG"): url = config.getNGProdURL();break;
				case("KE"): url = config.getKEProdURL();break;
				case("BW"): url = config.getBWProdURL();break;
				case("FR"): url = config.getFRProdURL();break;
				}
				break;	
			default:break;
			}
				url = url.replace("welcome", "?t=");
    		
    		String Username = null;
    		switch(activesite) {
    			case "SG": 
    				Username = config.getSGUserName(); break;
    			case "TH": 
    				Username = config.getTHUserName();break;
    			case "ZA": 
    				Username = config.getZAUserName();break;
    			case "PT": 
    				Username = config.getPTUserName();break;
    			case "ID": 
    				Username = config.getIDUserName();break;
    			case "PL": 
    				Username = config.getPLUserName();break;
    			case "HK": 
    				Username = config.getHKUserName();break;
    			case "US": 
    				Username = config.getUSUserName();break;
    			case "ME": 
    				Username = config.getMEUserName();break;
    			case "MY": 
    				Username = config.getMYUserName();break;
    			case "MZ": 
    				Username = config.getMZUserName();break;
    			case "MW": 
    				Username = config.getMWUserName();break;   				
    			case "NZ": 
    				Username = config.getNZUserName();break;
    			case "AU": 
    				Username = config.getAUUserName();break;
    			case "SZ": 
    				Username = config.getSZUserName();break;
    			case "ZW": 
    				Username = config.getZWUserName();break;
    			case "ES": 
    				Username = config.getESUserName();break;
    			case "RW": 
    				Username = config.getRWUserName();break;
    			case "TZ": 
    				Username = config.getTZUserName();break;
    			case "PH": 
    				Username = config.getPHUserName();break;
    			case "NA": 
    				Username = config.getNAUserName();break;
    			case "KE": 
    				Username = config.getKEUserName();break;
    			case "BW": 
    				Username = config.getBWUserName();break;
    			case "FR": 
    				Username = config.getFRUserName();break;
    			case "NG": 
    				Username = config.getNGUserName();break;
    				
    			}	
    		
    			myText = url+Token+"&sso="+Username;
    		break;
    		
    	}
			
		
    	return myText;

    	
    	
   	  	
    	
    }
    
    public static void LogoutAndCloseBrowser() throws InterruptedException {
    	
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctLogout, "Y");
		
		Constant.driver.close();
    	
    }
    
    public static void Logout() throws InterruptedException {
    	
		DoThis.click(SettingsPage.drpdwnbtnProfile, "Y");
		DoThis.click(SettingsPage.drpdwnslctLogout, "Y");
    	
    }
    
    public static boolean IsFieldEmpty(WebElement webElement, @Optional("Y") String ScreenCapture) throws InterruptedException   {
    	
    	Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		PageUtil.scrolltoElement(webElement);
		boolean fieldempty;
    	String textInsideInputBox = webElement.getAttribute("value");

    	// Check whether input field is blank
    	if(textInsideInputBox.isEmpty())
    	{
    	   Reporter.ReportEventNoImage("Input field is empty");
    	   fieldempty = true;
    	}else {
    		Reporter.ReportEventNoImage("Input field is NOT empty");  
    		fieldempty = false;
    	}
    	return fieldempty;
    }
    
    public static boolean IsObjectDisabled(String ObjectName, WebElement webElement, @Optional("Y") String ScreenCapture) throws InterruptedException  {
    	
    	// Check whether object is disabled
		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		PageUtil.scrolltoElement(webElement);
		boolean objectdisabled;
		
			if(!webElement.isEnabled())
	    	{
	    	   Reporter.ReportEventNoImage(ObjectName+" is disabled");
	    	   objectdisabled = true;
	    	}else {
	    		Reporter.ReportEventNoImage(ObjectName+" still enabled"); {assertTrue(false);}
	    		objectdisabled = false;
	    	}
		return objectdisabled;
    }
    
    public static boolean IsObjectEnabled(String ObjectName, WebElement webElement, @Optional("Y") String ScreenCapture) throws InterruptedException  {
    	
    	// Check whether object is enabled
		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		PageUtil.scrolltoElement(webElement);
		boolean objectenabled;
		
			if(webElement.isEnabled())
	    	{
	    	   Reporter.ReportEventNoImage(ObjectName+" is enabled");
	    	   objectenabled = true;
	    	}else {
	    		Reporter.ReportEventNoImage(ObjectName+" still NOT enabled"); {assertTrue(false);}
	    		objectenabled = false;
	    	}
		return objectenabled;
    }
    
    public static String GetNow() {
    	
    		Calendar cal = Calendar.getInstance();
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    		return sdf.format(cal.getTime());
    }
    
    public static String GetTodaysDate() {
    	
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(cal.getTime());
    }
    
    public static String GetTomorrowsDate() {
		
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        Date todate1 = cal.getTime();    
        String fromdate = dateFormat.format(todate1);

    	return fromdate;
    	
    }
    
    public static String Get1WeekDateFromNow() {
		
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 7);
        Date todate1 = cal.getTime();    
        String fromdate = dateFormat.format(todate1);

    	return fromdate;
    	
    }
    
    public static String Get2WeeksDateFromNow() {
		
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 14);
        Date todate1 = cal.getTime();    
        String fromdate = dateFormat.format(todate1);

    	return fromdate;
    	
    }
    
    public static int Random(int max) {
	    	Random rand = new Random(); 
	    	if(max > 10) {
	    		max = 10;
	    	}
	    	int value = rand.nextInt(max) + 1;
	    	if(value < max) {
	    		value = value - 1;
	    	}
			return value; 
    }
    
    public static int Random4Digit() {
    	
    	 // initialize a Random object somewhere; you should only need one
        Random random = new Random();

        // generate a random integer from 0 to 8999, then add 1000
        int x = random.nextInt(9000) + 1000;
		return x; 
}
    

    
    public static boolean IsObjectTextNotEmpty(WebElement webElement, String ObjectName, @Optional("Y") String ScreenCapture) throws InterruptedException  {
    	
    	// Check whether object text is NOT empty
		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		PageUtil.scrolltoElement(webElement);
		boolean objecttextnotempty;
		
		String text = DoThis.getText(webElement);
			if(!(text).isEmpty())
	    	{
	    	   Reporter.ReportEventNoImage(ObjectName+" has value of "+text);
	    	   objecttextnotempty = true;
	    	}else {
	    		Reporter.ReportEventNoImage(ObjectName+" is empty"); 
	    		objecttextnotempty = false; {assertTrue(false);}
	    	}
		return objecttextnotempty;
    }
    
    public static void equalListsCount(List<String> a, List<String> b){     

    	if(a.size() == b.size()) {
     		Reporter.ReportEventNoImage("List count is matched");
     	}else {
     		Reporter.ReportEventNoImage("List count is NOT matched");
     		assertTrue(false);
     	}
    	
    }

	public static String getSMS(String activesite) {
		
			//CellPhone
			ConfigReader config = new ConfigReader();
			String SMS = null;
			switch(activesite) {
			
			case "SG": 
			{
			SMS = config.getSGSMS();
			break;
			}
			
			case "TH": 
			{
			SMS = config.getTHSMS();
			break;
			}
			
			case "ZA": 
			{
			SMS = config.getZASMS();
			break;
			}
			
			case "PT": 
			{
			SMS = config.getPTSMS();
			break;
			}
			
			case "ID": 
			{
			SMS = config.getIDSMS();
			break;
			}
			
			case "PL": 
			{
			SMS = config.getPLSMS();
			break;
			}
			
			case "HK": 
			{
			SMS = config.getHKSMS();
			break;
			}
			
			case "US": 
			{
			SMS = config.getUSSMS();
			break;
			}
			
			case "ME": 
			{
			SMS = config.getMESMS();
			break;
			}
				
			case "MW": 
			{		
			SMS = config.getMWSMS();
			break;
			}
			
			case "MY": 
			{
			SMS = config.getMYSMS();
			break;
			}

			case "MZ": 
			{
			SMS = config.getMZSMS();
			break;
			}
			
			case "NZ": 
			{
			SMS = config.getNZSMS();
			break;
			}
			
			case "AU": 
			{
			SMS = config.getAUSMS();
			break;
			}
			
			case "SZ": 
			{
			SMS = config.getSZSMS();
			break;
			}
			
			case "ZW": 
			{
			SMS = config.getZWSMS();
			break;
			}
			
			case "ES": 
			{
			SMS = config.getESSMS();
			break;
			}
			
			case "RW": 
			{
			SMS = config.getRWSMS();
			break;
			}
			
			case "PH": 
			{
			SMS = config.getPHSMS();
			break;
			}
			
			case "TZ": 
			{
			SMS = config.getTZSMS();
			break;
			}
			
			case "NA": 
			{
			SMS = config.getNASMS();
			break;
			}
			
			case "KE": 
			{
			SMS = config.getKESMS();
			break;
			}
			
			case "BW": 
			{
			SMS = config.getBWSMS();
			break;
			}
			
			case "FR": 
			{
			SMS = config.getFRSMS();
			break;
			}
			
			case "NG": 
			{
			SMS = config.getNGSMS();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return SMS;
	}
	
	public static String getVehicleRegistration(String activesite) {
		
			String VehicleRegistration = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
			
			case "SG": 
			{
			VehicleRegistration = config.getSGVehicleRegistration();
			break;
			}
			
			case "TH": 
			{
			VehicleRegistration = config.getTHVehicleRegistration();
			break;
			}
			
			case "ZA": 
			{
			VehicleRegistration = config.getZAVehicleRegistration();
			break;
			}
			
			case "PT": 
			{
			VehicleRegistration = config.getPTVehicleRegistration();
			break;
			}
			
			case "ID": 
			{
			VehicleRegistration = config.getIDVehicleRegistration();
			break;
			}
			
			case "PL": 
			{
			VehicleRegistration = config.getPLVehicleRegistration();
			break;
			}
			
			case "HK": 
			{
			VehicleRegistration = config.getHKVehicleRegistration();
			break;
			}
			
			case "US": 
			{
			VehicleRegistration = config.getUSVehicleRegistration();
			break;
			}
			
			case "ME": 
			{
			VehicleRegistration = config.getMEVehicleRegistration();
			break;
			}
				
			case "MW": 
			{
			VehicleRegistration = config.getMWVehicleRegistration();
			break;
			}
			
			case "MY": 
			{
			VehicleRegistration = config.getMYVehicleRegistration();
			break;
			}
			
			case "MZ": 
			{
			VehicleRegistration = config.getMZVehicleRegistration();
			break;
			}
			
			case "PH": 
			{
			VehicleRegistration = config.getPHVehicleRegistration();
			break;
			}
			
			case "NZ": 
			{
			VehicleRegistration = config.getNZVehicleRegistration();
			break;
			}
			
			case "AU": 
			{
			VehicleRegistration = config.getAUVehicleRegistration();
			break;
			}
			
			case "SZ": 
			{
			VehicleRegistration = config.getSZVehicleRegistration();
			break;
			}
			
			case "ZW": 
			{
			VehicleRegistration = config.getZWVehicleRegistration();
			break;
			}
			
			case "ES": 
			{
			VehicleRegistration = config.getESVehicleRegistration();
			break;
			}
			
			case "RW": 
			{
			VehicleRegistration = config.getRWVehicleRegistration();
			break;
			}
			
			case "TZ": 
			{
			VehicleRegistration = config.getTZVehicleRegistration();
			break;
			}
			
			case "NA": 
			{
			VehicleRegistration = config.getNAVehicleRegistration();
			break;
			}
			
			case "KE": 
			{
			VehicleRegistration = config.getKEVehicleRegistration();
			break;
			}
			
			case "BW": 
			{
			VehicleRegistration = config.getBWVehicleRegistration();
			break;
			}
			
			case "FR": 
			{
			VehicleRegistration = config.getFRVehicleRegistration();
			break;
			}
			
			case "NG": 
			{
			VehicleRegistration = config.getNGVehicleRegistration();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return VehicleRegistration;
	}
	
	public static String getPlaceSearch(String activesite) {
		
			//Place Search
			String PlaceSearch = null;
			ConfigReader config = new ConfigReader();
			
			switch(activesite) {
	
			case "SG": 
			{
			PlaceSearch = config.getSGPlaceSearch();
			break;
			}
	
			case "TH": 
			{
			PlaceSearch = config.getTHPlaceSearch();
			break;
			}
	
			case "ZA": 
			{
			PlaceSearch = config.getZAPlaceSearch();
			break;
			}
	
			case "PT": 
			{
			PlaceSearch = config.getPTPlaceSearch();
			break;
			}
			
			case "ID": 
			{
			PlaceSearch = config.getIDPlaceSearch();
			break;
			}
			
			case "PL": 
			{
			PlaceSearch = config.getPLPlaceSearch();
			break;
			}
			
			case "HK": 
			{
			PlaceSearch = config.getHKPlaceSearch();
			break;
			}
			
			case "US": 
			{
			PlaceSearch = config.getUSPlaceSearch();
			break;
			}
			
			case "ME": 
			{
			PlaceSearch = config.getMEPlaceSearch();
			break;
			}
			
			case "MW": 
			{
			PlaceSearch = config.getMWPlaceSearch();
			break;
			}
			
			case "MY": 
			{
			PlaceSearch = config.getMYPlaceSearch();
			break;
			}
			
			case "MZ": 
			{
			PlaceSearch = config.getMZPlaceSearch();
			break;
			}
			
			case "NZ": 
			{
			PlaceSearch = config.getNZPlaceSearch();
			break;
			}
			
			case "AU": 
			{
			PlaceSearch = config.getAUPlaceSearch();
			break;
			}
			
			case "SZ": 
			{
			PlaceSearch = config.getSZPlaceSearch();
			break;
			}
			
			case "ZW": 
			{
			PlaceSearch = config.getZWPlaceSearch();
			break;
			}
			
			case "ES": 
			{
			PlaceSearch = config.getESPlaceSearch();
			break;
			}
			
			case "RW": 
			{
			PlaceSearch = config.getRWPlaceSearch();
			break;
			}
			
			case "TZ": 
			{
			PlaceSearch = config.getTZPlaceSearch();
			break;
			}
			
			case "PH": 
			{
			PlaceSearch = config.getPHPlaceSearch();
			break;
			}
			
			case "NG": 
			{
			PlaceSearch = config.getNGPlaceSearch();
			break;
			}
			
			case "NA": 
			{
			PlaceSearch = config.getNAPlaceSearch();
			break;
			}
			
			case "KE": 
			{
			PlaceSearch = config.getKEPlaceSearch();
			break;
			}
			
			case "BW": 
			{
			PlaceSearch = config.getBWPlaceSearch();
			break;
			}
			
			case "FR": 
			{
			PlaceSearch = config.getFRPlaceSearch();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return PlaceSearch;
		
	}
	
	public static String getPOIPlaceSearch(String activesite) {
		
			//Place Search
			String LocationName = null;
			ConfigReader config = new ConfigReader();
			
			switch(activesite) {
	
			case "SG": 
			{
			LocationName = config.getSGLocationSearch();
			break;
			}
	
			case "TH": 
			{
			LocationName = config.getTHLocationSearch();
			break;
			}
	
			case "ZA": 
			{
			LocationName = config.getZALocationSearch();
			break;
			}
	
			case "PT": 
			{
			LocationName = config.getPTLocationSearch();
			break;
			}
			
			case "ID": 
			{
			LocationName = config.getIDLocationSearch();
			break;
			}
			
			case "PL": 
			{
			LocationName = config.getPLLocationSearch();
			break;
			}
			
			case "HK": 
			{
			LocationName = config.getHKLocationSearch();
			break;
			}
			
			case "US": 
			{
			LocationName = config.getUSLocationSearch();
			break;
			}
			
			case "ME": 
			{
			LocationName = config.getMELocationSearch();
			break;
			}
			
			case "MW": 
			{
			LocationName = config.getMWLocationSearch();
			break;
			}
			
			case "MY": 
			{
			LocationName = config.getMYLocationSearch();
			break;
			}
			
			case "MZ": 
			{
			LocationName = config.getMZLocationSearch();
			break;
			}
			
			case "NZ": 
			{
			LocationName = config.getNZLocationSearch();
			break;
			}
			
			case "AU": 
			{
			LocationName = config.getAULocationSearch();
			break;
			}
			
			case "SZ": 
			{
			LocationName = config.getSZLocationSearch();
			break;
			}
			
			case "ZW": 
			{
			LocationName = config.getZWLocationSearch();
			break;
			}
			
			case "ES": 
			{
			LocationName = config.getESLocationSearch();
			break;
			}
			
			case "RW": 
			{
			LocationName = config.getRWLocationSearch();
			break;
			}
			
			case "PH": 
			{
			LocationName = config.getPHLocationSearch();
			break;
			}
			
			case "TZ": 
			{
			LocationName = config.getTZLocationSearch();
			break;
			}
			
			case "NA": 
			{
			LocationName = config.getNALocationSearch();
			break;
			}
			
			case "NG": 
			{
			LocationName = config.getNGLocationSearch();
			break;
			}
			
			case "KE": 
			{
			LocationName = config.getKELocationSearch();
			break;
			}
			
			case "BW": 
			{
			LocationName = config.getBWLocationSearch();
			break;
			}
			
			case "FR": 
			{
			LocationName = config.getFRLocationSearch();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return LocationName;
	
	}
	
	public static String getEmailAdd(String activesite) throws IOException, Exception {
		
			String EmailAdd = null;
			ConfigReader config = new ConfigReader();
			
			switch(activesite) {
			
			case "SG": 
			{
			EmailAdd = config.getSGEmailAdd();
			break;
			}
			
			case "TH": 
			{
			EmailAdd = config.getTHEmailAdd();
			break;
			}
			
			case "ZA": 
			{
			EmailAdd = config.getZAEmailAdd();
			break;
			}
			
			case "PT": 
			{
			EmailAdd = config.getPTEmailAdd(); 
			break;
			}
			
			case "ID": 
			{
			EmailAdd = config.getIDEmailAdd(); 
			break;
			}
			
			case "PL": 
			{
			EmailAdd = config.getPLEmailAdd(); 
			break;
			}
			
			case "HK": 
			{
			EmailAdd = config.getHKEmailAdd(); 
			break;
			}
			
			case "US": 
			{
			EmailAdd = config.getUSEmailAdd(); 
			break;
			}
			
			case "ME": 
			{
			EmailAdd = config.getMEEmailAdd(); 
			break;
			}
			
			case "MW": 
			{
			EmailAdd = config.getMWEmailAdd(); 
			break;
			}
			
			case "MY": 
			{
			EmailAdd = config.getMYEmailAdd(); 
			break;
			}
			
			case "MZ": 
			{
			EmailAdd = config.getMZEmailAdd(); 
			break;
			}
			
			case "NZ": 
			{
			EmailAdd = config.getNZEmailAdd(); 
			break;
			}
			
			case "AU": 
			{
			EmailAdd = config.getAUEmailAdd(); 
			break;
			}
			
			case "SZ": 
			{
			EmailAdd = config.getSZEmailAdd(); 
			break;
			}
			
			case "ZW": 
			{
			EmailAdd = config.getZWEmailAdd(); 
			break;
			}
			
			case "ES": 
			{
			EmailAdd = config.getESEmailAdd(); 
			break;
			}
			
			case "RW": 
			{
			EmailAdd = config.getRWEmailAdd(); 
			break;
			}
			
			case "TZ": 
			{
			EmailAdd = config.getTZEmailAdd(); 
			break;
			}
			
			case "PH": 
			{
			EmailAdd = config.getPHEmailAdd(); 
			break;
			}
			
			case "NA": 
			{
			EmailAdd = config.getNAEmailAdd(); 
			break;
			}
			
			case "KE": 
			{
			EmailAdd = config.getKEEmailAdd(); 
			break;
			}
			
			case "BW": 
			{
			EmailAdd = config.getBWEmailAdd(); 
			break;
			}
			
			case "FR": 
			{
			EmailAdd = config.getFREmailAdd(); 
			break;
			}
			
			case "NG": 
			{
			EmailAdd = config.getNGEmailAdd(); 
			break;
			}

			//Add switch case options for other countries
			}
			
			return EmailAdd;
	}
	
	public static String getEmailAddAssoc(String activesite) throws IOException, Exception {
			
			String EmailAddAssoc = null;
			ConfigReader config = new ConfigReader();
			
			switch(activesite) {
			
			case "SG": 
			{
			EmailAddAssoc = config.getSGEmailAddAssoc();
			break;
			}
			
			case "TH": 
			{
			EmailAddAssoc = config.getTHEmailAddAssoc();
			break;
			}
			
			case "ZA": 
			{
			EmailAddAssoc = config.getZAEmailAddAssoc();
			break;
			}
			
			case "PT": 
			{
			EmailAddAssoc = config.getPTEmailAddAssoc();
			break;
			}
			
			case "ID": 
			{
			EmailAddAssoc = config.getIDEmailAddAssoc();
			break;
			}
			
			case "PL": 
			{
			EmailAddAssoc = config.getPLEmailAddAssoc();
			break;
			}
			
			case "HK": 
			{
			EmailAddAssoc = config.getHKEmailAddAssoc();
			break;
			}
			
			case "US": 
			{
			EmailAddAssoc = config.getUSEmailAddAssoc();
			break;
			}
			
			case "ME": 
			{
			EmailAddAssoc = config.getMEEmailAddAssoc();
			break;
			}
			
			case "MW": 
			{
			EmailAddAssoc = config.getMWEmailAddAssoc();
			break;
			}
			
			case "MY": 
			{
			EmailAddAssoc = config.getMYEmailAddAssoc();
			break;
			}
			
			case "MZ": 
			{
			EmailAddAssoc = config.getMZEmailAddAssoc();
			break;
			}
			
			case "NZ": 
			{
			EmailAddAssoc = config.getNZEmailAddAssoc();
			break;
			}
			
			case "AU": 
			{
			EmailAddAssoc = config.getAUEmailAddAssoc();
			break;
			}
			
			case "SZ": 
			{
			EmailAddAssoc = config.getSZEmailAddAssoc();
			break;
			}
			
			case "ZW": 
			{
			EmailAddAssoc = config.getZWEmailAddAssoc();
			break;
			}
			
			case "ES": 
			{
			EmailAddAssoc = config.getESEmailAddAssoc();
			break;
			}
			
			case "RW": 
			{
			EmailAddAssoc = config.getRWEmailAddAssoc();
			break;
			}
			
			case "TZ": 
			{
			EmailAddAssoc = config.getTZEmailAddAssoc();
			break;
			}
			
			case "PH": 
			{
			EmailAddAssoc = config.getPHEmailAddAssoc();
			break;
			}
			
			case "NA": 
			{
			EmailAddAssoc = config.getNAEmailAddAssoc();
			break;
			}
			
			case "KE": 
			{
			EmailAddAssoc = config.getKEEmailAddAssoc();
			break;
			}
			
			case "BW": 
			{
			EmailAddAssoc = config.getBWEmailAddAssoc();
			break;
			}
			
			case "FR": 
			{
			EmailAddAssoc = config.getFREmailAddAssoc();
			break;
			}
			
			case "NG": 
			{
			EmailAddAssoc = config.getNGEmailAddAssoc();
			break;
			}
			
			//Add switch case options for other countries
			}	
			
			return EmailAddAssoc;
		
	}
	
	public static String getSMSAssoc(String activesite) throws IOException, Exception {
		
			String SMSAssoc = null;
			ConfigReader config = new ConfigReader();
			
			switch(activesite) {
			
			case "SG": 
			{
			SMSAssoc = config.getSGSMSAssoc();
			break;
			}
			
			case "TH": 
			{
			SMSAssoc = config.getTHSMSAssoc();
			break;
			}
			
			case "ZA": 
			{
			SMSAssoc = config.getZASMSAssoc();
			break;
			}
			
			case "PT": 
			{
			SMSAssoc = config.getPTSMSAssoc();
			break;
			}
			
			case "ID": 
			{
			SMSAssoc = config.getIDSMSAssoc();
			break;
			}
			
			case "PL": 
			{
			SMSAssoc = config.getPLSMSAssoc();
			break;
			}
			
			case "HK": 
			{
			SMSAssoc = config.getHKSMSAssoc();
			break;
			}
			
			case "US": 
			{
			SMSAssoc = config.getUSSMSAssoc();
			break;
			}
			
			case "ME": 
			{
			SMSAssoc = config.getMESMSAssoc();
			break;
			}
			
			case "MW": 
			{
			SMSAssoc = config.getMWSMSAssoc();
			break;
			}
			
			case "MY": 
			{
			SMSAssoc = config.getMYSMSAssoc();
			break;
			}
			
			case "MZ": 
			{
			SMSAssoc = config.getMZSMSAssoc();
			break;
			}
			
			case "NZ": 
			{
			SMSAssoc = config.getNZSMSAssoc();
			break;
			}
			
			case "AU": 
			{
			SMSAssoc = config.getAUSMSAssoc();
			break;
			}
			
			case "SZ": 
			{
			SMSAssoc = config.getSZSMSAssoc();
			break;
			}
			
			case "ZW": 
			{
			SMSAssoc = config.getZWSMSAssoc();
			break;
			}
			
			case "ES": 
			{
			SMSAssoc = config.getESSMSAssoc();
			break;
			}
			
			case "RW": 
			{
			SMSAssoc = config.getRWSMSAssoc();
			break;
			}
			
			case "TZ": 
			{
			SMSAssoc = config.getTZSMSAssoc();
			break;
			}
			
			case "PH": 
			{
			SMSAssoc = config.getPHSMSAssoc();
			break;
			}
			
			case "NA": 
			{
			SMSAssoc = config.getNASMSAssoc();
			break;
			}
			
			case "KE": 
			{
			SMSAssoc = config.getKESMSAssoc();
			break;
			}
			
			case "BW": 
			{
			SMSAssoc = config.getBWSMSAssoc();
			break;
			}
			
			case "FR": 
			{
			SMSAssoc = config.getFRSMSAssoc();
			break;
			}
			
			case "NG": 
			{
			SMSAssoc = config.getNGSMSAssoc();
			break;
			}
			
			//Add switch case options for other countries
			}	
			
			return SMSAssoc;
		
	}
	
	public static String getEmailAddNotAssoc(String activesite) throws IOException, Exception {
			
			String EmailAddNotAssoc = null;
			ConfigReader config = new ConfigReader();
			switch(activesite) {
			
			default:
			
			//Add switch case options for other countries
			{
			EmailAddNotAssoc = config.getEmailAddNotAssoc();	
			break;
			}
			
			
			}	
			
			return EmailAddNotAssoc;
			
	}
	
	public static String getSMSNotAssoc(String activesite) throws IOException, Exception {
		
			String SMSNotAssoc = null;
			ConfigReader config = new ConfigReader();
			switch(activesite) {
			
			case "SG": 
			{
			SMSNotAssoc = config.getSGSMSNotAssoc();
			break;
			}
			
			case "TH": 
			{
			SMSNotAssoc = config.getTHSMSNotAssoc();
			break;
			}
			
			case "ZA": 
			{
			SMSNotAssoc = config.getZASMSNotAssoc();
			break;
			}
			
			case "PT": 
			{
			SMSNotAssoc = config.getPTSMSNotAssoc();
			break;
			}
			
			case "ID": 
			{
			SMSNotAssoc = config.getIDSMSNotAssoc();
			break;
			}
			
			case "PL": 
			{
			SMSNotAssoc = config.getPLSMSNotAssoc();
			break;
			}
			
			case "HK": 
			{
			SMSNotAssoc = config.getHKSMSNotAssoc();
			break;
			}
			
			case "US": 
			{
			SMSNotAssoc = config.getUSSMSNotAssoc();
			break;
			}
			
			case "ME": 
			{
			SMSNotAssoc = config.getMESMSNotAssoc();
			break;
			}
			
			case "MW": 
			{
			SMSNotAssoc = config.getMWSMSNotAssoc();
			break;
			}
			
			case "MY": 
			{
			SMSNotAssoc = config.getMYSMSNotAssoc();
			break;
			}
			
			case "MZ": 
			{
			SMSNotAssoc = config.getMZSMSNotAssoc();
			break;
			}
			
			case "NZ": 
			{
			SMSNotAssoc = config.getNZSMSNotAssoc();
			break;
			}
			
			case "AU": 
			{
			SMSNotAssoc = config.getAUSMSNotAssoc();
			break;
			}
			
			case "SZ": 
			{
			SMSNotAssoc = config.getSZSMSNotAssoc();
			break;
			}
			
			case "ZW": 
			{
			SMSNotAssoc = config.getZWSMSNotAssoc();
			break;
			}
			
			case "ES": 
			{
			SMSNotAssoc = config.getESSMSNotAssoc();
			break;
			}
			
			case "RW": 
			{
			SMSNotAssoc = config.getRWSMSNotAssoc();
			break;
			}
			
			case "TZ": 
			{
			SMSNotAssoc = config.getTZSMSNotAssoc();
			break;
			}
			
			case "PH": 
			{
			SMSNotAssoc = config.getPHSMSNotAssoc();
			break;
			}
			
			case "NA": 
			{
			SMSNotAssoc = config.getNASMSNotAssoc();
			break;
			}
			
			case "KE": 
			{
			SMSNotAssoc = config.getKESMSNotAssoc();
			break;
			}
			
			case "BW": 
			{
			SMSNotAssoc = config.getBWSMSNotAssoc();
			break;
			}
			
			case "FR": 
			{
			SMSNotAssoc = config.getFRSMSNotAssoc();
			break;
			}
			
			case "NG": 
			{
			SMSNotAssoc = config.getNGSMSNotAssoc();
			break;
			}
			
			//Add switch case options for other countries
			}	
			
			return SMSNotAssoc;
		
	}
	
	public static String getSubUserEmailAdd(String activesite) throws IOException, Exception {
			
			String SubUserEmailAdd = null;
			ConfigReader config = new ConfigReader();
			switch(activesite) {
			
			case "SG": 
			{
			SubUserEmailAdd = config.getSGSubUserEmailAdd();
			break;
			}
			
			case "TH": 
			{
			SubUserEmailAdd = config.getTHSubUserEmailAdd();
			break;
			}
			
			case "ZA": 
			{
			SubUserEmailAdd = config.getZASubUserEmailAdd();
			break;
			}
			
			case "PT": 
			{
			SubUserEmailAdd = config.getPTSubUserEmailAdd();
			break;
			}
			
			case "ID": 
			{
			SubUserEmailAdd = config.getIDSubUserEmailAdd();
			break;
			}
			
			case "PL": 
			{
			SubUserEmailAdd = config.getPLSubUserEmailAdd();
			break;
			}
			
			case "HK": 
			{
			SubUserEmailAdd = config.getHKSubUserEmailAdd();
			break;
			}
			
			case "US": 
			{
			SubUserEmailAdd = config.getUSSubUserEmailAdd();
			break;
			}
			
			case "ME": 
			{
			SubUserEmailAdd = config.getMESubUserEmailAdd();
			break;
			}
			
			case "MW": 
			{
			SubUserEmailAdd = config.getMWSubUserEmailAdd();
			break;
			}
			
			case "MY": 
			{
			SubUserEmailAdd = config.getMYSubUserEmailAdd();
			break;
			}
			
			case "MZ": 
			{
			SubUserEmailAdd = config.getMZSubUserEmailAdd();
			break;
			}
			
			case "NZ": 
			{
			SubUserEmailAdd = config.getNZSubUserEmailAdd();
			break;
			}
			
			case "AU": 
			{
			SubUserEmailAdd = config.getAUSubUserEmailAdd();
			break;
			}
			
			case "SZ": 
			{
			SubUserEmailAdd = config.getSZSubUserEmailAdd();
			break;
			}
			
			case "ZW": 
			{
			SubUserEmailAdd = config.getZWSubUserEmailAdd();
			break;
			}
			
			case "ES": 
			{
			SubUserEmailAdd = config.getESSubUserEmailAdd();
			break;
			}
			
			case "RW": 
			{
			SubUserEmailAdd = config.getRWSubUserEmailAdd();
			break;
			}
			
			case "TZ": 
			{
			SubUserEmailAdd = config.getTZSubUserEmailAdd();
			break;
			}
			
			case "PH": 
			{
			SubUserEmailAdd = config.getPHSubUserEmailAdd();
			break;
			}
			
			case "NA": 
			{
			SubUserEmailAdd = config.getNASubUserEmailAdd();
			break;
			}
			
			case "KE": 
			{
			SubUserEmailAdd = config.getKESubUserEmailAdd();
			break;
			}
			
			case "BW": 
			{
			SubUserEmailAdd = config.getBWSubUserEmailAdd();
			break;
			}
			
			case "FR": 
			{
			SubUserEmailAdd = config.getFRSubUserEmailAdd();
			break;
			}
			
			case "NG": 
			{
			SubUserEmailAdd = config.getNGSubUserEmailAdd();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return SubUserEmailAdd;
	}
	
	public static String getSubUserSMS(String activesite) throws IOException, Exception {
				
			String SubUserSMS = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
			
			case "SG": 
			{
			SubUserSMS = config.getSGSubUserSMS();	
			break;
			}
			
			case "TH": 
			{
			SubUserSMS = config.getTHSubUserSMS();	
			break;
			}
			
			case "ZA": 
			{
			SubUserSMS = config.getZASubUserSMS();
			break;
			}
			
			case "PT": 
			{
			SubUserSMS = config.getPTSubUserSMS();
			break;
			}
			
			case "ID": 
			{
			SubUserSMS = config.getIDSubUserSMS();
			break;
			}
			
			case "PL": 
			{
			SubUserSMS = config.getPLSubUserSMS();
			break;
			}
			
			case "HK": 
			{
			SubUserSMS = config.getHKSubUserSMS();
			break;
			}
			
			case "US": 
			{
			SubUserSMS = config.getUSSubUserSMS();
			break;
			}
			
			case "ME": 
			{
			SubUserSMS = config.getMESubUserSMS();
			break;
			}
			
			case "MW": 
			{
			SubUserSMS = config.getMWSubUserSMS();
			break;
			}
			
			case "MY": 
			{
			SubUserSMS = config.getMYSubUserSMS();
			break;
			}
			
			case "MZ": 
			{
			SubUserSMS = config.getMZSubUserSMS();
			break;
			}
			
			case "NZ": 
			{
			SubUserSMS = config.getNZSubUserSMS();
			break;
			}
			
			case "AU": 
			{
			SubUserSMS = config.getAUSubUserSMS();
			break;
			}
			
			case "SZ": 
			{
			SubUserSMS = config.getSZSubUserSMS();
			break;
			}
			
			case "ZW": 
			{
			SubUserSMS = config.getZWSubUserSMS();
			break;
			}
			
			case "ES": 
			{
			SubUserSMS = config.getESSubUserSMS();
			break;
			}
			
			case "RW": 
			{
			SubUserSMS = config.getRWSubUserSMS();
			break;
			}
			
			case "TZ": 
			{
			SubUserSMS = config.getTZSubUserSMS();
			break;
			}
			
			case "PH": 
			{
			SubUserSMS = config.getPHSubUserSMS();
			break;
			}
			
			case "NA": 
			{
			SubUserSMS = config.getNASubUserSMS();
			break;
			}
			
			case "KE": 
			{
			SubUserSMS = config.getKESubUserSMS();
			break;
			}
			
			case "BW": 
			{
			SubUserSMS = config.getBWSubUserSMS();
			break;
			}
			
			case "FR": 
			{
			SubUserSMS = config.getFRSubUserSMS();
			break;
			}
			
			case "NG": 
			{
			SubUserSMS = config.getNGSubUserSMS();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return SubUserSMS;
	
	}
	public static String getSubPassword(String activesite) throws IOException, Exception {
		
			String SubPassword = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
			
			case "SG": 
			{
				SubPassword = config.getSGSubPassword(); break;
			}
			
			case "TH": 
			{
				SubPassword = config.getTHSubPassword(); break;
			}
			
			case "ZA": 
			{
				SubPassword = config.getZASubPassword(); break;
			}
			
			case "PT": 
			{
				SubPassword = config.getPTSubPassword(); break;
			}
			
			case "ID": 
			{
				SubPassword = config.getIDSubPassword(); break;
			}
			
			case "PL": 
			{
				SubPassword = config.getPLSubPassword(); break;
			}
			
			case "HK": 
			{
				SubPassword = config.getHKSubPassword(); break;
			}
			
			case "US": 
			{
				SubPassword = config.getUSSubPassword(); break;
			}
			
			case "ME": 
			{
				SubPassword = config.getMESubPassword(); break;
			}
			
			case "MW": 
			{
				SubPassword = config.getMWSubPassword(); break;
			}
			
			case "MY": 
			{
				SubPassword = config.getMYSubPassword(); break;
			}
			
			case "MZ": 
			{
				SubPassword = config.getMZSubPassword(); break;
			}
			
			case "NZ": 
			{
				SubPassword = config.getNZSubPassword(); break;
			}
			
			case "AU": 
			{
				SubPassword = config.getAUSubPassword(); break;
			}
			
			case "SZ": 
			{
				SubPassword = config.getSZSubPassword(); break;
			}
			
			case "ZW": 
			{
				SubPassword = config.getZWSubPassword(); break;
			}
			
			case "ES": 
			{
				SubPassword = config.getESSubPassword(); break;
			}
			
			case "RW": 
			{
				SubPassword = config.getRWSubPassword(); break;
			}
			
			case "TZ": 
			{
				SubPassword = config.getTZSubPassword(); break;
			}
			
			case "PH": 
			{
				SubPassword = config.getPHSubPassword(); break;
			}
			
			case "NA": 
			{
				SubPassword = config.getNASubPassword(); break;
			}
			
			case "KE": 
			{
				SubPassword = config.getKESubPassword(); break;
			}
			
			case "BW": 
			{
				SubPassword = config.getBWSubPassword(); break;
			}
			
			case "FR": 
			{
				SubPassword = config.getFRSubPassword(); break;
			}
			
			case "NG": 
			{
				SubPassword = config.getNGSubPassword(); break;
			}
			
			//Add switch case options for other countries
		
			}
			return SubPassword;
	
	}
	public static String getSubuser(String activesite) throws IOException, Exception {
	
			String Subuser = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
		
			case "SG": 
			{
			Subuser = config.getSGSubUserName();
			break;
			}
		
			case "TH": 
			{
			Subuser = config.getTHSubUserName();
			break;
			}
		
			case "ZA": 
			{
			Subuser = config.getZASubUserName();
			break;
			}
		
			case "PT": 
			{
			Subuser = config.getPTSubUserName();
			break;
			}
			
			case "ID": 
			{
			Subuser = config.getIDSubUserName();
			break;
			}
			
			case "PL": 
			{
			Subuser = config.getPLSubUserName();
			break;
			}
			
			case "HK": 
			{
			Subuser = config.getHKSubUserName();
			break;
			}
			
			case "US": 
			{
			Subuser = config.getUSSubUserName();
			break;
			}
			
			case "ME": 
			{
			Subuser = config.getMESubUserName();
			break;
			}
			
			case "MY": 
			{
			Subuser = config.getMYSubUserName();
			break;
			}
			
			case "MW": 
			{
			Subuser = config.getMWSubUserName();
			break;
			}
			
			case "MZ": 
			{
			Subuser = config.getMZSubUserName();
			break;
			}
			
			case "NZ": 
			{
			Subuser = config.getNZSubUserName();
			break;
			}
			
			case "AU": 
			{
			Subuser = config.getAUSubUserName();
			break;
			}
			
			case "SZ": 
			{
			Subuser = config.getSZSubUserName();
			break;
			}
			
			case "ZW": 
			{
			Subuser = config.getZWSubUserName();
			break;
			}
			
			case "ES": 
			{
			Subuser = config.getESSubUserName();
			break;
			}
			
			case "RW": 
			{
			Subuser = config.getRWSubUserName();
			break;
			}
			
			case "TZ": 
			{
			Subuser = config.getTZSubUserName();
			break;
			}
			
			case "PH": 
			{
			Subuser = config.getPHSubUserName();
			break;
			}
			
			case "NA": 
			{
			Subuser = config.getNASubUserName();
			break;
			}
			
			case "KE": 
			{
			Subuser = config.getKESubUserName();
			break;
			}
			
			case "BW": 
			{
			Subuser = config.getBWSubUserName();
			break;
			}
			
			case "FR": 
			{
			Subuser = config.getFRSubUserName();
			break;
			}
			
			case "NG": 
			{
			Subuser = config.getNGSubUserName();
			break;
			}
		
			//Add switch case options for other countries
			}
			
			return Subuser;
	
	}
	public static String getPassword(String activesite) throws IOException, Exception {
	
			String Password = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
			case "SG": 
			{
				Password = config.getSGPassword(); break;
			}
			
			case "TH": 
			{
				Password = config.getTHPassword(); break;
			}
			
			case "ZA": 
			{
				Password = config.getZAPassword(); break;
			}
			
			case "PT": 
			{
				Password = config.getPTPassword(); break;
			}
			
			case "ID": 
			{
				Password = config.getIDPassword(); break;
			}
			
			case "PL": 
			{
				Password = config.getPLPassword(); break;
			}
			
			case "HK": 
			{
				Password = config.getHKPassword(); break;
			}
			
			case "US": 
			{
				Password = config.getUSPassword(); break;
			}
			
			case "ME": 
			{
				Password = config.getMEPassword(); break;
			}
			
			case "MY": 
			{
				Password = config.getMYPassword(); break;
			}
			
			case "MW": 
			{
				Password = config.getMWPassword(); break;
			}
			
			case "MZ": 
			{
				Password = config.getMZPassword(); break;
			}
			
			case "NZ": 
			{
				Password = config.getNZPassword(); break;
			}
			
			case "AU": 
			{
				Password = config.getAUPassword(); break;
			}
			
			case "SZ": 
			{
				Password = config.getSZPassword(); break;
			}
			
			case "ZW": 
			{
				Password = config.getZWPassword(); break;
			}
			
			case "ES": 
			{
				Password = config.getESPassword(); break;
			}
			
			case "RW": 
			{
				Password = config.getRWPassword(); break;
			}
			
			case "TZ": 
			{
				Password = config.getTZPassword(); break;
			}
			
			case "PH": 
			{
				Password = config.getPHPassword(); break;
			}
			
			case "NA": 
			{
				Password = config.getNAPassword(); break;
			}
			
			case "KE": 
			{
				Password = config.getKEPassword(); break;
			}
			
			case "BW": 
			{
				Password = config.getBWPassword(); break;
			}
			
			case "FR": 
			{
				Password = config.getFRPassword(); break;
			}
			
			case "NG": 
			{
				Password = config.getNGPassword(); break;
			}
			
			//Add switch case options for other countries
				
			}
			return Password;

	}
	
	public static String getVehicle(String activesite) {
		
			String Vehicle = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
		
			case "SG": 
			{
			Vehicle = config.getSGVehicle();
			break;
			}
		
			case "TH": 
			{
			Vehicle = config.getTHVehicle();
			break;
			}
		
			case "ZA": 
			{
			Vehicle = config.getZAVehicle();
			break;
			}
		
			case "PT": 
			{
			Vehicle = config.getPTVehicle();
			break;
			}
			
			case "ID": 
			{
			Vehicle = config.getIDVehicle();
			break;
			}
			
			case "PL": 
			{
			Vehicle = config.getPLVehicle();
			break;
			}
			
			case "HK": 
			{
			Vehicle = config.getHKVehicle();
			break;
			}
			
			case "US": 
			{
			Vehicle = config.getUSVehicle();
			break;
			}
			
			case "ME": 
			{
			Vehicle = config.getMEVehicle();
			break;
			}
			
			case "MY": 
			{
			Vehicle = config.getMYVehicle();
			break;
			}
			
			case "MW": 
			{
			Vehicle = config.getMWVehicle();
			break;
			}
			
			case "MZ": 
			{
			Vehicle = config.getMZVehicle();
			break;
			}
			
			case "NZ": 
			{
			Vehicle = config.getNZVehicle();
			break;
			}
			
			case "AU": 
			{
			Vehicle = config.getAUVehicle();
			break;
			}
			
			case "SZ": 
			{
			Vehicle = config.getSZVehicle();
			break;
			}
			
			case "ZW": 
			{
			Vehicle = config.getZWVehicle();
			break;
			}
			
			case "ES": 
			{
			Vehicle = config.getESVehicle();
			break;
			}
			
			case "RW": 
			{
			Vehicle = config.getRWVehicle();
			break;
			}
			
			case "TZ": 
			{
			Vehicle = config.getTZVehicle();
			break;
			}
			
			case "PH": 
			{
			Vehicle = config.getPHVehicle();
			break;
			}
			
			case "NG": 
			{
			Vehicle = config.getNGVehicle();
			break;
			}
			
			case "NA": 
			{
			Vehicle = config.getNAVehicle();
			break;
			}
			
			case "KE": 
			{
			Vehicle = config.getKEVehicle();
			break;
			}
			
			case "BW": 
			{
			Vehicle = config.getBWVehicle();
			break;
			}
			
			case "FR": 
			{
			Vehicle = config.getFRVehicle();
			break;
			}
		
		
			//Add switch case options for other countries
			}
			
			return Vehicle;
	}
	
	public static String getPOI(String activesite) {
		
			String POI = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
	
			case "SG": 
			{
			POI = config.getSGPOI();
			break;
			}
	
			case "TH": 
			{
			POI = config.getTHPOI();
			break;
			}
	
			case "ZA": 
			{
			POI = config.getZAPOI();
			break;
			}
	
			case "PT": 
			{
			POI = config.getPTPOI();
			break;
			}
			
			case "ID": 
			{
			POI = config.getIDPOI();
			break;
			}
			
			case "PL": 
			{
			POI = config.getPLPOI();
			break;
			}
			
			case "HK": 
			{
			POI = config.getHKPOI();
			break;
			}
			
			case "US": 
			{
			POI = config.getUSPOI();
			break;
			}
			
			case "ME": 
			{
			POI = config.getMEPOI();
			break;
			}
			
			case "MW": 
			{
			POI = config.getMWPOI();
			break;
			}
			
			case "MY": 
			{
			POI = config.getMYPOI();
			break;
			}
			
			case "MZ": 
			{
			POI = config.getMZPOI();
			break;
			}
			
			case "NZ": 
			{
			POI = config.getNZPOI();
			break;
			}
			
			case "AU": 
			{
			POI = config.getAUPOI();
			break;
			}
			
			case "SZ": 
			{
			POI = config.getSZPOI();
			break;
			}
			
			case "ZW": 
			{
			POI = config.getZWPOI();
			break;
			}
			
			case "ES": 
			{
			POI = config.getESPOI();
			break;
			}
			
			case "RW": 
			{
			POI = config.getRWPOI();
			break;
			}
			
			case "TZ": 
			{
			POI = config.getTZPOI();
			break;
			}
			
			case "PH": 
			{
			POI = config.getPHPOI();
			break;
			}
			
			case "NA": 
			{
			POI = config.getNAPOI();
			break;
			}
			
			case "KE": 
			{
			POI = config.getKEPOI();
			break;
			}
			
			case "BW": 
			{
			POI = config.getBWPOI();
			break;
			}
			
			case "FR": 
			{
			POI = config.getFRPOI();
			break;
			}
			
			case "NG": 
			{
			POI = config.getNGPOI();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return POI;
		
	}
	
	public static String getGeofences(String activesite) {
		
			String Geofences = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
	
			case "SG": 
			{
			Geofences = config.getSGGeofences();
			break;
			}
	
			case "TH": 
			{
			Geofences = config.getTHGeofences();
			break;
			}
	
			case "ZA": 
			{
			Geofences = config.getZAGeofences();
			break;
			}
	
			case "PT": 
			{
			Geofences = config.getPTGeofences();
			break;
			}
			
			case "ID": 
			{
			Geofences = config.getIDGeofences();
			break;
			}
			
			case "PL": 
			{
			Geofences = config.getPLGeofences();
			break;
			}
			
			case "HK": 
			{
			Geofences = config.getHKGeofences();
			break;
			}
			
			case "US": 
			{
			Geofences = config.getUSGeofences();
			break;
			}
			
			case "ME": 
			{
			Geofences = config.getMEGeofences();
			break;
			}
			
			case "MW": 
			{
			Geofences = config.getMWGeofences();
			break;
			}
			
			case "MY": 
			{
			Geofences = config.getMYGeofences();
			break;
			}
			
			case "MZ": 
			{
			Geofences = config.getMZGeofences();
			break;
			}
			
			case "NZ": 
			{
			Geofences = config.getNZGeofences();
			break;
			}
			
			case "AU": 
			{
			Geofences = config.getAUGeofences();
			break;
			}
			
			case "SZ": 
			{
			Geofences = config.getSZGeofences();
			break;
			}
			
			case "ZW": 
			{
			Geofences = config.getZWGeofences();
			break;
			}
			
			case "ES": 
			{
			Geofences = config.getESGeofences();
			break;
			}
			
			case "RW": 
			{
			Geofences = config.getRWGeofences();
			break;
			}
			
			case "TZ": 
			{
			Geofences = config.getTZGeofences();
			break;
			}
			
			case "PH": 
			{
			Geofences = config.getPHGeofences();
			break;
			}
			
			case "NA": 
			{
			Geofences = config.getNAGeofences();
			break;
			}
			
			case "KE": 
			{
			Geofences = config.getKEGeofences();
			break;
			}
			
			case "BW": 
			{
			Geofences = config.getBWGeofences();
			break;
			}
			
			case "FR": 
			{
			Geofences = config.getFRGeofences();
			break;
			}
			
			case "NG": 
			{
			Geofences = config.getNGGeofences();
			break;
			}
	
			//Add switch case options for other countries
			}
			
			return Geofences;
	
	}
	
	public static String getGPSFormatDegreesMinutesSeconds(String activesite) {
			
			String GPSFormatDegreesMinutesSeconds = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
	
			case "SG": 
			{
			GPSFormatDegreesMinutesSeconds = config.getSGGPSFormatDegreesMinutesSeconds();
			break;
			}
	
			case "TH": 
			{
			GPSFormatDegreesMinutesSeconds = config.getTHGPSFormatDegreesMinutesSeconds();
			break;
			}
	
			case "ZA": 
			{
			GPSFormatDegreesMinutesSeconds = config.getZAGPSFormatDegreesMinutesSeconds();
			break;
			}
	
			case "PT": 
			{
			GPSFormatDegreesMinutesSeconds = config.getPTGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "ID": 
			{
			GPSFormatDegreesMinutesSeconds = config.getIDGPSFormatDegreesMinutesSeconds();
			break;
			}
	
			case "PL": 
			{
			GPSFormatDegreesMinutesSeconds = config.getPLGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "HK": 
			{
			GPSFormatDegreesMinutesSeconds = config.getHKGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "US": 
			{
			GPSFormatDegreesMinutesSeconds = config.getUSGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "ME": 
			{
			GPSFormatDegreesMinutesSeconds = config.getMEGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "MW": 
			{
			GPSFormatDegreesMinutesSeconds = config.getMWGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "MY": 
			{
			GPSFormatDegreesMinutesSeconds = config.getMYGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "MZ": 
			{
			GPSFormatDegreesMinutesSeconds = config.getMZGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "NZ": 
			{
			GPSFormatDegreesMinutesSeconds = config.getNZGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "AU": 
			{
			GPSFormatDegreesMinutesSeconds = config.getAUGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "SZ": 
			{
			GPSFormatDegreesMinutesSeconds = config.getSZGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "ZW": 
			{
			GPSFormatDegreesMinutesSeconds = config.getZWGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "ES": 
			{
			GPSFormatDegreesMinutesSeconds = config.getESGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "RW": 
			{
			GPSFormatDegreesMinutesSeconds = config.getRWGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "TZ": 
			{
			GPSFormatDegreesMinutesSeconds = config.getTZGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "PH": 
			{
			GPSFormatDegreesMinutesSeconds = config.getPHGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "NA": 
			{
			GPSFormatDegreesMinutesSeconds = config.getNAGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "NG": 
			{
			GPSFormatDegreesMinutesSeconds = config.getNGGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "KE": 
			{
			GPSFormatDegreesMinutesSeconds = config.getKEGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "BW": 
			{
			GPSFormatDegreesMinutesSeconds = config.getBWGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			case "FR": 
			{
			GPSFormatDegreesMinutesSeconds = config.getFRGPSFormatDegreesMinutesSeconds();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return GPSFormatDegreesMinutesSeconds;
	
	}
	public static String getGPSFormatDecimalDegrees(String activesite) {
		
			String GPSFormatDecimalDegrees = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
	
			case "SG": 
			{
			GPSFormatDecimalDegrees = config.getSGGPSFormatDecimalDegrees();
			break;
			}
	
			case "TH": 
			{
			GPSFormatDecimalDegrees = config.getTHGPSFormatDecimalDegrees();
			break;
			}
	
			case "ZA": 
			{
			GPSFormatDecimalDegrees = config.getZAGPSFormatDecimalDegrees();
			break;
			}
	
			case "PT": 
			{
			GPSFormatDecimalDegrees = config.getPTGPSFormatDecimalDegrees();
			break;
			}
			
			case "ID": 
			{
			GPSFormatDecimalDegrees = config.getIDGPSFormatDecimalDegrees();
			break;
			}
			
			case "PL": 
			{
			GPSFormatDecimalDegrees = config.getPLGPSFormatDecimalDegrees();
			break;
			}

			case "HK": 
			{
			GPSFormatDecimalDegrees = config.getHKGPSFormatDecimalDegrees();
			break;
			}
			
			case "US": 
			{
			GPSFormatDecimalDegrees = config.getUSGPSFormatDecimalDegrees();
			break;
			}
			
			case "ME": 
			{
			GPSFormatDecimalDegrees = config.getMEGPSFormatDecimalDegrees();
			break;
			}
			
			case "MW": 
			{
			GPSFormatDecimalDegrees = config.getMWGPSFormatDecimalDegrees();
			break;
			}
			
			case "MY": 
			{
			GPSFormatDecimalDegrees = config.getMYGPSFormatDecimalDegrees();
			break;
			}
			
			case "MZ": 
			{
			GPSFormatDecimalDegrees = config.getMZGPSFormatDecimalDegrees();
			break;
			}
			
			case "NZ": 
			{
			GPSFormatDecimalDegrees = config.getNZGPSFormatDecimalDegrees();
			break;
			}
			
			case "AU": 
			{
			GPSFormatDecimalDegrees = config.getAUGPSFormatDecimalDegrees();
			break;
			}
			
			case "SZ": 
			{
			GPSFormatDecimalDegrees = config.getSZGPSFormatDecimalDegrees();
			break;
			}
			
			case "ZW": 
			{
			GPSFormatDecimalDegrees = config.getZWGPSFormatDecimalDegrees();
			break;
			}
			
			case "ES": 
			{
			GPSFormatDecimalDegrees = config.getESGPSFormatDecimalDegrees();
			break;
			}
			
			case "RW": 
			{
			GPSFormatDecimalDegrees = config.getRWGPSFormatDecimalDegrees();
			break;
			}
			
			case "TZ": 
			{
			GPSFormatDecimalDegrees = config.getTZGPSFormatDecimalDegrees();
			break;
			}
			
			case "PH": 
			{
			GPSFormatDecimalDegrees = config.getPHGPSFormatDecimalDegrees();
			break;
			}
			
			case "NA": 
			{
			GPSFormatDecimalDegrees = config.getNAGPSFormatDecimalDegrees();
			break;
			}

			case "NG": 
			{
			GPSFormatDecimalDegrees = config.getNGGPSFormatDecimalDegrees();
			break;
			}
			
			case "KE": 
			{
			GPSFormatDecimalDegrees = config.getKEGPSFormatDecimalDegrees();
			break;
			}
			
			case "BW": 
			{
			GPSFormatDecimalDegrees = config.getBWGPSFormatDecimalDegrees();
			break;
			}
			
			case "FR": 
			{
			GPSFormatDecimalDegrees = config.getFRGPSFormatDecimalDegrees();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return GPSFormatDecimalDegrees;

	}
	
	public static boolean IsObjectClickable(String ObjectName, WebElement webElement, @Optional("Y") String ScreenCapture) throws InterruptedException  {
    	
    	// Check whether object is enabled
		Constant.driver.manage().timeouts().setScriptTimeout(Constant.ScriptTimeOut, TimeUnit.SECONDS);
		PageUtil.scrolltoElement(webElement);
		boolean objectclickable;
		
			if(webElement.isDisplayed() && webElement.isEnabled()){
	    	   Reporter.ReportEventNoImage(ObjectName+" is clickable");
	    	   objectclickable = true;
	    	}else {
	    		Reporter.ReportEventNoImage(ObjectName+" still NOT clickable"); {assertTrue(false);}
	    		objectclickable = false;
	    	}
		return objectclickable;
    }
	
	public static String getOwnerName(String activesite) {
		
			String OwnerName = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
	
			case "SG": 
			{
			OwnerName = config.getSGUserName();
			break;
			}
	
			case "TH": 
			{
			OwnerName = config.getTHUserName();
			break;
			}
	
			case "ZA": 
			{
			OwnerName = config.getZAUserName();
			break;
			}
	
			case "PT": 
			{
			OwnerName = config.getPTUserName();
			break;
			}
			
			case "ID": 
			{
			OwnerName = config.getIDUserName();
			break;
			}
			
			case "PL": 
			{
			OwnerName = config.getPLUserName();
			break;
			}
			
			case "HK": 
			{
			OwnerName = config.getHKUserName();
			break;
			}
			
			case "US": 
			{
			OwnerName = config.getUSUserName();
			break;
			}
			
			case "ME": 
			{
			OwnerName = config.getMEUserName();
			break;
			}
			
			case "MW": 
			{
			OwnerName = config.getMWUserName();
			break;
			}
			
			case "MY": 
			{
			OwnerName = config.getMYUserName();
			break;
			}
			
			case "MZ": 
			{
			OwnerName = config.getMZUserName();
			break;
			}
			
			case "NZ": 
			{
			OwnerName = config.getNZUserName();
			break;
			}
			
			case "AU": 
			{
			OwnerName = config.getAUUserName();
			break;
			}
			
			case "SZ": 
			{
			OwnerName = config.getSZUserName();
			break;
			}
			
			case "ZW": 
			{
			OwnerName = config.getZWUserName();
			break;
			}
			
			case "ES": 
			{
			OwnerName = config.getESUserName();
			break;
			}
			
			case "RW": 
			{
			OwnerName = config.getRWUserName();
			break;
			}
			
			case "TZ": 
			{
			OwnerName = config.getTZUserName();
			break;
			}
			
			case "PH": 
			{
			OwnerName = config.getPHUserName();
			break;
			}
			
			case "NA": 
			{
			OwnerName = config.getNAUserName();
			break;
			}
			
			case "KE": 
			{
			OwnerName = config.getKEUserName();
			break;
			}
			
			case "BW": 
			{
			OwnerName = config.getBWUserName();
			break;
			}
			
			case "FR": 
			{
			OwnerName = config.getFRUserName();
			break;
			}
			
			case "NG": 
			{
			OwnerName = config.getNGUserName();
			break;
			}
			
			//Add switch case options for other countries
			}
			return OwnerName;

	}
	
	public static String getVehicleNameNoTrip(String activesite) {
		
			String VehicleNameNoTrip = null;
			
			ConfigReader config = new ConfigReader();
			switch(activesite) {
	
			case "SG": 
			{
			VehicleNameNoTrip = config.getSGVehicleNoTrip();
			break;
			}
	
			case "TH": 
			{
			VehicleNameNoTrip = config.getTHVehicleNoTrip();
			break;
			}
	
			case "ZA": 
			{
			VehicleNameNoTrip = config.getZAVehicleNoTrip();
			break;
			}
	
			case "PT": 
			{
			VehicleNameNoTrip = config.getPTVehicleNoTrip();
			break;
			}
			
			case "ID": 
			{
			VehicleNameNoTrip = config.getIDVehicleNoTrip();
			break;
			}
			
			case "PL": 
			{
			VehicleNameNoTrip = config.getPLVehicleNoTrip();
			break;
			}
			
			case "HK": 
			{
			VehicleNameNoTrip = config.getHKVehicleNoTrip();
			break;
			}
			
			case "US": 
			{
			VehicleNameNoTrip = config.getUSVehicleNoTrip();
			break;
			}
			
			case "ME": 
			{
			VehicleNameNoTrip = config.getMEVehicleNoTrip();
			break;
			}
			
			case "MW": 
			{
			VehicleNameNoTrip = config.getMWVehicleNoTrip();
			break;
			}
			
			case "MY": 
			{
			VehicleNameNoTrip = config.getMYVehicleNoTrip();
			break;
			}
			
			case "MZ": 
			{
			VehicleNameNoTrip = config.getMZVehicleNoTrip();
			break;
			}
			
			case "NZ": 
			{
			VehicleNameNoTrip = config.getNZVehicleNoTrip();
			break;
			}
			
			case "AU": 
			{
			VehicleNameNoTrip = config.getAUVehicleNoTrip();
			break;
			}
			
			case "SZ": 
			{
			VehicleNameNoTrip = config.getSZVehicleNoTrip();
			break;
			}
			
			case "ZW": 
			{
			VehicleNameNoTrip = config.getZWVehicleNoTrip();
			break;
			}
			
			case "ES": 
			{
			VehicleNameNoTrip = config.getESVehicleNoTrip();
			break;
			}
			
			case "RW": 
			{
			VehicleNameNoTrip = config.getRWVehicleNoTrip();
			break;
			}
			
			case "TZ": 
			{
			VehicleNameNoTrip = config.getTZVehicleNoTrip();
			break;
			}
			
			case "PH": 
			{
			VehicleNameNoTrip = config.getPHVehicleNoTrip();
			break;
			}
			
			case "NA": 
			{
			VehicleNameNoTrip = config.getNAVehicleNoTrip();
			break;
			}
			
			case "KE": 
			{
			VehicleNameNoTrip = config.getKEVehicleNoTrip();
			break;
			}
			
			case "BW": 
			{
			VehicleNameNoTrip = config.getBWVehicleNoTrip();
			break;
			}
			
			case "FR": 
			{
			VehicleNameNoTrip = config.getFRVehicleNoTrip();
			break;
			}
			
			case "NG": 
			{
			VehicleNameNoTrip = config.getNGVehicleNoTrip();
			break;
			}
			
			//Add switch case options for other countries
			}
			return VehicleNameNoTrip;

	}
	
	public static String getValidSMS(String activesite) {
		
			//CellPhone
			ConfigReader config = new ConfigReader();
			String ValidSMS = null;
			switch(activesite) {
			
			case "SG": 
			{
			ValidSMS = config.getSGValidSMS();
			break;
			}
			
			case "TH": 
			{
			ValidSMS = config.getTHValidSMS();
			break;
			}
			
			case "ZA": 
			{
			ValidSMS = config.getZAValidSMS();
			break;
			}
			
			case "PT": 
			{
			ValidSMS = config.getPTValidSMS();
			break;
			}
			
			case "ID": 
			{
			ValidSMS = config.getIDValidSMS();
			break;
			}
			
			case "PL": 
			{
			ValidSMS = config.getPLValidSMS();
			break;
			}
			
			case "HK": 
			{
			ValidSMS = config.getHKValidSMS();
			break;
			}
			
			case "US": 
			{
			ValidSMS = config.getUSValidSMS();
			break;
			}
			
			case "ME": 
			{
			ValidSMS = config.getMEValidSMS();
			break;
			}
			
			case "MW": 
			{
			ValidSMS = config.getMWValidSMS();
			break;
			}
			
			case "MY": 
			{
			ValidSMS = config.getMYValidSMS();
			break;
			}
			
			case "MZ": 
			{
			ValidSMS = config.getMZValidSMS();
			break;
			}
			
			case "NZ": 
			{
			ValidSMS = config.getNZValidSMS();
			break;
			}
			
			case "AU": 
			{
			ValidSMS = config.getAUValidSMS();
			break;
			}
			
			case "SZ": 
			{
			ValidSMS = config.getSZValidSMS();
			break;
			}
			
			case "ZW": 
			{
			ValidSMS = config.getZWValidSMS();
			break;
			}
			
			case "ES": 
			{
			ValidSMS = config.getESValidSMS();
			break;
			}
			
			case "RW": 
			{
			ValidSMS = config.getRWValidSMS();
			break;
			}
			
			case "TZ": 
			{
			ValidSMS = config.getTZValidSMS();
			break;
			}
			
			case "PH": 
			{
			ValidSMS = config.getPHValidSMS();
			break;
			}
			
			case "NA": 
			{
			ValidSMS = config.getNAValidSMS();
			break;
			}
			
			case "KE": 
			{
			ValidSMS = config.getKEValidSMS();
			break;
			}
			
			case "BW": 
			{
			ValidSMS = config.getBWValidSMS();
			break;
			}
			
			case "FR": 
			{
			ValidSMS = config.getFRValidSMS();
			break;
			}
			
			case "NG": 
			{
			ValidSMS = config.getNGValidSMS();
			break;
			}
			
			
			//Add switch case options for other countries
			}
			
			return ValidSMS;
	}
	

	public static String getSensorTypeOne(String activesite) {
		
			ConfigReader config = new ConfigReader();
			
			String SensorTypeOne = null;
			switch(activesite) {
			
			case "SG": 
			{
			SensorTypeOne = config.getSGSensorTypeOne();
			break;
			}
			
			case "TH": 
			{
			SensorTypeOne = config.getTHSensorTypeOne();
			break;
			}
			
			case "ZA": 
			{
			SensorTypeOne = config.getZASensorTypeOne();
			break;
			}
			
			case "PT": 
			{
			SensorTypeOne = config.getPTSensorTypeOne();
			break;
			}
			
			case "ID": 
			{
			SensorTypeOne = config.getIDSensorTypeOne();
			break;
			}
			
			case "PL": 
			{
			SensorTypeOne = config.getPLSensorTypeOne();
			break;
			}
			
			case "HK": 
			{
			SensorTypeOne = config.getHKSensorTypeOne();
			break;
			}
			
			case "US": 
			{
			SensorTypeOne = config.getUSSensorTypeOne();
			break;
			}
			
			case "ME": 
			{
			SensorTypeOne = config.getMESensorTypeOne();
			break;
			}
			
			case "MW": 
			{
			SensorTypeOne = config.getMWSensorTypeOne();
			break;
			}
			
			case "MY": 
			{
			SensorTypeOne = config.getMYSensorTypeOne();
			break;
			}
			
			case "MZ": 
			{
			SensorTypeOne = config.getMZSensorTypeOne();
			break;
			}
			
			case "NZ": 
			{
			SensorTypeOne = config.getNZSensorTypeOne();
			break;
			}
			
			case "AU": 
			{
			SensorTypeOne = config.getAUSensorTypeOne();
			break;
			}
			
			case "SZ": 
			{
			SensorTypeOne = config.getSZSensorTypeOne();
			break;
			}
			
			case "ZW": 
			{
			SensorTypeOne = config.getZWSensorTypeOne();
			break;
			}
			
			case "ES": 
			{
			SensorTypeOne = config.getESSensorTypeOne();
			break;
			}
			
			case "RW": 
			{
			SensorTypeOne = config.getRWSensorTypeOne();
			break;
			}
			
			case "TZ": 
			{
			SensorTypeOne = config.getTZSensorTypeOne();
			break;
			}
			
			case "PH": 
			{
			SensorTypeOne = config.getPHSensorTypeOne();
			break;
			}
			
			case "NA": 
			{
			SensorTypeOne = config.getNASensorTypeOne();
			break;
			}
			
			case "KE": 
			{
			SensorTypeOne = config.getKESensorTypeOne();
			break;
			}
			
			case "BW": 
			{
			SensorTypeOne = config.getBWSensorTypeOne();
			break;
			}
			
			case "FR": 
			{
			SensorTypeOne = config.getFRSensorTypeOne();
			break;
			}
			
			case "NG": 
			{
			SensorTypeOne = config.getNGSensorTypeOne();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return SensorTypeOne;
	}
	
	public static String getSensorTypeTwo(String activesite) {
		
			ConfigReader config = new ConfigReader();
			
			String SensorTypeTwo = null;
			switch(activesite) {
			
			case "SG": 
			{
			SensorTypeTwo = config.getSGSensorTypeTwo();
			break;
			}
			
			case "TH": 
			{
			SensorTypeTwo = config.getTHSensorTypeTwo();
			break;
			}
			
			case "ZA": 
			{
			SensorTypeTwo = config.getZASensorTypeTwo();
			break;
			}
			
			case "PT": 
			{
			SensorTypeTwo = config.getPTSensorTypeTwo();
			break;
			}
			
			case "ID": 
			{
			SensorTypeTwo = config.getIDSensorTypeTwo();
			break;
			}
			
			case "PL": 
			{
			SensorTypeTwo = config.getPLSensorTypeTwo();
			break;
			}
			
			case "HK": 
			{
			SensorTypeTwo = config.getHKSensorTypeTwo();
			break;
			}
			
			case "US": 
			{
			SensorTypeTwo = config.getUSSensorTypeTwo();
			break;
			}
			
			case "ME": 
			{
			SensorTypeTwo = config.getMESensorTypeTwo();
			break;
			}
			
			case "MW": 
			{
			SensorTypeTwo = config.getMWSensorTypeTwo();
			break;
			}
			
			case "MY": 
			{
			SensorTypeTwo = config.getMYSensorTypeTwo();
			break;
			}
			
			case "MZ": 
			{
			SensorTypeTwo = config.getMZSensorTypeTwo();
			break;
			}
			
			case "NZ": 
			{
			SensorTypeTwo = config.getNZSensorTypeTwo();
			break;
			}
			
			case "AU": 
			{
			SensorTypeTwo = config.getAUSensorTypeTwo();
			break;
			}
			
			case "SZ": 
			{
			SensorTypeTwo = config.getSZSensorTypeTwo();
			break;
			}
			
			case "ZW": 
			{
			SensorTypeTwo = config.getZWSensorTypeTwo();
			break;
			}
			
			case "ES": 
			{
			SensorTypeTwo = config.getESSensorTypeTwo();
			break;
			}
			
			case "RW": 
			{
			SensorTypeTwo = config.getRWSensorTypeTwo();
			break;
			}
			
			case "TZ": 
			{
			SensorTypeTwo = config.getTZSensorTypeTwo();
			break;
			}
			
			case "PH": 
			{
			SensorTypeTwo = config.getPHSensorTypeTwo();
			break;
			}
			
			case "NA": 
			{
			SensorTypeTwo = config.getNASensorTypeTwo();
			break;
			}
			
			case "KE": 
			{
			SensorTypeTwo = config.getKESensorTypeTwo();
			break;
			}
			
			case "BW": 
			{
			SensorTypeTwo = config.getBWSensorTypeTwo();
			break;
			}
			
			case "FR": 
			{
			SensorTypeTwo = config.getFRSensorTypeTwo();
			break;
			}
			
			case "NG": 
			{
			SensorTypeTwo = config.getNGSensorTypeTwo();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return SensorTypeTwo;
	}
	public static String getDriverIDTag(String activesite) {
		
			//CellPhone
			ConfigReader config = new ConfigReader();
			String DriverIDTag = null;
			switch(activesite) {
			
			case "SG": 
			{
			DriverIDTag = config.getSGDriverIDTag();
			break;
			}
			
			case "TH": 
			{
			DriverIDTag = config.getTHDriverIDTag();
			break;
			}
			
			case "ZA": 
			{
			DriverIDTag = config.getZADriverIDTag();
			break;
			}
			
			case "PT": 
			{
			DriverIDTag = config.getPTDriverIDTag();
			break;
			}
			
			case "ID": 
			{
			DriverIDTag = config.getIDDriverIDTag();
			break;
			}
			
			case "PL": 
			{
			DriverIDTag = config.getPLDriverIDTag();
			break;
			}
			
			case "HK": 
			{
			DriverIDTag = config.getHKDriverIDTag();
			break;
			}
			
			case "US": 
			{
			DriverIDTag = config.getUSDriverIDTag();
			break;
			}
			
			case "ME": 
			{
			DriverIDTag = config.getMEDriverIDTag();
			break;
			}
			
			case "MW": 
			{
			DriverIDTag = config.getMWDriverIDTag();
			break;
			}
			
			case "MY": 
			{
			DriverIDTag = config.getMYDriverIDTag();
			break;
			}
			
			case "MZ": 
			{
			DriverIDTag = config.getMZDriverIDTag();
			break;
			}
			
			case "NZ": 
			{
			DriverIDTag = config.getNZDriverIDTag();
			break;
			}
			
			case "AU": 
			{
			DriverIDTag = config.getAUDriverIDTag();
			break;
			}
			
			case "SZ": 
			{
			DriverIDTag = config.getSZDriverIDTag();
			break;
			}
			
			case "ZW": 
			{
			DriverIDTag = config.getZWDriverIDTag();
			break;
			}
			
			case "ES": 
			{
			DriverIDTag = config.getESDriverIDTag();
			break;
			}
			
			case "RW": 
			{
			DriverIDTag = config.getRWDriverIDTag();
			break;
			}
			
			case "TZ": 
			{
			DriverIDTag = config.getTZDriverIDTag();
			break;
			}
			
			case "PH": 
			{
			DriverIDTag = config.getPHDriverIDTag();
			break;
			}
			
			case "NA": 
			{
			DriverIDTag = config.getNADriverIDTag();
			break;
			}
			
			case "KE": 
			{
			DriverIDTag = config.getKEDriverIDTag();
			break;
			}
			
			case "BW": 
			{
			DriverIDTag = config.getBWDriverIDTag();
			break;
			}
			
			case "FR": 
			{
			DriverIDTag = config.getFRDriverIDTag();
			break;
			}
			
			case "NG": 
			{
			DriverIDTag = config.getNGDriverIDTag();
			break;
			}
			
			//Add switch case options for other countries
			}
			
			return DriverIDTag;
	}

	public static void writeXLSFile(int row, int col, String value, String fileName) throws IOException {
        try {
        	
        	ConfigReader config = new ConfigReader();
    	   	if(config.getPlatform().equals("linux")) {
    	   		fileName = fileName.replace("\\", "/");
        	}
            FileInputStream file = new FileInputStream(fileName);
           
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Cell cell = null;

            //Retrieve the row and check for null
            HSSFRow sheetrow = sheet.getRow(row);
            if(sheetrow == null){
                sheetrow = sheet.createRow(row);
            }
            //Update the value of cell
            cell = sheetrow.getCell(col);
            if(cell == null){
                cell = sheetrow.createCell(col);
            }
            cell.setCellValue(value);

            file.close();

            FileOutputStream outFile =new FileOutputStream(new File(fileName));
            workbook.write(outFile);
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static String getTimeZoneDate(String activesite) {

    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date date = new Date();
        String todate = null;
        switch (activesite) {
        case "US":
        
        
        	// Use America/Los_Angeles's time zone to format the date in
            dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
            todate = dateFormat.format(date);
        break;
        
        case "SG":
        	// Use SG time zone to format the date in
            dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Singapore"));
            todate = dateFormat.format(date);
        break;
        
        case "PT":
        	// Use SG time zone to format the date in
            dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Lisbon"));
            todate = dateFormat.format(date);
        break;
        
        default:
        	
        	//Get System timezone
        	todate = dateFormat.format(date);
        }
  
    	return todate;
    	
	}
	
	public static String SelectReport(String activesite) throws IOException, Exception  {
		
		ConfigReader config = new ConfigReader();
		
		String ReportName = null;
		switch(activesite) {
		
		case "SG":
			ReportName = config.getSGReportName();
			break;
			
		case "TH":
			ReportName = config.getTHReportName();
			break;
			
		case "ZA":
			ReportName = config.getZAReportName();
			break;
			
		case "PT":
			ReportName = config.getPTReportName();
			break;
			
		case "ID":
			ReportName = config.getIDReportName();
			break;
			
		case "PL":
			ReportName = config.getPLReportName();
			break;
			
		case "US":
			ReportName = config.getUSReportName();
			break;
			
		case "ME":
			ReportName = config.getMEReportName();
			break;
		
		case "MY":
			ReportName = config.getMYReportName();
			break;	

		case "MW":
			ReportName = config.getMWReportName();
			break;	
			
		case "MZ":
			ReportName = config.getMZReportName();
			break;	
			
		case "HK":
			ReportName = config.getHKReportName();
			break;
			
		case "NZ":
			ReportName = config.getNZReportName();
			break;
			
		case "AU":
			ReportName = config.getAUReportName();
			break;
			
		case "SZ":
			ReportName = config.getSZReportName();
			break;	
			
		case "ZW":
			ReportName = config.getZWReportName();
			break;
			
		case "ES":
			ReportName = config.getESReportName();
			break;
			
		case "RW":
			ReportName = config.getRWReportName();
			break;
			
		case "TZ":
			ReportName = config.getTZReportName();
			break;
			
		case "NA":
			ReportName = config.getNAReportName();
			break;
			
		case "KE":
			ReportName = config.getKEReportName();
			break;
			
		case "BW":
			ReportName = config.getBWReportName();
			break;
			
		case "FR":
			ReportName = config.getFRReportName();
			break;
			
		case "PH":
			ReportName = config.getPHReportName();
			break;
			
		case "NG":
			ReportName = config.getNGReportName();
			break;
			
			
		//Need to add additional case options for other countries
		
		}
		
		return ReportName;
		
	}
	
	public static void writeXLSXFile(int row, int col, String value, String fileName) throws IOException {
        try {
        	
        	ConfigReader config = new ConfigReader();
    	   	if(config.getPlatform().equals("linux")) {
    	   		fileName = fileName.replace("\\", "/");
        	}

    	   	FileInputStream file = new FileInputStream(fileName);
            
    	   	XSSFWorkbook workbook = new XSSFWorkbook(file);
    	   	XSSFSheet sheet = workbook.getSheetAt(0);
    	   	Cell cell = null;

    	   	//Retrieve the row and check for null
    	   	XSSFRow sheetrow = sheet.getRow(row);
    	   	if(sheetrow == null){
    	   		sheetrow = sheet.createRow(row);
    	   	}
    	   	//Update the value of cell
    	   	cell = sheetrow.getCell(col);
    	   	if(cell == null){
    	   		cell = sheetrow.createCell(col);
    	   	}
    	   	cell.setCellValue(value);

    	   	file.close();

    	   	FileOutputStream outFile =new FileOutputStream(new File(fileName));
    	   	workbook.write(outFile);
    	   	outFile.close();
    	   	

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static void saveXLSXFile(String fileName) throws IOException {
        try {
        	
        	ConfigReader config = new ConfigReader();
    	   	if(config.getPlatform().equals("linux")) {
    	   		fileName = fileName.replace("\\", "/");
        	}

    	    //open file
            XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File(fileName)));
            XSSFFormulaEvaluator.evaluateAllFormulaCells(wb);

            //save file
            FileOutputStream out = new FileOutputStream(fileName);
            wb.write(out);
            out.close();

            wb = new XSSFWorkbook(new FileInputStream(new File(fileName)));
            System.out.println(wb.getSheetAt(0).getRow(1).getCell(0).getDateCellValue().toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
    public static boolean WaitForToasterMessageToLoad (WebElement webElement) {
    
    	boolean objectdisplayed;
    	try {
    	//Check Elements every 1 sec for 60 secs
        WebDriverWait wait = new WebDriverWait(Constant.driver, 60);
        wait.pollingEvery(1, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        
        if (webElement.isDisplayed()) {
			objectdisplayed = true;
			PageUtil.scrolltoElement(webElement);
		} else {
			objectdisplayed = false;
		}	
        
		} catch (Exception e) {
			objectdisplayed = false;
		}
	
    	return objectdisplayed;
       
    }
    
    public static boolean WaitForDataToLoad (WebElement webElement) {
        
    	boolean objectdisplayed;
    	try {
    	//Check Elements every 1 sec for 60 secs
        WebDriverWait wait = new WebDriverWait(Constant.driver, 60);
        wait.pollingEvery(1, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        
        if (webElement.isDisplayed()) {
			objectdisplayed = true;
			PageUtil.scrolltoElement(webElement);
		} else {
			objectdisplayed = false;
		}	
        
		} catch (Exception e) {
			objectdisplayed = false;
		}
	
    	return objectdisplayed;
       
    }

}
