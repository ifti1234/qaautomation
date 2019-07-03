package s4m.iftikhar.qaautomation.pageobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import s4m.iftikhar.qaautomation.core.Base;

public class ContactUspage extends Base {

	// Locators
	@FindBy(how = How.XPATH, using = "//p[contains(text(), 'Call +9714 424 4444 Lost your card? Enquiries?')]")
	public WebElement homepageContactUsXpath;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Contact Us')]")
	public WebElement contactUsTitleXpath;

	@FindBy(how = How.ID, using = "btnSubmit")
	public WebElement contactUsSubmitButtonID;

	@FindBy(how = How.ID, using = "product")
	public WebElement contactUsSubProductFieldID;

	@FindBy(how = How.ID, using = "mobile")
	public WebElement contactUsMobileNumberFieldID;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Mobile number should be 7 digit')]")
	public WebElement contactUsMobileNumberFieldErrorXpath;

	// Page factory initialize
	public ContactUspage(RemoteWebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	// Page methods
	public void clickContactUs() {

		clickElement(homepageContactUsXpath);

	}

	public void verifyContactUsTitle() {

		verifyElement(contactUsTitleXpath);

	}

	public void clickContactUsFormSubmitButton() {

		clickElement(contactUsSubmitButtonID);

	}

	public void clickIm_LookingtofieldAndcheckSize(Integer size, List<String> options) {

		Select select = new Select(driver.findElement(By.id("reachoutforproduct")));

		List<WebElement> ele = new ArrayList<WebElement>(select.getOptions());

		List<String> eleVal = new ArrayList<String>();

		for (WebElement webElement : ele) {
			eleVal.add(webElement.getText());
		}

		Assert.assertTrue(ele.size() == size, "Dropdown is not having expected size");

		for (String val : options) {
			Assert.assertTrue(eleVal.contains(val), "Dropdown is not having the value" + val);
		}

	}

	public void clickSubProduct() {

		clickElement(contactUsSubProductFieldID);

	}

	public void selectAproductAsloan() {

		WebElement product = driver.findElement(By.id("need"));

		Select select = new Select(product);

		select.selectByVisibleText("Loans");

	}

	public void select_a_sub_Product(Integer size, List<String> options) {

		Select select = new Select(driver.findElement(By.id("product")));

		List<WebElement> ele = new ArrayList<WebElement>(select.getOptions());

		List<String> eleVal = new ArrayList<String>();

		for (WebElement webElement : ele) {
			eleVal.add(webElement.getText());
		}

		Assert.assertTrue(ele.size() == size, "Size for the Dropdown is not as expected");

		for (String val : options) {
			Assert.assertTrue(eleVal.contains(val), "Size for the Dropdown is not as expected" + val);
		}

	}

	public void enterInginvalidAndValidMobile_Number() {

		sendKeys(contactUsMobileNumberFieldID, "12345");

		Assert.assertTrue(!verifyAttribute(contactUsMobileNumberFieldErrorXpath, "class", "ng-hide"),
				"Error message is not displayed by entering mobile number less than 7 digits");

		sendKeys(contactUsMobileNumberFieldID, "1234567");

		Assert.assertTrue(verifyAttribute(contactUsMobileNumberFieldErrorXpath, "class", "ng-hide"),
				"Error message is displayed by entering mobile number more than 7 digits");

	}

}
