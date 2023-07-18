package com.solvd.testing.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/exchange?from=SGD&to=MYR&q=1.0", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/exchange/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class getCurrencyConverterMethod extends AbstractApiMethodV2{
	public getCurrencyConverterMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getRequired("currencyexchange_api_url"));
	}
}











