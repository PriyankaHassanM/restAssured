package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utils.ConfigReader;

public class BaseRequestSpec {
	public static RequestSpecification getRequestSpec(String baseUrlKey) {
	    return new RequestSpecBuilder()
	            .setBaseUri(ConfigReader.getProperty(baseUrlKey))
	            .setContentType(ContentType.JSON)
	            .build();
	}

}
