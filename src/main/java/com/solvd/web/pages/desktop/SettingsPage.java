package com.solvd.web.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public class SettingsPage extends AbstractPage {

	@FindBy(xpath = "//span[text()='Settings & Privacy']")
	private ExtendedWebElement settingsPrivacy;

	@FindBy(xpath = "//span[text()='Settings']")
	private ExtendedWebElement settings;

	@FindBy(xpath = "//div[text()='Notifications']")
	private ExtendedWebElement notifications;

	@FindBy(xpath = "//input[@aria-checked='false']")
	private ExtendedWebElement enableNotifications;

	public SettingsPage(WebDriver driver) {
		super(driver);
	}

	public void openSettings() {
		settingsPrivacy.click();
		settings.click();
	}

	public void enableNotifications() {
		notifications.click();
		enableNotifications.click();
	}
}
