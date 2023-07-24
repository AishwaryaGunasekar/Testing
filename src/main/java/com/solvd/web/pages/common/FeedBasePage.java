package com.solvd.web.pages.common;

import org.openqa.selenium.WebDriver;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class FeedBasePage extends AbstractPage {
	public FeedBasePage(WebDriver driver) {
		super(driver);
	}

	public abstract String readfeed();
}
