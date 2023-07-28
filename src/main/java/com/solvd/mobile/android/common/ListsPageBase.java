package com.solvd.mobile.android.common;

import org.openqa.selenium.WebDriver;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class ListsPageBase extends AbstractPage {

	public ListsPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract AmazonHomePageBase home();
}
