package com.solvd.web.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public class MainPage extends AbstractPage {

    @FindBy(xpath = "//div[@aria-label='Account']")
    private ExtendedWebElement userNavigationButton;

    @FindBy(xpath = "//span[text()='Log Out']")
    private ExtendedWebElement logoutButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void logout() {
        userNavigationButton.click();
        logoutButton.click();
    }
}
