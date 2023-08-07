package com.solvd.web.uiobjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;

public class BannerObject extends AbstractUIObject {

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private ExtendedWebElement logo;

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private ExtendedWebElement viewedAccount;

	@FindBy(xpath = "//span[text() ='Hello, sign in']")
	private ExtendedWebElement signin;

	@FindBy(id = "nav-cart-count")
	private ExtendedWebElement cartview;

	@FindBy(xpath = "//a[text()='Amazon Basics']")
	private ExtendedWebElement amazonBasics;

	@FindBy(xpath = "//a[text() ='Books']")
	private ExtendedWebElement viewbooks;

	@FindBy(xpath = "//span[text() = 'Hello, ashmano']")
	private ExtendedWebElement account;

	public BannerObject(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

}
