package com.ltts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo3Rest {
	@GetMapping("/welcom3")
	public String message() {
		return "Client3 created success by eswar";
	}

}
