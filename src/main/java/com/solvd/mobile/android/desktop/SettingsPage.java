package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.solvd.mobile.android.common.ListsPageBase;
import com.solvd.mobile.android.common.SettingsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = SettingsPageBase.class)
public class SettingsPage extends SettingsPageBase {

	@FindBy(id = "BOTTOM_SHEET_HEADER_TEXT")
	private ExtendedWebElement logo;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Sheet\"]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup[2]/android.view.ViewGroup")
	private ExtendedWebElement listsshortcut;

	public SettingsPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public boolean isPageOpened() {
		return logo.isElementPresent();
	}

	@Override
	public ListsPageBase viewlist() {
		listsshortcut.click();
		return initPage(getDriver(), ListsPageBase.class);
	}
}
