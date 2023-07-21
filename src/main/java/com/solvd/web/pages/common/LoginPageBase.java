package com.solvd.web.pages.common;

import org.openqa.selenium.WebDriver;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class LoginPageBase extends AbstractPage {

	public LoginPageBase(WebDriver driver) {
		super(driver);
		setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
	}

	public abstract HomeBasePage loginToSite();

	@Override
	public void open() {
		super.open();
	}

}
