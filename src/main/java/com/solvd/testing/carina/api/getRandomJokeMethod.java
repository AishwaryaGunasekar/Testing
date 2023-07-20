package com.solvd.testing.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/random_joke", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/random/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class getRandomJokeMethod extends AbstractApiMethodV2 {
	public getRandomJokeMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getRequired("random_api_url"));
	}
}
