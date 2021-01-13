package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day12_JS extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		openBrowser("chrome", "https://www.mwaa.com/about/about-authority");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)"); // pixels
		
		String text2 =	js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("+++++"+text2);
		
		if(text2.contains("Five")) {
			System.out.println("Text is present");
		}
		
		driver.findElement(By.partialLinkText("Privacy Policy")).click();
		
		WebElement contactUs = driver.findElement(By.linkText("Contact Us"));
		js.executeScript("arguments[0].scrollIntoView(true);",contactUs);
		
		js.executeScript("arguments[0].click();", contactUs);
	
	}

}
