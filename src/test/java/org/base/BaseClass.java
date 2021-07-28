package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}

	public void launch(String url) {
		driver.get(url);

	}

	public void send(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void click(WebElement element) {
		element.click();

	}

	public static void quit() {
		driver.quit();

	}

}
