package com.solvd.testing.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;

import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/search", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/search/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class getBookFinderMethod extends AbstractApiMethodV2 {
	public getBookFinderMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getRequired("bookfinder_api_url"));
	}
}


