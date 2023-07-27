package com.solvd.mobile.android.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class ProductsPageBase extends AbstractPage {

	public ProductsPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract AmazonHomePageBase home();
	   public abstract ProductsPageBase searchproduct(String term);

}
