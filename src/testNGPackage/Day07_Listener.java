package testNGPackage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import seleniumPackage.Utilities;

public class Day07_Listener implements ITestListener {
WebDriver driver ;


	public void onTestSuccess(ITestResult result) {
		Object currentInstance = result.getInstance();
		  driver = Day07_TaskTestNG.class.cast(currentInstance).driver;
		  driver.findElement(By.linkText("Accounts")).click();
	  driver.findElement(By.name("go")).click();

	  String accountName = Day07_TaskTestNG.class.cast(currentInstance).accountName;
	  System.out.println("Account Name "+accountName);
	    List<WebElement> accName = driver.findElements(By.cssSelector("div[id$='_Name'] > a > span"));
	    for (WebElement account : accName) {
	      String name = account.getText();
	      System.out.println(name);
	      if (name.equalsIgnoreCase(accountName)) {
	        account.click();
	        break;
	      }
	   
	    }
	    driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='delete']")).click();
	    driver.switchTo().alert().accept();
	  }

public void onTestFailure(ITestResult result) {
	TakesScreenshot ts = ((TakesScreenshot) Utilities.driver);
	File srcFile = ts.getScreenshotAs(OutputType.FILE); // it will store the screenshot in the memory
	File destFile = new File("/Users/codegator/eclipse-workspace/Batch04/screenshot/" + result.getName() + ".png");
	try {
		FileUtils.copyFile(srcFile, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
