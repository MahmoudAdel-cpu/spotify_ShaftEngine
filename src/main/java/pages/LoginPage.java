package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage {
    private final SHAFT.GUI.WebDriver driver;
    private final By emailField = By.id("login-username");
    private final By loginBTN = By.id("login-button");
    private final By loginWithPassword = By.xpath("//button[@data-encore-id=\"buttonTertiary\"]");
    private final By passwordField = By.id("login-password");

    public LoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    @Step("Enter valid email")
    public LoginPage enterEmail(String email) {
        driver.element().type(emailField, email);
        return this;
    }
    @Step("Click on login with password")
    public LoginPage clickOnLoginWithPassword() {
        driver.element().click(loginWithPassword);
        return this;
    }
    @Step("Enter valid password")
    public LoginPage enterPassword(String password) {
        driver.element().type(passwordField, password);
        return this;
    }
    @Step("Click on login button")
    public HomePage clickOnLoginBTN() {
        driver.element().click(loginBTN);
        return new HomePage(driver);
    }


}
