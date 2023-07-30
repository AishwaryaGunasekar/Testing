package com.solvd.web.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class WelcomePageBase extends AbstractPage {
	public WelcomePageBase(WebDriver driver) {
		super(driver);

	}

	public abstract SigninPageBase sign();

	public abstract CartsPageBase viewCart();

	public abstract AmazonBasicsPageBase amazonBasics();

	public abstract BooksPageBase amazonBooks();

	public abstract AccountPageBase viewAccountDetails();

}
