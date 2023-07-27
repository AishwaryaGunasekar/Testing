package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.mobile.android.common.AmazonHomePageBase;
import com.solvd.mobile.android.common.CartPageBase;
import com.solvd.mobile.android.common.ProductsPageBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = ProductsPageBase.class)
public class ProductPage extends ProductsPageBase {

	@FindBy(id = "com.amazon.mShop.android.shopping:id/chrome_action_bar_back_icon_image")
	private ExtendedWebElement logo;

	@FindBy(id = "com.amazon.mShop.android.shopping:id/bottom_tab_button_icon")
	private ExtendedWebElement backhome;

	@FindBy(id = "com.amazon.mShop.android.shopping:id/chrome_search_hint_view")
	private ExtendedWebElement searchProducts;
	public ProductPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public AmazonHomePageBase home() {
		backhome.click();
		return initPage(getDriver(), AmazonHomePageBase.class);

	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}
	@Override
	public ProductsPageBase searchproduct(String term) {

		searchProducts.type(R.TESTDATA.get("products"));
		searchProducts.click();
	
		return initPage(getDriver(), ProductsPageBase.class);
	}
}
