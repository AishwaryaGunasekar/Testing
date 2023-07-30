package com.solvd.testing.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/?name=nathaniel", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/nation/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class getNationMethod extends AbstractApiMethodV2 {

	public getNationMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getRequired("nation_api_url"));

	}
}
