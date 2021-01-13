package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day09_Task2 extends Utilities {

	public static void main(String[] args) {
		openBrowser("chrome", "https://money.rediff.com/gainers/bse/daily/groupa");

		List<WebElement> cells = driver.findElements(By.xpath("//tbody/tr/td"));
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		List<WebElement> col = driver.findElements(By.xpath("//thead/tr/th"));
		

		for(int i=1;i<=rows.size();i++) {
			for(int j=1;j<col.size();j++) {
				WebElement cellValue = driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]"));
				String text = cellValue.getText();
//				System.out.println(text);
				if(text.equalsIgnoreCase("Crisil")) {
					cellValue.click();
					
				}
			}
		}
	}
}
