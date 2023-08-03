package com.solvd.web.mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.web.common.PasswordPageBase;
import com.solvd.web.common.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PasswordPageBase.class)
public class PasswordPage extends PasswordPageBase {

	@FindBy(xpath = "//i[@class ='a-icon a-icon-logo']")
	private ExtendedWebElement logo;

	@FindBy(xpath = "//input[@id=\"ap_password\"]")
	private ExtendedWebElement password;

	@FindBy(xpath = "//span[@id =\"auth-signin-button\"]")
	private ExtendedWebElement submit;

	public PasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public WelcomePageBase signin() {
		submit.click();
		return initPage(getDriver(), WelcomePageBase.class);
	}

	@Override
	public void typePassword(String name) {
		password.type(name);

	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}
}
