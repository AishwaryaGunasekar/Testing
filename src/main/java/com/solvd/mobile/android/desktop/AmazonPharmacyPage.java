package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.solvd.mobile.android.common.AmazonHomePageBase;
import com.solvd.mobile.android.common.AmazonPharmacyPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = AmazonPharmacyPageBase.class)
public class AmazonPharmacyPage extends AmazonPharmacyPageBase {

	@FindBy(id = "com.amazon.mShop.android.shopping:id/store_modes_logo")
	public ExtendedWebElement logo;

	@FindBy(id = "com.amazon.mShop.android.shopping:id/store_modes_close")
	public ExtendedWebElement close;

	public AmazonPharmacyPage(WebDriver driver) {
		super(driver);

	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public AmazonHomePageBase close() {
		close.click();
		return initPage(getDriver(), AmazonHomePageBase.class);
	}

}
