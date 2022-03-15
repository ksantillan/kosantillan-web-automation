package utility;

import java.awt.Color;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporter {

	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	static ExtentTest logger;

	public static void attachedImage(String StepDescription) {

		try {
			Constant.logger.pass("Step " + Constant.ReportStepNumber + " - " + StepDescription, MediaEntityBuilder.createScreenCaptureFromPath(PageUtil.getScreenshot(Constant.driver,"image")).build());
			Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
			Constant.ReportStepNumber = Constant.ReportStepNumber + 1;
			Thread.sleep(500);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

	public static void attachedImageFailed(String StepDescription) {

		try {
			Constant.highlightcolor = Color.RED;
			Constant.logger.fail("Step " + Constant.ReportStepNumber + " - " + StepDescription, MediaEntityBuilder.createScreenCaptureFromPath(PageUtil.getScreenshot(Constant.driver,"image")).build());
			//try{assertTrue(false);}
			//catch(AssertionError e) {Constant.error = true;}
			Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
			Constant.ReportStepNumber = Constant.ReportStepNumber + 1;
			Constant.highlightcolor = Color.RED;
			Constant.error = true;
			Thread.sleep(500);
			throw new AssertionError(StepDescription);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}	

	public static void ReportEventNoImage(String StepDescription) {

		try {
			Constant.logger.pass("Step " + Constant.ReportStepNumber + " - " + StepDescription);
			Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
			Constant.ReportStepNumber = Constant.ReportStepNumber + 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	


	public static void ReportEventCustomStatus(String StepDescription, String Status, String ScreenCapture) {

		try {
			if(ScreenCapture.equals("N")) {
				switch(Status.toLowerCase()) {
				case "pass":
					Constant.logger.pass("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					break;
				case "fail":
					Constant.logger.fail("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					Constant.error = true;
					throw new AssertionError(StepDescription);
					//break;
				case "info":
					Constant.logger.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					break;
				case "warn":
					Constant.logger.warning("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					Constant.error = true;
					throw new AssertionError(StepDescription);
					//break;
				}
			}else if(ScreenCapture.equals("Y")) {
				switch(Status.toLowerCase()) {
				case "pass":
					Constant.logger.pass("Step " + Constant.ReportStepNumber + " - " + StepDescription, MediaEntityBuilder.createScreenCaptureFromPath(PageUtil.getScreenshot(Constant.driver,"desktop")).build());
					Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					break;
				case "fail":
					Constant.logger.fail("Step " + Constant.ReportStepNumber + " - " + StepDescription, MediaEntityBuilder.createScreenCaptureFromPath(PageUtil.getScreenshot(Constant.driver,"desktop")).build());
					Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					Constant.error = true;
					throw new AssertionError(StepDescription);
					//break;
				case "info":
					Constant.logger.info("Step " + Constant.ReportStepNumber + " - " + StepDescription, MediaEntityBuilder.createScreenCaptureFromPath(PageUtil.getScreenshot(Constant.driver,"desktop")).build());
					Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					break;
				case "warn":
					Constant.logger.warning("Step " + Constant.ReportStepNumber + " - " + StepDescription, MediaEntityBuilder.createScreenCaptureFromPath(PageUtil.getScreenshot(Constant.driver,"desktop")).build());
					Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
					Constant.error = true;
					throw new AssertionError(StepDescription);
					//break;
				}	
			}				
			Constant.ReportStepNumber = Constant.ReportStepNumber + 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	

	public static void attachedDesktopImage(String StepDescription) {

		try {
			Constant.logger.pass("Step " + Constant.ReportStepNumber + " - " + StepDescription, MediaEntityBuilder.createScreenCaptureFromPath(PageUtil.getScreenshot(Constant.driver,"desktop")).build());
			Constant.consoleLog.info("Step " + Constant.ReportStepNumber + " - " + StepDescription);
			Constant.ReportStepNumber = Constant.ReportStepNumber + 1;
			Thread.sleep(500);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

	public static ExtentTest PrepareReport(String TestCasename) {

		String TestCaseName = Constant.TestCasename;
		if(Constant.group) {
			TestCaseName = Constant.TestNGparam.get("reportname").toString();	
			Constant.TestCasename=TestCaseName;
		}
		try {
			if(!Constant.TestNGparam.get("reportname").toString().isEmpty()) {
				Constant.TestCasename = Constant.TestNGparam.get("reportname").toString();
			}			
		}catch(Exception e) {}		
		
		if(htmlReporter == null) {
			htmlReporter = new ExtentHtmlReporter(Constant.Path_Report +TestCaseName+ ".html");
		}
		if(extent ==null) {
			extent = new ExtentReports ();		
		}	

		ConfigReader config = new ConfigReader();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", config.getBrowser().toUpperCase());
		extent.setSystemInfo("Environment", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		Constant.extent = extent;

		htmlReporter.config().setDocumentTitle(TestCaseName);
		htmlReporter.config().setReportName(TestCaseName+ " Test Results");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);			
		htmlReporter.config().setChartVisibilityOnOpen(false);


		logger = extent.createTest(TestCasename);

		return Constant.logger = logger;
	}

}
