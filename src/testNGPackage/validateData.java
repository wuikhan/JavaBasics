package testNGPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class validateData {

	public static void main(String[] args) throws IOException {
		Object[][] excelSh;
		Object[][] val;

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/data/chromedriver2");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("wuikhan@gmail.com.batchfour");
		driver.findElement(By.id("password")).sendKeys("pakistan1");
		driver.findElement(By.name("Login")).click();

		Actions a = new Actions(driver);
		driver.findElement(By.linkText("Accounts")).click();
		// a.moveToElement(driver.findElement(By.linkText("Accounts"))).click().perform();
		driver.findElement(By.name("go")).click();

		List<WebElement> records = driver.findElements(By.xpath("//table//tbody//tr//th"));
		int recSize = records.size();

		List<WebElement> cellValues = driver
				.findElements(By.xpath("//table[@class='x-grid3-row-table']//tbody//tr//td"));
		int colSize = cellValues.size();
		val = new Object[1][4];

		for (int i = 1; i < 2; i++) {
			for (int j = 3; j < 7; j++) {
				val[i - 1][j - 3] = driver
						.findElement(
								By.xpath("//table[@class='x-grid3-row-table']//tbody//tr[" + i + "]//td[" + j + "]"))
						.getText();
		
				String datafile = System.getProperty("user.dir") + "/data/Account.xls";
				try {
					FileInputStream fis = new FileInputStream(datafile);
					HSSFWorkbook wb = new HSSFWorkbook(fis);
					HSSFSheet sheet = wb.getSheetAt(0);

					int totalRows = sheet.getLastRowNum();

					int totalCol = sheet.getRow(0).getLastCellNum();

					excelSh = new Object[totalRows][totalCol];

					for (int k = 1; k <= totalRows; k++) {
						for (int l = 0; l < totalCol; l++) {
							excelSh[k - 1][l] = sheet.getRow(k).getCell(l).getStringCellValue();

							if (val[i - 1][j - 3].equals(excelSh[k - 1][l])) {
								System.out.println("Salesforce : [" + (i - 1) + (j - 3) + "] - " + val[i - 1][j - 3]
										+ " Excel : [" + (k - 1) + (l) + "] : " + excelSh[k - 1][l]);
								Assert.assertEquals(val[i - 1][j - 3], excelSh[k - 1][l]);
								break;
							} else {
								//Assert.assertNotEquals(val[i - 1][j - 3], excelSh[k - 1][l]);
								continue;
							}
						}
						break;
					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

			}
		}

	}
}
