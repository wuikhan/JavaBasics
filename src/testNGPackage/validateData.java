package testNGPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class validateData {

	public static void main(String[] args) throws IOException {
		Object[][] es;
		Object[][] val;

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\data\\chromedriver.exe");
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

		List<WebElement> records = driver.findElements(By.xpath("//div[contains(@class,'x-grid3-row')]"));
		int recSize = records.size();
		System.out.println("Total records are : " + recSize);

		List<WebElement> cellValues = driver.findElements(
				By.xpath("//table[@class='x-grid3-row-table']//tbody//tr//td[contains(@class,'x-grid3-td-ACCOUNT')]"));
		int colSize = cellValues.size();

		val = new Object[recSize][4];

		for (int i = 1; i <= recSize; i++) {
			for (int j = 3; j < 7; j++) {
				val[i - 1][j - 3] = driver.findElement(By.xpath(
						"/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/form/div[3]/div[4]/div/div/div/div[1]/div[2]/div/div["
								+ i + "]/table/tbody/tr/td[" + j + "]/div"))
						.getText();
				
				//System.out.println("Salesforce : ["+(i-1)+"]"+"["+(j-3)+"]" +val[i - 1][j - 3]);

				String datafile = System.getProperty("user.dir") + "/data/Account.xls";
				try {
					FileInputStream fis = new FileInputStream(datafile);
					HSSFWorkbook wb = new HSSFWorkbook(fis);
					HSSFSheet sheet = wb.getSheetAt(0);

					int totalRows = sheet.getLastRowNum();

					int totalCol = sheet.getRow(0).getLastCellNum();

					es = new Object[totalRows][totalCol];

					for (int k = 1; k <= totalRows; k++) {
						for (int l = 0; l < totalCol; l++) {
							es[k - 1][l] = sheet.getRow(k).getCell(l).getStringCellValue();
							//System.out.println("Excel : ["+(k-1)+"]"+"["+(k)+"]" +es[k - 1][l]);
							
							if (val[i - 1][j - 3].equals(es[k - 1][l])) {
								System.out.println("Salesforce : ["+(i-1)+"]"+"["+(j-3)+"] , Value : " +val[i - 1][j - 3] + " Matches with " + "Excel : ["+(k-1)+"]"+"["+(k)+"]  , Value : " +es[k - 1][l]);
								Assert.assertEquals(val[i - 1][j - 3], es[k - 1][l]);
								break;
							} else {
								continue;
							}
						}
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

			}
		}

	}
}
