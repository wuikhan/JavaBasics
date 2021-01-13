package seleniumPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class Day11_Task_Contacts extends Utilities {

	public static void main(String[] args) throws InterruptedException, IOException {
		openBrowser("chrome", "https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("test.user@gmail.com.test");
		driver.findElement(By.id("password")).sendKeys("Pa55word");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.name("new")).click();
		driver.findElement(By.id("name_lastcon2")).sendKeys("Khan");
		
		// method which accepts 2 arguments xpath and search term
		lookUp("//a[@id='con4_lkwgt']//img[@class='lookupIcon']","Waqas' Account");
		
		lookUp("//a[@id='con8_lkwgt']//img[@class='lookupIcon']","Khan");
		
			
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[@value=' Save ']")).click();
		verifyLinks();
	}

}
