package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.mobile.android.common.AccountPageBase;

import com.solvd.mobile.android.common.OrderPageBase;
import com.solvd.mobile.android.common.ProfilePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = AccountPageBase.class)
public class AccountPage extends AccountPageBase {

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Your Amazon.com Tab 2 of 4\"]/android.widget.ImageView")
	private ExtendedWebElement account;

	public AccountPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public ProfilePageBase profile() {
		account.click();
		return initPage(getDriver(), ProfilePageBase.class);
	}

	@Override
	public OrderPageBase orders() {
		// TODO Auto-generated method stub
		return null;
	}

}
