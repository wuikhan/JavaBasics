package seleniumPackage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Day07_ExplicitWait extends Utilities {

	public static void main(String[] args) {
		openBrowser("chrome","https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.name("firstname")).sendKeys("Waqas");
		driver.findElement(By.name("lastname")).sendKeys("Khan");
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		WebElement dDown = driver.findElement(By.name("preferred_pronoun"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("preferred_pronoun")));
		
		Select value = new Select(dDown);
		value.selectByIndex(2);
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Hello");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@aria-label='Page 3']")).click();
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.partialLinkText("Adele – Hello Lyrics | Genius Lyrics"));
		     }
		   });
		
		foo.click();
		
		System.out.println(driver.getCurrentUrl());
	}

}
