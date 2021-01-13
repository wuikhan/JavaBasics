package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_Selenium extends Utilities {

	public static void main(String[] args) throws Exception {
		
		openBrowser("chrome", "http://codegator.herokuapp.com/form.php");

		WebElement fName = driver.findElement(By.id("validationCustom01"));
		fName.clear();
		String myName = "Waqas";
		fName.sendKeys(myName);
		System.out.println(fName.isDisplayed());
		
		driver.navigate().to("http://codegator.herokuapp.com/alert.php");
		
		boolean disableButton = driver.findElement(By.cssSelector("button.btn.btn-lg.btn-primary")).isEnabled();
		System.out.println(disableButton); // false
		
		if(disableButton) {
			System.out.println("The button is enabled");
		} else {
			System.out.println("The button id disabled");
		}
		
		driver.navigate().to("http://codegator.herokuapp.com/input_fields.php");
		
		boolean RadioButton = driver.findElement(By.id("exampleRadios1")).isSelected(); //male
		System.out.println(RadioButton);
		if(RadioButton) {
			System.out.println("Male Radio button is selected");
		} else {
			throw new Exception("Female Radio button is Selected");
		}
		
		
		/*
		 * First check "I have a bike" checkbox is selected , if it is selected print "The checkbox is checked"
		 * If it is not selected then click the checkbox
		 */
		boolean isSelected = driver.findElement(By.name("vehicle1")).isSelected(); //false
		if(isSelected) {
			System.out.println("The checkbox is selected");
		} else {
			driver.findElement(By.name("vehicle1")).click();
		}
		
		String text = driver.findElement(By.xpath("//label[@for='basic-url']")).getText();
		System.out.println(text);
		
		WebElement checkBox2 = driver.findElement(By.name("vehicle2"));
		String val = 	checkBox2.getAttribute("value");
		System.out.println("The attribute value is : "+val);
		
		
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']")); // 3
		System.out.println(allCheckboxes.size());
		
		for(int i=0;i<allCheckboxes.size();i++) {
			allCheckboxes.get(i).click(); // 0
		}
	}
}
