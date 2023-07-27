package com.solvd.mobile.android.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.mobile.android.common.AccountPageBase;
import com.solvd.mobile.android.common.AmazonHomPageBase;
import com.solvd.mobile.android.common.PasswordPageBase;
import com.solvd.mobile.android.common.ProfilePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = AmazonHomPageBase.class)
public class AmazonHomePage extends AmazonHomPageBase {

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Your Amazon.com Tab 2 of 4\"]/android.widget.ImageView")
	private ExtendedWebElement account;

	public AmazonHomePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public ProfilePageBase profile() {
		account.click();
		return initPage(getDriver(), ProfilePageBase.class);
	}

	@Override
	public AccountPageBase accountinfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
