package com.solvd.testing.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/books", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/books/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetBooksMethod extends AbstractApiMethodV2 {

	public GetBooksMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getRequired("books_api_url"));
	}
}


