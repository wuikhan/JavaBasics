package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Task extends Utilities {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("http://qa.ibextechnologies.us/dealership/user");
		
		openBrowser("firefox", "http://qa.ibextechnologies.us/dealership/user");
		

		driver.findElement(By.id("edit-name")).sendKeys("admin");
		driver.findElement(By.id("edit-pass")).sendKeys("admin");
		driver.findElement(By.id("edit-submit")).click();

		driver.findElement(By.linkText("Content")).click();

		driver.findElement(By.linkText("Add content")).click();

		driver.findElement(By.linkText("Car")).click();

		driver.findElement(By.id("edit-title")).sendKeys("BMW");
		driver.findElement(By.id("edit-field-stock-und-0-value")).sendKeys("1234567");
		driver.findElement(By.id("edit-field-mileage-und-0-value")).sendKeys("10000");
		driver.findElement(By.id("edit-field-vin2-und-0-value")).sendKeys("5544df11223344");
		driver.findElement(By.id("edit-field-type-und-new-car")).click();
		driver.findElement(By.id("edit-field-car-price-und-0-value")).sendKeys("500000");
		// driver1.findElement(By.id("edit-submit")).click();
		
		WebElement fileUpload = driver.findElement(By.id("edit-field-images-und-0-upload"));
		
		fileUpload.sendKeys("/Users/codegator/eclipse-workspace/Batch04/testData/car.png");
		
		Thread.sleep(3000);
		WebElement brochure = driver.findElement(By.xpath("//input[@id='edit-field-brochure-und-0-upload']"));
		brochure.sendKeys("/Users/codegator/eclipse-workspace/Batch04/testData/Test case.xlsx");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'edit-submit')]")).click();
		/*
		WebElement pdf = driver.findElement(By.linkText("Locators.pdf"));

		String pdfValue = pdf.getAttribute("type");
		System.out.println(pdfValue);
		
		if(pdfValue.contains("application/pdf")) {
			System.out.println("This is a pdf");
		}
		*/
		
		driver.findElement(By.linkText("Test case.xlsx")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The record url is : " + currentUrl);

		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);

		System.out.println("The car is successfully created");

	}

}
