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
      public String getResult(@RequestParam String data) {
		SimpleResponse emp = new SimpleResponse("Hello DialogFlows Welcomes you to REST App ");
		if (emp == null) {
			return new String(emp, HttpStatus.NO_CONTENT);
		}
		return new String(emp, HttpStatus.OK);
	}
}

