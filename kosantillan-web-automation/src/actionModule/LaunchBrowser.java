package actionModule;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.microsoft.edge.seleniumtools.EdgeOptions;
import pageObject.LoginPage;
import utility.ConfigReader;
import utility.Constant;
import utility.DoThis;
import utility.Reporter;


public class LaunchBrowser extends utility.PageUtil{


	public static WebDriver driver = null;	
	//private static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	public static void Execute(String browser, String activesite, String activeenvironment, boolean Admin, boolean NewSession) throws MalformedURLException{

		ConfigReader config = new ConfigReader();
		if(NewSession==true) {

			Constant.consoleLog.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			Constant.testBed=Constant.browser;
			Constant.consoleLog.info("browser-- " +browser);
			Constant.consoleLog.info("Platform -- " +config.getPlatform());
			//Get Config file value if empty
			if(activeenvironment == null) {
				activeenvironment=config.getEnvironmentToUse();
			}
			Constant.consoleLog.info("Environment -- " +activeenvironment);
			Constant.consoleLog.info("Country -- " +activesite);
			Constant.consoleLog.info("TestBed -- " +config.getTestBed());

			switch(config.getTestBed()) {
			case "local":
				switch(config.getPlatform()) {
				case "win10":
					switch(browser) {
					case "chrome":
						DesiredCapabilities dc = new DesiredCapabilities();
	                    dc.setCapability("acceptInsecureCerts",true);
						System.setProperty("webdriver.chrome.driver", Constant.Path_Chromedriver);
						driver = new ChromeDriver(dc);
						Constant.driver = (WebDriver) driver; break;
					case "ie":
						System.setProperty("webdriver.ie.driver", Constant.Path_IEdriver);
						driver = new InternetExplorerDriver();					  
						Constant.driver = (WebDriver) driver; break;
					case "firefox":
						System.setProperty("webdriver.gecko.driver", Constant.Path_Geckodriver);
						System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
						driver = new FirefoxDriver();					  
						Constant.driver = (WebDriver) driver; break;	
					case "msedge":
						System.setProperty("webdriver.edge.driver", Constant.Path_MsEdgedriver);
						driver = new EdgeDriver();					  
						Constant.driver = (WebDriver) driver; break;
					}
				} break;
			case "headless":
				switch(config.getPlatform()) {
				case "linux":
					switch(browser) {
					case "chrome":				
						System.setProperty("webdriver.chrome.driver", Constant.Path_ChromeLinuxdriver);
						ChromeOptions chromeoptions = new ChromeOptions();
						chromeoptions.addArguments("headless");
						chromeoptions.addArguments("--disable-gpu");
						chromeoptions.addArguments("disable-infobars");
						chromeoptions.addArguments("--disable-extensions");
						chromeoptions.addArguments("window-size=1980x1080");
						chromeoptions.addArguments("--no-sandbox");
						chromeoptions.setCapability("acceptInsecureCerts",true);
						driver = new ChromeDriver(chromeoptions); 
						Constant.driver = (WebDriver) driver; break;		
					case "firefox":
						System.setProperty("webdriver.gecko.driver", Constant.Path_GeckoLinuxdriver);
						System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
						FirefoxOptions firefoxoptions = new FirefoxOptions();
						firefoxoptions.addArguments("--headless");
						firefoxoptions.addArguments("--disable-gpu");
						firefoxoptions.addArguments("window-size=1980x1080");
						driver = new FirefoxDriver(firefoxoptions);					  
						Constant.driver = (WebDriver) driver; break;	
					case "msedge":				
						System.setProperty("webdriver.edge.driver", Constant.Path_MsEdgeLinuxdriver);
						EdgeOptions msedgeoptions = new EdgeOptions();
						msedgeoptions.addArguments("headless");
						msedgeoptions.addArguments("disable-gpu");
						msedgeoptions.addArguments("window-size=1980x1080");
						msedgeoptions.addArguments("--no-sandbox");
						driver = new EdgeDriver(msedgeoptions); 
						Constant.driver = (WebDriver) driver; break;
					} break;
				
				case "win10":
					switch(browser) {
					case "chrome":
						System.setProperty("webdriver.chrome.driver", Constant.Path_Chromedriver);
						ChromeOptions chromeoptions = new ChromeOptions();
						chromeoptions.addArguments("headless");
						chromeoptions.addArguments("--disable-gpu");
						chromeoptions.addArguments("disable-infobars");
						chromeoptions.addArguments("--disable-extensions");
						chromeoptions.addArguments("window-size=1980x1080");
						chromeoptions.setCapability("acceptInsecureCerts",true);
						driver = new ChromeDriver(chromeoptions); 
						Constant.driver = (WebDriver) driver; break;
					case "firefox":
						System.setProperty("webdriver.gecko.driver", Constant.Path_Geckodriver);
						System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
						FirefoxOptions firefoxoptions = new FirefoxOptions();
						firefoxoptions.addArguments("--headless");
						firefoxoptions.addArguments("--disable-gpu");
						firefoxoptions.addArguments("window-size=1980x1080");
						driver = new FirefoxDriver(firefoxoptions);					  
						Constant.driver = (WebDriver) driver; break;	
					case "msedge":
						System.setProperty("webdriver.edge.driver", Constant.Path_MsEdgedriver);
						EdgeOptions msedgeoptions = new EdgeOptions();
						msedgeoptions.addArguments("headless");
						msedgeoptions.addArguments("disable-gpu");
						msedgeoptions.addArguments("window-size=1980x1080");
						msedgeoptions.addArguments("--no-sandbox");
						driver = new EdgeDriver(msedgeoptions); 
						Constant.driver = (WebDriver) driver; break;
					}break;
				}
			}
		}
	
