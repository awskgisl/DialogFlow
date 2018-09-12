package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@SuppressWarnings("unused")
	@RequestMapping(value = "/webhook", method = RequestMethod.POST)
	public ResponseEntity<SimpleResponse> getResult(@RequestBody RequestData obj) {
		SimpleResponse emp = new SimpleResponse("Hello " + obj.getText() + " Welcome to REST App");
		if (emp == null) {
			return new ResponseEntity<SimpleResponse>(emp, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<SimpleResponse>(emp, HttpStatus.OK);
	}
}
