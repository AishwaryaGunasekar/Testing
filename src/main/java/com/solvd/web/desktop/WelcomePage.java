package com.solvd.web.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.web.common.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private ExtendedWebElement logo;

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

	public WelcomePage(WebDriver driver) {
		super(driver);

	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public SigninPageBase sign() {
		signin.click();
		return initPage(getDriver(), SigninPageBase.class);
	}

	@Override
	public CartsPageBase viewCart() {
		cartview.click();
		return initPage(getDriver(), CartsPageBase.class);
	}

	@Override
	public AmazonBasicsPageBase amazonBasics() {
		amazonBasics.click();
		return initPage(getDriver(), AmazonBasicsPageBase.class);
	}

	@Override
	public BooksPageBase amazonBooks() {
		viewbooks.click();
		return initPage(getDriver(), BooksPageBase.class);
	}

	@Override
	public AccountPageBase viewAccountDetails() {
		account.click();
		return initPage(getDriver(), AccountPageBase.class);
	}
}
