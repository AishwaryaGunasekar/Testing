package com.solvd.testing;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.solvd.web.common.AccountPageBase;
import com.solvd.web.common.AmazonBasicsPageBase;
import com.solvd.web.common.BooksPageBase;
import com.solvd.web.common.CartsPageBase;
import com.solvd.web.common.PasswordPageBase;
import com.solvd.web.common.SigninPageBase;
import com.solvd.web.common.WelcomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

public class WebTesting implements IAbstractTest {

	@BeforeMethod()
	@Test(testName = "Login", description = "Login into amazon")
	@MethodOwner(owner = "AG")
	public void login() {

		String email = "ashmano0407@gmail.com";
		String pass = "Test123!";
		WelcomePageBase welcomepage = initPage(getDriver(), WelcomePageBase.class);
		welcomepage.open();
		Assert.assertTrue(welcomepage.isPageOpened(), "welcomepage page is not opened");
		welcomepage.pause(10);
		SigninPageBase signin = welcomepage.sign();
		Assert.assertTrue(signin.isPageOpened(), "signin page is not opened");
		signin.typeEmail(email);
		PasswordPageBase ppb = signin.cont();
		ppb.typePassword(pass);
		WelcomePageBase welcomepage1 = ppb.signin();
		Assert.assertTrue(welcomepage1.isPageOpened(), "welcomepage page is not opened");

	}

	@Test(testName = "View Cart", description = "View your cart from  amazon")
	public void viewCart() {

		WelcomePageBase welcomepage = initPage(getDriver(), WelcomePageBase.class);
		welcomepage.open();

		CartsPageBase cbp = welcomepage.viewCart();
		Assert.assertTrue(cbp.isPageOpened(), "CartsPage is not opened");
		WelcomePageBase wel = cbp.home();
		Assert.assertTrue(wel.isPageOpened(), "welcome page is not opened");
	}

	@Test(testName = "AmazonBasics ", description = "Amazon basics deals")
	public void viewAmazonBasicsDeals() {

		WelcomePageBase welcomepage = initPage(getDriver(), WelcomePageBase.class);
		welcomepage.open();
		AmazonBasicsPageBase abps = welcomepage.amazonBasics();
		Assert.assertTrue(abps.isPageOpened(), "AmazonBasics is not opened");
		WelcomePageBase wel = abps.home();
		Assert.assertTrue(wel.isPageOpened(), "welcome page is not opened");
	}

	@Test(testName = "Amazon Books", description = "view amazon books")
	public void viewAmazonBooks() {
		WelcomePageBase welcomepage = initPage(getDriver(), WelcomePageBase.class);
		welcomepage.open();
		BooksPageBase bpb = welcomepage.amazonBooks();
		Assert.assertTrue(bpb.isPageOpened(), "BooksPage is not opened");
		WelcomePageBase wel = bpb.home();
		Assert.assertTrue(wel.isPageOpened(), "welcome page is not opened");
	}

	@Test(testName = "Account details", description = "View your account details in amazon")
	public void viewAccountDetails() {

		WelcomePageBase welcomepage = initPage(getDriver(), WelcomePageBase.class);
		welcomepage.open();
		AccountPageBase apb = welcomepage.viewAccountDetails();
		Assert.assertTrue(apb.isPageOpened(), "AccountPage is not opened");

		WelcomePageBase wel = apb.home();
		Assert.assertTrue(wel.isPageOpened(), "welcome page is not opened");
	}
}
