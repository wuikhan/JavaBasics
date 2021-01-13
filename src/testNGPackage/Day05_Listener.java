package testNGPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Day05_Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart method : "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess method : "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure method : "+result.getName());
		TakesScreenshot ts = ((TakesScreenshot) Day04_Parameters.driver);
		File srcFile = ts.getScreenshotAs(OutputType.FILE); // it will store the screenshot in the memory
		File destFile = new File("/Users/codegator/eclipse-workspace/Batch04/screenshot/" + result.getName() + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped method : "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage method : "+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout method : "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method : "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method : "+context.getName());
	}

}
