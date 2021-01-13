package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day15_SFLightning extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		openBrowser("chrome","http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("test.user@gmail.com.test");
		driver.findElement(By.id("password")).sendKeys("Pa55word");
		driver.findElement(By.id("Login")).click();

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).click().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Opportunities']"))).click().perform();
		

	}

}
