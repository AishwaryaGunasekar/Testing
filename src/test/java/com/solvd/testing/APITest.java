package com.solvd.testing;

import com.solvd.testing.carina.api.*;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.IAbstractTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APITest implements IAbstractTest {

	public static final Logger LOGGER = LogManager.getLogger(APITest.class);

	@Test
	public void testGetBooks() {

		getBooksMethod getbooksMethods = new getBooksMethod();
		getbooksMethods.callAPIExpectSuccess();
		getbooksMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getbooksMethods.validateResponseAgainstSchema("api/books/_get/rs.schema");
	}

	@Test
	public void testGetBookFinder() {

		getBookFinderMethod getbookfinder = new getBookFinderMethod();
		getbookfinder.callAPIExpectSuccess();
		getbookfinder.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getbookfinder.validateResponseAgainstSchema("api/search/_get/rs.schema");
	}

	@Test
	public void testGetCurrency() {

		getCurrencyMethod getcurrency = new getCurrencyMethod();
		getcurrency.callAPIExpectSuccess();
		getcurrency.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getcurrency.validateResponseAgainstSchema("api/currency/_get/rs.schema");
	}

	@Test
	public void testGetCapitalCity() {
		getCapitalCityMethod getcapitalcity = new getCapitalCityMethod();
		getcapitalcity.callAPIExpectSuccess();
		getcapitalcity.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getcapitalcity.validateResponseAgainstSchema("api/capital/_get/rs.schema");
	}

	@Test
	public void testGetRandomUser() {
		getRandomUserMethod getrandomuser = new getRandomUserMethod();
		getrandomuser.callAPIExpectSuccess();
		getrandomuser.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getrandomuser.validateResponseAgainstSchema("api/user/_get/rs.schema");
	}

	@Test
	public void testListofCurrency() {
		getListOfCurrencyMethod listofcurrency = new getListOfCurrencyMethod();
		listofcurrency.callAPIExpectSuccess();
		listofcurrency.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		listofcurrency.validateResponseAgainstSchema("api/currexchange/_get/rs.schema");
	}

	@Test
	public void testGetCurrencyConverter() {
		getCurrencyConverterMethod currencyconverter = new getCurrencyConverterMethod();
		currencyconverter.callAPIExpectSuccess();
		currencyconverter.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		currencyconverter.validateResponseAgainstSchema("api/exchange/_get/rs.schema");
	}
}
