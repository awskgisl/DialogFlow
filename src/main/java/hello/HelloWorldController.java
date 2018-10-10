package hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = "/webhook", method = RequestMethod.GET)
	public String getResult(@RequestParam String data) {

		String outAll = "";
		try {

			URL url = new URL("https://demo.kgfsl.com/CIP_DX_ENGINE_API/api/accountcollection?id=81");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String input = "[{\"id\": 1,\"message\":\"petrik\"},{\"id\": 2,\"message\":\"Dan\"}]";

			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();
			// os.close();
			System.out.println(conn.getResponseCode());

			if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;

			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				// System.out.println(output);
				outAll += outAll + output;
			}
			System.out.println(outAll);

			conn.disconnect();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (outAll.length() == 0) {
			return "Empty";
		}
		return outAll;
	}

	@RequestMapping(value = "/webhook", method = RequestMethod.POST)
	public SimpleResponse getResultBody(@RequestBody SimpleResponse data) {
		SimpleResponse response = new SimpleResponse();
		response.setArt_id(data.getArt_id());
		response.setArt_message(data.getArt_message());
		return response;

	}
}
