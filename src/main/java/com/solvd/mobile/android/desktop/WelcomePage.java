package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.mobile.android.common.SigninPageBase;
import com.solvd.mobile.android.common.WelcomePageBase;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {

	@FindBy(id="com.amazon.mShop.android.shopping:id/sso_splash_logo")
	private ExtendedWebElement logo;
	
	
	@FindBy(id = "com.amazon.mShop.android.shopping:id/sign_in_button")
	private ExtendedWebElement signin;

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public SigninPageBase click() {
		signin.click();
		return initPage(getDriver(), SigninPageBase.class);
	}
}