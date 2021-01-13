package testNGPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumPackage.Utilities;

public class Day03_Task extends Utilities {
	
	
	@BeforeMethod
	public void setUp() {
		openBrowser("chrome", "https://login.salesforce.com");
	}
	
	@Test(groups="regression")
	public void test() {
		System.out.println("This is a test method");
	}
	
	@Test(dependsOnGroups= {"regression"},description="This method test the login functionality")
	public void verifyLogin() {
		driver.findElement(By.id("username")).sendKeys("test.user@gmail.com.test");
		driver.findElement(By.id("password")).sendKeys("Pa55word");
		driver.findElement(By.id("Login")).click();
	}
	
	@Test(dependsOnMethods= {"verifyLogin","test"})
	public void verifyLogout() {
		// code here to test log out
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test(dependsOnMethods= {"verifyLogin"})
	public void createAccount() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("test.user@gmail.com.test");
		driver.findElement(By.id("password")).sendKeys("Pa55word");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.name("new")).click();
		driver.findElement(By.id("acc2")).sendKeys("Waqas' Account"); // Account Name

		lookUp("//a[@id='acc3_lkwgt']//img[@class='lookupIcon']","Waqas' Account");
		
		WebElement typeElement = driver.findElement(By.id("acc6"));
		Select typeSelect = new Select(typeElement);
		typeSelect.selectByVisibleText("Prospect");

		// Start of SLA Expiration Date
		driver.findElement(By.id("00N2E00000D7LP2")).click();
		WebElement month = driver.findElement(By.id("calMonthPicker"));
		Select monthSelect = new Select(month);
		monthSelect.selectByVisibleText("September");

		WebElement year = driver.findElement(By.id("calYearPicker"));
		Select yearSelect = new Select(year);
		yearSelect.selectByValue("2019");

		List<WebElement> values = driver
				.findElements(By.xpath("//table[@class='calDays']/tbody/tr[@class='calRow']/td"));
		for (WebElement cellValue : values) {
			String date = cellValue.getText();
			if (date.contains("17")) {
				cellValue.click();

				break;
			}
		}
		// End of SLA Expiration Date
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[@value=' Save ']")).click();



	}

}
