package com.solvd.testing.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/fact", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/cat/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class getCatFactMethod extends AbstractApiMethodV2 {
	public getCatFactMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getRequired("cat_api_url"));
	}
}
