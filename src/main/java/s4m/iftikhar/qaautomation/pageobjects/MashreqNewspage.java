package s4m.iftikhar.qaautomation.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import s4m.iftikhar.qaautomation.core.Base;

public class MashreqNewspage extends Base {

	// Locators
	@FindBy(how = How.XPATH, using = "//h3[contains(text(), 'Mashreq News')]")
	public WebElement homepageNewsboxHeadingXpath;

	// Page factory initialize
	public MashreqNewspage(RemoteWebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	//Page methods
	public void verifyNewsTitle() {

		verifyElement(homepageNewsboxHeadingXpath);

	}
}
