package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties pro;

	public ConfigReader()
	{
		try {
			File source = new File ("./configproperties");

			FileInputStream input = new FileInputStream(source);

			pro = new Properties();

			pro.load(input);

		} catch (Exception exp) {

			System.out.println("Exception is: ---"+exp.getMessage());
		} 
	}
	
	public String getBrowser()
	{
		return pro.getProperty("activebrowser");

	}
	
	public String getPlatform()
	{
		return pro.getProperty("activeplatform");
	}
	
	public String getEnvironmentToUse()
	{
		return pro.getProperty("activeenvironment");
	}
	
	public String getTestBed()
	{
		if(Constant.testBed.contains("local")) {
			return "local";
		}else {
			return pro.getProperty("activetestbed");
		}
	}
	
	public String getGrid_IP_Port()
	{
		return pro.getProperty("grid_ip_port");
	}
	

	public String getAppStorePageTitle()
	{
		return pro.getProperty("AppStorePageTitle");
	}
	
	public String getGooglePlayPageTitle()
	{
		return pro.getProperty("GooglePlayPageTitle");
	}
		
	public String getEmailAddNotAssoc()
	{
		return pro.getProperty("EmailAddNotAssoc");
	}
	
	public String getLanguage()
	{
		return pro.getProperty("Language");
	}
	
	//<-- SG Country Get Properties
	
	public String getSGDevURL()
	{
		String path = pro.getProperty("SGDev");

		return path;
	}
	
	public String getSGTestURL()
	{
		String path = pro.getProperty("SGTest");

		return path;
	}
	
	public String getSGProdURL()
	{
		String path = pro.getProperty("SGProd");

		return path;
	}
	
	public String getSGUserName()
	{
		return pro.getProperty("SGUsername");
	}
	
	public String getSGPassword()
	{
		return pro.getProperty("SGPassword");
	}
	
	public String getSGSubUserName()
	{
		return pro.getProperty("SGSubUsername");
	}
	
	public String getSGSubPassword()
	{
		return pro.getProperty("SGSubPassword");
	}
	
	public String getSGInvalidUserName()
	{
		return pro.getProperty("SGInvalidUsername");
	}
	
	public String getSGInvalidPassword()
	{
		return pro.getProperty("SGInvalidPassword");
	}
	
	public String getSGVehicle()
	{
		return pro.getProperty("SGVehicle");
	}
	
	public String getSGVehicleRegistration()
	{
		return pro.getProperty("SGVehicleRegistration");
	}

	public String getSGVehicleNoTrip()
	{
		return pro.getProperty("SGVehicleNoTrip");
	}
	
	public String getSGPlaceSearch()
	{
		return pro.getProperty("SGPlaceSearch");
	}
	
	public String getSGLocationSearch()
	{
		return pro.getProperty("SGLocationSearch");
	}
	
	public String getSGPOI()
	{
		return pro.getProperty("SGPOI");
	}
	
	public String getSGGeofences()
	{
		return pro.getProperty("SGGeofences");
	}
	
	public String getSGGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("SGGPSFormatDegreesMinutesSeconds");
	}
	
	public String getSGGPSFormatDecimalDegrees()
	{
		return pro.getProperty("SGGPSFormatDecimalDegrees");
	}
	
	public String getSGEmailAdd()
	{
		return pro.getProperty("SGEmailAdd");
	}
	
	public String getSGSubUserEmailAdd()
	{
		return pro.getProperty("SGSubUserEmailAdd");
	}

	public String getSGEmailAddAssoc()
	{
		return pro.getProperty("SGEmailAddAssoc");
	}
	
	public String getSGSMS()
	{
		return pro.getProperty("SGSMS");
	}
	
	public String getSGValidSMS()
	{
		return pro.getProperty("SGValidSMS");
	}
	
	public String getSGSMSAssoc()
	{
		return pro.getProperty("SGSMSAssoc");
	}
	
	public String getSGSMSNotAssoc()
	{
		return pro.getProperty("SGSMSNotAssoc");
	}
	
	public String getSGSubUserSMS()
	{
		return pro.getProperty("SGSubUserSMS");
	}
	
	public String getSGPOIUserViewEditSubUserName()
	{
		return pro.getProperty("SGPOIUserViewEditSubUsername");
	}
			
	public String getSGPOIUserViewEditSubPassword()
	{
		return pro.getProperty("SGPOIUserViewEditSubPassword");
	}

	public String getSGPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("SGPOIUserViewOnlySubUsername");
	}
	
	public String getSGPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("SGPOIUserViewOnlySubPassword");
	}

	public String getSGPOIUserCantViewSubUserName()
	{
		return pro.getProperty("SGPOIUserCantViewSubUsername");
	}
	
	public String getSGPOIUserCantViewSubPassword()
	{
		return pro.getProperty("SGPOIUserCantViewSubPassword");
	}
	
	public String getSGReportName()
	{
		return pro.getProperty("SGReportName");
	}
	
	public String getSGDriverIDTag()
	{
		return pro.getProperty("SGDriverIDTag");
	}
	
	public String getSGSensorTypeOne()
	{
		return pro.getProperty("SGSensorTypeOne");
	}
	
		public String getSGSensorTypeTwo()
	{
		return pro.getProperty("SGSensorTypeTwo");
	}
		
	//SG Country Get Properties -->
	
	//<-- TH Country Get Properties
	
	public String getTHDevURL()
	{
		String path = pro.getProperty("THDev");

		return path;
	}
	
	public String getTHTestURL()
	{
		String path = pro.getProperty("THTest");

		return path;
	}
	
	public String getTHProdURL()
	{
		String path = pro.getProperty("THProd");

		return path;
	}
	
	public String getTHUserName()
	{
		return pro.getProperty("THUsername");
	}
	
	public String getTHPassword()
	{
		return pro.getProperty("THPassword");
	}
	
	public String getTHSubUserName()
	{
		return pro.getProperty("THSubUsername");
	}
	
	public String getTHSubPassword()
	{
		return pro.getProperty("THSubPassword");
	}
	
	public String getTHInvalidUserName()
	{
		return pro.getProperty("THInvalidUsername");
	}
	
	public String getTHInvalidPassword()
	{
		return pro.getProperty("THInvalidPassword");
	}
	
	public String getTHVehicle()
	{
		return pro.getProperty("THVehicle");
	}
	
	public String getTHVehicleRegistration()
	{
		return pro.getProperty("THVehicleRegistration");
	}

	public String getTHVehicleNoTrip()
	{
		return pro.getProperty("THVehicleNoTrip");
	}
	
	public String getTHPlaceSearch()
	{
		return pro.getProperty("THPlaceSearch");
	}
	
	public String getTHLocationSearch()
	{
		return pro.getProperty("THLocationSearch");
	}
	
	public String getTHPOI()
	{
		return pro.getProperty("THPOI");
	}
	
	public String getTHGeofences()
	{
		return pro.getProperty("THGeofences");
	}
	
	public String getTHGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("THGPSFormatDegreesMinutesSeconds");
	}
	
	public String getTHGPSFormatDecimalDegrees()
	{
		return pro.getProperty("THGPSFormatDecimalDegrees");
	}
	
	public String getTHEmailAdd()
	{
		return pro.getProperty("THEmailAdd");
	}
	
	public String getTHSubUserEmailAdd()
	{
		return pro.getProperty("THSubUserEmailAdd");
	}

	public String getTHEmailAddAssoc()
	{
		return pro.getProperty("THEmailAddAssoc");
	}
	
	public String getTHSMS()
	{
		return pro.getProperty("THSMS");
	}
	
	public String getTHValidSMS()
	{
		return pro.getProperty("THValidSMS");
	}
	
	public String getTHSMSAssoc()
	{
		return pro.getProperty("THSMSAssoc");
	}
	
	public String getTHSMSNotAssoc()
	{
		return pro.getProperty("THSMSNotAssoc");
	}
	
	public String getTHSubUserSMS()
	{
		return pro.getProperty("THSubUserSMS");
	}
	
	public String getTHPOIUserViewEditSubUserName()
	{
		return pro.getProperty("THPOIUserViewEditSubUsername");
	}
			
	public String getTHPOIUserViewEditSubPassword()
	{
		return pro.getProperty("THPOIUserViewEditSubPassword");
	}

	public String getTHPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("THPOIUserViewOnlySubUsername");
	}
	
	public String getTHPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("THPOIUserViewOnlySubPassword");
	}

	public String getTHPOIUserCantViewSubUserName()
	{
		return pro.getProperty("THPOIUserCantViewSubUsername");
	}
	
	public String getTHPOIUserCantViewSubPassword()
	{
		return pro.getProperty("THPOIUserCantViewSubPassword");
	}

	public String getTHReportName()
	{
		return pro.getProperty("THReportName");
	}
	
	public String getTHDriverIDTag()
	{
		return pro.getProperty("THDriverIDTag");
	}
	
	public String getTHSensorTypeOne()
	{
		return pro.getProperty("THSensorTypeOne");
	}
	
		public String getTHSensorTypeTwo()
	{
		return pro.getProperty("THSensorTypeTwo");
	}
		
	//TH Country Get Properties -->
	
	//<-- ZA Country Get Properties
	public String getZADevURL()
	{
		String path = pro.getProperty("ZADev");

		return path;
	}
	
	public String getZATestURL()
	{
		String path = pro.getProperty("ZATest");

		return path;
	}
	
	public String getZAProdURL()
	{
		String path = pro.getProperty("ZAProd");

		return path;
	}
	
	public String getZAUserName()
	{
		return pro.getProperty("ZAUsername");
	}
	
	public String getZAPassword()
	{
		return pro.getProperty("ZAPassword");
	}
	
	public String getZASubUserName()
	{
		return pro.getProperty("ZASubUsername");
	}
	
	public String getZASubPassword()
	{
		return pro.getProperty("ZASubPassword");
	}
	
	public String getZAInvalidUserName()
	{
		return pro.getProperty("ZAInvalidUsername");
	}
	
	public String getZAInvalidPassword()
	{
		return pro.getProperty("ZAInvalidPassword");
	}
	
	public String getZAVehicle()
	{
		return pro.getProperty("ZAVehicle");
	}
	
	public String getZAVehicleRegistration()
	{
		return pro.getProperty("ZAVehicleRegistration");
	}

	public String getZAVehicleNoTrip()
	{
		return pro.getProperty("ZAVehicleNoTrip");
	}
	
	public String getZAPlaceSearch()
	{
		return pro.getProperty("ZAPlaceSearch");
	}
	
	public String getZALocationSearch()
	{
		return pro.getProperty("ZALocationSearch");
	}
	
	public String getZAPOI()
	{
		return pro.getProperty("ZAPOI");
	}
	
	public String getZAGeofences()
	{
		return pro.getProperty("ZAGeofences");
	}
	
	public String getZAGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("ZAGPSFormatDegreesMinutesSeconds");
	}
	
	public String getZAGPSFormatDecimalDegrees()
	{
		return pro.getProperty("ZAGPSFormatDecimalDegrees");
	}
	
	public String getZAEmailAdd()
	{
		return pro.getProperty("ZAEmailAdd");
	}
	
	public String getZASubUserEmailAdd()
	{
		return pro.getProperty("ZASubUserEmailAdd");
	}

	public String getZAEmailAddAssoc()
	{
		return pro.getProperty("ZAEmailAddAssoc");
	}
	
	public String getZASMS()
	{
		return pro.getProperty("ZASMS");
	}
	
	public String getZAValidSMS()
	{
		return pro.getProperty("ZAValidSMS");
	}
	
	public String getZASMSAssoc()
	{
		return pro.getProperty("ZASMSAssoc");
	}
	
	public String getZASMSNotAssoc()
	{
		return pro.getProperty("ZASMSNotAssoc");
	}
	
	public String getZASubUserSMS()
	{
		return pro.getProperty("ZASubUserSMS");
	}
	
	public String getZAPOIUserViewEditSubUserName()
	{
		return pro.getProperty("ZAPOIUserViewEditSubUsername");
	}
			
	public String getZAPOIUserViewEditSubPassword()
	{
		return pro.getProperty("ZAPOIUserViewEditSubPassword");
	}

	public String getZAPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("ZAPOIUserViewOnlySubUsername");
	}
	
	public String getZAPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("ZAPOIUserViewOnlySubPassword");
	}

	public String getZAPOIUserCantViewSubUserName()
	{
		return pro.getProperty("ZAPOIUserCantViewSubUsername");
	}
	
	public String getZAPOIUserCantViewSubPassword()
	{
		return pro.getProperty("ZAPOIUserCantViewSubPassword");
	}
	
	public String getZAReportName()
	{
		return pro.getProperty("ZAReportName");
	}
	
	public String getZADriverIDTag()
	{
		return pro.getProperty("ZADriverIDTag");
	}
	
	public String getZASensorTypeOne()
	{
		return pro.getProperty("ZASensorTypeOne");
	}
	
		public String getZASensorTypeTwo()
	{
		return pro.getProperty("ZASensorTypeTwo");
	}
		
	//ZA Country Get Properties -->
	
	//<-- PT Country Get Properties

	public String getPTDevURL()
	{
		String path = pro.getProperty("PTDev");

		return path;
	}
	
	public String getPTTestURL()
	{
		String path = pro.getProperty("PTTest");

		return path;
	}
	
	public String getPTProdURL()
	{
		String path = pro.getProperty("PTProd");

		return path;
	}	
	
	public String getPTUserName()
	{
		return pro.getProperty("PTUsername");
	}
	
	public String getPTPassword()
	{
		return pro.getProperty("PTPassword");
	}
	
	public String getPTSubUserName()
	{
		return pro.getProperty("PTSubUsername");
	}
	
	public String getPTSubPassword()
	{
		return pro.getProperty("PTSubPassword");
	}
	
	public String getPTInvalidUserName()
	{
		return pro.getProperty("PTInvalidUsername");
	}
	
	public String getPTInvalidPassword()
	{
		return pro.getProperty("PTInvalidPassword");
	}
	
	public String getPTVehicle()
	{
		return pro.getProperty("PTVehicle");
	}
	
	public String getPTVehicleRegistration()
	{
		return pro.getProperty("PTVehicleRegistration");
	}

	public String getPTVehicleNoTrip()
	{
		return pro.getProperty("PTVehicleNoTrip");
	}
	
	public String getPTPlaceSearch()
	{
		return pro.getProperty("PTPlaceSearch");
	}
	
	public String getPTLocationSearch()
	{
		return pro.getProperty("PTLocationSearch");
	}
	
	public String getPTPOI()
	{
		return pro.getProperty("PTPOI");
	}
	
	public String getPTGeofences()
	{
		return pro.getProperty("PTGeofences");
	}
	
	public String getPTGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("PTGPSFormatDegreesMinutesSeconds");
	}
	
	public String getPTGPSFormatDecimalDegrees()
	{
		return pro.getProperty("PTGPSFormatDecimalDegrees");
	}
	
	public String getPTEmailAdd()
	{
		return pro.getProperty("PTEmailAdd");
	}
	
	public String getPTSubUserEmailAdd()
	{
		return pro.getProperty("PTSubUserEmailAdd");
	}

	public String getPTEmailAddAssoc()
	{
		return pro.getProperty("PTEmailAddAssoc");
	}
	
	public String getPTSMS()
	{
		return pro.getProperty("PTSMS");
	}
	
	public String getPTValidSMS()
	{
		return pro.getProperty("PTValidSMS");
	}
	
	public String getPTSMSAssoc()
	{
		return pro.getProperty("PTSMSAssoc");
	}
	
	public String getPTSMSNotAssoc()
	{
		return pro.getProperty("PTSMSNotAssoc");
	}

	public String getPTSubUserSMS()
	{
		return pro.getProperty("PTSubUserSMS");
	}
	
	public String getPTPOIUserViewEditSubUserName()
	{
		return pro.getProperty("PTPOIUserViewEditSubUsername");
	}
			
	public String getPTPOIUserViewEditSubPassword()
	{
		return pro.getProperty("PTPOIUserViewEditSubPassword");
	}

	public String getPTPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("PTPOIUserViewOnlySubUsername");
	}
	
	public String getPTPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("PTPOIUserViewOnlySubPassword");
	}

	public String getPTPOIUserCantViewSubUserName()
	{
		return pro.getProperty("PTPOIUserCantViewSubUsername");
	}
	
	public String getPTPOIUserCantViewSubPassword()
	{
		return pro.getProperty("PTPOIUserCantViewSubPassword");
	}
	
	public String getPTReportName()
	{
		return pro.getProperty("PTReportName");
	}
	
	public String getPTDriverIDTag()
	{
		return pro.getProperty("PTDriverIDTag");
	}
	
	public String getPTSensorTypeOne()
	{
		return pro.getProperty("PTSensorTypeOne");
	}
	
		public String getPTSensorTypeTwo()
	{
		return pro.getProperty("PTSensorTypeTwo");
	}
		
	//PT Country Get Properties -->
	
	//<-- ID Country Get Properties

	public String getIDDevURL()
	{
		String path = pro.getProperty("IDDev");

		return path;
	}
	
	public String getIDTestURL()
	{
		String path = pro.getProperty("IDTest");

		return path;
	}
	
	public String getIDProdURL()
	{
		String path = pro.getProperty("IDProd");

		return path;
	}	
	
	public String getIDUserName()
	{
		return pro.getProperty("IDUsername");
	}
	
	public String getIDPassword()
	{
		return pro.getProperty("IDPassword");
	}
	
	public String getIDSubUserName()
	{
		return pro.getProperty("IDSubUsername");
	}
	
	public String getIDSubPassword()
	{
		return pro.getProperty("IDSubPassword");
	}
	
	public String getIDInvalidUserName()
	{
		return pro.getProperty("IDInvalidUsername");
	}
	
	public String getIDInvalidPassword()
	{
		return pro.getProperty("IDInvalidPassword");
	}
	
	public String getIDVehicle()
	{
		return pro.getProperty("IDVehicle");
	}
	
	public String getIDVehicleRegistration()
	{
		return pro.getProperty("IDVehicleRegistration");
	}

	public String getIDVehicleNoTrip()
	{
		return pro.getProperty("IDVehicleNoTrip");
	}
	
	public String getIDPlaceSearch()
	{
		return pro.getProperty("IDPlaceSearch");
	}
	
	public String getIDLocationSearch()
	{
		return pro.getProperty("IDLocationSearch");
	}
	
	public String getIDPOI()
	{
		return pro.getProperty("IDPOI");
	}
	
	public String getIDGeofences()
	{
		return pro.getProperty("IDGeofences");
	}
	
	public String getIDGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("IDGPSFormatDegreesMinutesSeconds");
	}
	
	public String getIDGPSFormatDecimalDegrees()
	{
		return pro.getProperty("IDGPSFormatDecimalDegrees");
	}
	
	public String getIDEmailAdd()
	{
		return pro.getProperty("IDEmailAdd");
	}
	
	public String getIDSubUserEmailAdd()
	{
		return pro.getProperty("IDSubUserEmailAdd");
	}

	public String getIDEmailAddAssoc()
	{
		return pro.getProperty("IDEmailAddAssoc");
	}
	
	public String getIDSMS()
	{
		return pro.getProperty("IDSMS");
	}
	
	public String getIDValidSMS()
	{
		return pro.getProperty("IDValidSMS");
	}
	
	public String getIDSMSAssoc()
	{
		return pro.getProperty("IDSMSAssoc");
	}
	
	public String getIDSMSNotAssoc()
	{
		return pro.getProperty("IDSMSNotAssoc");
	}

	public String getIDSubUserSMS()
	{
		return pro.getProperty("IDSubUserSMS");
	}
	
	public String getIDPOIUserViewEditSubUserName()
	{
		return pro.getProperty("IDPOIUserViewEditSubUsername");
	}
			
	public String getIDPOIUserViewEditSubPassword()
	{
		return pro.getProperty("IDPOIUserViewEditSubPassword");
	}

	public String getIDPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("IDPOIUserViewOnlySubUsername");
	}
	
	public String getIDPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("IDPOIUserViewOnlySubPassword");
	}

	public String getIDPOIUserCantViewSubUserName()
	{
		return pro.getProperty("IDPOIUserCantViewSubUsername");
	}
	
	public String getIDPOIUserCantViewSubPassword()
	{
		return pro.getProperty("IDPOIUserCantViewSubPassword");
	}
	
	public String getIDReportName()
	{
		return pro.getProperty("IDReportName");
	}
	
	public String getIDDriverIDTag()
	{
		return pro.getProperty("IDDriverIDTag");
	}
	
	public String getIDToken()
	{
		return pro.getProperty("IDToken");
	}
	
	public String getIDSensorTypeOne()
	{
		return pro.getProperty("IDSensorTypeOne");
	}
	
		public String getIDSensorTypeTwo()
	{
		return pro.getProperty("IDSensorTypeTwo");
	}
	
	//ID Country Get Properties -->

	//<-- PL Country Get Properties

	public String getPLDevURL()
	{
		String path = pro.getProperty("PLDev");

		return path;
	}
	
	public String getPLTestURL()
	{
		String path = pro.getProperty("PLTest");

		return path;
	}
	
	public String getPLProdURL()
	{
		String path = pro.getProperty("PLProd");

		return path;
	}	
	
	public String getPLUserName()
	{
		return pro.getProperty("PLUsername");
	}
	
	public String getPLPassword()
	{
		return pro.getProperty("PLPassword");
	}
	
	public String getPLSubUserName()
	{
		return pro.getProperty("PLSubUsername");
	}
	
	public String getPLSubPassword()
	{
		return pro.getProperty("PLSubPassword");
	}
	
	public String getPLInvalidUserName()
	{
		return pro.getProperty("PLInvalidUsername");
	}
	
	public String getPLInvalidPassword()
	{
		return pro.getProperty("PLInvalidPassword");
	}
	
	public String getPLVehicle()
	{
		return pro.getProperty("PLVehicle");
	}
	
	public String getPLVehicleRegistration()
	{
		return pro.getProperty("PLVehicleRegistration");
	}

	public String getPLVehicleNoTrip()
	{
		return pro.getProperty("PLVehicleNoTrip");
	}
	
	public String getPLPlaceSearch()
	{
		return pro.getProperty("PLPlaceSearch");
	}
	
	public String getPLLocationSearch()
	{
		return pro.getProperty("PLLocationSearch");
	}
	
	public String getPLPOI()
	{
		return pro.getProperty("PLPOI");
	}
	
	public String getPLGeofences()
	{
		return pro.getProperty("PLGeofences");
	}
	
	public String getPLGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("PLGPSFormatDegreesMinutesSeconds");
	}
	
	public String getPLGPSFormatDecimalDegrees()
	{
		return pro.getProperty("PLGPSFormatDecimalDegrees");
	}
	
	public String getPLEmailAdd()
	{
		return pro.getProperty("PLEmailAdd");
	}
	
	public String getPLSubUserEmailAdd()
	{
		return pro.getProperty("PLSubUserEmailAdd");
	}

	public String getPLEmailAddAssoc()
	{
		return pro.getProperty("PLEmailAddAssoc");
	}
	
	public String getPLSMS()
	{
		return pro.getProperty("PLSMS");
	}
	
	public String getPLValidSMS()
	{
		return pro.getProperty("PLValidSMS");
	}
	
	public String getPLSMSAssoc()
	{
		return pro.getProperty("PLSMSAssoc");
	}
	
	public String getPLSMSNotAssoc()
	{
		return pro.getProperty("PLSMSNotAssoc");
	}

	public String getPLSubUserSMS()
	{
		return pro.getProperty("PLSubUserSMS");
	}
	
	public String getPLPOIUserViewEditSubUserName()
	{
		return pro.getProperty("PLPOIUserViewEditSubUsername");
	}
			
	public String getPLPOIUserViewEditSubPassword()
	{
		return pro.getProperty("PLPOIUserViewEditSubPassword");
	}

	public String getPLPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("PLPOIUserViewOnlySubUsername");
	}
	
	public String getPLPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("PLPOIUserViewOnlySubPassword");
	}

	public String getPLPOIUserCantViewSubUserName()
	{
		return pro.getProperty("PLPOIUserCantViewSubUsername");
	}
	
	public String getPLPOIUserCantViewSubPassword()
	{
		return pro.getProperty("PLPOIUserCantViewSubPassword");
	}
	
	public String getPLReportName()
	{
		return pro.getProperty("PLReportName");
	}
	
	public String getPLDriverIDTag()
	{
		return pro.getProperty("PLDriverIDTag");
	}
	
	public String getPLSensorTypeOne()
	{
		return pro.getProperty("PLSensorTypeOne");
	}
	
		public String getPLSensorTypeTwo()
	{
		return pro.getProperty("PLSensorTypeTwo");
	}
	
	//PL Country Get Properties -->

	//<-- HK Country Get Properties

	public String getHKDevURL()
	{
		String path = pro.getProperty("HKDev");

		return path;
	}
	
	public String getHKTestURL()
	{
		String path = pro.getProperty("HKTest");

		return path;
	}
	
	public String getHKProdURL()
	{
		String path = pro.getProperty("HKProd");

		return path;
	}	
	
	public String getHKUserName()
	{
		return pro.getProperty("HKUsername");
	}
	
	public String getHKPassword()
	{
		return pro.getProperty("HKPassword");
	}
	
	public String getHKSubUserName()
	{
		return pro.getProperty("HKSubUsername");
	}
	
	public String getHKSubPassword()
	{
		return pro.getProperty("HKSubPassword");
	}
	
	public String getHKInvalidUserName()
	{
		return pro.getProperty("HKInvalidUsername");
	}
	
	public String getHKInvalidPassword()
	{
		return pro.getProperty("HKInvalidPassword");
	}
	
	public String getHKVehicle()
	{
		return pro.getProperty("HKVehicle");
	}
	
	public String getHKVehicleRegistration()
	{
		return pro.getProperty("HKVehicleRegistration");
	}

	public String getHKVehicleNoTrip()
	{
		return pro.getProperty("HKVehicleNoTrip");
	}
	
	public String getHKPlaceSearch()
	{
		return pro.getProperty("HKPlaceSearch");
	}
	
	public String getHKLocationSearch()
	{
		return pro.getProperty("HKLocationSearch");
	}
	
	public String getHKPOI()
	{
		return pro.getProperty("HKPOI");
	}
	
	public String getHKGeofences()
	{
		return pro.getProperty("HKGeofences");
	}
	
	public String getHKGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("HKGPSFormatDegreesMinutesSeconds");
	}
	
	public String getHKGPSFormatDecimalDegrees()
	{
		return pro.getProperty("HKGPSFormatDecimalDegrees");
	}
	
	public String getHKEmailAdd()
	{
		return pro.getProperty("HKEmailAdd");
	}
	
	public String getHKSubUserEmailAdd()
	{
		return pro.getProperty("HKSubUserEmailAdd");
	}

	public String getHKEmailAddAssoc()
	{
		return pro.getProperty("HKEmailAddAssoc");
	}
	
	public String getHKSMS()
	{
		return pro.getProperty("HKSMS");
	}
	
	public String getHKValidSMS()
	{
		return pro.getProperty("HKValidSMS");
	}
	
	public String getHKSMSAssoc()
	{
		return pro.getProperty("HKSMSAssoc");
	}
	
	public String getHKSMSNotAssoc()
	{
		return pro.getProperty("HKSMSNotAssoc");
	}

	public String getHKSubUserSMS()
	{
		return pro.getProperty("HKSubUserSMS");
	}
	
	public String getHKPOIUserViewEditSubUserName()
	{
		return pro.getProperty("HKPOIUserViewEditSubUsername");
	}
			
	public String getHKPOIUserViewEditSubPassword()
	{
		return pro.getProperty("HKPOIUserViewEditSubPassword");
	}

	public String getHKPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("HKPOIUserViewOnlySubUsername");
	}
	
	public String getHKPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("HKPOIUserViewOnlySubPassword");
	}

	public String getHKPOIUserCantViewSubUserName()
	{
		return pro.getProperty("HKPOIUserCantViewSubUsername");
	}
	
	public String getHKPOIUserCantViewSubPassword()
	{
		return pro.getProperty("HKPOIUserCantViewSubPassword");
	}
	
	public String getHKReportName()
	{
		return pro.getProperty("HKReportName");
	}
	
	public String getHKDriverIDTag()
	{
		return pro.getProperty("HKDriverIDTag");
	}
	
	public String getHKSensorTypeOne()
	{
		return pro.getProperty("HKSensorTypeOne");
	}
	
		public String getHKSensorTypeTwo()
	{
		return pro.getProperty("HKSensorTypeTwo");
	}
		
	//HK Country Get Properties -->
	
	//<-- US Country Get Properties
	
	public String getUSDevURL()
	{
		String path = pro.getProperty("USDev");

		return path;
	}
	
	public String getUSTestURL()
	{
		String path = pro.getProperty("USTest");

		return path;
	}
	
	public String getUSProdURL()
	{
		String path = pro.getProperty("USProd");

		return path;
	}	
	
	public String getUSUserName()
	{
		return pro.getProperty("USUsername");
	}
	
	public String getUSPassword()
	{
		return pro.getProperty("USPassword");
	}
	
	public String getUSSubUserName()
	{
		return pro.getProperty("USSubUsername");
	}
	
	public String getUSSubPassword()
	{
		return pro.getProperty("USSubPassword");
	}
	
	public String getUSInvalidUserName()
	{
		return pro.getProperty("USInvalidUsername");
	}
	
	public String getUSInvalidPassword()
	{
		return pro.getProperty("USInvalidPassword");
	}
	
	public String getUSVehicle()
	{
		return pro.getProperty("USVehicle");
	}
	
	public String getUSVehicleRegistration()
	{
		return pro.getProperty("USVehicleRegistration");
	}

	public String getUSVehicleNoTrip()
	{
		return pro.getProperty("USVehicleNoTrip");
	}
	
	public String getUSPlaceSearch()
	{
		return pro.getProperty("USPlaceSearch");
	}
	
	public String getUSLocationSearch()
	{
		return pro.getProperty("USLocationSearch");
	}
	
	public String getUSPOI()
	{
		return pro.getProperty("USPOI");
	}
	
	public String getUSGeofences()
	{
		return pro.getProperty("USGeofences");
	}
	
	public String getUSGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("USGPSFormatDegreesMinutesSeconds");
	}
	
	public String getUSGPSFormatDecimalDegrees()
	{
		return pro.getProperty("USGPSFormatDecimalDegrees");
	}
	
	public String getUSEmailAdd()
	{
		return pro.getProperty("USEmailAdd");
	}
	
	public String getUSSubUserEmailAdd()
	{
		return pro.getProperty("USSubUserEmailAdd");
	}

	public String getUSEmailAddAssoc()
	{
		return pro.getProperty("USEmailAddAssoc");
	}
	
	public String getUSSMS()
	{
		return pro.getProperty("USSMS");
	}
	
	public String getUSValidSMS()
	{
		return pro.getProperty("USValidSMS");
	}
	
	public String getUSSMSAssoc()
	{
		return pro.getProperty("USSMSAssoc");
	}
	
	public String getUSSMSNotAssoc()
	{
		return pro.getProperty("USSMSNotAssoc");
	}

	public String getUSSubUserSMS()
	{
		return pro.getProperty("USSubUserSMS");
	}
	
	public String getUSPOIUserViewEditSubUserName()
	{
		return pro.getProperty("USPOIUserViewEditSubUsername");
	}
			
	public String getUSPOIUserViewEditSubPassword()
	{
		return pro.getProperty("USPOIUserViewEditSubPassword");
	}

	public String getUSPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("USPOIUserViewOnlySubUsername");
	}
	
	public String getUSPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("USPOIUserViewOnlySubPassword");
	}

	public String getUSPOIUserCantViewSubUserName()
	{
		return pro.getProperty("USPOIUserCantViewSubUsername");
	}
	
	public String getUSPOIUserCantViewSubPassword()
	{
		return pro.getProperty("USPOIUserCantViewSubPassword");
	}
	
	public String getUSReportName()
	{
		return pro.getProperty("USReportName");
	}
	
	public String getUSDriverIDTag()
	{
		return pro.getProperty("USDriverIDTag");
	}
	
	public String getUSSensorTypeOne()
	{
		return pro.getProperty("USSensorTypeOne");
	}
	
		public String getUSSensorTypeTwo()
	{
		return pro.getProperty("USSensorTypeTwo");
	}
	
	public String getUSLicenseNumber()
	{
		return pro.getProperty("USLicenseNumber");
	}
	
	//US Country Get Properties -->
	
	//<-- ME Country Get Properties
	
	public String getMEDevURL()
	{
		String path = pro.getProperty("MEDev");

		return path;
	}
	
	public String getMETestURL()
	{
		String path = pro.getProperty("METest");

		return path;
	}
	
	public String getMEProdURL()
	{
		String path = pro.getProperty("MEProd");

		return path;
	}
	
	public String getMEUserName()
	{
		return pro.getProperty("MEUsername");
	}
	
	public String getMEPassword()
	{
		return pro.getProperty("MEPassword");
	}
	
	public String getMESubUserName()
	{
		return pro.getProperty("MESubUsername");
	}
	
	public String getMESubPassword()
	{
		return pro.getProperty("MESubPassword");
	}
	
	public String getMEInvalidUserName()
	{
		return pro.getProperty("MEInvalidUsername");
	}
	
	public String getMEInvalidPassword()
	{
		return pro.getProperty("MEInvalidPassword");
	}
	
	public String getMEVehicle()
	{
		return pro.getProperty("MEVehicle");
	}
	
	public String getMEVehicleRegistration()
	{
		return pro.getProperty("MEVehicleRegistration");
	}

	public String getMEVehicleNoTrip()
	{
		return pro.getProperty("MEVehicleNoTrip");
	}
	
	public String getMEPlaceSearch()
	{
		return pro.getProperty("MEPlaceSearch");
	}
	
	public String getMELocationSearch()
	{
		return pro.getProperty("MELocationSearch");
	}
	
	public String getMEPOI()
	{
		return pro.getProperty("MEPOI");
	}
	
	public String getMEGeofences()
	{
		return pro.getProperty("MEGeofences");
	}
	
	public String getMEGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("MEGPSFormatDegreesMinutesSeconds");
	}
	
	public String getMEGPSFormatDecimalDegrees()
	{
		return pro.getProperty("MEGPSFormatDecimalDegrees");
	}
	
	public String getMEEmailAdd()
	{
		return pro.getProperty("MEEmailAdd");
	}
	
	public String getMESubUserEmailAdd()
	{
		return pro.getProperty("MESubUserEmailAdd");
	}

	public String getMEEmailAddAssoc()
	{
		return pro.getProperty("MEEmailAddAssoc");
	}
	
	public String getMESMS()
	{
		return pro.getProperty("MESMS");
	}
	
	public String getMEValidSMS()
	{
		return pro.getProperty("MEValidSMS");
	}
	
	public String getMESMSAssoc()
	{
		return pro.getProperty("MESMSAssoc");
	}
	
	public String getMESMSNotAssoc()
	{
		return pro.getProperty("MESMSNotAssoc");
	}
	
	public String getMESubUserSMS()
	{
		return pro.getProperty("MESubUserSMS");
	}
	
	public String getMEPOIUserViewEditSubUserName()
	{
		return pro.getProperty("MEPOIUserViewEditSubUsername");
	}
			
	public String getMEPOIUserViewEditSubPassword()
	{
		return pro.getProperty("MEPOIUserViewEditSubPassword");
	}

	public String getMEPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("MEPOIUserViewOnlySubUsername");
	}
	
	public String getMEPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("MEPOIUserViewOnlySubPassword");
	}

	public String getMEPOIUserCantViewSubUserName()
	{
		return pro.getProperty("MEPOIUserCantViewSubUsername");
	}
	
	public String getMEPOIUserCantViewSubPassword()
	{
		return pro.getProperty("MEPOIUserCantViewSubPassword");
	}
	
	public String getMEReportName()
	{
		return pro.getProperty("MEReportName");
	}
	
	public String getMEDriverIDTag()
	{
		return pro.getProperty("MEDriverIDTag");
	}
	
	public String getMESensorTypeOne()
	{
		return pro.getProperty("MESensorTypeOne");
	}
	
		public String getMESensorTypeTwo()
	{
		return pro.getProperty("MESensorTypeTwo");
	}
		
	//ME Country Get Properties -->

	//<-- MW Country Get Properties
	
	public String getMWDevURL()
	{
			String path = pro.getProperty("MWDev");

			return path;
		}
		
	public String getMWTestURL()
		{
			String path = pro.getProperty("MWTest");

			return path;
		}
		
	public String getMWProdURL()
		{
			String path = pro.getProperty("MWProd");

			return path;
		}
		
	public String getMWUserName()
		{
			return pro.getProperty("MWUsername");
		}
		
	public String getMWPassword()
		{
			return pro.getProperty("MWPassword");
		}
		
	public String getMWSubUserName()
		{
			return pro.getProperty("MWSubUsername");
		}
		
	public String getMWSubPassword()
		{
			return pro.getProperty("MWSubPassword");
		}
		
	public String getMWInvalidUserName()
		{
			return pro.getProperty("MWInvalidUsername");
		}
		
	public String getMWInvalidPassword()
		{
			return pro.getProperty("MWInvalidPassword");
		}
		
	public String getMWVehicle()
		{
			return pro.getProperty("MWVehicle");
		}
		
	public String getMWVehicleRegistration()
		{
			return pro.getProperty("MWVehicleRegistration");
		}

	public String getMWVehicleNoTrip()
		{
			return pro.getProperty("MWVehicleNoTrip");
		}
		
	public String getMWPlaceSearch()
		{
			return pro.getProperty("MWPlaceSearch");
		}
		
	public String getMWLocationSearch()
		{
			return pro.getProperty("MWLocationSearch");
		}
		
	public String getMWPOI()
		{
			return pro.getProperty("MWPOI");
		}
		
	public String getMWGeofences()
		{
			return pro.getProperty("MWGeofences");
		}
		
	public String getMWGPSFormatDegreesMinutesSeconds()
		{
			return pro.getProperty("MWGPSFormatDegreesMinutesSeconds");
		}
		
	public String getMWGPSFormatDecimalDegrees()
		{
			return pro.getProperty("MWGPSFormatDecimalDegrees");
		}
		
	public String getMWEmailAdd()
		{
			return pro.getProperty("MWEmailAdd");
		}
		
	public String getMWSubUserEmailAdd()
		{
			return pro.getProperty("MWSubUserEmailAdd");
		}

	public String getMWEmailAddAssoc()
		{
			return pro.getProperty("MWEmailAddAssoc");
		}
		
	public String getMWSMS()
		{
			return pro.getProperty("MWSMS");
		}
		
	public String getMWValidSMS()
		{
			return pro.getProperty("MWValidSMS");
		}
		
	public String getMWSMSAssoc()
		{
			return pro.getProperty("MWSMSAssoc");
		}
		
	public String getMWSMSNotAssoc()
		{
			return pro.getProperty("MWSMSNotAssoc");
		}
		
	public String getMWSubUserSMS()
		{
			return pro.getProperty("MWSubUserSMS");
		}
		
	public String getMWPOIUserViewEditSubUserName()
		{
			return pro.getProperty("MWPOIUserViewEditSubUsername");
		}
				
	public String getMWPOIUserViewEditSubPassword()
		{
			return pro.getProperty("MWPOIUserViewEditSubPassword");
		}

	public String getMWPOIUserViewOnlySubUserName()
		{
			return pro.getProperty("MWPOIUserViewOnlySubUsername");
		}
		
	public String getMWPOIUserViewOnlySubPassword()
		{
			return pro.getProperty("MWPOIUserViewOnlySubPassword");
		}

	public String getMWPOIUserCantViewSubUserName()
		{
			return pro.getProperty("MWPOIUserCantViewSubUsername");
		}
		
	public String getMWPOIUserCantViewSubPassword()
		{
			return pro.getProperty("MWPOIUserCantViewSubPassword");
		}
		
	public String getMWReportName()
		{
			return pro.getProperty("MWReportName");
		}
		
	public String getMWDriverIDTag()
		{
			return pro.getProperty("MWDriverIDTag");
		}
	
	public String getMWSensorTypeOne()
		{
		return pro.getProperty("MWSensorTypeOne");
		}
	
	public String getMWSensorTypeTwo()
		{
		return pro.getProperty("MWSensorTypeTwo");
		}
	
	public String getMWToken()
		{
		return pro.getProperty("MWToken");
		}
		
	//MW Country Get Properties -->	
	
	//<-- MY Country Get Properties
	
	public String getMYDevURL()
	{
			String path = pro.getProperty("MYDev");

			return path;
		}
		
	public String getMYTestURL()
		{
			String path = pro.getProperty("MYTest");

			return path;
		}
		
	public String getMYProdURL()
		{
			String path = pro.getProperty("MYProd");

			return path;
		}
		
	public String getMYUserName()
		{
			return pro.getProperty("MYUsername");
		}
		
	public String getMYPassword()
		{
			return pro.getProperty("MYPassword");
		}
		
	public String getMYSubUserName()
		{
			return pro.getProperty("MYSubUsername");
		}
		
	public String getMYSubPassword()
		{
			return pro.getProperty("MYSubPassword");
		}
		
	public String getMYInvalidUserName()
		{
			return pro.getProperty("MYInvalidUsername");
		}
		
	public String getMYInvalidPassword()
		{
			return pro.getProperty("MYInvalidPassword");
		}
		
	public String getMYVehicle()
		{
			return pro.getProperty("MYVehicle");
		}
		
	public String getMYVehicleRegistration()
		{
			return pro.getProperty("MYVehicleRegistration");
		}

	public String getMYVehicleNoTrip()
		{
			return pro.getProperty("MYVehicleNoTrip");
		}
		
	public String getMYPlaceSearch()
		{
			return pro.getProperty("MYPlaceSearch");
		}
		
	public String getMYLocationSearch()
		{
			return pro.getProperty("MYLocationSearch");
		}
		
	public String getMYPOI()
		{
			return pro.getProperty("MYPOI");
		}
		
	public String getMYGeofences()
		{
			return pro.getProperty("MYGeofences");
		}
		
	public String getMYGPSFormatDegreesMinutesSeconds()
		{
			return pro.getProperty("MYGPSFormatDegreesMinutesSeconds");
		}
		
	public String getMYGPSFormatDecimalDegrees()
		{
			return pro.getProperty("MYGPSFormatDecimalDegrees");
		}
		
	public String getMYEmailAdd()
		{
			return pro.getProperty("MYEmailAdd");
		}
		
	public String getMYSubUserEmailAdd()
		{
			return pro.getProperty("MYSubUserEmailAdd");
		}

	public String getMYEmailAddAssoc()
		{
			return pro.getProperty("MYEmailAddAssoc");
		}
		
	public String getMYSMS()
		{
			return pro.getProperty("MYSMS");
		}
		
	public String getMYValidSMS()
		{
			return pro.getProperty("MYValidSMS");
		}
		
		public String getMYSMSAssoc()
		{
			return pro.getProperty("MYSMSAssoc");
		}
		
	public String getMYSMSNotAssoc()
		{
			return pro.getProperty("MYSMSNotAssoc");
		}
		
	public String getMYSubUserSMS()
		{
			return pro.getProperty("MYSubUserSMS");
		}
		
	public String getMYPOIUserViewEditSubUserName()
		{
			return pro.getProperty("MYPOIUserViewEditSubUsername");
		}
				
	public String getMYPOIUserViewEditSubPassword()
		{
			return pro.getProperty("MYPOIUserViewEditSubPassword");
		}

	public String getMYPOIUserViewOnlySubUserName()
		{
			return pro.getProperty("MYPOIUserViewOnlySubUsername");
		}
		
	public String getMYPOIUserViewOnlySubPassword()
		{
			return pro.getProperty("MYPOIUserViewOnlySubPassword");
		}

	public String getMYPOIUserCantViewSubUserName()
		{
			return pro.getProperty("MYPOIUserCantViewSubUsername");
		}
		
	public String getMYPOIUserCantViewSubPassword()
		{
			return pro.getProperty("MYPOIUserCantViewSubPassword");
		}
		
	public String getMYReportName()
		{
			return pro.getProperty("MYReportName");
		}
		
	public String getMYDriverIDTag()
		{
			return pro.getProperty("MYDriverIDTag");
		}
	
	public String getMYSensorTypeOne()
		{
		return pro.getProperty("MYSensorTypeOne");
		}
	
	public String getMYSensorTypeTwo()
		{
		return pro.getProperty("MYSensorTypeTwo");
		}
	
	public String getMYToken()
	{
		return pro.getProperty("MYToken");
	}
		
	//MY Country Get Properties -->
	
	//<-- MZ Country Get Properties
	
	public String getMZDevURL()
	{
			String path = pro.getProperty("MZDev");

			return path;
		}
		
	public String getMZTestURL()
		{
			String path = pro.getProperty("MZTest");

			return path;
		}
		
	public String getMZProdURL()
		{
			String path = pro.getProperty("MZProd");

			return path;
		}
		
	public String getMZUserName()
		{
			return pro.getProperty("MZUsername");
		}
		
	public String getMZPassword()
		{
			return pro.getProperty("MZPassword");
		}
		
	public String getMZSubUserName()
		{
			return pro.getProperty("MZSubUsername");
		}
		
	public String getMZSubPassword()
		{
			return pro.getProperty("MZSubPassword");
		}
		
	public String getMZInvalidUserName()
		{
			return pro.getProperty("MZInvalidUsername");
		}
		
	public String getMZInvalidPassword()
		{
			return pro.getProperty("MZInvalidPassword");
		}
		
	public String getMZVehicle()
		{
			return pro.getProperty("MZVehicle");
		}
		
	public String getMZVehicleRegistration()
		{
			return pro.getProperty("MZVehicleRegistration");
		}

	public String getMZVehicleNoTrip()
		{
			return pro.getProperty("MZVehicleNoTrip");
		}
		
	public String getMZPlaceSearch()
		{
			return pro.getProperty("MZPlaceSearch");
		}
		
	public String getMZLocationSearch()
		{
			return pro.getProperty("MZLocationSearch");
		}
		
	public String getMZPOI()
		{
			return pro.getProperty("MZPOI");
		}
		
	public String getMZGeofences()
		{
			return pro.getProperty("MZGeofences");
		}
		
	public String getMZGPSFormatDegreesMinutesSeconds()
		{
			return pro.getProperty("MZGPSFormatDegreesMinutesSeconds");
		}
		
	public String getMZGPSFormatDecimalDegrees()
		{
			return pro.getProperty("MZGPSFormatDecimalDegrees");
		}
		
	public String getMZEmailAdd()
		{
			return pro.getProperty("MZEmailAdd");
		}
		
	public String getMZSubUserEmailAdd()
		{
			return pro.getProperty("MZSubUserEmailAdd");
		}

	public String getMZEmailAddAssoc()
		{
			return pro.getProperty("MZEmailAddAssoc");
		}
		
	public String getMZSMS()
		{
			return pro.getProperty("MZSMS");
		}
		
	public String getMZValidSMS()
		{
			return pro.getProperty("MZValidSMS");
		}
		
		public String getMZSMSAssoc()
		{
			return pro.getProperty("MZSMSAssoc");
		}
		
	public String getMZSMSNotAssoc()
		{
			return pro.getProperty("MZSMSNotAssoc");
		}
		
	public String getMZSubUserSMS()
		{
			return pro.getProperty("MZSubUserSMS");
		}
		
	public String getMZPOIUserViewEditSubUserName()
		{
			return pro.getProperty("MZPOIUserViewEditSubUsername");
		}
				
	public String getMZPOIUserViewEditSubPassword()
		{
			return pro.getProperty("MZPOIUserViewEditSubPassword");
		}

	public String getMZPOIUserViewOnlySubUserName()
		{
			return pro.getProperty("MZPOIUserViewOnlySubUsername");
		}
		
	public String getMZPOIUserViewOnlySubPassword()
		{
			return pro.getProperty("MZPOIUserViewOnlySubPassword");
		}

	public String getMZPOIUserCantViewSubUserName()
		{
			return pro.getProperty("MZPOIUserCantViewSubUsername");
		}
		
	public String getMZPOIUserCantViewSubPassword()
		{
			return pro.getProperty("MZPOIUserCantViewSubPassword");
		}
		
	public String getMZReportName()
		{
			return pro.getProperty("MZReportName");
		}
		
	public String getMZDriverIDTag()
		{
			return pro.getProperty("MZDriverIDTag");
		}
		
	public String getMZSensorTypeOne()
		{
		return pro.getProperty("MZSensorTypeOne");
		}
	
	public String getMZSensorTypeTwo()
		{
		return pro.getProperty("MZSensorTypeTwo");
		}
	//MZ Country Get Properties -->
	
	//<-- NZ Country Get Properties
	
	public String getNZDevURL()
	{
		String path = pro.getProperty("NZDev");

		return path;
	}
	
	public String getNZTestURL()
	{
		String path = pro.getProperty("NZTest");

		return path;
	}
	
	public String getNZProdURL()
	{
		String path = pro.getProperty("NZProd");

		return path;
	}
	
	public String getNZUserName()
	{
		return pro.getProperty("NZUsername");
	}
	
	public String getNZPassword()
	{
		return pro.getProperty("NZPassword");
	}
	
	public String getNZSubUserName()
	{
		return pro.getProperty("NZSubUsername");
	}
	
	public String getNZSubPassword()
	{
		return pro.getProperty("NZSubPassword");
	}
	
	public String getNZInvalidUserName()
	{
		return pro.getProperty("NZInvalidUsername");
	}
	
	public String getNZInvalidPassword()
	{
		return pro.getProperty("NZInvalidPassword");
	}
	
	public String getNZVehicle()
	{
		return pro.getProperty("NZVehicle");
	}
	
	public String getNZVehicleRegistration()
	{
		return pro.getProperty("NZVehicleRegistration");
	}

	public String getNZVehicleNoTrip()
	{
		return pro.getProperty("NZVehicleNoTrip");
	}
	
	public String getNZPlaceSearch()
	{
		return pro.getProperty("NZPlaceSearch");
	}
	
	public String getNZLocationSearch()
	{
		return pro.getProperty("NZLocationSearch");
	}
	
	public String getNZPOI()
	{
		return pro.getProperty("NZPOI");
	}
	
	public String getNZGeofences()
	{
		return pro.getProperty("NZGeofences");
	}
	
	public String getNZGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("NZGPSFormatDegreesMinutesSeconds");
	}
	
	public String getNZGPSFormatDecimalDegrees()
	{
		return pro.getProperty("NZGPSFormatDecimalDegrees");
	}
	
	public String getNZEmailAdd()
	{
		return pro.getProperty("NZEmailAdd");
	}
	
	public String getNZSubUserEmailAdd()
	{
		return pro.getProperty("NZSubUserEmailAdd");
	}

	public String getNZEmailAddAssoc()
	{
		return pro.getProperty("NZEmailAddAssoc");
	}
	
	public String getNZSMS()
	{
		return pro.getProperty("NZSMS");
	}
	
	public String getNZValidSMS()
	{
		return pro.getProperty("NZValidSMS");
	}
	
	public String getNZSMSAssoc()
	{
		return pro.getProperty("NZSMSAssoc");
	}
	
	public String getNZSMSNotAssoc()
	{
		return pro.getProperty("NZSMSNotAssoc");
	}
	
	public String getNZSubUserSMS()
	{
		return pro.getProperty("NZSubUserSMS");
	}
	
	public String getNZPOIUserViewEditSubUserName()
	{
		return pro.getProperty("NZPOIUserViewEditSubUsername");
	}
			
	public String getNZPOIUserViewEditSubPassword()
	{
		return pro.getProperty("NZPOIUserViewEditSubPassword");
	}

	public String getNZPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("NZPOIUserViewOnlySubUsername");
	}
	
	public String getNZPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("NZPOIUserViewOnlySubPassword");
	}

	public String getNZPOIUserCantViewSubUserName()
	{
		return pro.getProperty("NZPOIUserCantViewSubUsername");
	}
	
	public String getNZPOIUserCantViewSubPassword()
	{
		return pro.getProperty("NZPOIUserCantViewSubPassword");
	}
	
	public String getNZReportName()
	{
		return pro.getProperty("NZReportName");
	}
	
	public String getNZDriverIDTag()
	{
		return pro.getProperty("NZDriverIDTag");
	}
	
	public String getNZSensorTypeOne()
	{
		return pro.getProperty("NZSensorTypeOne");
	}
	
		public String getNZSensorTypeTwo()
	{
		return pro.getProperty("NZSensorTypeTwo");
	}
	
	public String getNZToken()
	{
		return pro.getProperty("NZToken");
	}
	
	//NZ Country Get Properties -->
	
	//<-- ZW Country Get Properties
	
	public String getZWDevURL()
	{
		String path = pro.getProperty("ZWDev");

		return path;
	}
	
	public String getZWTestURL()
	{
		String path = pro.getProperty("ZWTest");

		return path;
	}
	
	public String getZWProdURL()
	{
		String path = pro.getProperty("ZWProd");

		return path;
	}
	
	public String getZWUserName()
	{
		return pro.getProperty("ZWUsername");
	}
	
	public String getZWPassword()
	{
		return pro.getProperty("ZWPassword");
	}
	
	public String getZWSubUserName()
	{
		return pro.getProperty("ZWSubUsername");
	}
	
	public String getZWSubPassword()
	{
		return pro.getProperty("ZWSubPassword");
	}
	
	public String getZWInvalidUserName()
	{
		return pro.getProperty("ZWInvalidUsername");
	}
	
	public String getZWInvalidPassword()
	{
		return pro.getProperty("ZWInvalidPassword");
	}
	
	public String getZWVehicle()
	{
		return pro.getProperty("ZWVehicle");
	}
	
	public String getZWVehicleRegistration()
	{
		return pro.getProperty("ZWVehicleRegistration");
	}

	public String getZWVehicleNoTrip()
	{
		return pro.getProperty("ZWVehicleNoTrip");
	}
	
	public String getZWPlaceSearch()
	{
		return pro.getProperty("ZWPlaceSearch");
	}
	
	public String getZWLocationSearch()
	{
		return pro.getProperty("ZWLocationSearch");
	}
	
	public String getZWPOI()
	{
		return pro.getProperty("ZWPOI");
	}
	
	public String getZWGeofences()
	{
		return pro.getProperty("ZWGeofences");
	}
	
	public String getZWGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("ZWGPSFormatDegreesMinutesSeconds");
	}
	
	public String getZWGPSFormatDecimalDegrees()
	{
		return pro.getProperty("ZWGPSFormatDecimalDegrees");
	}
	
	public String getZWEmailAdd()
	{
		return pro.getProperty("ZWEmailAdd");
	}
	
	public String getZWSubUserEmailAdd()
	{
		return pro.getProperty("ZWSubUserEmailAdd");
	}

	public String getZWEmailAddAssoc()
	{
		return pro.getProperty("ZWEmailAddAssoc");
	}
	
	public String getZWSMS()
	{
		return pro.getProperty("ZWSMS");
	}
	
	public String getZWValidSMS()
	{
		return pro.getProperty("ZWValidSMS");
	}
	
	public String getZWSMSAssoc()
	{
		return pro.getProperty("ZWSMSAssoc");
	}
	
	public String getZWSMSNotAssoc()
	{
		return pro.getProperty("ZWSMSNotAssoc");
	}
	
	public String getZWSubUserSMS()
	{
		return pro.getProperty("ZWSubUserSMS");
	}
	
	public String getZWPOIUserViewEditSubUserName()
	{
		return pro.getProperty("ZWPOIUserViewEditSubUsername");
	}
			
	public String getZWPOIUserViewEditSubPassword()
	{
		return pro.getProperty("ZWPOIUserViewEditSubPassword");
	}

	public String getZWPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("ZWPOIUserViewOnlySubUsername");
	}
	
	public String getZWPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("ZWPOIUserViewOnlySubPassword");
	}

	public String getZWPOIUserCantViewSubUserName()
	{
		return pro.getProperty("ZWPOIUserCantViewSubUsername");
	}
	
	public String getZWPOIUserCantViewSubPassword()
	{
		return pro.getProperty("ZWPOIUserCantViewSubPassword");
	}
	
	public String getZWReportName()
	{
		return pro.getProperty("ZWReportName");
	}
	
	public String getZWDriverIDTag()
	{
		return pro.getProperty("ZWDriverIDTag");
	}
	
	public String getZWSensorTypeOne()
	{
		return pro.getProperty("ZWSensorTypeOne");
	}
	
		public String getZWSensorTypeTwo()
	{
		return pro.getProperty("ZWSensorTypeTwo");
	}
		
	//ZW Country Get Properties -->
	
	//<-- ES Country Get Properties
	
	public String getESDevURL()
	{
		String path = pro.getProperty("ESDev");

		return path;
	}
	
	public String getESTestURL()
	{
		String path = pro.getProperty("ESTest");

		return path;
	}
	
	public String getESProdURL()
	{
		String path = pro.getProperty("ESProd");

		return path;
	}
	
	public String getESUserName()
	{
		return pro.getProperty("ESUsername");
	}
	
	public String getESPassword()
	{
		return pro.getProperty("ESPassword");
	}
	
	public String getESSubUserName()
	{
		return pro.getProperty("ESSubUsername");
	}
	
	public String getESSubPassword()
	{
		return pro.getProperty("ESSubPassword");
	}
	
	public String getESInvalidUserName()
	{
		return pro.getProperty("ESInvalidUsername");
	}
	
	public String getESInvalidPassword()
	{
		return pro.getProperty("ESInvalidPassword");
	}
	
	public String getESVehicle()
	{
		return pro.getProperty("ESVehicle");
	}
	
	public String getESVehicleRegistration()
	{
		return pro.getProperty("ESVehicleRegistration");
	}

	public String getESVehicleNoTrip()
	{
		return pro.getProperty("ESVehicleNoTrip");
	}
	
	public String getESPlaceSearch()
	{
		return pro.getProperty("ESPlaceSearch");
	}
	
	public String getESLocationSearch()
	{
		return pro.getProperty("ESLocationSearch");
	}
	
	public String getESPOI()
	{
		return pro.getProperty("ESPOI");
	}
	
	public String getESGeofences()
	{
		return pro.getProperty("ESGeofences");
	}
	
	public String getESGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("ESGPSFormatDegreesMinutesSeconds");
	}
	
	public String getESGPSFormatDecimalDegrees()
	{
		return pro.getProperty("ESGPSFormatDecimalDegrees");
	}
	
	public String getESEmailAdd()
	{
		return pro.getProperty("ESEmailAdd");
	}
	
	public String getESSubUserEmailAdd()
	{
		return pro.getProperty("ESSubUserEmailAdd");
	}

	public String getESEmailAddAssoc()
	{
		return pro.getProperty("ESEmailAddAssoc");
	}
	
	public String getESSMS()
	{
		return pro.getProperty("ESSMS");
	}
	
	public String getESValidSMS()
	{
		return pro.getProperty("ESValidSMS");
	}
	
	public String getESSMSAssoc()
	{
		return pro.getProperty("ESSMSAssoc");
	}
	
	public String getESSMSNotAssoc()
	{
		return pro.getProperty("ESSMSNotAssoc");
	}
	
	public String getESSubUserSMS()
	{
		return pro.getProperty("ESSubUserSMS");
	}
	
	public String getESPOIUserViewEditSubUserName()
	{
		return pro.getProperty("ESPOIUserViewEditSubUsername");
	}
			
	public String getESPOIUserViewEditSubPassword()
	{
		return pro.getProperty("ESPOIUserViewEditSubPassword");
	}

	public String getESPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("ESPOIUserViewOnlySubUsername");
	}
	
	public String getESPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("ESPOIUserViewOnlySubPassword");
	}

	public String getESPOIUserCantViewSubUserName()
	{
		return pro.getProperty("ESPOIUserCantViewSubUsername");
	}
	
	public String getESPOIUserCantViewSubPassword()
	{
		return pro.getProperty("ESPOIUserCantViewSubPassword");
	}
	
	public String getESReportName()
	{
		return pro.getProperty("ESReportName");
	}
	
	public String getESDriverIDTag()
	{
		return pro.getProperty("ESDriverIDTag");
	}
	
	public String getESSensorTypeOne()
	{
		return pro.getProperty("ESSensorTypeOne");
	}
	
		public String getESSensorTypeTwo()
	{
		return pro.getProperty("ESSensorTypeTwo");
	}
	
	public String getESToken()
	{
		return pro.getProperty("ESToken");
	}
	
	//ES Country Get Properties -->

	//<-- PH Country Get Properties
	
	public String getPHDevURL()
	{
		String path = pro.getProperty("PHDev");

		return path;
	}
	
	public String getPHTestURL()
	{
		String path = pro.getProperty("PHTest");

		return path;
	}
	
	public String getPHProdURL()
	{
		String path = pro.getProperty("PHProd");

		return path;
	}
	
	public String getPHUserName()
	{
		return pro.getProperty("PHUsername");
	}
	
	public String getPHPassword()
	{
		return pro.getProperty("PHPassword");
	}
	
	public String getPHSubUserName()
	{
		return pro.getProperty("PHSubUsername");
	}
	
	public String getPHSubPassword()
	{
		return pro.getProperty("PHSubPassword");
	}
	
	public String getPHInvalidUserName()
	{
		return pro.getProperty("PHInvalidUsername");
	}
	
	public String getPHInvalidPassword()
	{
		return pro.getProperty("PHInvalidPassword");
	}
	
	public String getPHVehicle()
	{
		return pro.getProperty("PHVehicle");
	}
	
	public String getPHVehicleRegistration()
	{
		return pro.getProperty("PHVehicleRegistration");
	}

	public String getPHVehicleNoTrip()
	{
		return pro.getProperty("PHVehicleNoTrip");
	}
	
	public String getPHPlaceSearch()
	{
		return pro.getProperty("PHPlaceSearch");
	}
	
	public String getPHLocationSearch()
	{
		return pro.getProperty("PHLocationSearch");
	}
	
	public String getPHPOI()
	{
		return pro.getProperty("PHPOI");
	}
	
	public String getPHGeofences()
	{
		return pro.getProperty("PHGeofences");
	}
	
	public String getPHGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("PHGPSFormatDegreesMinutesSeconds");
	}
	
	public String getPHGPSFormatDecimalDegrees()
	{
		return pro.getProperty("PHGPSFormatDecimalDegrees");
	}
	
	public String getPHEmailAdd()
	{
		return pro.getProperty("PHEmailAdd");
	}
	
	public String getPHSubUserEmailAdd()
	{
		return pro.getProperty("PHSubUserEmailAdd");
	}

	public String getPHEmailAddAssoc()
	{
		return pro.getProperty("PHEmailAddAssoc");
	}
	
	public String getPHSMS()
	{
		return pro.getProperty("PHSMS");
	}
	
	public String getPHValidSMS()
	{
		return pro.getProperty("PHValidSMS");
	}
	
	public String getPHSMSAssoc()
	{
		return pro.getProperty("PHSMSAssoc");
	}
	
	public String getPHSMSNotAssoc()
	{
		return pro.getProperty("PHSMSNotAssoc");
	}
	
	public String getPHSubUserSMS()
	{
		return pro.getProperty("PHSubUserSMS");
	}
	
	public String getPHPOIUserViewEditSubUserName()
	{
		return pro.getProperty("PHPOIUserViewEditSubUsername");
	}
			
	public String getPHPOIUserViewEditSubPassword()
	{
		return pro.getProperty("PHPOIUserViewEditSubPassword");
	}

	public String getPHPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("PHPOIUserViewOnlySubUsername");
	}
	
	public String getPHPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("PHPOIUserViewOnlySubPassword");
	}

	public String getPHPOIUserCantViewSubUserName()
	{
		return pro.getProperty("PHPOIUserCantViewSubUsername");
	}
	
	public String getPHPOIUserCantViewSubPassword()
	{
		return pro.getProperty("PHPOIUserCantViewSubPassword");
	}
	
	public String getPHReportName()
	{
		return pro.getProperty("PHReportName");
	}
	
	public String getPHDriverIDTag()
	{
		return pro.getProperty("PHDriverIDTag");
	}
	
	public String getPHSensorTypeOne()
	{
		return pro.getProperty("PHSensorTypeOne");
	}
	
		public String getPHSensorTypeTwo()
	{
		return pro.getProperty("PHSensorTypeTwo");
	}
	
	public String getPHToken()
	{
		return pro.getProperty("PHToken");
	}
	
	//PH Country Get Properties -->	
	
	//<-- SZ Country Get Properties
	
	public String getSZDevURL()
	{
		String path = pro.getProperty("SZDev");

		return path;
	}
		
	public String getSZTestURL()
	{
		String path = pro.getProperty("SZTest");

		return path;
	}
		
	public String getSZProdURL()
	{
		String path = pro.getProperty("SZProd");

		return path;
	}
		
	public String getSZUserName()
	{
		return pro.getProperty("SZUsername");
	}
		
	public String getSZPassword()
	{
		return pro.getProperty("SZPassword");
	}
		
	public String getSZSubUserName()
	{
		return pro.getProperty("SZSubUsername");
	}
		
	public String getSZSubPassword()
	{
		return pro.getProperty("SZSubPassword");
	}
		
	public String getSZInvalidUserName()
	{
		return pro.getProperty("SZInvalidUsername");
	}
		
	public String getSZInvalidPassword()
	{
		return pro.getProperty("SZInvalidPassword");
	}
		
	public String getSZVehicle()
	{
		return pro.getProperty("SZVehicle");
	}
		
	public String getSZVehicleRegistration()
	{
		return pro.getProperty("SZVehicleRegistration");
	}

	public String getSZVehicleNoTrip()
	{
		return pro.getProperty("SZVehicleNoTrip");
	}
		
	public String getSZPlaceSearch()
	{
		return pro.getProperty("SZPlaceSearch");
	}
		
	public String getSZLocationSearch()
	{
		return pro.getProperty("SZLocationSearch");
	}
		
	public String getSZPOI()
	{
		return pro.getProperty("SZPOI");
	}
		
	public String getSZGeofences()
	{
		return pro.getProperty("SZGeofences");
	}
		
	public String getSZGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("SZGPSFormatDegreesMinutesSeconds");
	}
		
	public String getSZGPSFormatDecimalDegrees()
	{
		return pro.getProperty("SZGPSFormatDecimalDegrees");
	}
		
	public String getSZEmailAdd()
	{
		return pro.getProperty("SZEmailAdd");
	}
		
	public String getSZSubUserEmailAdd()
	{
		return pro.getProperty("SZSubUserEmailAdd");
	}

	public String getSZEmailAddAssoc()
	{
		return pro.getProperty("SZEmailAddAssoc");
	}
		
	public String getSZSMS()
	{
		return pro.getProperty("SZSMS");
	}
		
	public String getSZValidSMS()
	{
		return pro.getProperty("SZValidSMS");
	}
		
	public String getSZSMSAssoc()
	{
		return pro.getProperty("SZSMSAssoc");
	}
		
	public String getSZSMSNotAssoc()
	{
		return pro.getProperty("SZSMSNotAssoc");
	}
		
	public String getSZSubUserSMS()
	{
		return pro.getProperty("SZSubUserSMS");
	}
		
	public String getSZPOIUserViewEditSubUserName()
	{
		return pro.getProperty("SZPOIUserViewEditSubUsername");
	}
				
	public String getSZPOIUserViewEditSubPassword()
	{
		return pro.getProperty("SZPOIUserViewEditSubPassword");
	}

	public String getSZPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("SZPOIUserViewOnlySubUsername");
	}
		
	public String getSZPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("SZPOIUserViewOnlySubPassword");
	}

	public String getSZPOIUserCantViewSubUserName()
	{
		return pro.getProperty("SZPOIUserCantViewSubUsername");
	}
		
	public String getSZPOIUserCantViewSubPassword()
	{
		return pro.getProperty("SZPOIUserCantViewSubPassword");
	}
		
	public String getSZReportName()
	{
		return pro.getProperty("SZReportName");
	}
		
	public String getSZDriverIDTag()
	{
		return pro.getProperty("SZDriverIDTag");
	}
	
	public String getSZSensorTypeOne()
	{
		return pro.getProperty("SZSensorTypeOne");
	}
	
		public String getSZSensorTypeTwo()
	{
		return pro.getProperty("SZSensorTypeTwo");
	}
	
	//SZ Country Get Properties -->
	
	//<-- RW Country Get Properties
	
	public String getRWDevURL()
	{
		String path = pro.getProperty("RWDev");
	
		return path;
	}
	
	public String getRWTestURL()
	{
		String path = pro.getProperty("RWTest");
	
		return path;
	}
	
	public String getRWProdURL()
	{
		String path = pro.getProperty("RWProd");
	
		return path;
	}
	
	public String getRWUserName()
	{
		return pro.getProperty("RWUsername");
	}
	
	public String getRWPassword()
	{
		return pro.getProperty("RWPassword");
	}
	
	public String getRWSubUserName()
	{
		return pro.getProperty("RWSubUsername");
	}
	
	public String getRWSubPassword()
	{
		return pro.getProperty("RWSubPassword");
	}
	
	public String getRWInvalidUserName()
	{
		return pro.getProperty("RWInvalidUsername");
	}
	
	public String getRWInvalidPassword()
	{
		return pro.getProperty("RWInvalidPassword");
	}
	
	public String getRWVehicle()
	{
		return pro.getProperty("RWVehicle");
	}
	
	public String getRWVehicleRegistration()
	{
		return pro.getProperty("RWVehicleRegistration");
	}
	
	public String getRWVehicleNoTrip()
	{
		return pro.getProperty("RWVehicleNoTrip");
	}
	
	public String getRWPlaceSearch()
	{
		return pro.getProperty("RWPlaceSearch");
	}
	
	public String getRWLocationSearch()
	{
		return pro.getProperty("RWLocationSearch");
	}
	
	public String getRWPOI()
	{
		return pro.getProperty("RWPOI");
	}
	
	public String getRWGeofences()
	{
		return pro.getProperty("RWGeofences");
	}
	
	public String getRWGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("RWGPSFormatDegreesMinutesSeconds");
	}
	
	public String getRWGPSFormatDecimalDegrees()
	{
		return pro.getProperty("RWGPSFormatDecimalDegrees");
	}
	
	public String getRWEmailAdd()
	{
		return pro.getProperty("RWEmailAdd");
	}
	
	public String getRWSubUserEmailAdd()
	{
		return pro.getProperty("RWSubUserEmailAdd");
	}
	
	public String getRWEmailAddAssoc()
	{
		return pro.getProperty("RWEmailAddAssoc");
	}
	
	public String getRWSMS()
	{
		return pro.getProperty("RWSMS");
	}
	
	public String getRWValidSMS()
	{
		return pro.getProperty("RWValidSMS");
	}
	
	public String getRWSMSAssoc()
	{
		return pro.getProperty("RWSMSAssoc");
	}
	
	public String getRWSMSNotAssoc()
	{
		return pro.getProperty("RWSMSNotAssoc");
	}
	
	public String getRWSubUserSMS()
	{
		return pro.getProperty("RWSubUserSMS");
	}
	
	public String getRWPOIUserViewEditSubUserName()
	{
		return pro.getProperty("RWPOIUserViewEditSubUsername");
	}
			
	public String getRWPOIUserViewEditSubPassword()
	{
		return pro.getProperty("RWPOIUserViewEditSubPassword");
	}
	
	public String getRWPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("RWPOIUserViewOnlySubUsername");
	}
	
	public String getRWPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("RWPOIUserViewOnlySubPassword");
	}
	
	public String getRWPOIUserCantViewSubUserName()
	{
		return pro.getProperty("RWPOIUserCantViewSubUsername");
	}
	
	public String getRWPOIUserCantViewSubPassword()
	{
		return pro.getProperty("RWPOIUserCantViewSubPassword");
	}
	
	public String getRWReportName()
	{
		return pro.getProperty("RWReportName");
	}
	
	public String getRWDriverIDTag()
	{
		return pro.getProperty("RWDriverIDTag");
	}
	
	public String getRWSensorTypeOne()
	{
		return pro.getProperty("RWSensorTypeOne");
	}
	
		public String getRWSensorTypeTwo()
	{
		return pro.getProperty("RWSensorTypeTwo");
	}
	
	//RW Country Get Properties -->
	
	//<-- TZ Country Get Properties
	
	public String getTZDevURL()
	{
		String path = pro.getProperty("TZDev");

		return path;
	}
	
	public String getTZTestURL()
	{
		String path = pro.getProperty("TZTest");

		return path;
	}
	
	public String getTZProdURL()
	{
		String path = pro.getProperty("TZProd");

		return path;
	}
	
	public String getTZUserName()
	{
		return pro.getProperty("TZUsername");
	}
	
	public String getTZPassword()
	{
		return pro.getProperty("TZPassword");
	}
	
	public String getTZSubUserName()
	{
		return pro.getProperty("TZSubUsername");
	}
	
	public String getTZSubPassword()
	{
		return pro.getProperty("TZSubPassword");
	}
	
	public String getTZInvalidUserName()
	{
		return pro.getProperty("TZInvalidUsername");
	}
	
	public String getTZInvalidPassword()
	{
		return pro.getProperty("TZInvalidPassword");
	}
	
	public String getTZVehicle()
	{
		return pro.getProperty("TZVehicle");
	}
	
	public String getTZVehicleRegistration()
	{
		return pro.getProperty("TZVehicleRegistration");
	}

	public String getTZVehicleNoTrip()
	{
		return pro.getProperty("TZVehicleNoTrip");
	}
	
	public String getTZPlaceSearch()
	{
		return pro.getProperty("TZPlaceSearch");
	}
	
	public String getTZLocationSearch()
	{
		return pro.getProperty("TZLocationSearch");
	}
	
	public String getTZPOI()
	{
		return pro.getProperty("TZPOI");
	}
	
	public String getTZGeofences()
	{
		return pro.getProperty("TZGeofences");
	}
	
	public String getTZGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("TZGPSFormatDegreesMinutesSeconds");
	}
	
	public String getTZGPSFormatDecimalDegrees()
	{
		return pro.getProperty("TZGPSFormatDecimalDegrees");
	}
	
	public String getTZEmailAdd()
	{
		return pro.getProperty("TZEmailAdd");
	}
	
	public String getTZSubUserEmailAdd()
	{
		return pro.getProperty("TZSubUserEmailAdd");
	}

	public String getTZEmailAddAssoc()
	{
		return pro.getProperty("TZEmailAddAssoc");
	}
	
	public String getTZSMS()
	{
		return pro.getProperty("TZSMS");
	}
	
	public String getTZValidSMS()
	{
		return pro.getProperty("TZValidSMS");
	}
	
	public String getTZSMSAssoc()
	{
		return pro.getProperty("TZSMSAssoc");
	}
	
	public String getTZSMSNotAssoc()
	{
		return pro.getProperty("TZSMSNotAssoc");
	}
	
	public String getTZSubUserSMS()
	{
		return pro.getProperty("TZSubUserSMS");
	}
	
	public String getTZPOIUserViewEditSubUserName()
	{
		return pro.getProperty("TZPOIUserViewEditSubUsername");
	}
			
	public String getTZPOIUserViewEditSubPassword()
	{
		return pro.getProperty("TZPOIUserViewEditSubPassword");
	}

	public String getTZPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("TZPOIUserViewOnlySubUsername");
	}
	
	public String getTZPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("TZPOIUserViewOnlySubPassword");
	}

	public String getTZPOIUserCantViewSubUserName()
	{
		return pro.getProperty("TZPOIUserCantViewSubUsername");
	}
	
	public String getTZPOIUserCantViewSubPassword()
	{
		return pro.getProperty("TZPOIUserCantViewSubPassword");
	}
	
	public String getTZReportName()
	{
		return pro.getProperty("TZReportName");
	}
	
	public String getTZDriverIDTag()
	{
		return pro.getProperty("TZDriverIDTag");
	}
	
	public String getTZSensorTypeOne()
	{
		return pro.getProperty("TZSensorTypeOne");
	}
	
		public String getTZSensorTypeTwo()
	{
		return pro.getProperty("TZSensorTypeTwo");
	}
	
	//TZ Country Get Properties -->

	//<-- NA Country Get Properties
	
	public String getNADevURL()
	{
		String path = pro.getProperty("NADev");

		return path;
	}
	
	public String getNATestURL()
	{
		String path = pro.getProperty("NATest");

		return path;
	}
	
	public String getNAProdURL()
	{
		String path = pro.getProperty("NAProd");

		return path;
	}
	
	public String getNAUserName()
	{
		return pro.getProperty("NAUsername");
	}
	
	public String getNAPassword()
	{
		return pro.getProperty("NAPassword");
	}
	
	public String getNASubUserName()
	{
		return pro.getProperty("NASubUsername");
	}
	
	public String getNASubPassword()
	{
		return pro.getProperty("NASubPassword");
	}
	
	public String getNAInvalidUserName()
	{
		return pro.getProperty("NAInvalidUsername");
	}
	
	public String getNAInvalidPassword()
	{
		return pro.getProperty("NAInvalidPassword");
	}
	
	public String getNAVehicle()
	{
		return pro.getProperty("NAVehicle");
	}
	
	public String getNAVehicleRegistration()
	{
		return pro.getProperty("NAVehicleRegistration");
	}

	public String getNAVehicleNoTrip()
	{
		return pro.getProperty("NAVehicleNoTrip");
	}
	
	public String getNAPlaceSearch()
	{
		return pro.getProperty("NAPlaceSearch");
	}
	
	public String getNALocationSearch()
	{
		return pro.getProperty("NALocationSearch");
	}
	
	public String getNAPOI()
	{
		return pro.getProperty("NAPOI");
	}
	
	public String getNAGeofences()
	{
		return pro.getProperty("NAGeofences");
	}
	
	public String getNAGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("NAGPSFormatDegreesMinutesSeconds");
	}
	
	public String getNAGPSFormatDecimalDegrees()
	{
		return pro.getProperty("NAGPSFormatDecimalDegrees");
	}
	
	public String getNAEmailAdd()
	{
		return pro.getProperty("NAEmailAdd");
	}
	
	public String getNASubUserEmailAdd()
	{
		return pro.getProperty("NASubUserEmailAdd");
	}

	public String getNAEmailAddAssoc()
	{
		return pro.getProperty("NAEmailAddAssoc");
	}
	
	public String getNASMS()
	{
		return pro.getProperty("NASMS");
	}
	
	public String getNAValidSMS()
	{
		return pro.getProperty("NAValidSMS");
	}
	
	public String getNASMSAssoc()
	{
		return pro.getProperty("NASMSAssoc");
	}
	
	public String getNASMSNotAssoc()
	{
		return pro.getProperty("NASMSNotAssoc");
	}
	
	public String getNASubUserSMS()
	{
		return pro.getProperty("NASubUserSMS");
	}
	
	public String getNAPOIUserViewEditSubUserName()
	{
		return pro.getProperty("NAPOIUserViewEditSubUsername");
	}
			
	public String getNAPOIUserViewEditSubPassword()
	{
		return pro.getProperty("NAPOIUserViewEditSubPassword");
	}

	public String getNAPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("NAPOIUserViewOnlySubUsername");
	}
	
	public String getNAPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("NAPOIUserViewOnlySubPassword");
	}

	public String getNAPOIUserCantViewSubUserName()
	{
		return pro.getProperty("NAPOIUserCantViewSubUsername");
	}
	
	public String getNAPOIUserCantViewSubPassword()
	{
		return pro.getProperty("NAPOIUserCantViewSubPassword");
	}
	
	public String getNAReportName()
	{
		return pro.getProperty("NAReportName");
	}
	
	public String getNADriverIDTag()
	{
		return pro.getProperty("NADriverIDTag");
	}
	
	public String getNASensorTypeOne()
	{
		return pro.getProperty("NASensorTypeOne");
	}
	
		public String getNASensorTypeTwo()
	{
		return pro.getProperty("NASensorTypeTwo");
	}
	
	public String getNAToken()
	{
		return pro.getProperty("NAToken");
	}
	
	//NA Country Get Properties -->
	
	//<-- KE Country Get Properties
	
	public String getKEDevURL()
	{
		String path = pro.getProperty("KEDev");

		return path;
	}
	
	public String getKETestURL()
	{
		String path = pro.getProperty("KETest");

		return path;
	}
	
	public String getKEProdURL()
	{
		String path = pro.getProperty("KEProd");

		return path;
	}
	
	public String getKEUserName()
	{
		return pro.getProperty("KEUsername");
	}
	
	public String getKEPassword()
	{
		return pro.getProperty("KEPassword");
	}
	
	public String getKESubUserName()
	{
		return pro.getProperty("KESubUsername");
	}
	
	public String getKESubPassword()
	{
		return pro.getProperty("KESubPassword");
	}
	
	public String getKEInvalidUserName()
	{
		return pro.getProperty("KEInvalidUsername");
	}
	
	public String getKEInvalidPassword()
	{
		return pro.getProperty("KEInvalidPassword");
	}
	
	public String getKEVehicle()
	{
		return pro.getProperty("KEVehicle");
	}
	
	public String getKEVehicleRegistration()
	{
		return pro.getProperty("KEVehicleRegistration");
	}

	public String getKEVehicleNoTrip()
	{
		return pro.getProperty("KEVehicleNoTrip");
	}
	
	public String getKEPlaceSearch()
	{
		return pro.getProperty("KEPlaceSearch");
	}
	
	public String getKELocationSearch()
	{
		return pro.getProperty("KELocationSearch");
	}
	
	public String getKEPOI()
	{
		return pro.getProperty("KEPOI");
	}
	
	public String getKEGeofences()
	{
		return pro.getProperty("KEGeofences");
	}
	
	public String getKEGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("KEGPSFormatDegreesMinutesSeconds");
	}
	
	public String getKEGPSFormatDecimalDegrees()
	{
		return pro.getProperty("KEGPSFormatDecimalDegrees");
	}
	
	public String getKEEmailAdd()
	{
		return pro.getProperty("KEEmailAdd");
	}
	
	public String getKESubUserEmailAdd()
	{
		return pro.getProperty("KESubUserEmailAdd");
	}

	public String getKEEmailAddAssoc()
	{
		return pro.getProperty("KEEmailAddAssoc");
	}
	
	public String getKESMS()
	{
		return pro.getProperty("KESMS");
	}
	
	public String getKEValidSMS()
	{
		return pro.getProperty("KEValidSMS");
	}
	
	public String getKESMSAssoc()
	{
		return pro.getProperty("KESMSAssoc");
	}
	
	public String getKESMSNotAssoc()
	{
		return pro.getProperty("KESMSNotAssoc");
	}
	
	public String getKESubUserSMS()
	{
		return pro.getProperty("KESubUserSMS");
	}
	
	public String getKEPOIUserViewEditSubUserName()
	{
		return pro.getProperty("KEPOIUserViewEditSubUsername");
	}
			
	public String getKEPOIUserViewEditSubPassword()
	{
		return pro.getProperty("KEPOIUserViewEditSubPassword");
	}

	public String getKEPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("KEPOIUserViewOnlySubUsername");
	}
	
	public String getKEPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("KEPOIUserViewOnlySubPassword");
	}

	public String getKEPOIUserCantViewSubUserName()
	{
		return pro.getProperty("KEPOIUserCantViewSubUsername");
	}
	
	public String getKEPOIUserCantViewSubPassword()
	{
		return pro.getProperty("KEPOIUserCantViewSubPassword");
	}
	
	public String getKEReportName()
	{
		return pro.getProperty("KEReportName");
	}
	
	public String getKEDriverIDTag()
	{
		return pro.getProperty("KEDriverIDTag");
	}
	
	public String getKESensorTypeOne()
	{
		return pro.getProperty("KESensorTypeOne");
	}
	
		public String getKESensorTypeTwo()
	{
		return pro.getProperty("KESensorTypeTwo");
	}
	
	public String getKEToken()
	{
		return pro.getProperty("KEToken");
	}
	
	//KE Country Get Properties -->

	//<-- NG Country Get Properties
	
	public String getNGDevURL()
	{
		String path = pro.getProperty("NGDev");

		return path;
	}
	
	public String getNGTestURL()
	{
		String path = pro.getProperty("NGTest");

		return path;
	}
	
	public String getNGProdURL()
	{
		String path = pro.getProperty("NGProd");

		return path;
	}
	
	public String getNGUserName()
	{
		return pro.getProperty("NGUsername");
	}
	
	public String getNGPassword()
	{
		return pro.getProperty("NGPassword");
	}
	
	public String getNGSubUserName()
	{
		return pro.getProperty("NGSubUsername");
	}
	
	public String getNGSubPassword()
	{
		return pro.getProperty("NGSubPassword");
	}
	
	public String getNGInvalidUserName()
	{
		return pro.getProperty("NGInvalidUsername");
	}
	
	public String getNGInvalidPassword()
	{
		return pro.getProperty("NGInvalidPassword");
	}
	
	public String getNGVehicle()
	{
		return pro.getProperty("NGVehicle");
	}
	
	public String getNGVehicleRegistration()
	{
		return pro.getProperty("NGVehicleRegistration");
	}

	public String getNGVehicleNoTrip()
	{
		return pro.getProperty("NGVehicleNoTrip");
	}
	
	public String getNGPlaceSearch()
	{
		return pro.getProperty("NGPlaceSearch");
	}
	
	public String getNGLocationSearch()
	{
		return pro.getProperty("NGLocationSearch");
	}
	
	public String getNGPOI()
	{
		return pro.getProperty("NGPOI");
	}
	
	public String getNGGeofences()
	{
		return pro.getProperty("NGGeofences");
	}
	
	public String getNGGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("NGGPSFormatDegreesMinutesSeconds");
	}
	
	public String getNGGPSFormatDecimalDegrees()
	{
		return pro.getProperty("NGGPSFormatDecimalDegrees");
	}
	
	public String getNGEmailAdd()
	{
		return pro.getProperty("NGEmailAdd");
	}
	
	public String getNGSubUserEmailAdd()
	{
		return pro.getProperty("NGSubUserEmailAdd");
	}

	public String getNGEmailAddAssoc()
	{
		return pro.getProperty("NGEmailAddAssoc");
	}
	
	public String getNGSMS()
	{
		return pro.getProperty("NGSMS");
	}
	
	public String getNGValidSMS()
	{
		return pro.getProperty("NGValidSMS");
	}
	
	public String getNGSMSAssoc()
	{
		return pro.getProperty("NGSMSAssoc");
	}
	
	public String getNGSMSNotAssoc()
	{
		return pro.getProperty("NGSMSNotAssoc");
	}
	
	public String getNGSubUserSMS()
	{
		return pro.getProperty("NGSubUserSMS");
	}
	
	public String getNGPOIUserViewEditSubUserName()
	{
		return pro.getProperty("NGPOIUserViewEditSubUsername");
	}
			
	public String getNGPOIUserViewEditSubPassword()
	{
		return pro.getProperty("NGPOIUserViewEditSubPassword");
	}

	public String getNGPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("NGPOIUserViewOnlySubUsername");
	}
	
	public String getNGPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("NGPOIUserViewOnlySubPassword");
	}

	public String getNGPOIUserCantViewSubUserName()
	{
		return pro.getProperty("NGPOIUserCantViewSubUsername");
	}
	
	public String getNGPOIUserCantViewSubPassword()
	{
		return pro.getProperty("NGPOIUserCantViewSubPassword");
	}
	
	public String getNGReportName()
	{
		return pro.getProperty("NGReportName");
	}
	
	public String getNGDriverIDTag()
	{
		return pro.getProperty("NGDriverIDTag");
	}
	
	public String getNGSensorTypeOne()
	{
		return pro.getProperty("NGSensorTypeOne");
	}
	
		public String getNGSensorTypeTwo()
	{
		return pro.getProperty("NGSensorTypeTwo");
	}
	
	public String getNGToken()
	{
		return pro.getProperty("NGToken");
	}
	
	//NG Country Get Properties -->	
	
	//<-- BW Country Get Properties
	
	public String getBWDevURL()
	{
		String path = pro.getProperty("BWDev");

		return path;
	}
	
	public String getBWTestURL()
	{
		String path = pro.getProperty("BWTest");

		return path;
	}
	
	public String getBWProdURL()
	{
		String path = pro.getProperty("BWProd");

		return path;
	}
	
	public String getBWUserName()
	{
		return pro.getProperty("BWUsername");
	}
	
	public String getBWPassword()
	{
		return pro.getProperty("BWPassword");
	}
	
	public String getBWSubUserName()
	{
		return pro.getProperty("BWSubUsername");
	}
	
	public String getBWSubPassword()
	{
		return pro.getProperty("BWSubPassword");
	}
	
	public String getBWInvalidUserName()
	{
		return pro.getProperty("BWInvalidUsername");
	}
	
	public String getBWInvalidPassword()
	{
		return pro.getProperty("BWInvalidPassword");
	}
	
	public String getBWVehicle()
	{
		return pro.getProperty("BWVehicle");
	}
	
	public String getBWVehicleRegistration()
	{
		return pro.getProperty("BWVehicleRegistration");
	}

	public String getBWVehicleNoTrip()
	{
		return pro.getProperty("BWVehicleNoTrip");
	}
	
	public String getBWPlaceSearch()
	{
		return pro.getProperty("BWPlaceSearch");
	}
	
	public String getBWLocationSearch()
	{
		return pro.getProperty("BWLocationSearch");
	}
	
	public String getBWPOI()
	{
		return pro.getProperty("BWPOI");
	}
	
	public String getBWGeofences()
	{
		return pro.getProperty("BWGeofences");
	}
	
	public String getBWGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("BWGPSFormatDegreesMinutesSeconds");
	}
	
	public String getBWGPSFormatDecimalDegrees()
	{
		return pro.getProperty("BWGPSFormatDecimalDegrees");
	}
	
	public String getBWEmailAdd()
	{
		return pro.getProperty("BWEmailAdd");
	}
	
	public String getBWSubUserEmailAdd()
	{
		return pro.getProperty("BWSubUserEmailAdd");
	}

	public String getBWEmailAddAssoc()
	{
		return pro.getProperty("BWEmailAddAssoc");
	}
	
	public String getBWSMS()
	{
		return pro.getProperty("BWSMS");
	}
	
	public String getBWValidSMS()
	{
		return pro.getProperty("BWValidSMS");
	}
	
	public String getBWSMSAssoc()
	{
		return pro.getProperty("BWSMSAssoc");
	}
	
	public String getBWSMSNotAssoc()
	{
		return pro.getProperty("BWSMSNotAssoc");
	}
	
	public String getBWSubUserSMS()
	{
		return pro.getProperty("BWSubUserSMS");
	}
	
	public String getBWPOIUserViewEditSubUserName()
	{
		return pro.getProperty("BWPOIUserViewEditSubUsername");
	}
			
	public String getBWPOIUserViewEditSubPassword()
	{
		return pro.getProperty("BWPOIUserViewEditSubPassword");
	}

	public String getBWPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("BWPOIUserViewOnlySubUsername");
	}
	
	public String getBWPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("BWPOIUserViewOnlySubPassword");
	}

	public String getBWPOIUserCantViewSubUserName()
	{
		return pro.getProperty("BWPOIUserCantViewSubUsername");
	}
	
	public String getBWPOIUserCantViewSubPassword()
	{
		return pro.getProperty("BWPOIUserCantViewSubPassword");
	}
	
	public String getBWReportName()
	{
		return pro.getProperty("BWReportName");
	}
	
	public String getBWDriverIDTag()
	{
		return pro.getProperty("BWDriverIDTag");
	}
	
	public String getBWSensorTypeOne()
	{
		return pro.getProperty("BWSensorTypeOne");
	}
	
		public String getBWSensorTypeTwo()
	{
		return pro.getProperty("BWSensorTypeTwo");
	}
	
	public String getBWToken()
	{
		return pro.getProperty("BWToken");
	}
	
	//BW Country Get Properties -->
	
	//<-- FR Country Get Properties
	
	public String getFRDevURL()
	{
		String path = pro.getProperty("FRDev");

		return path;
	}
	
	public String getFRTestURL()
	{
		String path = pro.getProperty("FRTest");

		return path;
	}
	
	public String getFRProdURL()
	{
		String path = pro.getProperty("FRProd");

		return path;
	}
	
	public String getFRUserName()
	{
		return pro.getProperty("FRUsername");
	}
	
	public String getFRPassword()
	{
		return pro.getProperty("FRPassword");
	}
	
	public String getFRSubUserName()
	{
		return pro.getProperty("FRSubUsername");
	}
	
	public String getFRSubPassword()
	{
		return pro.getProperty("FRSubPassword");
	}
	
	public String getFRInvalidUserName()
	{
		return pro.getProperty("FRInvalidUsername");
	}
	
	public String getFRInvalidPassword()
	{
		return pro.getProperty("FRInvalidPassword");
	}
	
	public String getFRVehicle()
	{
		return pro.getProperty("FRVehicle");
	}
	
	public String getFRVehicleRegistration()
	{
		return pro.getProperty("FRVehicleRegistration");
	}

	public String getFRVehicleNoTrip()
	{
		return pro.getProperty("FRVehicleNoTrip");
	}
	
	public String getFRPlaceSearch()
	{
		return pro.getProperty("FRPlaceSearch");
	}
	
	public String getFRLocationSearch()
	{
		return pro.getProperty("FRLocationSearch");
	}
	
	public String getFRPOI()
	{
		return pro.getProperty("FRPOI");
	}
	
	public String getFRGeofences()
	{
		return pro.getProperty("FRGeofences");
	}
	
	public String getFRGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("FRGPSFormatDegreesMinutesSeconds");
	}
	
	public String getFRGPSFormatDecimalDegrees()
	{
		return pro.getProperty("FRGPSFormatDecimalDegrees");
	}
	
	public String getFREmailAdd()
	{
		return pro.getProperty("FREmailAdd");
	}
	
	public String getFRSubUserEmailAdd()
	{
		return pro.getProperty("FRSubUserEmailAdd");
	}

	public String getFREmailAddAssoc()
	{
		return pro.getProperty("FREmailAddAssoc");
	}
	
	public String getFRSMS()
	{
		return pro.getProperty("FRSMS");
	}
	
	public String getFRValidSMS()
	{
		return pro.getProperty("FRValidSMS");
	}
	
	public String getFRSMSAssoc()
	{
		return pro.getProperty("FRSMSAssoc");
	}
	
	public String getFRSMSNotAssoc()
	{
		return pro.getProperty("FRSMSNotAssoc");
	}
	
	public String getFRSubUserSMS()
	{
		return pro.getProperty("FRSubUserSMS");
	}
	
	public String getFRPOIUserViewEditSubUserName()
	{
		return pro.getProperty("FRPOIUserViewEditSubUsername");
	}
			
	public String getFRPOIUserViewEditSubPassword()
	{
		return pro.getProperty("FRPOIUserViewEditSubPassword");
	}

	public String getFRPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("FRPOIUserViewOnlySubUsername");
	}
	
	public String getFRPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("FRPOIUserViewOnlySubPassword");
	}

	public String getFRPOIUserCantViewSubUserName()
	{
		return pro.getProperty("FRPOIUserCantViewSubUsername");
	}
	
	public String getFRPOIUserCantViewSubPassword()
	{
		return pro.getProperty("FRPOIUserCantViewSubPassword");
	}
	
	public String getFRReportName()
	{
		return pro.getProperty("FRReportName");
	}
	
	public String getFRSensorTypeOne()
	{
		return pro.getProperty("FRSensorTypeOne");
	}
	
		public String getFRSensorTypeTwo()
	{
		return pro.getProperty("FRSensorTypeTwo");
	}
	
	public String getFRDriverIDTag()
	{
		return pro.getProperty("FRDriverIDTag");
	}
	
	public String getFRToken()
	{
		return pro.getProperty("FRToken");
	}
	
	//FR Country Get Properties -->	
	
	//<-- AU Country Get Properties
	
	public String getAUDevURL()
	{
		String path = pro.getProperty("AUDev");

		return path;
	}
	
	public String getAUTestURL()
	{
		String path = pro.getProperty("AUTest");

		return path;
	}
	
	public String getAUProdURL()
	{
		String path = pro.getProperty("AUProd");

		return path;
	}
	
	public String getAUUserName()
	{
		return pro.getProperty("AUUsername");
	}
	
	public String getAUPassword()
	{
		return pro.getProperty("AUPassword");
	}
	
	public String getAUSubUserName()
	{
		return pro.getProperty("AUSubUsername");
	}
	
	public String getAUSubPassword()
	{
		return pro.getProperty("AUSubPassword");
	}
	
	public String getAUInvalidUserName()
	{
		return pro.getProperty("AUInvalidUsername");
	}
	
	public String getAUInvalidPassword()
	{
		return pro.getProperty("AUInvalidPassword");
	}
	
	public String getAUVehicle()
	{
		return pro.getProperty("AUVehicle");
	}
	
	public String getAUVehicleRegistration()
	{
		return pro.getProperty("AUVehicleRegistration");
	}

	public String getAUVehicleNoTrip()
	{
		return pro.getProperty("AUVehicleNoTrip");
	}
	
	public String getAUPlaceSearch()
	{
		return pro.getProperty("AUPlaceSearch");
	}
	
	public String getAULocationSearch()
	{
		return pro.getProperty("AULocationSearch");
	}
	
	public String getAUPOI()
	{
		return pro.getProperty("AUPOI");
	}
	
	public String getAUGeofences()
	{
		return pro.getProperty("AUGeofences");
	}
	
	public String getAUGPSFormatDegreesMinutesSeconds()
	{
		return pro.getProperty("AUGPSFormatDegreesMinutesSeconds");
	}
	
	public String getAUGPSFormatDecimalDegrees()
	{
		return pro.getProperty("AUGPSFormatDecimalDegrees");
	}
	
	public String getAUEmailAdd()
	{
		return pro.getProperty("AUEmailAdd");
	}
	
	public String getAUSubUserEmailAdd()
	{
		return pro.getProperty("AUSubUserEmailAdd");
	}

	public String getAUEmailAddAssoc()
	{
		return pro.getProperty("AUEmailAddAssoc");
	}
	
	public String getAUSMS()
	{
		return pro.getProperty("AUSMS");
	}
	
	public String getAUValidSMS()
	{
		return pro.getProperty("AUValidSMS");
	}
	
	public String getAUSMSAssoc()
	{
		return pro.getProperty("AUSMSAssoc");
	}
	
	public String getAUSMSNotAssoc()
	{
		return pro.getProperty("AUSMSNotAssoc");
	}
	
	public String getAUSubUserSMS()
	{
		return pro.getProperty("AUSubUserSMS");
	}
	
	public String getAUPOIUserViewEditSubUserName()
	{
		return pro.getProperty("AUPOIUserViewEditSubUsername");
	}
			
	public String getAUPOIUserViewEditSubPassword()
	{
		return pro.getProperty("AUPOIUserViewEditSubPassword");
	}

	public String getAUPOIUserViewOnlySubUserName()
	{
		return pro.getProperty("AUPOIUserViewOnlySubUsername");
	}
	
	public String getAUPOIUserViewOnlySubPassword()
	{
		return pro.getProperty("AUPOIUserViewOnlySubPassword");
	}

	public String getAUPOIUserCantViewSubUserName()
	{
		return pro.getProperty("AUPOIUserCantViewSubUsername");
	}
	
	public String getAUPOIUserCantViewSubPassword()
	{
		return pro.getProperty("AUPOIUserCantViewSubPassword");
	}
	
	public String getAUReportName()
	{
		return pro.getProperty("AUReportName");
	}
	
	public String getAUDriverIDTag()
	{
		return pro.getProperty("AUDriverIDTag");
	}
	
	public String getAUSensorTypeOne()
	{
		return pro.getProperty("AUSensorTypeOne");
	}
	
		public String getAUSensorTypeTwo()
	{
		return pro.getProperty("AUSensorTypeTwo");
	}
	
	public String getAUToken()
	{
		return pro.getProperty("AUToken");
	}
	
	//AU Country Get Properties -->	
	
	//<-- HINO ID Country Get Properties
	
	public String getHINOIDDevURL()
	{
		return pro.getProperty("HINOIDDev");
	}
	
	public String getHINOIDTestURL()
	{
		return pro.getProperty("HINOIDTest");
	}
	
	public String getHINOIDProdURL()
	{
		return pro.getProperty("HINOIDProd");
	}
	
	public String getHINOIDUserName()
	{
		return pro.getProperty("HINOIDUsername");
	}
	
	public String getHINOIDToken()
	{
		return pro.getProperty("HINOIDToken");
	}
	
	//HINO ID Country Get Properties -->	
	
	//<-- MAN KE Country Get Properties
	
	public String getMANKEDevURL()
	{
		return pro.getProperty("MANKEDev");
	}
	
	public String getMANKETestURL()
	{
		return pro.getProperty("MANKETest");
	}
	
	public String getMANKEProdURL()
	{
		return pro.getProperty("MANKEProd");
	}
	
	public String getMANKEUserName()
	{
		return pro.getProperty("MANKEUsername");
	}
	
	public String getMANKEToken()
	{
		return pro.getProperty("MANKEToken");
	}
	
	//MAN KE Country Get Properties -->	
	
	//<-- OWS AUTO ME Country Get Properties
	
	public String getOWSAUTOMEDevURL()
	{
		return pro.getProperty("OWSAUTOMEDev");
	}
	
	public String getOWSAUTOMETestURL()
	{
		return pro.getProperty("OWSAUTOMETest");
	}
	
	public String getOWSAUTOMEProdURL()
	{
		return pro.getProperty("OWSAUTOMEProd");
	}
	
	public String getOWSAUTOMEUserName()
	{
		return pro.getProperty("OWSAUTOMEUsername");
	}
	
	public String getOWSAUTOMEToken()
	{
		return pro.getProperty("OWSAUTOMEToken");
	}
	
	//OWS AUTO ME  Country Get Properties -->	
	
	//<-- NORWOOD NZ Country Get Properties
	
	public String getNORWOODNZDevURL()
	{
		return pro.getProperty("NORWOODNZDev");
	}
	
	public String getNORWOODNZTestURL()
	{
		return pro.getProperty("NORWOODNZTest");
	}
	
	public String getNORWOODNZProdURL()
	{
		return pro.getProperty("NORWOODNZProd");
	}
	
	public String getNORWOODNZUserName()
	{
		return pro.getProperty("NORWOODNZUsername");
	}
	
	public String getNORWOODNZToken()
	{
		return pro.getProperty("NORWOODNZToken");
	}
	
	//NORWOOD NZ  Country Get Properties -->
	
	//<-- ARVAL PL Country Get Properties
	
	public String getARVALPLDevURL()
	{
		return pro.getProperty("ARVALPLDev");
	}
	
	public String getARVALPLTestURL()
	{
		return pro.getProperty("ARVALPLTest");
	}
	
	public String getARVALPLProdURL()
	{
		return pro.getProperty("ARVALPLProd");
	}
	
	public String getARVALPLUserName()
	{
		return pro.getProperty("ARVALPLUsername");
	}
	
	public String getARVALPLToken()
	{
		return pro.getProperty("ARVALPLToken");
	}
	
	//ARVAL PL  Country Get Properties -->
	
	//<-- PANUS TH Country Get Properties
	
	public String getPANUSTHDevURL()
	{
		return pro.getProperty("PANUSTHDev");
	}
	
	public String getPANUSTHTestURL()
	{
		return pro.getProperty("PANUSTHTest");
	}
	
	public String getPANUSTHProdURL()
	{
		return pro.getProperty("PANUSTHProd");
	}
	
	public String getPANUSTHUserName()
	{
		return pro.getProperty("PANUSTHUsername");
	}
	
	public String getPANUSTHToken()
	{
		return pro.getProperty("PANUSTHToken");
	}
	
	//PANUS TH  Country Get Properties -->
	
	//<-- HINO ZA Country Get Properties
	
	public String getHINOZADevURL()
	{
		return pro.getProperty("HINOZADev");
	}
	
	public String getHINOZATestURL()
	{
		return pro.getProperty("HINOZATest");
	}
	
	public String getHINOZAProdURL()
	{
		return pro.getProperty("HINOZAProd");
	}
	
	public String getHINOZAUserName()
	{
		return pro.getProperty("HINOZAUsername");
	}
	
	public String getHINOZAToken()
	{
		return pro.getProperty("HINOZAToken");
	}
	
	//HINO ZA  Country Get Properties -->
	
	//<-- MAN ZA Country Get Properties
	
	public String getMANZADevURL()
	{
		return pro.getProperty("MANZADev");
	}
	
	public String getMANZATestURL()
	{
		return pro.getProperty("MANZATest");
	}
	
	public String getMANZAProdURL()
	{
		return pro.getProperty("MANZAProd");
	}
	
	public String getMANZAUserName()
	{
		return pro.getProperty("MANZAUsername");
	}
	
	public String getMANZAToken()
	{
		return pro.getProperty("MANZAToken");
	}
	
	//MAN ZA  Country Get Properties -->
	
	//<-- TELTRACK ZW Country Get Properties
	
	public String getTELTRACKZWDevURL()
	{
		return pro.getProperty("TELTRACKZWDev");
	}
	
	public String getTELTRACKZWTestURL()
	{
		return pro.getProperty("TELTRACKZWTest");
	}
	
	public String getTELTRACKZWProdURL()
	{
		return pro.getProperty("TELTRACKZWProd");
	}
	
	public String getTELTRACKZWUserName()
	{
		return pro.getProperty("TELTRACKZWUsername");
	}
	
	public String getTELTRACKZWToken()
	{
		return pro.getProperty("TELTRACKZWToken");
	}
	
	//TELTRACK ZW  Country Get Properties -->
	
	//<-- TOYOTA KE Country Get Properties
	
	public String getTOYOTAKEDevURL()
	{
		return pro.getProperty("TOYOTAKEDev");
	}
	
	public String getTOYOTAKETestURL()
	{
		return pro.getProperty("TOYOTAKETest");
	}
	
	public String getTOYOTAKEProdURL()
	{
		return pro.getProperty("TOYOTAKEProd");
	}
	
	public String getTOYOTAKEUserName()
	{
		return pro.getProperty("TOYOTAKEUsername");
	}
	
	public String getTOYOTAKEToken()
	{
		return pro.getProperty("TOYOTAKEToken");
	}
	
	//TOYOTA KE  Country Get Properties -->
	
	//<-- TOYOTA TZ Country Get Properties
	
	public String getTOYOTATZDevURL()
	{
		return pro.getProperty("TOYOTATZDev");
	}
	
	public String getTOYOTATZTestURL()
	{
		return pro.getProperty("TOYOTATZTest");
	}
	
	public String getTOYOTATZProdURL()
	{
		return pro.getProperty("TOYOTATZProd");
	}
	
	public String getTOYOTATZUserName()
	{
		return pro.getProperty("TOYOTATZUsername");
	}
	
	public String getTOYOTATZToken()
	{
		return pro.getProperty("TOYOTATZToken");
	}
	
	//TOYOTA TZ  Country Get Properties -->
	
	//<-- TOYOTA MW Country Get Properties
	
	public String getTOYOTAMWDevURL()
	{
		return pro.getProperty("TOYOTAMWDev");
	}
	
	public String getTOYOTAMWTestURL()
	{
		return pro.getProperty("TOYOTAMWTest");
	}
	
	public String getTOYOTAMWProdURL()
	{
		return pro.getProperty("TOYOTAMWProd");
	}
	
	public String getTOYOTAMWUserName()
	{
		return pro.getProperty("TOYOTAMWUsername");
	}
	
	public String getTOYOTAMWToken()
	{
		return pro.getProperty("TOYOTAMWToken");
	}
	
	//TOYOTA MW  Country Get Properties -->
	
}
