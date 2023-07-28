package com.solvd.testing;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.solvd.mobile.android.common.AccountPageBase;
import com.solvd.mobile.android.common.AmazonHomePageBase;
import com.solvd.mobile.android.common.CartPageBase;
import com.solvd.mobile.android.common.ListsPageBase;
import com.solvd.mobile.android.common.OrdersPageBase;
import com.solvd.mobile.android.common.PasswordPageBase;
import com.solvd.mobile.android.common.ProfilePageBase;
import com.solvd.mobile.android.common.SettingsPageBase;
import com.solvd.mobile.android.common.SigninPageBase;
import com.solvd.mobile.android.common.WelcomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.mobile.IMobileUtils;

public class MobileTesting implements IAbstractTest, IMobileUtils {

	@Test(testName = "Test Signin", description = "Check whether we are able to sign into our amazon account")
	@MethodOwner(owner = "AG")
	public void testSignin() {

		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "Signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "Password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		Assert.assertTrue(ama.isPageOpened(), "Password page  is active when it should be disabled");

	}

	@Test(testName = "Test Profile", description = "Check whether we are able to go to the profile page ")
	@MethodOwner(owner = "AG")
	public void testProfile() {

		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "Signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "Password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		Assert.assertTrue(ama.isPageOpened(), "Amazon page isn't opened");
		ProfilePageBase profilebase = ama.profile();
		Assert.assertTrue(profilebase.isPageOpened(), "Profile page isn't opened");

	}

	@Test(testName = "Test Orders", description = "Checks the previous orders done fromm this account ")
	@MethodOwner(owner = "AG")
	public void testOrder() {

		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "Signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "Password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		Assert.assertTrue(ama.isPageOpened(), "Amazon page isn't opened");
		ProfilePageBase profilebase = ama.profile();
		Assert.assertTrue(profilebase.isPageOpened(), "Welcome page isn't opened");
		OrdersPageBase orderspage = profilebase.yourOrders();
		Assert.assertTrue(orderspage.isPageOpened(), "Orders page isn't opened");
		ProfilePageBase a = orderspage.profile();
		Assert.assertTrue(a.isPageOpened(), "Profile page isn't opened");

	}

	@Test(testName = "Test Account", description = "Checks the account page of the customer and more information abour the account")
	@MethodOwner(owner = "AG")
	public void testAccount() {

		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "Signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "Password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		Assert.assertTrue(ama.isPageOpened(), "Amazon page isn't opened");
		ProfilePageBase profilebase = ama.profile();
		Assert.assertTrue(profilebase.isPageOpened(), "Profile page isn't opened");
		AccountPageBase accountbase = profilebase.yourAccount();
		Assert.assertTrue(accountbase.isPageOpened(), "Account page isn't opened");
		ProfilePageBase p = accountbase.profile();
		Assert.assertTrue(p.isPageOpened(), "Profile page isn't opened");

	}

	@Test(testName = "Test Cart ", description = "Check the cart page of the customer ")
	@MethodOwner(owner = "AG")
	public void testCart() {

		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "Signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "Password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		Assert.assertTrue(ama.isPageOpened(), "Amazon page isn't opened");
		CartPageBase cartspage = ama.cart();
		Assert.assertTrue(cartspage.isPageOpened(), "Cart page  is active when it should be disabled");
		AmazonHomePageBase ahp = cartspage.home();
		Assert.assertTrue(ahp.isPageOpened(), "Amazon page  is active when it should be disabled");

	}

	@Test(testName = "Test Created Lists", description = "Check the created shopping list of the customer for future shopping")
	@MethodOwner(owner = "AG")
	public void testCreatedLists() {

		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
		Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
		SigninPageBase signin = welcomePage.click();
		Assert.assertTrue(signin.isPageOpened(), "Signin  is active when it should be disabled");
		signin.typeEmail(email);
		PasswordPageBase password = signin.click();
		Assert.assertTrue(password.isPageOpened(), "Password page  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomePageBase ama = password.isContinueBtnActive();
		Assert.assertTrue(ama.isPageOpened(), "Amazon page isn't opened");
		SettingsPageBase spb = ama.click();
		ListsPageBase lpb = spb.viewlist();
		AmazonHomePageBase ahpb = lpb.home();
		Assert.assertTrue(ahpb.isPageOpened(), "Amazon page isn't opened");
	}
}
