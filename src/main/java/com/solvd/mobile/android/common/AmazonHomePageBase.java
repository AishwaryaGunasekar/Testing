package com.solvd.mobile.android.common;

import org.openqa.selenium.WebDriver;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class AmazonHomePageBase extends AbstractPage {

	public AmazonHomePageBase(WebDriver driver) {
		super(driver);
	}

	public abstract ProfilePageBase profile();

	public abstract CartPageBase cart();

	public abstract SettingsPageBase click();
	
	public abstract AmazonPharmacyPageBase pharmacy();
	
	

}
