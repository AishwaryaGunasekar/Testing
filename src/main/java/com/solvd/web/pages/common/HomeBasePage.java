package com.solvd.web.pages.common;

import org.openqa.selenium.WebDriver;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class HomeBasePage extends AbstractPage {

	public HomeBasePage(WebDriver driver) {
		super(driver);
		setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
	}

	public abstract void createPost(String message);
	public abstract newsBasePage openNewsPage();

}
