package tests;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.JsonUtil;
import utils.LogUtil;
import endpoints.JsonPlaceholderAPI;
import io.restassured.response.Response;
import payload.PayloadBuilder;

public class JsonPlaceholderTests {
	static int postId;
	private static final Logger log = LogUtil.getLogger(JsonPlaceholderTests.class);

	@Test(priority = 1)
	public void createPostTest() {
		log.info("Creating new post...");
	    Response response = JsonPlaceholderAPI.createPost(PayloadBuilder.createPostPayload());
	    log.info("Response: " + response.asPrettyString());
	    Assert.assertEquals(response.statusCode(), 201);
	    postId = JsonUtil.getInt(response, "id");
	    log.info("Created Post ID: " + postId);
	}

	@Test(priority = 2)
	public void validateCreatedPost() {
	    Response response = JsonPlaceholderAPI.getPost(postId);
	    Assert.assertEquals(response.statusCode(), 200);
	    Assert.assertEquals(JsonUtil.getString(response, "title"), "API Automation");
	}

	@Test(priority = 3)
	public void updatePostTest() {
	    Response response = JsonPlaceholderAPI.updatePost(postId, PayloadBuilder.createPostPayload());
	    Assert.assertEquals(response.statusCode(), 200);
	}

	@Test(priority = 4)
	public void deletePostTest() {
	    Response response = JsonPlaceholderAPI.deletePost(postId);
	    Assert.assertEquals(response.statusCode(), 200);
	}

}
