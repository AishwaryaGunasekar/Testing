package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.mobile.android.common.AmazonHomePageBase;
import com.solvd.mobile.android.common.OrdersPageBase;
import com.solvd.mobile.android.common.ProfilePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = OrdersPageBase.class)
public class OrderPage extends OrdersPageBase {

	@FindBy(id = "com.amazon.mShop.android.shopping:id/chrome_search_hint_view")
	private ExtendedWebElement logo;

	@FindBy(id = "com.amazon.mShop.android.shopping:id/chrome_action_bar_back_icon_image")
	private ExtendedWebElement back;

	public OrderPage(WebDriver driver) {
		super(driver);

	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public ProfilePageBase profile() {
		back.click();
		return initPage(getDriver(), ProfilePageBase.class);
	}

}
