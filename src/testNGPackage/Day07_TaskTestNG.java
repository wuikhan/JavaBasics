package testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import seleniumPackage.Utilities;

public class Day07_TaskTestNG extends Utilities {
String accountName;

	@Parameters({ "browser", "url", "username", "password" })
	@BeforeMethod
	public void openBrowser(String browser, String url, String username, String password) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/codegator/Desktop/selenium/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		} else {
			System.out.println("Please enter a valid browser name.");
		}
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}

	@Test(dataProvider = "getValues")
	public void createAccount(String accountName, String rating, String accountNumber, String phone, String website,

		String parentAccount) throws InterruptedException {
		this.accountName=accountName;
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.name("new")).click();
		driver.findElement(By.id("acc2")).sendKeys(accountName);
		WebElement selectRating = driver.findElement(By.id("acc9"));
		Select ratingSel = new Select(selectRating);
		ratingSel.selectByValue(rating);
		driver.findElement(By.id("acc5")).sendKeys(accountNumber);
		driver.findElement(By.id("acc10")).sendKeys(phone);
		driver.findElement(By.id("acc12")).sendKeys(website);

		lookUp("//a[@id='acc3_lkwgt']", parentAccount);
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")).click();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@DataProvider
	public Object[][] getValues() {
		Object[][] setData = new Object[2][6];
		setData[0][0] = "Waqas222"; // acount name
		setData[0][1] = "Cold"; // rating
		setData[0][2] = "12345"; // account number
		setData[0][3] = "703-626-0000"; // Phone
		setData[0][4] = "https://codegator.us"; // website
		setData[0][5] = "Waqas' Account"; // parentAccount
		
		setData[1][0] = "Waqas333"; // acount name
		setData[1][1] = "Hot"; // rating
		setData[1][2] = "54321"; // account number
		setData[1][3] = "703-626-1234"; // Phone
		setData[1][4] = "https://google.com"; // website
		setData[1][5] = "Waqas' Account"; // parentAccount
		
		return setData;

	}

}
