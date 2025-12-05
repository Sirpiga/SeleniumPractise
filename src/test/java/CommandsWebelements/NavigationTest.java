package CommandsWebelements;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.basetest;
import Utilities.screenshotutil;

public class NavigationTest extends basetest {
	@Test(priority = 1)
	public  void testNavigationToTextBoxPage() {
		

		TextBoxPage textbox = new TextBoxPage(driver);
		textbox.navigateToFormsPage();
		
		
		CommonActions commonActions = new CommonActions(driver);
		commonActions.refreshPage();
		
		
		System.out.println("Page Title: " + commonActions.getPageTitle());
		System.out.println("Current URL: " + commonActions.getCurrentUrl());
		System.out.println("Page Source Length: " + commonActions.getPageSource().length());
		
		textbox.navigateToTextBoxPage();
			screenshotutil.captureScreenshot(driver, "TextBoxPageNavigated");
			commonActions.navigateBack();
			screenshotutil.captureScreenshot(driver, "AfterNavigateBack");
			commonActions.navigateForward();
			screenshotutil.captureScreenshot(driver, "AfterNavigateForward");
			
			TextBoxPage textbox1 = new TextBoxPage(driver1);
			textbox1.navigateToFormsPage();
			screenshotutil.captureScreenshot(driver1, "FormsPageNavigated");
			
			textbox.closeCurrentBrowser();
			
			
			textbox1.closeAllBrowser();
	}

}
