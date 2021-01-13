package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Day07_Alerts extends Utilities {

	public static void main(String[] args) {
		openBrowser("chrome", "http://codegator.herokuapp.com/alert.php");
		driver.findElement(By.id("simpleBtn")).click();
		Alert alertBox = driver.switchTo().alert();
	
		System.out.println(alertBox.getText());
		alertBox.accept();
		
	driver.findElement(By.id("confirmBtn")).click();
	System.out.println(alertBox.getText());
	alertBox.dismiss();
	
	driver.findElement(By.id("promptBtn")).click();
	String name = "Waqas";
	alertBox.sendKeys(name);
	alertBox.dismiss();
	
	String expectedText = driver.findElement(By.id("demo")).getText();
	String actualText = "Hello "+name+"! How are you today?";
	
	if(actualText.equals(expectedText)) {
		System.out.println("Both are same");
	} else {
		System.out.println("Both are not same");
	}
	
	
	driver.findElement(By.id("promptBtn")).click();
	alertBox.sendKeys("Harry");
	alertBox.dismiss();
	}

}
