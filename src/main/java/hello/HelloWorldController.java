package hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@SuppressWarnings("unused")
	@RequestMapping(value = "/webhook", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<SimpleResponse> getResult(@RequestParam String parameter) {

		String outAll="";
		try {

			URL url = new URL("http://hawes.kgfsl.com:8081/CIP_DX_ENGINE_API/api/accountcollection?id=82");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String input="[{\"id\": 1,\"message\":\"petrik\"},{\"id\": 2,\"message\":\"Dan\"}]";

			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();
			//os.close();
			System.out.println(conn.getResponseCode());

			if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;

			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				//				System.out.println(output);
				outAll+=outAll+output;
			}
			System.out.println(outAll);

			conn.disconnect();

		} catch (Exception e){
			System.out.println(e.getMessage());
		}

		SimpleResponse emp = new SimpleResponse("Hello DialogFlows Welcomes you to REST App "+outAll);
		if (emp == null) {
			return new ResponseEntity<SimpleResponse>(emp, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<SimpleResponse>(emp, HttpStatus.OK);
	}
}

