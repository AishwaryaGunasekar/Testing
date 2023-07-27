package com.solvd.mobile.android.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class ProfilePageBase extends AbstractPage {
	public ProfilePageBase(WebDriver driver) {
		super(driver);
	}

	public abstract AccountPageBase yourAccount();
	public abstract OrdersPageBase yourOrders();
	// public abstract BuyAgainPageBase buyAgain();
	// public abstract ListsPageBase yourList();

}
