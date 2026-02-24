package endpoints;

import base.BaseRequestSpec;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ReqResAPI {
	private static final String BASE_KEY = "reqres.base.url";

	public static Response createUser(String body) {
	    return given()
	            .spec(BaseRequestSpec.getRequestSpec(BASE_KEY))
	            .body(body)
	            .post("/users");
	}

	public static Response getUsers(int page) {
	    return given()
	            .spec(BaseRequestSpec.getRequestSpec(BASE_KEY))
	            .get("/users?page=" + page);
	}

	public static Response updateUser(String id, String body) {
	    return given()
	            .spec(BaseRequestSpec.getRequestSpec(BASE_KEY))
	            .body(body)
	            .put("/users/" + id);
	}

	public static Response deleteUser(String id) {
	    return given()
	            .spec(BaseRequestSpec.getRequestSpec(BASE_KEY))
	            .delete("/users/" + id);
	}

}
