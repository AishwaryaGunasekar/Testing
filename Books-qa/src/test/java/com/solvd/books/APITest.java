package com.solvd.books;

import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.IAbstractTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.skyscreamer.jsonassert.JSONCompareMode;
import com.solvd.books.carina.api.GetBooksMethod;
import com.solvd.books.carina.api.GetAuthorsMethod;
import com.solvd.books.carina.api.GetCategoryMethod;
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
	public void testGetAuthors() {
		GetAuthorsMethod getAuthorsMethods = new GetAuthorsMethod();
		getAuthorsMethods.callAPIExpectSuccess();
		getAuthorsMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getAuthorsMethods.validateResponseAgainstSchema("api/authors/_get/rs.schema");
	}

	@Test
	public void testGetCategory() {
		GetCategoryMethod getCategoryMethod = new GetCategoryMethod();
		getCategoryMethod.callAPIExpectSuccess();
		getCategoryMethod.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getCategoryMethod.validateResponseAgainstSchema("api/category/_get/rs.schema");
	}

}
