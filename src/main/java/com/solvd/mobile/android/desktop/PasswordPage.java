package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.mobile.android.common.AmazonHomPageBase;
import com.solvd.mobile.android.common.PasswordPageBase;
import com.solvd.mobile.android.common.SigninPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = PasswordPageBase.class)
public class PasswordPage extends PasswordPageBase{

	@FindBy(xpath = "//android.view.View[@content-desc=\"Amazon\"]/android.widget.Image")
	private ExtendedWebElement logo;

	@FindBy(className = "android.widget.EditText")
	private ExtendedWebElement password;

	@FindBy(className = "android.widget.Button")
	private ExtendedWebElement signinsubmit;

	public PasswordPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void typePassword(String name) {
		password.type(name);

	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public AmazonHomPageBase isContinueBtnActive() {
		signinsubmit.click();
		return initPage(getDriver(), AmazonHomPageBase.class);
	}
}
