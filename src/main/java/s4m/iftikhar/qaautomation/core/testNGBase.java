package s4m.iftikhar.qaautomation.core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testNGBase extends Base {

	@BeforeMethod
	public void beforeMethod() {
		startBrowser();
	}

	@AfterMethod
	public void afterMethod() {
		quitBrowser();
	}

}
