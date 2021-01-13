package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Day06_Selenium extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		openBrowser("chrome", "http://codegator.herokuapp.com/drop_down.php");
		WebElement fruitDropdown = driver.findElement(By.className("fruits"));

		Select selectFruit = new Select(fruitDropdown);

		selectFruit.selectByVisibleText("Grape");
	
		selectFruit.selectByVisibleText("Apple");
		
		selectFruit.selectByVisibleText("Banana");

		selectFruit.selectByIndex(0);
	
		selectFruit.selectByIndex(3);

		selectFruit.selectByValue("1");
		System.out.println("Does this support multiple values : "+selectFruit.isMultiple());

		WebElement car = driver.findElement(By.id("cars"));
		Select selectCar = new Select(car);
		selectCar.selectByValue("car1");
		selectCar.selectByValue("car2");

		selectCar.deselectByValue("car1");
		selectCar.deselectByVisibleText("Saab");
		System.out.println("Does this support multiple values : "+selectCar.isMultiple());
		List<WebElement> allCars = selectCar.getOptions();
		System.out.println(allCars.size());

		
		for (int i = 0; i < allCars.size(); i++) {
			System.out.println(allCars.get(i).getText());
		}

		for(WebElement i : allCars) {
			System.out.println(i.getText());
		}
		
	}

}
