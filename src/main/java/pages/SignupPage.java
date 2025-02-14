package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SignupPage {
    private final SHAFT.GUI.WebDriver driver;
    private final By emailField = By.xpath("//input[@type=\"email\"]");
    private final By nextBTN = By.xpath("//button[@data-testid=\"submit\"]");
    private final By passwordField = By.xpath("//input[@name=\"new-password\"]");
    private final By showPasswordBTN = By.xpath("//button[@aria-label=\"Show password\"]");
    private final By nameField = By.xpath("//input[@name=\"displayName\"]");
    private final By dayOfBirthField = By.xpath("//input[@name=\"day\"]");
    private final By monthOfBirthField = By.xpath("//select[@name=\"month\"]");
    private final By yearOfBirthField = By.xpath("//input[@name=\"year\"]");
    private final By selectMonth = By.xpath("//option[@value=\"6\"]");
    private final By genderField = By.xpath("//span[text()='Man']");
    private final By marketingCheckbox = By.xpath("//span[@class=\"TextForLabel-sc-1jqya9m-0 bwmNvf encore-text-body-small\"][contains(.,\"news and offers\")]");
    private final By privacyCheckbox = By.xpath("//span[@class=\"TextForLabel-sc-1jqya9m-0 bwmNvf encore-text-body-small\"][contains(.,\"registration data\")]");
    private final By signupBTN = By.xpath("//button[@data-encore-id=\"buttonPrimary\"]");

    public SignupPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    @Step (" User enters valid email address")
    public SignupPage enterEmail(String email) {
        driver.element().type(emailField, email);
        driver.verifyThat().element(emailField).attribute("value").isEqualTo(email);
        return this;
    }
    @Step ("Click on next button")
    public SignupPage clickOnNextBTN() {
        driver.element().click(nextBTN);
        return this;
    }
    @Step ("User enters valid password")
    public SignupPage enterPassword(String password) {
        driver.element().type(passwordField, password);
        driver.element().click(showPasswordBTN);
        driver.verifyThat().element(passwordField).attribute("value").isEqualTo(password);
        return this;
    }
    @Step ("User enters valid name")
    public SignupPage enterName(String name) {
        driver.element().type(nameField, name);
        return this;
    }
    @Step ("User enters valid day of birth")
    public SignupPage enterDayOfBirth(String day) {
        driver.element().type(dayOfBirthField, day);
        driver.verifyThat().element(dayOfBirthField).attribute("value").isEqualTo(day);
        return this;
    }
    @Step ("User selects month of birth")
    public SignupPage selectMonthOfBirth() {
        driver.element().click(monthOfBirthField);
        driver.element().click(selectMonth);
        return this;
    }
    @Step ("User enters valid year of birth")
    public SignupPage enterYearOfBirth(String year) {
        driver.element().type(yearOfBirthField, year);
        driver.verifyThat().element(yearOfBirthField).attribute("value").isEqualTo(year);
        return this;
    }
    @Step ("User selects his gender")
    public SignupPage selectGender() {
        driver.element().click(genderField);
        return this;
    }
    @Step ("User selects marketing and privacy checkboxes")
    public SignupPage agreeOnTermsAndConditions() {
        driver.element().click(marketingCheckbox);
        driver.element().click(privacyCheckbox);
        return this;
    }
    @Step ("User clicks on signup button")
    public HomePage clickSignupBTN() {
        driver.element().click(signupBTN);
        driver.browser().waitUntilUrlToBe("https://open.spotify.com/");
        driver.verifyThat().browser().title().isEqualTo("Spotify - Web Player: Music for everyone");
        return new HomePage(driver);
    }

}

