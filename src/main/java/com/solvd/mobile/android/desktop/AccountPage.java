package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.solvd.mobile.android.common.AccountPageBase;
import com.solvd.mobile.android.common.ProfilePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = AccountPageBase.class)
public class AccountPage extends AccountPageBase {

	@FindBy(id = "com.amazon.mShop.android.shopping:id/chrome_search_hint_view")
	private ExtendedWebElement logo;

	@FindBy(id = "com.amazon.mShop.android.shopping:id/chrome_action_bar_back_icon_image")
	private ExtendedWebElement afterviewaccount;

	public AccountPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public ProfilePageBase profile() {
		afterviewaccount.click();
		return initPage(getDriver(), ProfilePageBase.class);
	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}
}
