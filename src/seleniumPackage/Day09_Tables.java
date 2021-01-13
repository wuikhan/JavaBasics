package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day09_Tables extends Utilities {

	public static void main(String[] args) {
		openBrowser("chrome", "http://codegator.herokuapp.com/tables.php");

		// number of columns

		List<WebElement> col = driver.findElements(By.xpath("//th[@scope='col']"));

		// number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));

		// number of cells
		List<WebElement> cells = driver.findElements(By.xpath("//tbody/tr/td"));

		System.out.println(col.size());
		System.out.println(rows.size());
		System.out.println(cells.size());

		for (int i = 1; i <= rows.size(); i++) { // 3
			for (int j = 1; j < col.size(); j++) { // 3
				// System.out.println(driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText());
				WebElement cellValue = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]"));
				String text = cellValue.getText();
				System.out.println(text);
				if (text.equalsIgnoreCase("Otto")) {
					driver.findElement(By.linkText("Otto")).click();
					break;
				}
			}
			break;
		}

	}
}
