package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.screenshotutil;
import io.cucumber.java.en.Given;

public class Login {

		// TODO Auto-generated method stub
		 @Given("user opens the URL")
		    public void user_opens_the_url() {
		        WebDriver driver= new ChromeDriver();
		       driver.get("https://www.amazon.co.in");
              screenshotutil.captureScreenshot(driver, "AmazonHomePage");
	}

}
