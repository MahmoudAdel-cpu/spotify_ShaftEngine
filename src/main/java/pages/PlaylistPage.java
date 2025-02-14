package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class PlaylistPage {
    private final SHAFT.GUI.WebDriver driver;
    private final By searchBox = By.xpath("//input[@placeholder=\"Search for songs or episodes\"]");
    private final By successMessage = By.xpath("//div[@data-encore-id=\"box\"]");
    private  final By playBTN = By.xpath("//div[@data-testid=\"action-bar-row\"]//button[@data-testid=\"play-button\"]");


    public PlaylistPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    @Step("Search for song")
    public PlaylistPage searchForSong(String searchQuery) {
        driver.element().type(searchBox, searchQuery);
        return this;
    }
    @Step("Select the song from the search results")
    public PlaylistPage selectSong(String searchQuery) {
        By addToPlayListBTN = By.xpath("//div[@data-testid=\"tracklist-row\"][contains(.,\"" + searchQuery + "\")]//button[@data-encore-id=\"buttonSecondary\"]");
        try {
            driver.verifyThat().element(addToPlayListBTN).isVisible().perform();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        driver.element().click(addToPlayListBTN);
        return this;
    }
    @Step("Play the playlist")
    public PlaylistPage playPlaylist() {
        driver.element().click(playBTN);
        return this;
    }
}
