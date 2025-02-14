package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage {
    private final SHAFT.GUI.WebDriver driver;
    private final String url = "https://www.spotify.com/";
    private final By signUpBTN = By.xpath("//button[@data-testid=\"signup-button\"]");
    private final By loginBTN = By.xpath("//button[@data-testid=\"login-button\"]");
    private final By createPlaylistIcon = By.xpath("//button[@aria-label=\"Create playlist or folder\"]");
    private final By createPlaylistBTN = By.xpath("//span[@dir=\"auto\"][contains(.,\"new playlist\")]");



    public HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    @Step("Open Spotify website")
    public HomePage openSpotifyWebsite() {
        driver.browser().navigateToURL(url);
        return this;
    }
    @Step("Click on sign up button")
    public SignupPage clickSignUpBTN() {
        driver.element().click(signUpBTN);
        return new SignupPage(driver);
    }
    @Step("Click on login button")
    public LoginPage clickLoginBTN() {
        driver.element().click(loginBTN);
        return new LoginPage(driver);
    }
    @Step("Click on create playlist button")
    public PlaylistPage clickCreatePlaylistBTN() {
        driver.element().click(createPlaylistIcon);
        driver.element().click(createPlaylistBTN);
        return new PlaylistPage(driver);
    }
}
