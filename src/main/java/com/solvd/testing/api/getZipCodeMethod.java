package com.solvd.testing.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/${zip}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/zip/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class getZipCodeMethod extends AbstractApiMethodV2 {
	public getZipCodeMethod(String zip) {

		replaceUrlPlaceholder("base_url", Configuration.getRequired("zip_api_url"));
		replaceUrlPlaceholder("zip",zip);
	}

}



