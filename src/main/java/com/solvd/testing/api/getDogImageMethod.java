package com.solvd.testing.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/random", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/dog/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class getDogImageMethod extends AbstractApiMethodV2 {
	public getDogImageMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getRequired("dog_api_url"));
	}
}
