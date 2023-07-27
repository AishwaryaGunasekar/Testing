package com.solvd.mobile.android.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class SettingsPageBase extends AbstractPage {

	public SettingsPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract ListsPageBase viewlist();

}
