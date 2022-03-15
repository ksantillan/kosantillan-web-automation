package utility;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Constant {
	
	
	public static WebDriver driver;
	
	public static String browser;
	public static By currentLocator;	
	public static String testBed;
	
	public static final String Path_Chromedriver =  System.getProperty("user.dir") + "\\jd\\drivers\\chromedriver.exe";
	public static final String Path_IEdriver =  System.getProperty("user.dir") + "\\jd\\drivers\\IEDriverServer.exe";
	public static final String Path_Geckodriver =  System.getProperty("user.dir") + "\\jd\\drivers\\geckodriver.exe";
	public static final String Path_MsEdgedriver =  System.getProperty("user.dir") + "\\jd\\drivers\\msedgedriver.exe";
	public static final String Path_ChromeLinuxdriver =  System.getProperty("user.dir") + "//jd//drivers//chromedriver";
	public static final String Path_GeckoLinuxdriver =  System.getProperty("user.dir") + "//jd//drivers//geckodriver";
	public static final String Path_MsEdgeLinuxdriver =  System.getProperty("user.dir") + "//jd//drivers//msedgedriver";


	public static int ScriptTimeOut = 5;
	public static boolean WaitTime=false; //this is for isobjectdisplayed --to bypassed the waiting time.

	/*Location  of Test Data excel file*/
	public static String Path_TestData =System.getProperty("user.dir") + "\\src\\testData\\" ;
	
	/*Initial row to get test data*/
	public static int RowNum = 1;

	/*Initial column to get test data DatatableTranspose*/
	public static int ColNum = 1;	
	
	/*LastRow of the excelfile*/
	public static int LastRow;
	
	/*Location of the html report*/
	public static String  Path_Report;// = System.getProperty("user.dir") + "\\Report"+ "\\TestResult"+Constant.TestCasename+ "\\";
	//public static String  Path_Report = System.getProperty("user.dir") + "\\Report\\Report" + Constant.timestamp + "\\Report" + Constant.timestamp +".html";
	
	public static String timestamp = new SimpleDateFormat("_MMddyyyy_hhmmss").format(new Date());
		
	public static Logger consoleLog = Logger.getLogger(Logs.class.getName());

	public static ExtentReports extent;

	public static ExtentTest logger;
	
	public static int ReportStepNumber = 1;
	
	public static WebElement webElement;
	
	public static Color highlightcolor = Color.GREEN;

	public static boolean error = false;

	public static String TestCasename;

	public static boolean group = false;
	
	public static HashMap<String,String> TestNGparam;
	
	public static String ProdDomainURL="";
	

}



