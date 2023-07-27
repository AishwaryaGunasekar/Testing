package com.solvd.testing;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.solvd.mobile.android.common.AccountPageBase;
import com.solvd.mobile.android.common.AmazonHomePageBase;
import com.solvd.mobile.android.common.CartPageBase;
import com.solvd.mobile.android.common.ListsPageBase;
import com.solvd.mobile.android.common.OrdersPageBase;
import com.solvd.mobile.android.common.PasswordPageBase;
import com.solvd.mobile.android.common.ProductsPageBase;
import com.solvd.mobile.android.common.ProfilePageBase;
import com.solvd.mobile.android.common.SettingsPageBase;
import com.solvd.mobile.android.common.SigninPageBase;
import com.solvd.mobile.android.common.WelcomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.mobile.IMobileUtils;

public class MobileTesting implements IAbstractTest, IMobileUtils {

	@Test()
	@MethodOwner(owner = "AG")

	public void testSignin() {

		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		// Assert.assertTrue(ama.isPageOpened(), "Welcome page isn't opened");
	}

	@Test()
	public void testProfile() {

		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		// AmazonHomPageBase ama = initPage(getDriver(), AmazonHomPageBase.class);
		Assert.assertTrue(ama.isPageOpened(), "amazon page isn't opened");
		ProfilePageBase profilebase = ama.profile();
		Assert.assertTrue(profilebase.isPageOpened(), "profile page isn't opened");

	}

	@Test
	public void testOrder() {
		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		// AmazonHomPageBase ama = initPage(getDriver(), AmazonHomPageBase.class);
		Assert.assertTrue(ama.isPageOpened(), "amazon page isn't opened");
		ProfilePageBase profilebase = ama.profile();
		Assert.assertTrue(profilebase.isPageOpened(), "Welcome page isn't opened");

		OrdersPageBase orderspage = profilebase.yourOrders();
		Assert.assertTrue(orderspage.isPageOpened(), "orders page isn't opened");
		ProfilePageBase a = orderspage.profile();
		Assert.assertTrue(a.isPageOpened(), "profile page isn't opened");

	}

	@Test
	public void testAccount() {
		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		// AmazonHomPageBase ama = initPage(getDriver(), AmazonHomPageBase.class);
		Assert.assertTrue(ama.isPageOpened(), "amazon page isn't opened");
		ProfilePageBase profilebase = ama.profile();
		Assert.assertTrue(profilebase.isPageOpened(), "profile page isn't opened");

		AccountPageBase accountbase = profilebase.yourAccount();
		Assert.assertTrue(accountbase.isPageOpened(), "account page isn't opened");
		ProfilePageBase p = accountbase.profile();
		Assert.assertTrue(p.isPageOpened(), "profile page isn't opened");

	}

	@Test
	public void testCart() {

		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		// AmazonHomPageBase ama = initPage(getDriver(), AmazonHomPageBase.class);
		Assert.assertTrue(ama.isPageOpened(), "amazon page isn't opened");

		CartPageBase cartspage = ama.cart();
		Assert.assertTrue(cartspage.isPageOpened(), "cart page  is active when it should be disabled");
		AmazonHomePageBase ahp = cartspage.home();
		Assert.assertTrue(ahp.isPageOpened(), "cart page  is active when it should be disabled");

	}

	@Test
	public void testSearchProducts() {
		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		// AmazonHomPageBase ama = initPage(getDriver(), AmazonHomPageBase.class);
		Assert.assertTrue(ama.isPageOpened(), "amazon page isn't opened");

		ProductsPageBase productspage = ama.searchproduct("game house");
		Assert.assertTrue(productspage.isPageOpened(), "amazon page isn't opened");
		AmazonHomePageBase ahpb = productspage.home();
		Assert.assertTrue(ahpb.isPageOpened(), "amazon page isn't opened");

	}

	@Test
	public void testCreatedLists() {
		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		// AmazonHomPageBase ama = initPage(getDriver(), AmazonHomPageBase.class);
		Assert.assertTrue(ama.isPageOpened(), "amazon page isn't opened");

		SettingsPageBase spb = ama.click();
		//Assert.assertTrue(spb.isPageOpened(), "settings page isn't opened");
		ListsPageBase lpb = spb.viewlist();
		//Assert.assertTrue(lpb.isPageOpened(), "List page isn't opened");
		AmazonHomePageBase ahpb = lpb.home();
		Assert.assertTrue(ahpb.isPageOpened(), "amazon page isn't opened");
	}
}
