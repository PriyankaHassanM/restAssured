package endpoints;

import base.BaseRequestSpec;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class JsonPlaceholderAPI {
	private static final String BASE_KEY = "jsonplaceholder.base.url";

	public static Response createPost(String body) {
	    return given()
	            .spec(BaseRequestSpec.getRequestSpec(BASE_KEY))
	            .body(body)
	            .post("/posts");
	}

	public static Response getPost(int id) {
	    return given()
	            .spec(BaseRequestSpec.getRequestSpec(BASE_KEY))
	            .get("/posts/" + id);
	}

	public static Response updatePost(int id, String body) {
	    return given()
	            .spec(BaseRequestSpec.getRequestSpec(BASE_KEY))
	            .body(body)
	            .put("/posts/" + id);
	}

	public static Response deletePost(int id) {
	    return given()
	            .spec(BaseRequestSpec.getRequestSpec(BASE_KEY))
	            .delete("/posts/" + id);
	}

}
