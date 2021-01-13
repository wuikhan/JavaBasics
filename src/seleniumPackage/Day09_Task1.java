package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day09_Task1 extends Utilities {

	public static void main(String[] args) {
		openBrowser("chrome", "https://money.rediff.com/gainers/bse/daily/groupa");

		List<WebElement> companies = driver.findElements(By.xpath("//tbody/tr/td/a"));

		System.out.println(companies.size());
		for (WebElement eachCompany : companies) {
			System.out.println(eachCompany.getText());
			String text = eachCompany.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("Natco Pharma")) {
				eachCompany.click();
				String val = driver.findElement(By.id("ltpid")).getText();
				System.out.println(val);
				break;
			}
		}
	}
}
