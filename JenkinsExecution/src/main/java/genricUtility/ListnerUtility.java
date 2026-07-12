package genricUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import businessUtility.BaseClass;

public class ListnerUtility implements ISuiteListener,ITestListener {
	
	ExtentReports reports;
	ExtentTest report;

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onSuccess");
		report.log(Status.PASS, "test case PASS"+result.getName() );//on test success
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
	  	TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().toString().replace(":", "_");
		File dest= new File("./ScreenShot/img"+ time+ ".png");
		
	
		
	 
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	// to Attacth screen shot to the report.
		String temp1 =ts.getScreenshotAs(OutputType.BASE64);
		report.addScreenCaptureFromBase64String(temp1,result.getName()+time+".png");
		report.log(Status.FAIL, "test case FAIL"+result.getName()); // on test fails
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		report.log(Status.SKIP, "test case SKIPPED"+result.getName()); //on test skipped 
	}

	@Override
	public void onStart(ISuite suite) {
		
		Reporter.log("on start");
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/testreport.html");//on start
		//starting the report
		reports = new ExtentReports();//onStart
		//write the report into report file 
		reports.attachReporter(spark);//onstart
		//generating the report
		report = reports.createTest("sample Report");//on start 
		
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("onFinish");
		reports.flush(); //on finish
		
		
		
		
	}
	

}
