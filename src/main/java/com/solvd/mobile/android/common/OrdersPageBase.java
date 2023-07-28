package com.solvd.mobile.android.common;

import org.openqa.selenium.WebDriver;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class OrdersPageBase extends AbstractPage {

	public OrdersPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract ProfilePageBase profile();
}
