package expertostech.tutorial.rest.api.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
	
	@GetMapping("/api/status")
	public String check() {
		return "online";
	}

}
