package com.solvd.mobile.android.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class AmazonPharmacyPageBase extends AbstractPage {

	public AmazonPharmacyPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract AmazonHomePageBase close();
}
