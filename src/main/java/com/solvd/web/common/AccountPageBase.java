package com.solvd.web.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class AccountPageBase extends AbstractPage {

	public AccountPageBase(WebDriver driver) {
		super(driver);

	}

	public abstract WelcomePageBase home();

}
