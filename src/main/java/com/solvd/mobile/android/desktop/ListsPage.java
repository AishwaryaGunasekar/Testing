package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.solvd.mobile.android.common.AmazonHomePageBase;
import com.solvd.mobile.android.common.ListsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = ListsPageBase.class)
public class ListsPage extends ListsPageBase {

	@FindBy(id = "awl-lol-lists-header")
	private ExtendedWebElement logo;

	@FindBy(id = "com.amazon.mShop.android.shopping:id/bottom_tab_button_icon")
	private ExtendedWebElement afterListView;

	public ListsPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public AmazonHomePageBase home() {
		afterListView.click();
		return initPage(getDriver(), AmazonHomePageBase.class);
	}
}
