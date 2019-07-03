package s4m.iftikhar.qaautomation.testcases;

import java.util.Arrays;

import org.testng.annotations.Test;

import s4m.iftikhar.qaautomation.core.testNGBase;
import s4m.iftikhar.qaautomation.pageobjects.ContactUspage;

public class ContactUs_TC extends testNGBase {

	@Test()
	public void checkContactUs() {

		new ContactUspage(driver).clickContactUs();

		new ContactUspage(driver).verifyContactUsTitle();

		new ContactUspage(driver).clickContactUsFormSubmitButton();

		new ContactUspage(driver).clickIm_LookingtofieldAndcheckSize(5,
				Arrays.asList("I am looking to...", "Register a complaint", "Enquire about a product",
						"Raise a service request", "Apply for a new product"));

		new ContactUspage(driver).selectAproductAsloan();

		new ContactUspage(driver).select_a_sub_Product(7,
				Arrays.asList("-- Select Sub Product --", "Auto Loan", "Home Loan Non-UAE Resident",
						"Home Loan UAE Resident", "Personal Loan For Emiratis", "Personal Loan for Expats",
						"Commercial Mortgage Loans UAE Residents"));

		new ContactUspage(driver).enterInginvalidAndValidMobile_Number();

	}

}
