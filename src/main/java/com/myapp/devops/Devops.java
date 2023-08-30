package com.myapp.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Devops {
	
	@GetMapping(value="/check")
	public String getmsg() {
		
		return "check devops";
	}

}
