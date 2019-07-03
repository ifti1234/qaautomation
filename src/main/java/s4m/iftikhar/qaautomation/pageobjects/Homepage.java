package s4m.iftikhar.qaautomation.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import s4m.iftikhar.qaautomation.core.Base;

public class Homepage extends Base {

	// Locators

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Corporate')]")
	public WebElement homepageCorporatedHeadingXpath;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Business')]")
	public WebElement homepageBusinessHeadingXpath;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'International')]")
	public WebElement homepageInternationalHeadingXpath;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Private Banking')]")
	public WebElement homepagePrivateBankingHeadingXpath;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Al Islami')]")
	public WebElement homepageIslamicHeadingXpath;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Gold')]")
	public WebElement homepageGoldHeadingXpath;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Mashreq Securities')]")
	public WebElement homepageSecuritiesHeadingXpath;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Mashreq Global Services')]")
	public WebElement homepageGlobalServicesHeadingXpath;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Mashreq Capital')]")
	public WebElement homepageCapitalHeadingXpath;

	// Page factory initialize
	public Homepage(RemoteWebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	// Page methods
	public void verifyCorporateTitle() {
		verifyElement(homepageCorporatedHeadingXpath);
	}

	public void verifyBusinessTitle() {
		verifyElement(homepageBusinessHeadingXpath);
	}

	public void verifyInternationalTitle() {
		verifyElement(homepageInternationalHeadingXpath);
	}

	public void verifyPrivateBankingTitle() {
		verifyElement(homepagePrivateBankingHeadingXpath);
	}

	public void verifyIslamicTitle() {
		verifyElement(homepageIslamicHeadingXpath);
	}

	public void verifyGoldTitle() {
		verifyElement(homepageGoldHeadingXpath);
	}

	public void verifyGlobalServicesTitle() {
		verifyElement(homepageGlobalServicesHeadingXpath);
	}

	public void verifySecuritiesTitle() {
		verifyElement(homepageSecuritiesHeadingXpath);
	}

	public void verifyMashreqCapitalTitle() {
		verifyElement(homepageCapitalHeadingXpath);
	}

}
