package payload;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class PayloadBuilder {
	 public static String createPostPayload() {
	        JSONObject obj = new JSONObject();
	        obj.put("title", "API Automation");
	        obj.put("body", "Testing CRUD operations");
	        obj.put("userId", 1);
	        return obj.toString();
	    }

	    public static String reqResUserPayload() {
	        JSONObject obj = new JSONObject();
	        obj.put("name", "Priyanka");
	        obj.put("job", "QA Engineer");
	        return obj.toString();
	    }
	
	 
	 // Create User
	    public static Map<String, Object> createReqResUser() {

	        Map<String, Object> payload = new HashMap<>();
	        payload.put("name", "Priyanka");
	        payload.put("job", "QA Engineer");

	        return payload;
	    }

	    // Update User
	    public static Map<String, Object> updateReqResUser() {

	        Map<String, Object> payload = new HashMap<>();
	        payload.put("name", "Senior QA Engineer");

	        return payload;
	    }

}
