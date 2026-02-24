package utils;

import io.restassured.response.Response;

public class JsonUtil {
	public static String getString(Response response, String path) {
	    return response.jsonPath().getString(path);
	}

	public static int getInt(Response response, String path) {
	    return response.jsonPath().getInt(path);
	}
	
	 public static boolean getBoolean(Response response, String path) {
	        return response.jsonPath().getBoolean(path);
	    }

}
