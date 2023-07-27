package com.solvd.mobile.android.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class AmazonHomPageBase extends AbstractPage {

	public AmazonHomPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract AccountPageBase accountinfo();

	public abstract ProfilePageBase profile();

}
