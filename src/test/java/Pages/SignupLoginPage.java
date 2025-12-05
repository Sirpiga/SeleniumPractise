package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage {

	private WebDriver driver;
    private By newUserText = By.xpath("//h2[text()='New User Signup!']");
    private By nameField = By.name("name");
    private By emailField = By.xpath("//input[@data-qa='signup-email']");
    private By signupBtn = By.xpath("//button[text()='Signup']");

    public SignupLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isNewUserTextVisible() {
        return driver.findElement(newUserText).isDisplayed();
    }

    public void enterNameAndEmail(String name, String email) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSignup() {
        driver.findElement(signupBtn).click();
    }

	
	
	
}
