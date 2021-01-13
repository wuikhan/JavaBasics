package seleniumPackage;

import java.util.Set;

import org.openqa.selenium.By;

public class Day08_iFrames extends Utilities {

	public static void main(String[] args) {
	openBrowser("chrome", "http://codegator.herokuapp.com/iframe.php");
	//driver.switchTo().frame("frame1");
	driver.switchTo().frame(0);
	
	driver.findElement(By.id("username")).sendKeys("codegator");
	driver.findElement(By.xpath("//input[@placeholder=\"Recipient's username\"]")).sendKeys("recipients email");
	
	driver.switchTo().defaultContent();
	
	//driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	driver.findElement(By.id("username")).sendKeys("codegator");
	
	driver.navigate().to("http://codegator.herokuapp.com/MultipleWindows.php");
	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
	driver.findElement(By.linkText("facebook page")).click();
	
	
	Set<String> childWindows = driver.getWindowHandles();
	System.out.println(childWindows.size());
	
	for(String window : childWindows) {
		if(!parentWindow.equals(window)) {
			driver.switchTo().window(window);
			System.out.println(driver.getCurrentUrl());
		}
	}
	
	driver.switchTo().window(parentWindow);
	driver.findElement(By.id("inputField")).click();
	}

}
