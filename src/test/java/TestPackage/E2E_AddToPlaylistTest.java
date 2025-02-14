package TestPackage;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import com.shaft.driver.SHAFT;

public class E2E_AddToPlaylistTest {
    private  SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData;

    @Test
    public void addSongToPlaylist() {
        HomePage homePage = new HomePage(driver);
        homePage.openSpotifyWebsite();
        homePage.clickLoginBTN()
                .enterEmail(testData.getTestData("email"))

                .clickOnLoginWithPassword()
                .enterPassword(testData.getTestData("password"))
                .clickOnLoginBTN()
                .clickCreatePlaylistBTN()
                .searchForSong(testData.getTestData("searchQuery"))
                .selectSong(testData.getTestData("searchQuery"))
                .playPlaylist();
    }
    @BeforeClass(description = "Setup Test Data.")
    public void beforeClass(){
        testData = new SHAFT.TestData.JSON("spotify-data.json");
    }

    @BeforeMethod(description = "Setup Browser instance.")
    public void beforeMethod() {
        driver = new SHAFT.GUI.WebDriver();
    }

//    @AfterMethod(description = "Teardown Browser instance.")
//    public void afterMethod() {
//        driver.quit();
//    }
}
