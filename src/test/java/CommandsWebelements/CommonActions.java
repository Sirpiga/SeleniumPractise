package CommandsWebelements;

import org.openqa.selenium.WebDriver;

public class CommonActions {
	
	
	private WebDriver driver;
		public CommonActions(WebDriver driver) {
		this.driver = driver;
	}
		
		
		 public String getPageTitle() {
		        return driver.getTitle();
		    }

		    public String getCurrentUrl() {
		        return driver.getCurrentUrl();
		    }

		    public String getPageSource() {
		        return driver.getPageSource();
		    }

		    public void refreshPage() {
		        driver.navigate().refresh();
		    }

		    public void navigateTo(String url) {
		        driver.navigate().to(url);
		    }

		    public void navigateBack() {
		        driver.navigate().back();
		    }
		    
		    public void navigateForward() {
		        driver.navigate().forward();
		    }

}
