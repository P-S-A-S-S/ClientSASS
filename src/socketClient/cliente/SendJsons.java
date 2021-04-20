package socketClient.cliente;

import java.io.IOException;
import java.io.OutputStream;
//import org.json.JSONException;
//import JSONfiles.defaultCall;
public class SendJsons {
	public static void sendJsons(String json, OutputStream sout) {
			try {
				byte[] bytes = json.getBytes("UTF-8");
		        sout.write(bytes);
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
	    }
}
