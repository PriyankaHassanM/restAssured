package base;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class BaseResponseSpec {
	
	public static ResponseSpecification successResponse() {
	    return new ResponseSpecBuilder()
	            .expectStatusCode(200)
	            .build();
	}

	public static ResponseSpecification createdResponse() {
	    return new ResponseSpecBuilder()
	            .expectStatusCode(201)
	            .build();
	}

}
