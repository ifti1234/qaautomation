package s4m.iftikhar.qaautomation.testcases;

import org.testng.annotations.Test;

import s4m.iftikhar.qaautomation.core.testNGBase;
import s4m.iftikhar.qaautomation.pageobjects.MashreqNewspage;

public class MashreqNews_TC extends testNGBase {

	@Test()
	public void verifyHomePageNewsTitle() {

		new MashreqNewspage(driver).verifyNewsTitle();

	}
}