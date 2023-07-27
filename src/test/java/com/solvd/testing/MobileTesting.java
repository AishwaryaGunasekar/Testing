package com.solvd.testing;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.solvd.mobile.android.common.AccountPageBase;
import com.solvd.mobile.android.common.AmazonHomPageBase;
import com.solvd.mobile.android.common.PasswordPageBase;
import com.solvd.mobile.android.common.ProfilePageBase;
import com.solvd.mobile.android.common.SigninPageBase;
import com.solvd.mobile.android.common.WelcomePageBase;
import com.zebrunner.agent.core.annotation.TestLabel;
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
		Assert.assertTrue(password.isPageOpened(), "signin  is active when it should be disabled");
		password.typePassword(pass);
		AmazonHomPageBase ama = password.isContinueBtnActive();
		//Assert.assertTrue(ama.isPageOpened(), "signin  is active when it should be disabled");
	}

	@Test()
	public void testAccount() {

		AmazonHomPageBase ama = initPage(getDriver(), AmazonHomPageBase.class);
		Assert.assertTrue(ama.isPageOpened(), "Welcome page isn't opened");
		ProfilePageBase profilebase = ama.profile();
		Assert.assertTrue(profilebase.isPageOpened(), "Welcome page isn't opened");

	}
}
