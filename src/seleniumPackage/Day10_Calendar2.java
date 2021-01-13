package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Day10_Calendar2 extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		openBrowser("chrome", "https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("test.user@gmail.com.test");
		driver.findElement(By.id("password")).sendKeys("Pa55word");
		driver.findElement(By.id("Login")).click();


		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[5]/a/span")).click();
		
		driver.findElement(By.name("new")).click();
		
		driver.findElement(By.id("acc2")).sendKeys("Waqas");
		driver.findElement(By.id("acc6")).sendKeys("test");
		driver.findElement(By.id("acc5")).sendKeys("test");
		driver.findElement(By.id("acc23")).sendKeys("test");
		WebElement Ratedropdown = driver.findElement(By.id("acc9"));
		Select selectType = new Select(Ratedropdown);
		selectType.selectByVisibleText("Hot");
		driver.findElement(By.id("acc10")).sendKeys("804-551-5781");
		driver.findElement(By.id("acc11")).sendKeys("804-980-989");
		driver.findElement(By.id("acc12")).sendKeys("www.salesforce.com");
		driver.findElement(By.id("acc13")).sendKeys("test");
		WebElement Ownershipdropdown = driver.findElement(By.id("acc14"));
		Select selectOwenershipdropdown = new Select(Ownershipdropdown);
		selectOwenershipdropdown.selectByVisibleText("Private");
		driver.findElement(By.id("acc15")).sendKeys("Laser and Skin Surgery Center of Richmond");
		driver.findElement(By.id("acc16")).sendKeys("test");
		WebElement IndustryDropdown = driver.findElement(By.id("acc7"));
		Select selectIndustry = new Select(IndustryDropdown);
		selectIndustry.selectByVisibleText("Healthcare");
		driver.findElement(By.id("acc8")).sendKeys("22033303020");
		driver.findElement(By.id("acc8")).click();
		driver.findElement(By.id("acc17street")).sendKeys("test");
		driver.findElement(By.id("acc17city")).sendKeys("test");
		driver.findElement(By.id("acc17state")).sendKeys("test");
		driver.findElement(By.id("acc17zip")).sendKeys("23228");
		driver.findElement(By.id("acc17country")).sendKeys("test");
		driver.findElement(By.id("acc18street")).sendKeys("test");
		driver.findElement(By.id("acc18city")).sendKeys("test");
		driver.findElement(By.id("acc18state")).sendKeys("test");
		driver.findElement(By.id("acc18country")).sendKeys("test");
		driver.findElement(By.id("acc18zip")).sendKeys("23228");
		driver.findElement(By.id("00N2E00000D7LP0")).sendKeys("test");
		driver.findElement(By.id("acc20")).sendKeys("test");
		driver.findElement(By.id("00N2E00000D7LP3")).sendKeys("test");
		WebElement CustomerPrioritydropdown = driver.findElement(By.id("00N2E00000D7LOz"));
		Select selectcustomerPriority = new Select(CustomerPrioritydropdown);
		selectcustomerPriority.selectByVisibleText("High");
		WebElement CustomerPrioritydropdown1 = driver.findElement(By.id("00N2E00000D7LOz"));
		Select selectcustomerPriority1 = new Select(CustomerPrioritydropdown1);
		selectcustomerPriority1.selectByVisibleText("High");
		WebElement SLAdropdown = driver.findElement(By.id("00N2E00000D7LP1"));
		Select selectSLAdropdown = new Select(SLAdropdown);
		selectSLAdropdown.selectByVisibleText("Gold");
		driver.findElement(By.id("00N2E00000D7LP2")).click();

		WebElement month = driver.findElement(By.id("calMonthPicker"));
		Select monthSelect = new Select(month);
		monthSelect.selectByVisibleText("September");

		WebElement year = driver.findElement(By.id("calYearPicker"));
		Select yearSelect = new Select(year);
		yearSelect.selectByValue("2019");
		List<WebElement> values = driver
				.findElements(By.xpath("//table[@class='calDays']/tbody/tr[@class='calRow']/td"));
		for (WebElement cellValue : values) {
			String date = cellValue.getText();
			if (date.contains("17")) {
				cellValue.click();
				// driver.findElement(By.xpath("//table[@class='calDays']/tbody/tr[@class='calRow']/td")).click();
				break;
			}
		}
		WebElement activedropdown = driver.findElement(By.id("00N2E00000D7LOy"));
		Select selectactivedropdown = new Select(activedropdown);
		selectactivedropdown.selectByVisibleText("Yes");
		WebElement Upselldropdown = driver.findElement(By.id("00N2E00000D7LP4"));
		Select selectUpselldropdown = new Select(Upselldropdown);
		selectUpselldropdown.selectByVisibleText("Maybe");
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[@value=' Save ']")).click();
	}
}
