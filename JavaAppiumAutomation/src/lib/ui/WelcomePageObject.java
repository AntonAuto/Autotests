package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class WelcomePageObject extends MainPageObject {

    private static final String
    STEP_LEARN_MORE_LINK ="";
    STEP_LEARN_MORE_LINK ="";
    STEP_LEARN_MORE_LINK ="";
    STEP_LEARN_MORE_LINK ="";
    NEXT_LINK ="";
    GET_STARTED_BUTTON ="";

    public WelcomePageObject(AppiumDriver driver){

        super(driver);
    }

    public void waitForLearnMoreLink(){
        this.waitForElementPresent(By.id("Learn more about Wikipedia"),"Cannot find 'Learn more about Wikipedia' link",10);
    }

    public void waitForNewWayToExploreText(){
        this.waitForElementPresent(By.id("New ways to explore"),"Cannot find 'New ways to explore' link",10);
    }
    public void waitForAddOrEditPreferredLangText(){
        this.waitForElementPresent(By.id("Add or edit prefer languages"),"Cannot find 'Add or edit prefer languages' link",10);
    }
    public void waitForLearnMoreAboutDataCollectedText(){
        this.waitForElementPresent(By.id("Learn more about data collected"),"Cannot find 'Learn more about data collected' link",10);
    }

    public void clickNextButton(){
        this.waitForElementAndClick(By.id("Next"),"Cannot find and click 'Next'",10);
    }
    public void clickGetStartedButton(){
        this.waitForElementAndClick(By.id("Get started"),"Cannot find and click 'Get started'",10);
    }
}
