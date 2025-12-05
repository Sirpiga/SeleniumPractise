package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilities.driverfactory;

public class basetest {

		protected WebDriver driver;
		protected WebDriver driver1;

	    @BeforeMethod
	    public void setUp() {
	        driver = driverfactory.getDriver();
	        driver1 = driverfactory.getDriver();
	        
	    }

	    @AfterMethod
	    public void tearDown() {
	        driverfactory.quitDriver();
	    }
	    
	    

		
		
		
	}
