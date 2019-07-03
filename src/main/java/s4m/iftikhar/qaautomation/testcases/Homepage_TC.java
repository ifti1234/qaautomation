package s4m.iftikhar.qaautomation.testcases;

import org.testng.annotations.Test;

import s4m.iftikhar.qaautomation.core.testNGBase;
import s4m.iftikhar.qaautomation.pageobjects.Homepage;

public class Homepage_TC extends testNGBase {

	@Test()
	public void verifyHomePageNavigationBarElements() {

		new Homepage(driver).verifyCorporateTitle();

		new Homepage(driver).verifyBusinessTitle();

		new Homepage(driver).verifyInternationalTitle();

		new Homepage(driver).verifyPrivateBankingTitle();

		new Homepage(driver).verifyIslamicTitle();

		new Homepage(driver).verifyGoldTitle();

		new Homepage(driver).verifyGlobalServicesTitle();

		new Homepage(driver).verifySecuritiesTitle();

		new Homepage(driver).verifyMashreqCapitalTitle();

	}

}
