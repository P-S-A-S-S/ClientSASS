package JSONfiles;

import org.json.*;

public class defaultCall {
	public static String firstCall() throws JSONException {
		try {
			JSONObject structure = new JSONObject();
			JSONObject head = new JSONObject();
			JSONObject body = new JSONObject();
			structure.put("head", head);
			structure.put("body", body);
			head.put("id", 0);
			body.put("message", "hello Pauet");
			String data = structure.toString();
			return data;
		}catch(Exception e){
			System.out.println(e);
			JSONObject fail = new JSONObject();
			fail.put("message", e);
			String data = fail.toString();
			return data;
		}
	}
}