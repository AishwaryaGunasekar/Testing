package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.mobile.android.common.AccountPageBase;
import com.solvd.mobile.android.common.AmazonHomePageBase;
import com.solvd.mobile.android.common.CartPageBase;
import com.solvd.mobile.android.common.ProfilePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {

	@FindBy(id = "com.amazon.mShop.android.shopping:id/cart_count")
	private ExtendedWebElement logo;

	//@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home Tab 1 of 5\"]")
	@FindBy(id="com.amazon.mShop.android.shopping:id/bottom_tab_button_icon")
	public ExtendedWebElement home;

	public CartPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public AmazonHomePageBase home() {
		home.click();
		return initPage(getDriver(), AmazonHomePageBase.class);

	}
}
