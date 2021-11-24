package com.ltts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Rest {
	@GetMapping("/welcome")
	public String message() {
		return "Client1 created success";
	}

}
