package utility;

import java.util.HashMap;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+ " started!");
		Constant.error = false;
		if(Constant.group) {Constant.TestCasename= Constant.TestNGparam.get("reportname").toString();}
		Constant.Path_Report = System.getProperty("user.dir") + "/Report"+ "/TestResult_"+Constant.TestCasename+ "/";
/*		try {
			Datatable.setExcelFile(Constant.Path_TestData + Constant.TestCasename +".xlsx", "Sheet1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+ " passed!!");
		

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		System.out.println(result.getMethod().getMethodName()+ " failed!");
		Reporter.ReportEventCustomStatus(result.getThrowable().toString(), "fail", "Y");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	    //System.out.println("Number of Test Methods: " + context.get
	   if(context.getSuite().getAllMethods().size()>1) {
		   Constant.group = true;
		   Constant.TestNGparam = new HashMap<String, String>(context.getCurrentXmlTest().getAllParameters());
		   Constant.TestCasename= Constant.TestNGparam.get("reportname").toString();
		   System.out.println(Constant.TestCasename);
	   }
		
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//Constant.extent.flush();
		//if(Constant.error) {assertTrue(false);}
		Constant.extent.flush();
		System.out.println("Code Execution End!");
	}
	


}
