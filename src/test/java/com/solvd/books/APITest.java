package com.solvd.books;

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

		GetBooksMethod getbooksMethods = new GetBooksMethod();
		getbooksMethods.callAPIExpectSuccess();
		getbooksMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getbooksMethods.validateResponseAgainstSchema("api/books/_get/rs.schema");
	}

	@Test
	public void testGetBookFinder() {

		GetBookFinderMethod getbookfinder = new GetBookFinderMethod();
		getbookfinder.callAPIExpectSuccess();
		getbookfinder.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getbookfinder.validateResponseAgainstSchema("api/search/_get/rs.schema");
	}

	@Test
	public void testGetCurrency() {

		GetCurrencyMethod getcurrency = new GetCurrencyMethod();
		getcurrency.callAPIExpectSuccess();
		getcurrency.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getcurrency.validateResponseAgainstSchema("api/currency/_get/rs.schema");
	}

	@Test
	public void GetCapitalCity() {
		GetCapitalCityMethod getcapitalcity = new GetCapitalCityMethod();
		getcapitalcity.callAPIExpectSuccess();
		getcapitalcity.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getcapitalcity.validateResponseAgainstSchema("api/capital/_get/rs.schema");
	}

	@Test
	public void GetRandomUser() {
		GetRandomUserMethod getrandomuser = new GetRandomUserMethod();
		getrandomuser.callAPIExpectSuccess();
		getrandomuser.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getrandomuser.validateResponseAgainstSchema("api/user/_get/rs.schema");
	}

	@Test
	public void ListofCurrency() {
		GetListOfCurrencyMethod listofcurrency = new GetListOfCurrencyMethod();
		listofcurrency.callAPIExpectSuccess();
		listofcurrency.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		listofcurrency.validateResponseAgainstSchema("api/currexchange/_get/rs.schema");
	}

	@Test
	public void GetCurrencyConverter() {
		GetCurrencyConverterMethod currencyconverter = new GetCurrencyConverterMethod();
		currencyconverter.callAPIExpectSuccess();
		currencyconverter.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		currencyconverter.validateResponseAgainstSchema("api/exchange/_get/rs.schema");
	}
}
