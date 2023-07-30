package com.solvd.web.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class SigninPageBase extends AbstractPage {

	public SigninPageBase(WebDriver driver) {
		super(driver);
		
	}

	public abstract void typeEmail(String name);

	public abstract PasswordPageBase cont();

	
}
