package com.solvd.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.solvd.web.pages.common.HomeBasePage;
import com.solvd.web.pages.common.LoginPageBase;
import com.solvd.web.pages.desktop.FeedPage;
import com.solvd.web.pages.desktop.MainPage;
import com.solvd.web.pages.desktop.MarketplacePage;
import com.solvd.web.pages.desktop.NewsTabPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

public class WEBTEST implements IAbstractTest {

	@Test(testName = "LoginTest",description = "To login into facebook account")
	@MethodOwner(owner = "AG")
	public void login() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");

	}

	@Test(testName= "MarketPlace",description = "To view the marketplace in your facebook account")
	@MethodOwner(owner = "AG")
	public void testViewMarketplace() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");
		MarketplacePage marketplacePage = new MarketplacePage(getDriver());
		marketplacePage.open();

		Assert.assertTrue(marketplacePage.isPageOpened(), "marketplace page was not opened");

	}

	@Test(testName= "News",description = "To view the News in your facebook account")
	@MethodOwner(owner = "AG")
	public void testViewNewsTab() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");
		NewsTabPage newsTabPage = new NewsTabPage(getDriver());
		newsTabPage.open();
		Assert.assertTrue(newsTabPage.isPageOpened(), "newstab page was not opened");

	}

	@Test(testName= "feeds",description = "To view the feeds in your facebook account")
	@MethodOwner(owner = "AG")
	public void testFeedTab() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");
		FeedPage feed = new FeedPage(getDriver());
		feed.open();
		Assert.assertTrue(feed.isPageOpened(), "feed page was not opened");

	}

	@Test(testName= "logout",description = "Logout from the facebook account")
	@MethodOwner(owner = "AG")
	public void testLogoutFacebook() {
		LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page was not opened");
		HomeBasePage homePage = loginPage.loginToSite();
		Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");
		MainPage mp = new MainPage(getDriver());
		mp.open();
		Assert.assertTrue(mp.isPageOpened(), "main page was not opened");
	}

}
