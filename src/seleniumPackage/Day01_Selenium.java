package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://codegator.herokuapp.com/index.php");
		// ID
		driver.findElement(By.id("alertLink")).click();
		// Use ID to click all the links in the menu
		driver.findElement(By.id("iframe")).click();
		driver.findElement(By.id("multipleWindow")).click();
		driver.findElement(By.id("inputField")).click();
		driver.findElement(By.id("tablesLink")).click();
		driver.findElement(By.id("dropdownLink")).click();
		driver.findElement(By.id("formLink")).click();
		
		driver.findElement(By.id("validationCustom03")).sendKeys("Alexandria");
		// ClassName
		driver.findElement(By.className("btn-primary")).click();
		Thread.sleep(5000);
		
		//Name
		driver.findElement(By.id("inputField")).click();
		driver.findElement(By.name("vehicle1")).click();
		
		//LinkText
		driver.findElement(By.linkText("Practice Multiple Windows")).click();
		
		//partialLinkText
		driver.findElement(By.partialLinkText("facebook")).click();
		
		//driver.quit();
	}

}
