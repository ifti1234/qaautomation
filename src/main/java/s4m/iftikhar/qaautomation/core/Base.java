package s4m.iftikhar.qaautomation.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	private InputStream inputStream;
	protected static RemoteWebDriver driver;

	public void startBrowser() {

		try {

			if (PropertiesReader.config.getValue("platform").equalsIgnoreCase("windows")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(PropertiesReader.config.getValue("url"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void quitBrowser() {

		try {

			driver.quit();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void verifyElement(WebElement element) {

		try {

			element.isDisplayed();

		} catch (Exception e) {

			Assert.assertTrue(element.toString() + " is not present on the screen", false);

		}

	}

	public void clickElement(WebElement element) {

		try {

			element.click();

		} catch (Exception e) {

			Assert.assertTrue(element.toString() + " is not present to perform click action", false);

		}

	}

	public void sendKeys(WebElement element, String value) {

		try {
			element.clear();
			element.sendKeys(value);

		} catch (Exception e) {

			Assert.assertTrue(element.toString() + " is not present to perform click action", false);

		}

	}

	public boolean verifyAttribute(WebElement ele, String attribute, String value) {

		Boolean result = false;

		if (ele.getAttribute(attribute).equals(value))
			result = true;

		return result;

	}

	public Properties loadPropertiesFile(String fileName) {

		Properties prop = new Properties();
		inputStream = getClass().getClassLoader().getResourceAsStream(fileName);

		try {
			prop.load(inputStream);
		} catch (IOException e) {

			e.printStackTrace();
		}

		return prop;
	}

}
