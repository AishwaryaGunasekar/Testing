package com.solvd.web.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.web.common.PasswordPageBase;
import com.solvd.web.common.SigninPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SigninPageBase.class)
public class SigninPage extends SigninPageBase {

	@FindBy(xpath = "//i[@class ='a-icon a-icon-logo']")
	private ExtendedWebElement logo;

	@FindBy(xpath = "//input[@id=\"ap_email\"]")
	private ExtendedWebElement email;

	@FindBy(xpath = "//input[@id =\"continue\"]")
	private ExtendedWebElement cont;

	public SigninPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void typeEmail(String name) {
		email.type(name);

	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public PasswordPageBase cont() {
		cont.click();
		return initPage(getDriver(), PasswordPageBase.class);
	}

}
