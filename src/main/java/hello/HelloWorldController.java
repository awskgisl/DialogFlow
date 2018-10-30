package hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = "/webhook", method = RequestMethod.GET)
	public String getResult(@RequestParam int ssn, int accnumber, int consnumber, int opttype) {

		String outAll = "";

		if (opttype == 1) {

			try {
				URL url = new URL("https://demo.kgfsl.com/CIP_DX_ENGINE_API/api/accountcollection?id=81");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");
				String input = "[{\"ssn\":" + ssn + ",\"accnumber\":" + accnumber + ",\"consnumber\":" + consnumber
						+ ",\"opttype\":" + opttype + "}]";
				System.out.println(input);
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

		}

		else if (opttype == 2) {

			try {
				URL url = new URL("https://demo.kgfsl.com/CIP_DX_ENGINE_API/api/accountcollection?id=81");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");
				String input = "[{\"ssn\":" + ssn + ",\"accnumber\":" + accnumber + ",\"consnumber\":" + consnumber
						+ ",\"opttype\":" + opttype + "}]";
				System.out.println(input);
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
					//outAll += outAll + output;
				outAll="[{\"text\":\"Ac0001, Balance is $500\"},{\"text\":\"Ac0050, Balance is $60.00\"}]";
				}
				System.out.println(outAll);

				conn.disconnect();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			if (outAll.length() == 0) {
				return "Empty";
			}

		}

		else if (opttype == 3) {

			try {
				URL url = new URL("https://demo.kgfsl.com/CIP_DX_ENGINE_API/api/accountcollection?id=81");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");
				String input = "[{\"ssn\":" + ssn + ",\"accnumber\":" + accnumber + ",\"consnumber\":" + consnumber
						+ ",\"opttype\":" + opttype + "}]";
				System.out.println(input);
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

		}

		else if (opttype == 4) {

			try {
				URL url = new URL("https://demo.kgfsl.com/CIP_DX_ENGINE_API/api/accountcollection?id=81");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");
				String input = "[{\"ssn\":" + ssn + ",\"accnumber\":" + accnumber + ",\"consnumber\":" + consnumber
						+ ",\"opttype\":" + opttype + "}]";
				System.out.println(input);
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

		} else if (opttype == 5) {

			try {
				URL url = new URL("https://demo.kgfsl.com/CIP_DX_ENGINE_API/api/accountcollection?id=81");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");
				String input = "[{\"ssn\":" + ssn + ",\"accnumber\":" + accnumber + ",\"consnumber\":" + consnumber
						+ ",\"opttype\":" + opttype + "}]";
				System.out.println(input);
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

		}

		else if (opttype == 6) {

			try {
				URL url = new URL("https://demo.kgfsl.com/CIP_DX_ENGINE_API/api/accountcollection?id=81");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");
				String input = "[{\"ssn\":" + ssn + ",\"accnumber\":" + accnumber + ",\"consnumber\":" + consnumber
						+ ",\"opttype\":" + opttype + "}]";
				System.out.println(input);
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

		}

		else {
			outAll = "Please enter a valid Option Type";
		}

		return outAll;

	}

	@RequestMapping(value = "/postwebhook", method = RequestMethod.POST)
	public SimpleResponse getResultBody(@RequestBody List<SimpleResponse> data) {
		SimpleResponse response = new SimpleResponse();
		response.setId(data.get(0).getId());
		response.setMessage(data.get(0).getMessage());
		return response;

	}
}