		String url = null;
		String language = config.getLanguage();
		WebElement LanguageElement = null;
		
		if(Admin==true) {
			//Add Countries that requires to update language and accessing via SSO Token ID
			switch(activeenvironment) {
			case "Dev":
				switch(activesite) {
				case "FR":
					url = config.getFRDevURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);	
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;	
				case "ES":
					url = config.getESDevURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);	
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case "ARVALPL":
					url = config.getARVALPLDevURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);	
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				default:break;
				}
				break;
				
			case "Test":
				switch(activesite) {
				case "FR":
					url = config.getFRTestURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case "ES":
					url = config.getESTestURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case "ARVALPL":
					url = config.getARVALPLTestURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				default:break;
				}
				break;
				
			case "Prod":
				switch(activesite) {
				case "FR":
					url = config.getFRProdURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);	
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case "ES":
					url = config.getESProdURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);	
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case "ARVALPL":
					url = config.getARVALPLProdURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);	
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				default:break;
				}
				break;
			}
			
			if(Constant.ProdDomainURL.isEmpty()) {
				switch(activeenvironment) {
				case "Dev":
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
					case("HINOID"): url = config.getHINOIDDevURL();break;
					case("MANKE"): url = config.getMANKEDevURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMEDevURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZDevURL();break;
					case("ARVALPL"): url = config.getARVALPLDevURL();break;
					case("PANUSTH"): url = config.getPANUSTHDevURL();break;
					case("HINOZA"): url = config.getHINOZADevURL();break;
					case("MANZA"): url = config.getMANZADevURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWDevURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKEDevURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZDevURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWDevURL();break;
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
					case("HINOID"): url = config.getHINOIDTestURL();break;
					case("MANKE"): url = config.getMANKETestURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMETestURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZTestURL();break;
					case("ARVALPL"): url = config.getARVALPLTestURL();break;
					case("PANUSTH"): url = config.getPANUSTHTestURL();break;
					case("HINOZA"): url = config.getHINOZATestURL();break;
					case("MANZA"): url = config.getMANZATestURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWTestURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKETestURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZTestURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWTestURL();break;
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
					case("HINOID"): url = config.getHINOIDProdURL();break;
					case("MANKE"): url = config.getMANKEProdURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMEProdURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZProdURL();break;
					case("ARVALPL"): url = config.getARVALPLProdURL();break;
					case("PANUSTH"): url = config.getPANUSTHProdURL();break;
					case("HINOZA"): url = config.getHINOZAProdURL();break;
					case("MANZA"): url = config.getMANZAProdURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWProdURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKEProdURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZProdURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWProdURL();break;
					}
					break;	
				default:break;
				}
				
			}else {	url=Constant.ProdDomainURL;	}	
			
			
			//Users
			String Username = null;
			//Only Add Countries that accessible via SSO Token link
			switch(activesite) {
				case "NA":
					Username = config.getNAUserName();break;
				case "KE": 
					Username = config.getKEUserName();break;
				case "PH":
					Username = config.getPHUserName();break;
				case "NG":
					Username = config.getNGUserName();break;					
				case "BW":
					Username = config.getBWUserName();break;
				case "FR":
					Username = config.getFRUserName();break;
				case "ID":
					Username = config.getIDUserName();break;
				case "MY":
					Username = config.getMYUserName();break;
				case "NZ":
					Username = config.getNZUserName();break;
				case "AU":
					Username = config.getAUUserName();break;
				case "ES":
					Username = config.getESUserName();break;
				case "MW":
					Username = config.getMWUserName();break;
				case "HINOID":
					Username = config.getHINOIDUserName();break;
				case "MANKE":
					Username = config.getMANKEUserName();break;
				case "OWSAUTOME":
					Username = config.getOWSAUTOMEUserName();break;
				case "NORWOODNZ":
					Username = config.getNORWOODNZUserName();break;
				case "ARVALPL":
					Username = config.getARVALPLUserName();break;
				case "PANUSTH":
					Username = config.getPANUSTHUserName();break;
				case "HINOZA":
					Username = config.getHINOZAUserName();break;
				case "MANZA":
					Username = config.getMANZAUserName();break;
				case "TELTRACKZW":
					Username = config.getTELTRACKZWUserName();break;
				case "TOYOTAKE":
					Username = config.getTOYOTAKEUserName();break;
				case "TOYOTATZ":
					Username = config.getTOYOTATZUserName();break;
				case "TOYOTAMW":
					Username = config.getTOYOTAMWUserName();break;
				default:break;
				}	
			
			//Token
			String Token = null;
			//Countries that accessible via SSO Token link
			switch(activesite) {
				case "NA":
					Token = config.getNAToken();break;	
				case "KE":
					Token = config.getKEToken();break;
				case "PH":
					Token = config.getPHToken();break;
				case "NG":
					Token = config.getNGToken();break;					
				case "BW":
					Token = config.getBWToken();break;	
				case "FR":
					Token = config.getFRToken();break;	
				case "ID":
					Token = config.getIDToken();break;	
				case "MY":
					Token = config.getMYToken();break;	
				case "NZ":
					Token = config.getNZToken();break;
				case "AU":
					Token = config.getAUToken();break;
				case "ES":
					Token = config.getESToken();break;	
				case "MW":
					Token = config.getMWToken();break;
				case "HINOID":
					Token = config.getHINOIDToken();break;
				case "MANKE":
					Token = config.getMANKEToken();break;
				case "OWSAUTOME":
					Token = config.getOWSAUTOMEToken();break;
				case "NORWOODNZ":
					Token = config.getNORWOODNZToken();break;
				case "ARVALPL":
					Token = config.getARVALPLToken();break;
				case "PANUSTH":
					Token = config.getPANUSTHToken();break;
				case "HINOZA":
					Token = config.getHINOZAToken();break;
				case "MANZA":
					Token = config.getMANZAToken();break;
				case "TELTRACKZW":
					Token = config.getTELTRACKZWToken();break;
				case "TOYOTAKE":
					Token = config.getTOYOTAKEToken();break;
				case "TOYOTATZ":
					Token = config.getTOYOTATZToken();break;
				case "TOYOTAMW":
					Token = config.getTOYOTAMWToken();break;
				default:break;
				}	
			
			//Countries that accessible via SSO Token link
			switch(activesite) {
				case("NA"):
				case("KE"):
				case("PH"):
				case("NG"):					
				case("BW"):
				case("FR"):
				case("ID"):
				case("MY"):
				case("NZ"):
				case("AU"):
				case("ES"):
				case("MW"):
				case("HINOID"):
				case("MANKE"):
				case("OWSAUTOME"):
				case("NORWOODNZ"):
				case("ARVALPL"):
				case("PANUSTH"):
				case("HINOZA"):
				case("MANZA"):
				case("TELTRACKZW"):
				case("TOYOTAKE"):
				case("TOYOTATZ"):
				case("TOYOTAMW"):
				url = url.replace("welcome", "?t=");
				url = url+Token+"&sso="+Username;
				break;
				default:break;
			}
		}else {
			if(Constant.ProdDomainURL.isEmpty()) {
				switch(activeenvironment) {
				case "Dev":
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
					case("HINOID"): url = config.getHINOIDDevURL();break;
					case("MANKE"): url = config.getMANKEDevURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMEDevURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZDevURL();break;
					case("ARVALPL"): url = config.getARVALPLDevURL();break;
					case("PANUSTH"): url = config.getPANUSTHDevURL();break;
					case("HINOZA"): url = config.getHINOZADevURL();break;	
					case("MANZA"): url = config.getMANZADevURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWDevURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKEDevURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZDevURL();break;
					case("TOYOTAMW"): url = config.getTOYOTATZDevURL();break;
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
					case("HINOID"): url = config.getHINOIDTestURL();break;
					case("MANKE"): url = config.getMANKETestURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMETestURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZTestURL();break;
					case("ARVALPL"): url = config.getARVALPLTestURL();break;
					case("PANUSTH"): url = config.getPANUSTHTestURL();break;
					case("HINOZA"): url = config.getHINOZATestURL();break;
					case("MANZA"): url = config.getMANZATestURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWTestURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKETestURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZTestURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWTestURL();break;
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
					case("HINOID"): url = config.getHINOIDProdURL();break;
					case("MANKE"): url = config.getMANKEProdURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMEProdURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZProdURL();break;
					case("ARVALPL"): url = config.getARVALPLProdURL();break;
					case("PANUSTH"): url = config.getPANUSTHProdURL();break;
					case("HINOZA"): url = config.getHINOZAProdURL();break;
					case("MANZA"): url = config.getMANZAProdURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWProdURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKEProdURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZProdURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWProdURL();break;
					}
					break;	
				default:break;
				}
			}		
			
		}
		Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
		Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
		Constant.driver.get(url);
		Constant.driver.manage().window().maximize();
		Reporter.ReportEventNoImage("Launch Website - " + url);	
		DoThis.InitElements();
		
		if(Admin==false) {
			//Force set Language to English
			//Change Language to English if not English
			switch(activesite) {
			case("FR"): 
				try {
					DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
					DoThis.click(LoginPage.cmbbxLanguage, "Y");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
				try {
					DoThis.click(LanguageElement, "Y");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			default:break;
			}
		}
		//Change Language to English if not English
		switch(activesite) {
		case("PT"): 
		case("PL"): 
		case("MZ"): 		

			try {
				DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
				DoThis.click(LoginPage.cmbbxLanguage, "Y");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
			try {
				DoThis.click(LanguageElement, "Y");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
		default:break;
		}
	
	}
	
	public static void OpenNewBrowser(String url) throws MalformedURLException{
	
		Constant.driver.get(url);
		Constant.driver.manage().window().maximize();
		Reporter.ReportEventNoImage("Launch Website - " + url);	
	
	}
	
	public static void Welcome(String browser, String activesite, String activeenvironment, boolean Admin, boolean NewSession) throws MalformedURLException{


		ConfigReader config = new ConfigReader();
		if(NewSession==true) {

			Constant.consoleLog.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			Constant.testBed=Constant.browser;
			Constant.consoleLog.info("browser-- " +browser);
			Constant.consoleLog.info("Platform -- " +config.getPlatform());
			//Get Config file value if empty
			if(activeenvironment == null) {
				activeenvironment=config.getEnvironmentToUse();
			}
			Constant.consoleLog.info("Environment -- " +activeenvironment);
			Constant.consoleLog.info("Country -- " +activesite);
			Constant.consoleLog.info("TestBed -- " +config.getTestBed());

			switch(config.getTestBed()) {
			case "local":
				switch(config.getPlatform()) {
				case "win10":
					switch(browser) {
					case "chrome":
						DesiredCapabilities dc = new DesiredCapabilities();
	                    dc.setCapability("acceptInsecureCerts",true);
						System.setProperty("webdriver.chrome.driver", Constant.Path_Chromedriver);
						driver = new ChromeDriver(dc);
						Constant.driver = (WebDriver) driver; break;
					case "ie":
						System.setProperty("webdriver.ie.driver", Constant.Path_IEdriver);
						driver = new InternetExplorerDriver();					  
						Constant.driver = (WebDriver) driver; break;
					case "firefox":
						System.setProperty("webdriver.gecko.driver", Constant.Path_Geckodriver);
						System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
						driver = new FirefoxDriver();					  
						Constant.driver = (WebDriver) driver; break;	
					case "msedge":
						System.setProperty("webdriver.edge.driver", Constant.Path_MsEdgedriver);
						driver = new EdgeDriver();					  
						Constant.driver = (WebDriver) driver; break;
					}
				} break;
			case "headless":
				switch(config.getPlatform()) {
				case "linux":
					switch(browser) {
					case "chrome":				
						System.setProperty("webdriver.chrome.driver", Constant.Path_ChromeLinuxdriver);
						ChromeOptions chromeoptions = new ChromeOptions();
						chromeoptions.addArguments("headless");
						chromeoptions.addArguments("--disable-gpu");
						chromeoptions.addArguments("disable-infobars");
						chromeoptions.addArguments("--disable-extensions");
						chromeoptions.addArguments("window-size=1980x1080");
						chromeoptions.addArguments("--no-sandbox");
						driver = new ChromeDriver(chromeoptions); 
						Constant.driver = (WebDriver) driver; break;		
					case "firefox":
						System.setProperty("webdriver.gecko.driver", Constant.Path_GeckoLinuxdriver);
						System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
						FirefoxOptions firefoxoptions = new FirefoxOptions();
						firefoxoptions.addArguments("--headless");
						firefoxoptions.addArguments("--disable-gpu");
						firefoxoptions.addArguments("window-size=1980x1080");
						driver = new FirefoxDriver(firefoxoptions);					  
						Constant.driver = (WebDriver) driver; break;	
					case "msedge":				
						System.setProperty("webdriver.edge.driver", Constant.Path_MsEdgeLinuxdriver);
						EdgeOptions msedgeoptions = new EdgeOptions();
						msedgeoptions.addArguments("headless");
						msedgeoptions.addArguments("disable-gpu");
						msedgeoptions.addArguments("window-size=1980x1080");
						msedgeoptions.addArguments("--no-sandbox");
						driver = new EdgeDriver(msedgeoptions); 
						Constant.driver = (WebDriver) driver; break;
					} break;
				
				case "win10":
					switch(browser) {
					case "chrome":
						System.setProperty("webdriver.chrome.driver", Constant.Path_Chromedriver);
						ChromeOptions chromeoptions = new ChromeOptions();
						chromeoptions.addArguments("headless");
						chromeoptions.addArguments("--disable-gpu");
						chromeoptions.addArguments("disable-infobars");
						chromeoptions.addArguments("--disable-extensions");
						chromeoptions.addArguments("window-size=1980x1080");
						driver = new ChromeDriver(chromeoptions); 
						Constant.driver = (WebDriver) driver; break;
					case "firefox":
						System.setProperty("webdriver.gecko.driver", Constant.Path_Geckodriver);
						System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
						FirefoxOptions firefoxoptions = new FirefoxOptions();
						firefoxoptions.addArguments("--headless");
						firefoxoptions.addArguments("--disable-gpu");
						firefoxoptions.addArguments("window-size=1980x1080");
						driver = new FirefoxDriver(firefoxoptions);					  
						Constant.driver = (WebDriver) driver; break;	
					case "msedge":
						System.setProperty("webdriver.edge.driver", Constant.Path_MsEdgedriver);
						EdgeOptions msedgeoptions = new EdgeOptions();
						msedgeoptions.addArguments("headless");
						msedgeoptions.addArguments("disable-gpu");
						msedgeoptions.addArguments("window-size=1980x1080");
						msedgeoptions.addArguments("--no-sandbox");
						driver = new EdgeDriver(msedgeoptions); 
						Constant.driver = (WebDriver) driver; break;
					}break;
				}
			}
		}
	
		String url = null;
		String language = config.getLanguage();
		WebElement LanguageElement = null;
		
		if(Admin==true) {
			//Add Countries that requires to update language and accessing via SSO Token ID
			switch(activeenvironment) {
			case "Dev":
				switch(activesite) {
				case "FR":
					url = config.getFRDevURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);	
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;	
				case "ES":
					url = config.getESDevURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);	
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				default:break;
				}
				break;
				
			case "Test":
				switch(activesite) {
				case "FR":
					url = config.getFRTestURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case "ES":
					url = config.getESTestURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				default:break;
				}
				break;
				
			case "Prod":
				switch(activesite) {
				case "FR":
					url = config.getFRProdURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);	
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case "ES":
					url = config.getESProdURL();
					Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
					Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
					Constant.driver.get(url);
					Constant.driver.manage().window().maximize();
					Reporter.ReportEventNoImage("Launch Website - " + url);	
					DoThis.InitElements();
					try {
						DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
						DoThis.click(LoginPage.cmbbxLanguage, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
					try {
						DoThis.click(LanguageElement, "Y");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				default:break;
				}
				break;
			}
			
			if(Constant.ProdDomainURL.isEmpty()) {
				switch(activeenvironment) {
				case "Dev":
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
					case("HINOID"): url = config.getHINOIDDevURL();break;
					case("MANKE"): url = config.getMANKEDevURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMEDevURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZDevURL();break;
					case("ARVALPL"): url = config.getARVALPLDevURL();break;
					case("PANUSTH"): url = config.getPANUSTHDevURL();break;
					case("HINOZA"): url = config.getHINOZADevURL();break;
					case("MANZA"): url = config.getMANZADevURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWDevURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKEDevURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZDevURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWDevURL();break;
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
					case("HINOID"): url = config.getHINOIDTestURL();break;
					case("MANKE"): url = config.getMANKETestURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMETestURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZTestURL();break;
					case("ARVALPL"): url = config.getARVALPLTestURL();break;
					case("PANUSTH"): url = config.getPANUSTHTestURL();break;
					case("HINOZA"): url = config.getHINOZATestURL();break;
					case("MANZA"): url = config.getMANZATestURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWTestURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKETestURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZTestURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWTestURL();break;
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
					case("HINOID"): url = config.getHINOIDProdURL();break;
					case("MANKE"): url = config.getMANKEProdURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMEProdURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZProdURL();break;
					case("ARVALPL"): url = config.getARVALPLProdURL();break;
					case("PANUSTH"): url = config.getPANUSTHProdURL();break;
					case("HINOZA"): url = config.getHINOZAProdURL();break;
					case("MANZA"): url = config.getMANZAProdURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWProdURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKEProdURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZProdURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWProdURL();break;
					}
					break;	
				default:break;
				}
				
			}else {	url=Constant.ProdDomainURL;	}	
			
		}else {
			if(Constant.ProdDomainURL.isEmpty()) {
				switch(activeenvironment) {
				case "Dev":
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
					case("HINOID"): url = config.getHINOIDDevURL();break;
					case("MANKE"): url = config.getMANKEDevURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMEDevURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZDevURL();break;
					case("ARVALPL"): url = config.getARVALPLDevURL();break;
					case("PANUSTH"): url = config.getPANUSTHDevURL();break;
					case("HINOZA"): url = config.getHINOZADevURL();break;
					case("MANZA"): url = config.getMANZADevURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWDevURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKEDevURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZDevURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWDevURL();break;
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
					case("HINOID"): url = config.getHINOIDTestURL();break;
					case("MANKE"): url = config.getMANKETestURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMETestURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZTestURL();break;	
					case("ARVALPL"): url = config.getARVALPLTestURL();break;
					case("PANUSTH"): url = config.getPANUSTHTestURL();break;
					case("HINOZA"): url = config.getHINOZATestURL();break;
					case("MANZA"): url = config.getMANZATestURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWTestURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKETestURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZTestURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWTestURL();break;
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
					case("HINOID"): url = config.getHINOIDProdURL();break;
					case("MANKE"): url = config.getMANKEProdURL();break;
					case("OWSAUTOME"): url = config.getOWSAUTOMEProdURL();break;
					case("NORWOODNZ"): url = config.getNORWOODNZProdURL();break;
					case("ARVALPL"): url = config.getARVALPLProdURL();break;
					case("PANUSTH"): url = config.getPANUSTHProdURL();break;
					case("HINOZA"): url = config.getHINOZAProdURL();break;
					case("MANZA"): url = config.getMANZAProdURL();break;
					case("TELTRACKZW"): url = config.getTELTRACKZWProdURL();break;
					case("TOYOTAKE"): url = config.getTOYOTAKEProdURL();break;
					case("TOYOTATZ"): url = config.getTOYOTATZProdURL();break;
					case("TOYOTAMW"): url = config.getTOYOTAMWProdURL();break;
					}
					break;	
				default:break;
				}
			}		
			
		}
		Constant.driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
		Constant.driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
		Constant.driver.get(url);
		Constant.driver.manage().window().maximize();
		Reporter.ReportEventNoImage("Launch Website - " + url);	
		DoThis.InitElements();
		
		if(Admin==false) {
			//Force set Language to English
			//Change Language to English if not English
			switch(activesite) {
			case("FR"): 
				try {
					DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
					DoThis.click(LoginPage.cmbbxLanguage, "Y");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
				try {
					DoThis.click(LanguageElement, "Y");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			default:break;
			}
		}
		//Change Language to English if not English
		switch(activesite) {
		case("PT"): 
		case("PL"): 
		case("MZ"): 		

			try {
				DoThis.WaitForElementToLoad(LoginPage.cmbbxLanguage);
				DoThis.click(LoginPage.cmbbxLanguage, "Y");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LanguageElement = Constant.driver.findElement(By.xpath("//div[@role='listbox']/div[contains(.,'"+language+"')]"));
			try {
				DoThis.click(LanguageElement, "Y");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
		default:break;
		}
	
	}
	
}
