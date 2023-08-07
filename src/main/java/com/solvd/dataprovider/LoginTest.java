package com.solvd.dataprovider;

import org.testng.annotations.DataProvider;

import com.zebrunner.carina.core.AbstractTest;

public class LoginTest extends AbstractTest {
	@DataProvider(name = "loginCredentials")
	public Object[][] getLoginCredentials() {

		Object[][] loginData = { { "ashmano0407@gmail.com", "Test123!" }, { "user2", "password2" },

		};
		return loginData;
	}
}
