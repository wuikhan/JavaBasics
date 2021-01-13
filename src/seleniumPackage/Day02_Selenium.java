package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://codegator.herokuapp.com/index.php");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		// find total number of div tags on the same

		int divTag = driver.findElements(By.tagName("div")).size();
		System.out.println(divTag);
		// Click on the "Input Fields" in the menu and print the total number of "input"
		// tags
		WebElement inputField = driver.findElement(By.id("inputField"));
		inputField.click();

		List<WebElement> allInputTags = driver.findElements(By.tagName("input"));
		System.out.println(allInputTags.size());

		// Click on the "Tables" link in the menu and print the total number of "th"
		// tags
		driver.findElement(By.linkText("Tables")).click();
		System.out.println(driver.findElements(By.tagName("th")).size());
		// Click on the "Form" link in the menu and print the total number of "input"
		// tags
		driver.findElement(By.className("formLink")).click();
		
		List<WebElement> inputTags = driver.findElements(By.tagName("input"));
		System.out.println(inputTags.size());
	//	driver.findElement(By.linkText("Alerts")).click();
		
		// contains method
		//driver.findElement(By.xpath("//a[contains(@href,'alert')]")).click();
		
		// starts-with method/function
		driver.findElement(By.xpath("//a[starts-with(@href,'alert')]")).click();
		
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
	}

}
