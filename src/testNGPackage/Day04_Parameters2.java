package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//Drupal
public class Day04_Parameters2 {
	 WebDriver driver;

	@Parameters({"browser","url","username","password"})
	@Test
	public void testDrupal(String browser, String url, String ursername, String password) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
			 driver = new ChromeDriver();
			} else {
				System.setProperty("webdriver.gecko.driver", "/Users/codegator/Desktop/selenium/geckodriver");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.findElement(By.id("edit-name")).sendKeys(ursername);
			driver.findElement(By.id("edit-pass")).sendKeys(password);
			driver.findElement(By.id("edit-submit")).click();
			}	
	}


