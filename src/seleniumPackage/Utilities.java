package seleniumPackage;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void openBrowser(String browser, String url) {

		if (browser == "chrome") {
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("--start-maximized"); // for windows
			// options.addArguments("--kiosk"); // for mac
			options.addArguments("--disable-notifications");

			System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 5);
		} else if (browser == "firefox") {
			System.setProperty("webdriver.gecko.driver", "/Users/codegator/Desktop/selenium/geckodriver");
			// Create an object of Firefox profile
			FirefoxProfile profile = new FirefoxProfile();
			// set the directory where you want to store the file
			profile.setPreference("browser.download.dir", "/Users/codegator/eclipse-workspace/Batch04/dummy files");
			// specify that you are storing the file to a custom directory
			profile.setPreference("browser.download.folderList", 2);
			// disable pop up for excel
			profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
					"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

			FirefoxOptions options = new FirefoxOptions();
			options.setProfile(profile);
			driver = new FirefoxDriver(options);
		} else {
			System.out.println("Please enter a valid driver for example : chrome or firefox");
		}
		driver.get(url);
	}

	public static void takeScreen(String screenshotName) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File srcFile = ts.getScreenshotAs(OutputType.FILE); // it will store the screenshot in the memory
		File destFile = new File("/Users/codegator/eclipse-workspace/Batch04/screenshot/" + screenshotName + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}

	public static void lookUp(String locator, String searchTerm) throws InterruptedException {
		String parentWindow = driver.getWindowHandle(); // 1 window
		driver.findElement(By.id(locator)).click();
		Set<String> multipleWindows = driver.getWindowHandles(); // 2 windows

		for (String childWindow : multipleWindows) {
			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);

				driver.switchTo().frame(0);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='pBody']/input[@id='lksrch']")).sendKeys(searchTerm);
				driver.findElement(By.xpath("//div[@class='pBody']/input[@name='go']")).click();
				driver.switchTo().defaultContent();
				driver.switchTo().frame("resultsFrame");
				List<WebElement> accountName = driver.findElements(By.xpath("//th[@scope='row']/a"));

				for (WebElement account : accountName) {
					String acc = account.getText();
					if (acc.equalsIgnoreCase(searchTerm)) {
						account.click();
						break;
					}
				}

			}
		}
		driver.switchTo().window(parentWindow);
	}

	public static void verifyLinks() throws IOException {
		// capture all the link from the site
		List<WebElement> allTheLinks = driver.findElements(By.tagName("a"));
		for (WebElement eachLink : allTheLinks) {
			String linkUrl = eachLink.getAttribute("href");
			if (linkUrl != null) {
				URL obj = new URL(linkUrl);
				HttpURLConnection conn = ((HttpURLConnection) obj.openConnection());
				int responseCode = conn.getResponseCode();
				if (responseCode != 200) {
					System.out.println("InValid Link " + linkUrl);
				}

			}

		}
	}
}
