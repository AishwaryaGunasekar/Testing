package com.solvd.web.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.web.common.CartsPageBase;
import com.solvd.web.common.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CartsPageBase.class)
public class CartsPage extends CartsPageBase {

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private ExtendedWebElement logo;

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private ExtendedWebElement aftercartview;

	public CartsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public WelcomePageBase home() {
		aftercartview.click();
		return initPage(getDriver(), WelcomePageBase.class);
	}

}
