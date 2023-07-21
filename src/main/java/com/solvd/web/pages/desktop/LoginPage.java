package com.solvd.web.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.web.pages.common.HomeBasePage;
import com.solvd.web.pages.common.LoginPageBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

	@FindBy(xpath = "//IMG[@class='fb_logo _8ilh img']")
	private ExtendedWebElement logo;

	@FindBy(xpath = "//INPUT[@id='email']")
	private ExtendedWebElement email;

	@FindBy(id = "pass")
	private ExtendedWebElement password;

	@FindBy(name ="login")
	private ExtendedWebElement login;

	public LoginPage(WebDriver driver) {
		super(driver);
		setUiLoadedMarker(logo);
	}

	public HomeBasePage loginToSite() {

		email.type(R.TESTDATA.get("email"));
		password.type(R.TESTDATA.get("password"));
		login.click();
		return initPage(driver, HomeBasePage.class);
	}

}
