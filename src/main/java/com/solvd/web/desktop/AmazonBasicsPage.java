package com.solvd.web.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.web.common.AmazonBasicsPageBase;
import com.solvd.web.common.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AmazonBasicsPageBase.class)
public class AmazonBasicsPage extends AmazonBasicsPageBase {

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private ExtendedWebElement logo;

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private ExtendedWebElement afterDeals;

	public AmazonBasicsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public WelcomePageBase home() {
		afterDeals.click();
		return initPage(getDriver(), WelcomePageBase.class);

	}
}
