package com.solvd.web.pages.desktop;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.web.pages.common.FeedBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = FeedBasePage.class)
public class FeedPage extends FeedBasePage{

    @FindBy(xpath = "//span[contains(text(),'Sam Samm')]")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//span[contains(text(),'Feeds')]")
    private ExtendedWebElement feed;

    public FeedPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(logo);
    }

    @Override
    public String readfeed() {
        assertElementPresent(feed);
        return feed.getText();
    }
}
