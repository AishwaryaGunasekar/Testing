package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.mobile.android.common.AccountPageBase;
import com.solvd.mobile.android.common.AmazonHomePageBase;
import com.solvd.mobile.android.common.OrdersPageBase;
import com.solvd.mobile.android.common.PasswordPageBase;
import com.solvd.mobile.android.common.ProfilePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = ProfilePageBase.class)
public class ProfilePage extends ProfilePageBase {

	@FindBy(id = "com.amazon.mShop.android.shopping:id/chrome_action_bar_logo_image_cxi")
	private ExtendedWebElement logo;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.View[1]/android.widget.TextView")
	private ExtendedWebElement orders;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.View[1]/android.widget.TextView")
	private ExtendedWebElement account;

	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public OrdersPageBase yourOrders() {
		orders.click();
		return initPage(getDriver(), OrdersPageBase.class);
	}

	@Override
	public AccountPageBase yourAccount() {
		account.click();
		return initPage(getDriver(), AccountPageBase.class);

	}

}
