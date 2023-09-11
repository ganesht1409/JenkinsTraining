package com.jenkins.Jenkins;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

public class ExtentReport {
	static ExtentTest test;
	static ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	
	@BeforeClass
	public void startReport()
	{
		//craeting html ,extent objects
		htmlReporter =new ExtentHtmlReporter("C:\\Users\\gtambe\\Documents\\Report.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//add content ,manage tests etc
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Simple Automation Report");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
  @Test
  public void TestCase_1() {
	  test=extent.createTest("Test Case 1","The Test Case One Has passed");
	  Assert.assertTrue(true);
  }
  @Test
  public void TestCase_2() {
	  test=extent.createTest("Test Case 2","The Test Case Two Has passed");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void TestCase_3() {
	  test=extent.createTest("Test Case 3","The Test Case Three Has Failed");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void TestCase_4() {
	  test=extent.createTest("Test Case 4","The Test Case Four Has passed");
	  throw new SkipException("The Test has Been Skipped");
  }
  
  @AfterMethod
  public void getResult(ITestResult result)
  {
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  test.log(Status.FAIL, result.getThrowable());
	  }
	  else if(result.getStatus()==ITestResult.SUCCESS)
	  {
		  test.log(Status.PASS, result.getTestName());
	  }
	  else
	  {
		  test.log(Status.SKIP, result.getTestName());
	  }
  }
  
  @AfterTest
  public void tearDown()
  {
	  extent.flush();
  }
}
