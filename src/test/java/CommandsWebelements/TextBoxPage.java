package CommandsWebelements;

import org.openqa.selenium.WebDriver;

public class TextBoxPage {
	
	private String url = "https://demoqa.com/text-box";
	private String url1="https://demoqa.com/forms";
	private WebDriver driver;
	
	public TextBoxPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public void navigateToTextBoxPage() {
		driver.get(url);
	}
	
	public void navigateToFormsPage() {
		driver.get(url1);
	}
	
	public void closeCurrentBrowser() {
		driver.close();
	}
	
	public void closeAllBrowser() {
		
		driver.quit();
	}
	
	

}
