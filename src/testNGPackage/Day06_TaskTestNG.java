package testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day06_TaskTestNG {
	 WebDriver driver;

		@Parameters({"browser","url","username","password"})
	@BeforeTest
	public void testDrupal(String browser, String url, String ursername, String password) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
			 driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			} else {
				System.setProperty("webdriver.gecko.driver", "/Users/codegator/Desktop/selenium/geckodriver");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.findElement(By.id("username")).sendKeys(ursername);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("Login")).click();
			}	

		@Test(dataProvider="getValues")
		public void createAccount(String accountName, String accountNumber) {
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.name("new")).click();
			driver.findElement(By.id("acc2")).sendKeys(accountName);
			driver.findElement(By.id("")).sendKeys(accountNumber);

		}
		
		@DataProvider
		public Object[][] getValues(){
			Object[][] setData = new Object[1][1];
			setData[0][0] = "Waqas";
			setData[0][1] = "10000";
			return setData;
		}
	
	}
