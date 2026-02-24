package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import endpoints.ReqResAPI;
import io.restassured.response.Response;
import payload.PayloadBuilder;
import utils.JsonUtil;

public class ReqResTests {
	static String userId;

	@Test(priority = 1)
	public void createUserTest() {
	    Response response = ReqResAPI.createUser(PayloadBuilder.reqResUserPayload());
	    Assert.assertEquals(response.statusCode(), 201);
	    userId = JsonUtil.getString(response, "id");
	}

	@Test(priority = 2)
	public void validateUserList() {
	    Response response = ReqResAPI.getUsers(2);
	    Assert.assertEquals(response.statusCode(), 200);
	    Assert.assertEquals(JsonUtil.getInt(response, "page"), 2);
	}

	@Test(priority = 3)
	public void updateUserTest() {
	    Response response = ReqResAPI.updateUser(userId, PayloadBuilder.reqResUserPayload());
	    Assert.assertEquals(response.statusCode(), 200);
	}

	@Test(priority = 4)
	public void deleteUserTest() {
	    Response response = ReqResAPI.deleteUser(userId);
	    Assert.assertEquals(response.statusCode(), 204);
	}

}
