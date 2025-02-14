package TestPackage;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class SignupTest {
    private  SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData;

    @Test
    public void createNewAccount() {
        HomePage homePage = new HomePage(driver);
        homePage.openSpotifyWebsite();
        homePage.clickSignUpBTN()
                .enterEmail(testData.getTestData("email"))
                .clickOnNextBTN()
                .enterPassword(testData.getTestData("password"))
                .clickOnNextBTN()
                .enterName(testData.getTestData("name"))
                .enterDayOfBirth(testData.getTestData("dayofbirth"))
                .selectMonthOfBirth()
                .enterYearOfBirth(testData.getTestData("yearofbirth"))
                .selectGender()
                .clickOnNextBTN()
                .agreeOnTermsAndConditions()
                .clickSignupBTN();
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
