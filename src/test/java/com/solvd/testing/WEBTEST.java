package com.solvd.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.solvd.web.pages.common.HomeBasePage;
import com.solvd.web.pages.common.LoginPageBase;
import com.solvd.web.pages.common.newsBasePage;
import com.solvd.web.pages.desktop.MainPage;
import com.solvd.web.pages.desktop.MarketplacePage;
import com.solvd.web.pages.desktop.NewsTabPage;
import com.solvd.web.pages.desktop.SettingsPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

public class WEBTEST implements IAbstractTest {

	@Test(testName = "LoginTest")
	@MethodOwner(owner = "AG")
	public void login() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");
	}

	@Test
	public void testViewMarketplace() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");

		MarketplacePage marketplacePage = new MarketplacePage(getDriver());
		marketplacePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");

	}

	@Test
	public void testViewNewsTab() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");

		NewsTabPage newsTabPage = new NewsTabPage(getDriver());
		newsTabPage.open();

	}

	@Test
	public void testEnableNotifications() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");
		SettingsPage settingsPage = new SettingsPage(getDriver());
		settingsPage.openSettings();
		settingsPage.enableNotifications();

	}

	@Test
	public void testLogoutFacebook() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");
		handleNotificationPermission();
		MainPage mp = new MainPage(getDriver());
		mp.logout();
	}

	private void handleNotificationPermission() {

		String allowNotificationScript = "window.Notification.requestPermission().then(function(permission) { return permission; });";

		String notificationPermission = executeScript(allowNotificationScript);

	}

	private String executeScript(String allowNotificationScript) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test(testName = "Create Facebook Post")
	@MethodOwner(owner = "AG")
	public void createAPost() {
		String postmessage = "Hello from Sam";
		HomeBasePage homePage = initPage(getDriver(), HomeBasePage.class);
		homePage.open();
		homePage.assertPageOpened();
		homePage.createPost(postmessage);
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");
	}

	@Test
	public void testNewsPage() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");

		newsBasePage newsPage = homePage.openNewsPage();
		// newsPage.assertPageOpened();
		// newsPage.openSearchedNews("richest");
		newsPage.open();
	}

}
