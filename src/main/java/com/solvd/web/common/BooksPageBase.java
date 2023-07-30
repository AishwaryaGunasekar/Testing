package com.solvd.web.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class BooksPageBase extends AbstractPage {

	public BooksPageBase(WebDriver driver) {
		super(driver);
		
	}

	public abstract WelcomePageBase home();
}
