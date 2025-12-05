package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountInformation {

	private WebDriver driver;
	private By gender = By.id("id_gender1");
private By birthdate=By.id("days");
private By birthmonth=By.id("months");
private By birthyear=By.id("years");
private By newsletterCheckbox=By.id("newsletter");
private By offersCheckbox=By.id("optin");
private By Pagetitle=By.xpath("//b[text()='Enter Account Information']");

	
	
	public AccountInformation(WebDriver driver) {
	this.driver=driver;	// TODO Auto-generated constructor stub
	}
	

	public boolean isPageTitleVisible() {
		return driver.findElement(Pagetitle).isDisplayed();
	}
	public void enterAccountInformation() {
		if (!driver.findElement(gender).isSelected()) {
		    driver.findElement(gender).click();
		}
	}
		public void selectBirthDate(String day, String month, String year) {
			Select daySelect = new Select(driver.findElement(birthdate));
			daySelect.selectByVisibleText("21");
	
			Select monthSelect = new Select(driver.findElement(birthmonth));
			monthSelect.selectByVisibleText("December");
			
			Select yearSelect = new Select(driver.findElement(birthyear));
			yearSelect.selectByVisibleText("1990");
	 
	}
		
		public void checkNewsletterAndOffers() {
			WebElement newsletter = driver.findElement(newsletterCheckbox);
			if (!newsletter.isSelected()) {
			    newsletter.click();
			}
			
			WebElement offers = driver.findElement(offersCheckbox);
			if (!offers.isSelected()) {
			    offers.click();
			}
		}
	}
