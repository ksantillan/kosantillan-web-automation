package actionModule;

import java.io.IOException;
import java.util.Dictionary;
import pageObject.SignUpPage;
import pageObject.WelcomePage;
import pageObject.ForgotPasswordPage;
import pageObject.LoginPage;
import utility.DoThis;

public class SignUp{	
	
	public static void WelcomePage() throws IOException, Exception{
		
		DoThis.click(WelcomePage.btnSignUp, "Y");
	
	}
	
	public static void GoBack() throws IOException, Exception{
		
		DoThis.click(SignUpPage.lnkBack, "Y");
	
	}
	
	public static void LoginPage() throws IOException, Exception{
		
		DoThis.click(WelcomePage.btnLogIn, "Y");
		DoThis.click(LoginPage.lnkSignUp, "Y");
	
	}
	
	public static void ForgotPassword() throws IOException, Exception{
		
		DoThis.click(LoginPage.lnkForgotPassword, "Y");
		DoThis.click(ForgotPasswordPage.lnkSignUp, "Y");
	
	}
	
	public static void WithDetails(String browser, @SuppressWarnings("rawtypes") Dictionary signUpDetails) throws IOException, Exception{
		
		DoThis.click(WelcomePage.btnSignUp, "Y");
		
		switch(signUpDetails.get("signup_type").toString()){
		case "Personal":
			DoThis.click(SignUpPage.rdbtnPersonal, "Y");
			
			DoThis.clear(browser, SignUpPage.txtbxName, "N");
			DoThis.sendkeys(SignUpPage.txtbxName, signUpDetails.get("signup_personal_name").toString(), "Y");
			
			DoThis.clear(browser, SignUpPage.txtbxEmail, "N");
			DoThis.sendkeys(SignUpPage.txtbxEmail, signUpDetails.get("signup_email").toString(), "Y");
			
			DoThis.clear(browser, SignUpPage.txtbxPhone, "N");
			DoThis.sendkeys(SignUpPage.txtbxPhone, signUpDetails.get("signup_phone").toString(), "Y");
			
			if(signUpDetails.get("signup_own_car").toString()=="true") {
				if(!DoThis.getCheckedStatus(SignUpPage.objOwnCar).contains("true")) {
					DoThis.click(SignUpPage.chkbxOwnCar, "Y");
				}			
			}else {
				if(DoThis.getCheckedStatus(SignUpPage.objOwnCar).contains("true")) {
					DoThis.click(SignUpPage.chkbxOwnCar, "Y");
				}	
			}
			
			//Select How did you hear about us?
			DoThis.click(SignUpPage.cmbbxAboutUs, "Y");
			switch(signUpDetails.get("signup_about_us").toString()){
			
			case "Facebook":
			DoThis.click(SignUpPage.drpdwnFacebook, "Y");break;
			
			case "Family": 
			case "Friend":
			DoThis.click(SignUpPage.drpdwnFamilyFriend, "Y");break;
			
			case "Google":
			DoThis.click(SignUpPage.drpdwnGoogle, "Y");break;
			
			}
			
			DoThis.click(SignUpPage.btnSignUp, "Y");
			break;
			
		case "Business":
			DoThis.click(SignUpPage.rdbtnBusiness, "Y");
			
			DoThis.clear(browser, SignUpPage.txtbxName, "N");
			DoThis.sendkeys(SignUpPage.txtbxName, signUpDetails.get("signup_business_name").toString(), "Y");
			
			DoThis.clear(browser, SignUpPage.txtbxCompanyName, "N");
			DoThis.sendkeys(SignUpPage.txtbxCompanyName, signUpDetails.get("signup_company_name").toString(), "Y");
			
			DoThis.clear(browser, SignUpPage.txtbxEmail, "N");
			DoThis.sendkeys(SignUpPage.txtbxEmail, signUpDetails.get("signup_email").toString(), "Y");
			
			DoThis.click(SignUpPage.cmbbxCountry, "Y");
			DoThis.sendkeys(SignUpPage.cmbbxCountry, signUpDetails.get("signup_country").toString(), "Y");
			DoThis.click(SignUpPage.slcFirstCountry, "Y");
			
			DoThis.clear(browser, SignUpPage.txtbxPhone, "N");
			DoThis.sendkeys(SignUpPage.txtbxPhone, signUpDetails.get("signup_phone").toString(), "Y");
		
			DoThis.clear(browser, SignUpPage.txtbxNumberVehicles, "N");
			DoThis.sendkeys(SignUpPage.txtbxNumberVehicles, signUpDetails.get("signup_number_of_vehicles").toString(), "Y");
			
			//Select How did you hear about us?
			DoThis.click(SignUpPage.cmbbxAboutUs, "Y");
			switch(signUpDetails.get("signup_about_us").toString()){
			
			case "Facebook":
			DoThis.click(SignUpPage.drpdwnFacebook, "Y");break;
			
			case "Family": 
			case "Friend":
			DoThis.click(SignUpPage.drpdwnFamilyFriend, "Y");break;
			
			case "Google":
			DoThis.click(SignUpPage.drpdwnGoogle, "Y");break;
			
			}
			
			DoThis.click(SignUpPage.btnSignUp, "Y");
			break;
		}
		
		
	
	}

}
