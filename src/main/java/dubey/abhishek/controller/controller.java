package dubey.abhishek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("/")
	public String home() {
		return "Welcom to home page of demo spring boot project for docker";
	}
}
