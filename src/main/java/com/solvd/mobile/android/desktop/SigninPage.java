package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.mobile.android.common.AmazonHomPageBase;
import com.solvd.mobile.android.common.PasswordPageBase;
import com.solvd.mobile.android.common.SigninPageBase;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = SigninPageBase.class)
public class SigninPage extends SigninPageBase {

	@FindBy(className = "android.widget.EditText")
	private ExtendedWebElement email;

	// @FindBy(className="android.widget.Button")
	// @FindBy(id = "com.amazon.mShop.android.shopping:id/continue")
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
	private ExtendedWebElement cont;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Amazon\"]/android.widget.Image")
	private ExtendedWebElement logo;

	public SigninPage(WebDriver driver) {
		super(driver);
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
	public PasswordPageBase click() {
		cont.click();
		return initPage(getDriver(), PasswordPageBase.class);
	}

}
