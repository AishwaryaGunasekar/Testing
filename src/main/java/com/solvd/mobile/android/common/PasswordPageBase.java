package com.solvd.mobile.android.common;

import org.openqa.selenium.WebDriver;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class PasswordPageBase extends AbstractPage {
	public PasswordPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract void typePassword(String name);

	public abstract AmazonHomePageBase isContinueBtnActive();
}
