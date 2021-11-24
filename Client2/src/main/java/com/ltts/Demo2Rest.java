package com.ltts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Rest {
	@GetMapping("/welcom2")
	public String message() {
		return "Client2 created success by eswar";
	}

}
