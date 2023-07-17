package com.solvd.books.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;

import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/authors", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/authors/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetAuthorsMethod extends AbstractApiMethodV2 {
	public GetAuthorsMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
	}
}
