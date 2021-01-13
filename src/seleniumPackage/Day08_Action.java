package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Day08_Action extends Utilities {

	public static void main(String[] args) {
		openBrowser("chrome","https://www.flydulles.com/iad/dulles-international-airport");
		WebElement parkingLink = driver.findElement(By.partialLinkText("Parking"));
		
		Actions action = new Actions(driver);
		action.moveToElement(parkingLink).perform();
		action.moveToElement(driver.findElement(By.linkText("Rental Cars"))).click().perform();
		
		action.contextClick(driver.findElement(By.partialLinkText("Shopping"))).click().perform();
		
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement firstBox = driver.findElement(By.id("draggable"));
		WebElement secondBox = driver.findElement(By.id("droppable"));
		
//		action.clickAndHold(firstBox).perform();
//		action.moveToElement(secondBox).perform();
//		action.release(firstBox).perform();
		
//		driver.navigate().to("https://demoqa.com/droppable");
		action.dragAndDrop(firstBox, secondBox).perform();
		

	}

}
