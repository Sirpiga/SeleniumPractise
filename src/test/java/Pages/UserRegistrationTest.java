package Pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.screenshotutil;

public class UserRegistrationTest extends basetest {

    @Test
    public  void testUserRegistrationAndDeletion() {
        driver.get("http://automationexercise.com");

        HomePage home = new HomePage(driver);
        Assert.assertTrue(home.isHomePageVisible());
        screenshotutil.captureScreenshot(driver,"HomePage");
        home.clickSignupLogin();

        SignupLoginPage signup = new SignupLoginPage(driver);
        Assert.assertTrue(signup.isNewUserTextVisible());
        screenshotutil.captureScreenshot(driver, "SignupPage");
        signup.enterNameAndEmail("John", "john" + System.currentTimeMillis() + "@test.com");
        signup.clickSignup();
	
		AccountInformation accountInfo = new AccountInformation(driver);
		Assert.assertTrue(accountInfo.isPageTitleVisible());
		screenshotutil.captureScreenshot(driver, "AccountInformationPage");
		accountInfo.enterAccountInformation();
		accountInfo.selectBirthDate("21", "December", "1990");
		accountInfo.checkNewsletterAndOffers();
    screenshotutil.captureScreenshot(driver, "FilledAccountInformation");
	}

}
