package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.mobile.android.common.AmazonHomePageBase;
import com.solvd.mobile.android.common.CartPageBase;
import com.solvd.mobile.android.common.ProductsPageBase;
import com.solvd.mobile.android.common.ProfilePageBase;
import com.solvd.mobile.android.common.SettingsPageBase;
import com.solvd.web.pages.common.HomeBasePage;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = AmazonHomePageBase.class)
public class AmazonHomePage extends AmazonHomePageBase {

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Your Amazon.com Tab 2 of 4\"]/android.widget.ImageView")
	private ExtendedWebElement account;

	@FindBy(id = "com.amazon.mShop.android.shopping:id/chrome_search_hint_view")
	private ExtendedWebElement logo;

	@FindBy(id = "com.amazon.mShop.android.shopping:id/cart_count")
	private ExtendedWebElement viewcart;

	@FindBy(id = "com.amazon.mShop.android.shopping:id/chrome_search_hint_view")
	private ExtendedWebElement searchProducts;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Browse menu Tab 4 of 4\"]")
	private ExtendedWebElement settingsicon;

	public AmazonHomePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public ProfilePageBase profile() {
		account.click();
		return initPage(getDriver(), ProfilePageBase.class);
	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public CartPageBase cart() {
		viewcart.click();
		return initPage(getDriver(), CartPageBase.class);
	}

	@Override
	public ProductsPageBase searchproduct(String term) {

		searchProducts.type(R.TESTDATA.get("products"));
		searchProducts.click();

		return initPage(getDriver(), ProductsPageBase.class);
	}

	@Override
	public SettingsPageBase click() {
		settingsicon.click();
		return initPage(getDriver(), SettingsPageBase.class);
	}

}
