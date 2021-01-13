package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://codegator.herokuapp.com/index.php");
		driver.findElement(By.cssSelector("a[id='alertLink']")).click();
		// when using cssSelector we use tagName + # symbol + id value
		driver.findElement(By.cssSelector("a#iframe")).click();
		driver.findElement(By.cssSelector("a[class='py-2 d-none d-md-inline-block multipleLink']")).click();
		driver.findElement(By.cssSelector("a.py-2.d-none.d-md-inline-block.inputField")).click();
		driver.findElement(By.cssSelector("a[id^='table']")).click(); // ^ symbol searches using starting value
		driver.findElement(By.cssSelector("a[id$='Link']")).click();
		driver.findElement(By.cssSelector("a[id*='down']")).click();
		driver.navigate().to("http://codegator.herokuapp.com/MultipleWindows.php");
		driver.findElement(By.partialLinkText("facebook")).click();
		Thread.sleep(5000);
		// driver.close(); // it closes the window which is controlling
		driver.quit(); // it will quit the browser

//		driver.navigate().back(); // back to herokuapp
//		driver.navigate().forward(); // it will go to qa site
//		
//		driver.navigate().refresh();

	}
}
