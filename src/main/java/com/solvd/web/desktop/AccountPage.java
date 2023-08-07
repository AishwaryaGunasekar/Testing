package com.solvd.web.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.web.common.AccountPageBase;
import com.solvd.web.common.WelcomePageBase;
import com.solvd.web.uiobjects.BannerObject;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AccountPageBase.class)
public class AccountPage extends AccountPageBase {

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private ExtendedWebElement viewedAccount;

	@FindBy(id = "nav-search")
	private BannerObject banner;

	public AccountPage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public boolean isPageOpened() {
		return banner.isAlertPresent();
	}

	@Override
	public WelcomePageBase home() {
		viewedAccount.click();
		return initPage(getDriver(), WelcomePageBase.class);
	}
}
