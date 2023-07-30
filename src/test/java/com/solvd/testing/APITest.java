package com.solvd.testing;

import com.solvd.testing.api.*;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import static org.hamcrest.Matchers.is;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class APITest implements IAbstractTest {

	public static final Logger LOGGER = LogManager.getLogger(APITest.class);

	@Test(testName = "Get cat fact")
	@MethodOwner(owner = "AG")
	public void testCatFactMethod() {
		getCatFactMethod api = new getCatFactMethod();
		api.expectResponseStatus(HttpResponseStatusType.OK_200);
		api.callAPI();

		api.validateResponseAgainstSchema("api/cat/_get/rs.schema");
	}

	@Test(testName = "Get dog info")
	@MethodOwner(owner = "AG")
	public void testDogImageMethod() {
		getDogImageMethod api = new getDogImageMethod();
		api.expectResponseStatus(HttpResponseStatusType.OK_200);
		api.callAPI();
		api.validateResponseAgainstSchema("api/dog/_get/rs.schema");
	}

	@Test(testName = "Get IP ")
	@MethodOwner(owner = "AG")
	public void testGetIpFinderMethod() {

		getIpFinderMethod getipfinder = new getIpFinderMethod();
		getipfinder.callAPIExpectSuccess();
		getipfinder.validateResponseAgainstSchema("api/geo/_get/rs.schema");
	}

	@Test(testName = "Get random joke")
	@MethodOwner(owner = "AG")
	public void testCatRandomJokeMethod() {
		getRandomJokeMethod api = new getRandomJokeMethod();
		api.expectResponseStatus(HttpResponseStatusType.OK_200);
		api.callAPI();
		api.validateResponseAgainstSchema("api/random/_get/rs.schema");
	}

	@Test(testName = "Get zipcode")
	@MethodOwner(owner = "AG")
	public void testGet() {
		String zip = "33162";
		getZipCodeMethod api = new getZipCodeMethod(zip);
		api.expectResponseStatus(HttpResponseStatusType.OK_200);
		api.callAPI();
		api.expectResponseContains(is(zip));
		api.validateResponseAgainstSchema("api/zip/_get/rs.schema");

	}

	@Test(testName = "Get gender")
	@MethodOwner(owner = "AG")
	public void testGetNational() {

		getNationMethod api = new getNationMethod();
		api.expectResponseStatus(HttpResponseStatusType.OK_200);
		api.callAPI();

		api.validateResponseAgainstSchema("api/nation/_get/rs.schema");

	}

	@Test(testName = "Get gender")
	@MethodOwner(owner = "AG")
	public void testGetGender() {

		getGenderInfoMethod api = new getGenderInfoMethod();
		api.expectResponseStatus(HttpResponseStatusType.OK_200);
		api.callAPI();

		api.validateResponseAgainstSchema("api/gender/_get/rs.schema");

	}
}
