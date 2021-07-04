package com.testGitRebase.testGitRebaseCommand;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("/hello")
	public String helloWorld(@RequestParam String name) {
		return "Hello "+name;
	}
	@GetMapping("/secondHello")
	public String helloWorldSecond(@RequestParam String name) {
		return "secondHello "+name;
	}
}
