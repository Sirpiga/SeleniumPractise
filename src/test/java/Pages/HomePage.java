package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
    private By signupLoginBtn = By.xpath("//a[contains(text(),'Signup / Login')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isHomePageVisible() {
        return driver.findElement(signupLoginBtn).isDisplayed();
    }

    public void clickSignupLogin() {
        driver.findElement(signupLoginBtn).click();
    }


}
