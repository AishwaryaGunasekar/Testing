package com.solvd.testing.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/user/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetRandomUserMethod extends AbstractApiMethodV2{
	public GetRandomUserMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getRequired("randomuser_api_url"));
	}
}
























